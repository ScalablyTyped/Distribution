package typings.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortestpathsMod {
  
  @JSImport("webcola/dist/src/shortestpaths", "Calculator")
  @js.native
  class Calculator[Link] protected () extends StObject {
    def this(
      n: Double,
      es: js.Array[Link],
      getSourceIndex: js.Function1[/* l */ Link, Double],
      getTargetIndex: js.Function1[/* l */ Link, Double],
      getLength: js.Function1[/* l */ Link, Double]
    ) = this()
    
    def DistanceMatrix(): js.Array[js.Array[Double]] = js.native
    
    def DistancesFromNode(start: Double): js.Array[Double] = js.native
    
    def PathFromNodeToNode(start: Double, end: Double): js.Array[Double] = js.native
    
    def PathFromNodeToNodeWithPrevCost(
      start: Double,
      end: Double,
      prevCost: js.Function3[/* u */ Double, /* v */ Double, /* w */ Double, Double]
    ): js.Array[Double] = js.native
    
    /* private */ var dijkstraNeighbours: js.Any = js.native
    
    var es: js.Array[Link] = js.native
    
    var n: Double = js.native
    
    /* private */ var neighbours: js.Any = js.native
  }
}
