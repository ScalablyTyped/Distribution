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
    create: () => scala.Unit,
    del: java.lang.String => scala.Unit,
    list: () => scala.Unit,
    retrieve: java.lang.String => scala.Unit,
    update: java.lang.String => scala.Unit
  ): RecipientCards = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create), del = js.Any.fromFunction1(del), list = js.Any.fromFunction0(list), retrieve = js.Any.fromFunction1(retrieve), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RecipientCards]
  }
}

