package typings.ultraDashStrftime.ultraDashStrftimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleFormats extends js.Object {
  /** equivalent to %m/%d/%y in en_US */
  var D: String
  /** equivalent to %Y-%m-%d in en_US */
  var F: String
  /** equivalent to %H:%M in en_US */
  var R: String
  /** equivalent to %H:%M:%S in en_US */
  var T: String
  /** equivalent to %D in en_US */
  var X: String
  /** equivalent to %a %b %d %X %Y %Z in en_US */
  var c: String
  /** equivalent to %I:%M:%S %p in en_US */
  var r: String
  /** equivalent to %e-%b-%Y in en_US */
  var v: String
  /** equivalent to %T in en_US */
  var x: String
}

object LocaleFormats {
  @scala.inline
  def apply(D: String, F: String, R: String, T: String, X: String, c: String, r: String, v: String, x: String): LocaleFormats = {
    val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], F = F.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocaleFormats]
  }
}

