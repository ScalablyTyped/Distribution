package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistration extends js.Object {
  /**
    * Whether document link supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
}

object Anon_DynamicRegistration {
  @scala.inline
  def apply(dynamicRegistration: js.UndefOr[Boolean] = js.undefined): Anon_DynamicRegistration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DynamicRegistration]
  }
}

