package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighSurrogate extends js.Object {
  /** The high surrogate value returned. */ var highSurrogate: java.lang.String
  /** The low surrogate value returned. */ var lowSurrogate: java.lang.String
}

object Anon_HighSurrogate {
  @scala.inline
  def apply(highSurrogate: java.lang.String, lowSurrogate: java.lang.String): Anon_HighSurrogate = {
    val __obj = js.Dynamic.literal(highSurrogate = highSurrogate, lowSurrogate = lowSurrogate)
  
    __obj.asInstanceOf[Anon_HighSurrogate]
  }
}

