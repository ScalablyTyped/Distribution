package typings.winrtUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  /** The length in bytes of the HTTP content. */ var length: Double
  /** true if length is a valid length; otherwise, false. */ var returnValue: Boolean
}

object AnonLength {
  @scala.inline
  def apply(length: Double, returnValue: Boolean): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

