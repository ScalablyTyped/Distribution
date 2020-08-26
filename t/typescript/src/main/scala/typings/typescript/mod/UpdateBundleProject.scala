package typings.typescript.mod

import typings.typescript.mod.InvalidatedProjectKind.UpdateBundle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBundleProject[T /* <: BuilderProgram */]
  extends InvalidatedProjectBase
     with InvalidatedProject[T] {
  @JSName("kind")
  val kind_UpdateBundleProject: UpdateBundle = js.native
  def emit(): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  def emit(writeFile: js.UndefOr[scala.Nothing], customTransformers: CustomTransformers): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  def emit(writeFile: WriteFileCallback): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
  def emit(writeFile: WriteFileCallback, customTransformers: CustomTransformers): js.UndefOr[EmitResult | BuildInvalidedProject[T]] = js.native
}

