package typings.winrtUwp.Windows.Devices.Printers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D printer. */
@js.native
trait Print3DDevice extends js.Object {
  /** Gets the PrintSchema object for obtaining capabilities and print ticket information. */
  var printSchema: PrintSchema = js.native
}

object Print3DDevice {
  @scala.inline
  def apply(printSchema: PrintSchema): Print3DDevice = {
    val __obj = js.Dynamic.literal(printSchema = printSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DDevice]
  }
  @scala.inline
  implicit class Print3DDeviceOps[Self <: Print3DDevice] (val x: Self) extends AnyVal {
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
    def setPrintSchema(value: PrintSchema): Self = this.set("printSchema", value.asInstanceOf[js.Any])
  }
  
}

