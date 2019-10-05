package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distEngineMod.ScopeFn
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "tidy")
@js.native
object tidy extends js.Object {
  def apply[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  def apply[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  def apply[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def apply[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
}

