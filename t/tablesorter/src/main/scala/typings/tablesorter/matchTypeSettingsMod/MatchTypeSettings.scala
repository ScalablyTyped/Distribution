package typings.tablesorter.matchTypeSettingsMod

import typings.tablesorter.matchTypeMod.MatchType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchTypeSettings extends js.Object {
  /**
    * The match-type for `input`-controls.
    */
  var input: js.UndefOr[MatchType] = js.undefined
  /**
    * The match-type for `select`-controls.
    */
  var select: js.UndefOr[MatchType] = js.undefined
}

object MatchTypeSettings {
  @scala.inline
  def apply(input: MatchType = null, select: MatchType = null): MatchTypeSettings = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchTypeSettings]
  }
}

