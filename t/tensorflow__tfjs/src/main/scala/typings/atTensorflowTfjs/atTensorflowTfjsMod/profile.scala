package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distEngineMod.ProfileInfo
import typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "profile")
@js.native
object profile extends js.Object {
  def apply(f: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
}

