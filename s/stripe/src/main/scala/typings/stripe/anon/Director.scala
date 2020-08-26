package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Director extends js.Object {
  /**
    * Whether the person is a director of the account’s legal entity. Currently only required for accounts in the EU.
    * Directors are typically members of the governing board of the company, or responsible for ensuring the
    * company meets its regulatory obligations.
    */
  var director: js.UndefOr[Boolean] = js.native
  /**
    * Whether the person has significant responsibility to control, manage, or direct the organization.
    */
  var executive: js.UndefOr[Boolean] = js.native
  /**
    * Whether the person is an owner of the account’s legal entity.
    */
  var owner: js.UndefOr[Boolean] = js.native
  /**
    * The percent owned by the person of the account’s legal entity.
    */
  var percent_ownership: js.UndefOr[Double] = js.native
  /**
    * Whether the person is authorized as the primary representative of the account.
    * This is the person nominated by the business to provide information about themselves,
    * and general information about the account. There can only be one representative at any given time.
    * At the time the account is created, this person should be set to the person responsible for opening the account.
    */
  var representative: js.UndefOr[Boolean] = js.native
  /**
    * The person’s title (e.g., CEO, Support Engineer).
    */
  var title: js.UndefOr[String] = js.native
}

object Director {
  @scala.inline
  def apply(): Director = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Director]
  }
  @scala.inline
  implicit class DirectorOps[Self <: Director] (val x: Self) extends AnyVal {
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
    def setDirector(value: Boolean): Self = this.set("director", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirector: Self = this.set("director", js.undefined)
    @scala.inline
    def setExecutive(value: Boolean): Self = this.set("executive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutive: Self = this.set("executive", js.undefined)
    @scala.inline
    def setOwner(value: Boolean): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setPercent_ownership(value: Double): Self = this.set("percent_ownership", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent_ownership: Self = this.set("percent_ownership", js.undefined)
    @scala.inline
    def setRepresentative(value: Boolean): Self = this.set("representative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepresentative: Self = this.set("representative", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

