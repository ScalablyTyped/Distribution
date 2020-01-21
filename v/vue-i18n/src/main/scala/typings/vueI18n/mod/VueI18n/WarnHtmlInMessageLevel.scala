package typings.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vueI18n.vueI18nStrings.off
  - typings.vueI18n.vueI18nStrings.warn
  - typings.vueI18n.vueI18nStrings.error
*/
trait WarnHtmlInMessageLevel extends js.Object

object WarnHtmlInMessageLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.vueI18n.vueI18nStrings.error = this.cast("error")
  @scala.inline
  def off: typings.vueI18n.vueI18nStrings.off = this.cast("off")
  @scala.inline
  def warn: typings.vueI18n.vueI18nStrings.warn = this.cast("warn")
}

