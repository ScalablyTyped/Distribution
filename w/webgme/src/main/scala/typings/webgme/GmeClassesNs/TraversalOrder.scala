package typings.webgme.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraversalOrder extends js.Object

@JSGlobal("GmeClasses.TraversalOrder")
@js.native
object TraversalOrder extends js.Object {
  @js.native
  sealed trait BFS extends TraversalOrder
  
  @js.native
  sealed trait DFS extends TraversalOrder
  
  /* 0 */ val BFS: typings.webgme.GmeClassesNs.TraversalOrder.BFS with Double = js.native
  /* 1 */ val DFS: typings.webgme.GmeClassesNs.TraversalOrder.DFS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraversalOrder with Double] = js.native
}

