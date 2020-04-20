package typings.twit.mod.Twitter

import typings.twit.twitStrings.crop
import typings.twit.twitStrings.fit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var h: Double
  var resize: crop | fit
  var w: Double
}

object Size {
  @scala.inline
  def apply(h: Double, resize: crop | fit, w: Double): Size = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

