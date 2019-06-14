package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraversalOrder extends js.Object

@JSGlobal("GmeClasses.TraversalOrder")
@js.native
object TraversalOrder extends js.Object {
  @js.native
  sealed trait BFS
    extends webgmeLib.GmeClassesNs.TraversalOrder
  
  @js.native
  sealed trait DFS
    extends webgmeLib.GmeClassesNs.TraversalOrder
  
  /* 0 */ val BFS: BFS with scala.Double = js.native
  /* 1 */ val DFS: DFS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webgmeLib.GmeClassesNs.TraversalOrder with scala.Double] = js.native
}

