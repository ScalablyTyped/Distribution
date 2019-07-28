package typings.vegaDashTypings.typesSpecScopeMod

import typings.vegaDashTypings.typesSpecAxisMod.Axis
import typings.vegaDashTypings.typesSpecDataMod.Data
import typings.vegaDashTypings.typesSpecLayoutMod.Layout
import typings.vegaDashTypings.typesSpecLegendMod.Legend
import typings.vegaDashTypings.typesSpecMarkMod.Mark
import typings.vegaDashTypings.typesSpecProjectionMod.Projection
import typings.vegaDashTypings.typesSpecScaleMod.Scale
import typings.vegaDashTypings.typesSpecSignalMod.Signal
import typings.vegaDashTypings.typesSpecTitleMod.Title
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
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (data != null) __obj.updateDynamic("data")(data)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (projections != null) __obj.updateDynamic("projections")(projections)
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (signals != null) __obj.updateDynamic("signals")(signals)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (usermeta != null) __obj.updateDynamic("usermeta")(usermeta)
    __obj.asInstanceOf[Scope]
  }
}

