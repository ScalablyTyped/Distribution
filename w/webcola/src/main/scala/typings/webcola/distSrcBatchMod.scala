package typings.webcola

import typings.webcola.anon.Cola
import typings.webcola.anon.Links
import typings.webcola.distSrcGeomMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBatchMod {
  
  @JSImport("webcola/dist/src/batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def gridify(pgLayout: Any, nudgeGap: Double, margin: Double, groupMargin: Double): js.Array[js.Array[js.Array[Point]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gridify")(pgLayout.asInstanceOf[js.Any], nudgeGap.asInstanceOf[js.Any], margin.asInstanceOf[js.Any], groupMargin.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[js.Array[Point]]]]
  
  inline def powerGraphGridLayout(graph: Links, size: js.Array[Double], grouppadding: Double): Cola = (^.asInstanceOf[js.Dynamic].applyDynamic("powerGraphGridLayout")(graph.asInstanceOf[js.Any], size.asInstanceOf[js.Any], grouppadding.asInstanceOf[js.Any])).asInstanceOf[Cola]
}
