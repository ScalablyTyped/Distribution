package typings
package vuexDashI18nLib.vuexDashI18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nState extends js.Object {
  var fallback: java.lang.String | scala.Null
  var locale: java.lang.String | scala.Null
  var translations: org.scalablytyped.runtime.StringDictionary[Translations]
}

object i18nState {
  @scala.inline
  def apply(
    translations: org.scalablytyped.runtime.StringDictionary[Translations],
    fallback: java.lang.String = null,
    locale: java.lang.String = null
  ): i18nState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("translations")(translations)
    if (fallback != null) __obj.updateDynamic("fallback")(fallback)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[i18nState]
  }
}

