package typings.tldjs

import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var domain: ReturnType[js.Function1[/* host */ String, String | Null]]
  var hostname: ReturnType[js.Function1[/* host */ String, String | Null]]
  var isIp: Boolean
  var isValid: ReturnType[js.Function1[/* host */ String, Boolean]]
  var publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]]
  var subdomain: ReturnType[js.Function1[/* host */ String, String | Null]]
  var tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
}

object AnonDomain {
  @scala.inline
  def apply(
    domain: ReturnType[js.Function1[/* host */ String, String | Null]],
    hostname: ReturnType[js.Function1[/* host */ String, String | Null]],
    isIp: Boolean,
    isValid: ReturnType[js.Function1[/* host */ String, Boolean]],
    publicSuffix: ReturnType[js.Function1[/* host */ String, String | Null]],
    subdomain: ReturnType[js.Function1[/* host */ String, String | Null]],
    tldExists: ReturnType[js.Function1[/* host */ String, Boolean]]
  ): AnonDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isIp = isIp.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], publicSuffix = publicSuffix.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tldExists = tldExists.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomain]
  }
}

