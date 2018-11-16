package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_City extends js.Object {
  /**
               * City/Suburb/Town/Village
               */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
               * 2-letter country code
               */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Address line 1 (Street address/PO Box/Company name)
               */
  var line1: java.lang.String
  /**
               * Address line 2 (Apartment/Suite/Unit/Building)
               */
  var line2: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Zip/Postal Code
               */
  var postal_code: js.UndefOr[java.lang.String] = js.undefined
  /**
               * State/Province/County
               */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

