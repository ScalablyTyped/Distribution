package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twitter-text", "getTweetLength")
@js.native
object getTweetLength extends js.Object {
  
  def apply(text: String): Double = js.native
  def apply(text: String, options: TweetLengthOptions): Double = js.native
}
