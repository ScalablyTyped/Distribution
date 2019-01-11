package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ENABLE_DISABLE_REGEX: stdLib.RegExp = js.native
  def ancestorWhere[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: typescriptLib.typescriptMod.tsNs.Node,
    predicate: js.Function1[/* n */ typescriptLib.typescriptMod.tsNs.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  def childOfKind(node: typescriptLib.typescriptMod.tsNs.Node, kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def doesIntersect(
    failure: tslintLib.libLanguageRuleRuleMod.RuleFailure,
    disabledIntervals: js.Array[tslintLib.libLanguageRuleRuleMod.IDisabledInterval]
  ): scala.Boolean = js.native
  def findFormatter(name: java.lang.String): js.UndefOr[tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor] = js.native
  def findFormatter(name: java.lang.String, formattersDirectory: java.lang.String): js.UndefOr[tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor] = js.native
  def findFormatter(name: tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor): js.UndefOr[tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor] = js.native
  def findFormatter(
    name: tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor,
    formattersDirectory: java.lang.String
  ): js.UndefOr[tslintLib.libLanguageFormatterFormatterMod.FormatterConstructor] = js.native
  def findRule(name: java.lang.String): js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleConstructor] = js.native
  def findRule(name: java.lang.String, rulesDirectories: java.lang.String): js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleConstructor] = js.native
  def findRule(name: java.lang.String, rulesDirectories: js.Array[java.lang.String]): js.UndefOr[tslintLib.libLanguageRuleRuleMod.RuleConstructor] = js.native
  def forEachComment(
    node: typescriptLib.typescriptMod.tsNs.Node,
    cb: tslintLib.libLanguageUtilsMod.ForEachCommentCallback
  ): scala.Unit = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.tsNs.Node,
    skipTrivia: scala.Boolean,
    cb: tslintLib.libLanguageUtilsMod.ForEachTokenCallback
  ): scala.Unit = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.tsNs.Node,
    skipTrivia: scala.Boolean,
    cb: tslintLib.libLanguageUtilsMod.ForEachTokenCallback,
    filter: tslintLib.libLanguageUtilsMod.FilterCallback
  ): scala.Unit = js.native
  def getBindingElementVariableDeclaration(node: typescriptLib.typescriptMod.tsNs.BindingElement): typescriptLib.typescriptMod.tsNs.VariableDeclaration | scala.Null = js.native
  def getEqualsKind(node: typescriptLib.typescriptMod.tsNs.BinaryOperatorToken): js.UndefOr[tslintLib.libLanguageUtilsMod.EqualsKind] = js.native
  def getSourceFile(fileName: java.lang.String, source: java.lang.String): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def hasCommentAfterPosition(text: java.lang.String, position: scala.Double): scala.Boolean = js.native
  def hasModifier(modifierKinds: typescriptLib.typescriptMod.tsNs.SyntaxKind*): scala.Boolean = js.native
  def hasModifier(
    modifiers: typescriptLib.typescriptMod.tsNs.ModifiersArray,
    modifierKinds: typescriptLib.typescriptMod.tsNs.SyntaxKind*
  ): scala.Boolean = js.native
  def isAssignment(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isBlockScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isBlockScopedBindingElement(node: typescriptLib.typescriptMod.tsNs.BindingElement): scala.Boolean = js.native
  def isBlockScopedVariable(node: typescriptLib.typescriptMod.tsNs.VariableDeclaration): scala.Boolean = js.native
  def isBlockScopedVariable(node: typescriptLib.typescriptMod.tsNs.VariableStatement): scala.Boolean = js.native
  def isCombinedModifierFlagSet(
    node: typescriptLib.typescriptMod.tsNs.Declaration,
    flagToCheck: typescriptLib.typescriptMod.tsNs.ModifierFlags
  ): scala.Boolean = js.native
  def isCombinedNodeFlagSet(
    node: typescriptLib.typescriptMod.tsNs.Node,
    flagToCheck: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): scala.Boolean = js.native
  def isLoop(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IterationStatement */ scala.Boolean = js.native
  def isNegativeNumberLiteral(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isNestedModuleDeclaration(decl: typescriptLib.typescriptMod.tsNs.ModuleDeclaration): scala.Boolean = js.native
  def isNodeFlagSet(
    node: typescriptLib.typescriptMod.tsNs.Node,
    flagToCheck: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): scala.Boolean = js.native
  def isNumeric(node: typescriptLib.typescriptMod.tsNs.Expression): scala.Boolean = js.native
  def isObjectFlagSet(
    objectType: typescriptLib.typescriptMod.tsNs.ObjectType,
    flagToCheck: typescriptLib.typescriptMod.tsNs.ObjectFlags
  ): scala.Boolean = js.native
  def isScopeBoundary(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isStrictNullChecksEnabled(options: typescriptLib.typescriptMod.tsNs.CompilerOptions): scala.Boolean = js.native
  def isSymbolFlagSet(
    symbol: typescriptLib.typescriptMod.tsNs.Symbol,
    flagToCheck: typescriptLib.typescriptMod.tsNs.SymbolFlags
  ): scala.Boolean = js.native
  def isTypeFlagSet(
    `type`: typescriptLib.typescriptMod.tsNs.Type,
    flagToCheck: typescriptLib.typescriptMod.tsNs.TypeFlags
  ): scala.Boolean = js.native
  def isTypedRule(rule: tslintLib.libLanguageRuleRuleMod.IRule): /* is tslint.tslint/lib/language/rule/rule.ITypedRule */ scala.Boolean = js.native
  def isWhiteSpace(ch: scala.Double): scala.Boolean = js.native
  def loadRules(ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions]): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: java.lang.String
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: java.lang.String,
    isJs: scala.Boolean
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def loadRules(
    ruleOptionsList: js.Array[tslintLib.libLanguageRuleRuleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String],
    isJs: scala.Boolean
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IRule] = js.native
  def removeDisabledFailures(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  def someAncestor(
    node: typescriptLib.typescriptMod.tsNs.Node,
    predicate: js.Function1[/* n */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): scala.Boolean = js.native
  def unwrapParentheses(node: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.Expression = js.native
}

