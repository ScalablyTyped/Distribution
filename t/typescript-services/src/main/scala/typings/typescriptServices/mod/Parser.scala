package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSImport("typescript-services", "Parser.incrementalParse")
  @js.native
  def incrementalParse(
    oldSyntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typings.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptServices.TypeScript.SyntaxTree = js.native
  
  @JSImport("typescript-services", "Parser.parse")
  @js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptServices.TypeScript.ParseOptions
  ): typings.typescriptServices.TypeScript.SyntaxTree = js.native
}
