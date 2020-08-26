package typings.winrtUwp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */ var buffer: js.Array[Double] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */ var bytesWritten: Double = js.native
}

object Buffer {
  @scala.inline
  def apply(buffer: js.Array[Double], bytesWritten: Double): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
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
    def setBufferVarargs(value: Double*): Self = this.set("buffer", js.Array(value :_*))
    @scala.inline
    def setBuffer(value: js.Array[Double]): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
  }
  
}

