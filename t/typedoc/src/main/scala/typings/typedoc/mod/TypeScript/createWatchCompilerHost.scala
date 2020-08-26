package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CreateProgram_
import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.FileExtensionInfo
import typings.typescript.mod.ProjectReference
import typings.typescript.mod.System
import typings.typescript.mod.WatchCompilerHostOfConfigFile
import typings.typescript.mod.WatchCompilerHostOfFilesAndCompilerOptions
import typings.typescript.mod.WatchOptions
import typings.typescript.mod.WatchStatusReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createWatchCompilerHost")
@js.native
object createWatchCompilerHost extends js.Object {
  /**
    * Create the watch compiler host for either configFile or fileNames and its options
    */
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: js.UndefOr[CompilerOptions],
    system: System,
    createProgram: js.UndefOr[CreateProgram_[T]],
    reportDiagnostic: js.UndefOr[DiagnosticReporter],
    reportWatchStatus: js.UndefOr[WatchStatusReporter],
    watchOptionsToExtend: js.UndefOr[WatchOptions],
    extraFileExtensions: js.UndefOr[js.Array[FileExtensionInfo]]
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](rootFiles: js.Array[String], options: CompilerOptions, system: System): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: js.UndefOr[scala.Nothing],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: js.UndefOr[scala.Nothing],
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: js.UndefOr[scala.Nothing],
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.UndefOr[scala.Nothing],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference],
    watchOptions: WatchOptions
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
}

