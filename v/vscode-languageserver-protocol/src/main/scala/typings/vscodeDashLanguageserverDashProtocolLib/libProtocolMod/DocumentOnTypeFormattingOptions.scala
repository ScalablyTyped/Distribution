package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentOnTypeFormattingOptions extends js.Object {
  /**
    * A character on which formatting should be triggered, like `}`.
    */
  var firstTriggerCharacter: java.lang.String
  /**
    * More trigger characters.
    */
  var moreTriggerCharacter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DocumentOnTypeFormattingOptions {
  @scala.inline
  def apply(firstTriggerCharacter: java.lang.String, moreTriggerCharacter: js.Array[java.lang.String] = null): DocumentOnTypeFormattingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstTriggerCharacter")(firstTriggerCharacter)
    if (moreTriggerCharacter != null) __obj.updateDynamic("moreTriggerCharacter")(moreTriggerCharacter)
    __obj.asInstanceOf[DocumentOnTypeFormattingOptions]
  }
}

