package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgramHost
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.Program
import typings.typescript.mod.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createEmitAndSemanticDiagnosticsBuilderProgram")
@js.native
object createEmitAndSemanticDiagnosticsBuilderProgram extends js.Object {
  def apply(): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder that can handle the changes in program and iterate through changed files
    * to emit the those files and manage semantic diagnostics cache as well
    */
  def apply(newProgram: Program, host: BuilderProgramHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String]): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String], options: js.UndefOr[scala.Nothing], host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: EmitAndSemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): EmitAndSemanticDiagnosticsBuilderProgram = js.native
}

