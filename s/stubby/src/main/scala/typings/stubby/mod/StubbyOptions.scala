package typings.stubby.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stubby.mod.StubbyWithKeyCertOptions
  - typings.stubby.mod.StubbyWithPfxOptions
*/
trait StubbyOptions extends js.Object

object StubbyOptions {
  @scala.inline
  def StubbyWithKeyCertOptions(
    cert: String | Buffer | (js.Array[String | Buffer]),
    key: String | Buffer | (js.Array[Buffer | js.Object])
  ): StubbyOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StubbyOptions]
  }
  @scala.inline
  def StubbyWithPfxOptions(): StubbyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StubbyOptions]
  }
}

