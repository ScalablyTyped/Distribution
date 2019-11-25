package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarIdentifiersStatics extends js.Object {
  var gregorian: String
  var hebrew: String
  var hijri: String
  var japanese: String
  var julian: String
  var korean: String
  var taiwan: String
  var thai: String
  var umAlQura: String
}

object ICalendarIdentifiersStatics {
  @scala.inline
  def apply(
    gregorian: String,
    hebrew: String,
    hijri: String,
    japanese: String,
    julian: String,
    korean: String,
    taiwan: String,
    thai: String,
    umAlQura: String
  ): ICalendarIdentifiersStatics = {
    val __obj = js.Dynamic.literal(gregorian = gregorian.asInstanceOf[js.Any], hebrew = hebrew.asInstanceOf[js.Any], hijri = hijri.asInstanceOf[js.Any], japanese = japanese.asInstanceOf[js.Any], julian = julian.asInstanceOf[js.Any], korean = korean.asInstanceOf[js.Any], taiwan = taiwan.asInstanceOf[js.Any], thai = thai.asInstanceOf[js.Any], umAlQura = umAlQura.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICalendarIdentifiersStatics]
  }
}

