package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstTriggerCharacter extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: String
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_FirstTriggerCharacter {
  @scala.inline
  def apply(firstTriggerCharacter: String, moreTriggerCharacter: js.Array[String] = null): Anon_FirstTriggerCharacter = {
    val __obj = js.Dynamic.literal(firstTriggerCharacter = firstTriggerCharacter.asInstanceOf[js.Any])
    if (moreTriggerCharacter != null) __obj.updateDynamic("moreTriggerCharacter")(moreTriggerCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FirstTriggerCharacter]
  }
}

