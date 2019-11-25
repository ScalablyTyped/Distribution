package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureHelpOptions extends js.Object {
  /**
    * The characters that trigger signature help
    * automatically.
    */
  var triggerCharacters: js.UndefOr[js.Array[String]] = js.undefined
}

object SignatureHelpOptions {
  @scala.inline
  def apply(triggerCharacters: js.Array[String] = null): SignatureHelpOptions = {
    val __obj = js.Dynamic.literal()
    if (triggerCharacters != null) __obj.updateDynamic("triggerCharacters")(triggerCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpOptions]
  }
}

