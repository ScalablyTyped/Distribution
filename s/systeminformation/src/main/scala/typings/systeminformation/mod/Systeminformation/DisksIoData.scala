package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisksIoData extends js.Object {
  var ms: Double = js.native
  var rIO: Double = js.native
  var rIO_sec: Double = js.native
  var tIO: Double = js.native
  var tIO_sec: Double = js.native
  var wIO: Double = js.native
  var wIO_sec: Double = js.native
}

object DisksIoData {
  @scala.inline
  def apply(
    ms: Double,
    rIO: Double,
    rIO_sec: Double,
    tIO: Double,
    tIO_sec: Double,
    wIO: Double,
    wIO_sec: Double
  ): DisksIoData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], rIO = rIO.asInstanceOf[js.Any], rIO_sec = rIO_sec.asInstanceOf[js.Any], tIO = tIO.asInstanceOf[js.Any], tIO_sec = tIO_sec.asInstanceOf[js.Any], wIO = wIO.asInstanceOf[js.Any], wIO_sec = wIO_sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisksIoData]
  }
  @scala.inline
  implicit class DisksIoDataOps[Self <: DisksIoData] (val x: Self) extends AnyVal {
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
    def setMs(value: Double): Self = this.set("ms", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIO(value: Double): Self = this.set("rIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setRIO_sec(value: Double): Self = this.set("rIO_sec", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIO(value: Double): Self = this.set("tIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setTIO_sec(value: Double): Self = this.set("tIO_sec", value.asInstanceOf[js.Any])
    @scala.inline
    def setWIO(value: Double): Self = this.set("wIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setWIO_sec(value: Double): Self = this.set("wIO_sec", value.asInstanceOf[js.Any])
  }
  
}

