package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorProvider extends js.Object {
  /**
    * Capabilities specific to the colorProvider
    */
  var colorProvider: js.UndefOr[AnonDynamicRegistration] = js.undefined
}

object AnonColorProvider {
  @scala.inline
  def apply(colorProvider: AnonDynamicRegistration = null): AnonColorProvider = {
    val __obj = js.Dynamic.literal()
    if (colorProvider != null) __obj.updateDynamic("colorProvider")(colorProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorProvider]
  }
}

