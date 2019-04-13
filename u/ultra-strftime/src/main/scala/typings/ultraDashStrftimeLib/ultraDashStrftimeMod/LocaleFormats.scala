package typings
package ultraDashStrftimeLib.ultraDashStrftimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleFormats extends js.Object {
  /** equivalent to %m/%d/%y in en_US */
  var D: java.lang.String
  /** equivalent to %Y-%m-%d in en_US */
  var F: java.lang.String
  /** equivalent to %H:%M in en_US */
  var R: java.lang.String
  /** equivalent to %H:%M:%S in en_US */
  var T: java.lang.String
  /** equivalent to %D in en_US */
  var X: java.lang.String
  /** equivalent to %a %b %d %X %Y %Z in en_US */
  var c: java.lang.String
  /** equivalent to %I:%M:%S %p in en_US */
  var r: java.lang.String
  /** equivalent to %e-%b-%Y in en_US */
  var v: java.lang.String
  /** equivalent to %T in en_US */
  var x: java.lang.String
}

object LocaleFormats {
  @scala.inline
  def apply(
    D: java.lang.String,
    F: java.lang.String,
    R: java.lang.String,
    T: java.lang.String,
    X: java.lang.String,
    c: java.lang.String,
    r: java.lang.String,
    v: java.lang.String,
    x: java.lang.String
  ): LocaleFormats = {
    val __obj = js.Dynamic.literal(D = D, F = F, R = R, T = T, X = X, c = c, r = r, v = v, x = x)
  
    __obj.asInstanceOf[LocaleFormats]
  }
}

