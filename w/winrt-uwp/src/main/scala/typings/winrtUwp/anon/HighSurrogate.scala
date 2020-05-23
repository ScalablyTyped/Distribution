package typings.winrtUwp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighSurrogate extends js.Object {
  /** The high surrogate value returned. */ var highSurrogate: String
  /** The low surrogate value returned. */ var lowSurrogate: String
}

object HighSurrogate {
  @scala.inline
  def apply(highSurrogate: String, lowSurrogate: String): HighSurrogate = {
    val __obj = js.Dynamic.literal(highSurrogate = highSurrogate.asInstanceOf[js.Any], lowSurrogate = lowSurrogate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighSurrogate]
  }
}

