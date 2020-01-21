package typings.utif.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFD extends /* property */ StringDictionary[TiffTag | Double | Uint8Array] {
  var data: Uint8Array
  var height: Double
  var width: Double
}

object IFD {
  @scala.inline
  def apply(
    data: Uint8Array,
    height: Double,
    width: Double,
    StringDictionary: /* property */ StringDictionary[TiffTag | Double | Uint8Array] = null
  ): IFD = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IFD]
  }
}

