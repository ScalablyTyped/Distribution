package typings.typestyle.libTypesMod

import typings.typestyle.typestyleStrings.all
import typings.typestyle.typestyleStrings.landscape
import typings.typestyle.typestyleStrings.portrait
import typings.typestyle.typestyleStrings.print
import typings.typestyle.typestyleStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQuery extends js.Object {
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var orientation: js.UndefOr[landscape | portrait] = js.undefined
  var `type`: js.UndefOr[screen | print | all] = js.undefined
}

object MediaQuery {
  @scala.inline
  def apply(
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    orientation: landscape | portrait = null,
    `type`: screen | print | all = null
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

