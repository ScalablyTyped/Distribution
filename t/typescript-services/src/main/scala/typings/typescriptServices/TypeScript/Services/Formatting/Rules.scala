package typings.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules
  extends StObject
     with /* name */ StringDictionary[js.Any] {
  
  var ControlOpenBraceLeftTokenRange: TokenRange
  
  var FunctionOpenBraceLeftTokenRange: TokenRange
  
  var HighPriorityCommonRules: js.Array[Rule]
  
  var IgnoreAfterLineComment: Rule
  
  var IgnoreBeforeComment: Rule
  
  var LowPriorityCommonRules: js.Array[Rule]
  
  var NewLineAfterOpenBraceInBlockContext: Rule
  
  var NewLineBeforeCloseBraceInBlockContext: Rule
  
  var NewLineBeforeOpenBraceInControl: Rule
  
  var NewLineBeforeOpenBraceInFunction: Rule
  
  var NewLineBeforeOpenBraceInTypeScriptDeclWithBlock: Rule
  
  var NoSpaceAfterAnonymousFunctionKeyword: Rule
  
  var NoSpaceAfterBinaryOperator: Rule
  
  var NoSpaceAfterCloseAngularBracket: Rule
  
  var NoSpaceAfterCloseBrace: Rule
  
  var NoSpaceAfterCloseBracket: Rule
  
  var NoSpaceAfterComma: Rule
  
  var NoSpaceAfterConstructor: Rule
  
  var NoSpaceAfterDot: Rule
  
  var NoSpaceAfterEllipsis: Rule
  
  var NoSpaceAfterKeywordInControl: Rule
  
  var NoSpaceAfterModuleImport: Rule
  
  var NoSpaceAfterOpenAngularBracket: Rule
  
  var NoSpaceAfterOpenBracket: Rule
  
  var NoSpaceAfterOpenParen: Rule
  
  var NoSpaceAfterOptionalParameters: Rule
  
  var NoSpaceAfterSemicolonInFor: Rule
  
  var NoSpaceAfterUnaryPredecrementOperator: Rule
  
  var NoSpaceAfterUnaryPrefixOperator: Rule
  
  var NoSpaceAfterUnaryPreincrementOperator: Rule
  
  var NoSpaceBeforeBinaryOperator: Rule
  
  var NoSpaceBeforeCloseAngularBracket: Rule
  
  var NoSpaceBeforeCloseBracket: Rule
  
  var NoSpaceBeforeCloseParen: Rule
  
  var NoSpaceBeforeColon: Rule
  
  var NoSpaceBeforeComma: Rule
  
  var NoSpaceBeforeDot: Rule
  
  var NoSpaceBeforeOpenAngularBracket: Rule
  
  var NoSpaceBeforeOpenBracket: Rule
  
  var NoSpaceBeforeOpenParenInFuncCall: Rule
  
  var NoSpaceBeforeOpenParenInFuncDecl: Rule
  
  var NoSpaceBeforeQMark: Rule
  
  var NoSpaceBeforeSemicolon: Rule
  
  var NoSpaceBeforeUnaryPostdecrementOperator: Rule
  
  var NoSpaceBeforeUnaryPostincrementOperator: Rule
  
  var NoSpaceBetweenCloseParenAndAngularBracket: Rule
  
  var NoSpaceBetweenEmptyBraceBrackets: Rule
  
  var NoSpaceBetweenEmptyInterfaceBraceBrackets: Rule
  
  var NoSpaceBetweenParens: Rule
  
  var NoSpaceBetweenReturnAndSemicolon: Rule
  
  var SpaceAfterAddWhenFollowedByPreincrement: Rule
  
  var SpaceAfterAddWhenFollowedByUnaryPlus: Rule
  
  var SpaceAfterAnonymousFunctionKeyword: Rule
  
  var SpaceAfterArrow: Rule
  
  var SpaceAfterBinaryKeywordOperator: Rule
  
  var SpaceAfterBinaryOperator: Rule
  
  var SpaceAfterCertainKeywords: Rule
  
  var SpaceAfterCertainTypeScriptKeywords: Rule
  
  var SpaceAfterCloseBrace: Rule
  
  var SpaceAfterColon: Rule
  
  var SpaceAfterComma: Rule
  
  var SpaceAfterFunctionInFuncDecl: Rule
  
  var SpaceAfterGetSetInMember: Rule
  
  var SpaceAfterKeywordInControl: Rule
  
  var SpaceAfterModuleName: Rule
  
  var SpaceAfterOpenBrace: Rule
  
  var SpaceAfterOpenParen: Rule
  
  var SpaceAfterPostdecrementWhenFollowedBySubtract: Rule
  
  var SpaceAfterPostincrementWhenFollowedByAdd: Rule
  
  var SpaceAfterQMark: Rule
  
  var SpaceAfterSemicolon: Rule
  
  var SpaceAfterSemicolonInFor: Rule
  
  var SpaceAfterSubtractWhenFollowedByPredecrement: Rule
  
  var SpaceAfterSubtractWhenFollowedByUnaryMinus: Rule
  
  var SpaceAfterTryFinally: Rule
  
  var SpaceAfterVoidOperator: Rule
  
  var SpaceBeforeBinaryKeywordOperator: Rule
  
  var SpaceBeforeBinaryOperator: Rule
  
  var SpaceBeforeCertainTypeScriptKeywords: Rule
  
  var SpaceBeforeCloseBrace: Rule
  
  var SpaceBeforeCloseParen: Rule
  
  var SpaceBeforeOpenBraceInControl: Rule
  
  var SpaceBeforeOpenBraceInFunction: Rule
  
  var SpaceBeforeOpenBraceInTypeScriptDeclWithBlock: Rule
  
  var SpaceBetweenCloseBraceAndElse: Rule
  
  var SpaceBetweenCloseBraceAndWhile: Rule
  
  var SpaceBetweenStatements: Rule
  
  var TypeScriptOpenBraceLeftTokenRange: TokenRange
  
  def getRuleName(rule: Rule): js.Any
}
object Rules {
  
  inline def apply(
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
  
  extension [Self <: Rules](x: Self) {
    
    inline def setControlOpenBraceLeftTokenRange(value: TokenRange): Self = StObject.set(x, "ControlOpenBraceLeftTokenRange", value.asInstanceOf[js.Any])
    
    inline def setFunctionOpenBraceLeftTokenRange(value: TokenRange): Self = StObject.set(x, "FunctionOpenBraceLeftTokenRange", value.asInstanceOf[js.Any])
    
    inline def setGetRuleName(value: Rule => js.Any): Self = StObject.set(x, "getRuleName", js.Any.fromFunction1(value))
    
    inline def setHighPriorityCommonRules(value: js.Array[Rule]): Self = StObject.set(x, "HighPriorityCommonRules", value.asInstanceOf[js.Any])
    
    inline def setHighPriorityCommonRulesVarargs(value: Rule*): Self = StObject.set(x, "HighPriorityCommonRules", js.Array(value :_*))
    
    inline def setIgnoreAfterLineComment(value: Rule): Self = StObject.set(x, "IgnoreAfterLineComment", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBeforeComment(value: Rule): Self = StObject.set(x, "IgnoreBeforeComment", value.asInstanceOf[js.Any])
    
    inline def setLowPriorityCommonRules(value: js.Array[Rule]): Self = StObject.set(x, "LowPriorityCommonRules", value.asInstanceOf[js.Any])
    
    inline def setLowPriorityCommonRulesVarargs(value: Rule*): Self = StObject.set(x, "LowPriorityCommonRules", js.Array(value :_*))
    
    inline def setNewLineAfterOpenBraceInBlockContext(value: Rule): Self = StObject.set(x, "NewLineAfterOpenBraceInBlockContext", value.asInstanceOf[js.Any])
    
    inline def setNewLineBeforeCloseBraceInBlockContext(value: Rule): Self = StObject.set(x, "NewLineBeforeCloseBraceInBlockContext", value.asInstanceOf[js.Any])
    
    inline def setNewLineBeforeOpenBraceInControl(value: Rule): Self = StObject.set(x, "NewLineBeforeOpenBraceInControl", value.asInstanceOf[js.Any])
    
    inline def setNewLineBeforeOpenBraceInFunction(value: Rule): Self = StObject.set(x, "NewLineBeforeOpenBraceInFunction", value.asInstanceOf[js.Any])
    
    inline def setNewLineBeforeOpenBraceInTypeScriptDeclWithBlock(value: Rule): Self = StObject.set(x, "NewLineBeforeOpenBraceInTypeScriptDeclWithBlock", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterAnonymousFunctionKeyword(value: Rule): Self = StObject.set(x, "NoSpaceAfterAnonymousFunctionKeyword", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterBinaryOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterBinaryOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterCloseAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterCloseAngularBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterCloseBrace(value: Rule): Self = StObject.set(x, "NoSpaceAfterCloseBrace", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterCloseBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterCloseBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterComma(value: Rule): Self = StObject.set(x, "NoSpaceAfterComma", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterConstructor(value: Rule): Self = StObject.set(x, "NoSpaceAfterConstructor", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterDot(value: Rule): Self = StObject.set(x, "NoSpaceAfterDot", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterEllipsis(value: Rule): Self = StObject.set(x, "NoSpaceAfterEllipsis", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterKeywordInControl(value: Rule): Self = StObject.set(x, "NoSpaceAfterKeywordInControl", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterModuleImport(value: Rule): Self = StObject.set(x, "NoSpaceAfterModuleImport", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterOpenAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterOpenAngularBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterOpenBracket(value: Rule): Self = StObject.set(x, "NoSpaceAfterOpenBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterOpenParen(value: Rule): Self = StObject.set(x, "NoSpaceAfterOpenParen", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterOptionalParameters(value: Rule): Self = StObject.set(x, "NoSpaceAfterOptionalParameters", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterSemicolonInFor(value: Rule): Self = StObject.set(x, "NoSpaceAfterSemicolonInFor", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterUnaryPredecrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterUnaryPredecrementOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterUnaryPrefixOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterUnaryPrefixOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceAfterUnaryPreincrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceAfterUnaryPreincrementOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeBinaryOperator(value: Rule): Self = StObject.set(x, "NoSpaceBeforeBinaryOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeCloseAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeCloseAngularBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeCloseBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeCloseBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeCloseParen(value: Rule): Self = StObject.set(x, "NoSpaceBeforeCloseParen", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeColon(value: Rule): Self = StObject.set(x, "NoSpaceBeforeColon", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeComma(value: Rule): Self = StObject.set(x, "NoSpaceBeforeComma", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeDot(value: Rule): Self = StObject.set(x, "NoSpaceBeforeDot", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeOpenAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenAngularBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeOpenBracket(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeOpenParenInFuncCall(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenParenInFuncCall", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeOpenParenInFuncDecl(value: Rule): Self = StObject.set(x, "NoSpaceBeforeOpenParenInFuncDecl", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeQMark(value: Rule): Self = StObject.set(x, "NoSpaceBeforeQMark", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeSemicolon(value: Rule): Self = StObject.set(x, "NoSpaceBeforeSemicolon", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeUnaryPostdecrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceBeforeUnaryPostdecrementOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBeforeUnaryPostincrementOperator(value: Rule): Self = StObject.set(x, "NoSpaceBeforeUnaryPostincrementOperator", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBetweenCloseParenAndAngularBracket(value: Rule): Self = StObject.set(x, "NoSpaceBetweenCloseParenAndAngularBracket", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBetweenEmptyBraceBrackets(value: Rule): Self = StObject.set(x, "NoSpaceBetweenEmptyBraceBrackets", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBetweenEmptyInterfaceBraceBrackets(value: Rule): Self = StObject.set(x, "NoSpaceBetweenEmptyInterfaceBraceBrackets", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBetweenParens(value: Rule): Self = StObject.set(x, "NoSpaceBetweenParens", value.asInstanceOf[js.Any])
    
    inline def setNoSpaceBetweenReturnAndSemicolon(value: Rule): Self = StObject.set(x, "NoSpaceBetweenReturnAndSemicolon", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterAddWhenFollowedByPreincrement(value: Rule): Self = StObject.set(x, "SpaceAfterAddWhenFollowedByPreincrement", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterAddWhenFollowedByUnaryPlus(value: Rule): Self = StObject.set(x, "SpaceAfterAddWhenFollowedByUnaryPlus", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterAnonymousFunctionKeyword(value: Rule): Self = StObject.set(x, "SpaceAfterAnonymousFunctionKeyword", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterArrow(value: Rule): Self = StObject.set(x, "SpaceAfterArrow", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterBinaryKeywordOperator(value: Rule): Self = StObject.set(x, "SpaceAfterBinaryKeywordOperator", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterBinaryOperator(value: Rule): Self = StObject.set(x, "SpaceAfterBinaryOperator", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterCertainKeywords(value: Rule): Self = StObject.set(x, "SpaceAfterCertainKeywords", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterCertainTypeScriptKeywords(value: Rule): Self = StObject.set(x, "SpaceAfterCertainTypeScriptKeywords", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterCloseBrace(value: Rule): Self = StObject.set(x, "SpaceAfterCloseBrace", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterColon(value: Rule): Self = StObject.set(x, "SpaceAfterColon", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterComma(value: Rule): Self = StObject.set(x, "SpaceAfterComma", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterFunctionInFuncDecl(value: Rule): Self = StObject.set(x, "SpaceAfterFunctionInFuncDecl", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterGetSetInMember(value: Rule): Self = StObject.set(x, "SpaceAfterGetSetInMember", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterKeywordInControl(value: Rule): Self = StObject.set(x, "SpaceAfterKeywordInControl", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterModuleName(value: Rule): Self = StObject.set(x, "SpaceAfterModuleName", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterOpenBrace(value: Rule): Self = StObject.set(x, "SpaceAfterOpenBrace", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterOpenParen(value: Rule): Self = StObject.set(x, "SpaceAfterOpenParen", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterPostdecrementWhenFollowedBySubtract(value: Rule): Self = StObject.set(x, "SpaceAfterPostdecrementWhenFollowedBySubtract", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterPostincrementWhenFollowedByAdd(value: Rule): Self = StObject.set(x, "SpaceAfterPostincrementWhenFollowedByAdd", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterQMark(value: Rule): Self = StObject.set(x, "SpaceAfterQMark", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterSemicolon(value: Rule): Self = StObject.set(x, "SpaceAfterSemicolon", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterSemicolonInFor(value: Rule): Self = StObject.set(x, "SpaceAfterSemicolonInFor", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterSubtractWhenFollowedByPredecrement(value: Rule): Self = StObject.set(x, "SpaceAfterSubtractWhenFollowedByPredecrement", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterSubtractWhenFollowedByUnaryMinus(value: Rule): Self = StObject.set(x, "SpaceAfterSubtractWhenFollowedByUnaryMinus", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterTryFinally(value: Rule): Self = StObject.set(x, "SpaceAfterTryFinally", value.asInstanceOf[js.Any])
    
    inline def setSpaceAfterVoidOperator(value: Rule): Self = StObject.set(x, "SpaceAfterVoidOperator", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeBinaryKeywordOperator(value: Rule): Self = StObject.set(x, "SpaceBeforeBinaryKeywordOperator", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeBinaryOperator(value: Rule): Self = StObject.set(x, "SpaceBeforeBinaryOperator", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeCertainTypeScriptKeywords(value: Rule): Self = StObject.set(x, "SpaceBeforeCertainTypeScriptKeywords", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeCloseBrace(value: Rule): Self = StObject.set(x, "SpaceBeforeCloseBrace", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeCloseParen(value: Rule): Self = StObject.set(x, "SpaceBeforeCloseParen", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeOpenBraceInControl(value: Rule): Self = StObject.set(x, "SpaceBeforeOpenBraceInControl", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeOpenBraceInFunction(value: Rule): Self = StObject.set(x, "SpaceBeforeOpenBraceInFunction", value.asInstanceOf[js.Any])
    
    inline def setSpaceBeforeOpenBraceInTypeScriptDeclWithBlock(value: Rule): Self = StObject.set(x, "SpaceBeforeOpenBraceInTypeScriptDeclWithBlock", value.asInstanceOf[js.Any])
    
    inline def setSpaceBetweenCloseBraceAndElse(value: Rule): Self = StObject.set(x, "SpaceBetweenCloseBraceAndElse", value.asInstanceOf[js.Any])
    
    inline def setSpaceBetweenCloseBraceAndWhile(value: Rule): Self = StObject.set(x, "SpaceBetweenCloseBraceAndWhile", value.asInstanceOf[js.Any])
    
    inline def setSpaceBetweenStatements(value: Rule): Self = StObject.set(x, "SpaceBetweenStatements", value.asInstanceOf[js.Any])
    
    inline def setTypeScriptOpenBraceLeftTokenRange(value: TokenRange): Self = StObject.set(x, "TypeScriptOpenBraceLeftTokenRange", value.asInstanceOf[js.Any])
  }
}
