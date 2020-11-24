package typings.typescript.mod

import typings.typescript.mod.SyntaxKind.MultiLineCommentTrivia
import typings.typescript.mod.SyntaxKind.SingleLineCommentTrivia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "addSyntheticLeadingComment")
@js.native
object addSyntheticLeadingComment extends js.Object {
  
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String): T = js.native
  def apply[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String): T = js.native
  def apply[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = js.native
}
