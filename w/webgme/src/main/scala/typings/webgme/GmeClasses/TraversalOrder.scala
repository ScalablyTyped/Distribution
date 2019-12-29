package typings.webgme.GmeClasses

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TraversalOrder with Double] = js.native
  /* 0 */ @js.native
  object BFS extends TopLevel[BFS with Double]
  
  /* 1 */ @js.native
  object DFS extends TopLevel[DFS with Double]
  
}

