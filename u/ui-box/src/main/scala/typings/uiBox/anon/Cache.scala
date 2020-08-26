package typings.uiBox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache extends js.Object {
  var cache: js.Array[js.Tuple2[String, String]] = js.native
  var styles: String = js.native
}

object Cache {
  @scala.inline
  def apply(cache: js.Array[js.Tuple2[String, String]], styles: String): Cache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cache]
  }
  @scala.inline
  implicit class CacheOps[Self <: Cache] (val x: Self) extends AnyVal {
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
    def setCacheVarargs(value: (js.Tuple2[String, String])*): Self = this.set("cache", js.Array(value :_*))
    @scala.inline
    def setCache(value: js.Array[js.Tuple2[String, String]]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyles(value: String): Self = this.set("styles", value.asInstanceOf[js.Any])
  }
  
}

