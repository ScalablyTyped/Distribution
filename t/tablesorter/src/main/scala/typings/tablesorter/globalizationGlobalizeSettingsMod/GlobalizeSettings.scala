package typings.tablesorter.globalizationGlobalizeSettingsMod

import typings.globalize.distGlobalizeMod.DateFormatterOptions
import typings.globalize.distGlobalizeMod.Globalize
import typings.globalize.globalizeStrings.full
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.medium
import typings.globalize.globalizeStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizeSettings extends DateFormatterOptions {
  /**
    * The `Globalize`-object to use for localization.
    */
  var Globalize: typings.globalize.distGlobalizeMod.Globalize
  /**
    * The language to localize the dates to.
    */
  var lang: String
}

object GlobalizeSettings {
  @scala.inline
  def apply(
    Globalize: Globalize,
    lang: String,
    date: full | long | medium | short = null,
    datetime: full | long | medium | short = null,
    raw: String = null,
    skeleton: String = null,
    time: full | long | medium | short = null,
    timeZone: String = null
  ): GlobalizeSettings = {
    val __obj = js.Dynamic.literal(Globalize = Globalize.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (skeleton != null) __obj.updateDynamic("skeleton")(skeleton.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizeSettings]
  }
}

