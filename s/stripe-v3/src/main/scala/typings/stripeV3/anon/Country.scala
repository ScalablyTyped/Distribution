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

trait Country extends js.Object {
  var country: String
  var preferred_language: js.UndefOr[de | en | es | it | fr | nl | pl] = js.undefined
}

object Country {
  @scala.inline
  def apply(country: String, preferred_language: de | en | es | it | fr | nl | pl = null): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any])
    if (preferred_language != null) __obj.updateDynamic("preferred_language")(preferred_language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
}

