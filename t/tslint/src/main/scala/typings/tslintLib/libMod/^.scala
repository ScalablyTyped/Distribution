package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ENABLE_DISABLE_REGEX: stdLib.RegExp = js.native
  def ancestorWhere[T /* <: typescriptLib.typescriptMod.Node */](
    node: typescriptLib.typescriptMod.Node,
    predicate: js.Function1[/* n */ typescriptLib.typescriptMod.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  def childOfKind(node: typescriptLib.typescriptMod.Node, kind: typescriptLib.typescriptMod.SyntaxKind): js.UndefOr[typescriptLib.typescriptMod.Node] = js.native
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
  def forEachComment(node: typescriptLib.typescriptMod.Node, cb: tslintLib.libLanguageUtilsMod.ForEachCommentCallback): scala.Unit = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.Node,
    skipTrivia: scala.Boolean,
    cb: tslintLib.libLanguageUtilsMod.ForEachTokenCallback
  ): scala.Unit = js.native
  def forEachToken(
    node: typescriptLib.typescriptMod.Node,
    skipTrivia: scala.Boolean,
    cb: tslintLib.libLanguageUtilsMod.ForEachTokenCallback,
    filter: tslintLib.libLanguageUtilsMod.FilterCallback
  ): scala.Unit = js.native
  def getBindingElementVariableDeclaration(node: typescriptLib.typescriptMod.BindingElement): typescriptLib.typescriptMod.VariableDeclaration | scala.Null = js.native
  def getEqualsKind(node: typescriptLib.typescriptMod.BinaryOperatorToken): js.UndefOr[tslintLib.libLanguageUtilsMod.EqualsKind] = js.native
  def getSourceFile(fileName: java.lang.String, source: java.lang.String): typescriptLib.typescriptMod.SourceFile = js.native
  def hasCommentAfterPosition(text: java.lang.String, position: scala.Double): scala.Boolean = js.native
  def hasModifier(modifierKinds: typescriptLib.typescriptMod.SyntaxKind*): scala.Boolean = js.native
  def hasModifier(
    modifiers: typescriptLib.typescriptMod.ModifiersArray,
    modifierKinds: typescriptLib.typescriptMod.SyntaxKind*
  ): scala.Boolean = js.native
  def isAssignment(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isBlockScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isBlockScopedBindingElement(node: typescriptLib.typescriptMod.BindingElement): scala.Boolean = js.native
  def isBlockScopedVariable(node: typescriptLib.typescriptMod.VariableDeclaration): scala.Boolean = js.native
  def isBlockScopedVariable(node: typescriptLib.typescriptMod.VariableStatement): scala.Boolean = js.native
  def isCombinedModifierFlagSet(
    node: typescriptLib.typescriptMod.Declaration,
    flagToCheck: typescriptLib.typescriptMod.ModifierFlags
  ): scala.Boolean = js.native
  def isCombinedNodeFlagSet(node: typescriptLib.typescriptMod.Node, flagToCheck: typescriptLib.typescriptMod.NodeFlags): scala.Boolean = js.native
  def isLoop(node: typescriptLib.typescriptMod.Node): /* is typescript.typescript.IterationStatement */ scala.Boolean = js.native
  def isNegativeNumberLiteral(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isNestedModuleDeclaration(decl: typescriptLib.typescriptMod.ModuleDeclaration): scala.Boolean = js.native
  def isNodeFlagSet(node: typescriptLib.typescriptMod.Node, flagToCheck: typescriptLib.typescriptMod.NodeFlags): scala.Boolean = js.native
  def isNumeric(node: typescriptLib.typescriptMod.Expression): scala.Boolean = js.native
  def isObjectFlagSet(
    objectType: typescriptLib.typescriptMod.ObjectType,
    flagToCheck: typescriptLib.typescriptMod.ObjectFlags
  ): scala.Boolean = js.native
  def isScopeBoundary(node: typescriptLib.typescriptMod.Node): scala.Boolean = js.native
  def isStrictNullChecksEnabled(options: typescriptLib.typescriptMod.CompilerOptions): scala.Boolean = js.native
  def isSymbolFlagSet(symbol: typescriptLib.typescriptMod.Symbol, flagToCheck: typescriptLib.typescriptMod.SymbolFlags): scala.Boolean = js.native
  def isTypeFlagSet(`type`: typescriptLib.typescriptMod.Type, flagToCheck: typescriptLib.typescriptMod.TypeFlags): scala.Boolean = js.native
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
    sourceFile: typescriptLib.typescriptMod.SourceFile,
    failures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure] = js.native
  def someAncestor(
    node: typescriptLib.typescriptMod.Node,
    predicate: js.Function1[/* n */ typescriptLib.typescriptMod.Node, scala.Boolean]
  ): scala.Boolean = js.native
  def unwrapParentheses(node: typescriptLib.typescriptMod.Expression): typescriptLib.typescriptMod.Expression = js.native
}

