package typings.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalOptions extends js.Object {
  var excludeRoot: js.UndefOr[Boolean] = js.native
  var maxParallelLoad: js.UndefOr[Double] = js.native
  var order: js.UndefOr[TraversalOrder] = js.native
  var stopOnError: js.UndefOr[Boolean] = js.native
}

object TraversalOptions {
  @scala.inline
  def apply(): TraversalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraversalOptions]
  }
  @scala.inline
  implicit class TraversalOptionsOps[Self <: TraversalOptions] (val x: Self) extends AnyVal {
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
    def setExcludeRoot(value: Boolean): Self = this.set("excludeRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeRoot: Self = this.set("excludeRoot", js.undefined)
    @scala.inline
    def setMaxParallelLoad(value: Double): Self = this.set("maxParallelLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParallelLoad: Self = this.set("maxParallelLoad", js.undefined)
    @scala.inline
    def setOrder(value: TraversalOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setStopOnError(value: Boolean): Self = this.set("stopOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOnError: Self = this.set("stopOnError", js.undefined)
  }
  
}

