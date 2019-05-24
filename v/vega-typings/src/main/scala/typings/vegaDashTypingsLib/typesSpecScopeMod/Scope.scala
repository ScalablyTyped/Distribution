package typings
package vegaDashTypingsLib.typesSpecScopeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var axes: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecAxisMod.Axis]] = js.undefined
  var data: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecDataMod.Data]] = js.undefined
  var layout: js.UndefOr[vegaDashTypingsLib.typesSpecLayoutMod.Layout] = js.undefined
  var legends: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecLegendMod.Legend]] = js.undefined
  var marks: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecMarkMod.Mark]] = js.undefined
  var projections: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecProjectionMod.Projection]] = js.undefined
  var scales: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecScaleMod.Scale]] = js.undefined
  var signals: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecSignalMod.Signal]] = js.undefined
  var title: js.UndefOr[java.lang.String | vegaDashTypingsLib.typesSpecTitleMod.Title] = js.undefined
  var usermeta: js.UndefOr[js.Object] = js.undefined
}

object Scope {
  @scala.inline
  def apply(
    axes: js.Array[vegaDashTypingsLib.typesSpecAxisMod.Axis] = null,
    data: js.Array[vegaDashTypingsLib.typesSpecDataMod.Data] = null,
    layout: vegaDashTypingsLib.typesSpecLayoutMod.Layout = null,
    legends: js.Array[vegaDashTypingsLib.typesSpecLegendMod.Legend] = null,
    marks: js.Array[vegaDashTypingsLib.typesSpecMarkMod.Mark] = null,
    projections: js.Array[vegaDashTypingsLib.typesSpecProjectionMod.Projection] = null,
    scales: js.Array[vegaDashTypingsLib.typesSpecScaleMod.Scale] = null,
    signals: js.Array[vegaDashTypingsLib.typesSpecSignalMod.Signal] = null,
    title: java.lang.String | vegaDashTypingsLib.typesSpecTitleMod.Title = null,
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

