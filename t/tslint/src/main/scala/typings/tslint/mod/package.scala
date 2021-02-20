package typings.tslint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def ENABLE_DISABLE_REGEX: typings.std.RegExp = typings.tslint.mod.^.asInstanceOf[js.Dynamic].selectDynamic("ENABLE_DISABLE_REGEX").asInstanceOf[typings.std.RegExp]
  
  @scala.inline
  def ancestorWhere[T /* <: typings.typescript.mod.Node */](
    node: typings.typescript.mod.Node,
    predicate: js.Function1[/* n */ typings.typescript.mod.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ancestorWhere")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def childOfKind(node: typings.typescript.mod.Node, kind: typings.typescript.mod.SyntaxKind): js.UndefOr[typings.typescript.mod.Node] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("childOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.typescript.mod.Node]]
  
  @scala.inline
  def doesIntersect(
    failure: typings.tslint.ruleMod.RuleFailure,
    disabledIntervals: js.Array[typings.tslint.ruleMod.IDisabledInterval]
  ): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("doesIntersect")(failure.asInstanceOf[js.Any], disabledIntervals.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def findFormatter(name: java.lang.String): js.UndefOr[typings.tslint.formatterMod.FormatterConstructor] = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.tslint.formatterMod.FormatterConstructor]]
  @scala.inline
  def findFormatter(name: java.lang.String, formattersDirectory: java.lang.String): js.UndefOr[typings.tslint.formatterMod.FormatterConstructor] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tslint.formatterMod.FormatterConstructor]]
  @scala.inline
  def findFormatter(name: typings.tslint.formatterMod.FormatterConstructor): js.UndefOr[typings.tslint.formatterMod.FormatterConstructor] = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.tslint.formatterMod.FormatterConstructor]]
  @scala.inline
  def findFormatter(name: typings.tslint.formatterMod.FormatterConstructor, formattersDirectory: java.lang.String): js.UndefOr[typings.tslint.formatterMod.FormatterConstructor] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findFormatter")(name.asInstanceOf[js.Any], formattersDirectory.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tslint.formatterMod.FormatterConstructor]]
  
  @scala.inline
  def findRule(name: java.lang.String): js.UndefOr[typings.tslint.ruleMod.RuleConstructor] = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.tslint.ruleMod.RuleConstructor]]
  @scala.inline
  def findRule(name: java.lang.String, rulesDirectories: java.lang.String): js.UndefOr[typings.tslint.ruleMod.RuleConstructor] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tslint.ruleMod.RuleConstructor]]
  @scala.inline
  def findRule(name: java.lang.String, rulesDirectories: js.Array[java.lang.String]): js.UndefOr[typings.tslint.ruleMod.RuleConstructor] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("findRule")(name.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.tslint.ruleMod.RuleConstructor]]
  
  @scala.inline
  def forEachComment(node: typings.typescript.mod.Node, cb: typings.tslint.utilsMod.ForEachCommentCallback): scala.Unit = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachComment")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def forEachToken(
    node: typings.typescript.mod.Node,
    skipTrivia: scala.Boolean,
    cb: typings.tslint.utilsMod.ForEachTokenCallback
  ): scala.Unit = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def forEachToken(
    node: typings.typescript.mod.Node,
    skipTrivia: scala.Boolean,
    cb: typings.tslint.utilsMod.ForEachTokenCallback,
    filter: typings.tslint.utilsMod.FilterCallback
  ): scala.Unit = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forEachToken")(node.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getBindingElementVariableDeclaration(node: typings.typescript.mod.BindingElement): typings.typescript.mod.VariableDeclaration | scala.Null = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getBindingElementVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[typings.typescript.mod.VariableDeclaration | scala.Null]
  
  @scala.inline
  def getEqualsKind(node: typings.typescript.mod.BinaryOperatorToken): js.UndefOr[typings.tslint.utilsMod.EqualsKind] = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getEqualsKind")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.tslint.utilsMod.EqualsKind]]
  
  @scala.inline
  def getSourceFile(fileName: java.lang.String, source: java.lang.String): typings.typescript.mod.SourceFile = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSourceFile")(fileName.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[typings.typescript.mod.SourceFile]
  
  @scala.inline
  def hasCommentAfterPosition(text: java.lang.String, position: scala.Double): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasCommentAfterPosition")(text.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def hasModifier(modifiers: js.UndefOr[scala.Nothing], modifierKinds: typings.typescript.mod.SyntaxKind*): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], modifierKinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def hasModifier(
    modifiers: typings.typescript.mod.ModifiersArray,
    modifierKinds: typings.typescript.mod.SyntaxKind*
  ): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(modifiers.asInstanceOf[js.Any], modifierKinds.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isAssignment(node: typings.typescript.mod.Node): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopeBoundary(node: typings.typescript.mod.Node): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopedBindingElement(node: typings.typescript.mod.BindingElement): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isBlockScopedVariable(node: typings.typescript.mod.VariableDeclaration): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isBlockScopedVariable(node: typings.typescript.mod.VariableStatement): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isBlockScopedVariable")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCombinedModifierFlagSet(node: typings.typescript.mod.Declaration, flagToCheck: typings.typescript.mod.ModifierFlags): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedModifierFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isCombinedNodeFlagSet(node: typings.typescript.mod.Node, flagToCheck: typings.typescript.mod.NodeFlags): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCombinedNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isLoop(node: typings.typescript.mod.Node): /* is typescript.typescript.IterationStatement */ scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isLoop")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IterationStatement */ scala.Boolean]
  
  @scala.inline
  def isNegativeNumberLiteral(node: typings.typescript.mod.Node): /* is tslint.anon.PrefixUnaryExpressionoper */ scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNegativeNumberLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.anon.PrefixUnaryExpressionoper */ scala.Boolean]
  
  @scala.inline
  def isNestedModuleDeclaration(decl: typings.typescript.mod.ModuleDeclaration): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNestedModuleDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNodeFlagSet(node: typings.typescript.mod.Node, flagToCheck: typings.typescript.mod.NodeFlags): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNodeFlagSet")(node.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isNumeric(node: typings.typescript.mod.Expression): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isObjectFlagSet(objectType: typings.typescript.mod.ObjectType, flagToCheck: typings.typescript.mod.ObjectFlags): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObjectFlagSet")(objectType.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isScopeBoundary(node: typings.typescript.mod.Node): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isScopeBoundary")(node.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isStrictNullChecksEnabled(options: typings.typescript.mod.CompilerOptions): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStrictNullChecksEnabled")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isSymbolFlagSet(symbol: typings.typescript.mod.Symbol, flagToCheck: typings.typescript.mod.SymbolFlags): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isSymbolFlagSet")(symbol.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypeFlagSet(`type`: typings.typescript.mod.Type, flagToCheck: typings.typescript.mod.TypeFlags): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypeFlagSet")(`type`.asInstanceOf[js.Any], flagToCheck.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isTypedRule(rule: typings.tslint.ruleMod.IRule): /* is tslint.tslint/lib/language/rule/rule.ITypedRule */ scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isTypedRule")(rule.asInstanceOf[js.Any]).asInstanceOf[/* is tslint.tslint/lib/language/rule/rule.ITypedRule */ scala.Boolean]
  
  @scala.inline
  def isWhiteSpace(ch: scala.Double): scala.Boolean = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpace")(ch.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def loadRules(ruleOptionsList: js.Array[typings.tslint.ruleMod.IOptions]): js.Array[typings.tslint.ruleMod.IRule] = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typings.tslint.ruleMod.IOptions],
    rulesDirectories: js.UndefOr[scala.Nothing],
    isJs: scala.Boolean
  ): js.Array[typings.tslint.ruleMod.IRule] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(ruleOptionsList: js.Array[typings.tslint.ruleMod.IOptions], rulesDirectories: java.lang.String): js.Array[typings.tslint.ruleMod.IRule] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typings.tslint.ruleMod.IOptions],
    rulesDirectories: java.lang.String,
    isJs: scala.Boolean
  ): js.Array[typings.tslint.ruleMod.IRule] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typings.tslint.ruleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String]
  ): js.Array[typings.tslint.ruleMod.IRule] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tslint.ruleMod.IRule]]
  @scala.inline
  def loadRules(
    ruleOptionsList: js.Array[typings.tslint.ruleMod.IOptions],
    rulesDirectories: js.Array[java.lang.String],
    isJs: scala.Boolean
  ): js.Array[typings.tslint.ruleMod.IRule] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadRules")(ruleOptionsList.asInstanceOf[js.Any], rulesDirectories.asInstanceOf[js.Any], isJs.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tslint.ruleMod.IRule]]
  
  @scala.inline
  def removeDisabledFailures(
    sourceFile: typings.typescript.mod.SourceFile,
    failures: js.Array[typings.tslint.ruleMod.RuleFailure]
  ): js.Array[typings.tslint.ruleMod.RuleFailure] = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeDisabledFailures")(sourceFile.asInstanceOf[js.Any], failures.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.tslint.ruleMod.RuleFailure]]
  
  @scala.inline
  def someAncestor(
    node: typings.typescript.mod.Node,
    predicate: js.Function1[/* n */ typings.typescript.mod.Node, scala.Boolean]
  ): scala.Boolean = (typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("someAncestor")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def unwrapParentheses(node: typings.typescript.mod.Expression): typings.typescript.mod.Expression = typings.tslint.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapParentheses")(node.asInstanceOf[js.Any]).asInstanceOf[typings.typescript.mod.Expression]
}
