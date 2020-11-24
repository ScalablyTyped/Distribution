package typings.typescriptServices.global.TypeScript.Syntax

import typings.typescriptServices.TypeScript.ISyntaxTrivia
import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Syntax.trivia")
@js.native
object trivia extends js.Object {
  
  def apply(kind: SyntaxKind, text: String): ISyntaxTrivia = js.native
}
