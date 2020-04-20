package typings.winrt.Windows.Storage.FileProperties

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasicProperties extends js.Object {
  var dateModified: Date
  var itemDate: Date
  var size: Double
}

object IBasicProperties {
  @scala.inline
  def apply(dateModified: Date, itemDate: Date, size: Double): IBasicProperties = {
    val __obj = js.Dynamic.literal(dateModified = dateModified.asInstanceOf[js.Any], itemDate = itemDate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicProperties]
  }
}

