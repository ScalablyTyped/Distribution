package typings.stripeV3.anon

import typings.stripeV3.stripeV3Strings.de
import typings.stripeV3.stripeV3Strings.en
import typings.stripeV3.stripeV3Strings.es
import typings.stripeV3.stripeV3Strings.fr
import typings.stripeV3.stripeV3Strings.it
import typings.stripeV3.stripeV3Strings.nl
import typings.stripeV3.stripeV3Strings.pl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Country extends js.Object {
  var country: String = js.native
  var preferred_language: js.UndefOr[de | en | es | it | fr | nl | pl] = js.native
}

object Country {
  @scala.inline
  def apply(country: String): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  @scala.inline
  implicit class CountryOps[Self <: Country] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferred_language(value: de | en | es | it | fr | nl | pl): Self = this.set("preferred_language", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred_language: Self = this.set("preferred_language", js.undefined)
  }
  
}

