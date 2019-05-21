package typings
package vuexDashI18nLib.vuexDashI18nMod.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$i18n")
  var $i18n: vuexDashI18nLib.vuexDashI18nMod.Ii18n = js.native
  @JSName("$t")
  def $t(key: java.lang.String): js.UndefOr[java.lang.String] = js.native
  @JSName("$t")
  def $t(key: java.lang.String, defaultValue: java.lang.String): js.UndefOr[java.lang.String] = js.native
  @JSName("$t")
  def $t(key: java.lang.String, defaultValue: java.lang.String, options: js.Any): js.UndefOr[java.lang.String] = js.native
  @JSName("$t")
  def $t(
    key: java.lang.String,
    defaultValue: java.lang.String,
    options: js.Any,
    pluralization: scala.Double
  ): js.UndefOr[java.lang.String] = js.native
  @JSName("$t")
  def $t(key: java.lang.String, options: js.Any): js.UndefOr[java.lang.String] = js.native
  @JSName("$t")
  def $t(key: java.lang.String, options: js.Any, pluralization: scala.Double): js.UndefOr[java.lang.String] = js.native
}

