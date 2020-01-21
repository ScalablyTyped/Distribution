package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirectorExecutive extends js.Object {
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

object AnonDirectorExecutive {
  @scala.inline
  def apply(
    director: js.UndefOr[Boolean] = js.undefined,
    executive: js.UndefOr[Boolean] = js.undefined,
    owner: js.UndefOr[Boolean] = js.undefined,
    representative: js.UndefOr[Boolean] = js.undefined
  ): AnonDirectorExecutive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(director)) __obj.updateDynamic("director")(director.asInstanceOf[js.Any])
    if (!js.isUndefined(executive)) __obj.updateDynamic("executive")(executive.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (!js.isUndefined(representative)) __obj.updateDynamic("representative")(representative.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirectorExecutive]
  }
}

