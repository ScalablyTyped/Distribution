package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicProperties extends js.Object {
  var dateModified: stdLib.Date
  var itemDate: stdLib.Date
  var size: scala.Double
}

object IBasicProperties {
  @scala.inline
  def apply(dateModified: stdLib.Date, itemDate: stdLib.Date, size: scala.Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified, itemDate = itemDate, size = size)
  
    __obj.asInstanceOf[IBasicProperties]
  }
}

