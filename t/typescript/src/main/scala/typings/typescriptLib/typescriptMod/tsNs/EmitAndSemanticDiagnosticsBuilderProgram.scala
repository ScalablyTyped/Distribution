package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder that can handle the changes in program and iterate through changed file to emit the files
  * The semantic diagnostics are cached per file and managed by clearing for the changed/affected files
  */
@js.native
trait EmitAndSemanticDiagnosticsBuilderProgram extends BuilderProgram {
  /**
    * Emits the next affected file's emit result (EmitResult and sourceFiles emitted) or returns undefined if iteration is complete
    * The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
    * in that order would be used to write the files
    */
  def emitNextAffectedFile(): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: WriteFileCallback): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(writeFile: WriteFileCallback, cancellationToken: CancellationToken): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: scala.Boolean
  ): AffectedFileResult[EmitResult] = js.native
  def emitNextAffectedFile(
    writeFile: WriteFileCallback,
    cancellationToken: CancellationToken,
    emitOnlyDtsFiles: scala.Boolean,
    customTransformers: CustomTransformers
  ): AffectedFileResult[EmitResult] = js.native
}

