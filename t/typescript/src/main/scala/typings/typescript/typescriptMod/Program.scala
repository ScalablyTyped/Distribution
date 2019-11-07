package typings.typescript.typescriptMod

import typings.typescript.Anon_Assignable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Program extends ScriptReferenceHost {
  /**
    * Emits the JavaScript and declaration files.  If targetSourceFile is not specified, then
    * the JavaScript and declaration files will be produced for all the files in this program.
    * If targetSourceFile is specified, then only the JavaScript and declaration for that
    * specific file will be generated.
    *
    * If writeFile is not specified then the writeFile callback from the compiler host will be
    * used for writing the JavaScript and declaration files.  Otherwise, the writeFile parameter
    * will be invoked when writing the JavaScript and declaration files.
    */
  def emit(): EmitResult = js.native
  def emit(targetSourceFile: SourceFile): EmitResult = js.native
  def emit(targetSourceFile: SourceFile, writeFile: WriteFileCallback): EmitResult = js.native
  def emit(targetSourceFile: SourceFile, writeFile: WriteFileCallback, cancellationToken: CancellationToken): EmitResult = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean
  ): EmitResult = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): EmitResult = js.native
  def getConfigFileParsingDiagnostics(): js.Array[Diagnostic] = js.native
  def getDeclarationDiagnostics(): js.Array[DiagnosticWithLocation] = js.native
  def getDeclarationDiagnostics(sourceFile: SourceFile): js.Array[DiagnosticWithLocation] = js.native
  def getDeclarationDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[DiagnosticWithLocation] = js.native
  def getGlobalDiagnostics(): js.Array[Diagnostic] = js.native
  def getGlobalDiagnostics(cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getIdentifierCount(): Double = js.native
  def getNodeCount(): Double = js.native
  def getOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  def getOptionsDiagnostics(cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getProjectReferences(): js.UndefOr[js.Array[ProjectReference]] = js.native
  def getRelationCacheSizes(): Anon_Assignable = js.native
  def getResolvedProjectReferences(): js.UndefOr[js.Array[js.UndefOr[ResolvedProjectReference]]] = js.native
  /**
    * Get a list of root file names that were passed to a 'createProgram'
    */
  def getRootFileNames(): js.Array[String] = js.native
  /** The first time this is called, it will return global diagnostics (no location). */
  def getSemanticDiagnostics(): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  /**
    * Get a list of files in the program
    */
  def getSourceFiles(): js.Array[SourceFile] = js.native
  def getSymbolCount(): Double = js.native
  def getSyntacticDiagnostics(): js.Array[DiagnosticWithLocation] = js.native
  def getSyntacticDiagnostics(sourceFile: SourceFile): js.Array[DiagnosticWithLocation] = js.native
  def getSyntacticDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[DiagnosticWithLocation] = js.native
  /**
    * Gets a type checker that can be used to semantically analyze source files in the program.
    */
  def getTypeChecker(): TypeChecker = js.native
  def getTypeCount(): Double = js.native
  def isSourceFileDefaultLibrary(file: SourceFile): Boolean = js.native
  def isSourceFileFromExternalLibrary(file: SourceFile): Boolean = js.native
}

