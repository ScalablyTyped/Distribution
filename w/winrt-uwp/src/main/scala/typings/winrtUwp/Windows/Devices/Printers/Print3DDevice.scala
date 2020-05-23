package typings.winrtUwp.Windows.Devices.Printers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3D printer. */
trait Print3DDevice extends js.Object {
  /** Gets the PrintSchema object for obtaining capabilities and print ticket information. */
  var printSchema: PrintSchema
}

object Print3DDevice {
  @scala.inline
  def apply(printSchema: PrintSchema): Print3DDevice = {
    val __obj = js.Dynamic.literal(printSchema = printSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DDevice]
  }
}

