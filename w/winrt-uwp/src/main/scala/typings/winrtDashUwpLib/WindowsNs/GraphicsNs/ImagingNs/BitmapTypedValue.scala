package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A value along with an enumeration specifying its data type. */
@JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
@js.native
class BitmapTypedValue protected () extends js.Object {
  /**
    * Creates a new BitmapTypedValue object.
    * @param value The value to store.
    * @param type The type of the value parameter.
    */
  def this(value: js.Any, `type`: winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType) = this()
  /** Gets the PropertyType of the stored value. */
  var `type`: winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType = js.native
  /** Gets the stored value. */
  var value: js.Any = js.native
}

