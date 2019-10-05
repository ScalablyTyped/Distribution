package typings.textract.textractMod

import typings.node.urlMod.URL
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", "fromUrl")
@js.native
object fromUrl extends js.Object {
  def apply(url: String, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(url: String, config: URLConfig, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(url: URL, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
  def apply(url: URL, config: URLConfig, callback: js.Function2[/* error */ Error, /* text */ String, Unit]): Unit = js.native
}

