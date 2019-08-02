package typings.yargsDashInteractive.yargsDashInteractiveMod

import typings.yargsDashInteractive.yargsDashInteractiveStrings.`if-empty`
import typings.yargsDashInteractive.yargsDashInteractiveStrings.`if-no-arg`
import typings.yargsDashInteractive.yargsDashInteractiveStrings.always
import typings.yargsDashInteractive.yargsDashInteractiveStrings.checkbox
import typings.yargsDashInteractive.yargsDashInteractiveStrings.confirm
import typings.yargsDashInteractive.yargsDashInteractiveStrings.editor
import typings.yargsDashInteractive.yargsDashInteractiveStrings.expand
import typings.yargsDashInteractive.yargsDashInteractiveStrings.input
import typings.yargsDashInteractive.yargsDashInteractiveStrings.list
import typings.yargsDashInteractive.yargsDashInteractiveStrings.never
import typings.yargsDashInteractive.yargsDashInteractiveStrings.number
import typings.yargsDashInteractive.yargsDashInteractiveStrings.password
import typings.yargsDashInteractive.yargsDashInteractiveStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var choices: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[String | Double | Boolean | js.Array[_]] = js.undefined
  var describe: String
  var prompt: js.UndefOr[always | never | `if-no-arg` | `if-empty`] = js.undefined
  var `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
}

object OptionData {
  @scala.inline
  def apply(
    describe: String,
    `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor,
    choices: js.Array[String] = null,
    default: String | Double | Boolean | js.Array[_] = null,
    prompt: always | never | `if-no-arg` | `if-empty` = null
  ): OptionData = {
    val __obj = js.Dynamic.literal(describe = describe)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
}

