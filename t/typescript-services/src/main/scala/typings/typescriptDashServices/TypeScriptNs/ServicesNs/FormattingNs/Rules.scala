package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange
import typings.typescriptDashServices.TypeScriptNs.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.Rules")
@js.native
class Rules ()
  extends /* name */ StringDictionary[js.Any] {
  var ControlOpenBraceLeftTokenRange: TokenRange = js.native
  var FunctionOpenBraceLeftTokenRange: TokenRange = js.native
  var HighPriorityCommonRules: js.Array[Rule] = js.native
  var IgnoreAfterLineComment: Rule = js.native
  var IgnoreBeforeComment: Rule = js.native
  var LowPriorityCommonRules: js.Array[Rule] = js.native
  var NewLineAfterOpenBraceInBlockContext: Rule = js.native
  var NewLineBeforeCloseBraceInBlockContext: Rule = js.native
  var NewLineBeforeOpenBraceInControl: Rule = js.native
  var NewLineBeforeOpenBraceInFunction: Rule = js.native
  var NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: Rule = js.native
  var NoSpaceAfterAnonymousFunctionKeyword: Rule = js.native
  var NoSpaceAfterBinaryOperator: Rule = js.native
  var NoSpaceAfterCloseAngularBracket: Rule = js.native
  var NoSpaceAfterCloseBrace: Rule = js.native
  var NoSpaceAfterCloseBracket: Rule = js.native
  var NoSpaceAfterComma: Rule = js.native
  var NoSpaceAfterConstructor: Rule = js.native
  var NoSpaceAfterDot: Rule = js.native
  var NoSpaceAfterEllipsis: Rule = js.native
  var NoSpaceAfterKeywordInControl: Rule = js.native
  var NoSpaceAfterModuleImport: Rule = js.native
  var NoSpaceAfterOpenAngularBracket: Rule = js.native
  var NoSpaceAfterOpenBracket: Rule = js.native
  var NoSpaceAfterOpenParen: Rule = js.native
  var NoSpaceAfterOptionalParameters: Rule = js.native
  var NoSpaceAfterSemicolonInFor: Rule = js.native
  var NoSpaceAfterUnaryPredecrementOperator: Rule = js.native
  var NoSpaceAfterUnaryPrefixOperator: Rule = js.native
  var NoSpaceAfterUnaryPreincrementOperator: Rule = js.native
  var NoSpaceBeforeBinaryOperator: Rule = js.native
  var NoSpaceBeforeCloseAngularBracket: Rule = js.native
  var NoSpaceBeforeCloseBracket: Rule = js.native
  var NoSpaceBeforeCloseParen: Rule = js.native
  var NoSpaceBeforeColon: Rule = js.native
  var NoSpaceBeforeComma: Rule = js.native
  var NoSpaceBeforeDot: Rule = js.native
  var NoSpaceBeforeOpenAngularBracket: Rule = js.native
  var NoSpaceBeforeOpenBracket: Rule = js.native
  var NoSpaceBeforeOpenParenInFuncCall: Rule = js.native
  var NoSpaceBeforeOpenParenInFuncDecl: Rule = js.native
  var NoSpaceBeforeQMark: Rule = js.native
  var NoSpaceBeforeSemicolon: Rule = js.native
  var NoSpaceBeforeUnaryPostdecrementOperator: Rule = js.native
  var NoSpaceBeforeUnaryPostincrementOperator: Rule = js.native
  var NoSpaceBetweenCloseParenAndAngularBracket: Rule = js.native
  var NoSpaceBetweenEmptyBraceBrackets: Rule = js.native
  var NoSpaceBetweenEmptyInterfaceBraceBrackets: Rule = js.native
  var NoSpaceBetweenParens: Rule = js.native
  var NoSpaceBetweenReturnAndSemicolon: Rule = js.native
  var SpaceAfterAddWhenFollowedByPreincrement: Rule = js.native
  var SpaceAfterAddWhenFollowedByUnaryPlus: Rule = js.native
  var SpaceAfterAnonymousFunctionKeyword: Rule = js.native
  var SpaceAfterArrow: Rule = js.native
  var SpaceAfterBinaryKeywordOperator: Rule = js.native
  var SpaceAfterBinaryOperator: Rule = js.native
  var SpaceAfterCertainKeywords: Rule = js.native
  var SpaceAfterCertainTypeScriptKeywords: Rule = js.native
  var SpaceAfterCloseBrace: Rule = js.native
  var SpaceAfterColon: Rule = js.native
  var SpaceAfterComma: Rule = js.native
  var SpaceAfterFunctionInFuncDecl: Rule = js.native
  var SpaceAfterGetSetInMember: Rule = js.native
  var SpaceAfterKeywordInControl: Rule = js.native
  var SpaceAfterModuleName: Rule = js.native
  var SpaceAfterOpenBrace: Rule = js.native
  var SpaceAfterOpenParen: Rule = js.native
  var SpaceAfterPostdecrementWhenFollowedBySubtract: Rule = js.native
  var SpaceAfterPostincrementWhenFollowedByAdd: Rule = js.native
  var SpaceAfterQMark: Rule = js.native
  var SpaceAfterSemicolon: Rule = js.native
  var SpaceAfterSemicolonInFor: Rule = js.native
  var SpaceAfterSubtractWhenFollowedByPredecrement: Rule = js.native
  var SpaceAfterSubtractWhenFollowedByUnaryMinus: Rule = js.native
  var SpaceAfterTryFinally: Rule = js.native
  var SpaceAfterVoidOperator: Rule = js.native
  var SpaceBeforeBinaryKeywordOperator: Rule = js.native
  var SpaceBeforeBinaryOperator: Rule = js.native
  var SpaceBeforeCertainTypeScriptKeywords: Rule = js.native
  var SpaceBeforeCloseBrace: Rule = js.native
  var SpaceBeforeCloseParen: Rule = js.native
  var SpaceBeforeOpenBraceInControl: Rule = js.native
  var SpaceBeforeOpenBraceInFunction: Rule = js.native
  var SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: Rule = js.native
  var SpaceBetweenCloseBraceAndElse: Rule = js.native
  var SpaceBetweenCloseBraceAndWhile: Rule = js.native
  var SpaceBetweenStatements: Rule = js.native
  var TypeScriptOpenBraceLeftTokenRange: TokenRange = js.native
  def getRuleName(rule: Rule): js.Any = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.Rules")
@js.native
object Rules extends js.Object {
  def IsAfterCodeBlockContext(context: FormattingContext): Boolean = js.native
  def IsBeforeBlockContext(context: FormattingContext): Boolean = js.native
  def IsBeforeMultilineBlockContext(context: FormattingContext): Boolean = js.native
  def IsBinaryOpContext(context: FormattingContext): Boolean = js.native
  def IsBlockContext(context: FormattingContext): Boolean = js.native
  def IsControlDeclContext(context: FormattingContext): Boolean = js.native
  def IsForContext(context: FormattingContext): Boolean = js.native
  def IsFunctionCallContext(context: FormattingContext): Boolean = js.native
  def IsFunctionCallOrNewContext(context: FormattingContext): Boolean = js.native
  def IsFunctionDeclContext(context: FormattingContext): Boolean = js.native
  def IsModuleDeclContext(context: FormattingContext): Boolean = js.native
  def IsMultilineBlockContext(context: FormattingContext): Boolean = js.native
  def IsNewContext(context: FormattingContext): Boolean = js.native
  def IsNotBinaryOpContext(context: FormattingContext): Boolean = js.native
  def IsNotForContext(context: FormattingContext): Boolean = js.native
  def IsNotFormatOnEnter(context: FormattingContext): Boolean = js.native
  def IsObjectContext(context: FormattingContext): Boolean = js.native
  def IsObjectTypeContext(context: FormattingContext): Boolean = js.native
  def IsSameLineTokenContext(context: FormattingContext): Boolean = js.native
  def IsSameLineTokenOrBeforeMultilineBlockContext(context: FormattingContext): Boolean = js.native
  def IsSingleLineBlockContext(context: FormattingContext): Boolean = js.native
  def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = js.native
  def IsTypeArgumentOrParameterContext(context: FormattingContext): Boolean = js.native
  def IsTypeScriptDeclWithBlockContext(context: FormattingContext): Boolean = js.native
  def IsVoidOpContext(context: FormattingContext): Boolean = js.native
  def NodeIsBlockContext(node: IndentationNodeContext): Boolean = js.native
  def NodeIsTypeScriptDeclWithBlockContext(node: IndentationNodeContext): Boolean = js.native
}

