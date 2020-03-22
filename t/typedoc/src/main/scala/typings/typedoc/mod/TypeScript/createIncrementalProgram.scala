package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.IncrementalProgramOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createIncrementalProgram")
@js.native
object createIncrementalProgram extends js.Object {
  def apply[T /* <: BuilderProgram */](
    hasRootNamesOptionsConfigFileParsingDiagnosticsProjectReferencesHostCreateProgram: IncrementalProgramOptions[T]
  ): T = js.native
}

