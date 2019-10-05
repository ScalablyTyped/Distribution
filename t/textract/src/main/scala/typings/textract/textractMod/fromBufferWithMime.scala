package typings.textract.textractMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", "fromBufferWithMime")
@js.native
object fromBufferWithMime extends js.Object {
  def apply(
    mimeType: String,
    buffer: Buffer,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def apply(
    mimeType: String,
    buffer: Buffer,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
}

