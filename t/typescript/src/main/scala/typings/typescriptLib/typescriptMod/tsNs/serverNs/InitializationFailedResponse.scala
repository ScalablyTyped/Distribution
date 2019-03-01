package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializationFailedResponse extends TypingInstallerResponse {
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed
  val message: java.lang.String
}

object InitializationFailedResponse {
  @scala.inline
  def apply(kind: EventInitializationFailed, message: java.lang.String): InitializationFailedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[InitializationFailedResponse]
  }
}

