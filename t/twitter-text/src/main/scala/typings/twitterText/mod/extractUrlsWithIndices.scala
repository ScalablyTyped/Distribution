package typings.twitterText.mod

import typings.twitterText.AnonExtractUrlsWithoutProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-text", "extractUrlsWithIndices")
@js.native
object extractUrlsWithIndices extends js.Object {
  def apply(text: String): js.Array[UrlWithIndices] = js.native
  def apply(text: String, options: AnonExtractUrlsWithoutProtocol): js.Array[UrlWithIndices] = js.native
}

