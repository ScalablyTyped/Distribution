package typings.typescript.mod

import typings.typescript.mod.InvalidatedProjectKind.Build
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildInvalidedProject[T /* <: BuilderProgram */]
  extends InvalidatedProjectBase
     with InvalidatedProject[T] {
  @JSName("kind")
  val kind_BuildInvalidedProject: Build = js.native
  def emit(): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(targetSourceFile: js.UndefOr[scala.Nothing], writeFile: WriteFileCallback): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(targetSourceFile: SourceFile): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: js.UndefOr[scala.Nothing],
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(targetSourceFile: SourceFile, writeFile: WriteFileCallback): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: js.UndefOr[scala.Nothing],
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(targetSourceFile: SourceFile, writeFile: WriteFileCallback, cancellationToken: CancellationToken): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean
  ): js.UndefOr[EmitResult] = js.native
  def emit(
    targetSourceFile: SourceFile,
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: Boolean,
    customTransformers: CustomTransformers
  ): js.UndefOr[EmitResult] = js.native
  def getAllDependencies(sourceFile: SourceFile): js.Array[java.lang.String] = js.native
  def getBuilderProgram(): js.UndefOr[T] = js.native
  def getConfigFileParsingDiagnostics(): js.Array[Diagnostic] = js.native
  def getGlobalDiagnostics(): js.Array[Diagnostic] = js.native
  def getGlobalDiagnostics(cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getOptionsDiagnostics(): js.Array[Diagnostic] = js.native
  def getOptionsDiagnostics(cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getProgram(): js.UndefOr[Program] = js.native
  def getSemanticDiagnostics(): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getSemanticDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getSemanticDiagnosticsOfNextAffectedFile(): AffectedFileResult[js.Array[Diagnostic]] = js.native
  def getSemanticDiagnosticsOfNextAffectedFile(
    cancellationToken: js.UndefOr[scala.Nothing],
    ignoreSourceFile: js.Function1[/* sourceFile */ SourceFile, Boolean]
  ): AffectedFileResult[js.Array[Diagnostic]] = js.native
  def getSemanticDiagnosticsOfNextAffectedFile(cancellationToken: CancellationToken): AffectedFileResult[js.Array[Diagnostic]] = js.native
  def getSemanticDiagnosticsOfNextAffectedFile(
    cancellationToken: CancellationToken,
    ignoreSourceFile: js.Function1[/* sourceFile */ SourceFile, Boolean]
  ): AffectedFileResult[js.Array[Diagnostic]] = js.native
  def getSourceFile(fileName: java.lang.String): js.UndefOr[SourceFile] = js.native
  def getSourceFiles(): js.Array[SourceFile] = js.native
  def getSyntacticDiagnostics(): js.Array[Diagnostic] = js.native
  def getSyntacticDiagnostics(sourceFile: js.UndefOr[scala.Nothing], cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
  def getSyntacticDiagnostics(sourceFile: SourceFile): js.Array[Diagnostic] = js.native
  def getSyntacticDiagnostics(sourceFile: SourceFile, cancellationToken: CancellationToken): js.Array[Diagnostic] = js.native
}

