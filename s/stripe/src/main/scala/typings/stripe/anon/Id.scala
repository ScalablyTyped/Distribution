package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  /**
    * ID of the API request that caused the event. If null, the event was
    * automatic (e.g., Stripe’s automatic subscription handling). Request logs
    * are available in the dashboard, but currently not in the API.
    */
  var id: String | Null = js.native
  /**
    * The idempotency key transmitted during the request, if any.
    * Note: This property is populated only for events on or after May 23, 2017.
    */
  var idempotency_key: js.UndefOr[String | Null] = js.native
}

object Id {
  @scala.inline
  def apply(): Id = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setIdempotency_key(value: String): Self = this.set("idempotency_key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotency_key: Self = this.set("idempotency_key", js.undefined)
    @scala.inline
    def setIdempotency_keyNull: Self = this.set("idempotency_key", null)
  }
  
}

