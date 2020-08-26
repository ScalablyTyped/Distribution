package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ExportAssignmentSyntax")
@js.native
class ExportAssignmentSyntax protected ()
  extends typings.typescriptServices.TypeScript.ExportAssignmentSyntax {
  def this(
    exportKeyword: ISyntaxToken,
    equalsToken: ISyntaxToken,
    identifier: ISyntaxToken,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ExportAssignmentSyntax")
@js.native
object ExportAssignmentSyntax extends js.Object {
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.ExportAssignmentSyntax = js.native
}

