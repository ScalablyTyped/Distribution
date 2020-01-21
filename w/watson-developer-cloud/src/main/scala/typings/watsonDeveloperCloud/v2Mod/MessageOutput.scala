package typings.watsonDeveloperCloud.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Assistant output to be rendered or processed by the client. */
trait MessageOutput extends js.Object {
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.undefined
  /** Additional detailed information about a message response and how it was generated. */
  var debug: js.UndefOr[MessageOutputDebug] = js.undefined
  /** An array of entities identified in the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.undefined
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.undefined
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.undefined
  /** An object containing any custom properties included in the response. This object includes any arbitrary properties defined in the dialog JSON editor as part of the dialog node output. */
  var user_defined: js.UndefOr[js.Object] = js.undefined
}

object MessageOutput {
  @scala.inline
  def apply(
    actions: js.Array[DialogNodeAction] = null,
    debug: MessageOutputDebug = null,
    entities: js.Array[RuntimeEntity] = null,
    generic: js.Array[DialogRuntimeResponseGeneric] = null,
    intents: js.Array[RuntimeIntent] = null,
    user_defined: js.Object = null
  ): MessageOutput = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (generic != null) __obj.updateDynamic("generic")(generic.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (user_defined != null) __obj.updateDynamic("user_defined")(user_defined.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOutput]
  }
}

