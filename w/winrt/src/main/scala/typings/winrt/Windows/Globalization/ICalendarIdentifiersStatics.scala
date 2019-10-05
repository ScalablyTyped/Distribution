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
    val __obj = js.Dynamic.literal(gregorian = gregorian, hebrew = hebrew, hijri = hijri, japanese = japanese, julian = julian, korean = korean, taiwan = taiwan, thai = thai, umAlQura = umAlQura)
  
    __obj.asInstanceOf[ICalendarIdentifiersStatics]
  }
}

