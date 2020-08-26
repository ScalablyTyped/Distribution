package typings.vegaTypings.scopeMod

import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.dataMod.Data
import typings.vegaTypings.layoutMod.Layout
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.markMod.Mark
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.scaleMod.Scale
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends js.Object {
  var axes: js.UndefOr[js.Array[Axis]] = js.native
  var data: js.UndefOr[js.Array[Data]] = js.native
  var layout: js.UndefOr[Layout] = js.native
  var legends: js.UndefOr[js.Array[Legend]] = js.native
  var marks: js.UndefOr[js.Array[Mark]] = js.native
  var projections: js.UndefOr[js.Array[Projection]] = js.native
  var scales: js.UndefOr[js.Array[Scale]] = js.native
  var signals: js.UndefOr[js.Array[Signal]] = js.native
  var title: js.UndefOr[String | Title] = js.native
  var usermeta: js.UndefOr[js.Object] = js.native
}

object Scope {
  @scala.inline
  def apply(): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
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
    def setAxesVarargs(value: Axis*): Self = this.set("axes", js.Array(value :_*))
    @scala.inline
    def setAxes(value: js.Array[Axis]): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setDataVarargs(value: Data*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLegendsVarargs(value: Legend*): Self = this.set("legends", js.Array(value :_*))
    @scala.inline
    def setLegends(value: js.Array[Legend]): Self = this.set("legends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegends: Self = this.set("legends", js.undefined)
    @scala.inline
    def setMarksVarargs(value: Mark*): Self = this.set("marks", js.Array(value :_*))
    @scala.inline
    def setMarks(value: js.Array[Mark]): Self = this.set("marks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    @scala.inline
    def setProjectionsVarargs(value: Projection*): Self = this.set("projections", js.Array(value :_*))
    @scala.inline
    def setProjections(value: js.Array[Projection]): Self = this.set("projections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjections: Self = this.set("projections", js.undefined)
    @scala.inline
    def setScalesVarargs(value: Scale*): Self = this.set("scales", js.Array(value :_*))
    @scala.inline
    def setScales(value: js.Array[Scale]): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setSignalsVarargs(value: Signal*): Self = this.set("signals", js.Array(value :_*))
    @scala.inline
    def setSignals(value: js.Array[Signal]): Self = this.set("signals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignals: Self = this.set("signals", js.undefined)
    @scala.inline
    def setTitle(value: String | Title): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUsermeta(value: js.Object): Self = this.set("usermeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsermeta: Self = this.set("usermeta", js.undefined)
  }
  
}

