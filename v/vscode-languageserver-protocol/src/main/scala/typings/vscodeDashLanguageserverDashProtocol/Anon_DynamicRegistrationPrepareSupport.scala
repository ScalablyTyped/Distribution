package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DynamicRegistrationPrepareSupport extends js.Object {
  /**
    * Whether rename supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  /**
    * Client supports testing for validity of rename operations
    * before execution.
    */
  var prepareSupport: js.UndefOr[Boolean] = js.undefined
}

object Anon_DynamicRegistrationPrepareSupport {
  @scala.inline
  def apply(
    dynamicRegistration: js.UndefOr[Boolean] = js.undefined,
    prepareSupport: js.UndefOr[Boolean] = js.undefined
  ): Anon_DynamicRegistrationPrepareSupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    if (!js.isUndefined(prepareSupport)) __obj.updateDynamic("prepareSupport")(prepareSupport)
    __obj.asInstanceOf[Anon_DynamicRegistrationPrepareSupport]
  }
}

