package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createProgram")
@js.native
object createProgram extends js.Object {
  
  def apply(createProgramOptions: CreateProgramOptions): Program = js.native
  def apply(rootNames: js.Array[java.lang.String], options: CompilerOptions): Program = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: js.UndefOr[scala.Nothing],
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: js.UndefOr[scala.Nothing],
    oldProgram: Program
  ): Program = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: js.UndefOr[scala.Nothing],
    oldProgram: Program,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def apply(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): Program = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: js.UndefOr[scala.Nothing],
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: Program
  ): Program = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: Program,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): Program = js.native
}
