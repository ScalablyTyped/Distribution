package typings.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prefetch extends js.Object {
  var prefetch: js.UndefOr[Boolean] = js.native
}

object Prefetch {
  @scala.inline
  def apply(): Prefetch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prefetch]
  }
  @scala.inline
  implicit class PrefetchOps[Self <: Prefetch] (val x: Self) extends AnyVal {
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
    def setPrefetch(value: Boolean): Self = this.set("prefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefetch: Self = this.set("prefetch", js.undefined)
  }
  
}

