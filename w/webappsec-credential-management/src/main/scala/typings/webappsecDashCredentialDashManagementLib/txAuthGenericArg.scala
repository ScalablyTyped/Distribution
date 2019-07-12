package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for webauthn
// Spec: https://w3c.github.io/webauthn/
trait txAuthGenericArg extends js.Object {
  var content: stdLib.ArrayBuffer
  var contentType: java.lang.String
}

object txAuthGenericArg {
  @scala.inline
  def apply(content: stdLib.ArrayBuffer, contentType: java.lang.String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType)
  
    __obj.asInstanceOf[txAuthGenericArg]
  }
}

