package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "setCommentRange")
@js.native
object setCommentRange extends js.Object {
  
  /**
    * Sets a custom text range to use when emitting comments.
    */
  def apply[T /* <: Node */](node: T, range: TextRange): T = js.native
}
