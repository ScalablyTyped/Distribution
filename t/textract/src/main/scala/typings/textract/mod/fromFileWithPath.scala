package typings.textract.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", "fromFileWithPath")
@js.native
object fromFileWithPath extends js.Object {
  def apply(filePath: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
}

