package typings.typescriptServices.mod.Syntax

import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.ISyntaxTrivia
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Syntax.deferredTrivia")
@js.native
object deferredTrivia extends js.Object {
  
  def apply(kind: SyntaxKind, text: ISimpleText, fullStart: Double, fullWidth: Double): ISyntaxTrivia = js.native
}
