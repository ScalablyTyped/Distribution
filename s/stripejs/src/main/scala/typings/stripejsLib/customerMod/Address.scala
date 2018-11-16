package typings
package stripejsLib.customerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Address extends js.Object {
  /**
       * City/District/Suburb/Town/Village.
       */
  var city: java.lang.String
  /**
       * Two-letter country code, capitalized
       * NOTE: The codes are specified by the ISO3166 alpha-2
       */
  var country: java.lang.String
  /**
       * Address line 1 (Street address/PO Box/Company name).
       */
  var line1: java.lang.String
  /**
       * Address line 2 (Apartment/Suite/Unit/Building).
       */
  var line2: java.lang.String
  /**
       * ZIP or postal code
       */
  var postal_code: java.lang.String
  /**
       * State/County/Province/Region.
       */
  var state: java.lang.String
}

