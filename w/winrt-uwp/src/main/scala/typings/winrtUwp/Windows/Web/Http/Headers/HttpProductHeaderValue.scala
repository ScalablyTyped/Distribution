package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
trait HttpProductHeaderValue extends js.Object {
  /** Gets a token that represents the name of the product to be used in the User-Agent HTTP header. */
  var name: String
  /** Gets a token that represents the version of the product to be used in the User-Agent HTTP header. */
  var version: String
}

object HttpProductHeaderValue {
  @scala.inline
  def apply(name: String, version: String): HttpProductHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductHeaderValue]
  }
}

