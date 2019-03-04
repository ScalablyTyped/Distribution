package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBitmapTypedValueFactory extends js.Object {
  def create(value: js.Any, `type`: winrtLib.WindowsNs.FoundationNs.PropertyType): BitmapTypedValue
}

object IBitmapTypedValueFactory {
  @scala.inline
  def apply(create: js.Function2[js.Any, winrtLib.WindowsNs.FoundationNs.PropertyType, BitmapTypedValue]): IBitmapTypedValueFactory = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[IBitmapTypedValueFactory]
  }
}

