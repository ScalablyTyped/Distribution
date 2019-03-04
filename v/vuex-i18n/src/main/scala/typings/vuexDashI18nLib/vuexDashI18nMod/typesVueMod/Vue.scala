package typings
package vuexDashI18nLib.vuexDashI18nMod.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$i18n")
  var $i18n: vuexDashI18nLib.vuexDashI18nMod.Ii18n
}

object Vue {
  @scala.inline
  def apply($i18n: vuexDashI18nLib.vuexDashI18nMod.Ii18n): Vue = {
    val __obj = js.Dynamic.literal($i18n = $i18n)
  
    __obj.asInstanceOf[Vue]
  }
}

