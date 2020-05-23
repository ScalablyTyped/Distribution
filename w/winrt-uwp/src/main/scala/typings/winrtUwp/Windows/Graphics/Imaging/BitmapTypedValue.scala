package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A value along with an enumeration specifying its data type. */
trait BitmapTypedValue extends js.Object {
  /** Gets the PropertyType of the stored value. */
  var `type`: PropertyType
  /** Gets the stored value. */
  var value: js.Any
}

object BitmapTypedValue {
  @scala.inline
  def apply(`type`: PropertyType, value: js.Any): BitmapTypedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTypedValue]
  }
}

