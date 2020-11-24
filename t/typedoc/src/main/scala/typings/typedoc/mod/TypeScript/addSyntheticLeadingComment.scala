package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind.MultiLineCommentTrivia
import typings.typescript.mod.SyntaxKind.SingleLineCommentTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.addSyntheticLeadingComment")
@js.native
object addSyntheticLeadingComment extends js.Object {
  
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String): T = js.native
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: String, hasTrailingNewLine: Boolean): T = js.native
}
