package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalProgramOptions[T /* <: BuilderProgram */] extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  var createProgram: js.UndefOr[CreateProgram[T]] = js.undefined
  var host: js.UndefOr[CompilerHost] = js.undefined
  var options: CompilerOptions
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  var rootNames: js.Array[String]
}

object IncrementalProgramOptions {
  @scala.inline
  def apply[T /* <: BuilderProgram */](
    options: CompilerOptions,
    rootNames: js.Array[String],
    configFileParsingDiagnostics: js.Array[Diagnostic] = null,
    createProgram: (/* rootNames */ js.UndefOr[js.Array[String]], /* options */ js.UndefOr[CompilerOptions], /* host */ js.UndefOr[CompilerHost], /* oldProgram */ js.UndefOr[T], /* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], /* projectReferences */ js.UndefOr[js.Array[ProjectReference]]) => T = null,
    host: CompilerHost = null,
    projectReferences: js.Array[ProjectReference] = null
  ): IncrementalProgramOptions[T] = {
    val __obj = js.Dynamic.literal(options = options, rootNames = rootNames)
    if (configFileParsingDiagnostics != null) __obj.updateDynamic("configFileParsingDiagnostics")(configFileParsingDiagnostics)
    if (createProgram != null) __obj.updateDynamic("createProgram")(js.Any.fromFunction6(createProgram))
    if (host != null) __obj.updateDynamic("host")(host)
    if (projectReferences != null) __obj.updateDynamic("projectReferences")(projectReferences)
    __obj.asInstanceOf[IncrementalProgramOptions[T]]
  }
}

