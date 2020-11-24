package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.TextRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getCommentRange")
@js.native
object getCommentRange extends js.Object {
  
  /**
    * Gets a custom text range to use when emitting comments.
    */
  def apply(node: Node): TextRange = js.native
}
