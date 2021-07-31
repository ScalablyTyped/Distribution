package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Parser {
  
  @JSGlobal("TypeScript.Parser")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def incrementalParse(
    oldSyntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typings.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptServices.TypeScript.SyntaxTree = (^.asInstanceOf[js.Dynamic].applyDynamic("incrementalParse")(oldSyntaxTree.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any], newText.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxTree]
  
  @scala.inline
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptServices.TypeScript.ParseOptions
  ): typings.typescriptServices.TypeScript.SyntaxTree = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fileName.asInstanceOf[js.Any], text.asInstanceOf[js.Any], isDeclaration.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.SyntaxTree]
}
