package typings.winrtDashUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Length extends js.Object {
  /** The length in bytes of the HTTP content. */ var length: Double
  /** true if length is a valid length; otherwise, false. */ var returnValue: Boolean
}

object Anon_Length {
  @scala.inline
  def apply(length: Double, returnValue: Boolean): Anon_Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Length]
  }
}

