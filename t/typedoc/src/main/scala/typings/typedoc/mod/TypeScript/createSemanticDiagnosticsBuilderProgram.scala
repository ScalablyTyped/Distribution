package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgramHost
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Program
import typings.typescript.mod.ProjectReference
import typings.typescript.mod.SemanticDiagnosticsBuilderProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSemanticDiagnosticsBuilderProgram")
@js.native
object createSemanticDiagnosticsBuilderProgram extends js.Object {
  def apply(): SemanticDiagnosticsBuilderProgram = js.native
  /**
    * Create the builder to manage semantic diagnostics and cache them
    */
  def apply(newProgram: Program, host: BuilderProgramHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(newProgram: Program, host: BuilderProgramHost, oldProgram: SemanticDiagnosticsBuilderProgram): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String]): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String], options: js.UndefOr[scala.Nothing], host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
}

