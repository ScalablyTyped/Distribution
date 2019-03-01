package typings
package stripeLib.stripeMod.StripeNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated
  */
trait Recipients
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

object Recipients {
  @scala.inline
  def apply(
    create: js.Function0[scala.Unit],
    del: js.Function1[java.lang.String, scala.Unit],
    list: js.Function0[scala.Unit],
    retrieve: js.Function1[java.lang.String, scala.Unit],
    update: js.Function1[java.lang.String, scala.Unit]
  ): Recipients = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("retrieve")(retrieve)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Recipients]
  }
}

