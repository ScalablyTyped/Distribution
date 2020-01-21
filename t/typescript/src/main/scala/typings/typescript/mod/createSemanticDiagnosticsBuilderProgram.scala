package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createSemanticDiagnosticsBuilderProgram")
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
  def apply(rootNames: js.Array[java.lang.String]): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String], options: js.UndefOr[scala.Nothing], host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String], options: CompilerOptions): SemanticDiagnosticsBuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): SemanticDiagnosticsBuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: SemanticDiagnosticsBuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): SemanticDiagnosticsBuilderProgram = js.native
}

