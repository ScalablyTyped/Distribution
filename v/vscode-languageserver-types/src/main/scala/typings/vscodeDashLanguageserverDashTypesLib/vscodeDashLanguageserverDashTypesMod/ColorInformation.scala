package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorInformation extends js.Object {
  /**
    * The actual color value for this color range.
    */
  var color: Color
  /**
    * The range in the document where this color appers.
    */
  var range: Range
}

object ColorInformation {
  @scala.inline
  def apply(color: Color, range: Range): ColorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ColorInformation]
  }
}

