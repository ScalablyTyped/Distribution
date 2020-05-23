package typings.usage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rss extends js.Object {
  var rss: Double
  var vsize: Double
}

object Rss {
  @scala.inline
  def apply(rss: Double, vsize: Double): Rss = {
    val __obj = js.Dynamic.literal(rss = rss.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rss]
  }
}

