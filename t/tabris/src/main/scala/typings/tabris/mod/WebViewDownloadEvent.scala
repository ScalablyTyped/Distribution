package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebViewDownloadEvent[Target] extends EventObject[Target] {
  val contentDisposition: String = js.native
  val contentLength: Double = js.native
  val mimeType: String = js.native
  val url: String = js.native
}

