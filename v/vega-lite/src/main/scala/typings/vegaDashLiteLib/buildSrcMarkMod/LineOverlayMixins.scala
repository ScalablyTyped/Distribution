package typings
package vegaDashLiteLib.buildSrcMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOverlayMixins extends js.Object {
  /**
    * A flag for overlaying line on top of area marks, or an object defining the properties of the overlayed lines.
    *
    * - If this value is an empty object (`{}`) or `true`, lines with default properties will be used.
    *
    * - If this value is `false`, no lines would be automatically added to area marks.
    *
    * __Default value:__ `false`.
    */
  var line: js.UndefOr[scala.Boolean | OverlayMarkDef] = js.undefined
}

object LineOverlayMixins {
  @scala.inline
  def apply(line: scala.Boolean | OverlayMarkDef = null): LineOverlayMixins = {
    val __obj = js.Dynamic.literal()
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOverlayMixins]
  }
}

