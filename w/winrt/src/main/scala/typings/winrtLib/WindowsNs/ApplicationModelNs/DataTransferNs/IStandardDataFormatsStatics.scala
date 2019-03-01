package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardDataFormatsStatics extends js.Object {
  var bitmap: java.lang.String
  var html: java.lang.String
  var rtf: java.lang.String
  var storageItems: java.lang.String
  var text: java.lang.String
  var uri: java.lang.String
}

object IStandardDataFormatsStatics {
  @scala.inline
  def apply(
    bitmap: java.lang.String,
    html: java.lang.String,
    rtf: java.lang.String,
    storageItems: java.lang.String,
    text: java.lang.String,
    uri: java.lang.String
  ): IStandardDataFormatsStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bitmap")(bitmap)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("rtf")(rtf)
    __obj.updateDynamic("storageItems")(storageItems)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[IStandardDataFormatsStatics]
  }
}

