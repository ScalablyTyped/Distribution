package typings.vueDashI18n.vueDashI18nMod.VueI18n

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleMessageObject
  extends /* key */ StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessage]
     with _LocaleMessage

object LocaleMessageObject {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[typings.vueDashI18n.vueDashI18nMod.VueI18n.LocaleMessage] = null
  ): LocaleMessageObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LocaleMessageObject]
  }
}

