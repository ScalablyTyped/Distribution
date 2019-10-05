package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createProgram")
@js.native
object createProgram extends js.Object {
  def apply(createProgramOptions: CreateProgramOptions): Program = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions): Program = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost): Program = js.native
  def apply(rootNames: js.Array[String], options: CompilerOptions, host: CompilerHost, oldProgram: Program): Program = js.native
  def apply(
    rootNames: js.Array[String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: Program,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
}

