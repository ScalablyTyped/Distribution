package typings.utif.utifMod

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
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IFD]
  }
}

