package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncrementalProgramOptions[T /* <: BuilderProgram */] extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  var createProgram: js.UndefOr[CreateProgram_[T]] = js.undefined
  var host: js.UndefOr[CompilerHost] = js.undefined
  var options: CompilerOptions
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  var rootNames: js.Array[java.lang.String]
}

object IncrementalProgramOptions {
  @scala.inline
  def apply[T](
    options: CompilerOptions,
    rootNames: js.Array[java.lang.String],
    configFileParsingDiagnostics: js.Array[Diagnostic] = null,
    createProgram: (/* rootNames */ js.UndefOr[js.Array[java.lang.String]], /* options */ js.UndefOr[CompilerOptions], /* host */ js.UndefOr[CompilerHost], /* oldProgram */ js.UndefOr[T], /* configFileParsingDiagnostics */ js.UndefOr[js.Array[Diagnostic]], /* projectReferences */ js.UndefOr[js.Array[ProjectReference]]) => T = null,
    host: CompilerHost = null,
    projectReferences: js.Array[ProjectReference] = null
  ): IncrementalProgramOptions[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    if (configFileParsingDiagnostics != null) __obj.updateDynamic("configFileParsingDiagnostics")(configFileParsingDiagnostics.asInstanceOf[js.Any])
    if (createProgram != null) __obj.updateDynamic("createProgram")(js.Any.fromFunction6(createProgram))
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (projectReferences != null) __obj.updateDynamic("projectReferences")(projectReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementalProgramOptions[T]]
  }
}

