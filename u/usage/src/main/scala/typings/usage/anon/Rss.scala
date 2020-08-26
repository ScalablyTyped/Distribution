package typings.usage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rss extends js.Object {
  var rss: Double = js.native
  var vsize: Double = js.native
}

object Rss {
  @scala.inline
  def apply(rss: Double, vsize: Double): Rss = {
    val __obj = js.Dynamic.literal(rss = rss.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rss]
  }
  @scala.inline
  implicit class RssOps[Self <: Rss] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRss(value: Double): Self = this.set("rss", value.asInstanceOf[js.Any])
    @scala.inline
    def setVsize(value: Double): Self = this.set("vsize", value.asInstanceOf[js.Any])
  }
  
}

