package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodeVerification extends js.Object {
  /**
       * The number of attempts remaining to authenticate the
       * source object with a verification code
       */
  var attempts_remaining: scala.Double
  /**
       * The status of the code verification
       */
  var status: stripejsLib.stripejsLibStrings.pending | stripejsLib.stripejsLibStrings.attempts_remaining | stripejsLib.stripejsLibStrings.succeeded | stripejsLib.stripejsLibStrings.failed
}

