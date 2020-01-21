package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.ExportAssignmentSyntax")
@js.native
class ExportAssignmentSyntax protected () extends SyntaxNode {
  def this(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
  var equalsToken: ISyntaxToken = js.native
  var exportKeyword: ISyntaxToken = js.native
  var identifier: ISyntaxToken = js.native
  var semicolonToken: ISyntaxToken = js.native
  def update(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken
  ): ExportAssignmentSyntax = js.native
  def withEqualsToken(equalsToken: ISyntaxToken): ExportAssignmentSyntax = js.native
  def withExportKeyword(exportKeyword: ISyntaxToken): ExportAssignmentSyntax = js.native
  def withIdentifier(identifier: ISyntaxToken): ExportAssignmentSyntax = js.native
  def withSemicolonToken(semicolonToken: ISyntaxToken): ExportAssignmentSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.ExportAssignmentSyntax")
@js.native
object ExportAssignmentSyntax extends js.Object {
  def create1(identifier: ISyntaxToken): ExportAssignmentSyntax = js.native
}

