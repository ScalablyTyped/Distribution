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
    val __obj = js.Dynamic.literal(domain = domain, hostname = hostname, isIp = isIp, isValid = isValid, publicSuffix = publicSuffix, subdomain = subdomain, tldExists = tldExists)
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

