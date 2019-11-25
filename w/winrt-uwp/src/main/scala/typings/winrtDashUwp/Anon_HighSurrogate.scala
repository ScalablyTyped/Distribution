package typings.winrtDashUwp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighSurrogate extends js.Object {
  /** The high surrogate value returned. */ var highSurrogate: String
  /** The low surrogate value returned. */ var lowSurrogate: String
}

object Anon_HighSurrogate {
  @scala.inline
  def apply(highSurrogate: String, lowSurrogate: String): Anon_HighSurrogate = {
    val __obj = js.Dynamic.literal(highSurrogate = highSurrogate.asInstanceOf[js.Any], lowSurrogate = lowSurrogate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HighSurrogate]
  }
}

