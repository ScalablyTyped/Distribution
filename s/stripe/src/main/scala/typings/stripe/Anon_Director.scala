package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Director extends js.Object {
  /**
    * Whether the person is a director of the account’s legal entity. Currently only required for accounts in the EU.
    * Directors are typically members of the governing board of the company, or responsible for ensuring the
    * company meets its regulatory obligations.
    */
  var director: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the person has significant responsibility to control, manage, or direct the organization.
    */
  var executive: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the person is an owner of the account’s legal entity.
    */
  var owner: js.UndefOr[Boolean] = js.undefined
  /**
    * The percent owned by the person of the account’s legal entity.
    */
  var percent_ownership: js.UndefOr[Double] = js.undefined
  /**
    * Whether the person is authorized as the primary representative of the account.
    * This is the person nominated by the business to provide information about themselves,
    * and general information about the account. There can only be one representative at any given time.
    * At the time the account is created, this person should be set to the person responsible for opening the account.
    */
  var representative: js.UndefOr[Boolean] = js.undefined
  /**
    * The person’s title (e.g., CEO, Support Engineer).
    */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Director {
  @scala.inline
  def apply(
    director: js.UndefOr[Boolean] = js.undefined,
    executive: js.UndefOr[Boolean] = js.undefined,
    owner: js.UndefOr[Boolean] = js.undefined,
    percent_ownership: Int | Double = null,
    representative: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Anon_Director = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(director)) __obj.updateDynamic("director")(director.asInstanceOf[js.Any])
    if (!js.isUndefined(executive)) __obj.updateDynamic("executive")(executive.asInstanceOf[js.Any])
    if (!js.isUndefined(owner)) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (percent_ownership != null) __obj.updateDynamic("percent_ownership")(percent_ownership.asInstanceOf[js.Any])
    if (!js.isUndefined(representative)) __obj.updateDynamic("representative")(representative.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Director]
  }
}

