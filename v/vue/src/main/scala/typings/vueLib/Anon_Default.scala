package typings
package vueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var from: js.UndefOr[vueLib.typesOptionsMod.InjectKey] = js.undefined
}

object Anon_Default {
  @scala.inline
  def apply(default: js.Any = null, from: vueLib.typesOptionsMod.InjectKey = null): Anon_Default = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Default]
  }
}

