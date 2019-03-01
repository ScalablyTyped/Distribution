package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** @deprecated Use `createExpressionStatement` instead.  */
  val createStatement: js.Function1[
    /* expression */ typescriptLib.typescriptMod.tsNs.Expression, 
    typescriptLib.typescriptMod.tsNs.ExpressionStatement
  ] = js.native
  var disableIncrementalParsing: scala.Boolean = js.native
  /** The version of the language service API */
  val servicesVersion: /* 0.8 */ java.lang.String = js.native
  var sys: typescriptLib.typescriptMod.tsNs.System = js.native
  var unchangedTextChangeRange: typescriptLib.typescriptMod.tsNs.TextChangeRange = js.native
  /** @deprecated Use `updateExpressionStatement` instead.  */
  val updateStatement: js.Function2[
    /* node */ typescriptLib.typescriptMod.tsNs.ExpressionStatement, 
    /* expression */ typescriptLib.typescriptMod.tsNs.Expression, 
    typescriptLib.typescriptMod.tsNs.ExpressionStatement
  ] = js.native
  /** The version of the TypeScript compiler release */
  val version: java.lang.String = js.native
  val versionMajorMinor: /* 3.3 */ java.lang.String = js.native
  /**
    * Adds an EmitHelper to a node.
    */
  def addEmitHelper[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, helper: typescriptLib.typescriptMod.tsNs.EmitHelper): T = js.native
  def addEmitHelpers[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  /**
    * Add EmitHelpers to a node.
    */
  def addEmitHelpers[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, helpers: js.Array[typescriptLib.typescriptMod.tsNs.EmitHelper]): T = js.native
  def addSyntheticLeadingComment[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, kind: typescriptLib.typescriptMod.tsNs.SyntaxKind, text: java.lang.String): T = js.native
  def addSyntheticLeadingComment[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    kind: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def addSyntheticTrailingComment[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, kind: typescriptLib.typescriptMod.tsNs.SyntaxKind, text: java.lang.String): T = js.native
  def addSyntheticTrailingComment[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    kind: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    text: java.lang.String,
    hasTrailingNewLine: scala.Boolean
  ): T = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.tsNs.NonRelativeModuleNameResolutionCache
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def classicNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.tsNs.NonRelativeModuleNameResolutionCache,
    redirectedReference: typescriptLib.typescriptMod.tsNs.ResolvedProjectReference
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  /**
    * Called to merge all the changes that occurred across several versions of a script snapshot
    * into a single change.  i.e. if a user keeps making successive edits to a script we will
    * have a text change from V1 to V2, V2 to V3, ..., Vn.
    *
    * This function will then merge those changes into a single change range valid between V1 and
    * Vn.
    */
  def collapseTextChangeRangesAcrossMultipleVersions(changes: js.Array[typescriptLib.typescriptMod.tsNs.TextChangeRange]): typescriptLib.typescriptMod.tsNs.TextChangeRange = js.native
  def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: java.lang.String): typescriptLib.Anon_Errors = js.native
  def convertCompilerOptionsFromJson(jsonOptions: js.Any, basePath: java.lang.String, configFileName: java.lang.String): typescriptLib.Anon_Errors = js.native
  /**
    * Convert the json syntax tree into the json value
    */
  def convertToObject(
    sourceFile: typescriptLib.typescriptMod.tsNs.JsonSourceFile,
    errors: typescriptLib.typescriptMod.tsNs.Push[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): js.Any = js.native
  def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: java.lang.String): typescriptLib.Anon_ErrorsOptions = js.native
  def convertTypeAcquisitionFromJson(jsonOptions: js.Any, basePath: java.lang.String, configFileName: java.lang.String): typescriptLib.Anon_ErrorsOptions = js.native
  def couldStartTrivia(text: java.lang.String, pos: scala.Double): scala.Boolean = js.native
  def createAbstractBuilder(): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  /**
    * Creates a builder thats just abstraction over program and can be used with watch
    */
  def createAbstractBuilder(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String]): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(rootNames: js.UndefOr[scala.Nothing], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAbstractBuilder(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.BuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.BuilderProgram = js.native
  def createAdd(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createArrayBindingPattern(elements: js.Array[typescriptLib.typescriptMod.tsNs.ArrayBindingElement]): typescriptLib.typescriptMod.tsNs.ArrayBindingPattern = js.native
  def createArrayLiteral(): typescriptLib.typescriptMod.tsNs.ArrayLiteralExpression = js.native
  def createArrayLiteral(elements: js.Array[typescriptLib.typescriptMod.tsNs.Expression]): typescriptLib.typescriptMod.tsNs.ArrayLiteralExpression = js.native
  def createArrayLiteral(elements: js.Array[typescriptLib.typescriptMod.tsNs.Expression], multiLine: scala.Boolean): typescriptLib.typescriptMod.tsNs.ArrayLiteralExpression = js.native
  def createArrayTypeNode(elementType: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.ArrayTypeNode = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createArrowFunction(
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.EqualsGreaterThanToken,
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def createAsExpression(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.AsExpression = js.native
  def createAssignment(
    left: typescriptLib.typescriptMod.tsNs.ArrayLiteralExpression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.DestructuringAssignment = js.native
  def createAssignment(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createAssignment(
    left: typescriptLib.typescriptMod.tsNs.ObjectLiteralExpression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.DestructuringAssignment = js.native
  def createAwait(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.AwaitExpression = js.native
  def createBigIntLiteral(value: java.lang.String): typescriptLib.typescriptMod.tsNs.BigIntLiteral = js.native
  def createBinary(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    operator: typescriptLib.typescriptMod.tsNs.BinaryOperatorToken,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createBinary(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    operator: typescriptLib.typescriptMod.tsNs.BinaryOperator,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createBindingElement(dotDotDotToken: js.UndefOr[scala.Nothing], propertyName: java.lang.String, name: java.lang.String): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: java.lang.String,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: java.lang.String,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: java.lang.String,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBindingElement(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def createBlock(statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]): typescriptLib.typescriptMod.tsNs.Block = js.native
  def createBlock(statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement], multiLine: scala.Boolean): typescriptLib.typescriptMod.tsNs.Block = js.native
  def createBreak(): typescriptLib.typescriptMod.tsNs.BreakStatement = js.native
  def createBreak(label: java.lang.String): typescriptLib.typescriptMod.tsNs.BreakStatement = js.native
  def createBreak(label: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.BreakStatement = js.native
  def createBundle(sourceFiles: js.Array[typescriptLib.typescriptMod.tsNs.SourceFile]): typescriptLib.typescriptMod.tsNs.Bundle = js.native
  def createBundle(
    sourceFiles: js.Array[typescriptLib.typescriptMod.tsNs.SourceFile],
    prepends: js.Array[
      typescriptLib.typescriptMod.tsNs.UnparsedSource | typescriptLib.typescriptMod.tsNs.InputFiles
    ]
  ): typescriptLib.typescriptMod.tsNs.Bundle = js.native
  def createCall(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createCall(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createCall(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createCall(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createCallSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def createCallSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def createCaseBlock(clauses: js.Array[typescriptLib.typescriptMod.tsNs.CaseOrDefaultClause]): typescriptLib.typescriptMod.tsNs.CaseBlock = js.native
  def createCaseClause(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]
  ): typescriptLib.typescriptMod.tsNs.CaseClause = js.native
  def createCatchClause(variableDeclaration: java.lang.String, block: typescriptLib.typescriptMod.tsNs.Block): typescriptLib.typescriptMod.tsNs.CatchClause = js.native
  def createCatchClause(variableDeclaration: js.UndefOr[scala.Nothing], block: typescriptLib.typescriptMod.tsNs.Block): typescriptLib.typescriptMod.tsNs.CatchClause = js.native
  def createCatchClause(
    variableDeclaration: typescriptLib.typescriptMod.tsNs.VariableDeclaration,
    block: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.CatchClause = js.native
  def createClassDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassDeclaration = js.native
  def createClassExpression(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def createClassifier(): typescriptLib.typescriptMod.tsNs.Classifier = js.native
  def createComma(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.Expression = js.native
  def createCommaList(elements: js.Array[typescriptLib.typescriptMod.tsNs.Expression]): typescriptLib.typescriptMod.tsNs.CommaListExpression = js.native
  def createCompilerHost(options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.CompilerHost = js.native
  def createCompilerHost(options: typescriptLib.typescriptMod.tsNs.CompilerOptions, setParentNodes: scala.Boolean): typescriptLib.typescriptMod.tsNs.CompilerHost = js.native
  def createComputedPropertyName(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ComputedPropertyName = js.native
  def createConditional(
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    whenTrue: typescriptLib.typescriptMod.tsNs.Expression,
    colonToken: typescriptLib.typescriptMod.tsNs.ColonToken,
    whenFalse: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ConditionalExpression = js.native
  /** @deprecated */ def createConditional(
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    whenTrue: typescriptLib.typescriptMod.tsNs.Expression,
    whenFalse: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ConditionalExpression = js.native
  def createConditionalTypeNode(
    checkType: typescriptLib.typescriptMod.tsNs.TypeNode,
    extendsType: typescriptLib.typescriptMod.tsNs.TypeNode,
    trueType: typescriptLib.typescriptMod.tsNs.TypeNode,
    falseType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConditionalTypeNode = js.native
  def createConstructSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def createConstructSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def createConstructorTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def createConstructorTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def createContinue(): typescriptLib.typescriptMod.tsNs.ContinueStatement = js.native
  def createContinue(label: java.lang.String): typescriptLib.typescriptMod.tsNs.ContinueStatement = js.native
  def createContinue(label: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ContinueStatement = js.native
  def createDebuggerStatement(): typescriptLib.typescriptMod.tsNs.DebuggerStatement = js.native
  def createDecorator(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.Decorator = js.native
  def createDefaultClause(statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]): typescriptLib.typescriptMod.tsNs.DefaultClause = js.native
  def createDelete(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.DeleteExpression = js.native
  def createDo(
    statement: typescriptLib.typescriptMod.tsNs.Statement,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.DoStatement = js.native
  def createDocumentRegistry(): typescriptLib.typescriptMod.tsNs.DocumentRegistry = js.native
  def createDocumentRegistry(useCaseSensitiveFileNames: scala.Boolean): typescriptLib.typescriptMod.tsNs.DocumentRegistry = js.native
  def createDocumentRegistry(useCaseSensitiveFileNames: scala.Boolean, currentDirectory: java.lang.String): typescriptLib.typescriptMod.tsNs.DocumentRegistry = js.native
  def createElementAccess(expression: typescriptLib.typescriptMod.tsNs.Expression, index: scala.Double): typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  def createElementAccess(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    index: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder that can handle the changes in program and iterate through changed files
    * to emit the those files and manage semantic diagnostics cache as well
    */
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String]): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmitAndSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def createEmptyStatement(): typescriptLib.typescriptMod.tsNs.EmptyStatement = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def createEnumMember(name: java.lang.String): typescriptLib.typescriptMod.tsNs.EnumMember = js.native
  def createEnumMember(name: java.lang.String, initializer: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.EnumMember = js.native
  def createEnumMember(name: typescriptLib.typescriptMod.tsNs.PropertyName): typescriptLib.typescriptMod.tsNs.EnumMember = js.native
  def createEnumMember(
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.EnumMember = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportAssignment(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    isExportEquals: scala.Boolean,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportDeclaration(): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator]): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier]
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier]
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExportDefault(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: java.lang.String): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: java.lang.String, name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: java.lang.String): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def createExportSpecifier(propertyName: typescriptLib.typescriptMod.tsNs.Identifier, name: java.lang.String): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def createExportSpecifier(
    propertyName: typescriptLib.typescriptMod.tsNs.Identifier,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def createExpressionStatement(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ExpressionStatement = js.native
  def createExpressionWithTypeArguments(
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments = js.native
  def createExpressionWithTypeArguments(typeArguments: js.UndefOr[scala.Nothing], expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments = js.native
  def createExternalModuleExport(exportName: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def createExternalModuleReference(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ExternalModuleReference = js.native
  def createFalse(): typescriptLib.typescriptMod.tsNs.BooleanLiteral with typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind] = js.native
  /** Create a unique name based on the supplied text. This does not consider names injected by the transformer. */
  def createFileLevelUniqueName(text: java.lang.String): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createFor(
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def createForIn(
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForInStatement = js.native
  def createForOf(
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForOfStatement = js.native
  def createForOf(
    awaitModifier: typescriptLib.typescriptMod.tsNs.AwaitKeywordToken,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForOfStatement = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.FunctionDeclaration = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.FunctionDeclaration = js.native
  def createFunctionDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.FunctionDeclaration = js.native
  def createFunctionExpression(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]],
    `type`: js.UndefOr[typescriptLib.typescriptMod.tsNs.TypeNode],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.FunctionExpression = js.native
  def createFunctionTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def createFunctionTypeNode(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def createGetAccessor(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def createGetAccessor(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def createHeritageClause(
    token: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    types: js.Array[typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments]
  ): typescriptLib.typescriptMod.tsNs.HeritageClause = js.native
  def createIdentifier(text: java.lang.String): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def createIf(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    thenStatement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.IfStatement = js.native
  def createIf(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    thenStatement: typescriptLib.typescriptMod.tsNs.Statement,
    elseStatement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.IfStatement = js.native
  def createImmediatelyInvokedArrowFunction(statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createImmediatelyInvokedArrowFunction(
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    param: typescriptLib.typescriptMod.tsNs.ParameterDeclaration,
    paramValue: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createImmediatelyInvokedFunctionExpression(
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    param: typescriptLib.typescriptMod.tsNs.ParameterDeclaration,
    paramValue: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def createImportClause(): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def createImportClause(
    name: js.UndefOr[scala.Nothing],
    namedBindings: typescriptLib.typescriptMod.tsNs.NamedImportBindings
  ): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def createImportClause(name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def createImportClause(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    namedBindings: typescriptLib.typescriptMod.tsNs.NamedImportBindings
  ): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportEqualsDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def createImportSpecifier(propertyName: js.UndefOr[scala.Nothing], name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ImportSpecifier = js.native
  def createImportSpecifier(
    propertyName: typescriptLib.typescriptMod.tsNs.Identifier,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ImportSpecifier = js.native
  def createImportTypeNode(argument: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def createImportTypeNode(
    argument: typescriptLib.typescriptMod.tsNs.TypeNode,
    qualifier: typescriptLib.typescriptMod.tsNs.EntityName
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def createImportTypeNode(
    argument: typescriptLib.typescriptMod.tsNs.TypeNode,
    qualifier: typescriptLib.typescriptMod.tsNs.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def createImportTypeNode(
    argument: typescriptLib.typescriptMod.tsNs.TypeNode,
    qualifier: typescriptLib.typescriptMod.tsNs.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    isTypeOf: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def createIndexSignature(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def createIndexSignature(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def createIndexedAccessTypeNode(
    objectType: typescriptLib.typescriptMod.tsNs.TypeNode,
    indexType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexedAccessTypeNode = js.native
  def createInferTypeNode(typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration): typescriptLib.typescriptMod.tsNs.InferTypeNode = js.native
  def createInputFiles(javascriptText: java.lang.String, declarationText: java.lang.String): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: java.lang.String,
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: java.lang.String,
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: java.lang.String,
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    javascriptText: java.lang.String,
    declarationText: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    javascriptMapText: js.UndefOr[scala.Nothing],
    declarationMapPath: js.UndefOr[scala.Nothing],
    declarationMapText: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: java.lang.String,
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInputFiles(
    readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
    javascriptPath: java.lang.String,
    javascriptMapPath: js.UndefOr[scala.Nothing],
    declarationPath: java.lang.String,
    declarationMapPath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.InputFiles = js.native
  def createInterfaceDeclaration(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def createIntersectionTypeNode(types: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]): typescriptLib.typescriptMod.tsNs.IntersectionTypeNode = js.native
  def createJsxAttribute(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    initializer: typescriptLib.typescriptMod.tsNs.JsxExpression
  ): typescriptLib.typescriptMod.tsNs.JsxAttribute = js.native
  def createJsxAttribute(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    initializer: typescriptLib.typescriptMod.tsNs.StringLiteral
  ): typescriptLib.typescriptMod.tsNs.JsxAttribute = js.native
  def createJsxAttributes(properties: js.Array[typescriptLib.typescriptMod.tsNs.JsxAttributeLike]): typescriptLib.typescriptMod.tsNs.JsxAttributes = js.native
  def createJsxClosingElement(tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression): typescriptLib.typescriptMod.tsNs.JsxClosingElement = js.native
  def createJsxElement(
    openingElement: typescriptLib.typescriptMod.tsNs.JsxOpeningElement,
    children: js.Array[typescriptLib.typescriptMod.tsNs.JsxChild],
    closingElement: typescriptLib.typescriptMod.tsNs.JsxClosingElement
  ): typescriptLib.typescriptMod.tsNs.JsxElement = js.native
  def createJsxExpression(): typescriptLib.typescriptMod.tsNs.JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: js.UndefOr[scala.Nothing], expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.JsxExpression = js.native
  def createJsxExpression(dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken): typescriptLib.typescriptMod.tsNs.JsxExpression = js.native
  def createJsxExpression(
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.JsxExpression = js.native
  def createJsxFragment(
    openingFragment: typescriptLib.typescriptMod.tsNs.JsxOpeningFragment,
    children: js.Array[typescriptLib.typescriptMod.tsNs.JsxChild],
    closingFragment: typescriptLib.typescriptMod.tsNs.JsxClosingFragment
  ): typescriptLib.typescriptMod.tsNs.JsxFragment = js.native
  def createJsxOpeningElement(
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxOpeningElement = js.native
  def createJsxOpeningElement(
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxOpeningElement = js.native
  def createJsxSelfClosingElement(
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxSelfClosingElement = js.native
  def createJsxSelfClosingElement(
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxSelfClosingElement = js.native
  def createJsxSpreadAttribute(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.JsxSpreadAttribute = js.native
  def createKeywordTypeNode(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): typescriptLib.typescriptMod.tsNs.KeywordTypeNode = js.native
  def createLabel(label: java.lang.String, statement: typescriptLib.typescriptMod.tsNs.Statement): typescriptLib.typescriptMod.tsNs.LabeledStatement = js.native
  def createLabel(
    label: typescriptLib.typescriptMod.tsNs.Identifier,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.LabeledStatement = js.native
  def createLanguageService(host: typescriptLib.typescriptMod.tsNs.LanguageServiceHost): typescriptLib.typescriptMod.tsNs.LanguageService = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.tsNs.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.tsNs.DocumentRegistry
  ): typescriptLib.typescriptMod.tsNs.LanguageService = js.native
  def createLanguageService(
    host: typescriptLib.typescriptMod.tsNs.LanguageServiceHost,
    documentRegistry: typescriptLib.typescriptMod.tsNs.DocumentRegistry,
    syntaxOnly: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.LanguageService = js.native
  def createLanguageServiceSourceFile(
    fileName: java.lang.String,
    scriptSnapshot: typescriptLib.typescriptMod.tsNs.IScriptSnapshot,
    scriptTarget: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    version: java.lang.String,
    setNodeParents: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def createLanguageServiceSourceFile(
    fileName: java.lang.String,
    scriptSnapshot: typescriptLib.typescriptMod.tsNs.IScriptSnapshot,
    scriptTarget: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    version: java.lang.String,
    setNodeParents: scala.Boolean,
    scriptKind: typescriptLib.typescriptMod.tsNs.ScriptKind
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def createLessThan(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.Expression = js.native
  /** If a node is passed, creates a string literal whose source text is read from a source node during emit. */
  def createLiteral(value: java.lang.String): typescriptLib.typescriptMod.tsNs.StringLiteral = js.native
  def createLiteral(value: scala.Boolean): typescriptLib.typescriptMod.tsNs.BooleanLiteral = js.native
  def createLiteral(value: scala.Double): typescriptLib.typescriptMod.tsNs.NumericLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.StringLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.tsNs.NoSubstitutionTemplateLiteral): typescriptLib.typescriptMod.tsNs.StringLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.tsNs.NumericLiteral): typescriptLib.typescriptMod.tsNs.StringLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.tsNs.PseudoBigInt): typescriptLib.typescriptMod.tsNs.NumericLiteral = js.native
  def createLiteral(value: typescriptLib.typescriptMod.tsNs.StringLiteral): typescriptLib.typescriptMod.tsNs.StringLiteral = js.native
  def createLiteralTypeNode(literal: typescriptLib.typescriptMod.tsNs.BooleanLiteral): typescriptLib.typescriptMod.tsNs.LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: typescriptLib.typescriptMod.tsNs.LiteralExpression): typescriptLib.typescriptMod.tsNs.LiteralTypeNode = js.native
  def createLiteralTypeNode(literal: typescriptLib.typescriptMod.tsNs.PrefixUnaryExpression): typescriptLib.typescriptMod.tsNs.LiteralTypeNode = js.native
  @JSName("createLiteral")
  def createLiteral_PrimaryExpression(value: java.lang.String): typescriptLib.typescriptMod.tsNs.PrimaryExpression = js.native
  @JSName("createLiteral")
  def createLiteral_PrimaryExpression(value: scala.Boolean): typescriptLib.typescriptMod.tsNs.PrimaryExpression = js.native
  @JSName("createLiteral")
  def createLiteral_PrimaryExpression(value: scala.Double): typescriptLib.typescriptMod.tsNs.PrimaryExpression = js.native
  @JSName("createLiteral")
  def createLiteral_PrimaryExpression(value: typescriptLib.typescriptMod.tsNs.PseudoBigInt): typescriptLib.typescriptMod.tsNs.PrimaryExpression = js.native
  def createLogicalAnd(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createLogicalNot(operand: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.PrefixUnaryExpression = js.native
  def createLogicalOr(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  /** Create a unique temporary variable for use in a loop. */
  def createLoopVariable(): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[
      typescriptLib.typescriptMod.tsNs.ReadonlyToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
    ],
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration
  ): typescriptLib.typescriptMod.tsNs.MappedTypeNode = js.native
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[
      typescriptLib.typescriptMod.tsNs.ReadonlyToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
    ],
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
  ): typescriptLib.typescriptMod.tsNs.MappedTypeNode = js.native
  def createMappedTypeNode(
    readonlyToken: js.UndefOr[
      typescriptLib.typescriptMod.tsNs.ReadonlyToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
    ],
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.MappedTypeNode = js.native
  def createMetaProperty(
    keywordToken: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.MetaProperty = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.MethodDeclaration = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.MethodDeclaration = js.native
  def createMethod(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.MethodDeclaration = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createMethodSignature(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def createModifier[T /* <: js.UndefOr[typescriptLib.typescriptMod.tsNs.SyntaxKind] */](kind: T): typescriptLib.typescriptMod.tsNs.Token[T] = js.native
  def createModifiersFromModifierFlags(flags: typescriptLib.typescriptMod.tsNs.ModifierFlags): js.Array[typescriptLib.typescriptMod.tsNs.Modifier] = js.native
  def createModuleBlock(statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]): typescriptLib.typescriptMod.tsNs.ModuleBlock = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody,
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody,
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody,
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: js.UndefOr[scala.Nothing],
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody,
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def createModuleResolutionCache(
    currentDirectory: java.lang.String,
    getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String]
  ): typescriptLib.typescriptMod.tsNs.ModuleResolutionCache = js.native
  def createNamedExports(elements: js.Array[typescriptLib.typescriptMod.tsNs.ExportSpecifier]): typescriptLib.typescriptMod.tsNs.NamedExports = js.native
  def createNamedImports(elements: js.Array[typescriptLib.typescriptMod.tsNs.ImportSpecifier]): typescriptLib.typescriptMod.tsNs.NamedImports = js.native
  def createNamespaceExportDeclaration(name: java.lang.String): typescriptLib.typescriptMod.tsNs.NamespaceExportDeclaration = js.native
  def createNamespaceExportDeclaration(name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.NamespaceExportDeclaration = js.native
  def createNamespaceImport(name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.NamespaceImport = js.native
  def createNew(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def createNew(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def createNew(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def createNew(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def createNoSubstitutionTemplateLiteral(text: java.lang.String): typescriptLib.typescriptMod.tsNs.NoSubstitutionTemplateLiteral = js.native
  def createNode(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): typescriptLib.typescriptMod.tsNs.Node = js.native
  def createNode(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind, pos: scala.Double): typescriptLib.typescriptMod.tsNs.Node = js.native
  def createNode(kind: typescriptLib.typescriptMod.tsNs.SyntaxKind, pos: scala.Double, end: scala.Double): typescriptLib.typescriptMod.tsNs.Node = js.native
  def createNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  def createNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](elements: js.Array[T]): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  def createNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](elements: js.Array[T], hasTrailingComma: scala.Boolean): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  def createNonNullExpression(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.NonNullExpression = js.native
  /**
    * Creates a synthetic statement to act as a placeholder for a not-emitted statement in
    * order to preserve comments.
    *
    * @param original The original statement.
    */
  def createNotEmittedStatement(original: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.NotEmittedStatement = js.native
  def createNull(): typescriptLib.typescriptMod.tsNs.NullLiteral with typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind] = js.native
  def createNumericLiteral(value: java.lang.String): typescriptLib.typescriptMod.tsNs.NumericLiteral = js.native
  def createObjectBindingPattern(elements: js.Array[typescriptLib.typescriptMod.tsNs.BindingElement]): typescriptLib.typescriptMod.tsNs.ObjectBindingPattern = js.native
  def createObjectLiteral(): typescriptLib.typescriptMod.tsNs.ObjectLiteralExpression = js.native
  def createObjectLiteral(properties: js.Array[typescriptLib.typescriptMod.tsNs.ObjectLiteralElementLike]): typescriptLib.typescriptMod.tsNs.ObjectLiteralExpression = js.native
  def createObjectLiteral(
    properties: js.Array[typescriptLib.typescriptMod.tsNs.ObjectLiteralElementLike],
    multiLine: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.ObjectLiteralExpression = js.native
  def createOmittedExpression(): typescriptLib.typescriptMod.tsNs.OmittedExpression = js.native
  /** Create a unique name based on the supplied text. */
  def createOptimisticUniqueName(text: java.lang.String): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def createOptionalTypeNode(`type`: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.OptionalTypeNode = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParameter(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def createParen(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ParenthesizedExpression = js.native
  def createParenthesizedType(`type`: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.ParenthesizedTypeNode = js.native
  /**
    * Creates a synthetic expression to act as a placeholder for a not-emitted expression in
    * order to preserve comments or sourcemap positions.
    *
    * @param expression The inner expression to emit.
    * @param original The original outer expression.
    * @param location The location for the expression. Defaults to the positions from "original" if provided.
    */
  def createPartiallyEmittedExpression(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.PartiallyEmittedExpression = js.native
  def createPartiallyEmittedExpression(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    original: typescriptLib.typescriptMod.tsNs.Node
  ): typescriptLib.typescriptMod.tsNs.PartiallyEmittedExpression = js.native
  def createPostfix(
    operand: typescriptLib.typescriptMod.tsNs.Expression,
    operator: typescriptLib.typescriptMod.tsNs.PostfixUnaryOperator
  ): typescriptLib.typescriptMod.tsNs.PostfixUnaryExpression = js.native
  def createPostfixIncrement(operand: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.PostfixUnaryExpression = js.native
  def createPrefix(
    operator: typescriptLib.typescriptMod.tsNs.PrefixUnaryOperator,
    operand: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PrefixUnaryExpression = js.native
  def createPrinter(): typescriptLib.typescriptMod.tsNs.Printer = js.native
  def createPrinter(printerOptions: typescriptLib.typescriptMod.tsNs.PrinterOptions): typescriptLib.typescriptMod.tsNs.Printer = js.native
  def createPrinter(
    printerOptions: typescriptLib.typescriptMod.tsNs.PrinterOptions,
    handlers: typescriptLib.typescriptMod.tsNs.PrintHandlers
  ): typescriptLib.typescriptMod.tsNs.Printer = js.native
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
  def createProgram(createProgramOptions: typescriptLib.typescriptMod.tsNs.CreateProgramOptions): typescriptLib.typescriptMod.tsNs.Program = js.native
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
  def createProgram(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.Program
  ): typescriptLib.typescriptMod.tsNs.Program = js.native
  def createProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.Program,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.Program = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.ExclamationToken
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.ExclamationToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def createProperty(
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.ExclamationToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def createPropertyAccess(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression = js.native
  def createPropertyAccess(expression: typescriptLib.typescriptMod.tsNs.Expression, name: java.lang.String): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression = js.native
  def createPropertyAccess(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression = js.native
  def createPropertyAssignment(name: java.lang.String, initializer: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.PropertyAssignment = js.native
  def createPropertyAssignment(
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertyAssignment = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: typescriptLib.typescriptMod.tsNs.PropertyName | java.lang.String
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: typescriptLib.typescriptMod.tsNs.PropertyName | java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: typescriptLib.typescriptMod.tsNs.PropertyName | java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def createPropertySignature(
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: typescriptLib.typescriptMod.tsNs.PropertyName | java.lang.String,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def createQualifiedName(left: typescriptLib.typescriptMod.tsNs.EntityName, right: java.lang.String): typescriptLib.typescriptMod.tsNs.QualifiedName = js.native
  def createQualifiedName(
    left: typescriptLib.typescriptMod.tsNs.EntityName,
    right: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.QualifiedName = js.native
  def createRegularExpressionLiteral(text: java.lang.String): typescriptLib.typescriptMod.tsNs.RegularExpressionLiteral = js.native
  def createRestTypeNode(`type`: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.RestTypeNode = js.native
  def createReturn(): typescriptLib.typescriptMod.tsNs.ReturnStatement = js.native
  def createReturn(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ReturnStatement = js.native
  def createScanner(languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget, skipTrivia: scala.Boolean): typescriptLib.typescriptMod.tsNs.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.tsNs.LanguageVariant
  ): typescriptLib.typescriptMod.tsNs.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.tsNs.LanguageVariant,
    textInitial: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.tsNs.LanguageVariant,
    textInitial: java.lang.String,
    onError: typescriptLib.typescriptMod.tsNs.ErrorCallback
  ): typescriptLib.typescriptMod.tsNs.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.tsNs.LanguageVariant,
    textInitial: java.lang.String,
    onError: typescriptLib.typescriptMod.tsNs.ErrorCallback,
    start: scala.Double
  ): typescriptLib.typescriptMod.tsNs.Scanner = js.native
  def createScanner(
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    skipTrivia: scala.Boolean,
    languageVariant: typescriptLib.typescriptMod.tsNs.LanguageVariant,
    textInitial: java.lang.String,
    onError: typescriptLib.typescriptMod.tsNs.ErrorCallback,
    start: scala.Double,
    length: scala.Double
  ): typescriptLib.typescriptMod.tsNs.Scanner = js.native
  def createSemanticDiagnosticsBuilderProgram(): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder to manage semantic diagnostics and cache them
    */
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    newProgram: typescriptLib.typescriptMod.tsNs.Program,
    host: typescriptLib.typescriptMod.tsNs.BuilderProgramHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String]): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.Array[java.lang.String], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(rootNames: js.UndefOr[scala.Nothing], options: typescriptLib.typescriptMod.tsNs.CompilerOptions): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemanticDiagnosticsBuilderProgram(
    rootNames: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.CompilerHost,
    oldProgram: typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.SemanticDiagnosticsBuilderProgram = js.native
  def createSemicolonClassElement(): typescriptLib.typescriptMod.tsNs.SemicolonClassElement = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createSetAccessor(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def createShorthandPropertyAssignment(name: java.lang.String): typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: java.lang.String, objectAssignmentInitializer: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment = js.native
  def createShorthandPropertyAssignment(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    objectAssignmentInitializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    setParentNodes: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def createSourceFile(
    fileName: java.lang.String,
    sourceText: java.lang.String,
    languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget,
    setParentNodes: scala.Boolean,
    scriptKind: typescriptLib.typescriptMod.tsNs.ScriptKind
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  /**
    * Create an external source map source file reference
    */
  def createSourceMapSource(fileName: java.lang.String, text: java.lang.String): typescriptLib.typescriptMod.tsNs.SourceMapSource = js.native
  def createSourceMapSource(
    fileName: java.lang.String,
    text: java.lang.String,
    skipTrivia: js.Function1[/* pos */ scala.Double, scala.Double]
  ): typescriptLib.typescriptMod.tsNs.SourceMapSource = js.native
  def createSpread(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.SpreadElement = js.native
  def createSpreadAssignment(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.SpreadAssignment = js.native
  def createStrictEquality(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createStrictInequality(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createStringLiteral(text: java.lang.String): typescriptLib.typescriptMod.tsNs.StringLiteral = js.native
  def createSubtract(
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def createSuper(): typescriptLib.typescriptMod.tsNs.SuperExpression = js.native
  def createSwitch(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    caseBlock: typescriptLib.typescriptMod.tsNs.CaseBlock
  ): typescriptLib.typescriptMod.tsNs.SwitchStatement = js.native
  /** @deprecated */ def createTaggedTemplate(
    tag: typescriptLib.typescriptMod.tsNs.Expression,
    template: typescriptLib.typescriptMod.tsNs.TemplateLiteral
  ): typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression = js.native
  def createTaggedTemplate(
    tag: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    template: typescriptLib.typescriptMod.tsNs.TemplateLiteral
  ): typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression = js.native
  def createTaggedTemplate(
    tag: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: typescriptLib.typescriptMod.tsNs.TemplateLiteral
  ): typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression = js.native
  def createTempVariable(): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  /** Create a unique temporary variable. */
  def createTempVariable(
    recordTempVariable: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Identifier, scala.Unit]
  ): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def createTemplateExpression(
    head: typescriptLib.typescriptMod.tsNs.TemplateHead,
    templateSpans: js.Array[typescriptLib.typescriptMod.tsNs.TemplateSpan]
  ): typescriptLib.typescriptMod.tsNs.TemplateExpression = js.native
  def createTemplateHead(text: java.lang.String): typescriptLib.typescriptMod.tsNs.TemplateHead = js.native
  def createTemplateMiddle(text: java.lang.String): typescriptLib.typescriptMod.tsNs.TemplateMiddle = js.native
  def createTemplateSpan(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    literal: typescriptLib.typescriptMod.tsNs.TemplateMiddle
  ): typescriptLib.typescriptMod.tsNs.TemplateSpan = js.native
  def createTemplateSpan(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    literal: typescriptLib.typescriptMod.tsNs.TemplateTail
  ): typescriptLib.typescriptMod.tsNs.TemplateSpan = js.native
  def createTemplateTail(text: java.lang.String): typescriptLib.typescriptMod.tsNs.TemplateTail = js.native
  def createTextChangeRange(span: typescriptLib.typescriptMod.tsNs.TextSpan, newLength: scala.Double): typescriptLib.typescriptMod.tsNs.TextChangeRange = js.native
  def createTextSpan(start: scala.Double, length: scala.Double): typescriptLib.typescriptMod.tsNs.TextSpan = js.native
  def createTextSpanFromBounds(start: scala.Double, end: scala.Double): typescriptLib.typescriptMod.tsNs.TextSpan = js.native
  def createThis(): typescriptLib.typescriptMod.tsNs.ThisExpression with typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind] = js.native
  def createThisTypeNode(): typescriptLib.typescriptMod.tsNs.ThisTypeNode = js.native
  def createThrow(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.ThrowStatement = js.native
  def createToken[TKind /* <: typescriptLib.typescriptMod.tsNs.SyntaxKind */](token: TKind): typescriptLib.typescriptMod.tsNs.Token[TKind] = js.native
  def createTrue(): typescriptLib.typescriptMod.tsNs.BooleanLiteral with typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind] = js.native
  def createTry(tryBlock: typescriptLib.typescriptMod.tsNs.Block): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def createTry(
    tryBlock: typescriptLib.typescriptMod.tsNs.Block,
    catchClause: js.UndefOr[scala.Nothing],
    finallyBlock: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def createTry(
    tryBlock: typescriptLib.typescriptMod.tsNs.Block,
    catchClause: typescriptLib.typescriptMod.tsNs.CatchClause
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def createTry(
    tryBlock: typescriptLib.typescriptMod.tsNs.Block,
    catchClause: typescriptLib.typescriptMod.tsNs.CatchClause,
    finallyBlock: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def createTupleTypeNode(elementTypes: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]): typescriptLib.typescriptMod.tsNs.TupleTypeNode = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: java.lang.String,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAliasDeclaration(
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def createTypeAssertion(
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.TypeAssertion = js.native
  def createTypeLiteralNode(): typescriptLib.typescriptMod.tsNs.TypeLiteralNode = js.native
  def createTypeLiteralNode(members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]): typescriptLib.typescriptMod.tsNs.TypeLiteralNode = js.native
  def createTypeOf(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.TypeOfExpression = js.native
  def createTypeOperatorNode(
    operator: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeOperatorNode = js.native
  def createTypeOperatorNode(`type`: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.TypeOperatorNode = js.native
  def createTypeParameterDeclaration(name: java.lang.String): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: java.lang.String, constraint: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(
    name: java.lang.String,
    constraint: typescriptLib.typescriptMod.tsNs.TypeNode,
    defaultType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(name: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    constraint: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def createTypeParameterDeclaration(
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    constraint: typescriptLib.typescriptMod.tsNs.TypeNode,
    defaultType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def createTypePredicateNode(parameterName: java.lang.String, `type`: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.TypePredicateNode = js.native
  def createTypePredicateNode(
    parameterName: typescriptLib.typescriptMod.tsNs.Identifier,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypePredicateNode = js.native
  def createTypePredicateNode(
    parameterName: typescriptLib.typescriptMod.tsNs.ThisTypeNode,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypePredicateNode = js.native
  def createTypeQueryNode(exprName: typescriptLib.typescriptMod.tsNs.EntityName): typescriptLib.typescriptMod.tsNs.TypeQueryNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String): typescriptLib.typescriptMod.tsNs.TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: java.lang.String, typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]): typescriptLib.typescriptMod.tsNs.TypeReferenceNode = js.native
  def createTypeReferenceNode(typeName: typescriptLib.typescriptMod.tsNs.EntityName): typescriptLib.typescriptMod.tsNs.TypeReferenceNode = js.native
  def createTypeReferenceNode(
    typeName: typescriptLib.typescriptMod.tsNs.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.TypeReferenceNode = js.native
  def createUnionOrIntersectionTypeNode(
    kind: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    types: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.UnionOrIntersectionTypeNode = js.native
  def createUnionTypeNode(types: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]): typescriptLib.typescriptMod.tsNs.UnionTypeNode = js.native
  /** Create a unique name based on the supplied text. */
  def createUniqueName(text: java.lang.String): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def createUnparsedSourceFile(text: java.lang.String): typescriptLib.typescriptMod.tsNs.UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String): typescriptLib.typescriptMod.tsNs.UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String, map: java.lang.String): typescriptLib.typescriptMod.tsNs.UnparsedSource = js.native
  def createUnparsedSourceFile(text: java.lang.String, mapPath: js.UndefOr[scala.Nothing], map: java.lang.String): typescriptLib.typescriptMod.tsNs.UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_dts(
    inputFile: typescriptLib.typescriptMod.tsNs.InputFiles,
    `type`: typescriptLib.typescriptLibStrings.dts
  ): typescriptLib.typescriptMod.tsNs.UnparsedSource = js.native
  @JSName("createUnparsedSourceFile")
  def createUnparsedSourceFile_js(
    inputFile: typescriptLib.typescriptMod.tsNs.InputFiles,
    `type`: typescriptLib.typescriptLibStrings.JS
  ): typescriptLib.typescriptMod.tsNs.UnparsedSource = js.native
  def createVariableDeclaration(name: java.lang.String): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def createVariableDeclaration(name: java.lang.String, `type`: typescriptLib.typescriptMod.tsNs.TypeNode): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def createVariableDeclaration(
    name: java.lang.String,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def createVariableDeclaration(name: typescriptLib.typescriptMod.tsNs.BindingName): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def createVariableDeclaration(
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def createVariableDeclaration(
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def createVariableDeclarationList(declarations: js.Array[typescriptLib.typescriptMod.tsNs.VariableDeclaration]): typescriptLib.typescriptMod.tsNs.VariableDeclarationList = js.native
  def createVariableDeclarationList(
    declarations: js.Array[typescriptLib.typescriptMod.tsNs.VariableDeclaration],
    flags: typescriptLib.typescriptMod.tsNs.NodeFlags
  ): typescriptLib.typescriptMod.tsNs.VariableDeclarationList = js.native
  def createVariableStatement(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    declarationList: js.Array[typescriptLib.typescriptMod.tsNs.VariableDeclaration]
  ): typescriptLib.typescriptMod.tsNs.VariableStatement = js.native
  def createVariableStatement(
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList
  ): typescriptLib.typescriptMod.tsNs.VariableStatement = js.native
  def createVariableStatement(
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: js.Array[typescriptLib.typescriptMod.tsNs.VariableDeclaration]
  ): typescriptLib.typescriptMod.tsNs.VariableStatement = js.native
  def createVariableStatement(
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList
  ): typescriptLib.typescriptMod.tsNs.VariableStatement = js.native
  def createVoid(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.VoidExpression = js.native
  def createVoidZero(): typescriptLib.typescriptMod.tsNs.VoidExpression = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.tsNs.System
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T]
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.tsNs.WatchStatusReporter
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  /**
    * Create the watch compiler host for either configFile or fileNames and its options
    */
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T]
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.tsNs.WatchStatusReporter
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T]
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.tsNs.WatchStatusReporter
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def createWatchCompilerHost[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](
    rootFiles: js.Array[java.lang.String],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    system: typescriptLib.typescriptMod.tsNs.System,
    createProgram: typescriptLib.typescriptMod.tsNs.CreateProgram[T],
    reportDiagnostic: typescriptLib.typescriptMod.tsNs.DiagnosticReporter,
    reportWatchStatus: typescriptLib.typescriptMod.tsNs.WatchStatusReporter,
    projectReferences: js.Array[typescriptLib.typescriptMod.tsNs.ProjectReference]
  ): typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  /**
    * Creates the watch from the host for config file
    */
  def createWatchProgram[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](host: typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfConfigFile[T]): typescriptLib.typescriptMod.tsNs.WatchOfConfigFile[T] = js.native
  /**
    * Creates the watch from the host for root files and compiler options
    */
  def createWatchProgram[T /* <: typescriptLib.typescriptMod.tsNs.BuilderProgram */](host: typescriptLib.typescriptMod.tsNs.WatchCompilerHostOfFilesAndCompilerOptions[T]): typescriptLib.typescriptMod.tsNs.WatchOfFilesAndCompilerOptions[T] = js.native
  def createWhile(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.WhileStatement = js.native
  def createWith(
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.WithStatement = js.native
  def createYield(): typescriptLib.typescriptMod.tsNs.YieldExpression = js.native
  def createYield(asteriskToken: js.UndefOr[scala.Nothing], expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.YieldExpression = js.native
  def createYield(
    asteriskToken: typescriptLib.typescriptMod.tsNs.AsteriskToken,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.YieldExpression = js.native
  def createYield(expression: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.YieldExpression = js.native
  def decodedTextSpanIntersectsWith(start1: scala.Double, length1: scala.Double, start2: scala.Double, length2: scala.Double): scala.Boolean = js.native
  def displayPartsToString(): java.lang.String = js.native
  def displayPartsToString(displayParts: js.Array[typescriptLib.typescriptMod.tsNs.SymbolDisplayPart]): java.lang.String = js.native
  /**
    * Clears any EmitNode entries from parse-tree nodes.
    * @param sourceFile A source file.
    */
  def disposeEmitNodes(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile): scala.Unit = js.native
  /** Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__' */
  def escapeLeadingUnderscores(identifier: java.lang.String): typescriptLib.typescriptMod.tsNs.__String = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean]
  ): js.UndefOr[java.lang.String] = js.native
  def findConfigFile(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
  def flattenDiagnosticMessageText(messageText: java.lang.String, newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: js.UndefOr[scala.Nothing], newLine: java.lang.String): java.lang.String = js.native
  def flattenDiagnosticMessageText(messageText: typescriptLib.typescriptMod.tsNs.DiagnosticMessageChain, newLine: java.lang.String): java.lang.String = js.native
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
  def forEachChild[T](
    node: typescriptLib.typescriptMod.tsNs.Node,
    cbNode: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, js.UndefOr[T]]
  ): js.UndefOr[T] = js.native
  def forEachChild[T](
    node: typescriptLib.typescriptMod.tsNs.Node,
    cbNode: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, js.UndefOr[T]],
    cbNodes: js.Function1[
      /* nodes */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[T] = js.native
  def forEachLeadingCommentRange[U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function4[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.tsNs.CommentKind, 
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
      /* kind */ typescriptLib.typescriptMod.tsNs.CommentKind, 
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
      /* kind */ typescriptLib.typescriptMod.tsNs.CommentKind, 
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
      /* kind */ typescriptLib.typescriptMod.tsNs.CommentKind, 
      /* hasTrailingNewLine */ scala.Boolean, 
      /* state */ T, 
      U
    ],
    state: T
  ): js.UndefOr[U] = js.native
  def formatDiagnostic(
    diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic,
    host: typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def formatDiagnostics(
    diagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    host: typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def formatDiagnosticsWithColorAndContext(
    diagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    host: typescriptLib.typescriptMod.tsNs.FormatDiagnosticsHost
  ): java.lang.String = js.native
  def generateTypesForGlobal(
    name: java.lang.String,
    globalValue: js.Any,
    formatSettings: typescriptLib.typescriptMod.tsNs.FormatCodeSettings
  ): java.lang.String = js.native
  def generateTypesForModule(
    name: java.lang.String,
    moduleValue: js.Any,
    formatSettings: typescriptLib.typescriptMod.tsNs.FormatCodeSettings
  ): java.lang.String = js.native
  /** Gets all JSDoc tags of a specified kind, or undefined if not present. */
  def getAllJSDocTagsOfKind(node: typescriptLib.typescriptMod.tsNs.Node, kind: typescriptLib.typescriptMod.tsNs.SyntaxKind): js.Array[typescriptLib.typescriptMod.tsNs.JSDocTag] = js.native
  /**
    * Given a set of options, returns the set of type directive names
    *   that should be included for this program automatically.
    * This list could either come from the config file,
    *   or from enumerating the types root + initial secondary types lookup location.
    * More type directives might appear in the program later as a result of loading actual source files;
    *   this list is only the set of defaults that are implicitly included.
    */
  def getAutomaticTypeDirectiveNames(
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost
  ): js.Array[java.lang.String] = js.native
  def getCombinedModifierFlags(node: typescriptLib.typescriptMod.tsNs.Declaration): typescriptLib.typescriptMod.tsNs.ModifierFlags = js.native
  def getCombinedNodeFlags(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.NodeFlags = js.native
  /**
    * Gets a custom text range to use when emitting comments.
    */
  def getCommentRange(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.TextRange = js.native
  def getConfigFileParsingDiagnostics(configFileParseResult: typescriptLib.typescriptMod.tsNs.ParsedCommandLine): js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic] = js.native
  def getConstantValue(node: typescriptLib.typescriptMod.tsNs.ElementAccessExpression): js.UndefOr[java.lang.String | scala.Double] = js.native
  /**
    * Gets the constant value to emit for an expression.
    */
  def getConstantValue(node: typescriptLib.typescriptMod.tsNs.PropertyAccessExpression): js.UndefOr[java.lang.String | scala.Double] = js.native
  def getDefaultCompilerOptions(): typescriptLib.typescriptMod.tsNs.CompilerOptions = js.native
  def getDefaultFormatCodeSettings(): typescriptLib.typescriptMod.tsNs.FormatCodeSettings = js.native
  def getDefaultFormatCodeSettings(newLineCharacter: java.lang.String): typescriptLib.typescriptMod.tsNs.FormatCodeSettings = js.native
  def getDefaultLibFileName(options: typescriptLib.typescriptMod.tsNs.CompilerOptions): java.lang.String = js.native
  /**
    * Get the path of the default library files (lib.d.ts) as distributed with the typescript
    * node package.
    * The functionality is not supported if the ts module is consumed outside of a node module.
    */
  def getDefaultLibFilePath(options: typescriptLib.typescriptMod.tsNs.CompilerOptions): java.lang.String = js.native
  def getEffectiveConstraintOfTypeParameter(node: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration): js.UndefOr[typescriptLib.typescriptMod.tsNs.TypeNode] = js.native
  /**
    * Gets the effective type parameters. If the node was parsed in a
    * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
    */
  def getEffectiveTypeParameterDeclarations(node: typescriptLib.typescriptMod.tsNs.DeclarationWithTypeParameters): js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration] = js.native
  def getEffectiveTypeRoots(
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.GetEffectiveTypeRootsHost
  ): js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Gets the EmitHelpers of a node.
    */
  def getEmitHelpers(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.EmitHelper]] = js.native
  def getGeneratedNameForNode(): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  /** Create a unique name generated for a node. */
  def getGeneratedNameForNode(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  /** Gets the JSDoc augments tag for the node if present */
  def getJSDocAugmentsTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocAugmentsTag] = js.native
  /** Gets the JSDoc class tag for the node if present */
  def getJSDocClassTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocClassTag] = js.native
  /** Gets the JSDoc enum tag for the node if present */
  def getJSDocEnumTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocEnumTag] = js.native
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
  def getJSDocParameterTags(param: typescriptLib.typescriptMod.tsNs.ParameterDeclaration): js.Array[typescriptLib.typescriptMod.tsNs.JSDocParameterTag] = js.native
  /** Gets the JSDoc return tag for the node if present */
  def getJSDocReturnTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocReturnTag] = js.native
  /**
    * Gets the return type node for the node if provided via JSDoc return tag or type tag.
    *
    * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
    * gets the type from inside the braces, after the fat arrow, etc.
    */
  def getJSDocReturnType(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.TypeNode] = js.native
  /** Get all JSDoc tags related to a node, including those on parent nodes. */
  def getJSDocTags(node: typescriptLib.typescriptMod.tsNs.Node): js.Array[typescriptLib.typescriptMod.tsNs.JSDocTag] = js.native
  /** Gets the JSDoc template tag for the node if present */
  def getJSDocTemplateTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocTemplateTag] = js.native
  /** Gets the JSDoc this tag for the node if present */
  def getJSDocThisTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocThisTag] = js.native
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
  def getJSDocType(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.TypeNode] = js.native
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
  def getJSDocTypeParameterTags(param: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration): js.Array[typescriptLib.typescriptMod.tsNs.JSDocTemplateTag] = js.native
  /** Gets the JSDoc type tag for the node if present and valid */
  def getJSDocTypeTag(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.JSDocTypeTag] = js.native
  def getLeadingCommentRanges(text: java.lang.String, pos: scala.Double): js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.CommentRange]] = js.native
  def getLineAndCharacterOfPosition(sourceFile: typescriptLib.typescriptMod.tsNs.SourceFileLike, position: scala.Double): typescriptLib.typescriptMod.tsNs.LineAndCharacter = js.native
  /**
    * Creates a shallow, memberwise clone of a node for mutation.
    */
  def getMutableClone[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  def getNameOfDeclaration(declaration: typescriptLib.typescriptMod.tsNs.Declaration): js.UndefOr[typescriptLib.typescriptMod.tsNs.DeclarationName] = js.native
  def getNameOfDeclaration(declaration: typescriptLib.typescriptMod.tsNs.Expression): js.UndefOr[typescriptLib.typescriptMod.tsNs.DeclarationName] = js.native
  def getNameOfJSDocTypedef(declaration: typescriptLib.typescriptMod.tsNs.JSDocTypedefTag): js.UndefOr[typescriptLib.typescriptMod.tsNs.Identifier] = js.native
  def getNodeMajorVersion(): js.UndefOr[scala.Double] = js.native
  def getOriginalNode(): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getOriginalNode(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[typescriptLib.typescriptMod.tsNs.Node] = js.native
  def getOriginalNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    nodeTest: js.Function1[
      /* node */ js.UndefOr[typescriptLib.typescriptMod.tsNs.Node], 
      /* is T */ scala.Boolean
    ]
  ): js.UndefOr[T] = js.native
  def getOriginalNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: typescriptLib.typescriptMod.tsNs.Node,
    nodeTest: js.Function1[
      /* node */ js.UndefOr[typescriptLib.typescriptMod.tsNs.Node], 
      /* is T */ scala.Boolean
    ]
  ): js.UndefOr[T] = js.native
  @JSName("getOriginalNode")
  def getOriginalNode_Node(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.Node = js.native
  @JSName("getOriginalNode")
  def getOriginalNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: typescriptLib.typescriptMod.tsNs.Node,
    nodeTest: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, /* is T */ scala.Boolean]
  ): T = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  def getParseTreeNode(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.Node = js.native
  def getParseTreeNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](): js.UndefOr[T] = js.native
  def getParseTreeNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    nodeTest: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  def getParseTreeNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: typescriptLib.typescriptMod.tsNs.Node,
    nodeTest: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, /* is T */ scala.Boolean]
  ): js.UndefOr[T] = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  @JSName("getParseTreeNode")
  def getParseTreeNode_TNodeUndefOr[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[T] = js.native
  /**
    * Reads the config file, reports errors if any and exits if the config file cannot be found
    */
  def getParsedCommandLineOfConfigFile(
    configFileName: java.lang.String,
    optionsToExtend: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigFileHost
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.ParsedCommandLine] = js.native
  def getPositionOfLineAndCharacter(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFileLike,
    line: scala.Double,
    character: scala.Double
  ): scala.Double = js.native
  def getPreEmitDiagnostics(program: typescriptLib.typescriptMod.tsNs.Program): js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic] = js.native
  def getPreEmitDiagnostics(
    program: typescriptLib.typescriptMod.tsNs.Program,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile
  ): js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic] = js.native
  def getPreEmitDiagnostics(
    program: typescriptLib.typescriptMod.tsNs.Program,
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    cancellationToken: typescriptLib.typescriptMod.tsNs.CancellationToken
  ): js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic] = js.native
  /** Optionally, get the shebang */
  def getShebang(text: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Gets a custom text range to use when emitting source maps.
    */
  def getSourceMapRange(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.SourceMapRange = js.native
  def getSupportedCodeFixes(): js.Array[java.lang.String] = js.native
  def getSyntheticLeadingComments(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.SynthesizedComment]] = js.native
  def getSyntheticTrailingComments(node: typescriptLib.typescriptMod.tsNs.Node): js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.SynthesizedComment]] = js.native
  /**
    * Gets the TextRange to use for source maps for a token of a node.
    */
  def getTokenSourceMapRange(node: typescriptLib.typescriptMod.tsNs.Node, token: typescriptLib.typescriptMod.tsNs.SyntaxKind): js.UndefOr[typescriptLib.typescriptMod.tsNs.SourceMapRange] = js.native
  def getTrailingCommentRanges(text: java.lang.String, pos: scala.Double): js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.CommentRange]] = js.native
  def getTypeParameterOwner(d: typescriptLib.typescriptMod.tsNs.Declaration): js.UndefOr[typescriptLib.typescriptMod.tsNs.Declaration] = js.native
  /**
    * Return true if the node has JSDoc parameter tags.
    *
    * @remarks Includes parameter tags that are not directly on the node,
    * for example on a variable declaration whose initializer is a function expression.
    */
  def hasJSDocParameterTags(node: typescriptLib.typescriptMod.tsNs.FunctionLikeDeclaration): scala.Boolean = js.native
  def hasJSDocParameterTags(node: typescriptLib.typescriptMod.tsNs.SignatureDeclaration): scala.Boolean = js.native
  def idText(identifier: typescriptLib.typescriptMod.tsNs.Identifier): java.lang.String = js.native
  def isAccessor(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AccessorDeclaration */ scala.Boolean = js.native
  def isArrayBindingPattern(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrayBindingPattern */ scala.Boolean = js.native
  def isArrayLiteralExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrayLiteralExpression */ scala.Boolean = js.native
  def isArrayTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrayTypeNode */ scala.Boolean = js.native
  def isArrowFunction(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ArrowFunction */ scala.Boolean = js.native
  def isAsExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AsExpression */ scala.Boolean = js.native
  def isAssertionExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AssertionExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BigIntLiteral */ scala.Boolean = js.native
  def isBinaryExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BinaryExpression */ scala.Boolean = js.native
  def isBindingElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BindingElement */ scala.Boolean = js.native
  def isBindingName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BindingName */ scala.Boolean = js.native
  def isBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Block */ scala.Boolean = js.native
  def isBreakOrContinueStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BreakOrContinueStatement */ scala.Boolean = js.native
  def isBreakStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.BreakStatement */ scala.Boolean = js.native
  def isBundle(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Bundle */ scala.Boolean = js.native
  def isCallExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CallExpression */ scala.Boolean = js.native
  def isCallLikeExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CallLikeExpression */ scala.Boolean = js.native
  def isCallOrNewExpression(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isCallSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CallSignatureDeclaration */ scala.Boolean = js.native
  def isCaseBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CaseBlock */ scala.Boolean = js.native
  def isCaseClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CaseClause */ scala.Boolean = js.native
  def isCaseOrDefaultClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CaseOrDefaultClause */ scala.Boolean = js.native
  def isCatchClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.CatchClause */ scala.Boolean = js.native
  def isClassDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassDeclaration */ scala.Boolean = js.native
  def isClassElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassElement */ scala.Boolean = js.native
  def isClassExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassExpression */ scala.Boolean = js.native
  def isClassLike(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ClassLikeDeclaration */ scala.Boolean = js.native
  def isClassOrTypeElement(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isComputedPropertyName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ComputedPropertyName */ scala.Boolean = js.native
  def isConditionalExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConditionalTypeNode */ scala.Boolean = js.native
  def isConstructSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConstructSignatureDeclaration */ scala.Boolean = js.native
  def isConstructorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConstructorDeclaration */ scala.Boolean = js.native
  def isConstructorTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ConstructorTypeNode */ scala.Boolean = js.native
  def isContinueStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DebuggerStatement */ scala.Boolean = js.native
  def isDecorator(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Decorator */ scala.Boolean = js.native
  def isDefaultClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DefaultClause */ scala.Boolean = js.native
  def isDeleteExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DeleteExpression */ scala.Boolean = js.native
  def isDoStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.DoStatement */ scala.Boolean = js.native
  def isElementAccessExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ElementAccessExpression */ scala.Boolean = js.native
  def isEmptyBindingElement(node: typescriptLib.typescriptMod.tsNs.BindingElement): scala.Boolean = js.native
  def isEmptyBindingPattern(node: typescriptLib.typescriptMod.tsNs.BindingName): /* is typescript.typescript.ts.BindingPattern */ scala.Boolean = js.native
  def isEmptyStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EmptyStatement */ scala.Boolean = js.native
  def isEntityName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EntityName */ scala.Boolean = js.native
  def isEnumDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EnumDeclaration */ scala.Boolean = js.native
  def isEnumMember(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.EnumMember */ scala.Boolean = js.native
  def isExportAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExportAssignment */ scala.Boolean = js.native
  def isExportDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExportDeclaration */ scala.Boolean = js.native
  def isExportSpecifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExportSpecifier */ scala.Boolean = js.native
  def isExpressionStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWithTypeArguments(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExpressionWithTypeArguments */ scala.Boolean = js.native
  def isExternalModule(file: typescriptLib.typescriptMod.tsNs.SourceFile): scala.Boolean = js.native
  def isExternalModuleNameRelative(moduleName: java.lang.String): scala.Boolean = js.native
  def isExternalModuleReference(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ExternalModuleReference */ scala.Boolean = js.native
  def isForInStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ForStatement */ scala.Boolean = js.native
  def isFunctionDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionExpression */ scala.Boolean = js.native
  def isFunctionLike(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SignatureDeclaration */ scala.Boolean = js.native
  def isFunctionOrConstructorTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isFunctionTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.FunctionTypeNode */ scala.Boolean = js.native
  def isGetAccessor(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.GetAccessorDeclaration */ scala.Boolean = js.native
  def isGetAccessorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.GetAccessorDeclaration */ scala.Boolean = js.native
  def isHeritageClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.HeritageClause */ scala.Boolean = js.native
  def isIdentifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Identifier */ scala.Boolean = js.native
  def isIdentifierPart(ch: scala.Double): scala.Boolean = js.native
  def isIdentifierPart(ch: scala.Double, languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget): scala.Boolean = js.native
  def isIdentifierStart(ch: scala.Double): scala.Boolean = js.native
  def isIdentifierStart(ch: scala.Double, languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget): scala.Boolean = js.native
  def isIfStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IfStatement */ scala.Boolean = js.native
  def isImportClause(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportClause */ scala.Boolean = js.native
  def isImportDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportDeclaration */ scala.Boolean = js.native
  def isImportEqualsDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportEqualsDeclaration */ scala.Boolean = js.native
  def isImportOrExportSpecifier(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isImportSpecifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportSpecifier */ scala.Boolean = js.native
  def isImportTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ImportTypeNode */ scala.Boolean = js.native
  def isIndexSignatureDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IndexSignatureDeclaration */ scala.Boolean = js.native
  def isIndexedAccessTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IndexedAccessTypeNode */ scala.Boolean = js.native
  def isInferTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.InferTypeNode */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.InterfaceDeclaration */ scala.Boolean = js.native
  def isIntersectionTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.IntersectionTypeNode */ scala.Boolean = js.native
  def isIterationStatement(node: typescriptLib.typescriptMod.tsNs.Node, lookInLabeledStatements: scala.Boolean): scala.Boolean = js.native
  def isIterationStatement(
    node: typescriptLib.typescriptMod.tsNs.Node,
    lookInLabeledStatements: typescriptLib.typescriptLibNumbers.`false`
  ): /* is typescript.typescript.ts.IterationStatement */ scala.Boolean = js.native
  def isJSDoc(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDoc */ scala.Boolean = js.native
  def isJSDocAllType(node: typescriptLib.typescriptMod.tsNs.JSDocAllType): /* is typescript.typescript.ts.JSDocAllType */ scala.Boolean = js.native
  def isJSDocAugmentsTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocAugmentsTag */ scala.Boolean = js.native
  def isJSDocCallbackTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocCallbackTag */ scala.Boolean = js.native
  def isJSDocClassTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocClassTag */ scala.Boolean = js.native
  /** True if node is of a kind that may contain comment text. */
  def isJSDocCommentContainingNode(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isJSDocEnumTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocEnumTag */ scala.Boolean = js.native
  def isJSDocFunctionType(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocFunctionType */ scala.Boolean = js.native
  def isJSDocNonNullableType(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocNonNullableType */ scala.Boolean = js.native
  def isJSDocNullableType(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocNullableType */ scala.Boolean = js.native
  def isJSDocOptionalType(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocOptionalType */ scala.Boolean = js.native
  def isJSDocParameterTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocParameterTag */ scala.Boolean = js.native
  def isJSDocPropertyLikeTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocPropertyLikeTag */ scala.Boolean = js.native
  def isJSDocPropertyTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocPropertyTag */ scala.Boolean = js.native
  def isJSDocReturnTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocReturnTag */ scala.Boolean = js.native
  def isJSDocSignature(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocSignature */ scala.Boolean = js.native
  def isJSDocTemplateTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocTemplateTag */ scala.Boolean = js.native
  def isJSDocThisTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocThisTag */ scala.Boolean = js.native
  def isJSDocTypeExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocTypeExpression */ scala.Boolean = js.native
  def isJSDocTypeLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocTypeLiteral */ scala.Boolean = js.native
  def isJSDocTypeTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocTypeTag */ scala.Boolean = js.native
  def isJSDocTypedefTag(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocTypedefTag */ scala.Boolean = js.native
  def isJSDocUnknownType(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocUnknownType */ scala.Boolean = js.native
  def isJSDocVariadicType(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JSDocVariadicType */ scala.Boolean = js.native
  def isJsxAttribute(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxAttribute */ scala.Boolean = js.native
  def isJsxAttributes(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxAttributes */ scala.Boolean = js.native
  def isJsxClosingElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxClosingElement */ scala.Boolean = js.native
  def isJsxClosingFragment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxClosingFragment */ scala.Boolean = js.native
  def isJsxElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxElement */ scala.Boolean = js.native
  def isJsxExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxExpression */ scala.Boolean = js.native
  def isJsxFragment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxFragment */ scala.Boolean = js.native
  def isJsxOpeningElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxOpeningElement */ scala.Boolean = js.native
  def isJsxOpeningFragment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxOpeningFragment */ scala.Boolean = js.native
  def isJsxOpeningLikeElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxOpeningLikeElement */ scala.Boolean = js.native
  def isJsxSelfClosingElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxSelfClosingElement */ scala.Boolean = js.native
  def isJsxSpreadAttribute(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxSpreadAttribute */ scala.Boolean = js.native
  def isJsxText(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.JsxText */ scala.Boolean = js.native
  def isLabeledStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LabeledStatement */ scala.Boolean = js.native
  def isLineBreak(ch: scala.Double): scala.Boolean = js.native
  def isLiteralExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LiteralExpression */ scala.Boolean = js.native
  def isLiteralTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.LiteralTypeNode */ scala.Boolean = js.native
  def isMappedTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MappedTypeNode */ scala.Boolean = js.native
  def isMetaProperty(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MetaProperty */ scala.Boolean = js.native
  def isMethodDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MethodDeclaration */ scala.Boolean = js.native
  def isMethodSignature(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MethodSignature */ scala.Boolean = js.native
  def isMissingDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.MissingDeclaration */ scala.Boolean = js.native
  def isModifier(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.Modifier */ scala.Boolean = js.native
  def isModuleBlock(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ModuleBlock */ scala.Boolean = js.native
  def isModuleDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ModuleDeclaration */ scala.Boolean = js.native
  def isNamedExports(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamedExports */ scala.Boolean = js.native
  def isNamedImports(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamedImports */ scala.Boolean = js.native
  def isNamespaceExportDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamespaceExportDeclaration */ scala.Boolean = js.native
  def isNamespaceImport(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NamespaceImport */ scala.Boolean = js.native
  def isNewExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NewExpression */ scala.Boolean = js.native
  def isNoSubstitutionTemplateLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NoSubstitutionTemplateLiteral */ scala.Boolean = js.native
  def isNonNullExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NonNullExpression */ scala.Boolean = js.native
  def isNumericLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.NumericLiteral */ scala.Boolean = js.native
  def isObjectBindingPattern(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ObjectBindingPattern */ scala.Boolean = js.native
  def isObjectLiteralElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ObjectLiteralElement */ scala.Boolean = js.native
  def isObjectLiteralElementLike(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ObjectLiteralElementLike */ scala.Boolean = js.native
  def isObjectLiteralExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ObjectLiteralExpression */ scala.Boolean = js.native
  def isOmittedExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.OmittedExpression */ scala.Boolean = js.native
  def isParameter(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParameterDeclaration */ scala.Boolean = js.native
  def isParameterPropertyDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParameterPropertyDeclaration */ scala.Boolean = js.native
  def isParenthesizedExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ParenthesizedTypeNode */ scala.Boolean = js.native
  /**
    * Gets a value indicating whether a node originated in the parse tree.
    *
    * @param node The node to test.
    */
  def isParseTreeNode(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isPostfixUnaryExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PostfixUnaryExpression */ scala.Boolean = js.native
  def isPrefixUnaryExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PrefixUnaryExpression */ scala.Boolean = js.native
  def isPropertyAccessExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyAccessExpression */ scala.Boolean = js.native
  def isPropertyAccessOrQualifiedName(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isPropertyAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyAssignment */ scala.Boolean = js.native
  def isPropertyDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyDeclaration */ scala.Boolean = js.native
  def isPropertyName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertyName */ scala.Boolean = js.native
  def isPropertySignature(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.PropertySignature */ scala.Boolean = js.native
  def isQualifiedName(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.QualifiedName */ scala.Boolean = js.native
  def isRegularExpressionLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.RegularExpressionLiteral */ scala.Boolean = js.native
  def isReturnStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ReturnStatement */ scala.Boolean = js.native
  def isSemicolonClassElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SemicolonClassElement */ scala.Boolean = js.native
  def isSetAccessor(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SetAccessorDeclaration */ scala.Boolean = js.native
  def isSetAccessorDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SetAccessorDeclaration */ scala.Boolean = js.native
  def isShorthandPropertyAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ShorthandPropertyAssignment */ scala.Boolean = js.native
  def isSourceFile(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SourceFile */ scala.Boolean = js.native
  def isSpreadAssignment(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SpreadAssignment */ scala.Boolean = js.native
  def isSpreadElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SpreadElement */ scala.Boolean = js.native
  def isStringLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralLike(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.StringLiteralLike */ scala.Boolean = js.native
  def isStringTextContainingNode(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isSwitchStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.SwitchStatement */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateExpression */ scala.Boolean = js.native
  def isTemplateHead(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateHead */ scala.Boolean = js.native
  def isTemplateLiteral(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteralToken(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateLiteralToken */ scala.Boolean = js.native
  def isTemplateMiddle(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateMiddle */ scala.Boolean = js.native
  def isTemplateMiddleOrTemplateTail(node: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isTemplateSpan(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateSpan */ scala.Boolean = js.native
  def isTemplateTail(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TemplateTail */ scala.Boolean = js.native
  def isThisTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ThisTypeNode */ scala.Boolean = js.native
  def isThrowStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.ThrowStatement */ scala.Boolean = js.native
  /**
    * True if node is of some token syntax kind.
    * For example, this is true for an IfKeyword but not for an IfStatement.
    * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
    */
  def isToken(n: typescriptLib.typescriptMod.tsNs.Node): scala.Boolean = js.native
  def isTryStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TryStatement */ scala.Boolean = js.native
  def isTupleTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TupleTypeNode */ scala.Boolean = js.native
  def isTypeAliasDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeAliasDeclaration */ scala.Boolean = js.native
  def isTypeAssertion(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeAssertion */ scala.Boolean = js.native
  def isTypeElement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeElement */ scala.Boolean = js.native
  def isTypeLiteralNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeLiteralNode */ scala.Boolean = js.native
  /**
    * Node test that determines whether a node is a valid type node.
    * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
    * of a TypeNode.
    */
  def isTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeNode */ scala.Boolean = js.native
  def isTypeOfExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeOfExpression */ scala.Boolean = js.native
  def isTypeOperatorNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeOperatorNode */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypePredicateNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypePredicateNode */ scala.Boolean = js.native
  def isTypeQueryNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeQueryNode */ scala.Boolean = js.native
  def isTypeReferenceNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.TypeReferenceNode */ scala.Boolean = js.native
  def isUnionTypeNode(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.UnionTypeNode */ scala.Boolean = js.native
  def isUnparsedSource(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.UnparsedSource */ scala.Boolean = js.native
  def isVariableDeclaration(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarationList(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VariableDeclarationList */ scala.Boolean = js.native
  def isVariableStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VariableStatement */ scala.Boolean = js.native
  def isVoidExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.VoidExpression */ scala.Boolean = js.native
  def isWhileStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.WhileStatement */ scala.Boolean = js.native
  def isWhiteSpaceLike(ch: scala.Double): scala.Boolean = js.native
  /** Does not include line breaks. For that, see isWhiteSpaceLike. */
  def isWhiteSpaceSingleLine(ch: scala.Double): scala.Boolean = js.native
  def isWithStatement(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(node: typescriptLib.typescriptMod.tsNs.Node): /* is typescript.typescript.ts.YieldExpression */ scala.Boolean = js.native
  /**
    * Moves matching emit helpers from a source node to a target node.
    */
  def moveEmitHelpers(
    source: typescriptLib.typescriptMod.tsNs.Node,
    target: typescriptLib.typescriptMod.tsNs.Node,
    predicate: js.Function1[/* helper */ typescriptLib.typescriptMod.tsNs.EmitHelper, scala.Boolean]
  ): scala.Unit = js.native
  def moveSyntheticComments[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, original: typescriptLib.typescriptMod.tsNs.Node): T = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.tsNs.ModuleResolutionCache
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def nodeModuleNameResolver(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.tsNs.ModuleResolutionCache,
    redirectedReference: typescriptLib.typescriptMod.tsNs.ResolvedProjectReference
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def parseCommandLine(commandLine: js.Array[java.lang.String]): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseCommandLine(
    commandLine: js.Array[java.lang.String],
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  /**
    * Parse the text of the tsconfig.json file
    * @param fileName The path to the config file
    * @param jsonText The text of the config file
    */
  def parseConfigFileTextToJson(fileName: java.lang.String, jsonText: java.lang.String): typescriptLib.Anon_Config = js.native
  def parseIsolatedEntityName(text: java.lang.String, languageVersion: typescriptLib.typescriptMod.tsNs.ScriptTarget): js.UndefOr[typescriptLib.typescriptMod.tsNs.EntityName] = js.native
  /**
    * Parse the contents of a config file (tsconfig.json).
    * @param json The contents of the config file to parse
    * @param host Instance of ParseConfigHost used to enumerate files in folder.
    * @param basePath A root directory to resolve relative path entries in the config
    *    file to. e.g. outDir
    */
  def parseJsonConfigFileContent(json: js.Any, host: typescriptLib.typescriptMod.tsNs.ParseConfigHost, basePath: java.lang.String): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.tsNs.Path]
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonConfigFileContent(
    json: js.Any,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.tsNs.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.tsNs.FileExtensionInfo]
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  /**
    * Parse the contents of a config file (tsconfig.json).
    * @param jsonNode The contents of the config file to parse
    * @param host Instance of ParseConfigHost used to enumerate files in folder.
    * @param basePath A root directory to resolve relative path entries in the config
    *    file to. e.g. outDir
    */
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.tsNs.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.tsNs.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.tsNs.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.tsNs.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.tsNs.Path]
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  def parseJsonSourceFileConfigFileContent(
    sourceFile: typescriptLib.typescriptMod.tsNs.TsConfigSourceFile,
    host: typescriptLib.typescriptMod.tsNs.ParseConfigHost,
    basePath: java.lang.String,
    existingOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    configFileName: java.lang.String,
    resolutionStack: js.Array[typescriptLib.typescriptMod.tsNs.Path],
    extraFileExtensions: js.Array[typescriptLib.typescriptMod.tsNs.FileExtensionInfo]
  ): typescriptLib.typescriptMod.tsNs.ParsedCommandLine = js.native
  /**
    * Parse json text into SyntaxTree and return node and parse errors if any
    * @param fileName
    * @param sourceText
    */
  def parseJsonText(fileName: java.lang.String, sourceText: java.lang.String): typescriptLib.typescriptMod.tsNs.JsonSourceFile = js.native
  def preProcessFile(sourceText: java.lang.String): typescriptLib.typescriptMod.tsNs.PreProcessedFileInfo = js.native
  def preProcessFile(sourceText: java.lang.String, readImportFiles: scala.Boolean): typescriptLib.typescriptMod.tsNs.PreProcessedFileInfo = js.native
  def preProcessFile(
    sourceText: java.lang.String,
    readImportFiles: scala.Boolean,
    detectJavaScriptImports: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.PreProcessedFileInfo = js.native
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
  ): typescriptLib.typescriptMod.tsNs.TsConfigSourceFile = js.native
  def reduceEachLeadingCommentRange[T, U](
    text: java.lang.String,
    pos: scala.Double,
    cb: js.Function6[
      /* pos */ scala.Double, 
      /* end */ scala.Double, 
      /* kind */ typescriptLib.typescriptMod.tsNs.CommentKind, 
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
      /* kind */ typescriptLib.typescriptMod.tsNs.CommentKind, 
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
  def removeEmitHelper(node: typescriptLib.typescriptMod.tsNs.Node, helper: typescriptLib.typescriptMod.tsNs.EmitHelper): scala.Boolean = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.tsNs.ModuleResolutionCache
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleName(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    cache: typescriptLib.typescriptMod.tsNs.ModuleResolutionCache,
    redirectedReference: typescriptLib.typescriptMod.tsNs.ResolvedProjectReference
  ): typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations = js.native
  def resolveModuleNameFromCache(
    moduleName: java.lang.String,
    containingFile: java.lang.String,
    cache: typescriptLib.typescriptMod.tsNs.ModuleResolutionCache
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.ResolvedModuleWithFailedLookupLocations] = js.native
  /** @deprecated */ def resolveProjectReferencePath(
    host: typescriptLib.typescriptMod.tsNs.ResolveProjectReferencePathHost,
    ref: typescriptLib.typescriptMod.tsNs.ProjectReference
  ): typescriptLib.typescriptMod.tsNs.ResolvedConfigFileName = js.native
  /**
    * Returns the target config filename of a project reference.
    * Note: The file might not exist.
    */
  def resolveProjectReferencePath(ref: typescriptLib.typescriptMod.tsNs.ProjectReference): typescriptLib.typescriptMod.tsNs.ResolvedConfigFileName = js.native
  def resolveTripleslashReference(moduleName: java.lang.String, containingFile: java.lang.String): java.lang.String = js.native
  /**
    * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
    * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
    * is assumed to be the same as root directory of the project.
    */
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: java.lang.String,
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost
  ): typescriptLib.typescriptMod.tsNs.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: java.lang.String,
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    redirectedReference: typescriptLib.typescriptMod.tsNs.ResolvedProjectReference
  ): typescriptLib.typescriptMod.tsNs.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost
  ): typescriptLib.typescriptMod.tsNs.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  def resolveTypeReferenceDirective(
    typeReferenceDirectiveName: java.lang.String,
    containingFile: js.UndefOr[scala.Nothing],
    options: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    host: typescriptLib.typescriptMod.tsNs.ModuleResolutionHost,
    redirectedReference: typescriptLib.typescriptMod.tsNs.ResolvedProjectReference
  ): typescriptLib.typescriptMod.tsNs.ResolvedTypeReferenceDirectiveWithFailedLookupLocations = js.native
  /**
    * Sets a custom text range to use when emitting comments.
    */
  def setCommentRange[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, range: typescriptLib.typescriptMod.tsNs.TextRange): T = js.native
  def setConstantValue(node: typescriptLib.typescriptMod.tsNs.ElementAccessExpression, value: java.lang.String): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression | typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  def setConstantValue(node: typescriptLib.typescriptMod.tsNs.ElementAccessExpression, value: scala.Double): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression | typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  /**
    * Sets the constant value to emit for an expression.
    */
  def setConstantValue(node: typescriptLib.typescriptMod.tsNs.PropertyAccessExpression, value: java.lang.String): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression | typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  def setConstantValue(node: typescriptLib.typescriptMod.tsNs.PropertyAccessExpression, value: scala.Double): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression | typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  /**
    * Sets flags that control emit behavior of a node.
    */
  def setEmitFlags[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, emitFlags: typescriptLib.typescriptMod.tsNs.EmitFlags): T = js.native
  def setOriginalNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  def setOriginalNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, original: typescriptLib.typescriptMod.tsNs.Node): T = js.native
  def setSourceMapRange[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  /**
    * Sets a custom text range to use when emitting source maps.
    */
  def setSourceMapRange[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, range: typescriptLib.typescriptMod.tsNs.SourceMapRange): T = js.native
  def setSyntheticLeadingComments[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  def setSyntheticLeadingComments[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, comments: js.Array[typescriptLib.typescriptMod.tsNs.SynthesizedComment]): T = js.native
  def setSyntheticTrailingComments[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  def setSyntheticTrailingComments[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, comments: js.Array[typescriptLib.typescriptMod.tsNs.SynthesizedComment]): T = js.native
  def setTextRange[T /* <: typescriptLib.typescriptMod.tsNs.TextRange */](range: T): T = js.native
  def setTextRange[T /* <: typescriptLib.typescriptMod.tsNs.TextRange */](range: T, location: typescriptLib.typescriptMod.tsNs.TextRange): T = js.native
  def setTokenSourceMapRange[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, token: typescriptLib.typescriptMod.tsNs.SyntaxKind): T = js.native
  /**
    * Sets the TextRange to use for source maps for a token of a node.
    */
  def setTokenSourceMapRange[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    token: typescriptLib.typescriptMod.tsNs.SyntaxKind,
    range: typescriptLib.typescriptMod.tsNs.SourceMapRange
  ): T = js.native
  def skipPartiallyEmittedExpressions(node: typescriptLib.typescriptMod.tsNs.Expression): typescriptLib.typescriptMod.tsNs.Expression = js.native
  def skipPartiallyEmittedExpressions(node: typescriptLib.typescriptMod.tsNs.Node): typescriptLib.typescriptMod.tsNs.Node = js.native
  def sortAndDeduplicateDiagnostics[T /* <: typescriptLib.typescriptMod.tsNs.Diagnostic */](diagnostics: js.Array[T]): typescriptLib.typescriptMod.tsNs.SortedReadonlyArray[T] = js.native
  def symbolName(symbol: typescriptLib.typescriptMod.tsNs.Symbol): java.lang.String = js.native
  def textChangeRangeIsUnchanged(range: typescriptLib.typescriptMod.tsNs.TextChangeRange): scala.Boolean = js.native
  def textChangeRangeNewSpan(range: typescriptLib.typescriptMod.tsNs.TextChangeRange): typescriptLib.typescriptMod.tsNs.TextSpan = js.native
  def textSpanContainsPosition(span: typescriptLib.typescriptMod.tsNs.TextSpan, position: scala.Double): scala.Boolean = js.native
  def textSpanContainsTextSpan(span: typescriptLib.typescriptMod.tsNs.TextSpan, other: typescriptLib.typescriptMod.tsNs.TextSpan): scala.Boolean = js.native
  def textSpanEnd(span: typescriptLib.typescriptMod.tsNs.TextSpan): scala.Double = js.native
  def textSpanIntersection(span1: typescriptLib.typescriptMod.tsNs.TextSpan, span2: typescriptLib.typescriptMod.tsNs.TextSpan): js.UndefOr[typescriptLib.typescriptMod.tsNs.TextSpan] = js.native
  def textSpanIntersectsWith(span: typescriptLib.typescriptMod.tsNs.TextSpan, start: scala.Double, length: scala.Double): scala.Boolean = js.native
  def textSpanIntersectsWithPosition(span: typescriptLib.typescriptMod.tsNs.TextSpan, position: scala.Double): scala.Boolean = js.native
  def textSpanIntersectsWithTextSpan(span: typescriptLib.typescriptMod.tsNs.TextSpan, other: typescriptLib.typescriptMod.tsNs.TextSpan): scala.Boolean = js.native
  def textSpanIsEmpty(span: typescriptLib.typescriptMod.tsNs.TextSpan): scala.Boolean = js.native
  def textSpanOverlap(span1: typescriptLib.typescriptMod.tsNs.TextSpan, span2: typescriptLib.typescriptMod.tsNs.TextSpan): js.UndefOr[typescriptLib.typescriptMod.tsNs.TextSpan] = js.native
  def textSpanOverlapsWith(span: typescriptLib.typescriptMod.tsNs.TextSpan, other: typescriptLib.typescriptMod.tsNs.TextSpan): scala.Boolean = js.native
  def toEditorSettings(options: typescriptLib.typescriptMod.tsNs.EditorOptions): typescriptLib.typescriptMod.tsNs.EditorSettings = js.native
  def toEditorSettings(options: typescriptLib.typescriptMod.tsNs.EditorSettings): typescriptLib.typescriptMod.tsNs.EditorSettings = js.native
  def tokenToString(t: typescriptLib.typescriptMod.tsNs.SyntaxKind): js.UndefOr[java.lang.String] = js.native
  /**
    * Transform one or more nodes using the supplied transformers.
    * @param source A single `Node` or an array of `Node` objects.
    * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
    * @param compilerOptions Optional compiler options.
    */
  def transform[T /* <: typescriptLib.typescriptMod.tsNs.Node */](source: T, transformers: js.Array[typescriptLib.typescriptMod.tsNs.TransformerFactory[T]]): typescriptLib.typescriptMod.tsNs.TransformationResult[T] = js.native
  def transform[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    source: T,
    transformers: js.Array[typescriptLib.typescriptMod.tsNs.TransformerFactory[T]],
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions
  ): typescriptLib.typescriptMod.tsNs.TransformationResult[T] = js.native
  def transform[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    source: js.Array[T],
    transformers: js.Array[typescriptLib.typescriptMod.tsNs.TransformerFactory[T]]
  ): typescriptLib.typescriptMod.tsNs.TransformationResult[T] = js.native
  def transform[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    source: js.Array[T],
    transformers: js.Array[typescriptLib.typescriptMod.tsNs.TransformerFactory[T]],
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions
  ): typescriptLib.typescriptMod.tsNs.TransformationResult[T] = js.native
  def transpile(input: java.lang.String): java.lang.String = js.native
  def transpile(input: java.lang.String, compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    fileName: java.lang.String
  ): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): java.lang.String = js.native
  def transpile(
    input: java.lang.String,
    compilerOptions: typescriptLib.typescriptMod.tsNs.CompilerOptions,
    fileName: java.lang.String,
    diagnostics: js.Array[typescriptLib.typescriptMod.tsNs.Diagnostic],
    moduleName: java.lang.String
  ): java.lang.String = js.native
  def transpileModule(input: java.lang.String, transpileOptions: typescriptLib.typescriptMod.tsNs.TranspileOptions): typescriptLib.typescriptMod.tsNs.TranspileOutput = js.native
  /**
    * Remove extra underscore from escaped identifier text content.
    *
    * @param identifier The escaped identifier text.
    * @returns The unescaped identifier text.
    */
  def unescapeLeadingUnderscores(identifier: typescriptLib.typescriptMod.tsNs.__String): java.lang.String = js.native
  def updateArrayBindingPattern(
    node: typescriptLib.typescriptMod.tsNs.ArrayBindingPattern,
    elements: js.Array[typescriptLib.typescriptMod.tsNs.ArrayBindingElement]
  ): typescriptLib.typescriptMod.tsNs.ArrayBindingPattern = js.native
  def updateArrayLiteral(
    node: typescriptLib.typescriptMod.tsNs.ArrayLiteralExpression,
    elements: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.ArrayLiteralExpression = js.native
  def updateArrayTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ArrayTypeNode,
    elementType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ArrayTypeNode = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateArrowFunction(
    node: typescriptLib.typescriptMod.tsNs.ArrowFunction,
    modifiers: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    equalsGreaterThanToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    body: typescriptLib.typescriptMod.tsNs.ConciseBody
  ): typescriptLib.typescriptMod.tsNs.ArrowFunction = js.native
  def updateAsExpression(
    node: typescriptLib.typescriptMod.tsNs.AsExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.AsExpression = js.native
  def updateAwait(
    node: typescriptLib.typescriptMod.tsNs.AwaitExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.AwaitExpression = js.native
  def updateBinary(
    node: typescriptLib.typescriptMod.tsNs.BinaryExpression,
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def updateBinary(
    node: typescriptLib.typescriptMod.tsNs.BinaryExpression,
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression,
    operator: typescriptLib.typescriptMod.tsNs.BinaryOperator
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def updateBinary(
    node: typescriptLib.typescriptMod.tsNs.BinaryExpression,
    left: typescriptLib.typescriptMod.tsNs.Expression,
    right: typescriptLib.typescriptMod.tsNs.Expression,
    operator: typescriptLib.typescriptMod.tsNs.BinaryOperatorToken
  ): typescriptLib.typescriptMod.tsNs.BinaryExpression = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: js.UndefOr[scala.Nothing],
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBindingElement(
    node: typescriptLib.typescriptMod.tsNs.BindingElement,
    dotDotDotToken: typescriptLib.typescriptMod.tsNs.DotDotDotToken,
    propertyName: typescriptLib.typescriptMod.tsNs.PropertyName,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.BindingElement = js.native
  def updateBlock(
    node: typescriptLib.typescriptMod.tsNs.Block,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]
  ): typescriptLib.typescriptMod.tsNs.Block = js.native
  def updateBreak(node: typescriptLib.typescriptMod.tsNs.BreakStatement): typescriptLib.typescriptMod.tsNs.BreakStatement = js.native
  def updateBreak(
    node: typescriptLib.typescriptMod.tsNs.BreakStatement,
    label: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.BreakStatement = js.native
  def updateBundle(
    node: typescriptLib.typescriptMod.tsNs.Bundle,
    sourceFiles: js.Array[typescriptLib.typescriptMod.tsNs.SourceFile]
  ): typescriptLib.typescriptMod.tsNs.Bundle = js.native
  def updateBundle(
    node: typescriptLib.typescriptMod.tsNs.Bundle,
    sourceFiles: js.Array[typescriptLib.typescriptMod.tsNs.SourceFile],
    prepends: js.Array[typescriptLib.typescriptMod.tsNs.UnparsedSource]
  ): typescriptLib.typescriptMod.tsNs.Bundle = js.native
  def updateCall(
    node: typescriptLib.typescriptMod.tsNs.CallExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def updateCall(
    node: typescriptLib.typescriptMod.tsNs.CallExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.CallExpression = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def updateCallSignature(
    node: typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.CallSignatureDeclaration = js.native
  def updateCaseBlock(
    node: typescriptLib.typescriptMod.tsNs.CaseBlock,
    clauses: js.Array[typescriptLib.typescriptMod.tsNs.CaseOrDefaultClause]
  ): typescriptLib.typescriptMod.tsNs.CaseBlock = js.native
  def updateCaseClause(
    node: typescriptLib.typescriptMod.tsNs.CaseClause,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]
  ): typescriptLib.typescriptMod.tsNs.CaseClause = js.native
  def updateCatchClause(
    node: typescriptLib.typescriptMod.tsNs.CatchClause,
    variableDeclaration: js.UndefOr[scala.Nothing],
    block: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.CatchClause = js.native
  def updateCatchClause(
    node: typescriptLib.typescriptMod.tsNs.CatchClause,
    variableDeclaration: typescriptLib.typescriptMod.tsNs.VariableDeclaration,
    block: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.CatchClause = js.native
  def updateClassDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ClassDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: js.UndefOr[typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    heritageClauses: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause]],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassDeclaration = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateClassExpression(
    node: typescriptLib.typescriptMod.tsNs.ClassExpression,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.ClassElement]
  ): typescriptLib.typescriptMod.tsNs.ClassExpression = js.native
  def updateCommaList(
    node: typescriptLib.typescriptMod.tsNs.CommaListExpression,
    elements: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.CommaListExpression = js.native
  def updateComputedPropertyName(
    node: typescriptLib.typescriptMod.tsNs.ComputedPropertyName,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ComputedPropertyName = js.native
  def updateConditional(
    node: typescriptLib.typescriptMod.tsNs.ConditionalExpression,
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    questionToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    whenTrue: typescriptLib.typescriptMod.tsNs.Expression,
    colonToken: typescriptLib.typescriptMod.tsNs.Token[typescriptLib.typescriptMod.tsNs.SyntaxKind],
    whenFalse: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ConditionalExpression = js.native
  def updateConditionalTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ConditionalTypeNode,
    checkType: typescriptLib.typescriptMod.tsNs.TypeNode,
    extendsType: typescriptLib.typescriptMod.tsNs.TypeNode,
    trueType: typescriptLib.typescriptMod.tsNs.TypeNode,
    falseType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConditionalTypeNode = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def updateConstructSignature(
    node: typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructSignatureDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructor(
    node: typescriptLib.typescriptMod.tsNs.ConstructorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.ConstructorDeclaration = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ConstructorTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ConstructorTypeNode,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def updateConstructorTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ConstructorTypeNode,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ConstructorTypeNode = js.native
  def updateContinue(node: typescriptLib.typescriptMod.tsNs.ContinueStatement): typescriptLib.typescriptMod.tsNs.ContinueStatement = js.native
  def updateContinue(
    node: typescriptLib.typescriptMod.tsNs.ContinueStatement,
    label: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ContinueStatement = js.native
  def updateDecorator(
    node: typescriptLib.typescriptMod.tsNs.Decorator,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.Decorator = js.native
  def updateDefaultClause(
    node: typescriptLib.typescriptMod.tsNs.DefaultClause,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]
  ): typescriptLib.typescriptMod.tsNs.DefaultClause = js.native
  def updateDelete(
    node: typescriptLib.typescriptMod.tsNs.DeleteExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.DeleteExpression = js.native
  def updateDo(
    node: typescriptLib.typescriptMod.tsNs.DoStatement,
    statement: typescriptLib.typescriptMod.tsNs.Statement,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.DoStatement = js.native
  def updateElementAccess(
    node: typescriptLib.typescriptMod.tsNs.ElementAccessExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    argumentExpression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ElementAccessExpression = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.tsNs.EnumDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.tsNs.EnumDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.tsNs.EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def updateEnumDeclaration(
    node: typescriptLib.typescriptMod.tsNs.EnumDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    members: js.Array[typescriptLib.typescriptMod.tsNs.EnumMember]
  ): typescriptLib.typescriptMod.tsNs.EnumDeclaration = js.native
  def updateEnumMember(
    node: typescriptLib.typescriptMod.tsNs.EnumMember,
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.EnumMember = js.native
  def updateEnumMember(
    node: typescriptLib.typescriptMod.tsNs.EnumMember,
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.EnumMember = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.tsNs.ExportAssignment,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.tsNs.ExportAssignment,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.tsNs.ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def updateExportAssignment(
    node: typescriptLib.typescriptMod.tsNs.ExportAssignment,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportAssignment = js.native
  def updateExportDeclaration(node: typescriptLib.typescriptMod.tsNs.ExportDeclaration): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator]
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier]
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier]
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ExportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    exportClause: typescriptLib.typescriptMod.tsNs.NamedExports,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExportDeclaration = js.native
  def updateExportSpecifier(
    node: typescriptLib.typescriptMod.tsNs.ExportSpecifier,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def updateExportSpecifier(
    node: typescriptLib.typescriptMod.tsNs.ExportSpecifier,
    propertyName: typescriptLib.typescriptMod.tsNs.Identifier,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ExportSpecifier = js.native
  def updateExpressionStatement(
    node: typescriptLib.typescriptMod.tsNs.ExpressionStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExpressionStatement = js.native
  def updateExpressionWithTypeArguments(
    node: typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments = js.native
  def updateExpressionWithTypeArguments(
    node: typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments,
    typeArguments: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments = js.native
  def updateExternalModuleReference(
    node: typescriptLib.typescriptMod.tsNs.ExternalModuleReference,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ExternalModuleReference = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: js.UndefOr[scala.Nothing],
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: js.UndefOr[scala.Nothing],
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: js.UndefOr[scala.Nothing],
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateFor(
    node: typescriptLib.typescriptMod.tsNs.ForStatement,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    condition: typescriptLib.typescriptMod.tsNs.Expression,
    incrementor: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForStatement = js.native
  def updateForIn(
    node: typescriptLib.typescriptMod.tsNs.ForInStatement,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForInStatement = js.native
  def updateForOf(
    node: typescriptLib.typescriptMod.tsNs.ForOfStatement,
    awaitModifier: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForOfStatement = js.native
  def updateForOf(
    node: typescriptLib.typescriptMod.tsNs.ForOfStatement,
    awaitModifier: typescriptLib.typescriptMod.tsNs.AwaitKeywordToken,
    initializer: typescriptLib.typescriptMod.tsNs.ForInitializer,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.ForOfStatement = js.native
  def updateFunctionDeclaration(
    node: typescriptLib.typescriptMod.tsNs.FunctionDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: typescriptLib.typescriptMod.tsNs.FunctionDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.FunctionDeclaration = js.native
  def updateFunctionDeclaration(
    node: typescriptLib.typescriptMod.tsNs.FunctionDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.FunctionDeclaration = js.native
  def updateFunctionExpression(
    node: typescriptLib.typescriptMod.tsNs.FunctionExpression,
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: js.UndefOr[typescriptLib.typescriptMod.tsNs.Identifier],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[typescriptLib.typescriptMod.tsNs.TypeNode],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.FunctionExpression = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.tsNs.FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.tsNs.FunctionTypeNode,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.tsNs.FunctionTypeNode,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def updateFunctionTypeNode(
    node: typescriptLib.typescriptMod.tsNs.FunctionTypeNode,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.FunctionTypeNode = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateGetAccessor(
    node: typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.GetAccessorDeclaration = js.native
  def updateHeritageClause(
    node: typescriptLib.typescriptMod.tsNs.HeritageClause,
    types: js.Array[typescriptLib.typescriptMod.tsNs.ExpressionWithTypeArguments]
  ): typescriptLib.typescriptMod.tsNs.HeritageClause = js.native
  def updateIdentifier(node: typescriptLib.typescriptMod.tsNs.Identifier): typescriptLib.typescriptMod.tsNs.Identifier = js.native
  def updateIf(
    node: typescriptLib.typescriptMod.tsNs.IfStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    thenStatement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.IfStatement = js.native
  def updateIf(
    node: typescriptLib.typescriptMod.tsNs.IfStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    thenStatement: typescriptLib.typescriptMod.tsNs.Statement,
    elseStatement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.IfStatement = js.native
  def updateImportClause(node: typescriptLib.typescriptMod.tsNs.ImportClause): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def updateImportClause(
    node: typescriptLib.typescriptMod.tsNs.ImportClause,
    name: js.UndefOr[scala.Nothing],
    namedBindings: typescriptLib.typescriptMod.tsNs.NamedImportBindings
  ): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def updateImportClause(
    node: typescriptLib.typescriptMod.tsNs.ImportClause,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def updateImportClause(
    node: typescriptLib.typescriptMod.tsNs.ImportClause,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    namedBindings: typescriptLib.typescriptMod.tsNs.NamedImportBindings
  ): typescriptLib.typescriptMod.tsNs.ImportClause = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: js.UndefOr[scala.Nothing],
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    importClause: typescriptLib.typescriptMod.tsNs.ImportClause,
    moduleSpecifier: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ImportDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def updateImportEqualsDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    moduleReference: typescriptLib.typescriptMod.tsNs.ModuleReference
  ): typescriptLib.typescriptMod.tsNs.ImportEqualsDeclaration = js.native
  def updateImportSpecifier(
    node: typescriptLib.typescriptMod.tsNs.ImportSpecifier,
    propertyName: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ImportSpecifier = js.native
  def updateImportSpecifier(
    node: typescriptLib.typescriptMod.tsNs.ImportSpecifier,
    propertyName: typescriptLib.typescriptMod.tsNs.Identifier,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ImportSpecifier = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ImportTypeNode,
    argument: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ImportTypeNode,
    argument: typescriptLib.typescriptMod.tsNs.TypeNode,
    qualifier: typescriptLib.typescriptMod.tsNs.EntityName
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ImportTypeNode,
    argument: typescriptLib.typescriptMod.tsNs.TypeNode,
    qualifier: typescriptLib.typescriptMod.tsNs.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def updateImportTypeNode(
    node: typescriptLib.typescriptMod.tsNs.ImportTypeNode,
    argument: typescriptLib.typescriptMod.tsNs.TypeNode,
    qualifier: typescriptLib.typescriptMod.tsNs.EntityName,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    isTypeOf: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.ImportTypeNode = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def updateIndexSignature(
    node: typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexSignatureDeclaration = js.native
  def updateIndexedAccessTypeNode(
    node: typescriptLib.typescriptMod.tsNs.IndexedAccessTypeNode,
    objectType: typescriptLib.typescriptMod.tsNs.TypeNode,
    indexType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.IndexedAccessTypeNode = js.native
  def updateInferTypeNode(
    node: typescriptLib.typescriptMod.tsNs.InferTypeNode,
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration
  ): typescriptLib.typescriptMod.tsNs.InferTypeNode = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.Array[typescriptLib.typescriptMod.tsNs.HeritageClause],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateInterfaceDeclaration(
    node: typescriptLib.typescriptMod.tsNs.InterfaceDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    heritageClauses: js.UndefOr[scala.Nothing],
    members: js.Array[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.InterfaceDeclaration = js.native
  def updateIntersectionTypeNode(
    node: typescriptLib.typescriptMod.tsNs.IntersectionTypeNode,
    types: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.IntersectionTypeNode = js.native
  def updateJsxAttribute(
    node: typescriptLib.typescriptMod.tsNs.JsxAttribute,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    initializer: typescriptLib.typescriptMod.tsNs.JsxExpression
  ): typescriptLib.typescriptMod.tsNs.JsxAttribute = js.native
  def updateJsxAttribute(
    node: typescriptLib.typescriptMod.tsNs.JsxAttribute,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    initializer: typescriptLib.typescriptMod.tsNs.StringLiteral
  ): typescriptLib.typescriptMod.tsNs.JsxAttribute = js.native
  def updateJsxAttributes(
    node: typescriptLib.typescriptMod.tsNs.JsxAttributes,
    properties: js.Array[typescriptLib.typescriptMod.tsNs.JsxAttributeLike]
  ): typescriptLib.typescriptMod.tsNs.JsxAttributes = js.native
  def updateJsxClosingElement(
    node: typescriptLib.typescriptMod.tsNs.JsxClosingElement,
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression
  ): typescriptLib.typescriptMod.tsNs.JsxClosingElement = js.native
  def updateJsxElement(
    node: typescriptLib.typescriptMod.tsNs.JsxElement,
    openingElement: typescriptLib.typescriptMod.tsNs.JsxOpeningElement,
    children: js.Array[typescriptLib.typescriptMod.tsNs.JsxChild],
    closingElement: typescriptLib.typescriptMod.tsNs.JsxClosingElement
  ): typescriptLib.typescriptMod.tsNs.JsxElement = js.native
  def updateJsxExpression(node: typescriptLib.typescriptMod.tsNs.JsxExpression): typescriptLib.typescriptMod.tsNs.JsxExpression = js.native
  def updateJsxExpression(
    node: typescriptLib.typescriptMod.tsNs.JsxExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.JsxExpression = js.native
  def updateJsxFragment(
    node: typescriptLib.typescriptMod.tsNs.JsxFragment,
    openingFragment: typescriptLib.typescriptMod.tsNs.JsxOpeningFragment,
    children: js.Array[typescriptLib.typescriptMod.tsNs.JsxChild],
    closingFragment: typescriptLib.typescriptMod.tsNs.JsxClosingFragment
  ): typescriptLib.typescriptMod.tsNs.JsxFragment = js.native
  def updateJsxOpeningElement(
    node: typescriptLib.typescriptMod.tsNs.JsxOpeningElement,
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxOpeningElement = js.native
  def updateJsxOpeningElement(
    node: typescriptLib.typescriptMod.tsNs.JsxOpeningElement,
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxOpeningElement = js.native
  def updateJsxSelfClosingElement(
    node: typescriptLib.typescriptMod.tsNs.JsxSelfClosingElement,
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxSelfClosingElement = js.native
  def updateJsxSelfClosingElement(
    node: typescriptLib.typescriptMod.tsNs.JsxSelfClosingElement,
    tagName: typescriptLib.typescriptMod.tsNs.JsxTagNameExpression,
    typeArguments: js.UndefOr[scala.Nothing],
    attributes: typescriptLib.typescriptMod.tsNs.JsxAttributes
  ): typescriptLib.typescriptMod.tsNs.JsxSelfClosingElement = js.native
  def updateJsxSpreadAttribute(
    node: typescriptLib.typescriptMod.tsNs.JsxSpreadAttribute,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.JsxSpreadAttribute = js.native
  def updateLabel(
    node: typescriptLib.typescriptMod.tsNs.LabeledStatement,
    label: typescriptLib.typescriptMod.tsNs.Identifier,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.LabeledStatement = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.tsNs.IScriptSnapshot,
    version: java.lang.String
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.tsNs.IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: js.UndefOr[scala.Nothing],
    aggressiveChecks: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.tsNs.IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.tsNs.TextChangeRange
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateLanguageServiceSourceFile(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    scriptSnapshot: typescriptLib.typescriptMod.tsNs.IScriptSnapshot,
    version: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.tsNs.TextChangeRange,
    aggressiveChecks: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateLiteralTypeNode(
    node: typescriptLib.typescriptMod.tsNs.LiteralTypeNode,
    literal: typescriptLib.typescriptMod.tsNs.BooleanLiteral
  ): typescriptLib.typescriptMod.tsNs.LiteralTypeNode = js.native
  def updateLiteralTypeNode(
    node: typescriptLib.typescriptMod.tsNs.LiteralTypeNode,
    literal: typescriptLib.typescriptMod.tsNs.LiteralExpression
  ): typescriptLib.typescriptMod.tsNs.LiteralTypeNode = js.native
  def updateLiteralTypeNode(
    node: typescriptLib.typescriptMod.tsNs.LiteralTypeNode,
    literal: typescriptLib.typescriptMod.tsNs.PrefixUnaryExpression
  ): typescriptLib.typescriptMod.tsNs.LiteralTypeNode = js.native
  def updateMappedTypeNode(
    node: typescriptLib.typescriptMod.tsNs.MappedTypeNode,
    readonlyToken: js.UndefOr[
      typescriptLib.typescriptMod.tsNs.ReadonlyToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
    ],
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration
  ): typescriptLib.typescriptMod.tsNs.MappedTypeNode = js.native
  def updateMappedTypeNode(
    node: typescriptLib.typescriptMod.tsNs.MappedTypeNode,
    readonlyToken: js.UndefOr[
      typescriptLib.typescriptMod.tsNs.ReadonlyToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
    ],
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
  ): typescriptLib.typescriptMod.tsNs.MappedTypeNode = js.native
  def updateMappedTypeNode(
    node: typescriptLib.typescriptMod.tsNs.MappedTypeNode,
    readonlyToken: js.UndefOr[
      typescriptLib.typescriptMod.tsNs.ReadonlyToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken
    ],
    typeParameter: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.PlusToken | typescriptLib.typescriptMod.tsNs.MinusToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.MappedTypeNode = js.native
  def updateMetaProperty(
    node: typescriptLib.typescriptMod.tsNs.MetaProperty,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.MetaProperty = js.native
  def updateMethod(
    node: typescriptLib.typescriptMod.tsNs.MethodDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.MethodDeclaration = js.native
  def updateMethod(
    node: typescriptLib.typescriptMod.tsNs.MethodDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.MethodDeclaration = js.native
  def updateMethod(
    node: typescriptLib.typescriptMod.tsNs.MethodDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    asteriskToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.AsteriskToken],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.QuestionToken],
    typeParameters: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration]],
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.MethodDeclaration = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateMethodSignature(
    node: typescriptLib.typescriptMod.tsNs.MethodSignature,
    typeParameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    parameters: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.MethodSignature = js.native
  def updateModuleBlock(
    node: typescriptLib.typescriptMod.tsNs.ModuleBlock,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]
  ): typescriptLib.typescriptMod.tsNs.ModuleBlock = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateModuleDeclaration(
    node: typescriptLib.typescriptMod.tsNs.ModuleDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.ModuleName,
    body: typescriptLib.typescriptMod.tsNs.ModuleBody
  ): typescriptLib.typescriptMod.tsNs.ModuleDeclaration = js.native
  def updateNamedExports(
    node: typescriptLib.typescriptMod.tsNs.NamedExports,
    elements: js.Array[typescriptLib.typescriptMod.tsNs.ExportSpecifier]
  ): typescriptLib.typescriptMod.tsNs.NamedExports = js.native
  def updateNamedImports(
    node: typescriptLib.typescriptMod.tsNs.NamedImports,
    elements: js.Array[typescriptLib.typescriptMod.tsNs.ImportSpecifier]
  ): typescriptLib.typescriptMod.tsNs.NamedImports = js.native
  def updateNamespaceExportDeclaration(
    node: typescriptLib.typescriptMod.tsNs.NamespaceExportDeclaration,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.NamespaceExportDeclaration = js.native
  def updateNamespaceImport(
    node: typescriptLib.typescriptMod.tsNs.NamespaceImport,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.NamespaceImport = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.tsNs.NewExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.tsNs.NewExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.tsNs.NewExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def updateNew(
    node: typescriptLib.typescriptMod.tsNs.NewExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    argumentsArray: js.Array[typescriptLib.typescriptMod.tsNs.Expression]
  ): typescriptLib.typescriptMod.tsNs.NewExpression = js.native
  def updateNonNullExpression(
    node: typescriptLib.typescriptMod.tsNs.NonNullExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.NonNullExpression = js.native
  def updateObjectBindingPattern(
    node: typescriptLib.typescriptMod.tsNs.ObjectBindingPattern,
    elements: js.Array[typescriptLib.typescriptMod.tsNs.BindingElement]
  ): typescriptLib.typescriptMod.tsNs.ObjectBindingPattern = js.native
  def updateObjectLiteral(
    node: typescriptLib.typescriptMod.tsNs.ObjectLiteralExpression,
    properties: js.Array[typescriptLib.typescriptMod.tsNs.ObjectLiteralElementLike]
  ): typescriptLib.typescriptMod.tsNs.ObjectLiteralExpression = js.native
  def updateOptionalTypeNode(
    node: typescriptLib.typescriptMod.tsNs.OptionalTypeNode,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.OptionalTypeNode = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    dotDotDotToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.DotDotDotToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    dotDotDotToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.DotDotDotToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    dotDotDotToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.DotDotDotToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def updateParameter(
    node: typescriptLib.typescriptMod.tsNs.ParameterDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    dotDotDotToken: js.UndefOr[typescriptLib.typescriptMod.tsNs.DotDotDotToken],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.BindingName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
  def updateParen(
    node: typescriptLib.typescriptMod.tsNs.ParenthesizedExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ParenthesizedExpression = js.native
  def updateParenthesizedType(
    node: typescriptLib.typescriptMod.tsNs.ParenthesizedTypeNode,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.ParenthesizedTypeNode = js.native
  def updatePartiallyEmittedExpression(
    node: typescriptLib.typescriptMod.tsNs.PartiallyEmittedExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PartiallyEmittedExpression = js.native
  def updatePostfix(
    node: typescriptLib.typescriptMod.tsNs.PostfixUnaryExpression,
    operand: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PostfixUnaryExpression = js.native
  def updatePrefix(
    node: typescriptLib.typescriptMod.tsNs.PrefixUnaryExpression,
    operand: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PrefixUnaryExpression = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.tsNs.PropertyDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.tsNs.PropertyDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.ExclamationToken
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.tsNs.PropertyDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.ExclamationToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def updateProperty(
    node: typescriptLib.typescriptMod.tsNs.PropertyDeclaration,
    decorators: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Decorator]],
    modifiers: js.UndefOr[js.Array[typescriptLib.typescriptMod.tsNs.Modifier]],
    name: java.lang.String | typescriptLib.typescriptMod.tsNs.PropertyName,
    questionOrExclamationToken: typescriptLib.typescriptMod.tsNs.QuestionToken | typescriptLib.typescriptMod.tsNs.ExclamationToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertyDeclaration = js.native
  def updatePropertyAccess(
    node: typescriptLib.typescriptMod.tsNs.PropertyAccessExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.PropertyAccessExpression = js.native
  def updatePropertyAssignment(
    node: typescriptLib.typescriptMod.tsNs.PropertyAssignment,
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertyAssignment = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updatePropertySignature(
    node: typescriptLib.typescriptMod.tsNs.PropertySignature,
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    questionToken: typescriptLib.typescriptMod.tsNs.QuestionToken,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.PropertySignature = js.native
  def updateQualifiedName(
    node: typescriptLib.typescriptMod.tsNs.QualifiedName,
    left: typescriptLib.typescriptMod.tsNs.EntityName,
    right: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.QualifiedName = js.native
  def updateRestTypeNode(
    node: typescriptLib.typescriptMod.tsNs.RestTypeNode,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.RestTypeNode = js.native
  def updateReturn(node: typescriptLib.typescriptMod.tsNs.ReturnStatement): typescriptLib.typescriptMod.tsNs.ReturnStatement = js.native
  def updateReturn(
    node: typescriptLib.typescriptMod.tsNs.ReturnStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ReturnStatement = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration]
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateSetAccessor(
    node: typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.PropertyName,
    parameters: js.Array[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    body: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.SetAccessorDeclaration = js.native
  def updateShorthandPropertyAssignment(
    node: typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment = js.native
  def updateShorthandPropertyAssignment(
    node: typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    objectAssignmentInitializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ShorthandPropertyAssignment = js.native
  def updateSourceFile(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    newText: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.tsNs.TextChangeRange
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFile(
    sourceFile: typescriptLib.typescriptMod.tsNs.SourceFile,
    newText: java.lang.String,
    textChangeRange: typescriptLib.typescriptMod.tsNs.TextChangeRange,
    aggressiveChecks: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.tsNs.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement]
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.tsNs.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    isDeclarationFile: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.tsNs.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.tsNs.FileReference]
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.tsNs.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.tsNs.FileReference],
    typeReferences: js.Array[typescriptLib.typescriptMod.tsNs.FileReference]
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.tsNs.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.tsNs.FileReference],
    typeReferences: js.Array[typescriptLib.typescriptMod.tsNs.FileReference],
    hasNoDefaultLib: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSourceFileNode(
    node: typescriptLib.typescriptMod.tsNs.SourceFile,
    statements: js.Array[typescriptLib.typescriptMod.tsNs.Statement],
    isDeclarationFile: scala.Boolean,
    referencedFiles: js.Array[typescriptLib.typescriptMod.tsNs.FileReference],
    typeReferences: js.Array[typescriptLib.typescriptMod.tsNs.FileReference],
    hasNoDefaultLib: scala.Boolean,
    libReferences: js.Array[typescriptLib.typescriptMod.tsNs.FileReference]
  ): typescriptLib.typescriptMod.tsNs.SourceFile = js.native
  def updateSpread(
    node: typescriptLib.typescriptMod.tsNs.SpreadElement,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.SpreadElement = js.native
  def updateSpreadAssignment(
    node: typescriptLib.typescriptMod.tsNs.SpreadAssignment,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.SpreadAssignment = js.native
  def updateSwitch(
    node: typescriptLib.typescriptMod.tsNs.SwitchStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    caseBlock: typescriptLib.typescriptMod.tsNs.CaseBlock
  ): typescriptLib.typescriptMod.tsNs.SwitchStatement = js.native
  /** @deprecated */ def updateTaggedTemplate(
    node: typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression,
    tag: typescriptLib.typescriptMod.tsNs.Expression,
    template: typescriptLib.typescriptMod.tsNs.TemplateLiteral
  ): typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression = js.native
  def updateTaggedTemplate(
    node: typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression,
    tag: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode],
    template: typescriptLib.typescriptMod.tsNs.TemplateLiteral
  ): typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression = js.native
  def updateTaggedTemplate(
    node: typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression,
    tag: typescriptLib.typescriptMod.tsNs.Expression,
    typeArguments: js.UndefOr[scala.Nothing],
    template: typescriptLib.typescriptMod.tsNs.TemplateLiteral
  ): typescriptLib.typescriptMod.tsNs.TaggedTemplateExpression = js.native
  def updateTemplateExpression(
    node: typescriptLib.typescriptMod.tsNs.TemplateExpression,
    head: typescriptLib.typescriptMod.tsNs.TemplateHead,
    templateSpans: js.Array[typescriptLib.typescriptMod.tsNs.TemplateSpan]
  ): typescriptLib.typescriptMod.tsNs.TemplateExpression = js.native
  def updateTemplateSpan(
    node: typescriptLib.typescriptMod.tsNs.TemplateSpan,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    literal: typescriptLib.typescriptMod.tsNs.TemplateMiddle
  ): typescriptLib.typescriptMod.tsNs.TemplateSpan = js.native
  def updateTemplateSpan(
    node: typescriptLib.typescriptMod.tsNs.TemplateSpan,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    literal: typescriptLib.typescriptMod.tsNs.TemplateTail
  ): typescriptLib.typescriptMod.tsNs.TemplateSpan = js.native
  def updateThrow(
    node: typescriptLib.typescriptMod.tsNs.ThrowStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.ThrowStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.tsNs.TryStatement,
    tryBlock: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.tsNs.TryStatement,
    tryBlock: typescriptLib.typescriptMod.tsNs.Block,
    catchClause: js.UndefOr[scala.Nothing],
    finallyBlock: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.tsNs.TryStatement,
    tryBlock: typescriptLib.typescriptMod.tsNs.Block,
    catchClause: typescriptLib.typescriptMod.tsNs.CatchClause
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def updateTry(
    node: typescriptLib.typescriptMod.tsNs.TryStatement,
    tryBlock: typescriptLib.typescriptMod.tsNs.Block,
    catchClause: typescriptLib.typescriptMod.tsNs.CatchClause,
    finallyBlock: typescriptLib.typescriptMod.tsNs.Block
  ): typescriptLib.typescriptMod.tsNs.TryStatement = js.native
  def updateTupleTypeNode(
    node: typescriptLib.typescriptMod.tsNs.TupleTypeNode,
    elementTypes: js.Array[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.TupleTypeNode = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.Array[typescriptLib.typescriptMod.tsNs.Decorator],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.Array[typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAliasDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration,
    decorators: js.UndefOr[scala.Nothing],
    modifiers: js.UndefOr[scala.Nothing],
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeAliasDeclaration = js.native
  def updateTypeAssertion(
    node: typescriptLib.typescriptMod.tsNs.TypeAssertion,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.TypeAssertion = js.native
  def updateTypeLiteralNode(
    node: typescriptLib.typescriptMod.tsNs.TypeLiteralNode,
    members: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeElement]
  ): typescriptLib.typescriptMod.tsNs.TypeLiteralNode = js.native
  def updateTypeOf(
    node: typescriptLib.typescriptMod.tsNs.TypeOfExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.TypeOfExpression = js.native
  def updateTypeOperatorNode(
    node: typescriptLib.typescriptMod.tsNs.TypeOperatorNode,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeOperatorNode = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.tsNs.Identifier
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    constraint: js.UndefOr[scala.Nothing],
    defaultType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    constraint: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def updateTypeParameterDeclaration(
    node: typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration,
    name: typescriptLib.typescriptMod.tsNs.Identifier,
    constraint: typescriptLib.typescriptMod.tsNs.TypeNode,
    defaultType: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypeParameterDeclaration = js.native
  def updateTypePredicateNode(
    node: typescriptLib.typescriptMod.tsNs.TypePredicateNode,
    parameterName: typescriptLib.typescriptMod.tsNs.Identifier,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypePredicateNode = js.native
  def updateTypePredicateNode(
    node: typescriptLib.typescriptMod.tsNs.TypePredicateNode,
    parameterName: typescriptLib.typescriptMod.tsNs.ThisTypeNode,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.TypePredicateNode = js.native
  def updateTypeQueryNode(
    node: typescriptLib.typescriptMod.tsNs.TypeQueryNode,
    exprName: typescriptLib.typescriptMod.tsNs.EntityName
  ): typescriptLib.typescriptMod.tsNs.TypeQueryNode = js.native
  def updateTypeReferenceNode(
    node: typescriptLib.typescriptMod.tsNs.TypeReferenceNode,
    typeName: typescriptLib.typescriptMod.tsNs.EntityName
  ): typescriptLib.typescriptMod.tsNs.TypeReferenceNode = js.native
  def updateTypeReferenceNode(
    node: typescriptLib.typescriptMod.tsNs.TypeReferenceNode,
    typeName: typescriptLib.typescriptMod.tsNs.EntityName,
    typeArguments: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.TypeReferenceNode = js.native
  def updateUnionTypeNode(
    node: typescriptLib.typescriptMod.tsNs.UnionTypeNode,
    types: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.TypeNode]
  ): typescriptLib.typescriptMod.tsNs.UnionTypeNode = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.tsNs.VariableDeclaration,
    name: typescriptLib.typescriptMod.tsNs.BindingName
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.tsNs.VariableDeclaration,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    `type`: js.UndefOr[scala.Nothing],
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.tsNs.VariableDeclaration,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def updateVariableDeclaration(
    node: typescriptLib.typescriptMod.tsNs.VariableDeclaration,
    name: typescriptLib.typescriptMod.tsNs.BindingName,
    `type`: typescriptLib.typescriptMod.tsNs.TypeNode,
    initializer: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.VariableDeclaration = js.native
  def updateVariableDeclarationList(
    node: typescriptLib.typescriptMod.tsNs.VariableDeclarationList,
    declarations: js.Array[typescriptLib.typescriptMod.tsNs.VariableDeclaration]
  ): typescriptLib.typescriptMod.tsNs.VariableDeclarationList = js.native
  def updateVariableStatement(
    node: typescriptLib.typescriptMod.tsNs.VariableStatement,
    modifiers: js.Array[typescriptLib.typescriptMod.tsNs.Modifier],
    declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList
  ): typescriptLib.typescriptMod.tsNs.VariableStatement = js.native
  def updateVariableStatement(
    node: typescriptLib.typescriptMod.tsNs.VariableStatement,
    modifiers: js.UndefOr[scala.Nothing],
    declarationList: typescriptLib.typescriptMod.tsNs.VariableDeclarationList
  ): typescriptLib.typescriptMod.tsNs.VariableStatement = js.native
  def updateVoid(
    node: typescriptLib.typescriptMod.tsNs.VoidExpression,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.VoidExpression = js.native
  def updateWhile(
    node: typescriptLib.typescriptMod.tsNs.WhileStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.WhileStatement = js.native
  def updateWith(
    node: typescriptLib.typescriptMod.tsNs.WithStatement,
    expression: typescriptLib.typescriptMod.tsNs.Expression,
    statement: typescriptLib.typescriptMod.tsNs.Statement
  ): typescriptLib.typescriptMod.tsNs.WithStatement = js.native
  def updateYield(
    node: typescriptLib.typescriptMod.tsNs.YieldExpression,
    asteriskToken: js.UndefOr[scala.Nothing],
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.YieldExpression = js.native
  def updateYield(
    node: typescriptLib.typescriptMod.tsNs.YieldExpression,
    asteriskToken: typescriptLib.typescriptMod.tsNs.AsteriskToken,
    expression: typescriptLib.typescriptMod.tsNs.Expression
  ): typescriptLib.typescriptMod.tsNs.YieldExpression = js.native
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def validateLocaleAndSetLanguage(locale: java.lang.String, sys: typescriptLib.Anon_FileExists): scala.Unit = js.native
  def validateLocaleAndSetLanguage(
    locale: java.lang.String,
    sys: typescriptLib.Anon_FileExists,
    errors: typescriptLib.typescriptMod.tsNs.Push[typescriptLib.typescriptMod.tsNs.Diagnostic]
  ): scala.Unit = js.native
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  def visitEachChild[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count,
    tokenVisitor: typescriptLib.typescriptMod.tsNs.Visitor
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): js.UndefOr[T] = js.native
  def visitEachChild[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count,
    tokenVisitor: typescriptLib.typescriptMod.tsNs.Visitor
  ): js.UndefOr[T] = js.native
  /**
    * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
    *
    * @param node The Node whose children will be visited.
    * @param visitor The callback used to visit each child.
    * @param context A lexical environment context for the visitor.
    */
  @JSName("visitEachChild")
  def visitEachChild_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): T = js.native
  def visitFunctionBody(
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  def visitFunctionBody(
    node: typescriptLib.typescriptMod.tsNs.FunctionBody,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.FunctionBody] = js.native
  /**
    * Resumes a suspended lexical environment and visits a concise body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  @JSName("visitFunctionBody")
  def visitFunctionBody_ConciseBody(
    node: typescriptLib.typescriptMod.tsNs.ConciseBody,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): typescriptLib.typescriptMod.tsNs.ConciseBody = js.native
  /**
    * Resumes a suspended lexical environment and visits a function body, ending the lexical
    * environment and merging hoisted declarations upon completion.
    */
  @JSName("visitFunctionBody")
  def visitFunctionBody_FunctionBody(
    node: typescriptLib.typescriptMod.tsNs.FunctionBody,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): typescriptLib.typescriptMod.tsNs.FunctionBody = js.native
  /**
    * Starts a new lexical environment and visits a statement list, ending the lexical environment
    * and merging hoisted declarations upon completion.
    */
  def visitLexicalEnvironment(
    statements: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Statement],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Statement] = js.native
  def visitLexicalEnvironment(
    statements: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Statement],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    start: scala.Double
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Statement] = js.native
  def visitLexicalEnvironment(
    statements: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Statement],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    start: scala.Double,
    ensureUseStrict: scala.Boolean
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Statement] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, visitor: typescriptLib.typescriptMod.tsNs.Visitor): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.tsNs.Visitor): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def visitNode[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): js.UndefOr[T] = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): T = js.native
  /**
    * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
    *
    * @param node The Node to visit.
    * @param visitor The callback used to visit the Node.
    * @param test A callback to execute to verify the Node is valid.
    * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
    */
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: T, visitor: typescriptLib.typescriptMod.tsNs.Visitor): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: T,
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: js.UndefOr[scala.Nothing],
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](node: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.tsNs.Visitor): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): T = js.native
  @JSName("visitNode")
  def visitNode_TNodeT[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    node: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    lift: js.Function1[
      /* node */ typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.Node], 
      T
    ]
  ): T = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](nodes: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.tsNs.Visitor): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  /**
    * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
    *
    * @param nodes The NodeArray to visit.
    * @param visitor The callback used to visit a Node.
    * @param test A node test to execute for each node.
    * @param start An optional value indicating the starting offset at which to start visiting.
    * @param count An optional value indicating the maximum number of nodes to visit.
    */
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  def visitNodes[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): js.UndefOr[typescriptLib.typescriptMod.tsNs.NodeArray[T]] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](nodes: js.UndefOr[scala.Nothing], visitor: typescriptLib.typescriptMod.tsNs.Visitor): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
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
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean]
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  @JSName("visitNodes")
  def visitNodes_TNodeNodeArray[T /* <: typescriptLib.typescriptMod.tsNs.Node */](
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[T],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    test: js.Function1[/* node */ typescriptLib.typescriptMod.tsNs.Node, scala.Boolean],
    start: scala.Double,
    count: scala.Double
  ): typescriptLib.typescriptMod.tsNs.NodeArray[T] = js.native
  def visitParameterList(
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration] = js.native
  def visitParameterList(
    nodes: js.UndefOr[scala.Nothing],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration] = js.native
  /**
    * Starts a new lexical environment and visits a parameter list, suspending the lexical
    * environment upon completion.
    */
  def visitParameterList(
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration] = js.native
  def visitParameterList(
    nodes: typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration],
    visitor: typescriptLib.typescriptMod.tsNs.Visitor,
    context: typescriptLib.typescriptMod.tsNs.TransformationContext,
    nodesVisitor: typescriptLib.Anon_Count
  ): typescriptLib.typescriptMod.tsNs.NodeArray[typescriptLib.typescriptMod.tsNs.ParameterDeclaration] = js.native
  def walkUpBindingElementsAndPatterns(binding: typescriptLib.typescriptMod.tsNs.BindingElement): typescriptLib.typescriptMod.tsNs.VariableDeclaration | typescriptLib.typescriptMod.tsNs.ParameterDeclaration = js.native
}

