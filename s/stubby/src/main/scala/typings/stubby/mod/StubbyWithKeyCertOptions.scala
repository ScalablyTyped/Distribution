package typings.stubby.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StubbyWithKeyCertOptions
  extends StubbyCommonOptions
     with StubbyOptions {
   // tslint:disable-line:ban-types
  /** certificate file contents (in PEM format) */
  var cert: String | Buffer | (js.Array[String | Buffer]) = js.native
  /** keyfile contents (in PEM format) */
  var key: String | Buffer | (js.Array[Buffer | js.Object]) = js.native
}

object StubbyWithKeyCertOptions {
  @scala.inline
  def apply(
    cert: String | Buffer | (js.Array[String | Buffer]),
    key: String | Buffer | (js.Array[Buffer | js.Object])
  ): StubbyWithKeyCertOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyWithKeyCertOptions]
  }
  @scala.inline
  implicit class StubbyWithKeyCertOptionsOps[Self <: StubbyWithKeyCertOptions] (val x: Self) extends AnyVal {
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
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyVarargs(value: (Buffer | js.Object)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

