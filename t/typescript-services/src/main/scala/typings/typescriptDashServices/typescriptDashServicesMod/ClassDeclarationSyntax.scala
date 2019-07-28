package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.ISyntaxList
import typings.typescriptDashServices.TypeScriptNs.ISyntaxToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "ClassDeclarationSyntax")
@js.native
class ClassDeclarationSyntax protected ()
  extends typings.typescriptDashServices.TypeScriptNs.ClassDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    typeParameterList: typings.typescriptDashServices.TypeScriptNs.TypeParameterListSyntax,
    heritageClauses: ISyntaxList,
    openBraceToken: ISyntaxToken,
    classElements: ISyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "ClassDeclarationSyntax")
@js.native
object ClassDeclarationSyntax extends js.Object {
  def create(
    classKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typings.typescriptDashServices.TypeScriptNs.ClassDeclarationSyntax = js.native
  def create1(identifier: ISyntaxToken): typings.typescriptDashServices.TypeScriptNs.ClassDeclarationSyntax = js.native
}

