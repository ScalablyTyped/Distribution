package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locales
  extends /* language */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[LocaleMessages]] {
  var cn: js.UndefOr[LocaleMessages] = js.undefined
  var de: js.UndefOr[LocaleMessages] = js.undefined
  var en: js.UndefOr[LocaleMessages] = js.undefined
  var es: js.UndefOr[LocaleMessages] = js.undefined
  var it: js.UndefOr[LocaleMessages] = js.undefined
  var nl: js.UndefOr[LocaleMessages] = js.undefined
  var `pt-br`: js.UndefOr[LocaleMessages] = js.undefined
  var ru: js.UndefOr[LocaleMessages] = js.undefined
}

object Locales {
  @scala.inline
  def apply(
    StringDictionary: /* language */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[LocaleMessages]] = null,
    cn: LocaleMessages = null,
    de: LocaleMessages = null,
    en: LocaleMessages = null,
    es: LocaleMessages = null,
    it: LocaleMessages = null,
    nl: LocaleMessages = null,
    `pt-br`: LocaleMessages = null,
    ru: LocaleMessages = null
  ): Locales = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (cn != null) __obj.updateDynamic("cn")(cn)
    if (de != null) __obj.updateDynamic("de")(de)
    if (en != null) __obj.updateDynamic("en")(en)
    if (es != null) __obj.updateDynamic("es")(es)
    if (it != null) __obj.updateDynamic("it")(it)
    if (nl != null) __obj.updateDynamic("nl")(nl)
    if (`pt-br` != null) __obj.updateDynamic("pt-br")(`pt-br`)
    if (ru != null) __obj.updateDynamic("ru")(ru)
    __obj.asInstanceOf[Locales]
  }
}

