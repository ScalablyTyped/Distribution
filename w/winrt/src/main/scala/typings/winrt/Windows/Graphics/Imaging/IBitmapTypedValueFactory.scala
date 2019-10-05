package typings.winrt.Windows.Graphics.Imaging

import typings.winrt.Windows.Foundation.PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapTypedValueFactory extends js.Object {
  def create(value: js.Any, `type`: PropertyType): BitmapTypedValue
}

object IBitmapTypedValueFactory {
  @scala.inline
  def apply(create: (js.Any, PropertyType) => BitmapTypedValue): IBitmapTypedValueFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
  
    __obj.asInstanceOf[IBitmapTypedValueFactory]
  }
}

