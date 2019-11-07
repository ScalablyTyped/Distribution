package typings.timeago.Timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var allowFuture: Boolean
  var allowPast: Boolean
  var autoDispose: Boolean
  var cutoff: Double
  var localeTitle: Boolean
  var refreshMillis: Double
  var strings: LocalizedStrings
}

object Settings {
  @scala.inline
  def apply(
    allowFuture: Boolean,
    allowPast: Boolean,
    autoDispose: Boolean,
    cutoff: Double,
    localeTitle: Boolean,
    refreshMillis: Double,
    strings: LocalizedStrings
  ): Settings = {
    val __obj = js.Dynamic.literal(allowFuture = allowFuture, allowPast = allowPast, autoDispose = autoDispose, cutoff = cutoff, localeTitle = localeTitle, refreshMillis = refreshMillis, strings = strings)
  
    __obj.asInstanceOf[Settings]
  }
}

