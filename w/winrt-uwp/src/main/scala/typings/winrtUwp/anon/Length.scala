package typings.winrtUwp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  /** The length in bytes of the HTTP content. */ var length: Double
  /** true if length is a valid length; otherwise, false. */ var returnValue: Boolean
}

object Length {
  @scala.inline
  def apply(length: Double, returnValue: Boolean): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

