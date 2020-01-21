package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for webauthn
// Spec: https://w3c.github.io/webauthn/
trait txAuthGenericArg extends js.Object {
  var content: ArrayBuffer
  var contentType: String
}

object txAuthGenericArg {
  @scala.inline
  def apply(content: ArrayBuffer, contentType: String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[txAuthGenericArg]
  }
}

