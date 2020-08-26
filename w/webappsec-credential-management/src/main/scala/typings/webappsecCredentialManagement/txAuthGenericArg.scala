package typings.webappsecCredentialManagement

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type definitions for webauthn
// Spec: https://w3c.github.io/webauthn/
@js.native
trait txAuthGenericArg extends js.Object {
  var content: ArrayBuffer = js.native
  var contentType: String = js.native
}

object txAuthGenericArg {
  @scala.inline
  def apply(content: ArrayBuffer, contentType: String): txAuthGenericArg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[txAuthGenericArg]
  }
  @scala.inline
  implicit class txAuthGenericArgOps[Self <: txAuthGenericArg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: ArrayBuffer): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
  }
  
}

