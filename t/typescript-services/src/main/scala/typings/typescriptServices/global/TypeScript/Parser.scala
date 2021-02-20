package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSGlobal("TypeScript.Parser.incrementalParse")
  @js.native
  def incrementalParse(
    oldSyntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typings.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptServices.TypeScript.SyntaxTree = js.native
  
  @JSGlobal("TypeScript.Parser.parse")
  @js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptServices.TypeScript.ParseOptions
  ): typings.typescriptServices.TypeScript.SyntaxTree = js.native
}
