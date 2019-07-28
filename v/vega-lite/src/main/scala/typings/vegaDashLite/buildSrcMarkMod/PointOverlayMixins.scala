package typings.vegaDashLite.buildSrcMarkMod

import typings.vegaDashLite.vegaDashLiteStrings.transparent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointOverlayMixins extends js.Object {
  /**
    * A flag for overlaying points on top of line or area marks, or an object defining the properties of the overlayed points.
    *
    * - If this property is `"transparent"`, transparent points will be used (for enhancing tooltips and selections).
    *
    * - If this property is an empty object (`{}`) or `true`, filled points with default properties will be used.
    *
    * - If this property is `false`, no points would be automatically added to line or area marks.
    *
    * __Default value:__ `false`.
    */
  var point: js.UndefOr[Boolean | OverlayMarkDef | transparent] = js.undefined
}

object PointOverlayMixins {
  @scala.inline
  def apply(point: Boolean | OverlayMarkDef | transparent = null): PointOverlayMixins = {
    val __obj = js.Dynamic.literal()
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointOverlayMixins]
  }
}

