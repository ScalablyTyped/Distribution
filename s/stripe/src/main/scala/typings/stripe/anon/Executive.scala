package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Executive extends js.Object {
  /**
    * A filter on the list of people returned based on whether these people are
    * directors of the account’s company.
    */
  var director: js.UndefOr[Boolean] = js.undefined
  /**
    * A filter on the list of people returned based on whether these people are
    * executives of the account’s company.
    */
  var executive: js.UndefOr[Boolean] = js.undefined
  /**
    * A filter on the list of people returned based on whether these people are
    * owners of the account’s company.
    */
  var owner: js.UndefOr[Boolean] = js.undefined
  /**
    * A filter on the list of people returned based on whether these people are
    * the representative of the account’s company.
    */
  var representative: js.UndefOr[Boolean] = js.undefined
}

object Executive {
  @scala.inline
  def apply(
    director: js.UndefOr[Boolean] = js.undefined,
    executive: js.UndefOr[Boolean] = js.undefined,
    owner: js.UndefOr[Boolean] = js.undefined,
    representative: js.UndefOr[Boolean] = js.undefined
  ): Executive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(director)) __obj.updateDynamic("director")(director.get.asInstanceOf[js.Any])
    if (!js.isUndefined(executive)) __obj.updateDynamic("executive")(executive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(representative)) __obj.updateDynamic("representative")(representative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executive]
  }
}

