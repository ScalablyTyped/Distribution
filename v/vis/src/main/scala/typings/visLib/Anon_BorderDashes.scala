package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderDashes extends js.Object {
  var borderDashes: scala.Boolean | js.Array[scala.Double]
   // only for borders
  var borderRadius: scala.Double
       // only for box shape
  var interpolation: scala.Boolean
    // only for image and circularImage shapes
  var useBorderWithImage: scala.Boolean
    // only for image and circularImage shapes
  var useImageSize: scala.Boolean
}

object Anon_BorderDashes {
  @scala.inline
  def apply(
    borderDashes: scala.Boolean | js.Array[scala.Double],
    borderRadius: scala.Double,
    interpolation: scala.Boolean,
    useBorderWithImage: scala.Boolean,
    useImageSize: scala.Boolean
  ): Anon_BorderDashes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("borderDashes")(borderDashes.asInstanceOf[js.Any])
    __obj.updateDynamic("borderRadius")(borderRadius)
    __obj.updateDynamic("interpolation")(interpolation)
    __obj.updateDynamic("useBorderWithImage")(useBorderWithImage)
    __obj.updateDynamic("useImageSize")(useImageSize)
    __obj.asInstanceOf[Anon_BorderDashes]
  }
}

