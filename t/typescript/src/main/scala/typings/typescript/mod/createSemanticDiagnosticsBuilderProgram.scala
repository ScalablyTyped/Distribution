package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createSemanticDiagnosticsBuilderProgram")
@js.native
object createSemanticDiagnosticsBuilderProgram extends js.Object {
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
  def apply(
    rootNames: js.UndefOr[js.Array[java.lang.String]],
    options: js.UndefOr[CompilerOptions],
    host: js.UndefOr[CompilerHost],
    oldProgram: js.UndefOr[SemanticDiagnosticsBuilderProgram],
    configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]],
    projectReferences: js.UndefOr[js.Array[ProjectReference]]
  ): SemanticDiagnosticsBuilderProgram = js.native
}

