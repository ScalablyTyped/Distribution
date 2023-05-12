package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.NonNullable
import typings.std.ReadonlyMap
import typings.typescript.anon.Affected
import typings.typescript.anon.Config
import typings.typescript.anon.Errors
import typings.typescript.anon.EscapedIdentifier
import typings.typescript.anon.FileExists
import typings.typescript.anon.FnCall
import typings.typescript.anon.ImpliedNodeFormat
import typings.typescript.anon.Metadata
import typings.typescript.anon.Options
import typings.typescript.mod.ModuleKind.CommonJS
import typings.typescript.mod.ModuleKind.ESNext
import typings.typescript.mod.SyntaxKind.AsteriskAsteriskToken
import typings.typescript.mod.SyntaxKind.MultiLineCommentTrivia
import typings.typescript.mod.SyntaxKind.SingleLineCommentTrivia
import typings.typescript.mod.^
import typings.typescript.typescriptBooleans.`false`
import typings.typescript.typescriptStrings.dts
import typings.typescript.typescriptStrings.js_
import typings.typescript.typescriptStrings.quit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Adds an EmitHelper to a node.
  */
inline def addEmitHelper[T /* <: Node */](node: T, helper: EmitHelper): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmitHelper")(node.asInstanceOf[js.Any], helper.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Add EmitHelpers to a node.
  */
inline def addEmitHelpers[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("addEmitHelpers")(node.asInstanceOf[js.Any]).asInstanceOf[T]
inline def addEmitHelpers[T /* <: Node */](node: T, helpers: js.Array[EmitHelper]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmitHelpers")(node.asInstanceOf[js.Any], helpers.asInstanceOf[js.Any])).asInstanceOf[T]

inline def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticLeadingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticLeadingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasTrailingNewLine.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticLeadingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addSyntheticLeadingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticLeadingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasTrailingNewLine.asInstanceOf[js.Any])).asInstanceOf[T]

inline def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticTrailingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: MultiLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticTrailingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasTrailingNewLine.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticTrailingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[T]
inline def addSyntheticTrailingComment[T /* <: Node */](node: T, kind: SingleLineCommentTrivia, text: java.lang.String, hasTrailingNewLine: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("addSyntheticTrailingComment")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], text.asInstanceOf[js.Any], hasTrailingNewLine.asInstanceOf[js.Any])).asInstanceOf[T]

inline def bundlerModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("bundlerModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def bundlerModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: Unit,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("bundlerModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def bundlerModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("bundlerModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def bundlerModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("bundlerModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]

inline def canHaveDecorators(node: Node): /* is typescript.typescript.HasDecorators */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canHaveDecorators")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasDecorators */ Boolean]

inline def canHaveModifiers(node: Node): /* is typescript.typescript.HasModifiers */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canHaveModifiers")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasModifiers */ Boolean]

inline def classicNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("classicNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def classicNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: Unit,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("classicNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def classicNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: NonRelativeModuleNameResolutionCache
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("classicNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def classicNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: NonRelativeModuleNameResolutionCache,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("classicNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]

/**
  * Called to merge all the changes that occurred across several versions of a script snapshot
  * into a single change.  i.e. if a user keeps making successive edits to a script we will
  * have a text change from V1 to V2, V2 to V3, ..., Vn.
  *
  * This function will then merge those changes into a single change range valid between V1 and
  * Vn.
  */
inline def collapseTextChangeRangesAcrossMultipleVersions(changes: js.Array[TextChangeRange]): TextChangeRange = ^.asInstanceOf[js.Dynamic].applyDynamic("collapseTextChangeRangesAcrossMultipleVersions")(changes.asInstanceOf[js.Any]).asInstanceOf[TextChangeRange]

inline def convertCompilerOptionsFromJson(jsonOptions: Any, basePath: java.lang.String): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("convertCompilerOptionsFromJson")(jsonOptions.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Errors]
inline def convertCompilerOptionsFromJson(jsonOptions: Any, basePath: java.lang.String, configFileName: java.lang.String): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("convertCompilerOptionsFromJson")(jsonOptions.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], configFileName.asInstanceOf[js.Any])).asInstanceOf[Errors]

/**
  * Convert the json syntax tree into the json value
  */
inline def convertToObject(sourceFile: JsonSourceFile, errors: js.Array[Diagnostic]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToObject")(sourceFile.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def convertTypeAcquisitionFromJson(jsonOptions: Any, basePath: java.lang.String): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeAcquisitionFromJson")(jsonOptions.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Options]
inline def convertTypeAcquisitionFromJson(jsonOptions: Any, basePath: java.lang.String, configFileName: java.lang.String): Options = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTypeAcquisitionFromJson")(jsonOptions.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], configFileName.asInstanceOf[js.Any])).asInstanceOf[Options]

inline def couldStartTrivia(text: java.lang.String, pos: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("couldStartTrivia")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Creates a builder thats just abstraction over program and can be used with watch
  */
inline def createAbstractBuilder(newProgram: Program, host: BuilderProgramHost): BuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbstractBuilder")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[BuilderProgram]
inline def createAbstractBuilder(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: Unit,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): BuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbstractBuilder")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[BuilderProgram]
inline def createAbstractBuilder(newProgram: Program, host: BuilderProgramHost, oldProgram: BuilderProgram): BuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbstractBuilder")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[BuilderProgram]
inline def createAbstractBuilder(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: BuilderProgram,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): BuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbstractBuilder")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[BuilderProgram]
inline def createAbstractBuilder(
  rootNames: js.UndefOr[js.Array[java.lang.String]],
  options: js.UndefOr[CompilerOptions],
  host: js.UndefOr[CompilerHost],
  oldProgram: js.UndefOr[BuilderProgram],
  configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
  projectReferences: js.UndefOr[js.Array[ProjectReference]]
): BuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbstractBuilder")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[BuilderProgram]

/**
  * Create a function that reports watch status by writing to the system and handles the formating of the diagnostic
  */
inline def createBuilderStatusReporter(system: System): DiagnosticReporter = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilderStatusReporter")(system.asInstanceOf[js.Any]).asInstanceOf[DiagnosticReporter]
inline def createBuilderStatusReporter(system: System, pretty: Boolean): DiagnosticReporter = (^.asInstanceOf[js.Dynamic].applyDynamic("createBuilderStatusReporter")(system.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[DiagnosticReporter]

/** The classifier is used for syntactic highlighting in editors via the TSServer */
inline def createClassifier(): Classifier = ^.asInstanceOf[js.Dynamic].applyDynamic("createClassifier")().asInstanceOf[Classifier]

inline def createCompilerHost(options: CompilerOptions): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(options.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
inline def createCompilerHost(options: CompilerOptions, setParentNodes: Boolean): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompilerHost")(options.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]

inline def createDocumentRegistry(): DocumentRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentRegistry")().asInstanceOf[DocumentRegistry]
inline def createDocumentRegistry(useCaseSensitiveFileNames: Boolean): DocumentRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentRegistry")(useCaseSensitiveFileNames.asInstanceOf[js.Any]).asInstanceOf[DocumentRegistry]
inline def createDocumentRegistry(useCaseSensitiveFileNames: Boolean, currentDirectory: java.lang.String): DocumentRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentRegistry")(useCaseSensitiveFileNames.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any])).asInstanceOf[DocumentRegistry]
inline def createDocumentRegistry(useCaseSensitiveFileNames: Unit, currentDirectory: java.lang.String): DocumentRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocumentRegistry")(useCaseSensitiveFileNames.asInstanceOf[js.Any], currentDirectory.asInstanceOf[js.Any])).asInstanceOf[DocumentRegistry]

/**
  * Create the builder that can handle the changes in program and iterate through changed files
  * to emit the those files and manage semantic diagnostics cache as well
  */
inline def createEmitAndSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmitAndSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[EmitAndSemanticDiagnosticsBuilderProgram]
inline def createEmitAndSemanticDiagnosticsBuilderProgram(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: Unit,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): EmitAndSemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmitAndSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[EmitAndSemanticDiagnosticsBuilderProgram]
inline def createEmitAndSemanticDiagnosticsBuilderProgram(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
): EmitAndSemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmitAndSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[EmitAndSemanticDiagnosticsBuilderProgram]
inline def createEmitAndSemanticDiagnosticsBuilderProgram(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): EmitAndSemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmitAndSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[EmitAndSemanticDiagnosticsBuilderProgram]
inline def createEmitAndSemanticDiagnosticsBuilderProgram(
  rootNames: js.UndefOr[js.Array[java.lang.String]],
  options: js.UndefOr[CompilerOptions],
  host: js.UndefOr[CompilerHost],
  oldProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram],
  configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
  projectReferences: js.UndefOr[js.Array[ProjectReference]]
): EmitAndSemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createEmitAndSemanticDiagnosticsBuilderProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[EmitAndSemanticDiagnosticsBuilderProgram]

inline def createIncrementalCompilerHost(options: CompilerOptions): CompilerHost = ^.asInstanceOf[js.Dynamic].applyDynamic("createIncrementalCompilerHost")(options.asInstanceOf[js.Any]).asInstanceOf[CompilerHost]
inline def createIncrementalCompilerHost(options: CompilerOptions, system: System): CompilerHost = (^.asInstanceOf[js.Dynamic].applyDynamic("createIncrementalCompilerHost")(options.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[CompilerHost]

inline def createIncrementalProgram[T /* <: BuilderProgram */](param0: IncrementalProgramOptions[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("createIncrementalProgram")(param0.asInstanceOf[js.Any]).asInstanceOf[T]

/** @deprecated */
inline def createInputFiles(javascriptText: java.lang.String, declarationText: java.lang.String): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: java.lang.String,
  declarationMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: java.lang.String,
  declarationMapPath: java.lang.String,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: java.lang.String,
  declarationMapPath: Unit,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: Unit,
  declarationMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: Unit,
  declarationMapPath: java.lang.String,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: java.lang.String,
  javascriptMapText: Unit,
  declarationMapPath: Unit,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: java.lang.String,
  declarationMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: java.lang.String,
  declarationMapPath: java.lang.String,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: java.lang.String,
  declarationMapPath: Unit,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: Unit,
  declarationMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: Unit,
  declarationMapPath: java.lang.String,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  javascriptText: java.lang.String,
  declarationText: java.lang.String,
  javascriptMapPath: Unit,
  javascriptMapText: Unit,
  declarationMapPath: Unit,
  declarationMapText: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(javascriptText.asInstanceOf[js.Any], declarationText.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], javascriptMapText.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], declarationMapText.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
/** @deprecated */
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: java.lang.String,
  declarationPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: java.lang.String,
  declarationPath: java.lang.String,
  declarationMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: java.lang.String,
  declarationPath: java.lang.String,
  declarationMapPath: java.lang.String,
  buildInfoPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], buildInfoPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: java.lang.String,
  declarationPath: java.lang.String,
  declarationMapPath: Unit,
  buildInfoPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], buildInfoPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: Unit,
  declarationPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: Unit,
  declarationPath: java.lang.String,
  declarationMapPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: Unit,
  declarationPath: java.lang.String,
  declarationMapPath: java.lang.String,
  buildInfoPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], buildInfoPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]
inline def createInputFiles(
  readFileText: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]],
  javascriptPath: java.lang.String,
  javascriptMapPath: Unit,
  declarationPath: java.lang.String,
  declarationMapPath: Unit,
  buildInfoPath: java.lang.String
): InputFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("createInputFiles")(readFileText.asInstanceOf[js.Any], javascriptPath.asInstanceOf[js.Any], javascriptMapPath.asInstanceOf[js.Any], declarationPath.asInstanceOf[js.Any], declarationMapPath.asInstanceOf[js.Any], buildInfoPath.asInstanceOf[js.Any])).asInstanceOf[InputFiles]

inline def createLanguageService(host: LanguageServiceHost): LanguageService = ^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageService")(host.asInstanceOf[js.Any]).asInstanceOf[LanguageService]
inline def createLanguageService(host: LanguageServiceHost, documentRegistry: Unit, syntaxOnlyOrLanguageServiceMode: Boolean): LanguageService = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageService")(host.asInstanceOf[js.Any], documentRegistry.asInstanceOf[js.Any], syntaxOnlyOrLanguageServiceMode.asInstanceOf[js.Any])).asInstanceOf[LanguageService]
inline def createLanguageService(
  host: LanguageServiceHost,
  documentRegistry: Unit,
  syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
): LanguageService = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageService")(host.asInstanceOf[js.Any], documentRegistry.asInstanceOf[js.Any], syntaxOnlyOrLanguageServiceMode.asInstanceOf[js.Any])).asInstanceOf[LanguageService]
inline def createLanguageService(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageService")(host.asInstanceOf[js.Any], documentRegistry.asInstanceOf[js.Any])).asInstanceOf[LanguageService]
inline def createLanguageService(
  host: LanguageServiceHost,
  documentRegistry: DocumentRegistry,
  syntaxOnlyOrLanguageServiceMode: Boolean
): LanguageService = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageService")(host.asInstanceOf[js.Any], documentRegistry.asInstanceOf[js.Any], syntaxOnlyOrLanguageServiceMode.asInstanceOf[js.Any])).asInstanceOf[LanguageService]
inline def createLanguageService(
  host: LanguageServiceHost,
  documentRegistry: DocumentRegistry,
  syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
): LanguageService = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageService")(host.asInstanceOf[js.Any], documentRegistry.asInstanceOf[js.Any], syntaxOnlyOrLanguageServiceMode.asInstanceOf[js.Any])).asInstanceOf[LanguageService]

inline def createLanguageServiceSourceFile(
  fileName: java.lang.String,
  scriptSnapshot: IScriptSnapshot,
  scriptTargetOrOptions: CreateSourceFileOptions,
  version: java.lang.String,
  setNodeParents: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageServiceSourceFile")(fileName.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], scriptTargetOrOptions.asInstanceOf[js.Any], version.asInstanceOf[js.Any], setNodeParents.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createLanguageServiceSourceFile(
  fileName: java.lang.String,
  scriptSnapshot: IScriptSnapshot,
  scriptTargetOrOptions: CreateSourceFileOptions,
  version: java.lang.String,
  setNodeParents: Boolean,
  scriptKind: ScriptKind
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageServiceSourceFile")(fileName.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], scriptTargetOrOptions.asInstanceOf[js.Any], version.asInstanceOf[js.Any], setNodeParents.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createLanguageServiceSourceFile(
  fileName: java.lang.String,
  scriptSnapshot: IScriptSnapshot,
  scriptTargetOrOptions: ScriptTarget,
  version: java.lang.String,
  setNodeParents: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageServiceSourceFile")(fileName.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], scriptTargetOrOptions.asInstanceOf[js.Any], version.asInstanceOf[js.Any], setNodeParents.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createLanguageServiceSourceFile(
  fileName: java.lang.String,
  scriptSnapshot: IScriptSnapshot,
  scriptTargetOrOptions: ScriptTarget,
  version: java.lang.String,
  setNodeParents: Boolean,
  scriptKind: ScriptKind
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createLanguageServiceSourceFile")(fileName.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], scriptTargetOrOptions.asInstanceOf[js.Any], version.asInstanceOf[js.Any], setNodeParents.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]

inline def createModuleResolutionCache(
  currentDirectory: java.lang.String,
  getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String]
): ModuleResolutionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleResolutionCache")(currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any])).asInstanceOf[ModuleResolutionCache]
inline def createModuleResolutionCache(
  currentDirectory: java.lang.String,
  getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String],
  options: CompilerOptions
): ModuleResolutionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createModuleResolutionCache")(currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ModuleResolutionCache]

inline def createPrinter(): Printer = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrinter")().asInstanceOf[Printer]
inline def createPrinter(printerOptions: Unit, handlers: PrintHandlers): Printer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrinter")(printerOptions.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Printer]
inline def createPrinter(printerOptions: PrinterOptions): Printer = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrinter")(printerOptions.asInstanceOf[js.Any]).asInstanceOf[Printer]
inline def createPrinter(printerOptions: PrinterOptions, handlers: PrintHandlers): Printer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrinter")(printerOptions.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Printer]

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
inline def createProgram(createProgramOptions: CreateProgramOptions): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(createProgramOptions.asInstanceOf[js.Any]).asInstanceOf[Program]
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
inline def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(
  rootNames: js.Array[java.lang.String],
  options: CompilerOptions,
  host: Unit,
  oldProgram: Unit,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: Unit, oldProgram: Program): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(
  rootNames: js.Array[java.lang.String],
  options: CompilerOptions,
  host: Unit,
  oldProgram: Program,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(
  rootNames: js.Array[java.lang.String],
  options: CompilerOptions,
  host: CompilerHost,
  oldProgram: Unit,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(
  rootNames: js.Array[java.lang.String],
  options: CompilerOptions,
  host: CompilerHost,
  oldProgram: Program
): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[Program]
inline def createProgram(
  rootNames: js.Array[java.lang.String],
  options: CompilerOptions,
  host: CompilerHost,
  oldProgram: Program,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[Program]

inline def createScanner(languageVersion: ScriptTarget, skipTrivia: Boolean): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: Unit,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: Unit,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: Unit,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: ErrorCallback
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: ErrorCallback,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: ErrorCallback,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: java.lang.String,
  onError: ErrorCallback,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: Unit,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: Unit,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: Unit,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: ErrorCallback
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: ErrorCallback,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: ErrorCallback,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: Unit,
  textInitial: Unit,
  onError: ErrorCallback,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(languageVersion: ScriptTarget, skipTrivia: Boolean, languageVariant: LanguageVariant): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: Unit,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: Unit,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: Unit,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: ErrorCallback
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: ErrorCallback,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: ErrorCallback,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: java.lang.String,
  onError: ErrorCallback,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: Unit,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: Unit,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: Unit,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: ErrorCallback
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: ErrorCallback,
  start: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: ErrorCallback,
  start: Double,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]
inline def createScanner(
  languageVersion: ScriptTarget,
  skipTrivia: Boolean,
  languageVariant: LanguageVariant,
  textInitial: Unit,
  onError: ErrorCallback,
  start: Unit,
  length: Double
): Scanner = (^.asInstanceOf[js.Dynamic].applyDynamic("createScanner")(languageVersion.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any], languageVariant.asInstanceOf[js.Any], textInitial.asInstanceOf[js.Any], onError.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Scanner]

/**
  * Create the builder to manage semantic diagnostics and cache them
  */
inline def createSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost): SemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[SemanticDiagnosticsBuilderProgram]
inline def createSemanticDiagnosticsBuilderProgram(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: Unit,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): SemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[SemanticDiagnosticsBuilderProgram]
inline def createSemanticDiagnosticsBuilderProgram(newProgram: Program, host: BuilderProgramHost, oldProgram: SemanticDiagnosticsBuilderProgram): SemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any])).asInstanceOf[SemanticDiagnosticsBuilderProgram]
inline def createSemanticDiagnosticsBuilderProgram(
  newProgram: Program,
  host: BuilderProgramHost,
  oldProgram: SemanticDiagnosticsBuilderProgram,
  configFileParsingDiagnostics: js.Array[Diagnostic]
): SemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createSemanticDiagnosticsBuilderProgram")(newProgram.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any])).asInstanceOf[SemanticDiagnosticsBuilderProgram]
inline def createSemanticDiagnosticsBuilderProgram(
  rootNames: js.UndefOr[js.Array[java.lang.String]],
  options: js.UndefOr[CompilerOptions],
  host: js.UndefOr[CompilerHost],
  oldProgram: js.UndefOr[SemanticDiagnosticsBuilderProgram],
  configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
  projectReferences: js.UndefOr[js.Array[ProjectReference]]
): SemanticDiagnosticsBuilderProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("createSemanticDiagnosticsBuilderProgram")(rootNames.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], oldProgram.asInstanceOf[js.Any], configFileParsingDiagnostics.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[SemanticDiagnosticsBuilderProgram]

inline def createSolutionBuilder[T /* <: BuilderProgram */](host: SolutionBuilderHost[T], rootNames: js.Array[java.lang.String], defaultOptions: BuildOptions): SolutionBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilder")(host.asInstanceOf[js.Any], rootNames.asInstanceOf[js.Any], defaultOptions.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilder[T]]

inline def createSolutionBuilderHost[T /* <: BuilderProgram */](): SolutionBuilderHost[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")().asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: Unit, createProgram: Unit, reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: Unit, createProgram: CreateProgram_[T]): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: Unit, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System): SolutionBuilderHost[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any]).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System, createProgram: Unit, reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]
inline def createSolutionBuilderHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportErrorSummary: ReportEmitErrorSummary
): SolutionBuilderHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportErrorSummary.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderHost[T]]

inline def createSolutionBuilderWithWatch[T /* <: BuilderProgram */](
  host: SolutionBuilderWithWatchHost[T],
  rootNames: js.Array[java.lang.String],
  defaultOptions: BuildOptions
): SolutionBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatch")(host.asInstanceOf[js.Any], rootNames.asInstanceOf[js.Any], defaultOptions.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilder[T]]
inline def createSolutionBuilderWithWatch[T /* <: BuilderProgram */](
  host: SolutionBuilderWithWatchHost[T],
  rootNames: js.Array[java.lang.String],
  defaultOptions: BuildOptions,
  baseWatchOptions: WatchOptions
): SolutionBuilder[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatch")(host.asInstanceOf[js.Any], rootNames.asInstanceOf[js.Any], defaultOptions.asInstanceOf[js.Any], baseWatchOptions.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilder[T]]

inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](): SolutionBuilderWithWatchHost[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")().asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: Unit, createProgram: Unit, reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: Unit, createProgram: CreateProgram_[T]): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: Unit, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: Unit,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System): SolutionBuilderWithWatchHost[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any]).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System, createProgram: Unit, reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: Unit,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]
inline def createSolutionBuilderWithWatchHost[T /* <: BuilderProgram */](
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportSolutionBuilderStatus: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): SolutionBuilderWithWatchHost[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createSolutionBuilderWithWatchHost")(system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportSolutionBuilderStatus.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[SolutionBuilderWithWatchHost[T]]

inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: CreateSourceFileOptions
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: CreateSourceFileOptions,
  setParentNodes: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: CreateSourceFileOptions,
  setParentNodes: Boolean,
  scriptKind: ScriptKind
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: CreateSourceFileOptions,
  setParentNodes: Unit,
  scriptKind: ScriptKind
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(fileName: java.lang.String, sourceText: java.lang.String, languageVersionOrOptions: ScriptTarget): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: ScriptTarget,
  setParentNodes: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: ScriptTarget,
  setParentNodes: Boolean,
  scriptKind: ScriptKind
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def createSourceFile(
  fileName: java.lang.String,
  sourceText: java.lang.String,
  languageVersionOrOptions: ScriptTarget,
  setParentNodes: Unit,
  scriptKind: ScriptKind
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceFile")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], languageVersionOrOptions.asInstanceOf[js.Any], setParentNodes.asInstanceOf[js.Any], scriptKind.asInstanceOf[js.Any])).asInstanceOf[SourceFile]

/**
  * Create an external source map source file reference
  */
inline def createSourceMapSource(fileName: java.lang.String, text: java.lang.String): SourceMapSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceMapSource")(fileName.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[SourceMapSource]
inline def createSourceMapSource(
  fileName: java.lang.String,
  text: java.lang.String,
  skipTrivia: js.Function1[/* pos */ Double, Double]
): SourceMapSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createSourceMapSource")(fileName.asInstanceOf[js.Any], text.asInstanceOf[js.Any], skipTrivia.asInstanceOf[js.Any])).asInstanceOf[SourceMapSource]

inline def createTextChangeRange(span: TextSpan, newLength: Double): TextChangeRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextChangeRange")(span.asInstanceOf[js.Any], newLength.asInstanceOf[js.Any])).asInstanceOf[TextChangeRange]

inline def createTextSpan(start: Double, length: Double): TextSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextSpan")(start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TextSpan]

inline def createTextSpanFromBounds(start: Double, end: Double): TextSpan = (^.asInstanceOf[js.Dynamic].applyDynamic("createTextSpanFromBounds")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[TextSpan]

inline def createTypeReferenceDirectiveResolutionCache(
  currentDirectory: java.lang.String,
  getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String]
): TypeReferenceDirectiveResolutionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeReferenceDirectiveResolutionCache")(currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any])).asInstanceOf[TypeReferenceDirectiveResolutionCache]
inline def createTypeReferenceDirectiveResolutionCache(
  currentDirectory: java.lang.String,
  getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String],
  options: Unit,
  packageJsonInfoCache: PackageJsonInfoCache
): TypeReferenceDirectiveResolutionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeReferenceDirectiveResolutionCache")(currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], packageJsonInfoCache.asInstanceOf[js.Any])).asInstanceOf[TypeReferenceDirectiveResolutionCache]
inline def createTypeReferenceDirectiveResolutionCache(
  currentDirectory: java.lang.String,
  getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String],
  options: CompilerOptions
): TypeReferenceDirectiveResolutionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeReferenceDirectiveResolutionCache")(currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TypeReferenceDirectiveResolutionCache]
inline def createTypeReferenceDirectiveResolutionCache(
  currentDirectory: java.lang.String,
  getCanonicalFileName: js.Function1[/* s */ java.lang.String, java.lang.String],
  options: CompilerOptions,
  packageJsonInfoCache: PackageJsonInfoCache
): TypeReferenceDirectiveResolutionCache = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeReferenceDirectiveResolutionCache")(currentDirectory.asInstanceOf[js.Any], getCanonicalFileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], packageJsonInfoCache.asInstanceOf[js.Any])).asInstanceOf[TypeReferenceDirectiveResolutionCache]

/** @deprecated */
inline def createUnparsedSourceFile(inputFile: InputFiles, `type`: js_ | dts): UnparsedSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnparsedSourceFile")(inputFile.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[UnparsedSource]
inline def createUnparsedSourceFile(inputFile: InputFiles, `type`: js_ | dts, stripInternal: Boolean): UnparsedSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnparsedSourceFile")(inputFile.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], stripInternal.asInstanceOf[js.Any])).asInstanceOf[UnparsedSource]
/** @deprecated */
inline def createUnparsedSourceFile(text: java.lang.String): UnparsedSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnparsedSourceFile")(text.asInstanceOf[js.Any]).asInstanceOf[UnparsedSource]
inline def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String): UnparsedSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnparsedSourceFile")(text.asInstanceOf[js.Any], mapPath.asInstanceOf[js.Any])).asInstanceOf[UnparsedSource]
inline def createUnparsedSourceFile(text: java.lang.String, mapPath: java.lang.String, map: java.lang.String): UnparsedSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnparsedSourceFile")(text.asInstanceOf[js.Any], mapPath.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[UnparsedSource]
inline def createUnparsedSourceFile(text: java.lang.String, mapPath: Unit, map: java.lang.String): UnparsedSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createUnparsedSourceFile")(text.asInstanceOf[js.Any], mapPath.asInstanceOf[js.Any], map.asInstanceOf[js.Any])).asInstanceOf[UnparsedSource]

/**
  * Create the watch compiler host for either configFile or fileNames and its options
  */
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  configFileName: java.lang.String,
  optionsToExtend: js.UndefOr[CompilerOptions],
  system: System,
  createProgram: js.UndefOr[CreateProgram_[T]],
  reportDiagnostic: js.UndefOr[DiagnosticReporter],
  reportWatchStatus: js.UndefOr[WatchStatusReporter],
  watchOptionsToExtend: js.UndefOr[WatchOptions],
  extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]]
): WatchCompilerHostOfConfigFile[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfConfigFile[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](rootFiles: js.Array[java.lang.String], options: CompilerOptions, system: System): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: Unit,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: Unit,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: Unit,
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: Unit,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: Unit,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: Unit,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: Unit,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference]
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: js.Array[ProjectReference],
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]
inline def createWatchCompilerHost[T /* <: BuilderProgram */](
  rootFiles: js.Array[java.lang.String],
  options: CompilerOptions,
  system: System,
  createProgram: CreateProgram_[T],
  reportDiagnostic: DiagnosticReporter,
  reportWatchStatus: WatchStatusReporter,
  projectReferences: Unit,
  watchOptions: WatchOptions
): WatchCompilerHostOfFilesAndCompilerOptions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatchCompilerHost")(rootFiles.asInstanceOf[js.Any], options.asInstanceOf[js.Any], system.asInstanceOf[js.Any], createProgram.asInstanceOf[js.Any], reportDiagnostic.asInstanceOf[js.Any], reportWatchStatus.asInstanceOf[js.Any], projectReferences.asInstanceOf[js.Any], watchOptions.asInstanceOf[js.Any])).asInstanceOf[WatchCompilerHostOfFilesAndCompilerOptions[T]]

/**
  * Creates the watch from the host for config file
  */
inline def createWatchProgram[T /* <: BuilderProgram */](host: WatchCompilerHostOfConfigFile[T]): WatchOfConfigFile[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatchProgram")(host.asInstanceOf[js.Any]).asInstanceOf[WatchOfConfigFile[T]]
/**
  * Creates the watch from the host for root files and compiler options
  */
inline def createWatchProgram[T /* <: BuilderProgram */](host: WatchCompilerHostOfFilesAndCompilerOptions[T]): WatchOfFilesAndCompilerOptions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatchProgram")(host.asInstanceOf[js.Any]).asInstanceOf[WatchOfFilesAndCompilerOptions[T]]

inline def decodedTextSpanIntersectsWith(start1: Double, length1: Double, start2: Double, length2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("decodedTextSpanIntersectsWith")(start1.asInstanceOf[js.Any], length1.asInstanceOf[js.Any], start2.asInstanceOf[js.Any], length2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def displayPartsToString(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("displayPartsToString")().asInstanceOf[java.lang.String]
inline def displayPartsToString(displayParts: js.Array[SymbolDisplayPart]): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("displayPartsToString")(displayParts.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Clears any `EmitNode` entries from parse-tree nodes.
  * @param sourceFile A source file.
  */
inline def disposeEmitNodes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeEmitNodes")().asInstanceOf[Unit]
inline def disposeEmitNodes(sourceFile: SourceFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeEmitNodes")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__' */
inline def escapeLeadingUnderscores(identifier: java.lang.String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeLeadingUnderscores")(identifier.asInstanceOf[js.Any]).asInstanceOf[String]

inline def factory: NodeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("factory").asInstanceOf[NodeFactory]

inline def findAncestor[T /* <: Node */](node: Unit, callback: js.Function1[/* element */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
/**
  * Iterates through the parent chain of a node and performs the callback on each parent until the callback
  * returns a truthy value, then returns that value.
  * If no such value is found, it applies the callback until the parent pointer is undefined or the callback returns "quit"
  * At that point findAncestor returns undefined.
  */
inline def findAncestor[T /* <: Node */](node: Node, callback: js.Function1[/* element */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def findAncestor_quit(node: Unit, callback: js.Function1[/* element */ Node, Boolean | quit]): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]
inline def findAncestor_quit(node: Node, callback: js.Function1[/* element */ Node, Boolean | quit]): js.UndefOr[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAncestor")(node.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Node]]

inline def findConfigFile(searchPath: java.lang.String, fileExists: js.Function1[/* fileName */ java.lang.String, Boolean]): js.UndefOr[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(searchPath.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
inline def findConfigFile(
  searchPath: java.lang.String,
  fileExists: js.Function1[/* fileName */ java.lang.String, Boolean],
  configName: java.lang.String
): js.UndefOr[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(searchPath.asInstanceOf[js.Any], fileExists.asInstanceOf[js.Any], configName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]

inline def flattenDiagnosticMessageText(diag: java.lang.String, newLine: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDiagnosticMessageText")(diag.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def flattenDiagnosticMessageText(diag: java.lang.String, newLine: java.lang.String, indent: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDiagnosticMessageText")(diag.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def flattenDiagnosticMessageText(diag: Unit, newLine: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDiagnosticMessageText")(diag.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def flattenDiagnosticMessageText(diag: Unit, newLine: java.lang.String, indent: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDiagnosticMessageText")(diag.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDiagnosticMessageText")(diag.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def flattenDiagnosticMessageText(diag: DiagnosticMessageChain, newLine: java.lang.String, indent: Double): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenDiagnosticMessageText")(diag.asInstanceOf[js.Any], newLine.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

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
inline def forEachChild[T](node: Node, cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def forEachChild[T](
  node: Node,
  cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
  cbNodes: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachChild")(node.asInstanceOf[js.Any], cbNode.asInstanceOf[js.Any], cbNodes.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def forEachLeadingCommentRange[U](
  text: java.lang.String,
  pos: Double,
  cb: js.Function4[
  /* pos */ Double, 
  /* end */ Double, 
  /* kind */ CommentKind, 
  /* hasTrailingNewLine */ Boolean, 
  U
]
): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLeadingCommentRange")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
inline def forEachLeadingCommentRange[T, U](
  text: java.lang.String,
  pos: Double,
  cb: js.Function5[
  /* pos */ Double, 
  /* end */ Double, 
  /* kind */ CommentKind, 
  /* hasTrailingNewLine */ Boolean, 
  /* state */ T, 
  U
],
  state: T
): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLeadingCommentRange")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]

inline def forEachTrailingCommentRange[U](
  text: java.lang.String,
  pos: Double,
  cb: js.Function4[
  /* pos */ Double, 
  /* end */ Double, 
  /* kind */ CommentKind, 
  /* hasTrailingNewLine */ Boolean, 
  U
]
): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTrailingCommentRange")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]
inline def forEachTrailingCommentRange[T, U](
  text: java.lang.String,
  pos: Double,
  cb: js.Function5[
  /* pos */ Double, 
  /* end */ Double, 
  /* kind */ CommentKind, 
  /* hasTrailingNewLine */ Boolean, 
  /* state */ T, 
  U
],
  state: T
): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachTrailingCommentRange")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]

inline def formatDiagnostic(diagnostic: Diagnostic, host: FormatDiagnosticsHost): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnostic")(diagnostic.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def formatDiagnostics(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnostics")(diagnostics.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def formatDiagnosticsWithColorAndContext(diagnostics: js.Array[Diagnostic], host: FormatDiagnosticsHost): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDiagnosticsWithColorAndContext")(diagnostics.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

/** Gets all JSDoc tags that match a specified predicate */
inline def getAllJSDocTags[T /* <: JSDocTag */](node: Node, predicate: js.Function1[/* tag */ JSDocTag, /* is T */ Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllJSDocTags")(node.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

/** Gets all JSDoc tags of a specified kind */
inline def getAllJSDocTagsOfKind(node: Node, kind: SyntaxKind): js.Array[JSDocTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAllJSDocTagsOfKind")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[js.Array[JSDocTag]]

/**
  * Given a set of options, returns the set of type directive names
  *   that should be included for this program automatically.
  * This list could either come from the config file,
  *   or from enumerating the types root + initial secondary types lookup location.
  * More type directives might appear in the program later as a result of loading actual source files;
  *   this list is only the set of defaults that are implicitly included.
  */
inline def getAutomaticTypeDirectiveNames(options: CompilerOptions, host: ModuleResolutionHost): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutomaticTypeDirectiveNames")(options.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]

inline def getCombinedModifierFlags(node: Declaration): ModifierFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedModifierFlags")(node.asInstanceOf[js.Any]).asInstanceOf[ModifierFlags]

inline def getCombinedNodeFlags(node: Node): NodeFlags = ^.asInstanceOf[js.Dynamic].applyDynamic("getCombinedNodeFlags")(node.asInstanceOf[js.Any]).asInstanceOf[NodeFlags]

/**
  * Gets a custom text range to use when emitting comments.
  */
inline def getCommentRange(node: Node): TextRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommentRange")(node.asInstanceOf[js.Any]).asInstanceOf[TextRange]

inline def getConfigFileParsingDiagnostics(configFileParseResult: ParsedCommandLine): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFileParsingDiagnostics")(configFileParseResult.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]

/**
  * Gets the constant value to emit for an expression representing an enum.
  */
inline def getConstantValue(node: AccessExpression): js.UndefOr[java.lang.String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstantValue")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String | Double]]

inline def getDecorators(node: HasDecorators): js.UndefOr[js.Array[Decorator]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecorators")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Decorator]]]

inline def getDefaultCompilerOptions(): CompilerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultCompilerOptions")().asInstanceOf[CompilerOptions]

inline def getDefaultFormatCodeSettings(): FormatCodeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormatCodeSettings")().asInstanceOf[FormatCodeSettings]
inline def getDefaultFormatCodeSettings(newLineCharacter: java.lang.String): FormatCodeSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormatCodeSettings")(newLineCharacter.asInstanceOf[js.Any]).asInstanceOf[FormatCodeSettings]

inline def getDefaultLibFileName(options: CompilerOptions): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLibFileName")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * Get the path of the default library files (lib.d.ts) as distributed with the typescript
  * node package.
  * The functionality is not supported if the ts module is consumed outside of a node module.
  */
inline def getDefaultLibFilePath(options: CompilerOptions): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLibFilePath")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def getEffectiveConstraintOfTypeParameter(node: TypeParameterDeclaration): js.UndefOr[TypeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveConstraintOfTypeParameter")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeNode]]

/**
  * Gets the effective type parameters. If the node was parsed in a
  * JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
  *
  * This does *not* return type parameters from a jsdoc reference to a generic type, eg
  *
  * type Id = <T>(x: T) => T
  * / ** @type {Id} /
  * function id(x) { return x }
  */
inline def getEffectiveTypeParameterDeclarations(node: DeclarationWithTypeParameters): js.Array[TypeParameterDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveTypeParameterDeclarations")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[TypeParameterDeclaration]]

inline def getEffectiveTypeRoots(options: CompilerOptions, host: GetEffectiveTypeRootsHost): js.UndefOr[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEffectiveTypeRoots")(options.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[java.lang.String]]]

/**
  * Gets the EmitHelpers of a node.
  */
inline def getEmitHelpers(node: Node): js.UndefOr[js.Array[EmitHelper]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmitHelpers")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[EmitHelper]]]

inline def getImpliedNodeFormatForFile(fileName: Path, packageJsonInfoCache: Unit, host: ModuleResolutionHost, options: CompilerOptions): ResolutionMode = (^.asInstanceOf[js.Dynamic].applyDynamic("getImpliedNodeFormatForFile")(fileName.asInstanceOf[js.Any], packageJsonInfoCache.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResolutionMode]
/**
  * A function for determining if a given file is esm or cjs format, assuming modern node module resolution rules, as configured by the
  * `options` parameter.
  *
  * @param fileName The normalized absolute path to check the format of (it need not exist on disk)
  * @param [packageJsonInfoCache] A cache for package file lookups - it's best to have a cache when this function is called often
  * @param host The ModuleResolutionHost which can perform the filesystem lookups for package json data
  * @param options The compiler options to perform the analysis under - relevant options are `moduleResolution` and `traceResolution`
  * @returns `undefined` if the path has no relevant implied format, `ModuleKind.ESNext` for esm format, and `ModuleKind.CommonJS` for cjs format
  */
inline def getImpliedNodeFormatForFile(
  fileName: Path,
  packageJsonInfoCache: PackageJsonInfoCache,
  host: ModuleResolutionHost,
  options: CompilerOptions
): ResolutionMode = (^.asInstanceOf[js.Dynamic].applyDynamic("getImpliedNodeFormatForFile")(fileName.asInstanceOf[js.Any], packageJsonInfoCache.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ResolutionMode]

/** Gets the JSDoc augments tag for the node if present */
inline def getJSDocAugmentsTag(node: Node): js.UndefOr[JSDocAugmentsTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocAugmentsTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocAugmentsTag]]

/** Gets the JSDoc class tag for the node if present */
inline def getJSDocClassTag(node: Node): js.UndefOr[JSDocClassTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocClassTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocClassTag]]

/** Gets the JSDoc deprecated tag for the node if present */
inline def getJSDocDeprecatedTag(node: Node): js.UndefOr[JSDocDeprecatedTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocDeprecatedTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocDeprecatedTag]]

/** Gets the JSDoc enum tag for the node if present */
inline def getJSDocEnumTag(node: Node): js.UndefOr[JSDocEnumTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocEnumTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocEnumTag]]

/** Gets the JSDoc implements tags for the node if present */
inline def getJSDocImplementsTags(node: Node): js.Array[JSDocImplementsTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocImplementsTags")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDocImplementsTag]]

inline def getJSDocOverrideTagNoCache(node: Node): js.UndefOr[JSDocOverrideTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocOverrideTagNoCache")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocOverrideTag]]

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
inline def getJSDocParameterTags(param: ParameterDeclaration): js.Array[JSDocParameterTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocParameterTags")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDocParameterTag]]

/** Gets the JSDoc private tag for the node if present */
inline def getJSDocPrivateTag(node: Node): js.UndefOr[JSDocPrivateTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocPrivateTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocPrivateTag]]

/** Gets the JSDoc protected tag for the node if present */
inline def getJSDocProtectedTag(node: Node): js.UndefOr[JSDocProtectedTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocProtectedTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocProtectedTag]]

/** Gets the JSDoc public tag for the node if present */
inline def getJSDocPublicTag(node: Node): js.UndefOr[JSDocPublicTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocPublicTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocPublicTag]]

/** Gets the JSDoc protected tag for the node if present */
inline def getJSDocReadonlyTag(node: Node): js.UndefOr[JSDocReadonlyTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocReadonlyTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocReadonlyTag]]

/** Gets the JSDoc return tag for the node if present */
inline def getJSDocReturnTag(node: Node): js.UndefOr[JSDocReturnTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocReturnTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocReturnTag]]

/**
  * Gets the return type node for the node if provided via JSDoc return tag or type tag.
  *
  * @remarks `getJSDocReturnTag` just gets the whole JSDoc tag. This function
  * gets the type from inside the braces, after the fat arrow, etc.
  */
inline def getJSDocReturnType(node: Node): js.UndefOr[TypeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocReturnType")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeNode]]

inline def getJSDocSatisfiesTag(node: Node): js.UndefOr[JSDocSatisfiesTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocSatisfiesTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocSatisfiesTag]]

/** Get all JSDoc tags related to a node, including those on parent nodes. */
inline def getJSDocTags(node: Node): js.Array[JSDocTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocTags")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDocTag]]

/** Gets the JSDoc template tag for the node if present */
inline def getJSDocTemplateTag(node: Node): js.UndefOr[JSDocTemplateTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocTemplateTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocTemplateTag]]

/** Gets the JSDoc this tag for the node if present */
inline def getJSDocThisTag(node: Node): js.UndefOr[JSDocThisTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocThisTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocThisTag]]

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
inline def getJSDocType(node: Node): js.UndefOr[TypeNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocType")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeNode]]

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
inline def getJSDocTypeParameterTags(param: TypeParameterDeclaration): js.Array[JSDocTemplateTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocTypeParameterTags")(param.asInstanceOf[js.Any]).asInstanceOf[js.Array[JSDocTemplateTag]]

/** Gets the JSDoc type tag for the node if present and valid */
inline def getJSDocTypeTag(node: Node): js.UndefOr[JSDocTypeTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJSDocTypeTag")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSDocTypeTag]]

inline def getLeadingCommentRanges(text: java.lang.String, pos: Double): js.UndefOr[js.Array[CommentRange]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLeadingCommentRanges")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[CommentRange]]]

inline def getLineAndCharacterOfPosition(sourceFile: SourceFileLike, position: Double): LineAndCharacter = (^.asInstanceOf[js.Dynamic].applyDynamic("getLineAndCharacterOfPosition")(sourceFile.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[LineAndCharacter]

inline def getModeForFileReference(ref: java.lang.String, containingFileMode: ResolutionMode): ResolutionMode = (^.asInstanceOf[js.Dynamic].applyDynamic("getModeForFileReference")(ref.asInstanceOf[js.Any], containingFileMode.asInstanceOf[js.Any])).asInstanceOf[ResolutionMode]
/**
  * Calculates the resulting resolution mode for some reference in some file - this is generally the explicitly
  * provided resolution mode in the reference, unless one is not present, in which case it is the mode of the containing file.
  */
inline def getModeForFileReference(ref: FileReference, containingFileMode: ResolutionMode): ResolutionMode = (^.asInstanceOf[js.Dynamic].applyDynamic("getModeForFileReference")(ref.asInstanceOf[js.Any], containingFileMode.asInstanceOf[js.Any])).asInstanceOf[ResolutionMode]

/**
  * Calculates the final resolution mode for an import at some index within a file's imports list. This is generally the explicitly
  * defined mode of the import if provided, or, if not, the mode of the containing file (with some exceptions: import=require is always commonjs, dynamic import is always esm).
  * If you have an actual import node, prefer using getModeForUsageLocation on the reference string node.
  * @param file File to fetch the resolution mode within
  * @param index Index into the file's complete resolution list to get the resolution of - this is a concatenation of the file's imports and module augmentations
  */
inline def getModeForResolutionAtIndex(file: SourceFile, index: Double): ResolutionMode = (^.asInstanceOf[js.Dynamic].applyDynamic("getModeForResolutionAtIndex")(file.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[ResolutionMode]

/**
  * Calculates the final resolution mode for a given module reference node. This is generally the explicitly provided resolution mode, if
  * one exists, or the mode of the containing source file. (Excepting import=require, which is always commonjs, and dynamic import, which is always esm).
  * Notably, this function always returns `undefined` if the containing file has an `undefined` `impliedNodeFormat` - this field is only set when
  * `moduleResolution` is `node16`+.
  * @param file The file the import or import-like reference is contained within
  * @param usage The module reference string
  * @returns The final resolution mode of the import
  */
inline def getModeForUsageLocation(file: ImpliedNodeFormat, usage: StringLiteralLike): js.UndefOr[CommonJS | ESNext] = (^.asInstanceOf[js.Dynamic].applyDynamic("getModeForUsageLocation")(file.asInstanceOf[js.Any], usage.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[CommonJS | ESNext]]

inline def getModifiers(node: HasModifiers): js.UndefOr[js.Array[Modifier]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModifiers")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Modifier]]]

inline def getNameOfDeclaration(): js.UndefOr[DeclarationName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfDeclaration")().asInstanceOf[js.UndefOr[DeclarationName]]
inline def getNameOfDeclaration(declaration: Declaration): js.UndefOr[DeclarationName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DeclarationName]]
inline def getNameOfDeclaration(declaration: Expression): js.UndefOr[DeclarationName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfDeclaration")(declaration.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DeclarationName]]

inline def getNameOfJSDocTypedef(declaration: JSDocTypedefTag): js.UndefOr[Identifier | PrivateIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameOfJSDocTypedef")(declaration.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Identifier | PrivateIdentifier]]

inline def getOriginalNode(): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalNode")().asInstanceOf[js.UndefOr[Node]]
inline def getOriginalNode(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
inline def getOriginalNode[T /* <: Node */](node: Unit, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalNode")(node.asInstanceOf[js.Any], nodeTest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def getOriginalNode[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalNode")(node.asInstanceOf[js.Any], nodeTest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

inline def getOriginalNode_Node(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalNode")(node.asInstanceOf[js.Any]).asInstanceOf[Node]

inline def getOriginalNode_T_T[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginalNode")(node.asInstanceOf[js.Any], nodeTest.asInstanceOf[js.Any])).asInstanceOf[T]

inline def getOutputFileNames(commandLine: ParsedCommandLine, inputFileName: java.lang.String, ignoreCase: Boolean): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutputFileNames")(commandLine.asInstanceOf[js.Any], inputFileName.asInstanceOf[js.Any], ignoreCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]

/**
  * Gets the original parse tree node for a node.
  *
  * @param node The original node.
  * @returns The original parse tree node if found; otherwise, undefined.
  */
inline def getParseTreeNode(): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseTreeNode")().asInstanceOf[js.UndefOr[Node]]
inline def getParseTreeNode(node: Node): js.UndefOr[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Node]]
inline def getParseTreeNode[T /* <: Node */](node: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
inline def getParseTreeNode[T /* <: Node */](node: T, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParseTreeNode")(node.asInstanceOf[js.Any], nodeTest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def getParseTreeNode[T /* <: Node */](node: Unit, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParseTreeNode")(node.asInstanceOf[js.Any], nodeTest.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

/**
  * Gets the original parse tree node for a node.
  *
  * @param node The original node.
  * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
  * @returns The original parse tree node if found; otherwise, undefined.
  */
inline def getParseTreeNode_T[T /* <: Node */](): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParseTreeNode")().asInstanceOf[js.UndefOr[T]]

inline def getParsedCommandLineOfConfigFile(configFileName: java.lang.String, optionsToExtend: Unit, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Unit,
  watchOptionsToExtend: Unit,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Unit,
  watchOptionsToExtend: WatchOptions
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Unit,
  watchOptionsToExtend: WatchOptions,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry],
  watchOptionsToExtend: Unit,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry],
  watchOptionsToExtend: WatchOptions
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: Unit,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry],
  watchOptionsToExtend: WatchOptions,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
/**
  * Reads the config file, reports errors if any and exits if the config file cannot be found
  */
inline def getParsedCommandLineOfConfigFile(configFileName: java.lang.String, optionsToExtend: CompilerOptions, host: ParseConfigFileHost): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Unit,
  watchOptionsToExtend: Unit,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Unit,
  watchOptionsToExtend: WatchOptions
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Unit,
  watchOptionsToExtend: WatchOptions,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry],
  watchOptionsToExtend: Unit,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry],
  watchOptionsToExtend: WatchOptions
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]
inline def getParsedCommandLineOfConfigFile(
  configFileName: java.lang.String,
  optionsToExtend: CompilerOptions,
  host: ParseConfigFileHost,
  extendedConfigCache: Map[java.lang.String, ExtendedConfigCacheEntry],
  watchOptionsToExtend: WatchOptions,
  extraFileExtensions: js.Array[FileExtensionInfo]
): js.UndefOr[ParsedCommandLine] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParsedCommandLineOfConfigFile")(configFileName.asInstanceOf[js.Any], optionsToExtend.asInstanceOf[js.Any], host.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], watchOptionsToExtend.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ParsedCommandLine]]

inline def getPositionOfLineAndCharacter(sourceFile: SourceFileLike, line: Double, character: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPositionOfLineAndCharacter")(sourceFile.asInstanceOf[js.Any], line.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def getPreEmitDiagnostics(program: Program): js.Array[Diagnostic] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreEmitDiagnostics")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[Diagnostic]]
inline def getPreEmitDiagnostics(program: Program, sourceFile: Unit, cancellationToken: CancellationToken): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreEmitDiagnostics")(program.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], cancellationToken.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
inline def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreEmitDiagnostics")(program.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]
inline def getPreEmitDiagnostics(program: Program, sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreEmitDiagnostics")(program.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], cancellationToken.asInstanceOf[js.Any])).asInstanceOf[js.Array[Diagnostic]]

/** Optionally, get the shebang */
inline def getShebang(text: java.lang.String): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShebang")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]

/**
  * Gets a custom text range to use when emitting source maps.
  */
inline def getSourceMapRange(node: Node): SourceMapRange = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceMapRange")(node.asInstanceOf[js.Any]).asInstanceOf[SourceMapRange]

inline def getSupportedCodeFixes(): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedCodeFixes")().asInstanceOf[js.Array[java.lang.String]]

inline def getSyntheticLeadingComments(node: Node): js.UndefOr[js.Array[SynthesizedComment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSyntheticLeadingComments")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[SynthesizedComment]]]

inline def getSyntheticTrailingComments(node: Node): js.UndefOr[js.Array[SynthesizedComment]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSyntheticTrailingComments")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[SynthesizedComment]]]

/** Gets the text of a jsdoc comment, flattening links to their text. */
inline def getTextOfJSDocComment(): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextOfJSDocComment")().asInstanceOf[js.UndefOr[java.lang.String]]
inline def getTextOfJSDocComment(comment: java.lang.String): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextOfJSDocComment")(comment.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
inline def getTextOfJSDocComment(comment: NodeArray[JSDocComment]): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextOfJSDocComment")(comment.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]

/**
  * Gets the TextRange to use for source maps for a token of a node.
  */
inline def getTokenSourceMapRange(node: Node, token: SyntaxKind): js.UndefOr[SourceMapRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTokenSourceMapRange")(node.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SourceMapRange]]

inline def getTrailingCommentRanges(text: java.lang.String, pos: Double): js.UndefOr[js.Array[CommentRange]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTrailingCommentRanges")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[CommentRange]]]

inline def getTsBuildInfoEmitOutputFilePath(options: CompilerOptions): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTsBuildInfoEmitOutputFilePath")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]

inline def getTypeParameterOwner(d: Declaration): js.UndefOr[Declaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterOwner")(d.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Declaration]]

/**
  * Return true if the node has JSDoc parameter tags.
  *
  * @remarks Includes parameter tags that are not directly on the node,
  * for example on a variable declaration whose initializer is a function expression.
  */
inline def hasJSDocParameterTags(node: FunctionLikeDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasJSDocParameterTags")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def hasJSDocParameterTags(node: SignatureDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasJSDocParameterTags")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** True if has initializer node attached to it. */
inline def hasOnlyExpressionInitializer(node: Node): /* is typescript.typescript.HasExpressionInitializer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOnlyExpressionInitializer")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HasExpressionInitializer */ Boolean]

inline def hasRestParameter(s: JSDocSignature): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRestParameter")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def hasRestParameter(s: SignatureDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRestParameter")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def idText(identifierOrPrivateName: Identifier): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("idText")(identifierOrPrivateName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def idText(identifierOrPrivateName: PrivateIdentifier): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("idText")(identifierOrPrivateName.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

/**
  * If the text of an Identifier matches a keyword (including contextual and TypeScript-specific keywords), returns the
  * SyntaxKind for the matching keyword.
  */
inline def identifierToKeywordKind(node: Identifier): js.UndefOr[KeywordSyntaxKind] = ^.asInstanceOf[js.Dynamic].applyDynamic("identifierToKeywordKind")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[KeywordSyntaxKind]]

inline def isAccessor(node: Node): /* is typescript.typescript.AccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAccessor")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AccessorDeclaration */ Boolean]

inline def isArrayBindingElement(node: Node): /* is typescript.typescript.ArrayBindingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayBindingElement */ Boolean]

inline def isArrayBindingPattern(node: Node): /* is typescript.typescript.ArrayBindingPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBindingPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayBindingPattern */ Boolean]

inline def isArrayLiteralExpression(node: Node): /* is typescript.typescript.ArrayLiteralExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLiteralExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayLiteralExpression */ Boolean]

inline def isArrayTypeNode(node: Node): /* is typescript.typescript.ArrayTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrayTypeNode */ Boolean]

inline def isArrowFunction(node: Node): /* is typescript.typescript.ArrowFunction */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrowFunction")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ArrowFunction */ Boolean]

inline def isAsExpression(node: Node): /* is typescript.typescript.AsExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AsExpression */ Boolean]

inline def isAssertClause(node: Node): /* is typescript.typescript.AssertClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssertClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssertClause */ Boolean]

inline def isAssertEntry(node: Node): /* is typescript.typescript.AssertEntry */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssertEntry")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssertEntry */ Boolean]

inline def isAssertionExpression(node: Node): /* is typescript.typescript.AssertionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssertionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssertionExpression */ Boolean]

inline def isAssertionKey(node: Node): /* is typescript.typescript.AssertionKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssertionKey")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssertionKey */ Boolean]

inline def isAssertsKeyword(node: Node): /* is typescript.typescript.AssertsKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssertsKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AssertsKeyword */ Boolean]

inline def isAsteriskToken(node: Node): /* is typescript.typescript.AsteriskToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsteriskToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AsteriskToken */ Boolean]

inline def isAutoAccessorPropertyDeclaration(node: Node): /* is typescript.typescript.AutoAccessorPropertyDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAutoAccessorPropertyDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AutoAccessorPropertyDeclaration */ Boolean]

inline def isAwaitExpression(node: Node): /* is typescript.typescript.AwaitExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AwaitExpression */ Boolean]

inline def isAwaitKeyword(node: Node): /* is typescript.typescript.AwaitKeyword */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAwaitKeyword")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.AwaitKeyword */ Boolean]

inline def isBigIntLiteral(node: Node): /* is typescript.typescript.BigIntLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBigIntLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BigIntLiteral */ Boolean]

inline def isBinaryExpression(node: Node): /* is typescript.typescript.BinaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BinaryExpression */ Boolean]

inline def isBinaryOperatorToken(node: Node): /* is typescript.typescript.BinaryOperatorToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinaryOperatorToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BinaryOperatorToken */ Boolean]

inline def isBindingElement(node: Node): /* is typescript.typescript.BindingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BindingElement */ Boolean]

inline def isBindingName(node: Node): /* is typescript.typescript.BindingName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBindingName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BindingName */ Boolean]

inline def isBlock(node: Node): /* is typescript.typescript.Block */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Block */ Boolean]

inline def isBreakOrContinueStatement(node: Node): /* is typescript.typescript.BreakOrContinueStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakOrContinueStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BreakOrContinueStatement */ Boolean]

inline def isBreakStatement(node: Node): /* is typescript.typescript.BreakStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBreakStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BreakStatement */ Boolean]

inline def isBundle(node: Node): /* is typescript.typescript.Bundle */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBundle")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Bundle */ Boolean]

inline def isCallChain(node: Node): /* is typescript.typescript.CallChain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallChain")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallChain */ Boolean]

inline def isCallExpression(node: Node): /* is typescript.typescript.CallExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallExpression */ Boolean]

inline def isCallLikeExpression(node: Node): /* is typescript.typescript.CallLikeExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallLikeExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallLikeExpression */ Boolean]

inline def isCallOrNewExpression(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallOrNewExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isCallSignatureDeclaration(node: Node): /* is typescript.typescript.CallSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCallSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CallSignatureDeclaration */ Boolean]

inline def isCaseBlock(node: Node): /* is typescript.typescript.CaseBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaseBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CaseBlock */ Boolean]

inline def isCaseClause(node: Node): /* is typescript.typescript.CaseClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaseClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CaseClause */ Boolean]

inline def isCaseOrDefaultClause(node: Node): /* is typescript.typescript.CaseOrDefaultClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCaseOrDefaultClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CaseOrDefaultClause */ Boolean]

inline def isCatchClause(node: Node): /* is typescript.typescript.CatchClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCatchClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CatchClause */ Boolean]

inline def isClassDeclaration(node: Node): /* is typescript.typescript.ClassDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassDeclaration */ Boolean]

inline def isClassElement(node: Node): /* is typescript.typescript.ClassElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassElement */ Boolean]

inline def isClassExpression(node: Node): /* is typescript.typescript.ClassExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassExpression */ Boolean]

inline def isClassLike(node: Node): /* is typescript.typescript.ClassLikeDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassLikeDeclaration */ Boolean]

inline def isClassOrTypeElement(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassOrTypeElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isClassStaticBlockDeclaration(node: Node): /* is typescript.typescript.ClassStaticBlockDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassStaticBlockDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ClassStaticBlockDeclaration */ Boolean]

inline def isColonToken(node: Node): /* is typescript.typescript.ColonToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isColonToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ColonToken */ Boolean]

inline def isCommaListExpression(node: Node): /* is typescript.typescript.CommaListExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommaListExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.CommaListExpression */ Boolean]

inline def isComputedPropertyName(node: Node): /* is typescript.typescript.ComputedPropertyName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComputedPropertyName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ComputedPropertyName */ Boolean]

inline def isConciseBody(node: Node): /* is typescript.typescript.ConciseBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConciseBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConciseBody */ Boolean]

inline def isConditionalExpression(node: Node): /* is typescript.typescript.ConditionalExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConditionalExpression */ Boolean]

inline def isConditionalTypeNode(node: Node): /* is typescript.typescript.ConditionalTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConditionalTypeNode */ Boolean]

inline def isConstTypeReference(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstTypeReference")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isConstructSignatureDeclaration(node: Node): /* is typescript.typescript.ConstructSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConstructSignatureDeclaration */ Boolean]

inline def isConstructorDeclaration(node: Node): /* is typescript.typescript.ConstructorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConstructorDeclaration */ Boolean]

inline def isConstructorTypeNode(node: Node): /* is typescript.typescript.ConstructorTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ConstructorTypeNode */ Boolean]

inline def isContinueStatement(node: Node): /* is typescript.typescript.ContinueStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinueStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ContinueStatement */ Boolean]

inline def isDebuggerStatement(node: Node): /* is typescript.typescript.DebuggerStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDebuggerStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DebuggerStatement */ Boolean]

inline def isDecorator(node: Node): /* is typescript.typescript.Decorator */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecorator")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Decorator */ Boolean]

inline def isDefaultClause(node: Node): /* is typescript.typescript.DefaultClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DefaultClause */ Boolean]

inline def isDeleteExpression(node: Node): /* is typescript.typescript.DeleteExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeleteExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DeleteExpression */ Boolean]

inline def isDoStatement(node: Node): /* is typescript.typescript.DoStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDoStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DoStatement */ Boolean]

inline def isDotDotDotToken(node: Node): /* is typescript.typescript.DotDotDotToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDotDotDotToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.DotDotDotToken */ Boolean]

inline def isElementAccessChain(node: Node): /* is typescript.typescript.ElementAccessChain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementAccessChain")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ElementAccessChain */ Boolean]

inline def isElementAccessExpression(node: Node): /* is typescript.typescript.ElementAccessExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ElementAccessExpression */ Boolean]

inline def isEmptyBindingElement(node: ArrayBindingElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isEmptyBindingElement(node: BindingElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyBindingElement")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isEmptyBindingPattern(node: BindingName): /* is typescript.typescript.BindingPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyBindingPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.BindingPattern */ Boolean]

inline def isEmptyStatement(node: Node): /* is typescript.typescript.EmptyStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EmptyStatement */ Boolean]

inline def isEntityName(node: Node): /* is typescript.typescript.EntityName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EntityName */ Boolean]

inline def isEnumDeclaration(node: Node): /* is typescript.typescript.EnumDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EnumDeclaration */ Boolean]

inline def isEnumMember(node: Node): /* is typescript.typescript.EnumMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnumMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EnumMember */ Boolean]

inline def isEqualsGreaterThanToken(node: Node): /* is typescript.typescript.EqualsGreaterThanToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEqualsGreaterThanToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.EqualsGreaterThanToken */ Boolean]

inline def isExclamationToken(node: Node): /* is typescript.typescript.ExclamationToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExclamationToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExclamationToken */ Boolean]

inline def isExportAssignment(node: Node): /* is typescript.typescript.ExportAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExportAssignment */ Boolean]

inline def isExportDeclaration(node: Node): /* is typescript.typescript.ExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExportDeclaration */ Boolean]

inline def isExportSpecifier(node: Node): /* is typescript.typescript.ExportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExportSpecifier */ Boolean]

/**
  * Determines whether a node is an expression based only on its kind.
  */
inline def isExpression(node: Node): /* is typescript.typescript.Expression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Expression */ Boolean]

inline def isExpressionStatement(node: Node): /* is typescript.typescript.ExpressionStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExpressionStatement */ Boolean]

inline def isExpressionWithTypeArguments(node: Node): /* is typescript.typescript.ExpressionWithTypeArguments */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExpressionWithTypeArguments")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExpressionWithTypeArguments */ Boolean]

inline def isExternalModule(file: SourceFile): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalModule")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isExternalModuleNameRelative(moduleName: java.lang.String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalModuleNameRelative")(moduleName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isExternalModuleReference(node: Node): /* is typescript.typescript.ExternalModuleReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExternalModuleReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ExternalModuleReference */ Boolean]

inline def isForInStatement(node: Node): /* is typescript.typescript.ForInStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForInStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForInStatement */ Boolean]

inline def isForInitializer(node: Node): /* is typescript.typescript.ForInitializer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForInitializer")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForInitializer */ Boolean]

inline def isForOfStatement(node: Node): /* is typescript.typescript.ForOfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForOfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForOfStatement */ Boolean]

inline def isForStatement(node: Node): /* is typescript.typescript.ForStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ForStatement */ Boolean]

inline def isFunctionDeclaration(node: Node): /* is typescript.typescript.FunctionDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionDeclaration */ Boolean]

inline def isFunctionExpression(node: Node): /* is typescript.typescript.FunctionExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionExpression */ Boolean]

inline def isFunctionLike(): /* is typescript.typescript.SignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionLike")().asInstanceOf[/* is typescript.typescript.SignatureDeclaration */ Boolean]
inline def isFunctionLike(node: Node): /* is typescript.typescript.SignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SignatureDeclaration */ Boolean]

inline def isFunctionOrConstructorTypeNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionOrConstructorTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFunctionTypeNode(node: Node): /* is typescript.typescript.FunctionTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.FunctionTypeNode */ Boolean]

inline def isGetAccessor(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGetAccessor")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.GetAccessorDeclaration */ Boolean]

inline def isGetAccessorDeclaration(node: Node): /* is typescript.typescript.GetAccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGetAccessorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.GetAccessorDeclaration */ Boolean]

inline def isHeritageClause(node: Node): /* is typescript.typescript.HeritageClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeritageClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.HeritageClause */ Boolean]

inline def isIdentifier(node: Node): /* is typescript.typescript.Identifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Identifier */ Boolean]

inline def isIdentifierOrThisTypeNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierOrThisTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isIdentifierPart(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierPart")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isIdentifierPart(ch: Double, languageVersion: Unit, identifierVariant: LanguageVariant): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierPart")(ch.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any], identifierVariant.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isIdentifierPart(ch: Double, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierPart")(ch.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def isIdentifierPart(ch: Double, languageVersion: ScriptTarget, identifierVariant: LanguageVariant): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierPart")(ch.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any], identifierVariant.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isIdentifierStart(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isIdentifierStart(ch: Double, languageVersion: ScriptTarget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentifierStart")(ch.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isIfStatement(node: Node): /* is typescript.typescript.IfStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIfStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IfStatement */ Boolean]

inline def isImportClause(node: Node): /* is typescript.typescript.ImportClause */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportClause")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportClause */ Boolean]

inline def isImportDeclaration(node: Node): /* is typescript.typescript.ImportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportDeclaration */ Boolean]

inline def isImportEqualsDeclaration(node: Node): /* is typescript.typescript.ImportEqualsDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportEqualsDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportEqualsDeclaration */ Boolean]

inline def isImportOrExportSpecifier(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportOrExportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isImportSpecifier(node: Node): /* is typescript.typescript.ImportSpecifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportSpecifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportSpecifier */ Boolean]

inline def isImportTypeAssertionContainer(node: Node): /* is typescript.typescript.ImportTypeAssertionContainer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportTypeAssertionContainer")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportTypeAssertionContainer */ Boolean]

inline def isImportTypeNode(node: Node): /* is typescript.typescript.ImportTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImportTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ImportTypeNode */ Boolean]

inline def isIndexSignatureDeclaration(node: Node): /* is typescript.typescript.IndexSignatureDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexSignatureDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IndexSignatureDeclaration */ Boolean]

inline def isIndexedAccessTypeNode(node: Node): /* is typescript.typescript.IndexedAccessTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexedAccessTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IndexedAccessTypeNode */ Boolean]

inline def isInferTypeNode(node: Node): /* is typescript.typescript.InferTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInferTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.InferTypeNode */ Boolean]

inline def isInterfaceDeclaration(node: Node): /* is typescript.typescript.InterfaceDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterfaceDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.InterfaceDeclaration */ Boolean]

inline def isIntersectionTypeNode(node: Node): /* is typescript.typescript.IntersectionTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIntersectionTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.IntersectionTypeNode */ Boolean]

inline def isIterationStatement(node: Node, lookInLabeledStatements: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIterationStatement")(node.asInstanceOf[js.Any], lookInLabeledStatements.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def isIterationStatement_false(node: Node, lookInLabeledStatements: `false`): /* is typescript.typescript.IterationStatement */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIterationStatement")(node.asInstanceOf[js.Any], lookInLabeledStatements.asInstanceOf[js.Any])).asInstanceOf[/* is typescript.typescript.IterationStatement */ Boolean]

inline def isJSDoc(node: Node): /* is typescript.typescript.JSDoc */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDoc")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDoc */ Boolean]

inline def isJSDocAllType(node: Node): /* is typescript.typescript.JSDocAllType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocAllType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocAllType */ Boolean]

inline def isJSDocAugmentsTag(node: Node): /* is typescript.typescript.JSDocAugmentsTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocAugmentsTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocAugmentsTag */ Boolean]

inline def isJSDocAuthorTag(node: Node): /* is typescript.typescript.JSDocAuthorTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocAuthorTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocAuthorTag */ Boolean]

inline def isJSDocCallbackTag(node: Node): /* is typescript.typescript.JSDocCallbackTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocCallbackTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocCallbackTag */ Boolean]

inline def isJSDocClassTag(node: Node): /* is typescript.typescript.JSDocClassTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocClassTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocClassTag */ Boolean]

/** True if node is of a kind that may contain comment text. */
inline def isJSDocCommentContainingNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocCommentContainingNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isJSDocDeprecatedTag(node: Node): /* is typescript.typescript.JSDocDeprecatedTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocDeprecatedTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocDeprecatedTag */ Boolean]

inline def isJSDocEnumTag(node: Node): /* is typescript.typescript.JSDocEnumTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocEnumTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocEnumTag */ Boolean]

inline def isJSDocFunctionType(node: Node): /* is typescript.typescript.JSDocFunctionType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocFunctionType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocFunctionType */ Boolean]

inline def isJSDocImplementsTag(node: Node): /* is typescript.typescript.JSDocImplementsTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocImplementsTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocImplementsTag */ Boolean]

inline def isJSDocLink(node: Node): /* is typescript.typescript.JSDocLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocLink")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocLink */ Boolean]

inline def isJSDocLinkCode(node: Node): /* is typescript.typescript.JSDocLinkCode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocLinkCode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocLinkCode */ Boolean]

inline def isJSDocLinkLike(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocLinkLike")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isJSDocLinkPlain(node: Node): /* is typescript.typescript.JSDocLinkPlain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocLinkPlain")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocLinkPlain */ Boolean]

inline def isJSDocMemberName(node: Node): /* is typescript.typescript.JSDocMemberName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocMemberName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocMemberName */ Boolean]

inline def isJSDocNameReference(node: Node): /* is typescript.typescript.JSDocNameReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocNameReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocNameReference */ Boolean]

inline def isJSDocNamepathType(node: Node): /* is typescript.typescript.JSDocNamepathType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocNamepathType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocNamepathType */ Boolean]

inline def isJSDocNonNullableType(node: Node): /* is typescript.typescript.JSDocNonNullableType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocNonNullableType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocNonNullableType */ Boolean]

inline def isJSDocNullableType(node: Node): /* is typescript.typescript.JSDocNullableType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocNullableType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocNullableType */ Boolean]

inline def isJSDocOptionalType(node: Node): /* is typescript.typescript.JSDocOptionalType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocOptionalType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocOptionalType */ Boolean]

inline def isJSDocOverloadTag(node: Node): /* is typescript.typescript.JSDocOverloadTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocOverloadTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocOverloadTag */ Boolean]

inline def isJSDocOverrideTag(node: Node): /* is typescript.typescript.JSDocOverrideTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocOverrideTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocOverrideTag */ Boolean]

inline def isJSDocParameterTag(node: Node): /* is typescript.typescript.JSDocParameterTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocParameterTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocParameterTag */ Boolean]

inline def isJSDocPrivateTag(node: Node): /* is typescript.typescript.JSDocPrivateTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocPrivateTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocPrivateTag */ Boolean]

inline def isJSDocPropertyLikeTag(node: Node): /* is typescript.typescript.JSDocPropertyLikeTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocPropertyLikeTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocPropertyLikeTag */ Boolean]

inline def isJSDocPropertyTag(node: Node): /* is typescript.typescript.JSDocPropertyTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocPropertyTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocPropertyTag */ Boolean]

inline def isJSDocProtectedTag(node: Node): /* is typescript.typescript.JSDocProtectedTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocProtectedTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocProtectedTag */ Boolean]

inline def isJSDocPublicTag(node: Node): /* is typescript.typescript.JSDocPublicTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocPublicTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocPublicTag */ Boolean]

inline def isJSDocReadonlyTag(node: Node): /* is typescript.typescript.JSDocReadonlyTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocReadonlyTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocReadonlyTag */ Boolean]

inline def isJSDocReturnTag(node: Node): /* is typescript.typescript.JSDocReturnTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocReturnTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocReturnTag */ Boolean]

inline def isJSDocSatisfiesTag(node: Node): /* is typescript.typescript.JSDocSatisfiesTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocSatisfiesTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocSatisfiesTag */ Boolean]

inline def isJSDocSeeTag(node: Node): /* is typescript.typescript.JSDocSeeTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocSeeTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocSeeTag */ Boolean]

inline def isJSDocSignature(node: Node): /* is typescript.typescript.JSDocSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocSignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocSignature */ Boolean]

inline def isJSDocTemplateTag(node: Node): /* is typescript.typescript.JSDocTemplateTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocTemplateTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocTemplateTag */ Boolean]

inline def isJSDocThisTag(node: Node): /* is typescript.typescript.JSDocThisTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocThisTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocThisTag */ Boolean]

inline def isJSDocThrowsTag(node: Node): /* is typescript.typescript.JSDocThrowsTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocThrowsTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocThrowsTag */ Boolean]

inline def isJSDocTypeExpression(node: Node): /* is typescript.typescript.JSDocTypeExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocTypeExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocTypeExpression */ Boolean]

inline def isJSDocTypeLiteral(node: Node): /* is typescript.typescript.JSDocTypeLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocTypeLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocTypeLiteral */ Boolean]

inline def isJSDocTypeTag(node: Node): /* is typescript.typescript.JSDocTypeTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocTypeTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocTypeTag */ Boolean]

inline def isJSDocTypedefTag(node: Node): /* is typescript.typescript.JSDocTypedefTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocTypedefTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocTypedefTag */ Boolean]

inline def isJSDocUnknownTag(node: Node): /* is typescript.typescript.JSDocUnknownTag */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocUnknownTag")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocUnknownTag */ Boolean]

inline def isJSDocUnknownType(node: Node): /* is typescript.typescript.JSDocUnknownType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocUnknownType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocUnknownType */ Boolean]

inline def isJSDocVariadicType(node: Node): /* is typescript.typescript.JSDocVariadicType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSDocVariadicType")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JSDocVariadicType */ Boolean]

inline def isJsxAttribute(node: Node): /* is typescript.typescript.JsxAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxAttribute */ Boolean]

inline def isJsxAttributeLike(node: Node): /* is typescript.typescript.JsxAttributeLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxAttributeLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxAttributeLike */ Boolean]

inline def isJsxAttributes(node: Node): /* is typescript.typescript.JsxAttributes */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxAttributes")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxAttributes */ Boolean]

inline def isJsxChild(node: Node): /* is typescript.typescript.JsxChild */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxChild")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxChild */ Boolean]

inline def isJsxClosingElement(node: Node): /* is typescript.typescript.JsxClosingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxClosingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxClosingElement */ Boolean]

inline def isJsxClosingFragment(node: Node): /* is typescript.typescript.JsxClosingFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxClosingFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxClosingFragment */ Boolean]

inline def isJsxElement(node: Node): /* is typescript.typescript.JsxElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxElement */ Boolean]

inline def isJsxExpression(node: Node): /* is typescript.typescript.JsxExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxExpression */ Boolean]

inline def isJsxFragment(node: Node): /* is typescript.typescript.JsxFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxFragment */ Boolean]

inline def isJsxOpeningElement(node: Node): /* is typescript.typescript.JsxOpeningElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxOpeningElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxOpeningElement */ Boolean]

inline def isJsxOpeningFragment(node: Node): /* is typescript.typescript.JsxOpeningFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxOpeningFragment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxOpeningFragment */ Boolean]

inline def isJsxOpeningLikeElement(node: Node): /* is typescript.typescript.JsxOpeningLikeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxOpeningLikeElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxOpeningLikeElement */ Boolean]

inline def isJsxSelfClosingElement(node: Node): /* is typescript.typescript.JsxSelfClosingElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxSelfClosingElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxSelfClosingElement */ Boolean]

inline def isJsxSpreadAttribute(node: Node): /* is typescript.typescript.JsxSpreadAttribute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxSpreadAttribute")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxSpreadAttribute */ Boolean]

inline def isJsxTagNameExpression(node: Node): /* is typescript.typescript.JsxTagNameExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxTagNameExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxTagNameExpression */ Boolean]

inline def isJsxText(node: Node): /* is typescript.typescript.JsxText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJsxText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.JsxText */ Boolean]

inline def isLabeledStatement(node: Node): /* is typescript.typescript.LabeledStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLabeledStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LabeledStatement */ Boolean]

inline def isLeftHandSideExpression(node: Node): /* is typescript.typescript.LeftHandSideExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeftHandSideExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LeftHandSideExpression */ Boolean]

inline def isLineBreak(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineBreak")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isLiteralExpression(node: Node): /* is typescript.typescript.LiteralExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LiteralExpression */ Boolean]

inline def isLiteralTypeLiteral(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralTypeLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isLiteralTypeNode(node: Node): /* is typescript.typescript.LiteralTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteralTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.LiteralTypeNode */ Boolean]

inline def isMappedTypeNode(node: Node): /* is typescript.typescript.MappedTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMappedTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MappedTypeNode */ Boolean]

inline def isMemberName(node: Node): /* is typescript.typescript.MemberName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMemberName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MemberName */ Boolean]

inline def isMetaProperty(node: Node): /* is typescript.typescript.MetaProperty */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaProperty")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MetaProperty */ Boolean]

inline def isMethodDeclaration(node: Node): /* is typescript.typescript.MethodDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MethodDeclaration */ Boolean]

inline def isMethodSignature(node: Node): /* is typescript.typescript.MethodSignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMethodSignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MethodSignature */ Boolean]

inline def isMinusToken(node: Node): /* is typescript.typescript.MinusToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinusToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MinusToken */ Boolean]

inline def isMissingDeclaration(node: Node): /* is typescript.typescript.MissingDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMissingDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.MissingDeclaration */ Boolean]

inline def isModifier(node: Node): /* is typescript.typescript.Modifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Modifier */ Boolean]

inline def isModifierLike(node: Node): /* is typescript.typescript.ModifierLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModifierLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModifierLike */ Boolean]

inline def isModuleBlock(node: Node): /* is typescript.typescript.ModuleBlock */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleBlock")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBlock */ Boolean]

inline def isModuleBody(node: Node): /* is typescript.typescript.ModuleBody */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleBody")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleBody */ Boolean]

inline def isModuleDeclaration(node: Node): /* is typescript.typescript.ModuleDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleDeclaration */ Boolean]

inline def isModuleName(node: Node): /* is typescript.typescript.ModuleName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleName */ Boolean]

inline def isModuleReference(node: Node): /* is typescript.typescript.ModuleReference */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModuleReference")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ModuleReference */ Boolean]

inline def isNamedExportBindings(node: Node): /* is typescript.typescript.NamedExportBindings */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedExportBindings")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedExportBindings */ Boolean]

inline def isNamedExports(node: Node): /* is typescript.typescript.NamedExports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedExports")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedExports */ Boolean]

inline def isNamedImportBindings(node: Node): /* is typescript.typescript.NamedImportBindings */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedImportBindings")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedImportBindings */ Boolean]

inline def isNamedImports(node: Node): /* is typescript.typescript.NamedImports */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedImports")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedImports */ Boolean]

inline def isNamedTupleMember(node: Node): /* is typescript.typescript.NamedTupleMember */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedTupleMember")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamedTupleMember */ Boolean]

inline def isNamespaceExport(node: Node): /* is typescript.typescript.NamespaceExport */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespaceExport")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamespaceExport */ Boolean]

inline def isNamespaceExportDeclaration(node: Node): /* is typescript.typescript.NamespaceExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespaceExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamespaceExportDeclaration */ Boolean]

inline def isNamespaceImport(node: Node): /* is typescript.typescript.NamespaceImport */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespaceImport")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NamespaceImport */ Boolean]

inline def isNewExpression(node: Node): /* is typescript.typescript.NewExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NewExpression */ Boolean]

inline def isNoSubstitutionTemplateLiteral(node: Node): /* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoSubstitutionTemplateLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NoSubstitutionTemplateLiteral */ Boolean]

inline def isNonNullChain(node: Node): /* is typescript.typescript.NonNullChain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullChain")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NonNullChain */ Boolean]

inline def isNonNullExpression(node: Node): /* is typescript.typescript.NonNullExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonNullExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NonNullExpression */ Boolean]

inline def isNotEmittedStatement(node: Node): /* is typescript.typescript.NotEmittedStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmittedStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NotEmittedStatement */ Boolean]

inline def isNullishCoalesce(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNullishCoalesce")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNumericLiteral(node: Node): /* is typescript.typescript.NumericLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.NumericLiteral */ Boolean]

inline def isObjectBindingPattern(node: Node): /* is typescript.typescript.ObjectBindingPattern */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectBindingPattern")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectBindingPattern */ Boolean]

inline def isObjectLiteralElement(node: Node): /* is typescript.typescript.ObjectLiteralElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLiteralElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectLiteralElement */ Boolean]

inline def isObjectLiteralElementLike(node: Node): /* is typescript.typescript.ObjectLiteralElementLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLiteralElementLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectLiteralElementLike */ Boolean]

inline def isObjectLiteralExpression(node: Node): /* is typescript.typescript.ObjectLiteralExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectLiteralExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ObjectLiteralExpression */ Boolean]

inline def isOmittedExpression(node: Node): /* is typescript.typescript.OmittedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOmittedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.OmittedExpression */ Boolean]

inline def isOptionalChain(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalChain")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isOptionalTypeNode(node: Node): /* is typescript.typescript.OptionalTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionalTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.OptionalTypeNode */ Boolean]

inline def isParameter(node: Node): /* is typescript.typescript.ParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParameter")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ParameterDeclaration */ Boolean]

inline def isParameterPropertyDeclaration(node: Node, parent: Node): /* is typescript.typescript.ParameterPropertyDeclaration */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isParameterPropertyDeclaration")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[/* is typescript.typescript.ParameterPropertyDeclaration */ Boolean]

inline def isParenthesizedExpression(node: Node): /* is typescript.typescript.ParenthesizedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ParenthesizedExpression */ Boolean]

inline def isParenthesizedTypeNode(node: Node): /* is typescript.typescript.ParenthesizedTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParenthesizedTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ParenthesizedTypeNode */ Boolean]

/**
  * Gets a value indicating whether a node originated in the parse tree.
  *
  * @param node The node to test.
  */
inline def isParseTreeNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParseTreeNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPartiallyEmittedExpression(node: Node): /* is typescript.typescript.PartiallyEmittedExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPartiallyEmittedExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PartiallyEmittedExpression */ Boolean]

inline def isPlusToken(node: Node): /* is typescript.typescript.PlusToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlusToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PlusToken */ Boolean]

inline def isPostfixUnaryExpression(node: Node): /* is typescript.typescript.PostfixUnaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPostfixUnaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PostfixUnaryExpression */ Boolean]

inline def isPrefixUnaryExpression(node: Node): /* is typescript.typescript.PrefixUnaryExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrefixUnaryExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PrefixUnaryExpression */ Boolean]

inline def isPrivateIdentifier(node: Node): /* is typescript.typescript.PrivateIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateIdentifier")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PrivateIdentifier */ Boolean]

inline def isPropertyAccessChain(node: Node): /* is typescript.typescript.PropertyAccessChain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyAccessChain")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyAccessChain */ Boolean]

inline def isPropertyAccessExpression(node: Node): /* is typescript.typescript.PropertyAccessExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyAccessExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyAccessExpression */ Boolean]

inline def isPropertyAccessOrQualifiedName(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyAccessOrQualifiedName")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isPropertyAssignment(node: Node): /* is typescript.typescript.PropertyAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyAssignment */ Boolean]

inline def isPropertyDeclaration(node: Node): /* is typescript.typescript.PropertyDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyDeclaration */ Boolean]

inline def isPropertyName(node: Node): /* is typescript.typescript.PropertyName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertyName */ Boolean]

inline def isPropertySignature(node: Node): /* is typescript.typescript.PropertySignature */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertySignature")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.PropertySignature */ Boolean]

inline def isQualifiedName(node: Node): /* is typescript.typescript.QualifiedName */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQualifiedName")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.QualifiedName */ Boolean]

inline def isQuestionDotToken(node: Node): /* is typescript.typescript.QuestionDotToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuestionDotToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.QuestionDotToken */ Boolean]

inline def isQuestionOrExclamationToken(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuestionOrExclamationToken")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isQuestionOrPlusOrMinusToken(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuestionOrPlusOrMinusToken")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isQuestionToken(node: Node): /* is typescript.typescript.QuestionToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuestionToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.QuestionToken */ Boolean]

inline def isReadonlyKeywordOrPlusOrMinusToken(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonlyKeywordOrPlusOrMinusToken")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRegularExpressionLiteral(node: Node): /* is typescript.typescript.RegularExpressionLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegularExpressionLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.RegularExpressionLiteral */ Boolean]

inline def isRestParameter(node: JSDocParameterTag): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestParameter")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isRestParameter(node: ParameterDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestParameter")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRestTypeNode(node: Node): /* is typescript.typescript.RestTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRestTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.RestTypeNode */ Boolean]

inline def isReturnStatement(node: Node): /* is typescript.typescript.ReturnStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReturnStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ReturnStatement */ Boolean]

inline def isSatisfiesExpression(node: Node): /* is typescript.typescript.SatisfiesExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSatisfiesExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SatisfiesExpression */ Boolean]

inline def isSemicolonClassElement(node: Node): /* is typescript.typescript.SemicolonClassElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemicolonClassElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SemicolonClassElement */ Boolean]

inline def isSetAccessor(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetAccessor")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SetAccessorDeclaration */ Boolean]

inline def isSetAccessorDeclaration(node: Node): /* is typescript.typescript.SetAccessorDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSetAccessorDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SetAccessorDeclaration */ Boolean]

inline def isShorthandPropertyAssignment(node: Node): /* is typescript.typescript.ShorthandPropertyAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShorthandPropertyAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ShorthandPropertyAssignment */ Boolean]

inline def isSourceFile(node: Node): /* is typescript.typescript.SourceFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSourceFile")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SourceFile */ Boolean]

inline def isSpreadAssignment(node: Node): /* is typescript.typescript.SpreadAssignment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadAssignment")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SpreadAssignment */ Boolean]

inline def isSpreadElement(node: Node): /* is typescript.typescript.SpreadElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpreadElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SpreadElement */ Boolean]

inline def isStatement(node: Node): /* is typescript.typescript.Statement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.Statement */ Boolean]

inline def isStringLiteral(node: Node): /* is typescript.typescript.StringLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.StringLiteral */ Boolean]

inline def isStringLiteralLike(node: FileReference): /* is typescript.typescript.StringLiteralLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.StringLiteralLike */ Boolean]
inline def isStringLiteralLike(node: Node): /* is typescript.typescript.StringLiteralLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.StringLiteralLike */ Boolean]

inline def isStringLiteralOrJsxExpression(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringLiteralOrJsxExpression")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isStringTextContainingNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringTextContainingNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isSwitchStatement(node: Node): /* is typescript.typescript.SwitchStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSwitchStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SwitchStatement */ Boolean]

inline def isSyntheticExpression(node: Node): /* is typescript.typescript.SyntheticExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyntheticExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.SyntheticExpression */ Boolean]

inline def isTaggedTemplateExpression(node: Node): /* is typescript.typescript.TaggedTemplateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTaggedTemplateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TaggedTemplateExpression */ Boolean]

inline def isTemplateExpression(node: Node): /* is typescript.typescript.TemplateExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateExpression */ Boolean]

inline def isTemplateHead(node: Node): /* is typescript.typescript.TemplateHead */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateHead")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateHead */ Boolean]

inline def isTemplateLiteral(node: Node): /* is typescript.typescript.TemplateLiteral */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateLiteral */ Boolean]

inline def isTemplateLiteralToken(node: Node): /* is typescript.typescript.TemplateLiteralToken */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteralToken")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateLiteralToken */ Boolean]

inline def isTemplateLiteralTypeNode(node: Node): /* is typescript.typescript.TemplateLiteralTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteralTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateLiteralTypeNode */ Boolean]

inline def isTemplateLiteralTypeSpan(node: Node): /* is typescript.typescript.TemplateLiteralTypeSpan */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateLiteralTypeSpan")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateLiteralTypeSpan */ Boolean]

inline def isTemplateMiddle(node: Node): /* is typescript.typescript.TemplateMiddle */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateMiddle")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateMiddle */ Boolean]

inline def isTemplateMiddleOrTemplateTail(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateMiddleOrTemplateTail")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTemplateSpan(node: Node): /* is typescript.typescript.TemplateSpan */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateSpan")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateSpan */ Boolean]

inline def isTemplateTail(node: Node): /* is typescript.typescript.TemplateTail */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateTail")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TemplateTail */ Boolean]

inline def isThisTypeNode(node: Node): /* is typescript.typescript.ThisTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThisTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ThisTypeNode */ Boolean]

inline def isThrowStatement(node: Node): /* is typescript.typescript.ThrowStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThrowStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.ThrowStatement */ Boolean]

/**
  * True if node is of some token syntax kind.
  * For example, this is true for an IfKeyword but not for an IfStatement.
  * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
  */
inline def isToken(n: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToken")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * True if kind is of some token syntax kind.
  * For example, this is true for an IfKeyword but not for an IfStatement.
  * Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
  */
inline def isTokenKind(kind: SyntaxKind): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenKind")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTryStatement(node: Node): /* is typescript.typescript.TryStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTryStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TryStatement */ Boolean]

inline def isTupleTypeNode(node: Node): /* is typescript.typescript.TupleTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTupleTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TupleTypeNode */ Boolean]

inline def isTypeAliasDeclaration(node: Node): /* is typescript.typescript.TypeAliasDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAliasDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeAliasDeclaration */ Boolean]

inline def isTypeAssertionExpression(node: Node): /* is typescript.typescript.TypeAssertion */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeAssertionExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeAssertion */ Boolean]

inline def isTypeElement(node: Node): /* is typescript.typescript.TypeElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeElement */ Boolean]

inline def isTypeLiteralNode(node: Node): /* is typescript.typescript.TypeLiteralNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeLiteralNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeLiteralNode */ Boolean]

/**
  * Node test that determines whether a node is a valid type node.
  * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
  * of a TypeNode.
  */
inline def isTypeNode(node: Node): /* is typescript.typescript.TypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeNode */ Boolean]

inline def isTypeOfExpression(node: Node): /* is typescript.typescript.TypeOfExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOfExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOfExpression */ Boolean]

inline def isTypeOnlyExportDeclaration(node: Node): /* is typescript.typescript.TypeOnlyExportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOnlyExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOnlyExportDeclaration */ Boolean]

inline def isTypeOnlyImportDeclaration(node: Node): /* is typescript.typescript.TypeOnlyImportDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOnlyImportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOnlyImportDeclaration */ Boolean]

inline def isTypeOnlyImportOrExportDeclaration(node: Node): /* is typescript.typescript.TypeOnlyAliasDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOnlyImportOrExportDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOnlyAliasDeclaration */ Boolean]

inline def isTypeOperatorNode(node: Node): /* is typescript.typescript.TypeOperatorNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeOperatorNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeOperatorNode */ Boolean]

inline def isTypeParameterDeclaration(node: Node): /* is typescript.typescript.TypeParameterDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeParameterDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeParameterDeclaration */ Boolean]

inline def isTypePredicateNode(node: Node): /* is typescript.typescript.TypePredicateNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypePredicateNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypePredicateNode */ Boolean]

inline def isTypeQueryNode(node: Node): /* is typescript.typescript.TypeQueryNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeQueryNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeQueryNode */ Boolean]

inline def isTypeReferenceNode(node: Node): /* is typescript.typescript.TypeReferenceNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeReferenceNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.TypeReferenceNode */ Boolean]

inline def isUnionTypeNode(node: Node): /* is typescript.typescript.UnionTypeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionTypeNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnionTypeNode */ Boolean]

/** @deprecated */
inline def isUnparsedNode(node: Node): /* is typescript.typescript.UnparsedNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnparsedNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnparsedNode */ Boolean]

/** @deprecated */
inline def isUnparsedPrepend(node: Node): /* is typescript.typescript.UnparsedPrepend */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnparsedPrepend")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnparsedPrepend */ Boolean]

/** @deprecated */
inline def isUnparsedSource(node: Node): /* is typescript.typescript.UnparsedSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnparsedSource")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnparsedSource */ Boolean]

/** @deprecated */
inline def isUnparsedTextLike(node: Node): /* is typescript.typescript.UnparsedTextLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnparsedTextLike")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.UnparsedTextLike */ Boolean]

inline def isVariableDeclaration(node: Node): /* is typescript.typescript.VariableDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VariableDeclaration */ Boolean]

inline def isVariableDeclarationList(node: Node): /* is typescript.typescript.VariableDeclarationList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableDeclarationList")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VariableDeclarationList */ Boolean]

inline def isVariableStatement(node: Node): /* is typescript.typescript.VariableStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VariableStatement */ Boolean]

inline def isVoidExpression(node: Node): /* is typescript.typescript.VoidExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVoidExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.VoidExpression */ Boolean]

inline def isWhileStatement(node: Node): /* is typescript.typescript.WhileStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhileStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.WhileStatement */ Boolean]

inline def isWhiteSpaceLike(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpaceLike")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/** Does not include line breaks. For that, see isWhiteSpaceLike. */
inline def isWhiteSpaceSingleLine(ch: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWhiteSpaceSingleLine")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isWithStatement(node: Node): /* is typescript.typescript.WithStatement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWithStatement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.WithStatement */ Boolean]

inline def isYieldExpression(node: Node): /* is typescript.typescript.YieldExpression */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isYieldExpression")(node.asInstanceOf[js.Any]).asInstanceOf[/* is typescript.typescript.YieldExpression */ Boolean]

/**
  * Moves matching emit helpers from a source node to a target node.
  */
inline def moveEmitHelpers(source: Node, target: Node, predicate: js.Function1[/* helper */ EmitHelper, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("moveEmitHelpers")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def moveSyntheticComments[T /* <: Node */](node: T, original: Node): T = (^.asInstanceOf[js.Dynamic].applyDynamic("moveSyntheticComments")(node.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[T]

inline def nodeModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def nodeModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: Unit,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def nodeModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def nodeModuleNameResolver(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeModuleNameResolver")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]

inline def parseCommandLine(commandLine: js.Array[java.lang.String]): ParsedCommandLine = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCommandLine")(commandLine.asInstanceOf[js.Any]).asInstanceOf[ParsedCommandLine]
inline def parseCommandLine(
  commandLine: js.Array[java.lang.String],
  readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCommandLine")(commandLine.asInstanceOf[js.Any], readFile.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]

/**
  * Parse the text of the tsconfig.json file
  * @param fileName The path to the config file
  * @param jsonText The text of the config file
  */
inline def parseConfigFileTextToJson(fileName: java.lang.String, jsonText: java.lang.String): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFileTextToJson")(fileName.asInstanceOf[js.Any], jsonText.asInstanceOf[js.Any])).asInstanceOf[Config]

inline def parseIsolatedEntityName(text: java.lang.String, languageVersion: ScriptTarget): js.UndefOr[EntityName] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseIsolatedEntityName")(text.asInstanceOf[js.Any], languageVersion.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EntityName]]

/**
  * Parse the contents of a config file (tsconfig.json).
  * @param json The contents of the config file to parse
  * @param host Instance of ParseConfigHost used to enumerate files in folder.
  * @param basePath A root directory to resolve relative path entries in the config
  *    file to. e.g. outDir
  */
inline def parseJsonConfigFileContent(
  json: Any,
  host: ParseConfigHost,
  basePath: java.lang.String,
  existingOptions: js.UndefOr[CompilerOptions],
  configFileName: js.UndefOr[java.lang.String],
  resolutionStack: js.UndefOr[js.Array[Path]],
  extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
  extendedConfigCache: js.UndefOr[Map[java.lang.String, ExtendedConfigCacheEntry]],
  existingWatchOptions: js.UndefOr[WatchOptions]
): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonConfigFileContent")(json.asInstanceOf[js.Any], host.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], configFileName.asInstanceOf[js.Any], resolutionStack.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], existingWatchOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]

/**
  * Parse the contents of a config file (tsconfig.json).
  * @param jsonNode The contents of the config file to parse
  * @param host Instance of ParseConfigHost used to enumerate files in folder.
  * @param basePath A root directory to resolve relative path entries in the config
  *    file to. e.g. outDir
  */
inline def parseJsonSourceFileConfigFileContent(
  sourceFile: TsConfigSourceFile,
  host: ParseConfigHost,
  basePath: java.lang.String,
  existingOptions: js.UndefOr[CompilerOptions],
  configFileName: js.UndefOr[java.lang.String],
  resolutionStack: js.UndefOr[js.Array[Path]],
  extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]],
  extendedConfigCache: js.UndefOr[Map[java.lang.String, ExtendedConfigCacheEntry]],
  existingWatchOptions: js.UndefOr[WatchOptions]
): ParsedCommandLine = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonSourceFileConfigFileContent")(sourceFile.asInstanceOf[js.Any], host.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any], existingOptions.asInstanceOf[js.Any], configFileName.asInstanceOf[js.Any], resolutionStack.asInstanceOf[js.Any], extraFileExtensions.asInstanceOf[js.Any], extendedConfigCache.asInstanceOf[js.Any], existingWatchOptions.asInstanceOf[js.Any])).asInstanceOf[ParsedCommandLine]

/**
  * Parse json text into SyntaxTree and return node and parse errors if any
  * @param fileName
  * @param sourceText
  */
inline def parseJsonText(fileName: java.lang.String, sourceText: java.lang.String): JsonSourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonText")(fileName.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any])).asInstanceOf[JsonSourceFile]

inline def preProcessFile(sourceText: java.lang.String): PreProcessedFileInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("preProcessFile")(sourceText.asInstanceOf[js.Any]).asInstanceOf[PreProcessedFileInfo]
inline def preProcessFile(sourceText: java.lang.String, readImportFiles: Boolean): PreProcessedFileInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessFile")(sourceText.asInstanceOf[js.Any], readImportFiles.asInstanceOf[js.Any])).asInstanceOf[PreProcessedFileInfo]
inline def preProcessFile(sourceText: java.lang.String, readImportFiles: Boolean, detectJavaScriptImports: Boolean): PreProcessedFileInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessFile")(sourceText.asInstanceOf[js.Any], readImportFiles.asInstanceOf[js.Any], detectJavaScriptImports.asInstanceOf[js.Any])).asInstanceOf[PreProcessedFileInfo]
inline def preProcessFile(sourceText: java.lang.String, readImportFiles: Unit, detectJavaScriptImports: Boolean): PreProcessedFileInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("preProcessFile")(sourceText.asInstanceOf[js.Any], readImportFiles.asInstanceOf[js.Any], detectJavaScriptImports.asInstanceOf[js.Any])).asInstanceOf[PreProcessedFileInfo]

inline def readBuilderProgram(compilerOptions: CompilerOptions, host: ReadBuildProgramHost): js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = (^.asInstanceOf[js.Dynamic].applyDynamic("readBuilderProgram")(compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram]]

/**
  * Read tsconfig.json file
  * @param fileName The path to the config file
  */
inline def readConfigFile(
  fileName: java.lang.String,
  readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("readConfigFile")(fileName.asInstanceOf[js.Any], readFile.asInstanceOf[js.Any])).asInstanceOf[Config]

/**
  * Read tsconfig.json file
  * @param fileName The path to the config file
  */
inline def readJsonConfigFile(
  fileName: java.lang.String,
  readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]
): TsConfigSourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonConfigFile")(fileName.asInstanceOf[js.Any], readFile.asInstanceOf[js.Any])).asInstanceOf[TsConfigSourceFile]

inline def reduceEachLeadingCommentRange[T, U](
  text: java.lang.String,
  pos: Double,
  cb: js.Function5[
  /* pos */ Double, 
  /* end */ Double, 
  /* kind */ CommentKind, 
  /* hasTrailingNewLine */ Boolean, 
  /* state */ T, 
  U
],
  state: T,
  initial: U
): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceEachLeadingCommentRange")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], state.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]

inline def reduceEachTrailingCommentRange[T, U](
  text: java.lang.String,
  pos: Double,
  cb: js.Function5[
  /* pos */ Double, 
  /* end */ Double, 
  /* kind */ CommentKind, 
  /* hasTrailingNewLine */ Boolean, 
  /* state */ T, 
  U
],
  state: T,
  initial: U
): js.UndefOr[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceEachTrailingCommentRange")(text.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], cb.asInstanceOf[js.Any], state.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[U]]

/**
  * Removes an EmitHelper from a node.
  */
inline def removeEmitHelper(node: Node, helper: EmitHelper): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmitHelper")(node.asInstanceOf[js.Any], helper.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: Unit,
  redirectedReference: Unit,
  resolutionMode: ResolutionMode
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: Unit,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: Unit,
  redirectedReference: ResolvedProjectReference,
  resolutionMode: ResolutionMode
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache,
  redirectedReference: Unit,
  resolutionMode: ResolutionMode
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache,
  redirectedReference: ResolvedProjectReference
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]
inline def resolveModuleName(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  compilerOptions: CompilerOptions,
  host: ModuleResolutionHost,
  cache: ModuleResolutionCache,
  redirectedReference: ResolvedProjectReference,
  resolutionMode: ResolutionMode
): ResolvedModuleWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleName")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], host.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedModuleWithFailedLookupLocations]

inline def resolveModuleNameFromCache(moduleName: java.lang.String, containingFile: java.lang.String, cache: ModuleResolutionCache): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleNameFromCache")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResolvedModuleWithFailedLookupLocations]]
inline def resolveModuleNameFromCache(
  moduleName: java.lang.String,
  containingFile: java.lang.String,
  cache: ModuleResolutionCache,
  mode: ResolutionMode
): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveModuleNameFromCache")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResolvedModuleWithFailedLookupLocations]]

/**
  * Returns the target config filename of a project reference.
  * Note: The file might not exist.
  */
inline def resolveProjectReferencePath(ref: ProjectReference): ResolvedConfigFileName = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveProjectReferencePath")(ref.asInstanceOf[js.Any]).asInstanceOf[ResolvedConfigFileName]

inline def resolveTripleslashReference(moduleName: java.lang.String, containingFile: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTripleslashReference")(moduleName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

/**
  * @param {string | undefined} containingFile - file that contains type reference directive, can be undefined if containing file is unknown.
  * This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
  * is assumed to be the same as root directory of the project.
  */
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: Unit,
  cache: Unit,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: Unit,
  cache: TypeReferenceDirectiveResolutionCache
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: Unit,
  cache: TypeReferenceDirectiveResolutionCache,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference,
  cache: Unit,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference,
  cache: TypeReferenceDirectiveResolutionCache
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: java.lang.String,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference,
  cache: TypeReferenceDirectiveResolutionCache,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: Unit,
  cache: Unit,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: Unit,
  cache: TypeReferenceDirectiveResolutionCache
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: Unit,
  cache: TypeReferenceDirectiveResolutionCache,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference,
  cache: Unit,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference,
  cache: TypeReferenceDirectiveResolutionCache
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]
inline def resolveTypeReferenceDirective(
  typeReferenceDirectiveName: java.lang.String,
  containingFile: Unit,
  options: CompilerOptions,
  host: ModuleResolutionHost,
  redirectedReference: ResolvedProjectReference,
  cache: TypeReferenceDirectiveResolutionCache,
  resolutionMode: ResolutionMode
): ResolvedTypeReferenceDirectiveWithFailedLookupLocations = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTypeReferenceDirective")(typeReferenceDirectiveName.asInstanceOf[js.Any], containingFile.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], redirectedReference.asInstanceOf[js.Any], cache.asInstanceOf[js.Any], resolutionMode.asInstanceOf[js.Any])).asInstanceOf[ResolvedTypeReferenceDirectiveWithFailedLookupLocations]

/** The version of the language service API */
inline def servicesVersion: /* "0.8" */ java.lang.String = ^.asInstanceOf[js.Dynamic].selectDynamic("servicesVersion").asInstanceOf[/* "0.8" */ java.lang.String]

/**
  * Sets a custom text range to use when emitting comments.
  */
inline def setCommentRange[T /* <: Node */](node: T, range: TextRange): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setCommentRange")(node.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Sets the constant value to emit for an expression.
  */
inline def setConstantValue(node: AccessExpression, value: java.lang.String): AccessExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("setConstantValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AccessExpression]
inline def setConstantValue(node: AccessExpression, value: Double): AccessExpression = (^.asInstanceOf[js.Dynamic].applyDynamic("setConstantValue")(node.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[AccessExpression]

/**
  * Sets flags that control emit behavior of a node.
  */
inline def setEmitFlags[T /* <: Node */](node: T, emitFlags: EmitFlags): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setEmitFlags")(node.asInstanceOf[js.Any], emitFlags.asInstanceOf[js.Any])).asInstanceOf[T]

inline def setOriginalNode[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setOriginalNode")(node.asInstanceOf[js.Any]).asInstanceOf[T]
inline def setOriginalNode[T /* <: Node */](node: T, original: Node): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setOriginalNode")(node.asInstanceOf[js.Any], original.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Sets a custom text range to use when emitting source maps.
  */
inline def setSourceMapRange[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setSourceMapRange")(node.asInstanceOf[js.Any]).asInstanceOf[T]
inline def setSourceMapRange[T /* <: Node */](node: T, range: SourceMapRange): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setSourceMapRange")(node.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T]

inline def setSyntheticLeadingComments[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setSyntheticLeadingComments")(node.asInstanceOf[js.Any]).asInstanceOf[T]
inline def setSyntheticLeadingComments[T /* <: Node */](node: T, comments: js.Array[SynthesizedComment]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setSyntheticLeadingComments")(node.asInstanceOf[js.Any], comments.asInstanceOf[js.Any])).asInstanceOf[T]

inline def setSyntheticTrailingComments[T /* <: Node */](node: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setSyntheticTrailingComments")(node.asInstanceOf[js.Any]).asInstanceOf[T]
inline def setSyntheticTrailingComments[T /* <: Node */](node: T, comments: js.Array[SynthesizedComment]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setSyntheticTrailingComments")(node.asInstanceOf[js.Any], comments.asInstanceOf[js.Any])).asInstanceOf[T]

inline def setTextRange[T /* <: TextRange */](range: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("setTextRange")(range.asInstanceOf[js.Any]).asInstanceOf[T]
inline def setTextRange[T /* <: TextRange */](range: T, location: TextRange): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setTextRange")(range.asInstanceOf[js.Any], location.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Sets the TextRange to use for source maps for a token of a node.
  */
inline def setTokenSourceMapRange[T /* <: Node */](node: T, token: SyntaxKind): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokenSourceMapRange")(node.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[T]
inline def setTokenSourceMapRange[T /* <: Node */](node: T, token: SyntaxKind, range: SourceMapRange): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setTokenSourceMapRange")(node.asInstanceOf[js.Any], token.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T]

inline def skipPartiallyEmittedExpressions(node: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("skipPartiallyEmittedExpressions")(node.asInstanceOf[js.Any]).asInstanceOf[Expression]
inline def skipPartiallyEmittedExpressions(node: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("skipPartiallyEmittedExpressions")(node.asInstanceOf[js.Any]).asInstanceOf[Node]

inline def sortAndDeduplicateDiagnostics[T /* <: Diagnostic */](diagnostics: js.Array[T]): SortedReadonlyArray[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortAndDeduplicateDiagnostics")(diagnostics.asInstanceOf[js.Any]).asInstanceOf[SortedReadonlyArray[T]]

inline def symbolName(symbol: Symbol): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("symbolName")(symbol.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def sys: System = ^.asInstanceOf[js.Dynamic].selectDynamic("sys").asInstanceOf[System]
inline def sys_=(x: System): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sys")(x.asInstanceOf[js.Any])

inline def textChangeRangeIsUnchanged(range: TextChangeRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("textChangeRangeIsUnchanged")(range.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def textChangeRangeNewSpan(range: TextChangeRange): TextSpan = ^.asInstanceOf[js.Dynamic].applyDynamic("textChangeRangeNewSpan")(range.asInstanceOf[js.Any]).asInstanceOf[TextSpan]

inline def textSpanContainsPosition(span: TextSpan, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanContainsPosition")(span.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def textSpanContainsTextSpan(span: TextSpan, other: TextSpan): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanContainsTextSpan")(span.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def textSpanEnd(span: TextSpan): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("textSpanEnd")(span.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def textSpanIntersection(span1: TextSpan, span2: TextSpan): js.UndefOr[TextSpan] = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanIntersection")(span1.asInstanceOf[js.Any], span2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextSpan]]

inline def textSpanIntersectsWith(span: TextSpan, start: Double, length: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanIntersectsWith")(span.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def textSpanIntersectsWithPosition(span: TextSpan, position: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanIntersectsWithPosition")(span.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def textSpanIntersectsWithTextSpan(span: TextSpan, other: TextSpan): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanIntersectsWithTextSpan")(span.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def textSpanIsEmpty(span: TextSpan): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("textSpanIsEmpty")(span.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def textSpanOverlap(span1: TextSpan, span2: TextSpan): js.UndefOr[TextSpan] = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanOverlap")(span1.asInstanceOf[js.Any], span2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextSpan]]

inline def textSpanOverlapsWith(span: TextSpan, other: TextSpan): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textSpanOverlapsWith")(span.asInstanceOf[js.Any], other.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def toEditorSettings(options: EditorOptions): EditorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("toEditorSettings")(options.asInstanceOf[js.Any]).asInstanceOf[EditorSettings]
inline def toEditorSettings(options: EditorSettings): EditorSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("toEditorSettings")(options.asInstanceOf[js.Any]).asInstanceOf[EditorSettings]

inline def tokenToString(t: SyntaxKind): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenToString")(t.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]

/**
  * Transform one or more nodes using the supplied transformers.
  * @param source A single `Node` or an array of `Node` objects.
  * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
  * @param compilerOptions Optional compiler options.
  */
inline def transform[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], transformers.asInstanceOf[js.Any])).asInstanceOf[TransformationResult[T]]
inline def transform[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]], compilerOptions: CompilerOptions): TransformationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], transformers.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[TransformationResult[T]]
inline def transform[T /* <: Node */](source: js.Array[T], transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], transformers.asInstanceOf[js.Any])).asInstanceOf[TransformationResult[T]]
inline def transform[T /* <: Node */](
  source: js.Array[T],
  transformers: js.Array[TransformerFactory[T]],
  compilerOptions: CompilerOptions
): TransformationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], transformers.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[TransformationResult[T]]

inline def transpile(input: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
inline def transpile(input: java.lang.String, compilerOptions: Unit, fileName: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: Unit,
  fileName: java.lang.String,
  diagnostics: js.Array[Diagnostic]
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: Unit,
  fileName: java.lang.String,
  diagnostics: js.Array[Diagnostic],
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: Unit,
  fileName: java.lang.String,
  diagnostics: Unit,
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(input: java.lang.String, compilerOptions: Unit, fileName: Unit, diagnostics: js.Array[Diagnostic]): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: Unit,
  fileName: Unit,
  diagnostics: js.Array[Diagnostic],
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: Unit,
  fileName: Unit,
  diagnostics: Unit,
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(input: java.lang.String, compilerOptions: CompilerOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(input: java.lang.String, compilerOptions: CompilerOptions, fileName: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: CompilerOptions,
  fileName: java.lang.String,
  diagnostics: js.Array[Diagnostic]
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: CompilerOptions,
  fileName: java.lang.String,
  diagnostics: js.Array[Diagnostic],
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: CompilerOptions,
  fileName: java.lang.String,
  diagnostics: Unit,
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: CompilerOptions,
  fileName: Unit,
  diagnostics: js.Array[Diagnostic]
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: CompilerOptions,
  fileName: Unit,
  diagnostics: js.Array[Diagnostic],
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def transpile(
  input: java.lang.String,
  compilerOptions: CompilerOptions,
  fileName: Unit,
  diagnostics: Unit,
  moduleName: java.lang.String
): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("transpile")(input.asInstanceOf[js.Any], compilerOptions.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], diagnostics.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def transpileModule(input: java.lang.String, transpileOptions: TranspileOptions): TranspileOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("transpileModule")(input.asInstanceOf[js.Any], transpileOptions.asInstanceOf[js.Any])).asInstanceOf[TranspileOutput]

inline def unchangedTextChangeRange: TextChangeRange = ^.asInstanceOf[js.Dynamic].selectDynamic("unchangedTextChangeRange").asInstanceOf[TextChangeRange]
inline def unchangedTextChangeRange_=(x: TextChangeRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unchangedTextChangeRange")(x.asInstanceOf[js.Any])

/**
  * Remove extra underscore from escaped identifier text content.
  *
  * @param identifier The escaped identifier text.
  * @returns The unescaped identifier text.
  */
inline def unescapeLeadingUnderscores(identifier: String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeLeadingUnderscores")(identifier.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def updateLanguageServiceSourceFile(sourceFile: SourceFile, scriptSnapshot: IScriptSnapshot, version: java.lang.String): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLanguageServiceSourceFile")(sourceFile.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def updateLanguageServiceSourceFile(
  sourceFile: SourceFile,
  scriptSnapshot: IScriptSnapshot,
  version: java.lang.String,
  textChangeRange: Unit,
  aggressiveChecks: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLanguageServiceSourceFile")(sourceFile.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], version.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any], aggressiveChecks.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def updateLanguageServiceSourceFile(
  sourceFile: SourceFile,
  scriptSnapshot: IScriptSnapshot,
  version: java.lang.String,
  textChangeRange: TextChangeRange
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLanguageServiceSourceFile")(sourceFile.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], version.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def updateLanguageServiceSourceFile(
  sourceFile: SourceFile,
  scriptSnapshot: IScriptSnapshot,
  version: java.lang.String,
  textChangeRange: TextChangeRange,
  aggressiveChecks: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLanguageServiceSourceFile")(sourceFile.asInstanceOf[js.Any], scriptSnapshot.asInstanceOf[js.Any], version.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any], aggressiveChecks.asInstanceOf[js.Any])).asInstanceOf[SourceFile]

inline def updateSourceFile(sourceFile: SourceFile, newText: java.lang.String, textChangeRange: TextChangeRange): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSourceFile")(sourceFile.asInstanceOf[js.Any], newText.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any])).asInstanceOf[SourceFile]
inline def updateSourceFile(
  sourceFile: SourceFile,
  newText: java.lang.String,
  textChangeRange: TextChangeRange,
  aggressiveChecks: Boolean
): SourceFile = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSourceFile")(sourceFile.asInstanceOf[js.Any], newText.asInstanceOf[js.Any], textChangeRange.asInstanceOf[js.Any], aggressiveChecks.asInstanceOf[js.Any])).asInstanceOf[SourceFile]

/**
  * Checks to see if the locale is in the appropriate format,
  * and if it is, attempts to set the appropriate language.
  */
inline def validateLocaleAndSetLanguage(locale: java.lang.String, sys: FileExists): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateLocaleAndSetLanguage")(locale.asInstanceOf[js.Any], sys.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def validateLocaleAndSetLanguage(locale: java.lang.String, sys: FileExists, errors: js.Array[Diagnostic]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateLocaleAndSetLanguage")(locale.asInstanceOf[js.Any], sys.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** The version of the TypeScript compiler release */
inline def version: java.lang.String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

inline def versionMajorMinor: /* "5.0" */ java.lang.String = ^.asInstanceOf[js.Dynamic].selectDynamic("versionMajorMinor").asInstanceOf[/* "5.0" */ java.lang.String]

/**
  * Visits the elements of a {@link CommaListExpression}.
  * @param visitor The visitor to use when visiting expressions whose result will not be discarded at runtime.
  * @param discardVisitor The visitor to use when visiting expressions whose result will be discarded at runtime. Defaults to {@link visitor}.
  */
inline def visitCommaListElements(elements: NodeArray[Expression], visitor: Visitor[Node, js.UndefOr[Node]]): NodeArray[Expression] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitCommaListElements")(elements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Expression]]
inline def visitCommaListElements(
  elements: NodeArray[Expression],
  visitor: Visitor[Node, js.UndefOr[Node]],
  discardVisitor: Visitor[Node, js.UndefOr[Node]]
): NodeArray[Expression] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitCommaListElements")(elements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], discardVisitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Expression]]

/**
  * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
  *
  * @param node The Node whose children will be visited.
  * @param visitor The callback used to visit each child.
  * @param context A lexical environment context for the visitor.
  */
inline def visitEachChild[T /* <: Node */](node: T, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](
  node: T,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: Unit,
  tokenVisitor: Visitor[Node, js.UndefOr[Node]]
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any], tokenVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](
  node: T,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: FnCall
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](
  node: T,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: FnCall,
  tokenVisitor: Visitor[Node, js.UndefOr[Node]]
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any], tokenVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](node: Unit, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](
  node: Unit,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: Unit,
  tokenVisitor: Visitor[Node, js.UndefOr[Node]]
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any], tokenVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](
  node: Unit,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: FnCall
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
inline def visitEachChild[T /* <: Node */](
  node: Unit,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: FnCall,
  tokenVisitor: Visitor[Node, js.UndefOr[Node]]
): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any], tokenVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]

/**
  * Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
  *
  * @param node The Node whose children will be visited.
  * @param visitor The callback used to visit each child.
  * @param context A lexical environment context for the visitor.
  */
inline def visitEachChild_T_T[T /* <: Node */](node: T, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): T = (^.asInstanceOf[js.Dynamic].applyDynamic("visitEachChild")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]

inline def visitFunctionBody(node: Unit, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): js.UndefOr[FunctionBody] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitFunctionBody")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FunctionBody]]
/**
  * Resumes a suspended lexical environment and visits a concise body, ending the lexical
  * environment and merging hoisted declarations upon completion.
  */
inline def visitFunctionBody(node: ConciseBody, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): ConciseBody = (^.asInstanceOf[js.Dynamic].applyDynamic("visitFunctionBody")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ConciseBody]
/**
  * Resumes a suspended lexical environment and visits a function body, ending the lexical
  * environment and merging hoisted declarations upon completion.
  */
inline def visitFunctionBody(node: FunctionBody, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): js.UndefOr[FunctionBody] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitFunctionBody")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FunctionBody]]

/**
  * Resumes a suspended lexical environment and visits a function body, ending the lexical
  * environment and merging hoisted declarations upon completion.
  */
inline def visitFunctionBody_FunctionBody(node: FunctionBody, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): FunctionBody = (^.asInstanceOf[js.Dynamic].applyDynamic("visitFunctionBody")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[FunctionBody]

/**
  * Visits an iteration body, adding any block-scoped variables required by the transformation.
  */
inline def visitIterationBody(body: Statement, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): Statement = (^.asInstanceOf[js.Dynamic].applyDynamic("visitIterationBody")(body.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Statement]

/**
  * Starts a new lexical environment and visits a statement list, ending the lexical environment
  * and merging hoisted declarations upon completion.
  */
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Double
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Double,
  ensureUseStrict: Boolean
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ensureUseStrict.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Double,
  ensureUseStrict: Boolean,
  nodesVisitor: NodesVisitor
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ensureUseStrict.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Double,
  ensureUseStrict: Unit,
  nodesVisitor: NodesVisitor
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ensureUseStrict.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Unit,
  ensureUseStrict: Boolean
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ensureUseStrict.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Unit,
  ensureUseStrict: Boolean,
  nodesVisitor: NodesVisitor
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ensureUseStrict.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]
inline def visitLexicalEnvironment(
  statements: NodeArray[Statement],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  start: Unit,
  ensureUseStrict: Unit,
  nodesVisitor: NodesVisitor
): NodeArray[Statement] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitLexicalEnvironment")(statements.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], start.asInstanceOf[js.Any], ensureUseStrict.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Statement]]

/**
  * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
  *
  * - If the input node is undefined, then the output is undefined.
  * - If the visitor returns undefined, then the output is undefined.
  * - If the output node is not undefined, then it will satisfy the test function.
  * - In order to obtain a return type that is more specific than `Node`, a test
  *   function _must_ be provided, and that function must be a type predicate.
  *
  * @param node The Node to visit.
  * @param visitor The callback used to visit the Node.
  * @param test A callback to execute to verify the Node is valid.
  * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
  */
inline def visitNode[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](node: TIn, visitor: Visitor[NonNullable[TIn], TVisited]): Node | (TIn & Unit) | (TVisited & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Node | (TIn & Unit) | (TVisited & Unit)]
inline def visitNode[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](
  node: TIn,
  visitor: Visitor[NonNullable[TIn], TVisited],
  test: js.Function1[/* node */ Node, Boolean]
): Node | (TIn & Unit) | (TVisited & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[Node | (TIn & Unit) | (TVisited & Unit)]
inline def visitNode[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](
  node: TIn,
  visitor: Visitor[NonNullable[TIn], TVisited],
  test: js.Function1[/* node */ Node, Boolean],
  lift: js.Function1[/* node */ js.Array[Node], Node]
): Node | (TIn & Unit) | (TVisited & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], lift.asInstanceOf[js.Any])).asInstanceOf[Node | (TIn & Unit) | (TVisited & Unit)]
inline def visitNode[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */](
  node: TIn,
  visitor: Visitor[NonNullable[TIn], TVisited],
  test: Unit,
  lift: js.Function1[/* node */ js.Array[Node], Node]
): Node | (TIn & Unit) | (TVisited & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], lift.asInstanceOf[js.Any])).asInstanceOf[Node | (TIn & Unit) | (TVisited & Unit)]

/**
  * Visits a Node using the supplied visitor, possibly returning a new Node in its place.
  *
  * - If the input node is undefined, then the output is undefined.
  * - If the visitor returns undefined, then the output is undefined.
  * - If the output node is not undefined, then it will satisfy the test function.
  * - In order to obtain a return type that is more specific than `Node`, a test
  *   function _must_ be provided, and that function must be a type predicate.
  *
  * @param node The Node to visit.
  * @param visitor The callback used to visit the Node.
  * @param test A callback to execute to verify the Node is valid.
  * @param lift An optional callback to execute to lift a NodeArray into a valid Node.
  */
inline def visitNode_TInTVisitedTOut[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */, TOut /* <: Node */](
  node: TIn,
  visitor: Visitor[NonNullable[TIn], TVisited],
  test: js.Function1[/* node */ Node, /* is TOut */ Boolean]
): TOut | (TIn & Unit) | (TVisited & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[TOut | (TIn & Unit) | (TVisited & Unit)]
inline def visitNode_TInTVisitedTOut[TIn /* <: js.UndefOr[Node] */, TVisited /* <: js.UndefOr[Node] */, TOut /* <: Node */](
  node: TIn,
  visitor: Visitor[NonNullable[TIn], TVisited],
  test: js.Function1[/* node */ Node, /* is TOut */ Boolean],
  lift: js.Function1[/* node */ js.Array[Node], Node]
): TOut | (TIn & Unit) | (TVisited & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNode")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], lift.asInstanceOf[js.Any])).asInstanceOf[TOut | (TIn & Unit) | (TVisited & Unit)]

/**
  * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
  *
  * - If the input node array is undefined, the output is undefined.
  * - If the visitor can return undefined, the node it visits in the array will be reused.
  * - If the output node array is not undefined, then its contents will satisfy the test.
  * - In order to obtain a return type that is more specific than `NodeArray<Node>`, a test
  *   function _must_ be provided, and that function must be a type predicate.
  *
  * @param nodes The NodeArray to visit.
  * @param visitor The callback used to visit a Node.
  * @param test A node test to execute for each node.
  * @param start An optional value indicating the starting offset at which to start visiting.
  * @param count An optional value indicating the maximum number of nodes to visit.
  */
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]]): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, Boolean]
): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, Boolean],
  start: Double
): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, Boolean],
  start: Double,
  count: Double
): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, Boolean],
  start: Unit,
  count: Double
): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Double): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Double, count: Double): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]
inline def visitNodes[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */](nodes: TInArray, visitor: Visitor[TIn, js.UndefOr[Node]], test: Unit, start: Unit, count: Double): NodeArray[Node] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[NodeArray[Node] | (TInArray & Unit)]

/**
  * Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
  *
  * - If the input node array is undefined, the output is undefined.
  * - If the visitor can return undefined, the node it visits in the array will be reused.
  * - If the output node array is not undefined, then its contents will satisfy the test.
  * - In order to obtain a return type that is more specific than `NodeArray<Node>`, a test
  *   function _must_ be provided, and that function must be a type predicate.
  *
  * @param nodes The NodeArray to visit.
  * @param visitor The callback used to visit a Node.
  * @param test A node test to execute for each node.
  * @param start An optional value indicating the starting offset at which to start visiting.
  * @param count An optional value indicating the maximum number of nodes to visit.
  */
inline def visitNodes_TInTInArrayTOut[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */, TOut /* <: Node */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, /* is TOut */ Boolean]
): NodeArray[TOut] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[NodeArray[TOut] | (TInArray & Unit)]
inline def visitNodes_TInTInArrayTOut[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */, TOut /* <: Node */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, /* is TOut */ Boolean],
  start: Double
): NodeArray[TOut] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[NodeArray[TOut] | (TInArray & Unit)]
inline def visitNodes_TInTInArrayTOut[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */, TOut /* <: Node */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, /* is TOut */ Boolean],
  start: Double,
  count: Double
): NodeArray[TOut] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[NodeArray[TOut] | (TInArray & Unit)]
inline def visitNodes_TInTInArrayTOut[TIn /* <: Node */, TInArray /* <: js.UndefOr[NodeArray[TIn]] */, TOut /* <: Node */](
  nodes: TInArray,
  visitor: Visitor[TIn, js.UndefOr[Node]],
  test: js.Function1[/* node */ Node, /* is TOut */ Boolean],
  start: Unit,
  count: Double
): NodeArray[TOut] | (TInArray & Unit) = (^.asInstanceOf[js.Dynamic].applyDynamic("visitNodes")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], test.asInstanceOf[js.Any], start.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[NodeArray[TOut] | (TInArray & Unit)]

inline def visitParameterList(nodes: Unit, visitor: Visitor[Node, js.UndefOr[Node]], context: TransformationContext): js.UndefOr[NodeArray[ParameterDeclaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitParameterList")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeArray[ParameterDeclaration]]]
inline def visitParameterList(
  nodes: Unit,
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: NodesVisitor
): js.UndefOr[NodeArray[ParameterDeclaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitParameterList")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeArray[ParameterDeclaration]]]
inline def visitParameterList(
  nodes: NodeArray[ParameterDeclaration],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext
): js.UndefOr[NodeArray[ParameterDeclaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitParameterList")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeArray[ParameterDeclaration]]]
inline def visitParameterList(
  nodes: NodeArray[ParameterDeclaration],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: NodesVisitor
): js.UndefOr[NodeArray[ParameterDeclaration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitParameterList")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NodeArray[ParameterDeclaration]]]

/**
  * Starts a new lexical environment and visits a parameter list, suspending the lexical
  * environment upon completion.
  */
inline def visitParameterList_NodeArray(
  nodes: NodeArray[ParameterDeclaration],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext
): NodeArray[ParameterDeclaration] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitParameterList")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[NodeArray[ParameterDeclaration]]
inline def visitParameterList_NodeArray(
  nodes: NodeArray[ParameterDeclaration],
  visitor: Visitor[Node, js.UndefOr[Node]],
  context: TransformationContext,
  nodesVisitor: NodesVisitor
): NodeArray[ParameterDeclaration] = (^.asInstanceOf[js.Dynamic].applyDynamic("visitParameterList")(nodes.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any], nodesVisitor.asInstanceOf[js.Any])).asInstanceOf[NodeArray[ParameterDeclaration]]

inline def walkUpBindingElementsAndPatterns(binding: BindingElement): VariableDeclaration | ParameterDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("walkUpBindingElementsAndPatterns")(binding.asInstanceOf[js.Any]).asInstanceOf[VariableDeclaration | ParameterDeclaration]

type AbstractKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.AbstractKeyword]

type AccessibilityModifier = PublicKeyword | PrivateKeyword | ProtectedKeyword

type AccessorKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.AccessorKeyword]

type AdditiveOperatorOrHigher = MultiplicativeOperatorOrHigher | AdditiveOperator

type AffectedFileResult[T] = js.UndefOr[Affected[T]]

type AmpersandAmpersandEqualsToken = PunctuationToken[typings.typescript.mod.SyntaxKind.AmpersandAmpersandEqualsToken]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.BindingElement
  - typings.typescript.mod.OmittedExpression
  - typings.typescript.mod.SpreadElement
  - typings.typescript.mod.ArrayLiteralExpression
  - typings.typescript.mod.ObjectLiteralExpression
  - typings.typescript.mod.AssignmentExpression[typings.typescript.mod.EqualsToken]
  - typings.typescript.mod.Identifier
  - typings.typescript.mod.PropertyAccessExpression
  - typings.typescript.mod.ElementAccessExpression
*/
type ArrayBindingOrAssignmentElement = _ArrayBindingOrAssignmentElement | AssignmentExpression[EqualsToken]

type AssertKeyword = KeywordToken[typings.typescript.mod.SyntaxKind.AssertKeyword]

type AssertsKeyword = KeywordToken[typings.typescript.mod.SyntaxKind.AssertsKeyword]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.SyntaxKind.QuestionQuestionToken
  - typings.typescript.mod.LogicalOperatorOrHigher
  - typings.typescript.mod.AssignmentOperator
*/
type AssignmentOperatorOrHigher = _AssignmentOperatorOrHigher | LogicalOperatorOrHigher

type AssignmentOperatorToken = Token[AssignmentOperator]

type AsteriskToken = PunctuationToken[typings.typescript.mod.SyntaxKind.AsteriskToken]

type AsyncKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.AsyncKeyword]

type AwaitKeyword = KeywordToken[typings.typescript.mod.SyntaxKind.AwaitKeyword]

type BarBarEqualsToken = PunctuationToken[typings.typescript.mod.SyntaxKind.BarBarEqualsToken]

type BaseType = ObjectType | IntersectionType | TypeVariable

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.AssignmentOperatorOrHigher
  - typings.typescript.mod.SyntaxKind.CommaToken
*/
type BinaryOperator = _BinaryOperator | LogicalOperatorOrHigher

type BinaryOperatorToken = Token[BinaryOperator]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.VariableDeclaration
  - typings.typescript.mod.ParameterDeclaration
  - typings.typescript.mod.ObjectBindingOrAssignmentElement
  - typings.typescript.mod.ArrayBindingOrAssignmentElement
*/
type BindingOrAssignmentElement = _BindingOrAssignmentElement | AssignmentExpression[EqualsToken]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.DotDotDotToken
  - typings.typescript.mod.SpreadElement
  - typings.typescript.mod.SpreadAssignment
*/
type BindingOrAssignmentElementRestIndicator = _BindingOrAssignmentElementRestIndicator | DotDotDotToken

type BitwiseOperatorOrHigher = EqualityOperatorOrHigher | BitwiseOperator

type CaseKeyword = KeywordToken[typings.typescript.mod.SyntaxKind.CaseKeyword]

type ClassMemberModifier = AccessibilityModifier | ReadonlyKeyword | StaticKeyword | AccessorKeyword

type CodeActionCommand = InstallPackageAction

type ColonToken = PunctuationToken[typings.typescript.mod.SyntaxKind.ColonToken]

type CompilerOptionsValue = js.UndefOr[
java.lang.String | Double | Boolean | (js.Array[Double | PluginImport | ProjectReference | java.lang.String]) | MapLike[js.Array[java.lang.String]] | Null]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.Dot
  - typings.typescript.typescriptStrings.Quotationmark
  - / * ' * / java.lang.String
  - typings.typescript.typescriptStrings.Graveaccent
  - typings.typescript.typescriptStrings.Slash
  - typings.typescript.typescriptStrings.`@`
  - typings.typescript.typescriptStrings.Lessthansign
  - typings.typescript.typescriptStrings.Numbersign
  - typings.typescript.typescriptStrings.Space
*/
type CompletionsTriggerCharacter = _CompletionsTriggerCharacter | (/* ' */ java.lang.String)

type ConciseBody = FunctionBody | Expression

type ConstKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.ConstKeyword]

/** Create the program with rootNames and options, if they are undefined, oldProgram and new configFile diagnostics create new program */
type CreateProgram_[T /* <: BuilderProgram */] = js.Function6[
/* rootNames */ js.UndefOr[js.Array[java.lang.String]], 
/* options */ js.UndefOr[CompilerOptions], 
/* host */ js.UndefOr[CompilerHost], 
/* oldProgram */ js.UndefOr[T], 
/* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], 
/* projectReferences */ js.UndefOr[js.Array[ProjectReference]], 
T]

type CustomTransformerFactory = js.Function1[/* context */ TransformationContext, CustomTransformer]

type DeclareKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.DeclareKeyword]

type DefaultKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.DefaultKeyword]

type DeferredTypeReference = TypeReference

type DiagnosticReporter = js.Function1[/* diagnostic */ Diagnostic, Unit]

type DirectoryWatcherCallback = js.Function1[/* fileName */ java.lang.String, Unit]

type DotDotDotToken = PunctuationToken[typings.typescript.mod.SyntaxKind.DotDotDotToken]

type DotToken = PunctuationToken[typings.typescript.mod.SyntaxKind.DotToken]

type EmitHelperUniqueNameCallback = js.Function1[/* name */ java.lang.String, java.lang.String]

type EnumType = FreshableType

type EqualityOperatorOrHigher = RelationalOperatorOrHigher | EqualityOperator

type EqualsGreaterThanToken = PunctuationToken[typings.typescript.mod.SyntaxKind.EqualsGreaterThanToken]

type EqualsToken = PunctuationToken[typings.typescript.mod.SyntaxKind.EqualsToken]

type ErrorCallback = js.Function2[/* message */ DiagnosticMessage, /* length */ Double, Unit]

type ExclamationToken = PunctuationToken[typings.typescript.mod.SyntaxKind.ExclamationToken]

type ExponentiationOperator = AsteriskAsteriskToken

type ExportKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.ExportKeyword]

type FileWatcherCallback = js.Function3[
/* fileName */ java.lang.String, 
/* eventKind */ FileWatcherEventKind, 
/* modifiedTime */ js.UndefOr[js.Date], 
Unit]

type FunctionBody = Block

/** @deprecated Use SignatureDeclaration */
type FunctionLike = SignatureDeclaration

type InKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.InKeyword]

/** Deprecated, please use UpdateExpression */
type IncrementExpression = UpdateExpression

type InstantiableType = Type

type IntersectionType = UnionOrIntersectionType

type KeywordToken[TKind /* <: KeywordSyntaxKind */] = Token[TKind]

type LogicalOperatorOrHigher = BitwiseOperatorOrHigher | LogicalOperator

/**
  * Type of objects whose values are all of the same type.
  * The `in` and `for-in` operators can *not* be safely used,
  * since `Object.prototype` may be modified by outside code.
  */
type MapLike[T] = StringDictionary[T]

type MinusToken = PunctuationToken[typings.typescript.mod.SyntaxKind.MinusToken]

type Modifier = AbstractKeyword | AccessorKeyword | AsyncKeyword | ConstKeyword | DeclareKeyword | DefaultKeyword | ExportKeyword | InKeyword | PrivateKeyword | ProtectedKeyword | PublicKeyword | OutKeyword | OverrideKeyword | ReadonlyKeyword | StaticKeyword

type ModifierLike = Modifier | Decorator

type ModifierToken[TKind /* <: ModifierSyntaxKind */] = KeywordToken[TKind]

type ModifiersArray = NodeArray[Modifier]

type MultiplicativeOperatorOrHigher = ExponentiationOperator | MultiplicativeOperator

type OutKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.OutKeyword]

type OverrideKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.OverrideKeyword]

type ParameterPropertyModifier = AccessibilityModifier | ReadonlyKeyword

type PerModuleNameCache = PerNonRelativeNameCache[ResolvedModuleWithFailedLookupLocations]

type PlusToken = PunctuationToken[typings.typescript.mod.SyntaxKind.PlusToken]

type PrivateKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.PrivateKeyword]

type ProtectedKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.ProtectedKeyword]

type PublicKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.PublicKeyword]

type PunctuationToken[TKind /* <: PunctuationSyntaxKind */] = Token[TKind]

type QuestionDotToken = PunctuationToken[typings.typescript.mod.SyntaxKind.QuestionDotToken]

type QuestionQuestionEqualsToken = PunctuationToken[typings.typescript.mod.SyntaxKind.QuestionQuestionEqualsToken]

type QuestionToken = PunctuationToken[typings.typescript.mod.SyntaxKind.QuestionToken]

type ReadonlyKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.ReadonlyKeyword]

/** ReadonlyMap where keys are `__String`s. */
type ReadonlyUnderscoreEscapedMap[T] = ReadonlyMap[String, T]

type RelationalOperatorOrHigher = ShiftOperatorOrHigher | RelationalOperator

type ReportEmitErrorSummary = js.Function2[
/* errorCount */ Double, 
/* filesInError */ js.Array[js.UndefOr[ReportFileInError]], 
Unit]

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.ModuleKind.ESNext
  - typings.typescript.mod.ModuleKind.CommonJS
  - scala.Unit
*/
type ResolutionMode = js.UndefOr[_ResolutionMode]

/**
  * Branded string for keeping track of when we've turned an ambiguous path
  * specified like "./blah" to an absolute path to an actual
  * tsconfig file, e.g. "/root/blah/tsconfig.json"
  */
type ResolvedConfigFileName = java.lang.String

type ShiftOperatorOrHigher = AdditiveOperatorOrHigher | ShiftOperator

/* Rewritten from type alias, can be one of: 
  - / * ) * / java.lang.String
  - typings.typescript.typescriptStrings.Comma
  - typings.typescript.typescriptStrings.Lessthansign
*/
type SignatureHelpRetriggerCharacter = _SignatureHelpRetriggerCharacter | (/* ) */ java.lang.String)

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.Comma
  - / * ( * / java.lang.String
  - typings.typescript.typescriptStrings.Lessthansign
*/
type SignatureHelpTriggerCharacter = _SignatureHelpTriggerCharacter | (/* ( */ java.lang.String)

type StaticKeyword = ModifierToken[typings.typescript.mod.SyntaxKind.StaticKeyword]

/**
  * This represents a string whose leading underscore have been escaped by adding extra leading underscores.
  * The shape of this brand is rather unique compared to others we've used.
  * Instead of just an intersection of a string and an object, it is that union-ed
  * with an intersection of void and an object. This makes it wholly incompatible
  * with a normal string (which is good, it cannot be misused on assignment or on usage),
  * while still being comparable with a normal string via === (also good) and castable from a string.
  */
type String = (java.lang.String & EscapedIdentifier) | (Unit & EscapedIdentifier) | InternalSymbolName

type StructuredType = ObjectType | UnionType | IntersectionType

/** SymbolTable based on ES6 Map interface. */
type SymbolTable = UnderscoreEscapedMap[Symbol]

/**
  * A function that transforms a node.
  */
type Transformer[T /* <: Node */] = js.Function1[/* node */ T, T]

/**
  * A function that is used to initialize and return a `Transformer` callback, which in turn
  * will be used to transform one or more nodes.
  */
type TransformerFactory[T /* <: Node */] = js.Function1[/* context */ TransformationContext, Transformer[T]]

type TypeParameter = InstantiableType

type TypeVariable = TypeParameter | IndexedAccessType

/** Map where keys are `__String`s. */
type UnderscoreEscapedMap[T] = Map[String, T]

type UnionType = UnionOrIntersectionType

type VisitResult[T /* <: js.UndefOr[Node] */] = T | js.Array[Node]

/**
  * A function that accepts and possibly transforms a node.
  */
type Visitor[TIn /* <: Node */, TOut /* <: js.UndefOr[Node] */] = js.Function1[/* node */ TIn, VisitResult[TOut]]

/**
  * Creates the watch what generates program using the config file
  */
type WatchOfConfigFile[T] = Watch[T]

type WatchStatusReporter = js.Function4[
/* diagnostic */ Diagnostic, 
/* newLine */ java.lang.String, 
/* options */ CompilerOptions, 
/* errorCount */ js.UndefOr[Double], 
Unit]

type WithMetadata[T] = T & Metadata

type WriteFileCallback = js.Function6[
/* fileName */ java.lang.String, 
/* text */ java.lang.String, 
/* writeByteOrderMark */ Boolean, 
/* onError */ js.UndefOr[js.Function1[/* message */ java.lang.String, Unit]], 
/* sourceFiles */ js.UndefOr[js.Array[SourceFile]], 
/* data */ js.UndefOr[WriteFileCallbackData], 
Unit]
