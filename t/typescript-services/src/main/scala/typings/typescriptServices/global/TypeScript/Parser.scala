package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Parser")
@js.native
object Parser extends js.Object {
  def incrementalParse(
    oldSyntaxTree: typings.typescriptServices.TypeScript.SyntaxTree,
    textChangeRange: typings.typescriptServices.TypeScript.TextChangeRange,
    newText: ISimpleText
  ): typings.typescriptServices.TypeScript.SyntaxTree = js.native
  def parse(
    fileName: String,
    text: ISimpleText,
    isDeclaration: Boolean,
    options: typings.typescriptServices.TypeScript.ParseOptions
  ): typings.typescriptServices.TypeScript.SyntaxTree = js.native
}

