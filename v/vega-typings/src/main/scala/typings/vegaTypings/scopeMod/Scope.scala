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

trait Scope extends js.Object {
  var axes: js.UndefOr[js.Array[Axis]] = js.undefined
  var data: js.UndefOr[js.Array[Data]] = js.undefined
  var layout: js.UndefOr[Layout] = js.undefined
  var legends: js.UndefOr[js.Array[Legend]] = js.undefined
  var marks: js.UndefOr[js.Array[Mark]] = js.undefined
  var projections: js.UndefOr[js.Array[Projection]] = js.undefined
  var scales: js.UndefOr[js.Array[Scale]] = js.undefined
  var signals: js.UndefOr[js.Array[Signal]] = js.undefined
  var title: js.UndefOr[String | Title] = js.undefined
  var usermeta: js.UndefOr[js.Object] = js.undefined
}

object Scope {
  @scala.inline
  def apply(
    axes: js.Array[Axis] = null,
    data: js.Array[Data] = null,
    layout: Layout = null,
    legends: js.Array[Legend] = null,
    marks: js.Array[Mark] = null,
    projections: js.Array[Projection] = null,
    scales: js.Array[Scale] = null,
    signals: js.Array[Signal] = null,
    title: String | Title = null,
    usermeta: js.Object = null
  ): Scope = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (projections != null) __obj.updateDynamic("projections")(projections.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (usermeta != null) __obj.updateDynamic("usermeta")(usermeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
}

