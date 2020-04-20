package typings.winrtUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighSurrogate extends js.Object {
  /** The high surrogate value returned. */ var highSurrogate: String
  /** The low surrogate value returned. */ var lowSurrogate: String
}

object AnonHighSurrogate {
  @scala.inline
  def apply(highSurrogate: String, lowSurrogate: String): AnonHighSurrogate = {
    val __obj = js.Dynamic.literal(highSurrogate = highSurrogate.asInstanceOf[js.Any], lowSurrogate = lowSurrogate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighSurrogate]
  }
}

