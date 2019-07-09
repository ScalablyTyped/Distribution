package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backend extends js.Object {
  var backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend
  var bytes: scala.Double
  var dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64
  var refCount: scala.Double
  var shape: js.Array[scala.Double]
}

object Anon_Backend {
  @scala.inline
  def apply(
    backend: atTensorflowTfjsDashCoreLib.distBackendsBackendMod.KernelBackend,
    bytes: scala.Double,
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.string | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.float32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.int32 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.bool | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.complex64,
    refCount: scala.Double,
    shape: js.Array[scala.Double]
  ): Anon_Backend = {
    val __obj = js.Dynamic.literal(backend = backend, bytes = bytes, dtype = dtype.asInstanceOf[js.Any], refCount = refCount, shape = shape)
  
    __obj.asInstanceOf[Anon_Backend]
  }
}

