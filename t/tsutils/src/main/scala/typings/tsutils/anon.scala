package typings.tsutils

import typings.tsutils.utilUtilMod._ImportLike
import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.AssertClause
import typings.typescript.mod.BaseType
import typings.typescript.mod.BindingName
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.CatchClause
import typings.typescript.mod.DestructuringPattern
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.ExclamationToken
import typings.typescript.mod.Expression
import typings.typescript.mod.GenericType
import typings.typescript.mod.Identifier
import typings.typescript.mod.LeftHandSideExpression
import typings.typescript.mod.Modifier
import typings.typescript.mod.ModifierLike
import typings.typescript.mod.ModuleBlock
import typings.typescript.mod.ModuleReference
import typings.typescript.mod.NamedExportBindings
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.NumericLiteral
import typings.typescript.mod.ObjectFlags
import typings.typescript.mod.PropertyName
import typings.typescript.mod.QuestionDotToken
import typings.typescript.mod.Signature
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SourceFileLike
import typings.typescript.mod.StringLiteral
import typings.typescript.mod.Symbol
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.SyntaxKind.BindingElement
import typings.typescript.mod.SyntaxKind.CallExpression
import typings.typescript.mod.SyntaxKind.ExportDeclaration
import typings.typescript.mod.SyntaxKind.ExpressionStatement
import typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration
import typings.typescript.mod.SyntaxKind.VariableDeclaration
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeReferenceNode
import typings.typescript.mod.VariableDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined typescript.typescript.BindingElement & {  name :typescript.typescript.Identifier} */
  @js.native
  trait BindingElementnameIdentif extends StObject {
    
    var _declarationBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val dotDotDotToken: js.UndefOr[DotDotDotToken] = js.native
    
    val end: Double = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val initializer: js.UndefOr[Expression] = js.native
    
    val kind: BindingElement = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val name: BindingName = js.native
    
    val parent: BindingPattern = js.native
    
    val pos: Double = js.native
    
    val propertyName: js.UndefOr[PropertyName] = js.native
  }
  
  trait Body extends StObject
  
  /* Inlined typescript.typescript.CallExpression & {  expression :typescript.typescript.Token<typescript.typescript.SyntaxKind.ImportKeyword> | typescript.typescript.Identifier & {  text :'require'},   arguments :[typescript.typescript.Expression, ...std.Array<typescript.typescript.Expression>]} */
  @js.native
  trait CallExpressionexpressionT
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: Any = js.native
    
    var _expressionBrand: Any = js.native
    
    var _leftHandSideExpressionBrand: Any = js.native
    
    var _unaryExpressionBrand: Any = js.native
    
    var _updateExpressionBrand: Any = js.native
    
    val arguments: NodeArray[Expression] = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val expression: LeftHandSideExpression = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: CallExpression = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val questionDotToken: js.UndefOr[QuestionDotToken] = js.native
    
    val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
  }
  
  /* Inlined typescript.typescript.ExportDeclaration & {  moduleSpecifier :{}} */
  @js.native
  trait ExportDeclarationmoduleSp
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: Any = js.native
    
    var _statementBrand: Any = js.native
    
    val assertClause: js.UndefOr[AssertClause] = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    /** Will not be assigned in the case of `export * from "foo";` */
    val exportClause: js.UndefOr[NamedExportBindings] = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val isTypeOnly: Boolean = js.native
    
    val kind: ExportDeclaration = js.native
    
    val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
    
    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: js.UndefOr[Expression] = js.native
    
    val name: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.ExpressionStatement & {  expression :typescript.typescript.CallExpression} */
  @js.native
  trait ExpressionStatementexpres extends StObject {
    
    var _statementBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val expression: Expression = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: ExpressionStatement = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'Symbol',   escapedText :'symbol'} */
  @js.native
  trait IdentifiertextSymbolescap extends StObject {
    
    var _declarationBrand: Any = js.native
    
    var _expressionBrand: Any = js.native
    
    var _leftHandSideExpressionBrand: Any = js.native
    
    var _memberExpressionBrand: Any = js.native
    
    var _primaryExpressionBrand: Any = js.native
    
    var _unaryExpressionBrand: Any = js.native
    
    var _updateExpressionBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typings.typescript.mod.String = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
    
    val kind: typings.typescript.mod.SyntaxKind.Identifier = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'require'} */
  @js.native
  trait Identifiertextrequire extends StObject {
    
    var _declarationBrand: Any = js.native
    
    var _expressionBrand: Any = js.native
    
    var _leftHandSideExpressionBrand: Any = js.native
    
    var _memberExpressionBrand: Any = js.native
    
    var _primaryExpressionBrand: Any = js.native
    
    var _unaryExpressionBrand: Any = js.native
    
    var _updateExpressionBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typings.typescript.mod.String = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    var isInJSDocNamespace: js.UndefOr[Boolean] = js.native
    
    val kind: typings.typescript.mod.SyntaxKind.Identifier = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String = js.native
  }
  
  /* Inlined typescript.typescript.ImportEqualsDeclaration & {  moduleReference :typescript.typescript.ExternalModuleReference} */
  @js.native
  trait ImportEqualsDeclarationmo
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: Any = js.native
    
    var _statementBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val isTypeOnly: Boolean = js.native
    
    val kind: ImportEqualsDeclaration = js.native
    
    val modifiers: js.UndefOr[NodeArray[Modifier]] = js.native
    
    val moduleReference: ModuleReference = js.native
    
    val name: Identifier = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.TypeReference & {  target :typescript.typescript.TupleType} */
  trait TypeReferencetargetTupleT extends StObject {
    
    var aliasSymbol: js.UndefOr[Symbol] = js.undefined
    
    var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
    
    var flags: TypeFlags
    
    def getApparentProperties(): js.Array[Symbol]
    
    def getBaseTypes(): js.UndefOr[js.Array[BaseType]]
    
    def getCallSignatures(): js.Array[Signature]
    
    def getConstraint(): js.UndefOr[Type]
    
    def getConstructSignatures(): js.Array[Signature]
    
    def getDefault(): js.UndefOr[Type]
    
    def getFlags(): TypeFlags
    
    def getNonNullableType(): Type
    
    def getNumberIndexType(): js.UndefOr[Type]
    
    def getProperties(): js.Array[Symbol]
    
    def getProperty(propertyName: String): js.UndefOr[Symbol]
    
    def getStringIndexType(): js.UndefOr[Type]
    
    def getSymbol(): js.UndefOr[Symbol]
    
    def isClass(): /* is typescript.typescript.InterfaceType */ Boolean
    
    def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean
    
    def isIndexType(): /* is typescript.typescript.IndexType */ Boolean
    
    def isIntersection(): /* is typescript.typescript.IntersectionType */ Boolean
    
    def isLiteral(): /* is typescript.typescript.LiteralType */ Boolean
    
    def isNumberLiteral(): /* is typescript.typescript.NumberLiteralType */ Boolean
    
    def isStringLiteral(): /* is typescript.typescript.StringLiteralType */ Boolean
    
    def isTypeParameter(): /* is typescript.typescript.TypeParameter */ Boolean
    
    def isUnion(): /* is typescript.typescript.UnionType */ Boolean
    
    def isUnionOrIntersection(): /* is typescript.typescript.UnionOrIntersectionType */ Boolean
    
    var node: js.UndefOr[TypeReferenceNode | ArrayTypeNode | TupleTypeNode] = js.undefined
    
    var objectFlags: ObjectFlags
    
    var pattern: js.UndefOr[DestructuringPattern] = js.undefined
    
    var symbol: Symbol
    
    var target: GenericType
    
    var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  }
  object TypeReferencetargetTupleT {
    
    inline def apply(
      flags: TypeFlags,
      getApparentProperties: () => js.Array[Symbol],
      getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
      getCallSignatures: () => js.Array[Signature],
      getConstraint: () => js.UndefOr[Type],
      getConstructSignatures: () => js.Array[Signature],
      getDefault: () => js.UndefOr[Type],
      getFlags: () => TypeFlags,
      getNonNullableType: () => Type,
      getNumberIndexType: () => js.UndefOr[Type],
      getProperties: () => js.Array[Symbol],
      getProperty: String => js.UndefOr[Symbol],
      getStringIndexType: () => js.UndefOr[Type],
      getSymbol: () => js.UndefOr[Symbol],
      isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
      isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
      isIndexType: () => /* is typescript.typescript.IndexType */ Boolean,
      isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
      isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
      isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
      isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
      isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
      isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
      isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
      objectFlags: ObjectFlags,
      symbol: Symbol,
      target: GenericType
    ): TypeReferencetargetTupleT = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeReferencetargetTupleT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeReferencetargetTupleT] (val x: Self) extends AnyVal {
      
      inline def setAliasSymbol(value: Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
      
      inline def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
      
      inline def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
      
      inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
      
      inline def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value*))
      
      inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setGetApparentProperties(value: () => js.Array[Symbol]): Self = StObject.set(x, "getApparentProperties", js.Any.fromFunction0(value))
      
      inline def setGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
      
      inline def setGetCallSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getCallSignatures", js.Any.fromFunction0(value))
      
      inline def setGetConstraint(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
      
      inline def setGetConstructSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getConstructSignatures", js.Any.fromFunction0(value))
      
      inline def setGetDefault(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      inline def setGetFlags(value: () => TypeFlags): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
      
      inline def setGetNonNullableType(value: () => Type): Self = StObject.set(x, "getNonNullableType", js.Any.fromFunction0(value))
      
      inline def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getNumberIndexType", js.Any.fromFunction0(value))
      
      inline def setGetProperties(value: () => js.Array[Symbol]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
      
      inline def setGetProperty(value: String => js.UndefOr[Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
      
      inline def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getStringIndexType", js.Any.fromFunction0(value))
      
      inline def setGetSymbol(value: () => js.UndefOr[Symbol]): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
      
      inline def setIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction0(value))
      
      inline def setIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClassOrInterface", js.Any.fromFunction0(value))
      
      inline def setIsIndexType(value: () => /* is typescript.typescript.IndexType */ Boolean): Self = StObject.set(x, "isIndexType", js.Any.fromFunction0(value))
      
      inline def setIsIntersection(value: () => /* is typescript.typescript.IntersectionType */ Boolean): Self = StObject.set(x, "isIntersection", js.Any.fromFunction0(value))
      
      inline def setIsLiteral(value: () => /* is typescript.typescript.LiteralType */ Boolean): Self = StObject.set(x, "isLiteral", js.Any.fromFunction0(value))
      
      inline def setIsNumberLiteral(value: () => /* is typescript.typescript.NumberLiteralType */ Boolean): Self = StObject.set(x, "isNumberLiteral", js.Any.fromFunction0(value))
      
      inline def setIsStringLiteral(value: () => /* is typescript.typescript.StringLiteralType */ Boolean): Self = StObject.set(x, "isStringLiteral", js.Any.fromFunction0(value))
      
      inline def setIsTypeParameter(value: () => /* is typescript.typescript.TypeParameter */ Boolean): Self = StObject.set(x, "isTypeParameter", js.Any.fromFunction0(value))
      
      inline def setIsUnion(value: () => /* is typescript.typescript.UnionType */ Boolean): Self = StObject.set(x, "isUnion", js.Any.fromFunction0(value))
      
      inline def setIsUnionOrIntersection(value: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean): Self = StObject.set(x, "isUnionOrIntersection", js.Any.fromFunction0(value))
      
      inline def setNode(value: TypeReferenceNode | ArrayTypeNode | TupleTypeNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setObjectFlags(value: ObjectFlags): Self = StObject.set(x, "objectFlags", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: DestructuringPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: GenericType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
      
      inline def setTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "typeArguments", js.Array(value*))
    }
  }
  
  /* Inlined typescript.typescript.VariableDeclaration & {  name :typescript.typescript.Identifier} */
  @js.native
  trait VariableDeclarationnameId extends StObject {
    
    var _declarationBrand: Any = js.native
    
    /**
      * @deprecated `decorators` has been removed from `Node` and merged with `modifiers` on the `Node` subtypes that support them.
      * Use `ts.canHaveDecorators()` to test whether a `Node` can have decorators.
      * Use `ts.getDecorators()` to get the decorators of a `Node`.
      *
      * For example:
      * ```ts
      * const decorators = ts.canHaveDecorators(node) ? ts.getDecorators(node) : undefined;
      * ```
      */
    val decorators: Unit = js.native
    
    val end: Double = js.native
    
    val exclamationToken: js.UndefOr[ExclamationToken] = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ this.type, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[this.type], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val initializer: js.UndefOr[Expression] = js.native
    
    val kind: VariableDeclaration = js.native
    
    /**
      * @deprecated `modifiers` has been removed from `Node` and moved to the `Node` subtypes that support them.
      * Use `ts.canHaveModifiers()` to test whether a `Node` can have modifiers.
      * Use `ts.getModifiers()` to get the modifiers of a `Node`.
      *
      * For example:
      * ```ts
      * const modifiers = ts.canHaveModifiers(node) ? ts.getModifiers(node) : undefined;
      * ```
      */
    val modifiers: js.UndefOr[NodeArray[ModifierLike]] = js.native
    
    val name: BindingName = js.native
    
    val parent: VariableDeclarationList | CatchClause = js.native
    
    val pos: Double = js.native
    
    val `type`: js.UndefOr[TypeNode] = js.native
  }
}
