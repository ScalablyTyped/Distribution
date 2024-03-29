package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSImport("typescript-services", "Parser")
  @js.native
  val ^ : js.Any = js.native
  
  inline def incrementalParse(
    oldSyntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typings.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptServices.TypeScript.SyntaxTree = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalParse")(oldSyntaxTree.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxTree]
  
  inline def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptServices.TypeScript.ParseOptions
  ): typings.typescriptServices.TypeScript.SyntaxTree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fileName.asInstanceOf[js.Any], text.asInstanceOf[js.Any], isDeclaration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxTree]
}
