package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.FunctionPropertyAssignmentSyntax")
@js.native
class FunctionPropertyAssignmentSyntax protected ()
  extends typings.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax {
  def this(
    propertyName: ISyntaxToken,
    callSignature: typings.typescriptServices.TypeScript.CallSignatureSyntax,
    block: typings.typescriptServices.TypeScript.BlockSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSGlobal("TypeScript.FunctionPropertyAssignmentSyntax")
@js.native
object FunctionPropertyAssignmentSyntax extends js.Object {
  def create1(propertyName: ISyntaxToken): typings.typescriptServices.TypeScript.FunctionPropertyAssignmentSyntax = js.native
}

