package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.SourceUnitSyntax")
@js.native
class SourceUnitSyntax protected () extends SyntaxNode {
  def this(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken, parsedInStrictMode: Boolean) = this()
  var endOfFileToken: ISyntaxToken = js.native
  var moduleElements: ISyntaxList = js.native
  def update(moduleElements: ISyntaxList, endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  def withEndOfFileToken(endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  def withModuleElement(moduleElement: IModuleElementSyntax): SourceUnitSyntax = js.native
  def withModuleElements(moduleElements: ISyntaxList): SourceUnitSyntax = js.native
}

/* static members */
@JSGlobal("TypeScript.SourceUnitSyntax")
@js.native
object SourceUnitSyntax extends js.Object {
  def create(endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
  def create1(endOfFileToken: ISyntaxToken): SourceUnitSyntax = js.native
}

