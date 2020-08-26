package typings.stripe.mod.accounts

import typings.stripe.anon.Document
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonCreateUpdateOptions extends IPersonShared {
  /**
    * The person’s ID number, as appropriate for their country. For example, a social security number
    * in the U.S., social insurance number in Canada, etc. Instead of the number itself,
    * you can also provide a PII token provided by Stripe.js.
    */
  var id_number: js.UndefOr[String] = js.native
  /**
    * Set of key-value pairs that you can attach to an object.
    * This can be useful for storing additional information about the object in a structured format.
    * Individual keys can be unset by posting an empty value to them.
    * All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  /**
    * A person token, used to securely provide details to the person.
    */
  var person_token: js.UndefOr[String] = js.native
  /**
    * The last four digits of the person’s Social Security Number (U.S. only).
    */
  var ssn_last_4: js.UndefOr[String] = js.native
  /**
    * The person’s verification document information.
    */
  var verification: js.UndefOr[Document] = js.native
}

object IPersonCreateUpdateOptions {
  @scala.inline
  def apply(): IPersonCreateUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonCreateUpdateOptions]
  }
  @scala.inline
  implicit class IPersonCreateUpdateOptionsOps[Self <: IPersonCreateUpdateOptions] (val x: Self) extends AnyVal {
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
    def setId_number(value: String): Self = this.set("id_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_number: Self = this.set("id_number", js.undefined)
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setPerson_token(value: String): Self = this.set("person_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerson_token: Self = this.set("person_token", js.undefined)
    @scala.inline
    def setSsn_last_4(value: String): Self = this.set("ssn_last_4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsn_last_4: Self = this.set("ssn_last_4", js.undefined)
    @scala.inline
    def setVerification(value: Document): Self = this.set("verification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerification: Self = this.set("verification", js.undefined)
  }
  
}

