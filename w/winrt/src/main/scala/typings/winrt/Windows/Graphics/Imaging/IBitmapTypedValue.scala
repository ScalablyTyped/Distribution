package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapTypedValue extends js.Object {
  var `type`: PropertyType
  var value: js.Any
}

object IBitmapTypedValue {
  @scala.inline
  def apply(`type`: PropertyType, value: js.Any): IBitmapTypedValue = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IBitmapTypedValue]
  }
}

