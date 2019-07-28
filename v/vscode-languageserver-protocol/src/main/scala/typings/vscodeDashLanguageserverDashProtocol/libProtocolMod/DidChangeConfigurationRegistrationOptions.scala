package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeConfigurationRegistrationOptions extends js.Object {
  var section: js.UndefOr[String | js.Array[String]] = js.undefined
}

object DidChangeConfigurationRegistrationOptions {
  @scala.inline
  def apply(section: String | js.Array[String] = null): DidChangeConfigurationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeConfigurationRegistrationOptions]
  }
}

