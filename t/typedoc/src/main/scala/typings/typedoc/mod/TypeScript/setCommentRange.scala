package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.setCommentRange")
@js.native
object setCommentRange extends js.Object {
  /**
    * Sets a custom text range to use when emitting comments.
    */
  def apply[T /* <: Node */](node: T, range: TextRange): T = js.native
}

