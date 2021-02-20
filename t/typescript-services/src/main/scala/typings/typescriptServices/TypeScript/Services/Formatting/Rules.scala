package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rules
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
object Rules {
  
  @scala.inline
  def apply(
    ControlOpenBraceLeftTokenRange: TokenRange,
    FunctionOpenBraceLeftTokenRange: TokenRange,
    HighPriorityCommonRules: js.Array[Rule],
    IgnoreAfterLineComment: Rule,
    IgnoreBeforeComment: Rule,
    LowPriorityCommonRules: js.Array[Rule],
    NewLineAfterOpenBraceInBlockContext: Rule,
    NewLineBeforeCloseBraceInBlockContext: Rule,
    NewLineBeforeOpenBraceInControl: Rule,
    NewLineBeforeOpenBraceInFunction: Rule,
    NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: Rule,
    NoSpaceAfterAnonymousFunctionKeyword: Rule,
    NoSpaceAfterBinaryOperator: Rule,
    NoSpaceAfterCloseAngularBracket: Rule,
    NoSpaceAfterCloseBrace: Rule,
    NoSpaceAfterCloseBracket: Rule,
    NoSpaceAfterComma: Rule,
    NoSpaceAfterConstructor: Rule,
    NoSpaceAfterDot: Rule,
    NoSpaceAfterEllipsis: Rule,
    NoSpaceAfterKeywordInControl: Rule,
    NoSpaceAfterModuleImport: Rule,
    NoSpaceAfterOpenAngularBracket: Rule,
    NoSpaceAfterOpenBracket: Rule,
    NoSpaceAfterOpenParen: Rule,
    NoSpaceAfterOptionalParameters: Rule,
    NoSpaceAfterSemicolonInFor: Rule,
    NoSpaceAfterUnaryPredecrementOperator: Rule,
    NoSpaceAfterUnaryPrefixOperator: Rule,
    NoSpaceAfterUnaryPreincrementOperator: Rule,
    NoSpaceBeforeBinaryOperator: Rule,
    NoSpaceBeforeCloseAngularBracket: Rule,
    NoSpaceBeforeCloseBracket: Rule,
    NoSpaceBeforeCloseParen: Rule,
    NoSpaceBeforeColon: Rule,
    NoSpaceBeforeComma: Rule,
    NoSpaceBeforeDot: Rule,
    NoSpaceBeforeOpenAngularBracket: Rule,
    NoSpaceBeforeOpenBracket: Rule,
    NoSpaceBeforeOpenParenInFuncCall: Rule,
    NoSpaceBeforeOpenParenInFuncDecl: Rule,
    NoSpaceBeforeQMark: Rule,
    NoSpaceBeforeSemicolon: Rule,
    NoSpaceBeforeUnaryPostdecrementOperator: Rule,
    NoSpaceBeforeUnaryPostincrementOperator: Rule,
    NoSpaceBetweenCloseParenAndAngularBracket: Rule,
    NoSpaceBetweenEmptyBraceBrackets: Rule,
    NoSpaceBetweenEmptyInterfaceBraceBrackets: Rule,
    NoSpaceBetweenParens: Rule,
    NoSpaceBetweenReturnAndSemicolon: Rule,
    SpaceAfterAddWhenFollowedByPreincrement: Rule,
    SpaceAfterAddWhenFollowedByUnaryPlus: Rule,
    SpaceAfterAnonymousFunctionKeyword: Rule,
    SpaceAfterArrow: Rule,
    SpaceAfterBinaryKeywordOperator: Rule,
    SpaceAfterBinaryOperator: Rule,
    SpaceAfterCertainKeywords: Rule,
    SpaceAfterCertainTypeScriptKeywords: Rule,
    SpaceAfterCloseBrace: Rule,
    SpaceAfterColon: Rule,
    SpaceAfterComma: Rule,
    SpaceAfterFunctionInFuncDecl: Rule,
    SpaceAfterGetSetInMember: Rule,
    SpaceAfterKeywordInControl: Rule,
    SpaceAfterModuleName: Rule,
    SpaceAfterOpenBrace: Rule,
    SpaceAfterOpenParen: Rule,
    SpaceAfterPostdecrementWhenFollowedBySubtract: Rule,
    SpaceAfterPostincrementWhenFollowedByAdd: Rule,
    SpaceAfterQMark: Rule,
    SpaceAfterSemicolon: Rule,
    SpaceAfterSemicolonInFor: Rule,
    SpaceAfterSubtractWhenFollowedByPredecrement: Rule,
    SpaceAfterSubtractWhenFollowedByUnaryMinus: Rule,
    SpaceAfterTryFinally: Rule,
    SpaceAfterVoidOperator: Rule,
    SpaceBeforeBinaryKeywordOperator: Rule,
    SpaceBeforeBinaryOperator: Rule,
    SpaceBeforeCertainTypeScriptKeywords: Rule,
    SpaceBeforeCloseBrace: Rule,
    SpaceBeforeCloseParen: Rule,
    SpaceBeforeOpenBraceInControl: Rule,
    SpaceBeforeOpenBraceInFunction: Rule,
    SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: Rule,
    SpaceBetweenCloseBraceAndElse: Rule,
    SpaceBetweenCloseBraceAndWhile: Rule,
    SpaceBetweenStatements: Rule,
    TypeScriptOpenBraceLeftTokenRange: TokenRange,
    getRuleName: Rule => js.Any
  ): Rules = {
    val __obj = js.Dynamic.literal(ControlOpenBraceLeftTokenRange = ControlOpenBraceLeftTokenRange.asInstanceOf[js.Any], FunctionOpenBraceLeftTokenRange = FunctionOpenBraceLeftTokenRange.asInstanceOf[js.Any], HighPriorityCommonRules = HighPriorityCommonRules.asInstanceOf[js.Any], IgnoreAfterLineComment = IgnoreAfterLineComment.asInstanceOf[js.Any], IgnoreBeforeComment = IgnoreBeforeComment.asInstanceOf[js.Any], LowPriorityCommonRules = LowPriorityCommonRules.asInstanceOf[js.Any], NewLineAfterOpenBraceInBlockContext = NewLineAfterOpenBraceInBlockContext.asInstanceOf[js.Any], NewLineBeforeCloseBraceInBlockContext = NewLineBeforeCloseBraceInBlockContext.asInstanceOf[js.Any], NewLineBeforeOpenBraceInControl = NewLineBeforeOpenBraceInControl.asInstanceOf[js.Any], NewLineBeforeOpenBraceInFunction = NewLineBeforeOpenBraceInFunction.asInstanceOf[js.Any], NewLineBeforeOpenBraceInTypeScriptDeclWithBlock = NewLineBeforeOpenBraceInTypeScriptDeclWithBlock.asInstanceOf[js.Any], NoSpaceAfterAnonymousFunctionKeyword = NoSpaceAfterAnonymousFunctionKeyword.asInstanceOf[js.Any], NoSpaceAfterBinaryOperator = NoSpaceAfterBinaryOperator.asInstanceOf[js.Any], NoSpaceAfterCloseAngularBracket = NoSpaceAfterCloseAngularBracket.asInstanceOf[js.Any], NoSpaceAfterCloseBrace = NoSpaceAfterCloseBrace.asInstanceOf[js.Any], NoSpaceAfterCloseBracket = NoSpaceAfterCloseBracket.asInstanceOf[js.Any], NoSpaceAfterComma = NoSpaceAfterComma.asInstanceOf[js.Any], NoSpaceAfterConstructor = NoSpaceAfterConstructor.asInstanceOf[js.Any], NoSpaceAfterDot = NoSpaceAfterDot.asInstanceOf[js.Any], NoSpaceAfterEllipsis = NoSpaceAfterEllipsis.asInstanceOf[js.Any], NoSpaceAfterKeywordInControl = NoSpaceAfterKeywordInControl.asInstanceOf[js.Any], NoSpaceAfterModuleImport = NoSpaceAfterModuleImport.asInstanceOf[js.Any], NoSpaceAfterOpenAngularBracket = NoSpaceAfterOpenAngularBracket.asInstanceOf[js.Any], NoSpaceAfterOpenBracket = NoSpaceAfterOpenBracket.asInstanceOf[js.Any], NoSpaceAfterOpenParen = NoSpaceAfterOpenParen.asInstanceOf[js.Any], NoSpaceAfterOptionalParameters = NoSpaceAfterOptionalParameters.asInstanceOf[js.Any], NoSpaceAfterSemicolonInFor = NoSpaceAfterSemicolonInFor.asInstanceOf[js.Any], NoSpaceAfterUnaryPredecrementOperator = NoSpaceAfterUnaryPredecrementOperator.asInstanceOf[js.Any], NoSpaceAfterUnaryPrefixOperator = NoSpaceAfterUnaryPrefixOperator.asInstanceOf[js.Any], NoSpaceAfterUnaryPreincrementOperator = NoSpaceAfterUnaryPreincrementOperator.asInstanceOf[js.Any], NoSpaceBeforeBinaryOperator = NoSpaceBeforeBinaryOperator.asInstanceOf[js.Any], NoSpaceBeforeCloseAngularBracket = NoSpaceBeforeCloseAngularBracket.asInstanceOf[js.Any], NoSpaceBeforeCloseBracket = NoSpaceBeforeCloseBracket.asInstanceOf[js.Any], NoSpaceBeforeCloseParen = NoSpaceBeforeCloseParen.asInstanceOf[js.Any], NoSpaceBeforeColon = NoSpaceBeforeColon.asInstanceOf[js.Any], NoSpaceBeforeComma = NoSpaceBeforeComma.asInstanceOf[js.Any], NoSpaceBeforeDot = NoSpaceBeforeDot.asInstanceOf[js.Any], NoSpaceBeforeOpenAngularBracket = NoSpaceBeforeOpenAngularBracket.asInstanceOf[js.Any], NoSpaceBeforeOpenBracket = NoSpaceBeforeOpenBracket.asInstanceOf[js.Any], NoSpaceBeforeOpenParenInFuncCall = NoSpaceBeforeOpenParenInFuncCall.asInstanceOf[js.Any], NoSpaceBeforeOpenParenInFuncDecl = NoSpaceBeforeOpenParenInFuncDecl.asInstanceOf[js.Any], NoSpaceBeforeQMark = NoSpaceBeforeQMark.asInstanceOf[js.Any], NoSpaceBeforeSemicolon = NoSpaceBeforeSemicolon.asInstanceOf[js.Any], NoSpaceBeforeUnaryPostdecrementOperator = NoSpaceBeforeUnaryPostdecrementOperator.asInstanceOf[js.Any], NoSpaceBeforeUnaryPostincrementOperator = NoSpaceBeforeUnaryPostincrementOperator.asInstanceOf[js.Any], NoSpaceBetweenCloseParenAndAngularBracket = NoSpaceBetweenCloseParenAndAngularBracket.asInstanceOf[js.Any], NoSpaceBetweenEmptyBraceBrackets = NoSpaceBetweenEmptyBraceBrackets.asInstanceOf[js.Any], NoSpaceBetweenEmptyInterfaceBraceBrackets = NoSpaceBetweenEmptyInterfaceBraceBrackets.asInstanceOf[js.Any], NoSpaceBetweenParens = NoSpaceBetweenParens.asInstanceOf[js.Any], NoSpaceBetweenReturnAndSemicolon = NoSpaceBetweenReturnAndSemicolon.asInstanceOf[js.Any], SpaceAfterAddWhenFollowedByPreincrement = SpaceAfterAddWhenFollowedByPreincrement.asInstanceOf[js.Any], SpaceAfterAddWhenFollowedByUnaryPlus = SpaceAfterAddWhenFollowedByUnaryPlus.asInstanceOf[js.Any], SpaceAfterAnonymousFunctionKeyword = SpaceAfterAnonymousFunctionKeyword.asInstanceOf[js.Any], SpaceAfterArrow = SpaceAfterArrow.asInstanceOf[js.Any], SpaceAfterBinaryKeywordOperator = SpaceAfterBinaryKeywordOperator.asInstanceOf[js.Any], SpaceAfterBinaryOperator = SpaceAfterBinaryOperator.asInstanceOf[js.Any], SpaceAfterCertainKeywords = SpaceAfterCertainKeywords.asInstanceOf[js.Any], SpaceAfterCertainTypeScriptKeywords = SpaceAfterCertainTypeScriptKeywords.asInstanceOf[js.Any], SpaceAfterCloseBrace = SpaceAfterCloseBrace.asInstanceOf[js.Any], SpaceAfterColon = SpaceAfterColon.asInstanceOf[js.Any], SpaceAfterComma = SpaceAfterComma.asInstanceOf[js.Any], SpaceAfterFunctionInFuncDecl = SpaceAfterFunctionInFuncDecl.asInstanceOf[js.Any], SpaceAfterGetSetInMember = SpaceAfterGetSetInMember.asInstanceOf[js.Any], SpaceAfterKeywordInControl = SpaceAfterKeywordInControl.asInstanceOf[js.Any], SpaceAfterModuleName = SpaceAfterModuleName.asInstanceOf[js.Any], SpaceAfterOpenBrace = SpaceAfterOpenBrace.asInstanceOf[js.Any], SpaceAfterOpenParen = SpaceAfterOpenParen.asInstanceOf[js.Any], SpaceAfterPostdecrementWhenFollowedBySubtract = SpaceAfterPostdecrementWhenFollowedBySubtract.asInstanceOf[js.Any], SpaceAfterPostincrementWhenFollowedByAdd = SpaceAfterPostincrementWhenFollowedByAdd.asInstanceOf[js.Any], SpaceAfterQMark = SpaceAfterQMark.asInstanceOf[js.Any], SpaceAfterSemicolon = SpaceAfterSemicolon.asInstanceOf[js.Any], SpaceAfterSemicolonInFor = SpaceAfterSemicolonInFor.asInstanceOf[js.Any], SpaceAfterSubtractWhenFollowedByPredecrement = SpaceAfterSubtractWhenFollowedByPredecrement.asInstanceOf[js.Any], SpaceAfterSubtractWhenFollowedByUnaryMinus = SpaceAfterSubtractWhenFollowedByUnaryMinus.asInstanceOf[js.Any], SpaceAfterTryFinally = SpaceAfterTryFinally.asInstanceOf[js.Any], SpaceAfterVoidOperator = SpaceAfterVoidOperator.asInstanceOf[js.Any], SpaceBeforeBinaryKeywordOperator = SpaceBeforeBinaryKeywordOperator.asInstanceOf[js.Any], SpaceBeforeBinaryOperator = SpaceBeforeBinaryOperator.asInstanceOf[js.Any], SpaceBeforeCertainTypeScriptKeywords = SpaceBeforeCertainTypeScriptKeywords.asInstanceOf[js.Any], SpaceBeforeCloseBrace = SpaceBeforeCloseBrace.asInstanceOf[js.Any], SpaceBeforeCloseParen = SpaceBeforeCloseParen.asInstanceOf[js.Any], SpaceBeforeOpenBraceInControl = SpaceBeforeOpenBraceInControl.asInstanceOf[js.Any], SpaceBeforeOpenBraceInFunction = SpaceBeforeOpenBraceInFunction.asInstanceOf[js.Any], SpaceBeforeOpenBraceInTypeScriptDeclWithBlock = SpaceBeforeOpenBraceInTypeScriptDeclWithBlock.asInstanceOf[js.Any], SpaceBetweenCloseBraceAndElse = SpaceBetweenCloseBraceAndElse.asInstanceOf[js.Any], SpaceBetweenCloseBraceAndWhile = SpaceBetweenCloseBraceAndWhile.asInstanceOf[js.Any], SpaceBetweenStatements = SpaceBetweenStatements.asInstanceOf[js.Any], TypeScriptOpenBraceLeftTokenRange = TypeScriptOpenBraceLeftTokenRange.asInstanceOf[js.Any], getRuleName = js.Any.fromFunction1(getRuleName))
    __obj.asInstanceOf[Rules]
  }
  
  @scala.inline
  implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlOpenBraceLeftTokenRange(value: TokenRange): Self = StObject.set(x, "ControlOpenBraceLeftTokenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionOpenBraceLeftTokenRange(value: TokenRange): Self = StObject.set(x, "FunctionOpenBraceLeftTokenRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRuleName(value: Rule => js.Any): Self = StObject.set(x, "getRuleName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighPriorityCommonRules(value: js.Array[Rule]): Self = StObject.set(x, "HighPriorityCommonRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighPriorityCommonRulesVarargs(value: Rule*): Self = StObject.set(x, "HighPriorityCommonRules", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreAfterLineComment(value: Rule): Self = StObject.set(x, "IgnoreAfterLineComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreBeforeComment(value: Rule): Self = StObject.set(x, "IgnoreBeforeComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowPriorityCommonRules(value: js.Array[Rule]): Self = StObject.set(x, "LowPriorityCommonRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowPriorityCommonRulesVarargs(value: Rule*): Self = StObject.set(x, "LowPriorityCommonRules", js.Array(value :_*))
    
    @scala.inline
    def setNewLineAfterOpenBraceInBlockContext(value: Rule): Self = StObject.set(x, "NewLineAfterOpenBraceInBlockContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineBeforeCloseBraceInBlockContext(value: Rule): Self = StObject.set(x, "NewLineBeforeCloseBraceInBlockContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineBeforeOpenBraceInControl(value: Rule): Self = StObject.set(x, "NewLineBeforeOpenBraceInControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineBeforeOpenBraceInFunction(value: Rule): Self = StObject.set(x, "NewLineBeforeOpenBraceInFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewLineBeforeOpenBraceInTypeScriptDeclWithBlock(value: Rule): Self = StObject.set(x, "NewLineBeforeOpenBraceInTypeScriptDeclWithBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterAnonymousFunctionKeyword(value: Rule): Self = StObject.set(x, "NoSpaceAfterAnonymousFunctionKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterBinaryOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterBinaryOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterCloseAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterCloseAngularBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterCloseBrace(value: Rule): Self = StObject.set(x, "NoSpaceAfterCloseBrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterCloseBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterCloseBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterComma(value: Rule): Self = StObject.set(x, "NoSpaceAfterComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterConstructor(value: Rule): Self = StObject.set(x, "NoSpaceAfterConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterDot(value: Rule): Self = StObject.set(x, "NoSpaceAfterDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterEllipsis(value: Rule): Self = StObject.set(x, "NoSpaceAfterEllipsis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterKeywordInControl(value: Rule): Self = StObject.set(x, "NoSpaceAfterKeywordInControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterModuleImport(value: Rule): Self = StObject.set(x, "NoSpaceAfterModuleImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterOpenAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterOpenAngularBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterOpenBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterOpenBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterOpenParen(value: Rule): Self = StObject.set(x, "NoSpaceAfterOpenParen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterOptionalParameters(value: Rule): Self = StObject.set(x, "NoSpaceAfterOptionalParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterSemicolonInFor(value: Rule): Self = StObject.set(x, "NoSpaceAfterSemicolonInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterUnaryPredecrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterUnaryPredecrementOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterUnaryPrefixOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterUnaryPrefixOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceAfterUnaryPreincrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterUnaryPreincrementOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeBinaryOperator(value: Rule): Self = StObject.set(x, "NoSpaceBeforeBinaryOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeCloseAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeCloseAngularBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeCloseBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeCloseBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeCloseParen(value: Rule): Self = StObject.set(x, "NoSpaceBeforeCloseParen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeColon(value: Rule): Self = StObject.set(x, "NoSpaceBeforeColon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeComma(value: Rule): Self = StObject.set(x, "NoSpaceBeforeComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeDot(value: Rule): Self = StObject.set(x, "NoSpaceBeforeDot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeOpenAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenAngularBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeOpenBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeOpenParenInFuncCall(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenParenInFuncCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeOpenParenInFuncDecl(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenParenInFuncDecl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeQMark(value: Rule): Self = StObject.set(x, "NoSpaceBeforeQMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeSemicolon(value: Rule): Self = StObject.set(x, "NoSpaceBeforeSemicolon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeUnaryPostdecrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceBeforeUnaryPostdecrementOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBeforeUnaryPostincrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceBeforeUnaryPostincrementOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBetweenCloseParenAndAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceBetweenCloseParenAndAngularBracket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBetweenEmptyBraceBrackets(value: Rule): Self = StObject.set(x, "NoSpaceBetweenEmptyBraceBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBetweenEmptyInterfaceBraceBrackets(value: Rule): Self = StObject.set(x, "NoSpaceBetweenEmptyInterfaceBraceBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBetweenParens(value: Rule): Self = StObject.set(x, "NoSpaceBetweenParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSpaceBetweenReturnAndSemicolon(value: Rule): Self = StObject.set(x, "NoSpaceBetweenReturnAndSemicolon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterAddWhenFollowedByPreincrement(value: Rule): Self = StObject.set(x, "SpaceAfterAddWhenFollowedByPreincrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterAddWhenFollowedByUnaryPlus(value: Rule): Self = StObject.set(x, "SpaceAfterAddWhenFollowedByUnaryPlus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterAnonymousFunctionKeyword(value: Rule): Self = StObject.set(x, "SpaceAfterAnonymousFunctionKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterArrow(value: Rule): Self = StObject.set(x, "SpaceAfterArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterBinaryKeywordOperator(value: Rule): Self = StObject.set(x, "SpaceAfterBinaryKeywordOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterBinaryOperator(value: Rule): Self = StObject.set(x, "SpaceAfterBinaryOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterCertainKeywords(value: Rule): Self = StObject.set(x, "SpaceAfterCertainKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterCertainTypeScriptKeywords(value: Rule): Self = StObject.set(x, "SpaceAfterCertainTypeScriptKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterCloseBrace(value: Rule): Self = StObject.set(x, "SpaceAfterCloseBrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterColon(value: Rule): Self = StObject.set(x, "SpaceAfterColon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterComma(value: Rule): Self = StObject.set(x, "SpaceAfterComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterFunctionInFuncDecl(value: Rule): Self = StObject.set(x, "SpaceAfterFunctionInFuncDecl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterGetSetInMember(value: Rule): Self = StObject.set(x, "SpaceAfterGetSetInMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterKeywordInControl(value: Rule): Self = StObject.set(x, "SpaceAfterKeywordInControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterModuleName(value: Rule): Self = StObject.set(x, "SpaceAfterModuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterOpenBrace(value: Rule): Self = StObject.set(x, "SpaceAfterOpenBrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterOpenParen(value: Rule): Self = StObject.set(x, "SpaceAfterOpenParen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterPostdecrementWhenFollowedBySubtract(value: Rule): Self = StObject.set(x, "SpaceAfterPostdecrementWhenFollowedBySubtract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterPostincrementWhenFollowedByAdd(value: Rule): Self = StObject.set(x, "SpaceAfterPostincrementWhenFollowedByAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterQMark(value: Rule): Self = StObject.set(x, "SpaceAfterQMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterSemicolon(value: Rule): Self = StObject.set(x, "SpaceAfterSemicolon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterSemicolonInFor(value: Rule): Self = StObject.set(x, "SpaceAfterSemicolonInFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterSubtractWhenFollowedByPredecrement(value: Rule): Self = StObject.set(x, "SpaceAfterSubtractWhenFollowedByPredecrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterSubtractWhenFollowedByUnaryMinus(value: Rule): Self = StObject.set(x, "SpaceAfterSubtractWhenFollowedByUnaryMinus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterTryFinally(value: Rule): Self = StObject.set(x, "SpaceAfterTryFinally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceAfterVoidOperator(value: Rule): Self = StObject.set(x, "SpaceAfterVoidOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeBinaryKeywordOperator(value: Rule): Self = StObject.set(x, "SpaceBeforeBinaryKeywordOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeBinaryOperator(value: Rule): Self = StObject.set(x, "SpaceBeforeBinaryOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeCertainTypeScriptKeywords(value: Rule): Self = StObject.set(x, "SpaceBeforeCertainTypeScriptKeywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeCloseBrace(value: Rule): Self = StObject.set(x, "SpaceBeforeCloseBrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeCloseParen(value: Rule): Self = StObject.set(x, "SpaceBeforeCloseParen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeOpenBraceInControl(value: Rule): Self = StObject.set(x, "SpaceBeforeOpenBraceInControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeOpenBraceInFunction(value: Rule): Self = StObject.set(x, "SpaceBeforeOpenBraceInFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBeforeOpenBraceInTypeScriptDeclWithBlock(value: Rule): Self = StObject.set(x, "SpaceBeforeOpenBraceInTypeScriptDeclWithBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBetweenCloseBraceAndElse(value: Rule): Self = StObject.set(x, "SpaceBetweenCloseBraceAndElse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBetweenCloseBraceAndWhile(value: Rule): Self = StObject.set(x, "SpaceBetweenCloseBraceAndWhile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceBetweenStatements(value: Rule): Self = StObject.set(x, "SpaceBetweenStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeScriptOpenBraceLeftTokenRange(value: TokenRange): Self = StObject.set(x, "TypeScriptOpenBraceLeftTokenRange", value.asInstanceOf[js.Any])
  }
}
