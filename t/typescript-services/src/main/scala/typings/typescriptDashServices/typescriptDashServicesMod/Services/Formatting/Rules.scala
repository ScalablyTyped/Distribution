package typings.typescriptDashServices.typescriptDashServicesMod.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.Rules")
@js.native
class Rules ()
  extends typings.typescriptDashServices.TypeScript.Services.Formatting.Rules

/* static members */
@JSImport("typescript-services", "Services.Formatting.Rules")
@js.native
object Rules extends js.Object {
  def IsAfterCodeBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBeforeMultilineBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBinaryOpContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsControlDeclContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsForContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionCallOrNewContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsFunctionDeclContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsModuleDeclContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsMultilineBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNewContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotBinaryOpContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotForContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsNotFormatOnEnter(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsObjectTypeContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSameLineTokenOrBeforeMultilineBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsSingleLineBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeArgumentOrParameter(
    tokenKind: typings.typescriptDashServices.TypeScript.SyntaxKind,
    parentKind: typings.typescriptDashServices.TypeScript.SyntaxKind
  ): Boolean = js.native
  def IsTypeArgumentOrParameterContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsTypeScriptDeclWithBlockContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def IsVoidOpContext(context: typings.typescriptDashServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
  def NodeIsBlockContext(node: typings.typescriptDashServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  def NodeIsTypeScriptDeclWithBlockContext(node: typings.typescriptDashServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
}

