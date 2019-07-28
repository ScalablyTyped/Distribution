package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProgramOptions extends js.Object {
  var configFileParsingDiagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  var host: js.UndefOr[CompilerHost] = js.undefined
  var oldProgram: js.UndefOr[Program] = js.undefined
  var options: CompilerOptions
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  var rootNames: js.Array[String]
}

object CreateProgramOptions {
  @scala.inline
  def apply(
    options: CompilerOptions,
    rootNames: js.Array[String],
    configFileParsingDiagnostics: js.Array[Diagnostic] = null,
    host: CompilerHost = null,
    oldProgram: Program = null,
    projectReferences: js.Array[ProjectReference] = null
  ): CreateProgramOptions = {
    val __obj = js.Dynamic.literal(options = options, rootNames = rootNames)
    if (configFileParsingDiagnostics != null) __obj.updateDynamic("configFileParsingDiagnostics")(configFileParsingDiagnostics)
    if (host != null) __obj.updateDynamic("host")(host)
    if (oldProgram != null) __obj.updateDynamic("oldProgram")(oldProgram)
    if (projectReferences != null) __obj.updateDynamic("projectReferences")(projectReferences)
    __obj.asInstanceOf[CreateProgramOptions]
  }
}

