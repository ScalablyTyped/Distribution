package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.engineMod.ProfileInfo
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "profile")
@js.native
object profile extends js.Object {
  def apply(f: js.Function0[TensorContainer]): js.Promise[ProfileInfo] = js.native
}

