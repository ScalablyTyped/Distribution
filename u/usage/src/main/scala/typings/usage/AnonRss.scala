package typings.usage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRss extends js.Object {
  var rss: Double
  var vsize: Double
}

object AnonRss {
  @scala.inline
  def apply(rss: Double, vsize: Double): AnonRss = {
    val __obj = js.Dynamic.literal(rss = rss.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRss]
  }
}

