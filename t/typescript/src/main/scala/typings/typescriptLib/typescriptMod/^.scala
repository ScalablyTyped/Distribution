package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** @deprecated Use `createExpressionStatement` instead.  */
  val createStatement: js.Function1[/* expression */ Expression, ExpressionStatement] = js.native
  var disableIncrementalParsing: scala.Boolean = js.native
  /** The version of the language service API */
  val servicesVersion: typescriptLib.typescriptLibStrings.`0DOT8` = js.native
  var sys: System = js.native
  var unchangedTextChangeRange: TextChangeRange = js.native
  /** @deprecated Use `updateExpressionStatement` instead.  */
  val updateStatement: js.Function2[/* node */ ExpressionStatement, /* expression */ Expression, ExpressionStatement] = js.native
  /** The version of the TypeScript compiler release */
  val version: java.lang.String = js.native
  val versionMajorMinor: typescriptLib.typescriptLibStrings.`3DOT5` = js.native
  /**
    * Adds an EmitHelper to a node.
    */
  def addEmitHelper[T /* <: Node */](node: T, helper: EmitHelper): T = js.native
  def addEmitHelpers[T /* <: Node */](node: T): T = js.native
  /**
    * Add EmitHelpers to a node.
    */
  def addEmitHelpers[T /* <: Node */](node: T, helpers: js.Array[EmitHelper]): T = js.native
  def addSyntheticLeadingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.MultiLineCommentTrivia,
    text: java.lang.String
  ): T = js.native
  def addSyntheticLeadingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.MultiLineCommentTrivia,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def addSyntheticLeadingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.SingleLineCommentTrivia,
    text: java.lang.String
  ): T = js.native
  def addSyntheticLeadingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.SingleLineCommentTrivia,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def addSyntheticTrailingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.MultiLineCommentTrivia,
    text: java.lang.String
  ): T = js.native
  def addSyntheticTrailingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.MultiLineCommentTrivia,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def addSyntheticTrailingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.SingleLineCommentTrivia,
    text: java.lang.String
  ): T = js.native
  def addSyntheticTrailingComment[T /* <: Node */](
    node: T,
    kind: typescriptLib.typescriptMod.SyntaxKind.SingleLineCommentTrivia,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: NonRelativeModuleNameResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: NonRelativeModuleNameResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
  /**
    * Called to merge all the changes that occurred across several versions of a script snapshot
    * into a single change.  i.e. if a user keeps making successive edits to a script we will
    * have a text change from V1 to V2, V2 to V3, ..., Vn.
    *
    * This function will then merge those changes into a single change range valid between V1 and
    * Vn.
    */
  def collapseTextChangeRangesAcrossMultipleVersions(changes: js.Array[TextChangeRange]): TextChangeRange = js.native
  def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: java.lang.String): typescriptLib.Anon_Errors = js.native
  def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: java.lang.String, configFileName: java.lang.String): typescriptLib.Anon_Errors = js.native
  /**
    * Convert the json syntax tree into the json value
    */
  def convertToObject(sourceFile: JsonSourceFile, errors: Push[Diagnostic]): js.Any = js.native
  def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: java.lang.String): typescriptLib.Anon_ErrorsOptions = js.native
  def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: java.lang.String, configFileName: java.lang.String): typescriptLib.Anon_ErrorsOptions = js.native
  def couldStartTrivia(text: java.lang.String, pos: scala.Double): scala.Boolean = js.native
  def createAbstractBuilder(): BuilderProgram = js.native
  /**
    * Creates a builder thats just abstraction over program and can be used with watch
    */
  def createAbstractBuilder(newProgram: Program, host: BuilderProgramHost): BuilderProgram = js.native
  def createAbstractBuilder(newProgram: Program, host: BuilderProgramHost, oldProgram: BuilderProgram): BuilderProgram = js.native
  def createAbstractBuilder(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String]): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String], options: js.UndefOr[scala.Nothing], host: CompilerHost): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String], options: CompilerOptions): BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def createAdd(left: Expression, right: Expression): BinaryExpression = js.native
  def createArrayBindingPattern(elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
  def createArrayLiteral(): ArrayLiteralExpression = js.native
  def createArrayLiteral(elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def createArrayLiteral(elements: js.Array[Expression], multiLine: scala.Boolean): ArrayLiteralExpression = js.native
  def createArrayTypeNode(elementType: TypeNode): ArrayTypeNode = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: ConciseBody
  ): ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: EqualsGreaterThanToken,
    body: ConciseBody
  ): ArrowFunction = js.native
  def createAsExpression(expression: Expression, `type`: TypeNode): AsExpression = js.native
  def createAssignment(left: ArrayLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def createAssignment(left: Expression, right: Expression): BinaryExpression = js.native
  def createAssignment(left: ObjectLiteralExpression, right: Expression): DestructuringAssignment = js.native
  def createAwait(expression: Expression): AwaitExpression = js.native
  def createBigIntLiteral(value: java.lang.String): BigIntLiteral = js.native
  def createBinary(left: Expression, operator: BinaryOperatorToken, right: Expression): BinaryExpression = js.native
  def createBinary(left: Expression, operator: BinaryOperator, right: Expression): BinaryExpression = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName
  ): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: java.lang.String, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: java.lang.String, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: PropertyName, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: js.UndefOr[scala.Nothing], name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: js.UndefOr[scala.Nothing], name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: java.lang.String, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: java.lang.String, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: java.lang.String,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: PropertyName, name: java.lang.String): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: java.lang.String,
    initializer: Expression
  ): BindingElement = js.native
  def createBindingElement(dotDotDotToken: DotDotDotToken, propertyName: PropertyName, name: BindingName): BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def createBlock(statements: js.Array[Statement]): Block = js.native
  def createBlock(statements: js.Array[Statement], multiLine: scala.Boolean): Block = js.native
  def createBreak(): BreakStatement = js.native
  def createBreak(label: java.lang.String): BreakStatement = js.native
  def createBreak(label: Identifier): BreakStatement = js.native
  def createBundle(sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def createBundle(sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
  def createCall(expression: Expression): CallExpression = js.native
  def createCall(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def createCall(expression: Expression, typeArguments: js.Array[TypeNode]): CallExpression = js.native
  def createCall(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): CallExpression = js.native
  def createCallSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def createCallSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def createCaseBlock(clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
  def createCaseClause(expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
  def createCatchClause(variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
  def createCatchClause(variableDeclaration: java.lang.String, block: Block): CatchClause = js.native
  def createCatchClause(variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def createClassExpression(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def createClassifier(): Classifier = js.native
  def createComma(left: Expression, right: Expression): Expression = js.native
  def createCommaList(elements: js.Array[Expression]): CommaListExpression = js.native
  def createCompilerHost(options: CompilerOptions): CompilerHost = js.native
  def createCompilerHost(options: CompilerOptions, setParentNodes: scala.Boolean): CompilerHost = js.native
  def createComputedPropertyName(expression: Expression): ComputedPropertyName = js.native
  def createConditional(
    condition: Expression,
    questionToken: QuestionToken,
    whenTrue: Expression,
    colonToken: ColonToken,
    whenFalse: Expression
  ): ConditionalExpression = js.native
  /** @deprecated */ def createConditional(condition: Expression, whenTrue: Expression, whenFalse: Expression): ConditionalExpression = js.native
  def createConditionalTypeNode(checkType: TypeNode, extendsType: TypeNode, trueType: TypeNode, falseType: TypeNode): ConditionalTypeNode = js.native
  def createConstructSignature(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def createConstructSignature(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def createConstructorTypeNode(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def createConstructorTypeNode(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def createContinue(): ContinueStatement = js.native
  def createContinue(label: java.lang.String): ContinueStatement = js.native
  def createContinue(label: Identifier): ContinueStatement = js.native
  def createDebuggerStatement(): DebuggerStatement = js.native
  def createDecorator(expression: Expression): Decorator = js.native
  def createDefaultClause(statements: js.Array[Statement]): DefaultClause = js.native
  def createDelete(expression: Expression): DeleteExpression = js.native
  def createDo(statement: Statement, expression: Expression): DoStatement = js.native
  def createDocumentRegistry(): DocumentRegistry = js.native
  def createDocumentRegistry(useCaseSensitiveFileNames: scala.Boolean): DocumentRegistry = js.native
  def createDocumentRegistry(useCaseSensitiveFileNames: scala.Boolean, currentDirectory: java.lang.String): DocumentRegistry = js.native
  def createElementAccess(expression: Expression, index: scala.Double): ElementAccessExpression = js.native
  def createElementAccess(expression: Expression, index: Expression): ElementAccessExpression = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder that can handle the changes in program and iterate through changed files
    * to emit the those files and manage semantic diagnostics cache as well
    */
  def createEmitAndSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String]): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: js.UndefOr[scala.Nothing], host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmptyStatement(): EmptyStatement = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def createEnumMember(name: java.lang.String): EnumMember = js.native
  def createEnumMember(name: java.lang.String, initializer: Expression): EnumMember = js.native
  def createEnumMember(name: PropertyName): EnumMember = js.native
  def createEnumMember(name: PropertyName, initializer: Expression): EnumMember = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: scala.Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    isExportEquals: scala.Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: scala.Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    isExportEquals: scala.Boolean,
    expression: Expression
  ): ExportAssignment = js.native
  def createExportDeclaration(): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports
  ): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier], exportClause: NamedExports): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator]): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.UndefOr[scala.Nothing], exportClause: NamedExports): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], exportClause: NamedExports): ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def createExportDefault(expression: Expression): ExportAssignment = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: Identifier): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: Identifier, name: java.lang.String): ExportSpecifier = js.native
  def createExportSpecifier(propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
  def createExpressionStatement(expression: Expression): ExpressionStatement = js.native
  def createExpressionWithTypeArguments(typeArguments: js.UndefOr[scala.Nothing], expression: Expression): ExpressionWithTypeArguments = js.native
  def createExpressionWithTypeArguments(typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
  def createExternalModuleExport(exportName: Identifier): ExportDeclaration = js.native
  def createExternalModuleReference(expression: Expression): ExternalModuleReference = js.native
  def createFalse(): BooleanLiteral with Token[typescriptLib.typescriptMod.SyntaxKind.FalseKeyword] = js.native
  /** Create a unique name based on the supplied text. This does not consider names injected by the transformer. */
  def createFileLevelUniqueName(text: java.lang.String): Identifier = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def createFor(
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createFor(
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def createFor(
    initializer: ForInitializer,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def createFor(initializer: ForInitializer, condition: Expression, incrementor: Expression, statement: Statement): ForStatement = js.native
  def createForIn(initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
  def createForOf(
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def createForOf(
    awaitModifier: AwaitKeywordToken,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): FunctionDeclaration = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionDeclaration = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionDeclaration = js.native
  def createFunctionExpression(
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[java.lang.String | Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.UndefOr[js.Array[ParameterDeclaration]],
    `type`: js.UndefOr[TypeNode],
    body: Block
  ): FunctionExpression = js.native
  def createFunctionTypeNode(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[ParameterDeclaration]): FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def createFunctionTypeNode(typeParameters: js.Array[TypeParameterDeclaration], parameters: js.Array[ParameterDeclaration]): FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def createGetAccessor(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def createHeritageClause(
    token: typescriptLib.typescriptMod.SyntaxKind.ExtendsKeyword,
    types: js.Array[ExpressionWithTypeArguments]
  ): HeritageClause = js.native
  def createHeritageClause(
    token: typescriptLib.typescriptMod.SyntaxKind.ImplementsKeyword,
    types: js.Array[ExpressionWithTypeArguments]
  ): HeritageClause = js.native
  def createIdentifier(text: java.lang.String): Identifier = js.native
  def createIf(expression: Expression, thenStatement: Statement): IfStatement = js.native
  def createIf(expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
  def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement]): CallExpression = js.native
  def createImmediatelyInvokedArrowFunction(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement]): CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[Statement], param: ParameterDeclaration, paramValue: Expression): CallExpression = js.native
  def createImportClause(): ImportClause = js.native
  def createImportClause(name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings): ImportClause = js.native
  def createImportClause(name: Identifier): ImportClause = js.native
  def createImportClause(name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def createImportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  def createImportSpecifier(propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
  def createImportTypeNode(argument: TypeNode): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def createImportTypeNode(argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def createImportTypeNode(
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: scala.Boolean
  ): ImportTypeNode = js.native
  def createIndexSignature(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def createIndexedAccessTypeNode(objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
  def createInferTypeNode(typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
  def createInputFiles(javascriptText: java.lang.String, declarationText: java.lang.String): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    buildInfoPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String,
    buildInfoPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    buildInfoPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String,
    buildInfoPath: java.lang.String
  ): InputFiles = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | Identifier,
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def createIntersectionTypeNode(types: js.Array[TypeNode]): IntersectionTypeNode = js.native
  def createJsxAttribute(name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def createJsxAttribute(name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
  def createJsxAttributes(properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
  def createJsxClosingElement(tagName: JsxTagNameExpression): JsxClosingElement = js.native
  def createJsxElement(openingElement: JsxOpeningElement, children: js.Array[JsxChild], closingElement: JsxClosingElement): JsxElement = js.native
  def createJsxExpression(): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: js.UndefOr[scala.Nothing], expression: Expression): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: DotDotDotToken): JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: DotDotDotToken, expression: Expression): JsxExpression = js.native
  def createJsxFragment(
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
  def createJsxJsxClosingFragment(): JsxClosingFragment = js.native
  def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxOpeningElement = js.native
  def createJsxOpeningElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxOpeningElement = js.native
  def createJsxOpeningFragment(): JsxOpeningFragment = js.native
  def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.UndefOr[scala.Nothing], attributes: JsxAttributes): JsxSelfClosingElement = js.native
  def createJsxSelfClosingElement(tagName: JsxTagNameExpression, typeArguments: js.Array[TypeNode], attributes: JsxAttributes): JsxSelfClosingElement = js.native
  def createJsxSpreadAttribute(expression: Expression): JsxSpreadAttribute = js.native
  def createJsxText(text: java.lang.String): JsxText = js.native
  def createJsxText(text: java.lang.String, containsOnlyTriviaWhiteSpaces: scala.Boolean): JsxText = js.native
  def createKeywordTypeNode(
    kind: typescriptLib.typescriptMod.SyntaxKind.AnyKeyword | typescriptLib.typescriptMod.SyntaxKind.UnknownKeyword | typescriptLib.typescriptMod.SyntaxKind.NumberKeyword | typescriptLib.typescriptMod.SyntaxKind.BigIntKeyword | typescriptLib.typescriptMod.SyntaxKind.ObjectKeyword | typescriptLib.typescriptMod.SyntaxKind.BooleanKeyword | typescriptLib.typescriptMod.SyntaxKind.StringKeyword | typescriptLib.typescriptMod.SyntaxKind.SymbolKeyword | typescriptLib.typescriptMod.SyntaxKind.ThisKeyword | typescriptLib.typescriptMod.SyntaxKind.VoidKeyword | typescriptLib.typescriptMod.SyntaxKind.UndefinedKeyword | typescriptLib.typescriptMod.SyntaxKind.NullKeyword | typescriptLib.typescriptMod.SyntaxKind.NeverKeyword
  ): KeywordTypeNode = js.native
  def createLabel(label: java.lang.String, statement: Statement): LabeledStatement = js.native
  def createLabel(label: Identifier, statement: Statement): LabeledStatement = js.native
  def createLanguageService(host: LanguageServiceHost): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: scala.Boolean): LanguageService = js.native
  def createLanguageServiceSourceFile(
    fileName: java.lang.String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: ScriptTarget,
    version: java.lang.String,
    setNodeParents: scala.Boolean
  ): SourceFile = js.native
  def createLanguageServiceSourceFile(
    fileName: java.lang.String,
    scriptSnapshot: IScriptSnapshot,
    scriptTarget: ScriptTarget,
    version: java.lang.String,
    setNodeParents: scala.Boolean,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  def createLessThan(left: Expression, right: Expression): Expression = js.native
  def createLiteral(value: java.lang.String): PrimaryExpression = js.native
  def createLiteral(value: scala.Boolean): PrimaryExpression = js.native
  def createLiteral(value: scala.Double): PrimaryExpression = js.native
  def createLiteral(value: Identifier): StringLiteral = js.native
  def createLiteral(value: NoSubstitutionTemplateLiteral): StringLiteral = js.native
  def createLiteral(value: NumericLiteral): StringLiteral = js.native
  def createLiteral(value: PseudoBigInt): PrimaryExpression = js.native
  def createLiteral(value: StringLiteral): StringLiteral = js.native
  def createLiteralTypeNode(literal: BooleanLiteral): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: LiteralExpression): LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  @JSName("createLiteral")
  def createLiteral_BooleanLiteral(value: scala.Boolean): BooleanLiteral = js.native
  @JSName("createLiteral")
  def createLiteral_NumericLiteral(value: scala.Double): NumericLiteral = js.native
  @JSName("createLiteral")
  def createLiteral_NumericLiteral(value: PseudoBigInt): NumericLiteral = js.native
  /** If a node is passed, creates a string literal whose source text is read from a source node during emit. */
  @JSName("createLiteral")
  def createLiteral_StringLiteral(value: java.lang.String): StringLiteral = js.native
  def createLogicalAnd(left: Expression, right: Expression): BinaryExpression = js.native
  def createLogicalNot(operand: Expression): PrefixUnaryExpression = js.native
  def createLogicalOr(left: Expression, right: Expression): BinaryExpression = js.native
  /** Create a unique temporary variable for use in a loop. */
  def createLoopVariable(): Identifier = js.native
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken
  ): MappedTypeNode = js.native
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken,
    `type`: TypeNode
  ): MappedTypeNode = js.native
  def createMetaProperty(keywordToken: typescriptLib.typescriptMod.SyntaxKind.ImportKeyword, name: Identifier): MetaProperty = js.native
  def createMetaProperty(keywordToken: typescriptLib.typescriptMod.SyntaxKind.NewKeyword, name: Identifier): MetaProperty = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: java.lang.String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): MethodDeclaration = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: java.lang.String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodDeclaration = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: java.lang.String | PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): MethodDeclaration = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: java.lang.String
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: java.lang.String,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: java.lang.String
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: java.lang.String,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName
  ): MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def createModifier[T /* <: /* import warning: ImportType.apply Failed type conversion: typescript.typescript.Modifier['kind'] */ js.Any */](kind: T): Token[T] = js.native
  def createModifiersFromModifierFlags(flags: ModifierFlags): js.Array[Modifier] = js.native
  def createModuleBlock(statements: js.Array[Statement]): ModuleBlock = js.native
  def createModuleDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.UndefOr[scala.Nothing], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.UndefOr[scala.Nothing], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleDeclaration(decorators: js.Array[Decorator], modifiers: js.Array[Modifier], name: ModuleName, body: ModuleBody): ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody,
    flags: NodeFlags
  ): ModuleDeclaration = js.native
  def createModuleResolutionCache(
    currentDirectory: java.lang.String,
    getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String]
  ): ModuleResolutionCache = js.native
  def createModuleResolutionCache(
    currentDirectory: java.lang.String,
    getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String],
    options: CompilerOptions
  ): ModuleResolutionCache = js.native
  def createNamedExports(elements: js.Array[ExportSpecifier]): NamedExports = js.native
  def createNamedImports(elements: js.Array[ImportSpecifier]): NamedImports = js.native
  def createNamespaceExportDeclaration(name: java.lang.String): NamespaceExportDeclaration = js.native
  def createNamespaceExportDeclaration(name: Identifier): NamespaceExportDeclaration = js.native
  def createNamespaceImport(name: Identifier): NamespaceImport = js.native
  def createNew(expression: Expression): NewExpression = js.native
  def createNew(
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def createNew(expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def createNew(expression: Expression, typeArguments: js.Array[TypeNode], argumentsArray: js.Array[Expression]): NewExpression = js.native
  def createNoSubstitutionTemplateLiteral(text: java.lang.String): NoSubstitutionTemplateLiteral = js.native
  def createNode(kind: SyntaxKind): Node = js.native
  def createNode(kind: SyntaxKind, pos: scala.Double): Node = js.native
  def createNode(kind: SyntaxKind, pos: scala.Double, end: scala.Double): Node = js.native
  def createNodeArray[T /* <: Node */](): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.Array[T]): NodeArray[T] = js.native
  def createNodeArray[T /* <: Node */](elements: js.Array[T], hasTrailingComma: scala.Boolean): NodeArray[T] = js.native
  def createNonNullExpression(expression: Expression): NonNullExpression = js.native
  /**
    * Creates a synthetic statement to act as a placeholder for a not-emitted statement in
    * order to preserve comments.
    *
    * @param original The original statement.
    */
  def createNotEmittedStatement(original: Node): NotEmittedStatement = js.native
  def createNull(): NullLiteral with Token[typescriptLib.typescriptMod.SyntaxKind.NullKeyword] = js.native
  def createNumericLiteral(value: java.lang.String): NumericLiteral = js.native
  def createNumericLiteral(value: java.lang.String, numericLiteralFlags: TokenFlags): NumericLiteral = js.native
  def createObjectBindingPattern(elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
  def createObjectLiteral(): ObjectLiteralExpression = js.native
  def createObjectLiteral(properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  def createObjectLiteral(properties: js.Array[ObjectLiteralElementLike], multiLine: scala.Boolean): ObjectLiteralExpression = js.native
  def createOmittedExpression(): OmittedExpression = js.native
  /** Create a unique name based on the supplied text. */
  def createOptimisticUniqueName(text: java.lang.String): Identifier = js.native
  def createOptionalTypeNode(`type`: TypeNode): OptionalTypeNode = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    dotDotDotToken: DotDotDotToken,
    name: BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def createParen(expression: Expression): ParenthesizedExpression = js.native
  def createParenthesizedType(`type`: TypeNode): ParenthesizedTypeNode = js.native
  /**
    * Creates a synthetic expression to act as a placeholder for a not-emitted expression in
    * order to preserve comments or sourcemap positions.
    *
    * @param expression The inner expression to emit.
    * @param original The original outer expression.
    * @param location The location for the expression. Defaults to the positions from "original" if provided.
    */
  def createPartiallyEmittedExpression(expression: Expression): PartiallyEmittedExpression = js.native
  def createPartiallyEmittedExpression(expression: Expression, original: Node): PartiallyEmittedExpression = js.native
  def createPostfix(operand: Expression, operator: PostfixUnaryOperator): PostfixUnaryExpression = js.native
  def createPostfixIncrement(operand: Expression): PostfixUnaryExpression = js.native
  def createPrefix(operator: PrefixUnaryOperator, operand: Expression): PrefixUnaryExpression = js.native
  def createPrinter(): Printer = js.native
  def createPrinter(printerOptions: PrinterOptions): Printer = js.native
  def createPrinter(printerOptions: PrinterOptions, handlers: PrintHandlers): Printer = js.native
  /**
    * Create a new 'Program' instance. A Program is an immutable collection of 'SourceFile's and a 'CompilerOptions'
    * that represent a compilation unit.
    *
    * Creating a program proceeds from a set of root files, expanding the set of inputs by following imports and
    * triple-slash-reference-path directives transitively. '@types' and triple-slash-reference-types are also pulled in.
    *
    * @param createProgramOptions - The options for creating a program.
    * @returns A 'Program' object.
    */
  def createProgram(createProgramOptions: CreateProgramOptions): Program = js.native
  /**
    * Create a new 'Program' instance. A Program is an immutable collection of 'SourceFile's and a 'CompilerOptions'
    * that represent a compilation unit.
    *
    * Creating a program proceeds from a set of root files, expanding the set of inputs by following imports and
    * triple-slash-reference-path directives transitively. '@types' and triple-slash-reference-types are also pulled in.
    *
    * @param rootNames - A set of root files.
    * @param options - The compiler options which should be used.
    * @param host - The host interacts with the underlying file system.
    * @param oldProgram - Reuses an old program structure.
    * @param configFileParsingDiagnostics - error during config file parsing
    * @returns A 'Program' object.
    */
  def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions): Program = js.native
  def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: Program
  ): Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: Program,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName
  ): PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken
  ): PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def createPropertyAccess(expression: Expression, name: java.lang.String): PropertyAccessExpression = js.native
  def createPropertyAccess(expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def createPropertyAssignment(name: java.lang.String, initializer: Expression): PropertyAssignment = js.native
  def createPropertyAssignment(name: PropertyName, initializer: Expression): PropertyAssignment = js.native
  def createPropertySignature(modifiers: js.UndefOr[js.Array[Modifier]], name: PropertyName | java.lang.String): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName | java.lang.String,
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName | java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: PropertyName | java.lang.String,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
  def createQualifiedName(left: EntityName, right: java.lang.String): QualifiedName = js.native
  def createQualifiedName(left: EntityName, right: Identifier): QualifiedName = js.native
  def createRegularExpressionLiteral(text: java.lang.String): RegularExpressionLiteral = js.native
  def createRestTypeNode(`type`: TypeNode): RestTypeNode = js.native
  def createReturn(): ReturnStatement = js.native
  def createReturn(expression: Expression): ReturnStatement = js.native
  def createScanner(languageVersion: ScriptTarget, skipTrivia: scala.Boolean): Scanner = js.native
  def createScanner(languageVersion: ScriptTarget, skipTrivia: scala.Boolean, languageVariant: LanguageVariant): Scanner = js.native
  def createScanner(
    languageVersion: ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: LanguageVariant,
    textInitial: java.lang.String
  ): Scanner = js.native
  def createScanner(
    languageVersion: ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: LanguageVariant,
    textInitial: java.lang.String,
    onError: ErrorCallback
  ): Scanner = js.native
  def createScanner(
    languageVersion: ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: LanguageVariant,
    textInitial: java.lang.String,
    onError: ErrorCallback,
    start: scala.Double
  ): Scanner = js.native
  def createScanner(
    languageVersion: ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: LanguageVariant,
    textInitial: java.lang.String,
    onError: ErrorCallback,
    start: scala.Double,
    length: scala.Double
  ): Scanner = js.native
  def createSemanticDiagnosticsBuilderProgram(): SemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder to manage semantic diagnostics and cache them
    */
  def createSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost, oldProgram: SemanticDiagnosticsBuilderProgram): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String]): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: js.UndefOr[scala.Nothing], host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def createSemicolonClassElement(): SemicolonClassElement = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def createShorthandPropertyAssignment(name: java.lang.String): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: java.lang.String, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: Identifier): ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  def createSourceFile(fileName: java.lang.String, sourceText: java.lang.String, languageVersion: ScriptTarget): SourceFile = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: ScriptTarget,
    setParentNodes: scala.Boolean
  ): SourceFile = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: ScriptTarget,
    setParentNodes: scala.Boolean,
    scriptKind: ScriptKind
  ): SourceFile = js.native
  /**
    * Create an external source map source file reference
    */
  def createSourceMapSource(fileName: java.lang.String, text: java.lang.String): SourceMapSource = js.native
  def createSourceMapSource(
    fileName: java.lang.String,
    text: java.lang.String,
    skipTrivia: js.Function1[/* pos */ scala.Double, scala.Double]
  ): SourceMapSource = js.native
  def createSpread(expression: Expression): SpreadElement = js.native
  def createSpreadAssignment(expression: Expression): SpreadAssignment = js.native
  def createStrictEquality(left: Expression, right: Expression): BinaryExpression = js.native
  def createStrictInequality(left: Expression, right: Expression): BinaryExpression = js.native
  def createStringLiteral(text: java.lang.String): StringLiteral = js.native
  def createSubtract(left: Expression, right: Expression): BinaryExpression = js.native
  def createSuper(): SuperExpression = js.native
  def createSwitch(expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
  /** @deprecated */ def createTaggedTemplate(tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def createTaggedTemplate(tag: Expression, typeArguments: js.UndefOr[scala.Nothing], template: TemplateLiteral): TaggedTemplateExpression = js.native
  def createTaggedTemplate(tag: Expression, typeArguments: js.Array[TypeNode], template: TemplateLiteral): TaggedTemplateExpression = js.native
  def createTempVariable(): Identifier = js.native
  /** Create a unique temporary variable. */
  def createTempVariable(recordTempVariable: js.Function1[/* node */ Identifier, scala.Unit]): Identifier = js.native
  def createTemplateExpression(head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
  def createTemplateHead(text: java.lang.String): TemplateHead = js.native
  def createTemplateMiddle(text: java.lang.String): TemplateMiddle = js.native
  def createTemplateSpan(expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def createTemplateSpan(expression: Expression, literal: TemplateTail): TemplateSpan = js.native
  def createTemplateTail(text: java.lang.String): TemplateTail = js.native
  def createTextChangeRange(span: TextSpan, newLength: scala.Double): TextChangeRange = js.native
  def createTextSpan(start: scala.Double, length: scala.Double): TextSpan = js.native
  def createTextSpanFromBounds(start: scala.Double, end: scala.Double): TextSpan = js.native
  def createThis(): ThisExpression with Token[typescriptLib.typescriptMod.SyntaxKind.ThisKeyword] = js.native
  def createThisTypeNode(): ThisTypeNode = js.native
  def createThrow(expression: Expression): ThrowStatement = js.native
  def createToken[TKind /* <: SyntaxKind */](token: TKind): Token[TKind] = js.native
  def createTrue(): BooleanLiteral with Token[typescriptLib.typescriptMod.SyntaxKind.TrueKeyword] = js.native
  def createTry(tryBlock: Block): TryStatement = js.native
  def createTry(tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def createTry(tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def createTry(tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
  def createTupleTypeNode(elementTypes: js.Array[TypeNode]): TupleTypeNode = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: java.lang.String,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def createTypeAssertion(`type`: TypeNode, expression: Expression): TypeAssertion = js.native
  def createTypeLiteralNode(): TypeLiteralNode = js.native
  def createTypeLiteralNode(members: js.Array[TypeElement]): TypeLiteralNode = js.native
  def createTypeOf(expression: Expression): TypeOfExpression = js.native
  def createTypeOperatorNode(operator: typescriptLib.typescriptMod.SyntaxKind.KeyOfKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(operator: typescriptLib.typescriptMod.SyntaxKind.ReadonlyKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(operator: typescriptLib.typescriptMod.SyntaxKind.UniqueKeyword, `type`: TypeNode): TypeOperatorNode = js.native
  def createTypeOperatorNode(`type`: TypeNode): TypeOperatorNode = js.native
  def createTypeParameterDeclaration(name: java.lang.String): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def createTypePredicateNode(parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def createTypePredicateNode(parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  def createTypeQueryNode(exprName: EntityName): TypeQueryNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: EntityName): TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: EntityName, typeArguments: js.Array[TypeNode]): TypeReferenceNode = js.native
  def createUnionOrIntersectionTypeNode(kind: typescriptLib.typescriptMod.SyntaxKind.IntersectionType, types: js.Array[TypeNode]): UnionOrIntersectionTypeNode = js.native
  def createUnionOrIntersectionTypeNode(kind: typescriptLib.typescriptMod.SyntaxKind.UnionType, types: js.Array[TypeNode]): UnionOrIntersectionTypeNode = js.native
  def createUnionTypeNode(types: js.Array[TypeNode]): UnionTypeNode = js.native
  /** Create a unique name based on the supplied text. */
  def createUniqueName(text: java.lang.String): Identifier = js.native
  def createUnparsedSourceFile(text: java.lang.String): UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: js.UndefOr[scala.Nothing], map: java.lang.String): UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String): UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String, map: java.lang.String): UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_dts(inputFile: InputFiles, `type`: typescriptLib.typescriptLibStrings.dts): UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_dts(
    inputFile: InputFiles,
    `type`: typescriptLib.typescriptLibStrings.dts,
    stripInternal: scala.Boolean
  ): UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_js(inputFile: InputFiles, `type`: typescriptLib.typescriptLibStrings.JS): UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_js(inputFile: InputFiles, `type`: typescriptLib.typescriptLibStrings.JS, stripInternal: scala.Boolean): UnparsedSource = js.native
  def createVariableDeclaration(name: java.lang.String): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def createVariableDeclaration(name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def createVariableDeclarationList(declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  def createVariableDeclarationList(declarations: js.Array[VariableDeclaration], flags: NodeFlags): VariableDeclarationList = js.native
  def createVariableStatement(modifiers: js.UndefOr[scala.Nothing], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def createVariableStatement(modifiers: js.UndefOr[scala.Nothing], declarationList: VariableDeclarationList): VariableStatement = js.native
  def createVariableStatement(modifiers: js.Array[Modifier], declarationList: js.Array[VariableDeclaration]): VariableStatement = js.native
  def createVariableStatement(modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
  def createVoid(expression: Expression): VoidExpression = js.native
  def createVoidZero(): VoidExpression = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](configFileName: java.lang.String, optionsToExtend: js.UndefOr[scala.Nothing], system: System): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: System,
    createProgram: CreateProgram[T]
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  /**
    * Create the watch compiler host for either configFile or fileNames and its options
    */
  def createWatchCompilerHost[T /* <: BuilderProgram */](configFileName: java.lang.String, optionsToExtend: CompilerOptions, system: System): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T]
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](rootFiles: js.Array[java.lang.String], options: CompilerOptions, system: System): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  /**
    * Creates the watch from the host for config file
    */
  def createWatchProgram[T /* <: BuilderProgram */](host: WatchCompilerHostOfConfigFile[T]): WatchOfConfigFile[T] = js.native
  /**
    * Creates the watch from the host for root files and compiler options
    */
  def createWatchProgram[T /* <: BuilderProgram */](host: WatchCompilerHostOfFilesAndCompilerOptions[T]): WatchOfFilesAndCompilerOptions[T] = js.native
  def createWhile(expression: Expression, statement: Statement): WhileStatement = js.native
  def createWith(expression: Expression, statement: Statement): WithStatement = js.native
  def createYield(): YieldExpression = js.native
  def createYield(asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
  def createYield(asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
  def createYield(expression: Expression): YieldExpression = js.native
  def decodedTextSpanIntersectsWith(start1: scala.Double, length1: scala.Double, start2: scala.Double, length2: scala.Double): scala.Boolean = js.native
  def displayPartsToString(): java.lang.String = js.native
  def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): java.lang.String = js.native
  /**
    * Clears any EmitNode entries from parse-tree nodes.
    * @param sourceFile A source file.
    */
  def disposeEmitNodes(sourceFile: SourceFile): scala.Unit = js.native
  /** Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__' */
  def escapeLeadingUnderscores(identifier: java.lang.String): __String = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean]
  ): js.UndefOr[java.lang.String] = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
  def flattenDiagnosticMessageText(messageText: js.UndefOr[scala.Nothing], newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: java.lang.String, newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: DiagnosticMessageChain, newLine: java.lang.String): java.lang.String = js.native
  /**
    * Invokes a callback for each child of the given node. The 'cbNode' callback is invoked for all child nodes
    * stored in properties. If a 'cbNodes' callback is specified, it is invoked for embedded arrays; otherwise,
    * embedded arrays are flattened and the 'cbNode' callback is invoked for each element. If a callback returns
    * a truthy value, iteration stops and that value is returned. Otherwise, undefined is returned.
    *
    * @param node a given node to visit its children
    * @param cbNode a callback to be invoked for all child nodes
    * @param cbNodes a callback to be invoked for embedded array
    *
    * @remarks `forEachChild` must visit the children of a node in the order
    * that they appear in the source code. The language service depends on this property to locate nodes by position.
    */
  def forEachChild[T](node: Node, cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
  def forEachChild[T](
    node: Node,
    cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
    cbNodes: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def forEachLeadingCommentRange[U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function4[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      U
    ]
  ): js.UndefOr[U] = js.native
  def forEachLeadingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function5[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
  def forEachTrailingCommentRange[U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function4[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      U
    ]
  ): js.UndefOr[U] = js.native
  def forEachTrailingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function5[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
  def formatDiagnostic(diagnostic: Diagnostic, host: FormatDiagnosticsHost): java.lang.String = js.native
  def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): java.lang.String = js.native
  def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): java.lang.String = js.native
  /** Gets all JSDoc tags of a specified kind, or undefined if not present. */
  def getAllJSDocTagsOfKind(node: Node, kind: SyntaxKind): js.Array[JSDocTag] = js.native
  /**
    * Given a set of options, returns the set of type directive names
    *   that should be included for this program automatically.
    * This list could either come from the config file,
    *   or from enumerating the types root + initial secondary types lookup location.
    * More type directives might appear in the program later as a result of loading actual source files;
    *   this list is only the set of defaults that are implicitly included.
    */
  def getAutomaticTypeDirectiveNames(options: CompilerOptions, host: ModuleResolutionHost): js.Array[java.lang.String] = js.native
  def getCombinedModifierFlags(node: Declaration): ModifierFlags = js.native
  def getCombinedNodeFlags(node: Node): NodeFlags = js.native
  /**
    * Gets a custom text range to use when emitting comments.
    */
  def getCommentRange(node: Node): TextRange = js.native
  def getConfigFileParsingDiagnostics(configFileParseResult: ParsedCommandLine): js.Array[Diagnostic] = js.native
  def getConstantValue(node: ElementAccessExpression): js.UndefOr[java.lang.String | scala.Double] = js.native
  /**
    * Gets the constant value to emit for an expression.
    */
  def getConstantValue(node: PropertyAccessExpression): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getDefaultCompilerOptions(): CompilerOptions = js.native
  def getDefaultFormatCodeSettings(): FormatCodeSettings = js.native
  def getDefaultFormatCodeSettings(newLineCharacter: java.lang.String): FormatCodeSettings = js.native
  def getDefaultLibFileName(options: CompilerOptions): java.lang.String = js.native
  /**
    * Get the path of the default library files (lib.d.ts) as distributed with the typescript
    * node package.
    * The functionality is not supported if the ts module is consumed outside of a node module.
    */
  def getDefaultLibFilePath(options: CompilerOptions): java.lang.String = js.native
  def getEffectiveConstraintOfTypeParameter(node: TypeParameterDeclaration): js.UndefOr[TypeNode] = js.native
  /**
    * Gets the effective type parameters. If the node was parsed in a
    * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
    */
  def getEffectiveTypeParameterDeclarations(node: DeclarationWithTypeParameters): js.Array[TypeParameterDeclaration] = js.native
  def getEffectiveTypeRoots(options: CompilerOptions, host: GetEffectiveTypeRootsHost): js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Gets the EmitHelpers of a node.
    */
  def getEmitHelpers(node: Node): js.UndefOr[js.Array[EmitHelper]] = js.native
  def getGeneratedNameForNode(): Identifier = js.native
  /** Create a unique name generated for a node. */
  def getGeneratedNameForNode(node: Node): Identifier = js.native
  /** Gets the JSDoc augments tag for the node if present */
  def getJSDocAugmentsTag(node: Node): js.UndefOr[JSDocAugmentsTag] = js.native
  /** Gets the JSDoc class tag for the node if present */
  def getJSDocClassTag(node: Node): js.UndefOr[JSDocClassTag] = js.native
  /** Gets the JSDoc enum tag for the node if present */
  def getJSDocEnumTag(node: Node): js.UndefOr[JSDocEnumTag] = js.native
  /**
    * Gets the JSDoc parameter tags for the node if present.
    *
    * @remarks Returns any JSDoc param tag whose name matches the provided
    * parameter, whether a param tag on a containing function
    * expression, or a param tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are returned first, so in the previous example, the param
    * tag on the containing function expression would be first.
    *
    * For binding patterns, parameter tags are matched by position.
    */
  def getJSDocParameterTags(param: ParameterDeclaration): js.Array[JSDocParameterTag] = js.native
  /** Gets the JSDoc return tag for the node if present */
  def getJSDocReturnTag(node: Node): js.UndefOr[JSDocReturnTag] = js.native
  /**
    * Gets the return type node for the node if provided via JSDoc return tag or type tag.
    *
    * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
    * gets the type from inside the braces, after the fat arrow, etc.
    */
  def getJSDocReturnType(node: Node): js.UndefOr[TypeNode] = js.native
  /** Get all JSDoc tags related to a node, including those on parent nodes. */
  def getJSDocTags(node: Node): js.Array[JSDocTag] = js.native
  /** Gets the JSDoc template tag for the node if present */
  def getJSDocTemplateTag(node: Node): js.UndefOr[JSDocTemplateTag] = js.native
  /** Gets the JSDoc this tag for the node if present */
  def getJSDocThisTag(node: Node): js.UndefOr[JSDocThisTag] = js.native
  /**
    * Gets the type node for the node if provided via JSDoc.
    *
    * @remarks The search includes any JSDoc param tag that relates
    * to the provided parameter, for example a type tag on the
    * parameter itself, or a param tag on a containing function
    * expression, or a param tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are examined first, so in the previous example, the type
    * tag directly on the node would be returned.
    */
  def getJSDocType(node: Node): js.UndefOr[TypeNode] = js.native
  /**
    * Gets the JSDoc type parameter tags for the node if present.
    *
    * @remarks Returns any JSDoc template tag whose names match the provided
    * parameter, whether a template tag on a containing function
    * expression, or a template tag on a variable declaration whose
    * initializer is the containing function. The tags closest to the
    * node are returned first, so in the previous example, the template
    * tag on the containing function expression would be first.
    */
  def getJSDocTypeParameterTags(param: TypeParameterDeclaration): js.Array[JSDocTemplateTag] = js.native
  /** Gets the JSDoc type tag for the node if present and valid */
  def getJSDocTypeTag(node: Node): js.UndefOr[JSDocTypeTag] = js.native
  def getLeadingCommentRanges(text: java.lang.String, pos: scala.Double): js.UndefOr[js.Array[CommentRange]] = js.native
  def getLineAndCharacterOfPosition(sourceFile: SourceFileLike, position: scala.Double): LineAndCharacter = js.native
  /**
    * Creates a shallow, memberwise clone of a node for mutation.
    */
  def getMutableClone[T /* <: Node */](node: T): T = js.native
  def getNameOfDeclaration(declaration: Declaration): js.UndefOr[DeclarationName] = js.native
  def getNameOfDeclaration(declaration: Expression): js.UndefOr[DeclarationName] = js.native
  def getNameOfJSDocTypedef(declaration: JSDocTypedefTag): js.UndefOr[Identifier] = js.native
  def getNodeMajorVersion(): js.UndefOr[scala.Double] = js.native
  def getOriginalNode(): js.UndefOr[Node] = js.native
  def getOriginalNode(node: Node): js.UndefOr[Node] = js.native
  def getOriginalNode[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    nodeTest: js.Function1[/* node */ js.UndefOr[Node], /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  def getOriginalNode[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ scala.Boolean]): T = js.native
  @JSName("getOriginalNode")
  def getOriginalNode_Node(node: Node): Node = js.native
  @JSName("getOriginalNode")
  def `getOriginalNode_TNode<union>`[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ js.UndefOr[Node], /* is T */ scala.Boolean]): js.UndefOr[T] = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  def getParseTreeNode(node: Node): Node = js.native
  def getParseTreeNode[T /* <: Node */](): js.UndefOr[T] = js.native
  def getParseTreeNode[T /* <: Node */](node: js.UndefOr[scala.Nothing], nodeTest: js.Function1[/* node */ Node, /* is T */ scala.Boolean]): js.UndefOr[T] = js.native
  def getParseTreeNode[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ scala.Boolean]): js.UndefOr[T] = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  @JSName("getParseTreeNode")
  def `getParseTreeNode_TNode<union>`[T /* <: Node */](node: Node): js.UndefOr[T] = js.native
  /**
    * Reads the config file, reports errors if any and exits if the config file cannot be found
    */
  def getParsedCommandLineOfConfigFile(configFileName: java.lang.String, optionsToExtend: CompilerOptions, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = js.native
  def getParsedCommandLineOfConfigFile(
    configFileName: java.lang.String,
    optionsToExtend: CompilerOptions,
    host: ParseConfigFileHost,
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): js.UndefOr[ParsedCommandLine] = js.native
  def getPositionOfLineAndCharacter(sourceFile: SourceFileLike, line: scala.Double, character: scala.Double): scala.Double = js.native
  def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  /** Optionally, get the shebang */
  def getShebang(text: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Gets a custom text range to use when emitting source maps.
    */
  def getSourceMapRange(node: Node): SourceMapRange = js.native
  def getSupportedCodeFixes(): js.Array[java.lang.String] = js.native
  def getSyntheticLeadingComments(node: Node): js.UndefOr[js.Array[SynthesizedComment]] = js.native
  def getSyntheticTrailingComments(node: Node): js.UndefOr[js.Array[SynthesizedComment]] = js.native
  /**
    * Gets the TextRange to use for source maps for a token of a node.
    */
  def getTokenSourceMapRange(node: Node, token: SyntaxKind): js.UndefOr[SourceMapRange] = js.native
  def getTrailingCommentRanges(text: java.lang.String, pos: scala.Double): js.UndefOr[js.Array[CommentRange]] = js.native
  def getTypeParameterOwner(d: Declaration): js.UndefOr[Declaration] = js.native
  /**
    * Return true if the node has JSDoc parameter tags.
    *
    * @remarks Includes parameter tags that are not directly on the node,
    * for example on a variable declaration whose initializer is a function expression.
    */
  def hasJSDocParameterTags(node: FunctionLikeDeclaration): scala.Boolean = js.native
  def hasJSDocParameterTags(node: SignatureDeclaration): scala.Boolean = js.native
  def idText(identifier: Identifier): java.lang.String = js.native
  def isAccessor(node: Node): /* is typescript.typescript.AccessorDeclaration */ scala.Boolean = js.native
  def isArrayBindingPattern(node: Node): /* is typescript.typescript.ArrayBindingPattern */ scala.Boolean = js.native
  def isArrayLiteralExpression(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ scala.Boolean = js.native
  def isArrayTypeNode(node: Node): /* is typescript.typescript.ArrayTypeNode */ scala.Boolean = js.native
  def isArrowFunction(node: Node): /* is typescript.typescript.ArrowFunction */ scala.Boolean = js.native
  def isAsExpression(node: Node): /* is typescript.typescript.AsExpression */ scala.Boolean = js.native
  def isAssertionExpression(node: Node): /* is typescript.typescript.AssertionExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: Node): /* is typescript.typescript.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(node: Node): /* is typescript.typescript.BigIntLiteral */ scala.Boolean = js.native
  def isBinaryExpression(node: Node): /* is typescript.typescript.BinaryExpression */ scala.Boolean = js.native
  def isBindingElement(node: Node): /* is typescript.typescript.BindingElement */ scala.Boolean = js.native
  def isBindingName(node: Node): /* is typescript.typescript.BindingName */ scala.Boolean = js.native
  def isBlock(node: Node): /* is typescript.typescript.Block */ scala.Boolean = js.native
  def isBreakOrContinueStatement(node: Node): /* is typescript.typescript.BreakOrContinueStatement */ scala.Boolean = js.native
  def isBreakStatement(node: Node): /* is typescript.typescript.BreakStatement */ scala.Boolean = js.native
  def isBundle(node: Node): /* is typescript.typescript.Bundle */ scala.Boolean = js.native
  def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ scala.Boolean = js.native
  def isCallLikeExpression(node: Node): /* is typescript.typescript.CallLikeExpression */ scala.Boolean = js.native
  def isCallOrNewExpression(node: Node): scala.Boolean = js.native
  def isCallSignatureDeclaration(node: Node): /* is typescript.typescript.CallSignatureDeclaration */ scala.Boolean = js.native
  def isCaseBlock(node: Node): /* is typescript.typescript.CaseBlock */ scala.Boolean = js.native
  def isCaseClause(node: Node): /* is typescript.typescript.CaseClause */ scala.Boolean = js.native
  def isCaseOrDefaultClause(node: Node): /* is typescript.typescript.CaseOrDefaultClause */ scala.Boolean = js.native
  def isCatchClause(node: Node): /* is typescript.typescript.CatchClause */ scala.Boolean = js.native
  def isClassDeclaration(node: Node): /* is typescript.typescript.ClassDeclaration */ scala.Boolean = js.native
  def isClassElement(node: Node): /* is typescript.typescript.ClassElement */ scala.Boolean = js.native
  def isClassExpression(node: Node): /* is typescript.typescript.ClassExpression */ scala.Boolean = js.native
  def isClassLike(node: Node): /* is typescript.typescript.ClassLikeDeclaration */ scala.Boolean = js.native
  def isClassOrTypeElement(node: Node): scala.Boolean = js.native
  def isComputedPropertyName(node: Node): /* is typescript.typescript.ComputedPropertyName */ scala.Boolean = js.native
  def isConditionalExpression(node: Node): /* is typescript.typescript.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalTypeNode(node: Node): /* is typescript.typescript.ConditionalTypeNode */ scala.Boolean = js.native
  def isConstTypeReference(node: Node): scala.Boolean = js.native
  def isConstructSignatureDeclaration(node: Node): /* is typescript.typescript.ConstructSignatureDeclaration */ scala.Boolean = js.native
  def isConstructorDeclaration(node: Node): /* is typescript.typescript.ConstructorDeclaration */ scala.Boolean = js.native
  def isConstructorTypeNode(node: Node): /* is typescript.typescript.ConstructorTypeNode */ scala.Boolean = js.native
  def isContinueStatement(node: Node): /* is typescript.typescript.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: Node): /* is typescript.typescript.DebuggerStatement */ scala.Boolean = js.native
  def isDecorator(node: Node): /* is typescript.typescript.Decorator */ scala.Boolean = js.native
  def isDefaultClause(node: Node): /* is typescript.typescript.DefaultClause */ scala.Boolean = js.native
  def isDeleteExpression(node: Node): /* is typescript.typescript.DeleteExpression */ scala.Boolean = js.native
  def isDoStatement(node: Node): /* is typescript.typescript.DoStatement */ scala.Boolean = js.native
  def isElementAccessExpression(node: Node): /* is typescript.typescript.ElementAccessExpression */ scala.Boolean = js.native
  def isEmptyBindingElement(node: BindingElement): scala.Boolean = js.native
  def isEmptyBindingPattern(node: BindingName): /* is typescript.typescript.BindingPattern */ scala.Boolean = js.native
  def isEmptyStatement(node: Node): /* is typescript.typescript.EmptyStatement */ scala.Boolean = js.native
  def isEntityName(node: Node): /* is typescript.typescript.EntityName */ scala.Boolean = js.native
  def isEnumDeclaration(node: Node): /* is typescript.typescript.EnumDeclaration */ scala.Boolean = js.native
  def isEnumMember(node: Node): /* is typescript.typescript.EnumMember */ scala.Boolean = js.native
  def isExportAssignment(node: Node): /* is typescript.typescript.ExportAssignment */ scala.Boolean = js.native
  def isExportDeclaration(node: Node): /* is typescript.typescript.ExportDeclaration */ scala.Boolean = js.native
  def isExportSpecifier(node: Node): /* is typescript.typescript.ExportSpecifier */ scala.Boolean = js.native
  def isExpressionStatement(node: Node): /* is typescript.typescript.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWithTypeArguments(node: Node): /* is typescript.typescript.ExpressionWithTypeArguments */ scala.Boolean = js.native
  def isExternalModule(file: SourceFile): scala.Boolean = js.native
  def isExternalModuleNameRelative(moduleName: java.lang.String): scala.Boolean = js.native
  def isExternalModuleReference(node: Node): /* is typescript.typescript.ExternalModuleReference */ scala.Boolean = js.native
  def isForInStatement(node: Node): /* is typescript.typescript.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: Node): /* is typescript.typescript.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: Node): /* is typescript.typescript.ForStatement */ scala.Boolean = js.native
  def isFunctionDeclaration(node: Node): /* is typescript.typescript.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: Node): /* is typescript.typescript.FunctionExpression */ scala.Boolean = js.native
  def isFunctionLike(node: Node): /* is typescript.typescript.SignatureDeclaration */ scala.Boolean = js.native
  def isFunctionOrConstructorTypeNode(node: Node): scala.Boolean = js.native
  def isFunctionTypeNode(node: Node): /* is typescript.typescript.FunctionTypeNode */ scala.Boolean = js.native
  def isGetAccessor(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ scala.Boolean = js.native
  def isGetAccessorDeclaration(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ scala.Boolean = js.native
  def isHeritageClause(node: Node): /* is typescript.typescript.HeritageClause */ scala.Boolean = js.native
  def isIdentifier(node: Node): /* is typescript.typescript.Identifier */ scala.Boolean = js.native
  def isIdentifierPart(ch: scala.Double): scala.Boolean = js.native
  def isIdentifierPart(ch: scala.Double, languageVersion: ScriptTarget): scala.Boolean = js.native
  def isIdentifierStart(ch: scala.Double): scala.Boolean = js.native
  def isIdentifierStart(ch: scala.Double, languageVersion: ScriptTarget): scala.Boolean = js.native
  def isIfStatement(node: Node): /* is typescript.typescript.IfStatement */ scala.Boolean = js.native
  def isImportClause(node: Node): /* is typescript.typescript.ImportClause */ scala.Boolean = js.native
  def isImportDeclaration(node: Node): /* is typescript.typescript.ImportDeclaration */ scala.Boolean = js.native
  def isImportEqualsDeclaration(node: Node): /* is typescript.typescript.ImportEqualsDeclaration */ scala.Boolean = js.native
  def isImportOrExportSpecifier(node: Node): scala.Boolean = js.native
  def isImportSpecifier(node: Node): /* is typescript.typescript.ImportSpecifier */ scala.Boolean = js.native
  def isImportTypeNode(node: Node): /* is typescript.typescript.ImportTypeNode */ scala.Boolean = js.native
  def isIndexSignatureDeclaration(node: Node): /* is typescript.typescript.IndexSignatureDeclaration */ scala.Boolean = js.native
  def isIndexedAccessTypeNode(node: Node): /* is typescript.typescript.IndexedAccessTypeNode */ scala.Boolean = js.native
  def isInferTypeNode(node: Node): /* is typescript.typescript.InferTypeNode */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: Node): /* is typescript.typescript.InterfaceDeclaration */ scala.Boolean = js.native
  def isIntersectionTypeNode(node: Node): /* is typescript.typescript.IntersectionTypeNode */ scala.Boolean = js.native
  def isIterationStatement(node: Node, lookInLabeledStatements: scala.Boolean): scala.Boolean = js.native
  @JSName("isIterationStatement")
  def isIterationStatement_false(node: Node, lookInLabeledStatements: typescriptLib.typescriptLibNumbers.`false`): /* is typescript.typescript.IterationStatement */ scala.Boolean = js.native
  def isJSDoc(node: Node): /* is typescript.typescript.JSDoc */ scala.Boolean = js.native
  def isJSDocAllType(node: JSDocAllType): /* is typescript.typescript.JSDocAllType */ scala.Boolean = js.native
  def isJSDocAugmentsTag(node: Node): /* is typescript.typescript.JSDocAugmentsTag */ scala.Boolean = js.native
  def isJSDocCallbackTag(node: Node): /* is typescript.typescript.JSDocCallbackTag */ scala.Boolean = js.native
  def isJSDocClassTag(node: Node): /* is typescript.typescript.JSDocClassTag */ scala.Boolean = js.native
  /** True if node is of a kind that may contain comment text. */
  def isJSDocCommentContainingNode(node: Node): scala.Boolean = js.native
  def isJSDocEnumTag(node: Node): /* is typescript.typescript.JSDocEnumTag */ scala.Boolean = js.native
  def isJSDocFunctionType(node: Node): /* is typescript.typescript.JSDocFunctionType */ scala.Boolean = js.native
  def isJSDocNonNullableType(node: Node): /* is typescript.typescript.JSDocNonNullableType */ scala.Boolean = js.native
  def isJSDocNullableType(node: Node): /* is typescript.typescript.JSDocNullableType */ scala.Boolean = js.native
  def isJSDocOptionalType(node: Node): /* is typescript.typescript.JSDocOptionalType */ scala.Boolean = js.native
  def isJSDocParameterTag(node: Node): /* is typescript.typescript.JSDocParameterTag */ scala.Boolean = js.native
  def isJSDocPropertyLikeTag(node: Node): /* is typescript.typescript.JSDocPropertyLikeTag */ scala.Boolean = js.native
  def isJSDocPropertyTag(node: Node): /* is typescript.typescript.JSDocPropertyTag */ scala.Boolean = js.native
  def isJSDocReturnTag(node: Node): /* is typescript.typescript.JSDocReturnTag */ scala.Boolean = js.native
  def isJSDocSignature(node: Node): /* is typescript.typescript.JSDocSignature */ scala.Boolean = js.native
  def isJSDocTemplateTag(node: Node): /* is typescript.typescript.JSDocTemplateTag */ scala.Boolean = js.native
  def isJSDocThisTag(node: Node): /* is typescript.typescript.JSDocThisTag */ scala.Boolean = js.native
  def isJSDocTypeExpression(node: Node): /* is typescript.typescript.JSDocTypeExpression */ scala.Boolean = js.native
  def isJSDocTypeLiteral(node: Node): /* is typescript.typescript.JSDocTypeLiteral */ scala.Boolean = js.native
  def isJSDocTypeTag(node: Node): /* is typescript.typescript.JSDocTypeTag */ scala.Boolean = js.native
  def isJSDocTypedefTag(node: Node): /* is typescript.typescript.JSDocTypedefTag */ scala.Boolean = js.native
  def isJSDocUnknownType(node: Node): /* is typescript.typescript.JSDocUnknownType */ scala.Boolean = js.native
  def isJSDocVariadicType(node: Node): /* is typescript.typescript.JSDocVariadicType */ scala.Boolean = js.native
  def isJsxAttribute(node: Node): /* is typescript.typescript.JsxAttribute */ scala.Boolean = js.native
  def isJsxAttributes(node: Node): /* is typescript.typescript.JsxAttributes */ scala.Boolean = js.native
  def isJsxClosingElement(node: Node): /* is typescript.typescript.JsxClosingElement */ scala.Boolean = js.native
  def isJsxClosingFragment(node: Node): /* is typescript.typescript.JsxClosingFragment */ scala.Boolean = js.native
  def isJsxElement(node: Node): /* is typescript.typescript.JsxElement */ scala.Boolean = js.native
  def isJsxExpression(node: Node): /* is typescript.typescript.JsxExpression */ scala.Boolean = js.native
  def isJsxFragment(node: Node): /* is typescript.typescript.JsxFragment */ scala.Boolean = js.native
  def isJsxOpeningElement(node: Node): /* is typescript.typescript.JsxOpeningElement */ scala.Boolean = js.native
  def isJsxOpeningFragment(node: Node): /* is typescript.typescript.JsxOpeningFragment */ scala.Boolean = js.native
  def isJsxOpeningLikeElement(node: Node): /* is typescript.typescript.JsxOpeningLikeElement */ scala.Boolean = js.native
  def isJsxSelfClosingElement(node: Node): /* is typescript.typescript.JsxSelfClosingElement */ scala.Boolean = js.native
  def isJsxSpreadAttribute(node: Node): /* is typescript.typescript.JsxSpreadAttribute */ scala.Boolean = js.native
  def isJsxText(node: Node): /* is typescript.typescript.JsxText */ scala.Boolean = js.native
  def isLabeledStatement(node: Node): /* is typescript.typescript.LabeledStatement */ scala.Boolean = js.native
  def isLineBreak(ch: scala.Double): scala.Boolean = js.native
  def isLiteralExpression(node: Node): /* is typescript.typescript.LiteralExpression */ scala.Boolean = js.native
  def isLiteralTypeNode(node: Node): /* is typescript.typescript.LiteralTypeNode */ scala.Boolean = js.native
  def isMappedTypeNode(node: Node): /* is typescript.typescript.MappedTypeNode */ scala.Boolean = js.native
  def isMetaProperty(node: Node): /* is typescript.typescript.MetaProperty */ scala.Boolean = js.native
  def isMethodDeclaration(node: Node): /* is typescript.typescript.MethodDeclaration */ scala.Boolean = js.native
  def isMethodSignature(node: Node): /* is typescript.typescript.MethodSignature */ scala.Boolean = js.native
  def isMissingDeclaration(node: Node): /* is typescript.typescript.MissingDeclaration */ scala.Boolean = js.native
  def isModifier(node: Node): /* is typescript.typescript.Modifier */ scala.Boolean = js.native
  def isModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ scala.Boolean = js.native
  def isModuleDeclaration(node: Node): /* is typescript.typescript.ModuleDeclaration */ scala.Boolean = js.native
  def isNamedExports(node: Node): /* is typescript.typescript.NamedExports */ scala.Boolean = js.native
  def isNamedImports(node: Node): /* is typescript.typescript.NamedImports */ scala.Boolean = js.native
  def isNamespaceExportDeclaration(node: Node): /* is typescript.typescript.NamespaceExportDeclaration */ scala.Boolean = js.native
  def isNamespaceImport(node: Node): /* is typescript.typescript.NamespaceImport */ scala.Boolean = js.native
  def isNewExpression(node: Node): /* is typescript.typescript.NewExpression */ scala.Boolean = js.native
  def isNoSubstitutionTemplateLiteral(node: Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ scala.Boolean = js.native
  def isNonNullExpression(node: Node): /* is typescript.typescript.NonNullExpression */ scala.Boolean = js.native
  def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ scala.Boolean = js.native
  def isObjectBindingPattern(node: Node): /* is typescript.typescript.ObjectBindingPattern */ scala.Boolean = js.native
  def isObjectLiteralElement(node: Node): /* is typescript.typescript.ObjectLiteralElement */ scala.Boolean = js.native
  def isObjectLiteralElementLike(node: Node): /* is typescript.typescript.ObjectLiteralElementLike */ scala.Boolean = js.native
  def isObjectLiteralExpression(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ scala.Boolean = js.native
  def isOmittedExpression(node: Node): /* is typescript.typescript.OmittedExpression */ scala.Boolean = js.native
  def isParameter(node: Node): /* is typescript.typescript.ParameterDeclaration */ scala.Boolean = js.native
  def isParameterPropertyDeclaration(node: Node): /* is typescript.typescript.ParameterPropertyDeclaration */ scala.Boolean = js.native
  def isParenthesizedExpression(node: Node): /* is typescript.typescript.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedTypeNode(node: Node): /* is typescript.typescript.ParenthesizedTypeNode */ scala.Boolean = js.native
  /**
    * Gets a value indicating whether a node originated in the parse tree.
    *
    * @param node The node to test.
    */
  def isParseTreeNode(node: Node): scala.Boolean = js.native
  def isPostfixUnaryExpression(node: Node): /* is typescript.typescript.PostfixUnaryExpression */ scala.Boolean = js.native
  def isPrefixUnaryExpression(node: Node): /* is typescript.typescript.PrefixUnaryExpression */ scala.Boolean = js.native
  def isPropertyAccessExpression(node: Node): /* is typescript.typescript.PropertyAccessExpression */ scala.Boolean = js.native
  def isPropertyAccessOrQualifiedName(node: Node): scala.Boolean = js.native
  def isPropertyAssignment(node: Node): /* is typescript.typescript.PropertyAssignment */ scala.Boolean = js.native
  def isPropertyDeclaration(node: Node): /* is typescript.typescript.PropertyDeclaration */ scala.Boolean = js.native
  def isPropertyName(node: Node): /* is typescript.typescript.PropertyName */ scala.Boolean = js.native
  def isPropertySignature(node: Node): /* is typescript.typescript.PropertySignature */ scala.Boolean = js.native
  def isQualifiedName(node: Node): /* is typescript.typescript.QualifiedName */ scala.Boolean = js.native
  def isRegularExpressionLiteral(node: Node): /* is typescript.typescript.RegularExpressionLiteral */ scala.Boolean = js.native
  def isReturnStatement(node: Node): /* is typescript.typescript.ReturnStatement */ scala.Boolean = js.native
  def isSemicolonClassElement(node: Node): /* is typescript.typescript.SemicolonClassElement */ scala.Boolean = js.native
  def isSetAccessor(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ scala.Boolean = js.native
  def isSetAccessorDeclaration(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ scala.Boolean = js.native
  def isShorthandPropertyAssignment(node: Node): /* is typescript.typescript.ShorthandPropertyAssignment */ scala.Boolean = js.native
  def isSourceFile(node: Node): /* is typescript.typescript.SourceFile */ scala.Boolean = js.native
  def isSpreadAssignment(node: Node): /* is typescript.typescript.SpreadAssignment */ scala.Boolean = js.native
  def isSpreadElement(node: Node): /* is typescript.typescript.SpreadElement */ scala.Boolean = js.native
  def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralLike(node: Node): /* is typescript.typescript.StringLiteralLike */ scala.Boolean = js.native
  def isStringTextContainingNode(node: Node): scala.Boolean = js.native
  def isSwitchStatement(node: Node): /* is typescript.typescript.SwitchStatement */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: Node): /* is typescript.typescript.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateExpression(node: Node): /* is typescript.typescript.TemplateExpression */ scala.Boolean = js.native
  def isTemplateHead(node: Node): /* is typescript.typescript.TemplateHead */ scala.Boolean = js.native
  def isTemplateLiteral(node: Node): /* is typescript.typescript.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteralToken(node: Node): /* is typescript.typescript.TemplateLiteralToken */ scala.Boolean = js.native
  def isTemplateMiddle(node: Node): /* is typescript.typescript.TemplateMiddle */ scala.Boolean = js.native
  def isTemplateMiddleOrTemplateTail(node: Node): scala.Boolean = js.native
  def isTemplateSpan(node: Node): /* is typescript.typescript.TemplateSpan */ scala.Boolean = js.native
  def isTemplateTail(node: Node): /* is typescript.typescript.TemplateTail */ scala.Boolean = js.native
  def isThisTypeNode(node: Node): /* is typescript.typescript.ThisTypeNode */ scala.Boolean = js.native
  def isThrowStatement(node: Node): /* is typescript.typescript.ThrowStatement */ scala.Boolean = js.native
  /**
    * True if node is of some token syntax kind.
    * For example, this is true for an IfKeyword but not for an IfStatement.
    * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
    */
  def isToken(n: Node): scala.Boolean = js.native
  def isTryStatement(node: Node): /* is typescript.typescript.TryStatement */ scala.Boolean = js.native
  def isTupleTypeNode(node: Node): /* is typescript.typescript.TupleTypeNode */ scala.Boolean = js.native
  def isTypeAliasDeclaration(node: Node): /* is typescript.typescript.TypeAliasDeclaration */ scala.Boolean = js.native
  def isTypeAssertion(node: Node): /* is typescript.typescript.TypeAssertion */ scala.Boolean = js.native
  def isTypeElement(node: Node): /* is typescript.typescript.TypeElement */ scala.Boolean = js.native
  def isTypeLiteralNode(node: Node): /* is typescript.typescript.TypeLiteralNode */ scala.Boolean = js.native
  /**
    * Node test that determines whether a node is a valid type node.
    * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
    * of a TypeNode.
    */
  def isTypeNode(node: Node): /* is typescript.typescript.TypeNode */ scala.Boolean = js.native
  def isTypeOfExpression(node: Node): /* is typescript.typescript.TypeOfExpression */ scala.Boolean = js.native
  def isTypeOperatorNode(node: Node): /* is typescript.typescript.TypeOperatorNode */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: Node): /* is typescript.typescript.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypePredicateNode(node: Node): /* is typescript.typescript.TypePredicateNode */ scala.Boolean = js.native
  def isTypeQueryNode(node: Node): /* is typescript.typescript.TypeQueryNode */ scala.Boolean = js.native
  def isTypeReferenceNode(node: Node): /* is typescript.typescript.TypeReferenceNode */ scala.Boolean = js.native
  def isUnionTypeNode(node: Node): /* is typescript.typescript.UnionTypeNode */ scala.Boolean = js.native
  def isUnparsedNode(node: Node): /* is typescript.typescript.UnparsedNode */ scala.Boolean = js.native
  def isUnparsedPrepend(node: Node): /* is typescript.typescript.UnparsedPrepend */ scala.Boolean = js.native
  def isUnparsedSource(node: Node): /* is typescript.typescript.UnparsedSource */ scala.Boolean = js.native
  def isUnparsedTextLike(node: Node): /* is typescript.typescript.UnparsedTextLike */ scala.Boolean = js.native
  def isVariableDeclaration(node: Node): /* is typescript.typescript.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarationList(node: Node): /* is typescript.typescript.VariableDeclarationList */ scala.Boolean = js.native
  def isVariableStatement(node: Node): /* is typescript.typescript.VariableStatement */ scala.Boolean = js.native
  def isVoidExpression(node: Node): /* is typescript.typescript.VoidExpression */ scala.Boolean = js.native
  def isWhileStatement(node: Node): /* is typescript.typescript.WhileStatement */ scala.Boolean = js.native
  def isWhiteSpaceLike(ch: scala.Double): scala.Boolean = js.native
  /** Does not include line breaks. For that, see isWhiteSpaceLike. */
  def isWhiteSpaceSingleLine(ch: scala.Double): scala.Boolean = js.native
  def isWithStatement(node: Node): /* is typescript.typescript.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(node: Node): /* is typescript.typescript.YieldExpression */ scala.Boolean = js.native
  /**
    * Moves matching emit helpers from a source node to a target node.
    */
  def moveEmitHelpers(source: Node, target: Node, predicate: js.Function1[/* helper */ EmitHelper, scala.Boolean]): scala.Unit = js.native
  def moveSyntheticComments[T /* <: Node */](node: T, original: Node): T = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def parseCommandLine(commandLine: js.Array[java.lang.String]): ParsedCommandLine = js.native
  def parseCommandLine(
    commandLine: js.Array[java.lang.String],
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): ParsedCommandLine = js.native
  /**
    * Parse the text of the tsconfig.json file
    * @param fileName The path to the config file
    * @param jsonText The text of the config file
    */
  def parseConfigFileTextToJson(fileName: java.lang.String, jsonText: java.lang.String): typescriptLib.Anon_Config = js.native
  def parseIsolatedEntityName(text: java.lang.String, languageVersion: ScriptTarget): js.UndefOr[EntityName] = js.native
  /**
    * Parse the contents of a config file (tsconfig.json).
    * @param json The contents of the config file to parse
    * @param host Instance of ParseConfigHost used to enumerate files in folder.
    * @param basePath A root directory to resolve relative path entries in the config
    *    file to. e.g. outDir
    */
  def parseJsonConfigFileContent(json: js.Any, host: ParseConfigHost, basePath: java.lang.String): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(json: js.Any, host: ParseConfigHost, basePath: java.lang.String, existingOptions: CompilerOptions): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String
  ): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
  /**
    * Parse the contents of a config file (tsconfig.json).
    * @param jsonNode The contents of the config file to parse
    * @param host Instance of ParseConfigHost used to enumerate files in folder.
    * @param basePath A root directory to resolve relative path entries in the config
    *    file to. e.g. outDir
    */
  def parseJsonSourceFileConfigFileContent(sourceFile: TsConfigSourceFile, host: ParseConfigHost, basePath: java.lang.String): ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions
  ): ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String
  ): ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path]
  ): ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo]
  ): ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: TsConfigSourceFile,
    host: ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[Path],
    extraFileExtensions: js.Array[FileExtensionInfo],
    extendedConfigCache: Map[ExtendedConfigCacheEntry]
  ): ParsedCommandLine = js.native
  /**
    * Parse json text into SyntaxTree and return node and parse errors if any
    * @param fileName
    * @param sourceText
    */
  def parseJsonText(fileName: java.lang.String, sourceText: java.lang.String): JsonSourceFile = js.native
  def preProcessFile(sourceText: java.lang.String): PreProcessedFileInfo = js.native
  def preProcessFile(sourceText: java.lang.String, readImportFiles: scala.Boolean): PreProcessedFileInfo = js.native
  def preProcessFile(
    sourceText: java.lang.String,
    readImportFiles: scala.Boolean,
    detectJavaScriptImports: scala.Boolean
  ): PreProcessedFileInfo = js.native
  /**
    * Read tsconfig.json file
    * @param fileName The path to the config file
    */
  def readConfigFile(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.Anon_Config = js.native
  /**
    * Read tsconfig.json file
    * @param fileName The path to the config file
    */
  def readJsonConfigFile(
    fileName: java.lang.String,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): TsConfigSourceFile = js.native
  def reduceEachLeadingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function6[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      /* memo */ U, 
      U
    ],
    state: T,
    initial: U
  ): js.UndefOr[U] = js.native
  def reduceEachTrailingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function6[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      /* memo */ U, 
      U
    ],
    state: T,
    initial: U
  ): js.UndefOr[U] = js.native
  /**
    * Removes an EmitHelper from a node.
    */
  def removeEmitHelper(node: Node, helper: EmitHelper): scala.Boolean = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: CompilerOptions,
    host: ModuleResolutionHost,
    cache: ModuleResolutionCache,
    redirectedReference: ResolvedProjectReference
  ): ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleNameFromCache(moduleName: java.lang.String, containingFile: java.lang.String, cache: ModuleResolutionCache): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  /** @deprecated */ def resolveProjectReferencePath(host: ResolveProjectReferencePathHost, ref: ProjectReference): ResolvedConfigFileName = js.native
  /**
    * Returns the target config filename of a project reference.
    * Note: The file might not exist.
    */
  def resolveProjectReferencePath(ref: ProjectReference): ResolvedConfigFileName = js.native
  def resolveTripleslashReference(moduleName: java.lang.String, containingFile: java.lang.String): java.lang.String = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: ModuleResolutionHost,
    redirectedReference: ResolvedProjectReference
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  /**
    * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
    * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
    * is assumed to be the same as root directory of the project.
    */
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: java.lang.String,
    options: CompilerOptions,
    host: ModuleResolutionHost
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: java.lang.String,
    options: CompilerOptions,
    host: ModuleResolutionHost,
    redirectedReference: ResolvedProjectReference
  ): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  /**
    * Sets a custom text range to use when emitting comments.
    */
  def setCommentRange[T /* <: Node */](node: T, range: TextRange): T = js.native
  def setConstantValue(node: ElementAccessExpression, value: java.lang.String): PropertyAccessExpression | ElementAccessExpression = js.native
  def setConstantValue(node: ElementAccessExpression, value: scala.Double): PropertyAccessExpression | ElementAccessExpression = js.native
  /**
    * Sets the constant value to emit for an expression.
    */
  def setConstantValue(node: PropertyAccessExpression, value: java.lang.String): PropertyAccessExpression | ElementAccessExpression = js.native
  def setConstantValue(node: PropertyAccessExpression, value: scala.Double): PropertyAccessExpression | ElementAccessExpression = js.native
  /**
    * Sets flags that control emit behavior of a node.
    */
  def setEmitFlags[T /* <: Node */](node: T, emitFlags: EmitFlags): T = js.native
  def setOriginalNode[T /* <: Node */](node: T): T = js.native
  def setOriginalNode[T /* <: Node */](node: T, original: Node): T = js.native
  def setSourceMapRange[T /* <: Node */](node: T): T = js.native
  /**
    * Sets a custom text range to use when emitting source maps.
    */
  def setSourceMapRange[T /* <: Node */](node: T, range: SourceMapRange): T = js.native
  def setSyntheticLeadingComments[T /* <: Node */](node: T): T = js.native
  def setSyntheticLeadingComments[T /* <: Node */](node: T, comments: js.Array[SynthesizedComment]): T = js.native
  def setSyntheticTrailingComments[T /* <: Node */](node: T): T = js.native
  def setSyntheticTrailingComments[T /* <: Node */](node: T, comments: js.Array[SynthesizedComment]): T = js.native
  def setTextRange[T /* <: TextRange */](range: T): T = js.native
  def setTextRange[T /* <: TextRange */](range: T, location: TextRange): T = js.native
  def setTokenSourceMapRange[T /* <: Node */](node: T, token: SyntaxKind): T = js.native
  /**
    * Sets the TextRange to use for source maps for a token of a node.
    */
  def setTokenSourceMapRange[T /* <: Node */](node: T, token: SyntaxKind, range: SourceMapRange): T = js.native
  def skipPartiallyEmittedExpressions(node: Expression): Expression = js.native
  def skipPartiallyEmittedExpressions(node: Node): Node = js.native
  def sortAndDeduplicateDiagnostics[T /* <: Diagnostic */](diagnostics: js.Array[T]): SortedReadonlyArray[T] = js.native
  def symbolName(symbol: Symbol): java.lang.String = js.native
  def textChangeRangeIsUnchanged(range: TextChangeRange): scala.Boolean = js.native
  def textChangeRangeNewSpan(range: TextChangeRange): TextSpan = js.native
  def textSpanContainsPosition(span: TextSpan, position: scala.Double): scala.Boolean = js.native
  def textSpanContainsTextSpan(span: TextSpan, other: TextSpan): scala.Boolean = js.native
  def textSpanEnd(span: TextSpan): scala.Double = js.native
  def textSpanIntersection(span1: TextSpan, span2: TextSpan): js.UndefOr[TextSpan] = js.native
  def textSpanIntersectsWith(span: TextSpan, start: scala.Double, length: scala.Double): scala.Boolean = js.native
  def textSpanIntersectsWithPosition(span: TextSpan, position: scala.Double): scala.Boolean = js.native
  def textSpanIntersectsWithTextSpan(span: TextSpan, other: TextSpan): scala.Boolean = js.native
  def textSpanIsEmpty(span: TextSpan): scala.Boolean = js.native
  def textSpanOverlap(span1: TextSpan, span2: TextSpan): js.UndefOr[TextSpan] = js.native
  def textSpanOverlapsWith(span: TextSpan, other: TextSpan): scala.Boolean = js.native
  def toEditorSettings(options: EditorOptions): EditorSettings = js.native
  def toEditorSettings(options: EditorSettings): EditorSettings = js.native
  def tokenToString(t: SyntaxKind): js.UndefOr[java.lang.String] = js.native
  /**
    * Transform one or more nodes using the supplied transformers.
    * @param source A single `Node` or an array of `Node` objects.
    * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
    * @param compilerOptions Optional compiler options.
    */
  def transform[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = js.native
  def transform[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]], compilerOptions: CompilerOptions): TransformationResult[T] = js.native
  def transform[T /* <: Node */](source: js.Array[T], transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = js.native
  def transform[T /* <: Node */](
    source: js.Array[T],
    transformers: js.Array[TransformerFactory[T]],
    compilerOptions: CompilerOptions
  ): TransformationResult[T] = js.native
  def transpile(input: java.lang.String): java.lang.String = js.native
  def transpile(input: java.lang.String, compilerOptions: CompilerOptions): java.lang.String = js.native
  def transpile(input: java.lang.String, compilerOptions: CompilerOptions, fileName: java.lang.String): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[Diagnostic]
  ): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[Diagnostic],
    moduleName: java.lang.String
  ): java.lang.String = js.native
  def transpileModule(input: java.lang.String, transpileOptions: TranspileOptions): TranspileOutput = js.native
  /**
    * Remove extra underscore from escaped identifier text content.
    *
    * @param identifier The escaped identifier text.
    * @returns The unescaped identifier text.
    */
  def unescapeLeadingUnderscores(identifier: __String): java.lang.String = js.native
  def updateArrayBindingPattern(node: ArrayBindingPattern, elements: js.Array[ArrayBindingElement]): ArrayBindingPattern = js.native
  def updateArrayLiteral(node: ArrayLiteralExpression, elements: js.Array[Expression]): ArrayLiteralExpression = js.native
  def updateArrayTypeNode(node: ArrayTypeNode, elementType: TypeNode): ArrayTypeNode = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateArrowFunction(
    node: ArrowFunction,
    modifiers: js.Array[Modifier],
    typeParameters: js.Array[TypeParameterDeclaration],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    equalsGreaterThanToken: Token[typescriptLib.typescriptMod.SyntaxKind.EqualsGreaterThanToken],
    body: ConciseBody
  ): ArrowFunction = js.native
  def updateAsExpression(node: AsExpression, expression: Expression, `type`: TypeNode): AsExpression = js.native
  def updateAwait(node: AwaitExpression, expression: Expression): AwaitExpression = js.native
  def updateBinary(node: BinaryExpression, left: Expression, right: Expression): BinaryExpression = js.native
  def updateBinary(node: BinaryExpression, left: Expression, right: Expression, operator: BinaryOperator): BinaryExpression = js.native
  def updateBinary(node: BinaryExpression, left: Expression, right: Expression, operator: BinaryOperatorToken): BinaryExpression = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName
  ): BindingElement = js.native
  def updateBindingElement(
    node: BindingElement,
    dotDotDotToken: DotDotDotToken,
    propertyName: PropertyName,
    name: BindingName,
    initializer: Expression
  ): BindingElement = js.native
  def updateBlock(node: Block, statements: js.Array[Statement]): Block = js.native
  def updateBreak(node: BreakStatement): BreakStatement = js.native
  def updateBreak(node: BreakStatement, label: Identifier): BreakStatement = js.native
  def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile]): Bundle = js.native
  def updateBundle(node: Bundle, sourceFiles: js.Array[SourceFile], prepends: js.Array[UnparsedSource | InputFiles]): Bundle = js.native
  def updateCall(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def updateCall(
    node: CallExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): CallExpression = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: CallSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): CallSignatureDeclaration = js.native
  def updateCaseBlock(node: CaseBlock, clauses: js.Array[CaseOrDefaultClause]): CaseBlock = js.native
  def updateCaseClause(node: CaseClause, expression: Expression, statements: js.Array[Statement]): CaseClause = js.native
  def updateCatchClause(node: CatchClause, variableDeclaration: js.UndefOr[scala.Nothing], block: Block): CatchClause = js.native
  def updateCatchClause(node: CatchClause, variableDeclaration: VariableDeclaration, block: Block): CatchClause = js.native
  def updateClassDeclaration(
    node: ClassDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[HeritageClause]],
    members: js.Array[ClassElement]
  ): ClassDeclaration = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateClassExpression(
    node: ClassExpression,
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[ClassElement]
  ): ClassExpression = js.native
  def updateCommaList(node: CommaListExpression, elements: js.Array[Expression]): CommaListExpression = js.native
  def updateComputedPropertyName(node: ComputedPropertyName, expression: Expression): ComputedPropertyName = js.native
  def updateConditional(
    node: ConditionalExpression,
    condition: Expression,
    questionToken: Token[typescriptLib.typescriptMod.SyntaxKind.QuestionToken],
    whenTrue: Expression,
    colonToken: Token[typescriptLib.typescriptMod.SyntaxKind.ColonToken],
    whenFalse: Expression
  ): ConditionalExpression = js.native
  def updateConditionalTypeNode(
    node: ConditionalTypeNode,
    checkType: TypeNode,
    extendsType: TypeNode,
    trueType: TypeNode,
    falseType: TypeNode
  ): ConditionalTypeNode = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: ConstructSignatureDeclaration,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructSignatureDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration]
  ): ConstructorDeclaration = js.native
  def updateConstructor(
    node: ConstructorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): ConstructorDeclaration = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: ConstructorTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): ConstructorTypeNode = js.native
  def updateContinue(node: ContinueStatement): ContinueStatement = js.native
  def updateContinue(node: ContinueStatement, label: Identifier): ContinueStatement = js.native
  def updateDecorator(node: Decorator, expression: Expression): Decorator = js.native
  def updateDefaultClause(node: DefaultClause, statements: js.Array[Statement]): DefaultClause = js.native
  def updateDelete(node: DeleteExpression, expression: Expression): DeleteExpression = js.native
  def updateDo(node: DoStatement, statement: Statement, expression: Expression): DoStatement = js.native
  def updateElementAccess(node: ElementAccessExpression, expression: Expression, argumentExpression: Expression): ElementAccessExpression = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: EnumDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    members: js.Array[EnumMember]
  ): EnumDeclaration = js.native
  def updateEnumMember(node: EnumMember, name: PropertyName): EnumMember = js.native
  def updateEnumMember(node: EnumMember, name: PropertyName, initializer: Expression): EnumMember = js.native
  def updateExportAssignment(
    node: ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def updateExportAssignment(
    node: ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
  def updateExportAssignment(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExportAssignment = js.native
  def updateExportAssignment(
    node: ExportAssignment,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    expression: Expression
  ): ExportAssignment = js.native
  def updateExportDeclaration(node: ExportDeclaration): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, decorators: js.UndefOr[scala.Nothing], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    exportClause: NamedExports
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, decorators: js.Array[Decorator]): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(node: ExportDeclaration, decorators: js.Array[Decorator], modifiers: js.Array[Modifier]): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: NamedExports
  ): ExportDeclaration = js.native
  def updateExportDeclaration(
    node: ExportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    exportClause: NamedExports,
    moduleSpecifier: Expression
  ): ExportDeclaration = js.native
  def updateExportSpecifier(node: ExportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ExportSpecifier = js.native
  def updateExportSpecifier(node: ExportSpecifier, propertyName: Identifier, name: Identifier): ExportSpecifier = js.native
  def updateExpressionStatement(node: ExpressionStatement, expression: Expression): ExpressionStatement = js.native
  def updateExpressionWithTypeArguments(
    node: ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[scala.Nothing],
    expression: Expression
  ): ExpressionWithTypeArguments = js.native
  def updateExpressionWithTypeArguments(node: ExpressionWithTypeArguments, typeArguments: js.Array[TypeNode], expression: Expression): ExpressionWithTypeArguments = js.native
  def updateExternalModuleReference(node: ExternalModuleReference, expression: Expression): ExternalModuleReference = js.native
  def updateFor(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: Statement
  ): ForStatement = js.native
  def updateFor(
    node: ForStatement,
    initializer: ForInitializer,
    condition: Expression,
    incrementor: Expression,
    statement: Statement
  ): ForStatement = js.native
  def updateForIn(node: ForInStatement, initializer: ForInitializer, expression: Expression, statement: Statement): ForInStatement = js.native
  def updateForOf(
    node: ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def updateForOf(
    node: ForOfStatement,
    awaitModifier: AwaitKeywordToken,
    initializer: ForInitializer,
    expression: Expression,
    statement: Statement
  ): ForOfStatement = js.native
  def updateFunctionDeclaration(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: FunctionDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): FunctionDeclaration = js.native
  def updateFunctionExpression(
    node: FunctionExpression,
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: js.UndefOr[Identifier],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[TypeNode],
    body: Block
  ): FunctionExpression = js.native
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration]
  ): FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration]
  ): FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: FunctionTypeNode,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode
  ): FunctionTypeNode = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: GetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): GetAccessorDeclaration = js.native
  def updateHeritageClause(node: HeritageClause, types: js.Array[ExpressionWithTypeArguments]): HeritageClause = js.native
  def updateIdentifier(node: Identifier): Identifier = js.native
  def updateIf(node: IfStatement, expression: Expression, thenStatement: Statement): IfStatement = js.native
  def updateIf(node: IfStatement, expression: Expression, thenStatement: Statement, elseStatement: Statement): IfStatement = js.native
  def updateImportClause(node: ImportClause): ImportClause = js.native
  def updateImportClause(node: ImportClause, name: js.UndefOr[scala.Nothing], namedBindings: NamedImportBindings): ImportClause = js.native
  def updateImportClause(node: ImportClause, name: Identifier): ImportClause = js.native
  def updateImportClause(node: ImportClause, name: Identifier, namedBindings: NamedImportBindings): ImportClause = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportDeclaration(
    node: ImportDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    importClause: ImportClause,
    moduleSpecifier: Expression
  ): ImportDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: ImportEqualsDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    moduleReference: ModuleReference
  ): ImportEqualsDeclaration = js.native
  def updateImportSpecifier(node: ImportSpecifier, propertyName: js.UndefOr[scala.Nothing], name: Identifier): ImportSpecifier = js.native
  def updateImportSpecifier(node: ImportSpecifier, propertyName: Identifier, name: Identifier): ImportSpecifier = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName): ImportTypeNode = js.native
  def updateImportTypeNode(node: ImportTypeNode, argument: TypeNode, qualifier: EntityName, typeArguments: js.Array[TypeNode]): ImportTypeNode = js.native
  def updateImportTypeNode(
    node: ImportTypeNode,
    argument: TypeNode,
    qualifier: EntityName,
    typeArguments: js.Array[TypeNode],
    isTypeOf: scala.Boolean
  ): ImportTypeNode = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: IndexSignatureDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): IndexSignatureDeclaration = js.native
  def updateIndexedAccessTypeNode(node: IndexedAccessTypeNode, objectType: TypeNode, indexType: TypeNode): IndexedAccessTypeNode = js.native
  def updateInferTypeNode(node: InferTypeNode, typeParameter: TypeParameterDeclaration): InferTypeNode = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: InterfaceDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    heritageClauses: js.Array[HeritageClause],
    members: js.Array[TypeElement]
  ): InterfaceDeclaration = js.native
  def updateIntersectionTypeNode(node: IntersectionTypeNode, types: NodeArray[TypeNode]): IntersectionTypeNode = js.native
  def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: JsxExpression): JsxAttribute = js.native
  def updateJsxAttribute(node: JsxAttribute, name: Identifier, initializer: StringLiteral): JsxAttribute = js.native
  def updateJsxAttributes(node: JsxAttributes, properties: js.Array[JsxAttributeLike]): JsxAttributes = js.native
  def updateJsxClosingElement(node: JsxClosingElement, tagName: JsxTagNameExpression): JsxClosingElement = js.native
  def updateJsxElement(
    node: JsxElement,
    openingElement: JsxOpeningElement,
    children: js.Array[JsxChild],
    closingElement: JsxClosingElement
  ): JsxElement = js.native
  def updateJsxExpression(node: JsxExpression): JsxExpression = js.native
  def updateJsxExpression(node: JsxExpression, expression: Expression): JsxExpression = js.native
  def updateJsxFragment(
    node: JsxFragment,
    openingFragment: JsxOpeningFragment,
    children: js.Array[JsxChild],
    closingFragment: JsxClosingFragment
  ): JsxFragment = js.native
  def updateJsxOpeningElement(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
  def updateJsxOpeningElement(
    node: JsxOpeningElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxOpeningElement = js.native
  def updateJsxSelfClosingElement(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  def updateJsxSelfClosingElement(
    node: JsxSelfClosingElement,
    tagName: JsxTagNameExpression,
    typeArguments: js.Array[TypeNode],
    attributes: JsxAttributes
  ): JsxSelfClosingElement = js.native
  def updateJsxSpreadAttribute(node: JsxSpreadAttribute, expression: Expression): JsxSpreadAttribute = js.native
  def updateJsxText(node: JsxText, text: java.lang.String): JsxText = js.native
  def updateJsxText(node: JsxText, text: java.lang.String, containsOnlyTriviaWhiteSpaces: scala.Boolean): JsxText = js.native
  def updateLabel(node: LabeledStatement, label: Identifier, statement: Statement): LabeledStatement = js.native
  def updateLanguageServiceSourceFile(sourceFile: SourceFile, scriptSnapshot: IScriptSnapshot, version: java.lang.String): SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: js.UndefOr[scala.Nothing],
    aggressiveChecks: scala.Boolean
  ): SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: TextChangeRange
  ): SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: SourceFile,
    scriptSnapshot: IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: TextChangeRange,
    aggressiveChecks: scala.Boolean
  ): SourceFile = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: BooleanLiteral): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: LiteralExpression): LiteralTypeNode = js.native
  def updateLiteralTypeNode(node: LiteralTypeNode, literal: PrefixUnaryExpression): LiteralTypeNode = js.native
  def updateMappedTypeNode(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def updateMappedTypeNode(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken
  ): MappedTypeNode = js.native
  def updateMappedTypeNode(
    node: MappedTypeNode,
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken,
    `type`: TypeNode
  ): MappedTypeNode = js.native
  def updateMetaProperty(node: MetaProperty, name: Identifier): MetaProperty = js.native
  def updateMethod(
    node: MethodDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration]
  ): MethodDeclaration = js.native
  def updateMethod(
    node: MethodDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode
  ): MethodDeclaration = js.native
  def updateMethod(
    node: MethodDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    asteriskToken: js.UndefOr[AsteriskToken],
    name: PropertyName,
    questionToken: js.UndefOr[QuestionToken],
    typeParameters: js.UndefOr[js.Array[TypeParameterDeclaration]],
    parameters: js.Array[ParameterDeclaration],
    `type`: TypeNode,
    body: Block
  ): MethodDeclaration = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName
  ): MethodSignature = js.native
  def updateMethodSignature(
    node: MethodSignature,
    typeParameters: NodeArray[TypeParameterDeclaration],
    parameters: NodeArray[ParameterDeclaration],
    `type`: TypeNode,
    name: PropertyName,
    questionToken: QuestionToken
  ): MethodSignature = js.native
  def updateModuleBlock(node: ModuleBlock, statements: js.Array[Statement]): ModuleBlock = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName
  ): ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: ModuleDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: ModuleName,
    body: ModuleBody
  ): ModuleDeclaration = js.native
  def updateNamedExports(node: NamedExports, elements: js.Array[ExportSpecifier]): NamedExports = js.native
  def updateNamedImports(node: NamedImports, elements: js.Array[ImportSpecifier]): NamedImports = js.native
  def updateNamespaceExportDeclaration(node: NamespaceExportDeclaration, name: Identifier): NamespaceExportDeclaration = js.native
  def updateNamespaceImport(node: NamespaceImport, name: Identifier): NamespaceImport = js.native
  def updateNew(node: NewExpression, expression: Expression): NewExpression = js.native
  def updateNew(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def updateNew(node: NewExpression, expression: Expression, typeArguments: js.Array[TypeNode]): NewExpression = js.native
  def updateNew(
    node: NewExpression,
    expression: Expression,
    typeArguments: js.Array[TypeNode],
    argumentsArray: js.Array[Expression]
  ): NewExpression = js.native
  def updateNonNullExpression(node: NonNullExpression, expression: Expression): NonNullExpression = js.native
  def updateObjectBindingPattern(node: ObjectBindingPattern, elements: js.Array[BindingElement]): ObjectBindingPattern = js.native
  def updateObjectLiteral(node: ObjectLiteralExpression, properties: js.Array[ObjectLiteralElementLike]): ObjectLiteralExpression = js.native
  def updateOptionalTypeNode(node: OptionalTypeNode, `type`: TypeNode): OptionalTypeNode = js.native
  def updateParameter(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName
  ): ParameterDeclaration = js.native
  def updateParameter(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: QuestionToken
  ): ParameterDeclaration = js.native
  def updateParameter(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): ParameterDeclaration = js.native
  def updateParameter(
    node: ParameterDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    dotDotDotToken: js.UndefOr[DotDotDotToken],
    name: java.lang.String | BindingName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): ParameterDeclaration = js.native
  def updateParen(node: ParenthesizedExpression, expression: Expression): ParenthesizedExpression = js.native
  def updateParenthesizedType(node: ParenthesizedTypeNode, `type`: TypeNode): ParenthesizedTypeNode = js.native
  def updatePartiallyEmittedExpression(node: PartiallyEmittedExpression, expression: Expression): PartiallyEmittedExpression = js.native
  def updatePostfix(node: PostfixUnaryExpression, operand: Expression): PostfixUnaryExpression = js.native
  def updatePrefix(node: PrefixUnaryExpression, operand: Expression): PrefixUnaryExpression = js.native
  def updateProperty(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName
  ): PropertyDeclaration = js.native
  def updateProperty(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken
  ): PropertyDeclaration = js.native
  def updateProperty(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken,
    `type`: TypeNode
  ): PropertyDeclaration = js.native
  def updateProperty(
    node: PropertyDeclaration,
    decorators: js.UndefOr[js.Array[Decorator]],
    modifiers: js.UndefOr[js.Array[Modifier]],
    name: java.lang.String | PropertyName,
    questionOrExclamationToken: QuestionToken | ExclamationToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertyDeclaration = js.native
  def updatePropertyAccess(node: PropertyAccessExpression, expression: Expression, name: Identifier): PropertyAccessExpression = js.native
  def updatePropertyAssignment(node: PropertyAssignment, name: PropertyName, initializer: Expression): PropertyAssignment = js.native
  def updatePropertySignature(node: PropertySignature, modifiers: js.UndefOr[scala.Nothing], name: PropertyName): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(node: PropertySignature, modifiers: js.Array[Modifier], name: PropertyName): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode
  ): PropertySignature = js.native
  def updatePropertySignature(
    node: PropertySignature,
    modifiers: js.Array[Modifier],
    name: PropertyName,
    questionToken: QuestionToken,
    `type`: TypeNode,
    initializer: Expression
  ): PropertySignature = js.native
  def updateQualifiedName(node: QualifiedName, left: EntityName, right: Identifier): QualifiedName = js.native
  def updateRestTypeNode(node: RestTypeNode, `type`: TypeNode): RestTypeNode = js.native
  def updateReturn(node: ReturnStatement): ReturnStatement = js.native
  def updateReturn(node: ReturnStatement, expression: Expression): ReturnStatement = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration]
  ): SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: SetAccessorDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: PropertyName,
    parameters: js.Array[ParameterDeclaration],
    body: Block
  ): SetAccessorDeclaration = js.native
  def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier): ShorthandPropertyAssignment = js.native
  def updateShorthandPropertyAssignment(node: ShorthandPropertyAssignment, name: Identifier, objectAssignmentInitializer: Expression): ShorthandPropertyAssignment = js.native
  def updateSourceFile(sourceFile: SourceFile, newText: java.lang.String, textChangeRange: TextChangeRange): SourceFile = js.native
  def updateSourceFile(
    sourceFile: SourceFile,
    newText: java.lang.String,
    textChangeRange: TextChangeRange,
    aggressiveChecks: scala.Boolean
  ): SourceFile = js.native
  def updateSourceFileNode(node: SourceFile, statements: js.Array[Statement]): SourceFile = js.native
  def updateSourceFileNode(node: SourceFile, statements: js.Array[Statement], isDeclarationFile: scala.Boolean): SourceFile = js.native
  def updateSourceFileNode(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFileNode(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSourceFileNode(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: scala.Boolean
  ): SourceFile = js.native
  def updateSourceFileNode(
    node: SourceFile,
    statements: js.Array[Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[FileReference],
    typeReferences: js.Array[FileReference],
    hasNoDefaultLib: scala.Boolean,
    libReferences: js.Array[FileReference]
  ): SourceFile = js.native
  def updateSpread(node: SpreadElement, expression: Expression): SpreadElement = js.native
  def updateSpreadAssignment(node: SpreadAssignment, expression: Expression): SpreadAssignment = js.native
  def updateSwitch(node: SwitchStatement, expression: Expression, caseBlock: CaseBlock): SwitchStatement = js.native
  /** @deprecated */ def updateTaggedTemplate(node: TaggedTemplateExpression, tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = js.native
  def updateTaggedTemplate(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  def updateTaggedTemplate(
    node: TaggedTemplateExpression,
    tag: Expression,
    typeArguments: js.Array[TypeNode],
    template: TemplateLiteral
  ): TaggedTemplateExpression = js.native
  def updateTemplateExpression(node: TemplateExpression, head: TemplateHead, templateSpans: js.Array[TemplateSpan]): TemplateExpression = js.native
  def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateMiddle): TemplateSpan = js.native
  def updateTemplateSpan(node: TemplateSpan, expression: Expression, literal: TemplateTail): TemplateSpan = js.native
  def updateThrow(node: ThrowStatement, expression: Expression): ThrowStatement = js.native
  def updateTry(node: TryStatement, tryBlock: Block): TryStatement = js.native
  def updateTry(node: TryStatement, tryBlock: Block, catchClause: js.UndefOr[scala.Nothing], finallyBlock: Block): TryStatement = js.native
  def updateTry(node: TryStatement, tryBlock: Block, catchClause: CatchClause): TryStatement = js.native
  def updateTry(node: TryStatement, tryBlock: Block, catchClause: CatchClause, finallyBlock: Block): TryStatement = js.native
  def updateTupleTypeNode(node: TupleTypeNode, elementTypes: js.Array[TypeNode]): TupleTypeNode = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: TypeAliasDeclaration,
    decorators: js.Array[Decorator],
    modifiers: js.Array[Modifier],
    name: Identifier,
    typeParameters: js.Array[TypeParameterDeclaration],
    `type`: TypeNode
  ): TypeAliasDeclaration = js.native
  def updateTypeAssertion(node: TypeAssertion, `type`: TypeNode, expression: Expression): TypeAssertion = js.native
  def updateTypeLiteralNode(node: TypeLiteralNode, members: NodeArray[TypeElement]): TypeLiteralNode = js.native
  def updateTypeOf(node: TypeOfExpression, expression: Expression): TypeOfExpression = js.native
  def updateTypeOperatorNode(node: TypeOperatorNode, `type`: TypeNode): TypeOperatorNode = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: TypeParameterDeclaration,
    name: Identifier,
    constraint: js.UndefOr[scala.Nothing],
    defaultType: TypeNode
  ): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode): TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(node: TypeParameterDeclaration, name: Identifier, constraint: TypeNode, defaultType: TypeNode): TypeParameterDeclaration = js.native
  def updateTypePredicateNode(node: TypePredicateNode, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def updateTypePredicateNode(node: TypePredicateNode, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  def updateTypeQueryNode(node: TypeQueryNode, exprName: EntityName): TypeQueryNode = js.native
  def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName): TypeReferenceNode = js.native
  def updateTypeReferenceNode(node: TypeReferenceNode, typeName: EntityName, typeArguments: NodeArray[TypeNode]): TypeReferenceNode = js.native
  def updateUnionTypeNode(node: UnionTypeNode, types: NodeArray[TypeNode]): UnionTypeNode = js.native
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName): VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: VariableDeclaration,
    name: BindingName,
    `type`: js.UndefOr[scala.Nothing],
    initializer: Expression
  ): VariableDeclaration = js.native
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, `type`: TypeNode): VariableDeclaration = js.native
  def updateVariableDeclaration(node: VariableDeclaration, name: BindingName, `type`: TypeNode, initializer: Expression): VariableDeclaration = js.native
  def updateVariableDeclarationList(node: VariableDeclarationList, declarations: js.Array[VariableDeclaration]): VariableDeclarationList = js.native
  def updateVariableStatement(
    node: VariableStatement,
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: VariableDeclarationList
  ): VariableStatement = js.native
  def updateVariableStatement(node: VariableStatement, modifiers: js.Array[Modifier], declarationList: VariableDeclarationList): VariableStatement = js.native
  def updateVoid(node: VoidExpression, expression: Expression): VoidExpression = js.native
  def updateWhile(node: WhileStatement, expression: Expression, statement: Statement): WhileStatement = js.native
  def updateWith(node: WithStatement, expression: Expression, statement: Statement): WithStatement = js.native
  def updateYield(node: YieldExpression, asteriskToken: js.UndefOr[scala.Nothing], expression: Expression): YieldExpression = js.native
  def updateYield(node: YieldExpression, asteriskToken: AsteriskToken, expression: Expression): YieldExpression = js.native
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def validateLocaleAndSetLanguage(locale: java.lang.String, sys: typescriptLib.Anon_FileExists): scala.Unit = js.native
  def validateLocaleAndSetLanguage(locale: java.lang.String, sys: typescriptLib.Anon_FileExists, errors: Push[Diagnostic]): scala.Unit = js.native
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  def visitEachChild[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext): T = js.native
  def visitEachChild[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext, nodesVisitor: typescriptLib.Fn_Count): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: Node */](
    node: T,
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: typescriptLib.Fn_Count,
    tokenVisitor: Visitor
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: typescriptLib.Fn_Count
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: typescriptLib.Fn_Count,
    tokenVisitor: Visitor
  ): js.UndefOr[T] = js.native
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  @JSName("visitEachChild")
  def `visitEachChild_TNode<union>`[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext): js.UndefOr[T] = js.native
  def visitFunctionBody(node: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  def visitFunctionBody(node: FunctionBody, visitor: Visitor, context: TransformationContext): js.UndefOr[FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a concise body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  @JSName("visitFunctionBody")
  def visitFunctionBody_ConciseBody(node: ConciseBody, visitor: Visitor, context: TransformationContext): ConciseBody = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  @JSName("visitFunctionBody")
  def visitFunctionBody_FunctionBody(node: FunctionBody, visitor: Visitor, context: TransformationContext): FunctionBody = js.native
  /**
    * Starts a new lexical environment and visits a statement list, ending the lexical environment
    * and merging hoisted declarations upon completion.
    */
  def visitLexicalEnvironment(statements: NodeArray[Statement], visitor: Visitor, context: TransformationContext): NodeArray[Statement] = js.native
  def visitLexicalEnvironment(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: scala.Double
  ): NodeArray[Statement] = js.native
  def visitLexicalEnvironment(
    statements: NodeArray[Statement],
    visitor: Visitor,
    context: TransformationContext,
    start: scala.Double,
    ensureUseStrict: scala.Boolean
  ): NodeArray[Statement] = js.native
  def visitNode[T /* <: Node */](): T = js.native
  def visitNode[T /* <: Node */](node: T): T = js.native
  def visitNode[T /* <: Node */](node: T, visitor: js.UndefOr[scala.Nothing], test: js.Function1[/* node */ Node, scala.Boolean]): T = js.native
  def visitNode[T /* <: Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  def visitNode[T /* <: Node */](node: T, visitor: Visitor): T = js.native
  def visitNode[T /* <: Node */](node: T, visitor: Visitor, test: js.Function1[/* node */ Node, scala.Boolean]): T = js.native
  def visitNode[T /* <: Node */](
    node: T,
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def visitNode[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, scala.Boolean]
  ): T = js.native
  def visitNode[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  def visitNode[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor): T = js.native
  def visitNode[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean]
  ): T = js.native
  def visitNode[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): T = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](node: T): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](node: T, visitor: js.UndefOr[scala.Nothing], test: js.Function1[/* node */ Node, scala.Boolean]): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](node: T, visitor: Visitor): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](node: T, visitor: Visitor, test: js.Function1[/* node */ Node, scala.Boolean]): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](
    node: T,
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](node: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def `visitNode_TNode<union>`[T /* <: Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    lift: js.Function1[/* node */ NodeArray[Node], T]
  ): js.UndefOr[T] = js.native
  def visitNodes[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def visitNodes[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean]
  ): js.UndefOr[NodeArray[T]] = js.native
  def visitNodes[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def visitNodes[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): js.UndefOr[NodeArray[T]] = js.native
  /**
    * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
    *
    * @param nodes The NodeArray to visit.
    * @param visitor The callback used to visit a Node.
    * @param test A node test to execute for each node.
    * @param start An optional value indicating the starting offset at which to start visiting.
    * @param count An optional value indicating the maximum number of nodes to visit.
    */
  def visitNodes[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
  def visitNodes[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, scala.Boolean]): js.UndefOr[NodeArray[T]] = js.native
  def visitNodes[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[NodeArray[T]] = js.native
  def visitNodes[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): js.UndefOr[NodeArray[T]] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](nodes: js.UndefOr[scala.Nothing], visitor: Visitor): NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean]
  ): NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double
  ): NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): NodeArray[T] = js.native
  /**
    * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
    *
    * @param nodes The NodeArray to visit.
    * @param visitor The callback used to visit a Node.
    * @param test A node test to execute for each node.
    * @param start An optional value indicating the starting offset at which to start visiting.
    * @param count An optional value indicating the maximum number of nodes to visit.
    */
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, scala.Boolean]): NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double
  ): NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: Node */](
    nodes: NodeArray[T],
    visitor: Visitor,
    test: js.Function1[/* node */ Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): NodeArray[T] = js.native
  def visitParameterList(nodes: js.UndefOr[scala.Nothing], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
  def visitParameterList(
    nodes: js.UndefOr[scala.Nothing],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: typescriptLib.Fn_Count
  ): NodeArray[ParameterDeclaration] = js.native
  /**
    * Starts a new lexical environment and visits a parameter list, suspending the lexical
    * environment upon completion.
    */
  def visitParameterList(nodes: NodeArray[ParameterDeclaration], visitor: Visitor, context: TransformationContext): NodeArray[ParameterDeclaration] = js.native
  def visitParameterList(
    nodes: NodeArray[ParameterDeclaration],
    visitor: Visitor,
    context: TransformationContext,
    nodesVisitor: typescriptLib.Fn_Count
  ): NodeArray[ParameterDeclaration] = js.native
  def walkUpBindingElementsAndPatterns(binding: BindingElement): VariableDeclaration | ParameterDeclaration = js.native
}

