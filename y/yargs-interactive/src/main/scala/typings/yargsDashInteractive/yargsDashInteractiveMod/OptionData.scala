package typings.yargsDashInteractive.yargsDashInteractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var default: js.UndefOr[String | Double | Boolean] = js.undefined
  var describe: String
  var options: js.UndefOr[js.Array[String]] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var `type`: String
}

object OptionData {
  @scala.inline
  def apply(
    describe: String,
    `type`: String,
    default: String | Double | Boolean = null,
    options: js.Array[String] = null,
    prompt: String = null
  ): OptionData = {
    val __obj = js.Dynamic.literal(describe = describe)
    __obj.updateDynamic("type")(`type`)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[OptionData]
  }
}

