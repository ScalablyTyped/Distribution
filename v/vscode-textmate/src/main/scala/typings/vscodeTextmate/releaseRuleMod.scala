package typings.vscodeTextmate

import typings.vscodeTextmate.releaseOnigLibMod.FindOption
import typings.vscodeTextmate.releaseOnigLibMod.IOnigCaptureIndex
import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import typings.vscodeTextmate.releaseOnigLibMod.OnigString
import typings.vscodeTextmate.releaseRawGrammarMod.ILocation
import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import typings.vscodeTextmate.releaseRawGrammarMod.IRawRepository
import typings.vscodeTextmate.releaseRawGrammarMod.IRawRule
import typings.vscodeTextmate.releaseUtilsMod.OrMask
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseRuleMod {
  
  @JSImport("vscode-textmate/release/rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/rule", "BeginEndRule")
  @js.native
  open class BeginEndRule protected () extends Rule {
    def this(
      $location: js.UndefOr[ILocation],
      id: RuleId,
      name: js.UndefOr[String | Null],
      contentName: js.UndefOr[String | Null],
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      end: js.UndefOr[String],
      endCaptures: js.Array[CaptureRule | Null],
      applyEndPatternLast: js.UndefOr[Boolean],
      patterns: ICompilePatternsResult
    ) = this()
    
    /* private */ val _begin: Any = js.native
    
    /* private */ var _cachedCompiledPatterns: Any = js.native
    
    /* private */ val _end: Any = js.native
    
    /* private */ var _getCachedCompiledPatterns: Any = js.native
    
    val applyEndPatternLast: Boolean = js.native
    
    val beginCaptures: js.Array[CaptureRule | Null] = js.native
    
    def debugBeginRegExp: String = js.native
    
    def debugEndRegExp: String = js.native
    
    val endCaptures: js.Array[CaptureRule | Null] = js.native
    
    val endHasBackReferences: Boolean = js.native
    
    def getEndWithResolvedBackReferences(lineText: String, captureIndices: js.Array[IOnigCaptureIndex]): String = js.native
    
    val hasMissingPatterns: Boolean = js.native
    
    val patterns: js.Array[RuleId] = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "BeginWhileRule")
  @js.native
  open class BeginWhileRule protected () extends Rule {
    def this(
      $location: Unit,
      id: RuleId,
      name: String,
      contentName: String,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: String,
      contentName: Null,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: String,
      contentName: Unit,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: Null,
      contentName: String,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: Null,
      contentName: Null,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: Null,
      contentName: Unit,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: Unit,
      contentName: String,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: Unit,
      contentName: Null,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: Unit,
      id: RuleId,
      name: Unit,
      contentName: Unit,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: String,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Null,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Unit,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: String,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: Null,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: Unit,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: String,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: Null,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: Unit,
      begin: String,
      beginCaptures: js.Array[CaptureRule | Null],
      _while: String,
      whileCaptures: js.Array[CaptureRule | Null],
      patterns: ICompilePatternsResult
    ) = this()
    
    /* private */ val _begin: Any = js.native
    
    /* private */ var _cachedCompiledPatterns: Any = js.native
    
    /* private */ var _cachedCompiledWhilePatterns: Any = js.native
    
    /* private */ var _getCachedCompiledPatterns: Any = js.native
    
    /* private */ var _getCachedCompiledWhilePatterns: Any = js.native
    
    /* private */ val _while: Any = js.native
    
    val beginCaptures: js.Array[CaptureRule | Null] = js.native
    
    def compileWhile(grammar: IRuleRegistry & IOnigLib): CompiledRule[RuleId | (/* -2 */ Double)] = js.native
    def compileWhile(grammar: IRuleRegistry & IOnigLib, endRegexSource: String): CompiledRule[RuleId | (/* -2 */ Double)] = js.native
    
    def compileWhileAG(grammar: IRuleRegistry & IOnigLib, endRegexSource: String, allowA: Boolean, allowG: Boolean): CompiledRule[RuleId | (/* -2 */ Double)] = js.native
    def compileWhileAG(grammar: IRuleRegistry & IOnigLib, endRegexSource: Null, allowA: Boolean, allowG: Boolean): CompiledRule[RuleId | (/* -2 */ Double)] = js.native
    
    def debugBeginRegExp: String = js.native
    
    def debugWhileRegExp: String = js.native
    
    def getWhileWithResolvedBackReferences(lineText: String, captureIndices: js.Array[IOnigCaptureIndex]): String = js.native
    
    val hasMissingPatterns: Boolean = js.native
    
    val patterns: js.Array[RuleId] = js.native
    
    val whileCaptures: js.Array[CaptureRule | Null] = js.native
    
    val whileHasBackReferences: Boolean = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "CaptureRule")
  @js.native
  open class CaptureRule protected () extends Rule {
    def this(
      $location: Unit,
      id: RuleId,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: String, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: Null, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: Null, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: Unit, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: Unit, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: String, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: String, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: Null, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: Null, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: Unit, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: Unit, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: String, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: String, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: Null, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: Null, retokenizeCapturedWithRuleId: `0`) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: Unit, retokenizeCapturedWithRuleId: RuleId) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: Unit, retokenizeCapturedWithRuleId: `0`) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this($location: ILocation, id: RuleId, name: Null, contentName: Null, retokenizeCapturedWithRuleId: `0`) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this($location: ILocation, id: RuleId, name: Null, contentName: Unit, retokenizeCapturedWithRuleId: `0`) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this($location: ILocation, id: RuleId, name: Unit, contentName: Null, retokenizeCapturedWithRuleId: `0`) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ) = this()
    def this($location: ILocation, id: RuleId, name: Unit, contentName: Unit, retokenizeCapturedWithRuleId: `0`) = this()
    
    val retokenizeCapturedWithRuleId: RuleId | `0` = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "CompiledRule")
  @js.native
  open class CompiledRule[TRuleId] protected () extends StObject {
    def this(onigLib: IOnigLib, regExps: js.Array[String], rules: js.Array[TRuleId]) = this()
    
    def dispose(): Unit = js.native
    
    def findNextMatchSync(string: String, startPosition: Double, options: OrMask[FindOption]): IFindNextMatchResult[TRuleId] | Null = js.native
    def findNextMatchSync(string: OnigString, startPosition: Double, options: OrMask[FindOption]): IFindNextMatchResult[TRuleId] | Null = js.native
    
    /* private */ val regExps: Any = js.native
    
    /* private */ val rules: Any = js.native
    
    /* private */ val scanner: Any = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "IncludeOnlyRule")
  @js.native
  open class IncludeOnlyRule protected () extends Rule {
    def this($location: Unit, id: RuleId, name: String, contentName: String, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: Null, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: Unit, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: String, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: Null, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: Unit, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: String, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: Null, patterns: ICompilePatternsResult) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: Unit, patterns: ICompilePatternsResult) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: String,
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Null,
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      contentName: Unit,
      patterns: ICompilePatternsResult
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Null,
      contentName: String,
      patterns: ICompilePatternsResult
    ) = this()
    def this($location: ILocation, id: RuleId, name: Null, contentName: Null, patterns: ICompilePatternsResult) = this()
    def this($location: ILocation, id: RuleId, name: Null, contentName: Unit, patterns: ICompilePatternsResult) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      contentName: String,
      patterns: ICompilePatternsResult
    ) = this()
    def this($location: ILocation, id: RuleId, name: Unit, contentName: Null, patterns: ICompilePatternsResult) = this()
    def this($location: ILocation, id: RuleId, name: Unit, contentName: Unit, patterns: ICompilePatternsResult) = this()
    
    /* private */ var _cachedCompiledPatterns: Any = js.native
    
    /* private */ var _getCachedCompiledPatterns: Any = js.native
    
    val hasMissingPatterns: Boolean = js.native
    
    val patterns: js.Array[RuleId] = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "MatchRule")
  @js.native
  open class MatchRule protected () extends Rule {
    def this($location: Unit, id: RuleId, name: String, `match`: String, captures: js.Array[CaptureRule | Null]) = this()
    def this($location: Unit, id: RuleId, name: Unit, `match`: String, captures: js.Array[CaptureRule | Null]) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: String,
      `match`: String,
      captures: js.Array[CaptureRule | Null]
    ) = this()
    def this(
      $location: ILocation,
      id: RuleId,
      name: Unit,
      `match`: String,
      captures: js.Array[CaptureRule | Null]
    ) = this()
    
    /* private */ var _cachedCompiledPatterns: Any = js.native
    
    /* private */ var _getCachedCompiledPatterns: Any = js.native
    
    /* private */ val _match: Any = js.native
    
    val captures: js.Array[CaptureRule | Null] = js.native
    
    def debugMatchRegExp: String = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "RegExpSource")
  @js.native
  open class RegExpSource[TRuleId] protected () extends StObject {
    def this(regExpSource: String, ruleId: TRuleId) = this()
    
    /* private */ var _anchorCache: Any = js.native
    
    /* private */ var _buildAnchorCache: Any = js.native
    
    var hasAnchor: Boolean = js.native
    
    val hasBackReferences: Boolean = js.native
    
    def resolveAnchors(allowA: Boolean, allowG: Boolean): String = js.native
    
    def resolveBackReferences(lineText: String, captureIndices: js.Array[IOnigCaptureIndex]): String = js.native
    
    val ruleId: TRuleId = js.native
    
    def setSource(newSource: String): Unit = js.native
    
    var source: String = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "RegExpSourceList")
  @js.native
  open class RegExpSourceList[TRuleId] () extends StObject {
    
    /* private */ var _anchorCache: Any = js.native
    
    /* private */ var _cached: Any = js.native
    
    /* private */ var _disposeCaches: Any = js.native
    
    /* private */ var _hasAnchors: Any = js.native
    
    /* private */ val _items: Any = js.native
    
    /* private */ var _resolveAnchors: Any = js.native
    
    def compile(onigLib: IOnigLib): CompiledRule[TRuleId] = js.native
    
    def compileAG(onigLib: IOnigLib, allowA: Boolean, allowG: Boolean): CompiledRule[TRuleId] = js.native
    
    def dispose(): Unit = js.native
    
    def length(): Double = js.native
    
    def push(item: RegExpSource[TRuleId]): Unit = js.native
    
    def setSource(index: Double, newSource: String): Unit = js.native
    
    def unshift(item: RegExpSource[TRuleId]): Unit = js.native
  }
  
  /* note: abstract class */ @JSImport("vscode-textmate/release/rule", "Rule")
  @js.native
  open class Rule protected () extends StObject {
    def this($location: Unit, id: RuleId) = this()
    def this($location: ILocation, id: RuleId) = this()
    def this($location: Unit, id: RuleId, name: String) = this()
    def this($location: ILocation, id: RuleId, name: String) = this()
    def this($location: Unit, id: RuleId, name: String, contentName: String) = this()
    def this($location: Unit, id: RuleId, name: Null, contentName: String) = this()
    def this($location: Unit, id: RuleId, name: Unit, contentName: String) = this()
    def this($location: ILocation, id: RuleId, name: String, contentName: String) = this()
    def this($location: ILocation, id: RuleId, name: Null, contentName: String) = this()
    def this($location: ILocation, id: RuleId, name: Unit, contentName: String) = this()
    
    @JSName("$location")
    val $location: js.UndefOr[ILocation] = js.native
    
    /* private */ val _contentName: Any = js.native
    
    /* private */ val _contentNameIsCapturing: Any = js.native
    
    /* private */ val _name: Any = js.native
    
    /* private */ val _nameIsCapturing: Any = js.native
    
    def collectPatterns(grammar: IRuleRegistry, out: RegExpSourceList[RuleId | (/* -1 */ Double)]): Unit = js.native
    
    def compile(grammar: IRuleRegistry & IOnigLib): CompiledRule[RuleId | (/* -1 */ Double)] = js.native
    def compile(grammar: IRuleRegistry & IOnigLib, endRegexSource: String): CompiledRule[RuleId | (/* -1 */ Double)] = js.native
    
    def compileAG(grammar: IRuleRegistry & IOnigLib, endRegexSource: String, allowA: Boolean, allowG: Boolean): CompiledRule[RuleId | (/* -1 */ Double)] = js.native
    def compileAG(grammar: IRuleRegistry & IOnigLib, endRegexSource: Null, allowA: Boolean, allowG: Boolean): CompiledRule[RuleId | (/* -1 */ Double)] = js.native
    
    def debugName: String = js.native
    
    def dispose(): Unit = js.native
    
    def getContentName(lineText: String, captureIndices: js.Array[IOnigCaptureIndex]): String | Null = js.native
    
    def getName(): String | Null = js.native
    def getName(lineText: String): String | Null = js.native
    def getName(lineText: String, captureIndices: js.Array[IOnigCaptureIndex]): String | Null = js.native
    def getName(lineText: Null, captureIndices: js.Array[IOnigCaptureIndex]): String | Null = js.native
    
    val id: RuleId = js.native
  }
  
  @JSImport("vscode-textmate/release/rule", "RuleFactory")
  @js.native
  open class RuleFactory () extends StObject
  /* static members */
  object RuleFactory {
    
    @JSImport("vscode-textmate/release/rule", "RuleFactory")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/rule", "RuleFactory._compileCaptures")
    @js.native
    def _compileCaptures: Any = js.native
    inline def _compileCaptures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_compileCaptures")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/rule", "RuleFactory._compilePatterns")
    @js.native
    def _compilePatterns: Any = js.native
    inline def _compilePatterns_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_compilePatterns")(x.asInstanceOf[js.Any])
    
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: String,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: String,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Null,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Null,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Null,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Unit,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Unit,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Unit,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: String,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: String,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Null,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Null,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Null,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Unit,
      contentName: String,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Unit,
      contentName: Null,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Unit,
      contentName: Unit,
      retokenizeCapturedWithRuleId: RuleId
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: String,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: String,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Null,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Null,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Null,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Unit,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Unit,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: Unit,
      name: Unit,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: String,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: String,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: String,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Null,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Null,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Null,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Unit,
      contentName: String,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Unit,
      contentName: Null,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    inline def createCaptureRule_0(
      helper: IRuleFactoryHelper,
      $location: ILocation,
      name: Unit,
      contentName: Unit,
      retokenizeCapturedWithRuleId: `0`
    ): CaptureRule = (^.asInstanceOf[js.Dynamic].applyDynamic("createCaptureRule")(helper.asInstanceOf[js.Any], $location.asInstanceOf[js.Any], name.asInstanceOf[js.Any], contentName.asInstanceOf[js.Any], retokenizeCapturedWithRuleId.asInstanceOf[js.Any])).asInstanceOf[CaptureRule]
    
    inline def getCompiledRuleId(desc: IRawRule, helper: IRuleFactoryHelper, repository: IRawRepository): RuleId = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompiledRuleId")(desc.asInstanceOf[js.Any], helper.asInstanceOf[js.Any], repository.asInstanceOf[js.Any])).asInstanceOf[RuleId]
  }
  
  @JSImport("vscode-textmate/release/rule", "endRuleId")
  @js.native
  val endRuleId: /* -1 */ Double = js.native
  
  inline def ruleIdFromNumber(id: Double): RuleId = ^.asInstanceOf[js.Dynamic].applyDynamic("ruleIdFromNumber")(id.asInstanceOf[js.Any]).asInstanceOf[RuleId]
  
  inline def ruleIdToNumber(id: RuleId): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("ruleIdToNumber")(id.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("vscode-textmate/release/rule", "whileRuleId")
  @js.native
  val whileRuleId: /* -2 */ Double = js.native
  
  trait ICompilePatternsResult extends StObject {
    
    val hasMissingPatterns: Boolean
    
    val patterns: js.Array[RuleId]
  }
  object ICompilePatternsResult {
    
    inline def apply(hasMissingPatterns: Boolean, patterns: js.Array[RuleId]): ICompilePatternsResult = {
      val __obj = js.Dynamic.literal(hasMissingPatterns = hasMissingPatterns.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICompilePatternsResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICompilePatternsResult] (val x: Self) extends AnyVal {
      
      inline def setHasMissingPatterns(value: Boolean): Self = StObject.set(x, "hasMissingPatterns", value.asInstanceOf[js.Any])
      
      inline def setPatterns(value: js.Array[RuleId]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: RuleId*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  trait IFindNextMatchResult[TRuleId] extends StObject {
    
    var captureIndices: js.Array[IOnigCaptureIndex]
    
    var ruleId: TRuleId
  }
  object IFindNextMatchResult {
    
    inline def apply[TRuleId](captureIndices: js.Array[IOnigCaptureIndex], ruleId: TRuleId): IFindNextMatchResult[TRuleId] = {
      val __obj = js.Dynamic.literal(captureIndices = captureIndices.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFindNextMatchResult[TRuleId]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFindNextMatchResult[?], TRuleId] (val x: Self & IFindNextMatchResult[TRuleId]) extends AnyVal {
      
      inline def setCaptureIndices(value: js.Array[IOnigCaptureIndex]): Self = StObject.set(x, "captureIndices", value.asInstanceOf[js.Any])
      
      inline def setCaptureIndicesVarargs(value: IOnigCaptureIndex*): Self = StObject.set(x, "captureIndices", js.Array(value*))
      
      inline def setRuleId(value: TRuleId): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IGrammarRegistry extends StObject {
    
    def getExternalGrammar(scopeName: String, repository: IRawRepository): js.UndefOr[IRawGrammar | Null]
  }
  object IGrammarRegistry {
    
    inline def apply(getExternalGrammar: (String, IRawRepository) => js.UndefOr[IRawGrammar | Null]): IGrammarRegistry = {
      val __obj = js.Dynamic.literal(getExternalGrammar = js.Any.fromFunction2(getExternalGrammar))
      __obj.asInstanceOf[IGrammarRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGrammarRegistry] (val x: Self) extends AnyVal {
      
      inline def setGetExternalGrammar(value: (String, IRawRepository) => js.UndefOr[IRawGrammar | Null]): Self = StObject.set(x, "getExternalGrammar", js.Any.fromFunction2(value))
    }
  }
  
  trait IRuleFactoryHelper
    extends StObject
       with IRuleRegistry
       with IGrammarRegistry
  object IRuleFactoryHelper {
    
    inline def apply(
      getExternalGrammar: (String, IRawRepository) => js.UndefOr[IRawGrammar | Null],
      getRule: RuleId => Rule,
      registerRule: js.Function1[/* id */ RuleId, Any] => Any
    ): IRuleFactoryHelper = {
      val __obj = js.Dynamic.literal(getExternalGrammar = js.Any.fromFunction2(getExternalGrammar), getRule = js.Any.fromFunction1(getRule), registerRule = js.Any.fromFunction1(registerRule))
      __obj.asInstanceOf[IRuleFactoryHelper]
    }
  }
  
  trait IRuleRegistry extends StObject {
    
    def getRule(ruleId: RuleId): Rule
    
    def registerRule[T /* <: Rule */](factory: js.Function1[/* id */ RuleId, T]): T
  }
  object IRuleRegistry {
    
    inline def apply(getRule: RuleId => Rule, registerRule: js.Function1[/* id */ RuleId, Any] => Any): IRuleRegistry = {
      val __obj = js.Dynamic.literal(getRule = js.Any.fromFunction1(getRule), registerRule = js.Any.fromFunction1(registerRule))
      __obj.asInstanceOf[IRuleRegistry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRuleRegistry] (val x: Self) extends AnyVal {
      
      inline def setGetRule(value: RuleId => Rule): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
      
      inline def setRegisterRule(value: js.Function1[/* id */ RuleId, Any] => Any): Self = StObject.set(x, "registerRule", js.Any.fromFunction1(value))
    }
  }
  
  trait RuleId extends StObject {
    
    var __brand: js.Symbol
  }
  object RuleId {
    
    inline def apply(__brand: js.Symbol): RuleId = {
      val __obj = js.Dynamic.literal(__brand = __brand.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleId] (val x: Self) extends AnyVal {
      
      inline def set__brand(value: js.Symbol): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
    }
  }
}
