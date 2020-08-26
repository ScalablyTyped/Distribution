package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICalendarIdentifiersStatics extends js.Object {
  var gregorian: String = js.native
  var hebrew: String = js.native
  var hijri: String = js.native
  var japanese: String = js.native
  var julian: String = js.native
  var korean: String = js.native
  var taiwan: String = js.native
  var thai: String = js.native
  var umAlQura: String = js.native
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
  @scala.inline
  implicit class ICalendarIdentifiersStaticsOps[Self <: ICalendarIdentifiersStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGregorian(value: String): Self = this.set("gregorian", value.asInstanceOf[js.Any])
    @scala.inline
    def setHebrew(value: String): Self = this.set("hebrew", value.asInstanceOf[js.Any])
    @scala.inline
    def setHijri(value: String): Self = this.set("hijri", value.asInstanceOf[js.Any])
    @scala.inline
    def setJapanese(value: String): Self = this.set("japanese", value.asInstanceOf[js.Any])
    @scala.inline
    def setJulian(value: String): Self = this.set("julian", value.asInstanceOf[js.Any])
    @scala.inline
    def setKorean(value: String): Self = this.set("korean", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaiwan(value: String): Self = this.set("taiwan", value.asInstanceOf[js.Any])
    @scala.inline
    def setThai(value: String): Self = this.set("thai", value.asInstanceOf[js.Any])
    @scala.inline
    def setUmAlQura(value: String): Self = this.set("umAlQura", value.asInstanceOf[js.Any])
  }
  
}

