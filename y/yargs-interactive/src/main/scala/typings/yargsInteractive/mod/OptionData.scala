package typings.yargsInteractive.mod

import typings.yargsInteractive.yargsInteractiveStrings.`if-empty`
import typings.yargsInteractive.yargsInteractiveStrings.`if-no-arg`
import typings.yargsInteractive.yargsInteractiveStrings.always
import typings.yargsInteractive.yargsInteractiveStrings.checkbox
import typings.yargsInteractive.yargsInteractiveStrings.confirm
import typings.yargsInteractive.yargsInteractiveStrings.editor
import typings.yargsInteractive.yargsInteractiveStrings.expand
import typings.yargsInteractive.yargsInteractiveStrings.input
import typings.yargsInteractive.yargsInteractiveStrings.list
import typings.yargsInteractive.yargsInteractiveStrings.never
import typings.yargsInteractive.yargsInteractiveStrings.number
import typings.yargsInteractive.yargsInteractiveStrings.password
import typings.yargsInteractive.yargsInteractiveStrings.rawlist
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
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
}

