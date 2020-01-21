package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createAbstractBuilder")
@js.native
object createAbstractBuilder extends js.Object {
  def apply(): BuilderProgram = js.native
  /**
    * Creates a builder thats just abstraction over program and can be used with watch
    */
  def apply(newProgram: Program, host: BuilderProgramHost): BuilderProgram = js.native
  def apply(newProgram: Program, host: BuilderProgramHost, oldProgram: BuilderProgram): BuilderProgram = js.native
  def apply(
    newProgram: Program,
    host: BuilderProgramHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], host: CompilerHost): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions): BuilderProgram = js.native
  def apply(rootNames: js.UndefOr[scala.Nothing], options: CompilerOptions, host: CompilerHost): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.UndefOr[scala.Nothing],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String]): BuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String], options: js.UndefOr[scala.Nothing], host: CompilerHost): BuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: js.UndefOr[scala.Nothing],
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String], options: CompilerOptions): BuilderProgram = js.native
  def apply(rootNames: js.Array[java.lang.String], options: CompilerOptions, host: CompilerHost): BuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic]
  ): BuilderProgram = js.native
  def apply(
    rootNames: js.Array[java.lang.String],
    options: CompilerOptions,
    host: CompilerHost,
    oldProgram: BuilderProgram,
    configFileParsingDiagnostics: js.Array[Diagnostic],
    projectReferences: js.Array[ProjectReference]
  ): BuilderProgram = js.native
}

