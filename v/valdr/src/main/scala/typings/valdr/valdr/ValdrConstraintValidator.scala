package typings.valdr.valdr

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrConstraintValidator
  extends /* argumentName */ StringDictionary[js.Any] {
  var message: String
}

object ValdrConstraintValidator {
  @scala.inline
  def apply(message: String, StringDictionary: /* argumentName */ StringDictionary[js.Any] = null): ValdrConstraintValidator = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValdrConstraintValidator]
  }
}

