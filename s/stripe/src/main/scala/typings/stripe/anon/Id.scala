package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  /**
    * ID of the API request that caused the event. If null, the event was
    * automatic (e.g., Stripe’s automatic subscription handling). Request logs
    * are available in the dashboard, but currently not in the API.
    */
  var id: String | Null
  /**
    * The idempotency key transmitted during the request, if any.
    * Note: This property is populated only for events on or after May 23, 2017.
    */
  var idempotency_key: js.UndefOr[String | Null] = js.undefined
}

object Id {
  @scala.inline
  def apply(id: String = null, idempotency_key: js.UndefOr[Null | String] = js.undefined): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotency_key)) __obj.updateDynamic("idempotency_key")(idempotency_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

