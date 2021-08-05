package typings.tsutils

import typings.tsutils.tsutilsStrings.Symbol
import typings.tsutils.tsutilsStrings.allowJs
import typings.tsutils.tsutilsStrings.allowSyntheticDefaultImports
import typings.tsutils.tsutilsStrings.allowUmdGlobalAccess
import typings.tsutils.tsutilsStrings.allowUnreachableCode
import typings.tsutils.tsutilsStrings.allowUnusedLabels
import typings.tsutils.tsutilsStrings.alwaysStrict
import typings.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies
import typings.tsutils.tsutilsStrings.baseUrl
import typings.tsutils.tsutilsStrings.charset
import typings.tsutils.tsutilsStrings.checkJs
import typings.tsutils.tsutilsStrings.composite
import typings.tsutils.tsutilsStrings.declaration
import typings.tsutils.tsutilsStrings.declarationDir
import typings.tsutils.tsutilsStrings.declarationMap
import typings.tsutils.tsutilsStrings.disableReferencedProjectLoad
import typings.tsutils.tsutilsStrings.disableSizeLimit
import typings.tsutils.tsutilsStrings.disableSolutionSearching
import typings.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect
import typings.tsutils.tsutilsStrings.downlevelIteration
import typings.tsutils.tsutilsStrings.emitBOM
import typings.tsutils.tsutilsStrings.emitDeclarationOnly
import typings.tsutils.tsutilsStrings.emitDecoratorMetadata
import typings.tsutils.tsutilsStrings.esModuleInterop
import typings.tsutils.tsutilsStrings.experimentalDecorators
import typings.tsutils.tsutilsStrings.forceConsistentCasingInFileNames
import typings.tsutils.tsutilsStrings.importHelpers
import typings.tsutils.tsutilsStrings.importsNotUsedAsValues
import typings.tsutils.tsutilsStrings.incremental
import typings.tsutils.tsutilsStrings.inlineSourceMap
import typings.tsutils.tsutilsStrings.inlineSources
import typings.tsutils.tsutilsStrings.isolatedModules
import typings.tsutils.tsutilsStrings.jsx
import typings.tsutils.tsutilsStrings.jsxFactory
import typings.tsutils.tsutilsStrings.jsxFragmentFactory
import typings.tsutils.tsutilsStrings.jsxImportSource
import typings.tsutils.tsutilsStrings.keyofStringsOnly
import typings.tsutils.tsutilsStrings.lib
import typings.tsutils.tsutilsStrings.locale
import typings.tsutils.tsutilsStrings.mapRoot
import typings.tsutils.tsutilsStrings.maxNodeModuleJsDepth
import typings.tsutils.tsutilsStrings.module
import typings.tsutils.tsutilsStrings.moduleResolution
import typings.tsutils.tsutilsStrings.newLine
import typings.tsutils.tsutilsStrings.noEmit
import typings.tsutils.tsutilsStrings.noEmitHelpers
import typings.tsutils.tsutilsStrings.noEmitOnError
import typings.tsutils.tsutilsStrings.noErrorTruncation
import typings.tsutils.tsutilsStrings.noFallthroughCasesInSwitch
import typings.tsutils.tsutilsStrings.noImplicitAny
import typings.tsutils.tsutilsStrings.noImplicitReturns
import typings.tsutils.tsutilsStrings.noImplicitThis
import typings.tsutils.tsutilsStrings.noImplicitUseStrict
import typings.tsutils.tsutilsStrings.noLib
import typings.tsutils.tsutilsStrings.noResolve
import typings.tsutils.tsutilsStrings.noStrictGenericChecks
import typings.tsutils.tsutilsStrings.noUncheckedIndexedAccess
import typings.tsutils.tsutilsStrings.noUnusedLocals
import typings.tsutils.tsutilsStrings.noUnusedParameters
import typings.tsutils.tsutilsStrings.out
import typings.tsutils.tsutilsStrings.outDir
import typings.tsutils.tsutilsStrings.outFile
import typings.tsutils.tsutilsStrings.paths
import typings.tsutils.tsutilsStrings.preserveConstEnums
import typings.tsutils.tsutilsStrings.preserveSymlinks
import typings.tsutils.tsutilsStrings.project
import typings.tsutils.tsutilsStrings.reactNamespace
import typings.tsutils.tsutilsStrings.removeComments
import typings.tsutils.tsutilsStrings.require
import typings.tsutils.tsutilsStrings.resolveJsonModule
import typings.tsutils.tsutilsStrings.rootDir
import typings.tsutils.tsutilsStrings.rootDirs
import typings.tsutils.tsutilsStrings.skipDefaultLibCheck
import typings.tsutils.tsutilsStrings.skipLibCheck
import typings.tsutils.tsutilsStrings.sourceMap
import typings.tsutils.tsutilsStrings.sourceRoot
import typings.tsutils.tsutilsStrings.strict
import typings.tsutils.tsutilsStrings.strictBindCallApply
import typings.tsutils.tsutilsStrings.strictFunctionTypes
import typings.tsutils.tsutilsStrings.strictNullChecks
import typings.tsutils.tsutilsStrings.strictPropertyInitialization
import typings.tsutils.tsutilsStrings.stripInternal
import typings.tsutils.tsutilsStrings.suppressExcessPropertyErrors
import typings.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors
import typings.tsutils.tsutilsStrings.symbol_
import typings.tsutils.tsutilsStrings.target
import typings.tsutils.tsutilsStrings.traceResolution
import typings.tsutils.tsutilsStrings.tsBuildInfoFile
import typings.tsutils.tsutilsStrings.typeRoots
import typings.tsutils.tsutilsStrings.types
import typings.tsutils.tsutilsStrings.useDefineForClassFields
import typings.tsutils.utilUtilMod._ImportLike
import typings.typescript.mod.ArrayTypeNode
import typings.typescript.mod.BaseType
import typings.typescript.mod.BindingName
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.Decorator
import typings.typescript.mod.DestructuringPattern
import typings.typescript.mod.DotDotDotToken
import typings.typescript.mod.Expression
import typings.typescript.mod.ExternalModuleReference
import typings.typescript.mod.GenericType
import typings.typescript.mod.Identifier
import typings.typescript.mod.LeftHandSideExpression
import typings.typescript.mod.ModifiersArray
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
import typings.typescript.mod.SyntaxKind
import typings.typescript.mod.SyntaxKind.BindingElement
import typings.typescript.mod.SyntaxKind.CallExpression
import typings.typescript.mod.SyntaxKind.ExportDeclaration
import typings.typescript.mod.SyntaxKind.ImportEqualsDeclaration
import typings.typescript.mod.SyntaxKind.ImportKeyword
import typings.typescript.mod.Token
import typings.typescript.mod.TupleType
import typings.typescript.mod.TupleTypeNode
import typings.typescript.mod.Type
import typings.typescript.mod.TypeFlags
import typings.typescript.mod.TypeNode
import typings.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined typescript.typescript.BindingElement & {  name :typescript.typescript.Identifier} */
  @js.native
  trait BindingElementnameIdentif extends StObject {
    
    var _declarationBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
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
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val name: BindingName & Identifier = js.native
    
    val parent: BindingPattern = js.native
    
    val pos: Double = js.native
    
    val propertyName: js.UndefOr[PropertyName] = js.native
  }
  
  trait Body extends StObject
  
  /* Inlined typescript.typescript.CallExpression & {  expression :typescript.typescript.Token<typescript.typescript.SyntaxKind.ImportKeyword> | typescript.typescript.Identifier & {  text :'require'},   arguments :[typescript.typescript.Expression]} */
  @js.native
  trait CallExpressionexpressionT
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: js.Any = js.native
    
    var _expressionBrand: js.Any = js.native
    
    var _leftHandSideExpressionBrand: js.Any = js.native
    
    var _unaryExpressionBrand: js.Any = js.native
    
    var _updateExpressionBrand: js.Any = js.native
    
    val arguments: NodeArray[Expression] & js.Array[Expression] = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    val expression: LeftHandSideExpression & (Token[ImportKeyword] | Identifiertextrequire) = js.native
    
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
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
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
    
    var _declarationBrand: js.Any = js.native
    
    var _statementBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
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
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    /** If this is not a StringLiteral it will be a grammar error. */
    val moduleSpecifier: js.UndefOr[Expression] & js.Object = js.native
    
    val name: js.UndefOr[Identifier | StringLiteral | NumericLiteral] = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'Symbol',   escapedText :'symbol'} */
  @js.native
  trait IdentifiertextSymbolescap extends StObject {
    
    var _declarationBrand: js.Any = js.native
    
    var _expressionBrand: js.Any = js.native
    
    var _leftHandSideExpressionBrand: js.Any = js.native
    
    var _memberExpressionBrand: js.Any = js.native
    
    var _primaryExpressionBrand: js.Any = js.native
    
    var _unaryExpressionBrand: js.Any = js.native
    
    var _updateExpressionBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    /**
      * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
      * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
      */
    val escapedText: typings.typescript.mod.String & symbol_ = js.native
    
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
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String & Symbol = js.native
  }
  
  /* Inlined typescript.typescript.Identifier & {  text :'require'} */
  @js.native
  trait Identifiertextrequire extends StObject {
    
    var _declarationBrand: js.Any = js.native
    
    var _expressionBrand: js.Any = js.native
    
    var _leftHandSideExpressionBrand: js.Any = js.native
    
    var _memberExpressionBrand: js.Any = js.native
    
    var _primaryExpressionBrand: js.Any = js.native
    
    var _unaryExpressionBrand: js.Any = js.native
    
    var _updateExpressionBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
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
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val originalKeywordKind: js.UndefOr[SyntaxKind] = js.native
    
    val parent: Node = js.native
    
    val pos: Double = js.native
    
    val text: String & require = js.native
  }
  
  /* Inlined typescript.typescript.ImportEqualsDeclaration & {  moduleReference :typescript.typescript.ExternalModuleReference} */
  @js.native
  trait ImportEqualsDeclarationmo
    extends StObject
       with _ImportLike {
    
    var _declarationBrand: js.Any = js.native
    
    var _statementBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
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
    
    val kind: ImportEqualsDeclaration = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val moduleReference: ModuleReference & ExternalModuleReference = js.native
    
    val name: Identifier = js.native
    
    val parent: SourceFile | ModuleBlock = js.native
    
    val pos: Double = js.native
  }
  
  /* Inlined {[ K in keyof typescript.typescript.CompilerOptions ]: std.NonNullable<typescript.typescript.CompilerOptions[K]> extends boolean? K : never} */
  trait KinkeyofCompilerOptionsNo extends StObject {
    
    var allowJs: js.UndefOr[typings.tsutils.tsutilsStrings.allowJs] = js.undefined
    
    var allowSyntheticDefaultImports: js.UndefOr[typings.tsutils.tsutilsStrings.allowSyntheticDefaultImports] = js.undefined
    
    var allowUmdGlobalAccess: js.UndefOr[typings.tsutils.tsutilsStrings.allowUmdGlobalAccess] = js.undefined
    
    var allowUnreachableCode: js.UndefOr[typings.tsutils.tsutilsStrings.allowUnreachableCode] = js.undefined
    
    var allowUnusedLabels: js.UndefOr[typings.tsutils.tsutilsStrings.allowUnusedLabels] = js.undefined
    
    var alwaysStrict: js.UndefOr[typings.tsutils.tsutilsStrings.alwaysStrict] = js.undefined
    
    var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[typings.tsutils.tsutilsStrings.assumeChangesOnlyAffectDirectDependencies] = js.undefined
    
    var baseUrl: js.UndefOr[typings.tsutils.tsutilsStrings.baseUrl] = js.undefined
    
    var charset: js.UndefOr[typings.tsutils.tsutilsStrings.charset] = js.undefined
    
    var checkJs: js.UndefOr[typings.tsutils.tsutilsStrings.checkJs] = js.undefined
    
    var composite: js.UndefOr[typings.tsutils.tsutilsStrings.composite] = js.undefined
    
    var declaration: js.UndefOr[typings.tsutils.tsutilsStrings.declaration] = js.undefined
    
    var declarationDir: js.UndefOr[typings.tsutils.tsutilsStrings.declarationDir] = js.undefined
    
    var declarationMap: js.UndefOr[typings.tsutils.tsutilsStrings.declarationMap] = js.undefined
    
    var disableReferencedProjectLoad: js.UndefOr[typings.tsutils.tsutilsStrings.disableReferencedProjectLoad] = js.undefined
    
    var disableSizeLimit: js.UndefOr[typings.tsutils.tsutilsStrings.disableSizeLimit] = js.undefined
    
    var disableSolutionSearching: js.UndefOr[typings.tsutils.tsutilsStrings.disableSolutionSearching] = js.undefined
    
    var disableSourceOfProjectReferenceRedirect: js.UndefOr[typings.tsutils.tsutilsStrings.disableSourceOfProjectReferenceRedirect] = js.undefined
    
    var downlevelIteration: js.UndefOr[typings.tsutils.tsutilsStrings.downlevelIteration] = js.undefined
    
    var emitBOM: js.UndefOr[typings.tsutils.tsutilsStrings.emitBOM] = js.undefined
    
    var emitDeclarationOnly: js.UndefOr[typings.tsutils.tsutilsStrings.emitDeclarationOnly] = js.undefined
    
    var emitDecoratorMetadata: js.UndefOr[typings.tsutils.tsutilsStrings.emitDecoratorMetadata] = js.undefined
    
    var esModuleInterop: js.UndefOr[typings.tsutils.tsutilsStrings.esModuleInterop] = js.undefined
    
    var experimentalDecorators: js.UndefOr[typings.tsutils.tsutilsStrings.experimentalDecorators] = js.undefined
    
    var forceConsistentCasingInFileNames: js.UndefOr[typings.tsutils.tsutilsStrings.forceConsistentCasingInFileNames] = js.undefined
    
    var importHelpers: js.UndefOr[typings.tsutils.tsutilsStrings.importHelpers] = js.undefined
    
    var importsNotUsedAsValues: js.UndefOr[typings.tsutils.tsutilsStrings.importsNotUsedAsValues] = js.undefined
    
    var incremental: js.UndefOr[typings.tsutils.tsutilsStrings.incremental] = js.undefined
    
    var inlineSourceMap: js.UndefOr[typings.tsutils.tsutilsStrings.inlineSourceMap] = js.undefined
    
    var inlineSources: js.UndefOr[typings.tsutils.tsutilsStrings.inlineSources] = js.undefined
    
    var isolatedModules: js.UndefOr[typings.tsutils.tsutilsStrings.isolatedModules] = js.undefined
    
    var jsx: js.UndefOr[typings.tsutils.tsutilsStrings.jsx] = js.undefined
    
    var jsxFactory: js.UndefOr[typings.tsutils.tsutilsStrings.jsxFactory] = js.undefined
    
    var jsxFragmentFactory: js.UndefOr[typings.tsutils.tsutilsStrings.jsxFragmentFactory] = js.undefined
    
    var jsxImportSource: js.UndefOr[typings.tsutils.tsutilsStrings.jsxImportSource] = js.undefined
    
    var keyofStringsOnly: js.UndefOr[typings.tsutils.tsutilsStrings.keyofStringsOnly] = js.undefined
    
    var lib: js.UndefOr[typings.tsutils.tsutilsStrings.lib] = js.undefined
    
    var locale: js.UndefOr[typings.tsutils.tsutilsStrings.locale] = js.undefined
    
    var mapRoot: js.UndefOr[typings.tsutils.tsutilsStrings.mapRoot] = js.undefined
    
    var maxNodeModuleJsDepth: js.UndefOr[typings.tsutils.tsutilsStrings.maxNodeModuleJsDepth] = js.undefined
    
    var module: js.UndefOr[typings.tsutils.tsutilsStrings.module] = js.undefined
    
    var moduleResolution: js.UndefOr[typings.tsutils.tsutilsStrings.moduleResolution] = js.undefined
    
    var newLine: js.UndefOr[typings.tsutils.tsutilsStrings.newLine] = js.undefined
    
    var noEmit: js.UndefOr[typings.tsutils.tsutilsStrings.noEmit] = js.undefined
    
    var noEmitHelpers: js.UndefOr[typings.tsutils.tsutilsStrings.noEmitHelpers] = js.undefined
    
    var noEmitOnError: js.UndefOr[typings.tsutils.tsutilsStrings.noEmitOnError] = js.undefined
    
    var noErrorTruncation: js.UndefOr[typings.tsutils.tsutilsStrings.noErrorTruncation] = js.undefined
    
    var noFallthroughCasesInSwitch: js.UndefOr[typings.tsutils.tsutilsStrings.noFallthroughCasesInSwitch] = js.undefined
    
    var noImplicitAny: js.UndefOr[typings.tsutils.tsutilsStrings.noImplicitAny] = js.undefined
    
    var noImplicitReturns: js.UndefOr[typings.tsutils.tsutilsStrings.noImplicitReturns] = js.undefined
    
    var noImplicitThis: js.UndefOr[typings.tsutils.tsutilsStrings.noImplicitThis] = js.undefined
    
    var noImplicitUseStrict: js.UndefOr[typings.tsutils.tsutilsStrings.noImplicitUseStrict] = js.undefined
    
    var noLib: js.UndefOr[typings.tsutils.tsutilsStrings.noLib] = js.undefined
    
    var noResolve: js.UndefOr[typings.tsutils.tsutilsStrings.noResolve] = js.undefined
    
    var noStrictGenericChecks: js.UndefOr[typings.tsutils.tsutilsStrings.noStrictGenericChecks] = js.undefined
    
    var noUncheckedIndexedAccess: js.UndefOr[typings.tsutils.tsutilsStrings.noUncheckedIndexedAccess] = js.undefined
    
    var noUnusedLocals: js.UndefOr[typings.tsutils.tsutilsStrings.noUnusedLocals] = js.undefined
    
    var noUnusedParameters: js.UndefOr[typings.tsutils.tsutilsStrings.noUnusedParameters] = js.undefined
    
    var out: js.UndefOr[typings.tsutils.tsutilsStrings.out] = js.undefined
    
    var outDir: js.UndefOr[typings.tsutils.tsutilsStrings.outDir] = js.undefined
    
    var outFile: js.UndefOr[typings.tsutils.tsutilsStrings.outFile] = js.undefined
    
    var paths: js.UndefOr[typings.tsutils.tsutilsStrings.paths] = js.undefined
    
    var preserveConstEnums: js.UndefOr[typings.tsutils.tsutilsStrings.preserveConstEnums] = js.undefined
    
    var preserveSymlinks: js.UndefOr[typings.tsutils.tsutilsStrings.preserveSymlinks] = js.undefined
    
    var project: js.UndefOr[typings.tsutils.tsutilsStrings.project] = js.undefined
    
    var reactNamespace: js.UndefOr[typings.tsutils.tsutilsStrings.reactNamespace] = js.undefined
    
    var removeComments: js.UndefOr[typings.tsutils.tsutilsStrings.removeComments] = js.undefined
    
    var resolveJsonModule: js.UndefOr[typings.tsutils.tsutilsStrings.resolveJsonModule] = js.undefined
    
    var rootDir: js.UndefOr[typings.tsutils.tsutilsStrings.rootDir] = js.undefined
    
    var rootDirs: js.UndefOr[typings.tsutils.tsutilsStrings.rootDirs] = js.undefined
    
    var skipDefaultLibCheck: js.UndefOr[typings.tsutils.tsutilsStrings.skipDefaultLibCheck] = js.undefined
    
    var skipLibCheck: js.UndefOr[typings.tsutils.tsutilsStrings.skipLibCheck] = js.undefined
    
    var sourceMap: js.UndefOr[typings.tsutils.tsutilsStrings.sourceMap] = js.undefined
    
    var sourceRoot: js.UndefOr[typings.tsutils.tsutilsStrings.sourceRoot] = js.undefined
    
    var strict: js.UndefOr[typings.tsutils.tsutilsStrings.strict] = js.undefined
    
    var strictBindCallApply: js.UndefOr[typings.tsutils.tsutilsStrings.strictBindCallApply] = js.undefined
    
    var strictFunctionTypes: js.UndefOr[typings.tsutils.tsutilsStrings.strictFunctionTypes] = js.undefined
    
    var strictNullChecks: js.UndefOr[typings.tsutils.tsutilsStrings.strictNullChecks] = js.undefined
    
    var strictPropertyInitialization: js.UndefOr[typings.tsutils.tsutilsStrings.strictPropertyInitialization] = js.undefined
    
    var stripInternal: js.UndefOr[typings.tsutils.tsutilsStrings.stripInternal] = js.undefined
    
    var suppressExcessPropertyErrors: js.UndefOr[typings.tsutils.tsutilsStrings.suppressExcessPropertyErrors] = js.undefined
    
    var suppressImplicitAnyIndexErrors: js.UndefOr[typings.tsutils.tsutilsStrings.suppressImplicitAnyIndexErrors] = js.undefined
    
    var target: js.UndefOr[typings.tsutils.tsutilsStrings.target] = js.undefined
    
    var traceResolution: js.UndefOr[typings.tsutils.tsutilsStrings.traceResolution] = js.undefined
    
    var tsBuildInfoFile: js.UndefOr[typings.tsutils.tsutilsStrings.tsBuildInfoFile] = js.undefined
    
    var typeRoots: js.UndefOr[typings.tsutils.tsutilsStrings.typeRoots] = js.undefined
    
    var types: js.UndefOr[typings.tsutils.tsutilsStrings.types] = js.undefined
    
    var useDefineForClassFields: js.UndefOr[typings.tsutils.tsutilsStrings.useDefineForClassFields] = js.undefined
  }
  object KinkeyofCompilerOptionsNo {
    
    inline def apply(): KinkeyofCompilerOptionsNo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KinkeyofCompilerOptionsNo]
    }
    
    extension [Self <: KinkeyofCompilerOptionsNo](x: Self) {
      
      inline def setAllowJs(value: allowJs): Self = StObject.set(x, "allowJs", value.asInstanceOf[js.Any])
      
      inline def setAllowJsUndefined: Self = StObject.set(x, "allowJs", js.undefined)
      
      inline def setAllowSyntheticDefaultImports(value: allowSyntheticDefaultImports): Self = StObject.set(x, "allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
      
      inline def setAllowSyntheticDefaultImportsUndefined: Self = StObject.set(x, "allowSyntheticDefaultImports", js.undefined)
      
      inline def setAllowUmdGlobalAccess(value: allowUmdGlobalAccess): Self = StObject.set(x, "allowUmdGlobalAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowUmdGlobalAccessUndefined: Self = StObject.set(x, "allowUmdGlobalAccess", js.undefined)
      
      inline def setAllowUnreachableCode(value: allowUnreachableCode): Self = StObject.set(x, "allowUnreachableCode", value.asInstanceOf[js.Any])
      
      inline def setAllowUnreachableCodeUndefined: Self = StObject.set(x, "allowUnreachableCode", js.undefined)
      
      inline def setAllowUnusedLabels(value: allowUnusedLabels): Self = StObject.set(x, "allowUnusedLabels", value.asInstanceOf[js.Any])
      
      inline def setAllowUnusedLabelsUndefined: Self = StObject.set(x, "allowUnusedLabels", js.undefined)
      
      inline def setAlwaysStrict(value: alwaysStrict): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
      
      inline def setAssumeChangesOnlyAffectDirectDependencies(value: assumeChangesOnlyAffectDirectDependencies): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
      
      inline def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
      
      inline def setBaseUrl(value: baseUrl): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCharset(value: charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCheckJs(value: checkJs): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
      
      inline def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
      
      inline def setComposite(value: composite): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setDeclaration(value: declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDir(value: declarationDir): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
      
      inline def setDeclarationMap(value: declarationMap): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
      
      inline def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setDisableReferencedProjectLoad(value: disableReferencedProjectLoad): Self = StObject.set(x, "disableReferencedProjectLoad", value.asInstanceOf[js.Any])
      
      inline def setDisableReferencedProjectLoadUndefined: Self = StObject.set(x, "disableReferencedProjectLoad", js.undefined)
      
      inline def setDisableSizeLimit(value: disableSizeLimit): Self = StObject.set(x, "disableSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setDisableSizeLimitUndefined: Self = StObject.set(x, "disableSizeLimit", js.undefined)
      
      inline def setDisableSolutionSearching(value: disableSolutionSearching): Self = StObject.set(x, "disableSolutionSearching", value.asInstanceOf[js.Any])
      
      inline def setDisableSolutionSearchingUndefined: Self = StObject.set(x, "disableSolutionSearching", js.undefined)
      
      inline def setDisableSourceOfProjectReferenceRedirect(value: disableSourceOfProjectReferenceRedirect): Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
      
      inline def setDisableSourceOfProjectReferenceRedirectUndefined: Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", js.undefined)
      
      inline def setDownlevelIteration(value: downlevelIteration): Self = StObject.set(x, "downlevelIteration", value.asInstanceOf[js.Any])
      
      inline def setDownlevelIterationUndefined: Self = StObject.set(x, "downlevelIteration", js.undefined)
      
      inline def setEmitBOM(value: emitBOM): Self = StObject.set(x, "emitBOM", value.asInstanceOf[js.Any])
      
      inline def setEmitBOMUndefined: Self = StObject.set(x, "emitBOM", js.undefined)
      
      inline def setEmitDeclarationOnly(value: emitDeclarationOnly): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
      
      inline def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
      
      inline def setEmitDecoratorMetadata(value: emitDecoratorMetadata): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
      
      inline def setEsModuleInterop(value: esModuleInterop): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
      
      inline def setExperimentalDecorators(value: experimentalDecorators): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      inline def setForceConsistentCasingInFileNames(value: forceConsistentCasingInFileNames): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
      
      inline def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
      
      inline def setImportHelpers(value: importHelpers): Self = StObject.set(x, "importHelpers", value.asInstanceOf[js.Any])
      
      inline def setImportHelpersUndefined: Self = StObject.set(x, "importHelpers", js.undefined)
      
      inline def setImportsNotUsedAsValues(value: importsNotUsedAsValues): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
      
      inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
      
      inline def setIncremental(value: incremental): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      inline def setInlineSourceMap(value: inlineSourceMap): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      inline def setInlineSources(value: inlineSources): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
      
      inline def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
      
      inline def setIsolatedModules(value: isolatedModules): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      inline def setJsx(value: jsx): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFactory(value: jsxFactory): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      inline def setJsxFragmentFactory(value: jsxFragmentFactory): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      inline def setJsxImportSource(value: jsxImportSource): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setKeyofStringsOnly(value: keyofStringsOnly): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
      
      inline def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
      
      inline def setLib(value: lib): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMapRoot(value: mapRoot): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      inline def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      inline def setMaxNodeModuleJsDepth(value: maxNodeModuleJsDepth): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
      
      inline def setModule(value: module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleResolution(value: moduleResolution): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      inline def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setNewLine(value: newLine): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      inline def setNoEmit(value: noEmit): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      inline def setNoEmitHelpers(value: noEmitHelpers): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
      
      inline def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
      
      inline def setNoEmitOnError(value: noEmitOnError): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      inline def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      inline def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      inline def setNoErrorTruncation(value: noErrorTruncation): Self = StObject.set(x, "noErrorTruncation", value.asInstanceOf[js.Any])
      
      inline def setNoErrorTruncationUndefined: Self = StObject.set(x, "noErrorTruncation", js.undefined)
      
      inline def setNoFallthroughCasesInSwitch(value: noFallthroughCasesInSwitch): Self = StObject.set(x, "noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
      
      inline def setNoFallthroughCasesInSwitchUndefined: Self = StObject.set(x, "noFallthroughCasesInSwitch", js.undefined)
      
      inline def setNoImplicitAny(value: noImplicitAny): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
      
      inline def setNoImplicitReturns(value: noImplicitReturns): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
      
      inline def setNoImplicitThis(value: noImplicitThis): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
      
      inline def setNoImplicitUseStrict(value: noImplicitUseStrict): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
      
      inline def setNoLib(value: noLib): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      inline def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      inline def setNoResolve(value: noResolve): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
      
      inline def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
      
      inline def setNoStrictGenericChecks(value: noStrictGenericChecks): Self = StObject.set(x, "noStrictGenericChecks", value.asInstanceOf[js.Any])
      
      inline def setNoStrictGenericChecksUndefined: Self = StObject.set(x, "noStrictGenericChecks", js.undefined)
      
      inline def setNoUncheckedIndexedAccess(value: noUncheckedIndexedAccess): Self = StObject.set(x, "noUncheckedIndexedAccess", value.asInstanceOf[js.Any])
      
      inline def setNoUncheckedIndexedAccessUndefined: Self = StObject.set(x, "noUncheckedIndexedAccess", js.undefined)
      
      inline def setNoUnusedLocals(value: noUnusedLocals): Self = StObject.set(x, "noUnusedLocals", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedLocalsUndefined: Self = StObject.set(x, "noUnusedLocals", js.undefined)
      
      inline def setNoUnusedParameters(value: noUnusedParameters): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      inline def setOut(value: out): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutDir(value: outDir): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      inline def setOutFile(value: outFile): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setPaths(value: paths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPreserveConstEnums(value: preserveConstEnums): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      inline def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      inline def setPreserveSymlinks(value: preserveSymlinks): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setProject(value: project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setReactNamespace(value: reactNamespace): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
      
      inline def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
      
      inline def setRemoveComments(value: removeComments): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      inline def setResolveJsonModule(value: resolveJsonModule): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
      
      inline def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
      
      inline def setRootDir(value: rootDir): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootDirs(value: rootDirs): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      inline def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      inline def setSkipDefaultLibCheck(value: skipDefaultLibCheck): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
      
      inline def setSkipLibCheck(value: skipLibCheck): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
      
      inline def setSourceMap(value: sourceMap): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceRoot(value: sourceRoot): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setStrict(value: strict): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictBindCallApply(value: strictBindCallApply): Self = StObject.set(x, "strictBindCallApply", value.asInstanceOf[js.Any])
      
      inline def setStrictBindCallApplyUndefined: Self = StObject.set(x, "strictBindCallApply", js.undefined)
      
      inline def setStrictFunctionTypes(value: strictFunctionTypes): Self = StObject.set(x, "strictFunctionTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictFunctionTypesUndefined: Self = StObject.set(x, "strictFunctionTypes", js.undefined)
      
      inline def setStrictNullChecks(value: strictNullChecks): Self = StObject.set(x, "strictNullChecks", value.asInstanceOf[js.Any])
      
      inline def setStrictNullChecksUndefined: Self = StObject.set(x, "strictNullChecks", js.undefined)
      
      inline def setStrictPropertyInitialization(value: strictPropertyInitialization): Self = StObject.set(x, "strictPropertyInitialization", value.asInstanceOf[js.Any])
      
      inline def setStrictPropertyInitializationUndefined: Self = StObject.set(x, "strictPropertyInitialization", js.undefined)
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStripInternal(value: stripInternal): Self = StObject.set(x, "stripInternal", value.asInstanceOf[js.Any])
      
      inline def setStripInternalUndefined: Self = StObject.set(x, "stripInternal", js.undefined)
      
      inline def setSuppressExcessPropertyErrors(value: suppressExcessPropertyErrors): Self = StObject.set(x, "suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressExcessPropertyErrorsUndefined: Self = StObject.set(x, "suppressExcessPropertyErrors", js.undefined)
      
      inline def setSuppressImplicitAnyIndexErrors(value: suppressImplicitAnyIndexErrors): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
      
      inline def setTarget(value: target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTraceResolution(value: traceResolution): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
      
      inline def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
      
      inline def setTsBuildInfoFile(value: tsBuildInfoFile): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
      
      inline def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
      
      inline def setTypeRoots(value: typeRoots): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
      
      inline def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
      
      inline def setTypes(value: types): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setUseDefineForClassFields(value: useDefineForClassFields): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: Identifier
  }
  object Name {
    
    inline def apply(name: Identifier): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined typescript.typescript.TypeReference & {  target :typescript.typescript.TupleType} */
  trait TypeReferencetargetTupleT extends StObject {
    
    var aliasSymbol: js.UndefOr[typings.typescript.mod.Symbol] = js.undefined
    
    var aliasTypeArguments: js.UndefOr[js.Array[Type]] = js.undefined
    
    var flags: TypeFlags
    
    def getApparentProperties(): js.Array[typings.typescript.mod.Symbol]
    
    def getBaseTypes(): js.UndefOr[js.Array[BaseType]]
    
    def getCallSignatures(): js.Array[Signature]
    
    def getConstraint(): js.UndefOr[Type]
    
    def getConstructSignatures(): js.Array[Signature]
    
    def getDefault(): js.UndefOr[Type]
    
    def getFlags(): TypeFlags
    
    def getNonNullableType(): Type
    
    def getNumberIndexType(): js.UndefOr[Type]
    
    def getProperties(): js.Array[typings.typescript.mod.Symbol]
    
    def getProperty(propertyName: String): js.UndefOr[typings.typescript.mod.Symbol]
    
    def getStringIndexType(): js.UndefOr[Type]
    
    def getSymbol(): js.UndefOr[typings.typescript.mod.Symbol]
    
    def isClass(): /* is typescript.typescript.InterfaceType */ Boolean
    
    def isClassOrInterface(): /* is typescript.typescript.InterfaceType */ Boolean
    
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
    
    var symbol: typings.typescript.mod.Symbol
    
    var target: GenericType & TupleType
    
    var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
  }
  object TypeReferencetargetTupleT {
    
    inline def apply(
      flags: TypeFlags,
      getApparentProperties: () => js.Array[typings.typescript.mod.Symbol],
      getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
      getCallSignatures: () => js.Array[Signature],
      getConstraint: () => js.UndefOr[Type],
      getConstructSignatures: () => js.Array[Signature],
      getDefault: () => js.UndefOr[Type],
      getFlags: () => TypeFlags,
      getNonNullableType: () => Type,
      getNumberIndexType: () => js.UndefOr[Type],
      getProperties: () => js.Array[typings.typescript.mod.Symbol],
      getProperty: String => js.UndefOr[typings.typescript.mod.Symbol],
      getStringIndexType: () => js.UndefOr[Type],
      getSymbol: () => js.UndefOr[typings.typescript.mod.Symbol],
      isClass: () => /* is typescript.typescript.InterfaceType */ Boolean,
      isClassOrInterface: () => /* is typescript.typescript.InterfaceType */ Boolean,
      isIntersection: () => /* is typescript.typescript.IntersectionType */ Boolean,
      isLiteral: () => /* is typescript.typescript.LiteralType */ Boolean,
      isNumberLiteral: () => /* is typescript.typescript.NumberLiteralType */ Boolean,
      isStringLiteral: () => /* is typescript.typescript.StringLiteralType */ Boolean,
      isTypeParameter: () => /* is typescript.typescript.TypeParameter */ Boolean,
      isUnion: () => /* is typescript.typescript.UnionType */ Boolean,
      isUnionOrIntersection: () => /* is typescript.typescript.UnionOrIntersectionType */ Boolean,
      objectFlags: ObjectFlags,
      symbol: typings.typescript.mod.Symbol,
      target: GenericType & TupleType
    ): TypeReferencetargetTupleT = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeReferencetargetTupleT]
    }
    
    extension [Self <: TypeReferencetargetTupleT](x: Self) {
      
      inline def setAliasSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "aliasSymbol", value.asInstanceOf[js.Any])
      
      inline def setAliasSymbolUndefined: Self = StObject.set(x, "aliasSymbol", js.undefined)
      
      inline def setAliasTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "aliasTypeArguments", value.asInstanceOf[js.Any])
      
      inline def setAliasTypeArgumentsUndefined: Self = StObject.set(x, "aliasTypeArguments", js.undefined)
      
      inline def setAliasTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "aliasTypeArguments", js.Array(value :_*))
      
      inline def setFlags(value: TypeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setGetApparentProperties(value: () => js.Array[typings.typescript.mod.Symbol]): Self = StObject.set(x, "getApparentProperties", js.Any.fromFunction0(value))
      
      inline def setGetBaseTypes(value: () => js.UndefOr[js.Array[BaseType]]): Self = StObject.set(x, "getBaseTypes", js.Any.fromFunction0(value))
      
      inline def setGetCallSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getCallSignatures", js.Any.fromFunction0(value))
      
      inline def setGetConstraint(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getConstraint", js.Any.fromFunction0(value))
      
      inline def setGetConstructSignatures(value: () => js.Array[Signature]): Self = StObject.set(x, "getConstructSignatures", js.Any.fromFunction0(value))
      
      inline def setGetDefault(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
      
      inline def setGetFlags(value: () => TypeFlags): Self = StObject.set(x, "getFlags", js.Any.fromFunction0(value))
      
      inline def setGetNonNullableType(value: () => Type): Self = StObject.set(x, "getNonNullableType", js.Any.fromFunction0(value))
      
      inline def setGetNumberIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getNumberIndexType", js.Any.fromFunction0(value))
      
      inline def setGetProperties(value: () => js.Array[typings.typescript.mod.Symbol]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
      
      inline def setGetProperty(value: String => js.UndefOr[typings.typescript.mod.Symbol]): Self = StObject.set(x, "getProperty", js.Any.fromFunction1(value))
      
      inline def setGetStringIndexType(value: () => js.UndefOr[Type]): Self = StObject.set(x, "getStringIndexType", js.Any.fromFunction0(value))
      
      inline def setGetSymbol(value: () => js.UndefOr[typings.typescript.mod.Symbol]): Self = StObject.set(x, "getSymbol", js.Any.fromFunction0(value))
      
      inline def setIsClass(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClass", js.Any.fromFunction0(value))
      
      inline def setIsClassOrInterface(value: () => /* is typescript.typescript.InterfaceType */ Boolean): Self = StObject.set(x, "isClassOrInterface", js.Any.fromFunction0(value))
      
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
      
      inline def setSymbol(value: typings.typescript.mod.Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: GenericType & TupleType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTypeArguments(value: js.Array[Type]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
      
      inline def setTypeArgumentsVarargs(value: Type*): Self = StObject.set(x, "typeArguments", js.Array(value :_*))
    }
  }
  
  /* Inlined {[ _ in keyof typescript.typescript.CompilerOptions ]: infer U} */
  trait inkeyofCompilerOptionsinf extends StObject {
    
    var allowJs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var allowSyntheticDefaultImports: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var allowUmdGlobalAccess: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var allowUnreachableCode: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var allowUnusedLabels: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var alwaysStrict: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var assumeChangesOnlyAffectDirectDependencies: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var baseUrl: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var charset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var checkJs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var composite: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var declaration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var declarationDir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var declarationMap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var disableReferencedProjectLoad: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var disableSizeLimit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var disableSolutionSearching: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var disableSourceOfProjectReferenceRedirect: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var downlevelIteration: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var emitBOM: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var emitDeclarationOnly: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var emitDecoratorMetadata: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var esModuleInterop: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var experimentalDecorators: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var forceConsistentCasingInFileNames: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var importHelpers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var importsNotUsedAsValues: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var incremental: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var inlineSourceMap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var inlineSources: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var isolatedModules: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var jsx: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var jsxFactory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var jsxFragmentFactory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var jsxImportSource: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var keyofStringsOnly: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var lib: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var locale: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var mapRoot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var maxNodeModuleJsDepth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var module: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var moduleResolution: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var newLine: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noEmit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noEmitHelpers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noEmitOnError: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noErrorTruncation: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noFallthroughCasesInSwitch: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noImplicitAny: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noImplicitReturns: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noImplicitThis: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noImplicitUseStrict: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noLib: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noResolve: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noStrictGenericChecks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noUncheckedIndexedAccess: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noUnusedLocals: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var noUnusedParameters: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var out: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var outDir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var outFile: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var paths: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var preserveConstEnums: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var preserveSymlinks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var project: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var reactNamespace: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var removeComments: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var resolveJsonModule: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var rootDir: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var rootDirs: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var skipDefaultLibCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var skipLibCheck: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var sourceMap: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var sourceRoot: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var strict: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var strictBindCallApply: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var strictFunctionTypes: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var strictNullChecks: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var strictPropertyInitialization: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var stripInternal: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var suppressExcessPropertyErrors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var suppressImplicitAnyIndexErrors: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var target: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var traceResolution: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var tsBuildInfoFile: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var typeRoots: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var types: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
    
    var useDefineForClassFields: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
      ] = js.undefined
  }
  object inkeyofCompilerOptionsinf {
    
    inline def apply(): inkeyofCompilerOptionsinf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[inkeyofCompilerOptionsinf]
    }
    
    extension [Self <: inkeyofCompilerOptionsinf](x: Self) {
      
      inline def setAllowJs(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowJs", value.asInstanceOf[js.Any])
      
      inline def setAllowJsUndefined: Self = StObject.set(x, "allowJs", js.undefined)
      
      inline def setAllowSyntheticDefaultImports(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowSyntheticDefaultImports", value.asInstanceOf[js.Any])
      
      inline def setAllowSyntheticDefaultImportsUndefined: Self = StObject.set(x, "allowSyntheticDefaultImports", js.undefined)
      
      inline def setAllowUmdGlobalAccess(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowUmdGlobalAccess", value.asInstanceOf[js.Any])
      
      inline def setAllowUmdGlobalAccessUndefined: Self = StObject.set(x, "allowUmdGlobalAccess", js.undefined)
      
      inline def setAllowUnreachableCode(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowUnreachableCode", value.asInstanceOf[js.Any])
      
      inline def setAllowUnreachableCodeUndefined: Self = StObject.set(x, "allowUnreachableCode", js.undefined)
      
      inline def setAllowUnusedLabels(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "allowUnusedLabels", value.asInstanceOf[js.Any])
      
      inline def setAllowUnusedLabelsUndefined: Self = StObject.set(x, "allowUnusedLabels", js.undefined)
      
      inline def setAlwaysStrict(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "alwaysStrict", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStrictUndefined: Self = StObject.set(x, "alwaysStrict", js.undefined)
      
      inline def setAssumeChangesOnlyAffectDirectDependencies(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", value.asInstanceOf[js.Any])
      
      inline def setAssumeChangesOnlyAffectDirectDependenciesUndefined: Self = StObject.set(x, "assumeChangesOnlyAffectDirectDependencies", js.undefined)
      
      inline def setBaseUrl(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setCharset(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCheckJs(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "checkJs", value.asInstanceOf[js.Any])
      
      inline def setCheckJsUndefined: Self = StObject.set(x, "checkJs", js.undefined)
      
      inline def setComposite(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "composite", value.asInstanceOf[js.Any])
      
      inline def setCompositeUndefined: Self = StObject.set(x, "composite", js.undefined)
      
      inline def setDeclaration(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDir(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "declarationDir", value.asInstanceOf[js.Any])
      
      inline def setDeclarationDirUndefined: Self = StObject.set(x, "declarationDir", js.undefined)
      
      inline def setDeclarationMap(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "declarationMap", value.asInstanceOf[js.Any])
      
      inline def setDeclarationMapUndefined: Self = StObject.set(x, "declarationMap", js.undefined)
      
      inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      inline def setDisableReferencedProjectLoad(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableReferencedProjectLoad", value.asInstanceOf[js.Any])
      
      inline def setDisableReferencedProjectLoadUndefined: Self = StObject.set(x, "disableReferencedProjectLoad", js.undefined)
      
      inline def setDisableSizeLimit(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setDisableSizeLimitUndefined: Self = StObject.set(x, "disableSizeLimit", js.undefined)
      
      inline def setDisableSolutionSearching(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableSolutionSearching", value.asInstanceOf[js.Any])
      
      inline def setDisableSolutionSearchingUndefined: Self = StObject.set(x, "disableSolutionSearching", js.undefined)
      
      inline def setDisableSourceOfProjectReferenceRedirect(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", value.asInstanceOf[js.Any])
      
      inline def setDisableSourceOfProjectReferenceRedirectUndefined: Self = StObject.set(x, "disableSourceOfProjectReferenceRedirect", js.undefined)
      
      inline def setDownlevelIteration(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "downlevelIteration", value.asInstanceOf[js.Any])
      
      inline def setDownlevelIterationUndefined: Self = StObject.set(x, "downlevelIteration", js.undefined)
      
      inline def setEmitBOM(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "emitBOM", value.asInstanceOf[js.Any])
      
      inline def setEmitBOMUndefined: Self = StObject.set(x, "emitBOM", js.undefined)
      
      inline def setEmitDeclarationOnly(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "emitDeclarationOnly", value.asInstanceOf[js.Any])
      
      inline def setEmitDeclarationOnlyUndefined: Self = StObject.set(x, "emitDeclarationOnly", js.undefined)
      
      inline def setEmitDecoratorMetadata(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "emitDecoratorMetadata", value.asInstanceOf[js.Any])
      
      inline def setEmitDecoratorMetadataUndefined: Self = StObject.set(x, "emitDecoratorMetadata", js.undefined)
      
      inline def setEsModuleInterop(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "esModuleInterop", value.asInstanceOf[js.Any])
      
      inline def setEsModuleInteropUndefined: Self = StObject.set(x, "esModuleInterop", js.undefined)
      
      inline def setExperimentalDecorators(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      inline def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      inline def setForceConsistentCasingInFileNames(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "forceConsistentCasingInFileNames", value.asInstanceOf[js.Any])
      
      inline def setForceConsistentCasingInFileNamesUndefined: Self = StObject.set(x, "forceConsistentCasingInFileNames", js.undefined)
      
      inline def setImportHelpers(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "importHelpers", value.asInstanceOf[js.Any])
      
      inline def setImportHelpersUndefined: Self = StObject.set(x, "importHelpers", js.undefined)
      
      inline def setImportsNotUsedAsValues(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "importsNotUsedAsValues", value.asInstanceOf[js.Any])
      
      inline def setImportsNotUsedAsValuesUndefined: Self = StObject.set(x, "importsNotUsedAsValues", js.undefined)
      
      inline def setIncremental(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      inline def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      inline def setInlineSourceMap(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      inline def setInlineSources(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "inlineSources", value.asInstanceOf[js.Any])
      
      inline def setInlineSourcesUndefined: Self = StObject.set(x, "inlineSources", js.undefined)
      
      inline def setIsolatedModules(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      inline def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      inline def setJsx(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxFactory(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsxFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFactoryUndefined: Self = StObject.set(x, "jsxFactory", js.undefined)
      
      inline def setJsxFragmentFactory(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsxFragmentFactory", value.asInstanceOf[js.Any])
      
      inline def setJsxFragmentFactoryUndefined: Self = StObject.set(x, "jsxFragmentFactory", js.undefined)
      
      inline def setJsxImportSource(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "jsxImportSource", value.asInstanceOf[js.Any])
      
      inline def setJsxImportSourceUndefined: Self = StObject.set(x, "jsxImportSource", js.undefined)
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setKeyofStringsOnly(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "keyofStringsOnly", value.asInstanceOf[js.Any])
      
      inline def setKeyofStringsOnlyUndefined: Self = StObject.set(x, "keyofStringsOnly", js.undefined)
      
      inline def setLib(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      inline def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      inline def setLocale(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMapRoot(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      inline def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      inline def setMaxNodeModuleJsDepth(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "maxNodeModuleJsDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxNodeModuleJsDepthUndefined: Self = StObject.set(x, "maxNodeModuleJsDepth", js.undefined)
      
      inline def setModule(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setModuleResolution(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      inline def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      inline def setNewLine(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      inline def setNoEmit(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      inline def setNoEmitHelpers(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
      
      inline def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
      
      inline def setNoEmitOnError(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      inline def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      inline def setNoEmitUndefined: Self = StObject.set(x, "noEmit", js.undefined)
      
      inline def setNoErrorTruncation(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noErrorTruncation", value.asInstanceOf[js.Any])
      
      inline def setNoErrorTruncationUndefined: Self = StObject.set(x, "noErrorTruncation", js.undefined)
      
      inline def setNoFallthroughCasesInSwitch(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noFallthroughCasesInSwitch", value.asInstanceOf[js.Any])
      
      inline def setNoFallthroughCasesInSwitchUndefined: Self = StObject.set(x, "noFallthroughCasesInSwitch", js.undefined)
      
      inline def setNoImplicitAny(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
      
      inline def setNoImplicitReturns(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitReturns", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitReturnsUndefined: Self = StObject.set(x, "noImplicitReturns", js.undefined)
      
      inline def setNoImplicitThis(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitThis", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitThisUndefined: Self = StObject.set(x, "noImplicitThis", js.undefined)
      
      inline def setNoImplicitUseStrict(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noImplicitUseStrict", value.asInstanceOf[js.Any])
      
      inline def setNoImplicitUseStrictUndefined: Self = StObject.set(x, "noImplicitUseStrict", js.undefined)
      
      inline def setNoLib(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      inline def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      inline def setNoResolve(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
      
      inline def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
      
      inline def setNoStrictGenericChecks(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noStrictGenericChecks", value.asInstanceOf[js.Any])
      
      inline def setNoStrictGenericChecksUndefined: Self = StObject.set(x, "noStrictGenericChecks", js.undefined)
      
      inline def setNoUncheckedIndexedAccess(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noUncheckedIndexedAccess", value.asInstanceOf[js.Any])
      
      inline def setNoUncheckedIndexedAccessUndefined: Self = StObject.set(x, "noUncheckedIndexedAccess", js.undefined)
      
      inline def setNoUnusedLocals(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noUnusedLocals", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedLocalsUndefined: Self = StObject.set(x, "noUnusedLocals", js.undefined)
      
      inline def setNoUnusedParameters(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "noUnusedParameters", value.asInstanceOf[js.Any])
      
      inline def setNoUnusedParametersUndefined: Self = StObject.set(x, "noUnusedParameters", js.undefined)
      
      inline def setOut(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutDir(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      inline def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      inline def setOutFile(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setPaths(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPreserveConstEnums(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      inline def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      inline def setPreserveSymlinks(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "preserveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setPreserveSymlinksUndefined: Self = StObject.set(x, "preserveSymlinks", js.undefined)
      
      inline def setProject(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setReactNamespace(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "reactNamespace", value.asInstanceOf[js.Any])
      
      inline def setReactNamespaceUndefined: Self = StObject.set(x, "reactNamespace", js.undefined)
      
      inline def setRemoveComments(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      inline def setResolveJsonModule(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "resolveJsonModule", value.asInstanceOf[js.Any])
      
      inline def setResolveJsonModuleUndefined: Self = StObject.set(x, "resolveJsonModule", js.undefined)
      
      inline def setRootDir(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootDirs(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      inline def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      inline def setSkipDefaultLibCheck(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "skipDefaultLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipDefaultLibCheckUndefined: Self = StObject.set(x, "skipDefaultLibCheck", js.undefined)
      
      inline def setSkipLibCheck(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "skipLibCheck", value.asInstanceOf[js.Any])
      
      inline def setSkipLibCheckUndefined: Self = StObject.set(x, "skipLibCheck", js.undefined)
      
      inline def setSourceMap(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSourceRoot(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setStrict(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictBindCallApply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictBindCallApply", value.asInstanceOf[js.Any])
      
      inline def setStrictBindCallApplyUndefined: Self = StObject.set(x, "strictBindCallApply", js.undefined)
      
      inline def setStrictFunctionTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictFunctionTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictFunctionTypesUndefined: Self = StObject.set(x, "strictFunctionTypes", js.undefined)
      
      inline def setStrictNullChecks(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictNullChecks", value.asInstanceOf[js.Any])
      
      inline def setStrictNullChecksUndefined: Self = StObject.set(x, "strictNullChecks", js.undefined)
      
      inline def setStrictPropertyInitialization(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "strictPropertyInitialization", value.asInstanceOf[js.Any])
      
      inline def setStrictPropertyInitializationUndefined: Self = StObject.set(x, "strictPropertyInitialization", js.undefined)
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setStripInternal(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "stripInternal", value.asInstanceOf[js.Any])
      
      inline def setStripInternalUndefined: Self = StObject.set(x, "stripInternal", js.undefined)
      
      inline def setSuppressExcessPropertyErrors(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "suppressExcessPropertyErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressExcessPropertyErrorsUndefined: Self = StObject.set(x, "suppressExcessPropertyErrors", js.undefined)
      
      inline def setSuppressImplicitAnyIndexErrors(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
      
      inline def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
      
      inline def setTarget(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTraceResolution(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "traceResolution", value.asInstanceOf[js.Any])
      
      inline def setTraceResolutionUndefined: Self = StObject.set(x, "traceResolution", js.undefined)
      
      inline def setTsBuildInfoFile(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "tsBuildInfoFile", value.asInstanceOf[js.Any])
      
      inline def setTsBuildInfoFileUndefined: Self = StObject.set(x, "tsBuildInfoFile", js.undefined)
      
      inline def setTypeRoots(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "typeRoots", value.asInstanceOf[js.Any])
      
      inline def setTypeRootsUndefined: Self = StObject.set(x, "typeRoots", js.undefined)
      
      inline def setTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setUseDefineForClassFields(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "useDefineForClassFields", value.asInstanceOf[js.Any])
      
      inline def setUseDefineForClassFieldsUndefined: Self = StObject.set(x, "useDefineForClassFields", js.undefined)
    }
  }
}
