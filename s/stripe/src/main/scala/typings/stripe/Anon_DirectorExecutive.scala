package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DirectorExecutive extends js.Object {
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

object Anon_DirectorExecutive {
  @scala.inline
  def apply(
    director: js.UndefOr[Boolean] = js.undefined,
    executive: js.UndefOr[Boolean] = js.undefined,
    owner: js.UndefOr[Boolean] = js.undefined,
    representative: js.UndefOr[Boolean] = js.undefined
  ): Anon_DirectorExecutive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(director)) __obj.updateDynamic("director")(director)
    if (!js.isUndefined(executive)) __obj.updateDynamic("executive")(executive)
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner)
    if (!js.isUndefined(representative)) __obj.updateDynamic("representative")(representative)
    __obj.asInstanceOf[Anon_DirectorExecutive]
  }
}

