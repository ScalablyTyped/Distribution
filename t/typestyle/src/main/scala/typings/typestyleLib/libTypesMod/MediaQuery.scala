package typings
package typestyleLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery extends js.Object {
  var maxHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var minWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var orientation: js.UndefOr[
    typestyleLib.typestyleLibStrings.landscape | typestyleLib.typestyleLibStrings.portrait
  ] = js.undefined
  var `type`: js.UndefOr[
    typestyleLib.typestyleLibStrings.screen | typestyleLib.typestyleLibStrings.print | typestyleLib.typestyleLibStrings.all
  ] = js.undefined
}

object MediaQuery {
  @scala.inline
  def apply(
    maxHeight: scala.Double | java.lang.String = null,
    maxWidth: scala.Double | java.lang.String = null,
    minHeight: scala.Double | java.lang.String = null,
    minWidth: scala.Double | java.lang.String = null,
    orientation: typestyleLib.typestyleLibStrings.landscape | typestyleLib.typestyleLibStrings.portrait = null,
    `type`: typestyleLib.typestyleLibStrings.screen | typestyleLib.typestyleLibStrings.print | typestyleLib.typestyleLibStrings.all = null
  ): MediaQuery = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQuery]
  }
}

