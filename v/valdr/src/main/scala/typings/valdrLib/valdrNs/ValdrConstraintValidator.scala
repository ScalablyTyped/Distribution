package typings
package valdrLib.valdrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrConstraintValidator
  extends /* argumentName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var message: java.lang.String
}

object ValdrConstraintValidator {
  @scala.inline
  def apply(
    message: java.lang.String,
    StringDictionary: /* argumentName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ValdrConstraintValidator = {
    val __obj = js.Dynamic.literal(message = message)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValdrConstraintValidator]
  }
}

