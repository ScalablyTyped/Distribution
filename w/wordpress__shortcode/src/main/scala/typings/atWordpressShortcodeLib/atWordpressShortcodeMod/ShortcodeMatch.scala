package typings
package atWordpressShortcodeLib.atWordpressShortcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcodeMatch extends js.Object {
  var content: java.lang.String
  var index: scala.Double
  var shortcode: Shortcode
}

object ShortcodeMatch {
  @scala.inline
  def apply(content: java.lang.String, index: scala.Double, shortcode: Shortcode): ShortcodeMatch = {
    val __obj = js.Dynamic.literal(content = content, index = index, shortcode = shortcode)
  
    __obj.asInstanceOf[ShortcodeMatch]
  }
}

