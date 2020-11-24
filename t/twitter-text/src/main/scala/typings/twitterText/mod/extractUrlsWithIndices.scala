package typings.twitterText.mod

import typings.twitterText.anon.ExtractUrlsWithoutProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twitter-text", "extractUrlsWithIndices")
@js.native
object extractUrlsWithIndices extends js.Object {
  
  def apply(text: String): js.Array[UrlWithIndices] = js.native
  def apply(text: String, options: ExtractUrlsWithoutProtocol): js.Array[UrlWithIndices] = js.native
}
