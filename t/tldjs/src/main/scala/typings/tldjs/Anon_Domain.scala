package typings.tldjs

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: ReturnType[js.Function1[/* host */ String, String | Null]]
  var hostname: ReturnType[js.Function1[/* host */ String, String | Null]]
  var isIp: Boolean
  var isValid: ReturnType[js.Function1[/* host */ String, Boolean]]
  var publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]]
  var subdomain: ReturnType[js.Function1[/* host */ String, String | Null]]
  var tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: ReturnType[js.Function1[/* host */ String, String | Null]],
    hostname: ReturnType[js.Function1[/* host */ String, String | Null]],
    isIp: Boolean,
    isValid: ReturnType[js.Function1[/* host */ String, Boolean]],
    publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]],
    subdomain: ReturnType[js.Function1[/* host */ String, String | Null]],
    tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Domain]
  }
}

