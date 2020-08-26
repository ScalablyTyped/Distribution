package typings.typescriptServices.global.TypeScript.Services.Formatting

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Rules")
@js.native
class Rules ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.Rules

/* static members */
@JSGlobal("TypeScript.Services.Formatting.Rules")
@js.native
object Rules extends js.Object {
  def IsAfterCodeBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBinaryOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsControlDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsForContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallOrNewContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsModuleDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNewContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotBinaryOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotForContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotFormatOnEnter(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectTypeContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenOrBeforeMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSingleLineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = js.native
  def IsTypeArgumentOrParameterContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeScriptDeclWithBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsVoidOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def NodeIsBlockContext(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  def NodeIsTypeScriptDeclWithBlockContext(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
}

