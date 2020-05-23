package typings.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formatter extends js.Object {
  def interpolate(message: String, values: js.UndefOr[Values], path: String): js.Array[_] | Null
}

object Formatter {
  @scala.inline
  def apply(interpolate: (String, js.UndefOr[Values], String) => js.Array[_] | Null): Formatter = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction3(interpolate))
    __obj.asInstanceOf[Formatter]
  }
}

