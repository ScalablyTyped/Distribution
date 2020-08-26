package typings.vegaTypings.streamMod

import typings.vegaTypings.exprMod.Expr
import typings.vegaTypings.marktypeMod.MarkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamParameters extends js.Object {
  var between: js.UndefOr[js.Array[Stream]] = js.native
  var consume: js.UndefOr[Boolean] = js.native
  var debounce: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[Expr | js.Array[Expr]] = js.native
  var markname: js.UndefOr[String] = js.native
  var marktype: js.UndefOr[MarkType] = js.native
  var throttle: js.UndefOr[Double] = js.native
}

object StreamParameters {
  @scala.inline
  def apply(): StreamParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamParameters]
  }
  @scala.inline
  implicit class StreamParametersOps[Self <: StreamParameters] (val x: Self) extends AnyVal {
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
    def setBetweenVarargs(value: Stream*): Self = this.set("between", js.Array(value :_*))
    @scala.inline
    def setBetween(value: js.Array[Stream]): Self = this.set("between", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetween: Self = this.set("between", js.undefined)
    @scala.inline
    def setConsume(value: Boolean): Self = this.set("consume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsume: Self = this.set("consume", js.undefined)
    @scala.inline
    def setDebounce(value: Double): Self = this.set("debounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setFilterVarargs(value: Expr*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilter(value: Expr | js.Array[Expr]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMarkname(value: String): Self = this.set("markname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkname: Self = this.set("markname", js.undefined)
    @scala.inline
    def setMarktype(value: MarkType): Self = this.set("marktype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarktype: Self = this.set("marktype", js.undefined)
    @scala.inline
    def setThrottle(value: Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
  
}

