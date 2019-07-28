package typings.vuexDashI18n.vuexDashI18nMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nState extends js.Object {
  var fallback: String | Null
  var locale: String | Null
  var translations: StringDictionary[Translations]
}

object i18nState {
  @scala.inline
  def apply(translations: StringDictionary[Translations], fallback: String = null, locale: String = null): i18nState = {
    val __obj = js.Dynamic.literal(translations = translations)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[i18nState]
  }
}

