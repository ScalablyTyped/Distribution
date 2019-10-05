package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "registerBackend")
@js.native
object registerBackend extends js.Object {
  def apply(
    name: String,
    factory: js.Function0[
      typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
    ]
  ): Boolean = js.native
  def apply(
    name: String,
    factory: js.Function0[
      typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend | js.Promise[typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend]
    ],
    priority: Double
  ): Boolean = js.native
}

