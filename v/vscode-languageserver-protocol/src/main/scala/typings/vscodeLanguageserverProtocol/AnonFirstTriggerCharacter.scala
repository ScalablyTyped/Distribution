package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstTriggerCharacter extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonFirstTriggerCharacter {
  @scala.inline
  def apply(firstTriggerCharacter: String, moreTriggerCharacter: js.Array[String] = null): AnonFirstTriggerCharacter = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    if (moreTriggerCharacter != null) __obj.updateDynamic("moreTriggerCharacter")(moreTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirstTriggerCharacter]
  }
}

