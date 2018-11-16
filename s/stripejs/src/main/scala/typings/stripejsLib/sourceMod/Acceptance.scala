package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Acceptance extends js.Object {
  /**
       * The unix timestamp the mandate was accepted or refused at by the customer.
       */
  var date: scala.Double
  /**
       * The unix timestamp the mandate was accepted or refused at by the customer.
       */
  var ip: java.lang.String
  /**
       * The status of the mandate acceptance
       */
  var status: stripejsLib.stripejsLibStrings.accepted | stripejsLib.stripejsLibStrings.refused
  /**
       * The user agent of the browser from which the mandate was accepted or refused by the customer
       * NOTE: This can be unset by updating the value to `null` and then saving
       */
  var user_agent: java.lang.String
}

