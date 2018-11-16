package typings
package webcolaLib.distSrcShortestpathsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/shortestpaths", "Calculator")
@js.native
class Calculator[Link] protected () extends js.Object {
  def this(n: scala.Double, es: js.Array[Link], getSourceIndex: js.Function1[/* l */ Link, scala.Double], getTargetIndex: js.Function1[/* l */ Link, scala.Double], getLength: js.Function1[/* l */ Link, scala.Double]) = this()
  var es: js.Array[Link] = js.native
  var n: scala.Double = js.native
  var neighbours: js.Any = js.native
  def DistanceMatrix(): js.Array[js.Array[scala.Double]] = js.native
  def DistancesFromNode(start: scala.Double): js.Array[scala.Double] = js.native
  def PathFromNodeToNode(start: scala.Double, end: scala.Double): js.Array[scala.Double] = js.native
  def PathFromNodeToNodeWithPrevCost(
    start: scala.Double,
    end: scala.Double,
    prevCost: js.Function3[/* u */ scala.Double, /* v */ scala.Double, /* w */ scala.Double, scala.Double]
  ): js.Array[scala.Double] = js.native
  /* private */ def dijkstraNeighbours(start: js.Any): js.Any = js.native
  /* private */ def dijkstraNeighbours(start: js.Any, dest: js.Any): js.Any = js.native
}

