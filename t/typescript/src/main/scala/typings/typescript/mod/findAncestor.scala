package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "findAncestor")
@js.native
object findAncestor extends js.Object {
  
  def apply[T /* <: Node */](node: js.UndefOr[scala.Nothing], callback: js.Function1[/* element */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
  /**
    * Iterates through the parent chain of a node and performs the callback on each parent until the callback
    * returns a truthy value, then returns that value.
    * If no such value is found, it applies the callback until the parent pointer is undefined or the callback returns "quit"
    * At that point findAncestor returns undefined.
    */
  def apply[T /* <: Node */](node: Node, callback: js.Function1[/* element */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
}
