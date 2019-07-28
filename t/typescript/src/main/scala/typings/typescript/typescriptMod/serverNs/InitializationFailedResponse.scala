package typings.typescript.typescriptMod.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializationFailedResponse extends TypingInstallerResponse {
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed
  val message: String
}

object InitializationFailedResponse {
  @scala.inline
  def apply(kind: EventInitializationFailed, message: String): InitializationFailedResponse = {
    val __obj = js.Dynamic.literal(kind = kind, message = message)
  
    __obj.asInstanceOf[InitializationFailedResponse]
  }
}

