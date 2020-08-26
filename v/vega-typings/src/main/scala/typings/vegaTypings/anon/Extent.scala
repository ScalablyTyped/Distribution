package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod._RangeScheme
import typings.vegaTypings.schemeMod.ColorScheme
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extent extends _RangeScheme {
  var count: js.UndefOr[Double | SignalRef] = js.native
  var extent: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  var scheme: String | js.Array[String] | SignalRef | ColorScheme = js.native
}

object Extent {
  @scala.inline
  def apply(scheme: String | js.Array[String] | SignalRef | ColorScheme): Extent = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extent]
  }
  @scala.inline
  implicit class ExtentOps[Self <: Extent] (val x: Self) extends AnyVal {
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
    def setSchemeVarargs(value: String*): Self = this.set("scheme", js.Array(value :_*))
    @scala.inline
    def setScheme(value: String | js.Array[String] | SignalRef | ColorScheme): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double | SignalRef): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setExtentVarargs(value: (Double | SignalRef)*): Self = this.set("extent", js.Array(value :_*))
    @scala.inline
    def setExtent(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
  }
  
}

