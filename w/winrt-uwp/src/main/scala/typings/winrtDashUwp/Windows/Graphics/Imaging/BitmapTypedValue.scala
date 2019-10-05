package typings.winrtDashUwp.Windows.Graphics.Imaging

import typings.winrtDashUwp.Windows.Foundation.PropertyType
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
  def this(value: js.Any, `type`: PropertyType) = this()
  /** Gets the PropertyType of the stored value. */
  var `type`: PropertyType = js.native
  /** Gets the stored value. */
  var value: js.Any = js.native
}

