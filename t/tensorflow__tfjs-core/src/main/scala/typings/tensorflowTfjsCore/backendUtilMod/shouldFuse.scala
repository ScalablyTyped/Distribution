package typings.tensorflowTfjsCore.backendUtilMod

import typings.tensorflowTfjsCore.fusedUtilMod.Activation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/backend_util", "shouldFuse")
@js.native
object shouldFuse extends js.Object {
  def apply(gradientDepth: Double, activation: Activation): Boolean = js.native
}

