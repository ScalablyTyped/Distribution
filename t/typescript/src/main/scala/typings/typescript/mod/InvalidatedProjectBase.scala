package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidatedProjectBase extends js.Object {
  
  /**
    *  To dispose this project and ensure that all the necessary actions are taken and state is updated accordingly
    */
  def done(): ExitStatus = js.native
  def done(
    cancellationToken: js.UndefOr[scala.Nothing],
    writeFile: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): ExitStatus = js.native
  def done(cancellationToken: js.UndefOr[scala.Nothing], writeFile: WriteFileCallback): ExitStatus = js.native
  def done(
    cancellationToken: js.UndefOr[scala.Nothing],
    writeFile: WriteFileCallback,
    customTransformers: CustomTransformers
  ): ExitStatus = js.native
  def done(cancellationToken: CancellationToken): ExitStatus = js.native
  def done(
    cancellationToken: CancellationToken,
    writeFile: js.UndefOr[scala.Nothing],
    customTransformers: CustomTransformers
  ): ExitStatus = js.native
  def done(cancellationToken: CancellationToken, writeFile: WriteFileCallback): ExitStatus = js.native
  def done(
    cancellationToken: CancellationToken,
    writeFile: WriteFileCallback,
    customTransformers: CustomTransformers
  ): ExitStatus = js.native
  
  def getCompilerOptions(): CompilerOptions = js.native
  
  def getCurrentDirectory(): java.lang.String = js.native
  
  val kind: InvalidatedProjectKind = js.native
  
  val project: ResolvedConfigFileName = js.native
}
