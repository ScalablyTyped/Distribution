package typings.atWordpressShortcode.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeMatch extends js.Object {
  var content: String
  var index: Double
  var shortcode: Shortcode
}

object ShortcodeMatch {
  @scala.inline
  def apply(content: String, index: Double, shortcode: Shortcode): ShortcodeMatch = {
    val __obj = js.Dynamic.literal(content = content, index = index, shortcode = shortcode)
  
    __obj.asInstanceOf[ShortcodeMatch]
  }
}

