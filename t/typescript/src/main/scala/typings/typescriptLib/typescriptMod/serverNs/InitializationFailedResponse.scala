package typings
package typescriptLib.typescriptMod.serverNs

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
    val __obj = js.Dynamic.literal(kind = kind, message = message)
  
    __obj.asInstanceOf[InitializationFailedResponse]
  }
}

