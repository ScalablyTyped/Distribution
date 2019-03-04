package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Empty extends js.Object {
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Anon_Empty {
  @scala.inline
  def apply(
    value: java.lang.String,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    lang: java.lang.String = null
  ): Anon_Empty = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Anon_Empty]
  }
}

