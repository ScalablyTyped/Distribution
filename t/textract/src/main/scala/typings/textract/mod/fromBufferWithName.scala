package typings.textract.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", "fromBufferWithName")
@js.native
object fromBufferWithName extends js.Object {
  def apply(name: String, buffer: Buffer, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(
    name: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
}

