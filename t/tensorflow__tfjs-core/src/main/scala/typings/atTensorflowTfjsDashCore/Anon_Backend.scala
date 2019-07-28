package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.bool
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.complex64
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.float32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.int32
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.string
import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.KernelBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Backend extends js.Object {
  var backend: KernelBackend
  var bytes: Double
  var dtype: string | float32 | int32 | bool | complex64
  var refCount: Double
  var shape: js.Array[Double]
}

object Anon_Backend {
  @scala.inline
  def apply(
    backend: KernelBackend,
    bytes: Double,
    dtype: string | float32 | int32 | bool | complex64,
    refCount: Double,
    shape: js.Array[Double]
  ): Anon_Backend = {
    val __obj = js.Dynamic.literal(backend = backend, bytes = bytes, dtype = dtype.asInstanceOf[js.Any], refCount = refCount, shape = shape)
  
    __obj.asInstanceOf[Anon_Backend]
  }
}

