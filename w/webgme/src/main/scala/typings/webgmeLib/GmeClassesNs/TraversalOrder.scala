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
  
  val BFS: BFS with java.lang.String = js.native
  val DFS: DFS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[webgmeLib.GmeClassesNs.TraversalOrder with java.lang.String] = js.native
}

