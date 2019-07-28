package typings.tslint.libLanguageUtilsMod

import typings.tslint.libLanguageRuleRuleMod.IDisabledInterval
import typings.tslint.libLanguageRuleRuleMod.RuleFailure
import typings.typescript.typescriptMod.BinaryOperatorToken
import typings.typescript.typescriptMod.BindingElement
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Declaration
import typings.typescript.typescriptMod.Expression
import typings.typescript.typescriptMod.ModifierFlags
import typings.typescript.typescriptMod.ModifiersArray
import typings.typescript.typescriptMod.ModuleDeclaration
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NodeFlags
import typings.typescript.typescriptMod.ObjectFlags
import typings.typescript.typescriptMod.ObjectType
import typings.typescript.typescriptMod.SourceFile
import typings.typescript.typescriptMod.Symbol
import typings.typescript.typescriptMod.SymbolFlags
import typings.typescript.typescriptMod.SyntaxKind
import typings.typescript.typescriptMod.Type
import typings.typescript.typescriptMod.TypeFlags
import typings.typescript.typescriptMod.VariableDeclaration
import typings.typescript.typescriptMod.VariableStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ancestorWhere[T /* <: Node */](node: Node, predicate: js.Function1[/* n */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
  def childOfKind(node: Node, kind: SyntaxKind): js.UndefOr[Node] = js.native
  def doesIntersect(failure: RuleFailure, disabledIntervals: js.Array[IDisabledInterval]): Boolean = js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = js.native
  def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = js.native
  def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = js.native
  def getBindingElementVariableDeclaration(node: BindingElement): VariableDeclaration | Null = js.native
  def getEqualsKind(node: BinaryOperatorToken): js.UndefOr[EqualsKind] = js.native
  def getSourceFile(fileName: String, source: String): SourceFile = js.native
  def hasCommentAfterPosition(text: String, position: Double): Boolean = js.native
  def hasModifier(modifierKinds: SyntaxKind*): Boolean = js.native
  def hasModifier(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
  def isAssignment(node: Node): Boolean = js.native
  def isBlockScopeBoundary(node: Node): Boolean = js.native
  def isBlockScopedBindingElement(node: BindingElement): Boolean = js.native
  def isBlockScopedVariable(node: VariableDeclaration): Boolean = js.native
  def isBlockScopedVariable(node: VariableStatement): Boolean = js.native
  def isCombinedModifierFlagSet(node: Declaration, flagToCheck: ModifierFlags): Boolean = js.native
  def isCombinedNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = js.native
  def isLoop(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = js.native
  def isNegativeNumberLiteral(node: Node): Boolean = js.native
  def isNestedModuleDeclaration(decl: ModuleDeclaration): Boolean = js.native
  def isNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = js.native
  def isNumeric(node: Expression): Boolean = js.native
  def isObjectFlagSet(objectType: ObjectType, flagToCheck: ObjectFlags): Boolean = js.native
  def isScopeBoundary(node: Node): Boolean = js.native
  def isStrictNullChecksEnabled(options: CompilerOptions): Boolean = js.native
  def isSymbolFlagSet(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
  def isTypeFlagSet(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
  def isWhiteSpace(ch: Double): Boolean = js.native
  def someAncestor(node: Node, predicate: js.Function1[/* n */ Node, Boolean]): Boolean = js.native
  def unwrapParentheses(node: Expression): Expression = js.native
}

