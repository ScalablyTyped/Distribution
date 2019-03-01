package typings
package tldjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]]
  var hostname: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]]
  var isIp: scala.Boolean
  var isValid: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, scala.Boolean]]
  var publicSuffix: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]]
  var subdomain: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]]
  var tldExists: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, scala.Boolean]]
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]],
    hostname: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]],
    isIp: scala.Boolean,
    isValid: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, scala.Boolean]],
    publicSuffix: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]],
    subdomain: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, java.lang.String | scala.Null]],
    tldExists: stdLib.ReturnType[js.Function1[/* host */ java.lang.String, scala.Boolean]]
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("isIp")(isIp)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("publicSuffix")(publicSuffix)
    __obj.updateDynamic("subdomain")(subdomain)
    __obj.updateDynamic("tldExists")(tldExists)
    __obj.asInstanceOf[Anon_Domain]
  }
}

