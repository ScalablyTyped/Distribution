package typings.tensorflowTfjs.mod.backendUtil

import typings.tensorflowTfjsCore.fusedUtilMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util.shouldFuse")
@js.native
object shouldFuse extends js.Object {
  def apply(gradientDepth: Double, activation: Activation): Boolean = js.native
}

