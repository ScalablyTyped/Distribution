package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated
  */
trait RecipientCards
  extends stripeLib.stripeMod.StripeNs.StripeResource {
  /**
    * @deprecated
    */
  def create(): scala.Unit
  // options: IDataOptions
  /**
    * @deprecated
    */
  def del(id: java.lang.String): scala.Unit
  /**
    * @deprecated
    */
  def list(): scala.Unit
  /**
    * @deprecated
    */
  def retrieve(id: java.lang.String): scala.Unit
  /**
    * @deprecated
    */
  def update(id: java.lang.String): scala.Unit
}

object RecipientCards {
  @scala.inline
  def apply(
    create: js.Function0[scala.Unit],
    del: js.Function1[java.lang.String, scala.Unit],
    list: js.Function0[scala.Unit],
    retrieve: js.Function1[java.lang.String, scala.Unit],
    update: js.Function1[java.lang.String, scala.Unit]
  ): RecipientCards = {
    val __obj = js.Dynamic.literal(create = create, del = del, list = list, retrieve = retrieve, update = update)
  
    __obj.asInstanceOf[RecipientCards]
  }
}

