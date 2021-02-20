package typings.tslint

import typings.tslint.ruleMod.IDisabledInterval
import typings.tslint.ruleMod.RuleFailure
import typings.typescript.mod.BinaryOperatorToken
import typings.typescript.mod.BindingElement
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Declaration
import typings.typescript.mod.Expression
import typings.typescript.mod.ModifierFlags
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.ModuleDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.ObjectFlags
import typings.typescript.mod.ObjectType
import typings.typescript.mod.SourceFile
import typings.typescript.mod.Symbol
import typings.typescript.mod.SymbolFlags
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.VariableDeclaration
import typings.typescript.mod.VariableStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("tslint/lib/language/utils", "ancestorWhere")
  @js.native
  def ancestorWhere[T /* <: Node */](node: Node, predicate: js.Function1[/* n */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
  
  @JSImport("tslint/lib/language/utils", "childOfKind")
  @js.native
  def childOfKind(node: Node, kind: SyntaxKind): js.UndefOr[Node] = js.native
  
  @JSImport("tslint/lib/language/utils", "doesIntersect")
  @js.native
  def doesIntersect(failure: RuleFailure, disabledIntervals: js.Array[IDisabledInterval]): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "forEachComment")
  @js.native
  def forEachComment(node: Node, cb: ForEachCommentCallback): Unit = js.native
  
  @JSImport("tslint/lib/language/utils", "forEachToken")
  @js.native
  def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback): Unit = js.native
  @JSImport("tslint/lib/language/utils", "forEachToken")
  @js.native
  def forEachToken(node: Node, skipTrivia: Boolean, cb: ForEachTokenCallback, filter: FilterCallback): Unit = js.native
  
  @JSImport("tslint/lib/language/utils", "getBindingElementVariableDeclaration")
  @js.native
  def getBindingElementVariableDeclaration(node: BindingElement): VariableDeclaration | Null = js.native
  
  @JSImport("tslint/lib/language/utils", "getEqualsKind")
  @js.native
  def getEqualsKind(node: BinaryOperatorToken): js.UndefOr[EqualsKind] = js.native
  
  @JSImport("tslint/lib/language/utils", "getSourceFile")
  @js.native
  def getSourceFile(fileName: String, source: String): SourceFile = js.native
  
  @JSImport("tslint/lib/language/utils", "hasCommentAfterPosition")
  @js.native
  def hasCommentAfterPosition(text: String, position: Double): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "hasModifier")
  @js.native
  def hasModifier(modifiers: js.UndefOr[scala.Nothing], modifierKinds: SyntaxKind*): Boolean = js.native
  @JSImport("tslint/lib/language/utils", "hasModifier")
  @js.native
  def hasModifier(modifiers: ModifiersArray, modifierKinds: SyntaxKind*): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isAssignment")
  @js.native
  def isAssignment(node: Node): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isBlockScopeBoundary")
  @js.native
  def isBlockScopeBoundary(node: Node): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isBlockScopedBindingElement")
  @js.native
  def isBlockScopedBindingElement(node: BindingElement): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isBlockScopedVariable")
  @js.native
  def isBlockScopedVariable(node: VariableDeclaration): Boolean = js.native
  @JSImport("tslint/lib/language/utils", "isBlockScopedVariable")
  @js.native
  def isBlockScopedVariable(node: VariableStatement): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isCombinedModifierFlagSet")
  @js.native
  def isCombinedModifierFlagSet(node: Declaration, flagToCheck: ModifierFlags): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isCombinedNodeFlagSet")
  @js.native
  def isCombinedNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isLoop")
  @js.native
  def isLoop(node: Node): /* is typescript.typescript.IterationStatement */ Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isNegativeNumberLiteral")
  @js.native
  def isNegativeNumberLiteral(node: Node): /* is tslint.anon.PrefixUnaryExpressionoper */ Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isNestedModuleDeclaration")
  @js.native
  def isNestedModuleDeclaration(decl: ModuleDeclaration): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isNodeFlagSet")
  @js.native
  def isNodeFlagSet(node: Node, flagToCheck: NodeFlags): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isNumeric")
  @js.native
  def isNumeric(node: Expression): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isObjectFlagSet")
  @js.native
  def isObjectFlagSet(objectType: ObjectType, flagToCheck: ObjectFlags): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isScopeBoundary")
  @js.native
  def isScopeBoundary(node: Node): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isStrictNullChecksEnabled")
  @js.native
  def isStrictNullChecksEnabled(options: CompilerOptions): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isSymbolFlagSet")
  @js.native
  def isSymbolFlagSet(symbol: Symbol, flagToCheck: SymbolFlags): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isTypeFlagSet")
  @js.native
  def isTypeFlagSet(`type`: Type, flagToCheck: TypeFlags): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "isWhiteSpace")
  @js.native
  def isWhiteSpace(ch: Double): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "someAncestor")
  @js.native
  def someAncestor(node: Node, predicate: js.Function1[/* n */ Node, Boolean]): Boolean = js.native
  
  @JSImport("tslint/lib/language/utils", "unwrapParentheses")
  @js.native
  def unwrapParentheses(node: Expression): Expression = js.native
  
  @js.native
  trait EqualsKind extends StObject {
    
    var isPositive: Boolean = js.native
    
    var isStrict: Boolean = js.native
  }
  object EqualsKind {
    
    @scala.inline
    def apply(isPositive: Boolean, isStrict: Boolean): EqualsKind = {
      val __obj = js.Dynamic.literal(isPositive = isPositive.asInstanceOf[js.Any], isStrict = isStrict.asInstanceOf[js.Any])
      __obj.asInstanceOf[EqualsKind]
    }
    
    @scala.inline
    implicit class EqualsKindMutableBuilder[Self <: EqualsKind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsPositive(value: Boolean): Self = StObject.set(x, "isPositive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterCallback = js.Function1[/* node */ Node, Boolean]
  
  type ForEachCommentCallback = js.Function3[/* fullText */ String, /* kind */ SyntaxKind, /* pos */ TokenPosition, Unit]
  
  type ForEachTokenCallback = js.Function4[
    /* fullText */ String, 
    /* kind */ SyntaxKind, 
    /* pos */ TokenPosition, 
    /* parent */ Node, 
    Unit
  ]
  
  @js.native
  trait TokenPosition extends StObject {
    
    /** The end of the token */
    var end: Double = js.native
    
    /** The start of the token including all trivia before it */
    var fullStart: Double = js.native
    
    /** The start of the token */
    var tokenStart: Double = js.native
  }
  object TokenPosition {
    
    @scala.inline
    def apply(end: Double, fullStart: Double, tokenStart: Double): TokenPosition = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fullStart = fullStart.asInstanceOf[js.Any], tokenStart = tokenStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenPosition]
    }
    
    @scala.inline
    implicit class TokenPositionMutableBuilder[Self <: TokenPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullStart(value: Double): Self = StObject.set(x, "fullStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenStart(value: Double): Self = StObject.set(x, "tokenStart", value.asInstanceOf[js.Any])
    }
  }
}
