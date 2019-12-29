package typings.vueDashI18n.vueDashI18nMod.VueI18n

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleMessageArray
  extends /* index */ NumberDictionary[LocaleMessage]
     with _LocaleMessage

object LocaleMessageArray {
  @scala.inline
  def apply(NumberDictionary: /* index */ NumberDictionary[LocaleMessage] = null): LocaleMessageArray = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[LocaleMessageArray]
  }
}

