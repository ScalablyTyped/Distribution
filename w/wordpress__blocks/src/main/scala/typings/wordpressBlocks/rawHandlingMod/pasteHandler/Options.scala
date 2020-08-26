package typings.wordpressBlocks.rawHandlingMod.pasteHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressBlocks.rawHandlingMod.pasteHandler.HTMLOptions
  - typings.wordpressBlocks.rawHandlingMod.pasteHandler.PlainTextOptions
*/
trait Options extends js.Object

object Options {
  @scala.inline
  def HTMLOptions(HTML: String): Options = {
    val __obj = js.Dynamic.literal(HTML = HTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  def PlainTextOptions(plainText: String): Options = {
    val __obj = js.Dynamic.literal(plainText = plainText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

