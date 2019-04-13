package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to manage the program state changes
  */
@js.native
trait BuilderProgram extends js.Object {
  /**
    * Emits the JavaScript and declaration files.
    * When targetSource file is specified, emits the files corresponding to that source file,
    * otherwise for the whole program.
    * In case of EmitAndSemanticDiagnosticsBuilderProgram, when targetSourceFile is specified,
    * it is assumed that that file is handled from affected file list. If targetSourceFile is not specified,
    * it will only emit all the affected files instead of whole program
    *
    * The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
    * in that order would be used to write the files
    */
  def emit(): EmitResult = js.native
  def emit(targetSourceFile: SourceFile): EmitResult = js.native
  def emit(targetSourceFile: SourceFile, writeFile: WriteFileCallback): EmitResult = js.native
  def emit(targetSourceFile: SourceFile, writeFile: WriteFileCallback, cancellationToken: CancellationToken): EmitResult = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: scala.Boolean
  ): EmitResult = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: scala.Boolean,
    customTransformers: CustomTransformers
  ): EmitResult = js.native
  /**
    * Get all the dependencies of the file
    */
  def getAllDependencies(sourceFile: SourceFile): js.Array[java.lang.String] = js.native
  /**
    * Get compiler options of the program
    */
  def getCompilerOptions(): CompilerOptions = js.native
  /**
    * Get the diagnostics from config file parsing
    */
  def getConfigFileParsingDiagnostics(): js.Array[Diagnostic] = js.native
  /**
    * Get the current directory of the program
    */
  def getCurrentDirectory(): java.lang.String = js.native
  /**
    * Get the declaration diagnostics, for all source files if source file is not supplied
    */
  def getDeclarationDiagnostics(): js.Array[DiagnosticWithLocation] = js.native
  def getDeclarationDiagnostics(sourceFile: SourceFile): js.Array[DiagnosticWithLocation] = js.native
  def getDeclarationDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[DiagnosticWithLocation] = js.native
  /**
    * Get the diagnostics that dont belong to any file
    */
  def getGlobalDiagnostics(): js.Array[Diagnostic] = js.native
  def getGlobalDiagnostics(cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  /**
    * Get the diagnostics for compiler options
    */
  def getOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  def getOptionsDiagnostics(cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  /**
    * Returns current program
    */
  def getProgram(): Program = js.native
  /**
    * Gets the semantic diagnostics from the program corresponding to this state of file (if provided) or whole program
    * The semantic diagnostics are cached and managed here
    * Note that it is assumed that when asked about semantic diagnostics through this API,
    * the file has been taken out of affected files so it is safe to use cache or get from program and cache the diagnostics
    * In case of SemanticDiagnosticsBuilderProgram if the source file is not provided,
    * it will iterate through all the affected files, to ensure that cache stays valid and yet provide a way to get all semantic diagnostics
    */
  def getSemanticDiagnostics(): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  /**
    * Get the source file in the program with file name
    */
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile] = js.native
  /**
    * Get a list of files in the program
    */
  def getSourceFiles(): js.Array[SourceFile] = js.native
  /**
    * Get the syntax diagnostics, for all source files if source file is not supplied
    */
  def getSyntacticDiagnostics(): js.Array[Diagnostic] = js.native
  def getSyntacticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getSyntacticDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}

