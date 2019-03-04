package typings
package yargsDashInteractiveLib.yargsDashInteractiveMod.yargsInteractiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var default: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
  var describe: java.lang.String
  var options: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object OptionData {
  @scala.inline
  def apply(
    describe: java.lang.String,
    `type`: java.lang.String,
    default: java.lang.String | scala.Double | scala.Boolean = null,
    options: js.Array[java.lang.String] = null,
    prompt: java.lang.String = null
  ): OptionData = {
    val __obj = js.Dynamic.literal(describe = describe)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[OptionData]
  }
}

