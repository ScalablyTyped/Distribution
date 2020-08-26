package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.backendMod.KernelBackend
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bool
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.complex64
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.float32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.int32
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backend extends js.Object {
  var backend: KernelBackend = js.native
  var bytes: Double = js.native
  var dtype: string | float32 | int32 | bool | complex64 = js.native
  var refCount: Double = js.native
  var shape: js.Array[Double] = js.native
}

object Backend {
  @scala.inline
  def apply(
    backend: KernelBackend,
    bytes: Double,
    dtype: string | float32 | int32 | bool | complex64,
    refCount: Double,
    shape: js.Array[Double]
  ): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  @scala.inline
  implicit class BackendOps[Self <: Backend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackend(value: KernelBackend): Self = this.set("backend", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDtype(value: string | float32 | int32 | bool | complex64): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefCount(value: Double): Self = this.set("refCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
  
}

