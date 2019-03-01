package typings
package utifLib.utifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFD
  extends /* property */ org.scalablytyped.runtime.StringDictionary[TiffTag | scala.Double | stdLib.Uint8Array] {
  var data: stdLib.Uint8Array
  var height: scala.Double
  var width: scala.Double
}

object IFD {
  @scala.inline
  def apply(
    data: stdLib.Uint8Array,
    height: scala.Double,
    width: scala.Double,
    StringDictionary: /* property */ org.scalablytyped.runtime.StringDictionary[TiffTag | scala.Double | stdLib.Uint8Array] = null
  ): IFD = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IFD]
  }
}

