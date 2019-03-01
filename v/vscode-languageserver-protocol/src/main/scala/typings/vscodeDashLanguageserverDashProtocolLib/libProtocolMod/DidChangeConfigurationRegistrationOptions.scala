package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeConfigurationRegistrationOptions extends js.Object {
  var section: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object DidChangeConfigurationRegistrationOptions {
  @scala.inline
  def apply(section: java.lang.String | js.Array[java.lang.String] = null): DidChangeConfigurationRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    __obj.asInstanceOf[DidChangeConfigurationRegistrationOptions]
  }
}

