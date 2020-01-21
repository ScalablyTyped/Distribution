package typings.vuexI18n.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Translations extends /* key */ StringDictionary[String | Translations]

object Translations {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[String | Translations] = null): Translations = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Translations]
  }
}

