package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createWatchCompilerHost")
@js.native
object createWatchCompilerHost extends js.Object {
  def apply[T /* <: BuilderProgram */](configFileName: String, optionsToExtend: js.UndefOr[scala.Nothing], system: System): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: System,
    createProgram: CreateProgram[T]
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: js.UndefOr[scala.Nothing],
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  /**
    * Create the watch compiler host for either configFile or fileNames and its options
    */
  def apply[T /* <: BuilderProgram */](configFileName: String, optionsToExtend: CompilerOptions, system: System): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T]
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](
    configFileName: String,
    optionsToExtend: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfConfigFile[T] = js.native
  def apply[T /* <: BuilderProgram */](rootFiles: js.Array[String], options: CompilerOptions, system: System): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
  def apply[T /* <: BuilderProgram */](
    rootFiles: js.Array[String],
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram[T],
    reportDiagnostic: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter,
    projectReferences: js.Array[ProjectReference]
  ): WatchCompilerHostOfFilesAndCompilerOptions[T] = js.native
}

