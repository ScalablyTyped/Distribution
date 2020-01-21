package typings.wordpressShortcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeMatch extends js.Object {
  var content: String
  var index: Double
  var shortcode: Shortcode_
}

object ShortcodeMatch {
  @scala.inline
  def apply(content: String, index: Double, shortcode: Shortcode_): ShortcodeMatch = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], shortcode = shortcode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShortcodeMatch]
  }
}

