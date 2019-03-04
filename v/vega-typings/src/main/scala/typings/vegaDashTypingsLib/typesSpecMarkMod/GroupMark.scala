package typings
package vegaDashTypingsLib.typesSpecMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMark
  extends BaseMark
     with vegaDashTypingsLib.typesSpecScopeMod.Scope
     with vegaDashTypingsLib.typesSpecEncodeMod.Encodable[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry]
     with Mark {
  @JSName("from")
  var from_GroupMark: js.UndefOr[FromFacet] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.group
}

object GroupMark {
  @scala.inline
  def apply(
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.group,
    axes: js.Array[vegaDashTypingsLib.typesSpecAxisMod.Axis] = null,
    clip: Clip = null,
    data: js.Array[vegaDashTypingsLib.typesSpecDataMod.Data] = null,
    description: java.lang.String = null,
    encode: vegaDashTypingsLib.typesSpecEncodeMod.Encode[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry] = null,
    from: FromFacet = null,
    interactive: scala.Boolean | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    key: java.lang.String = null,
    layout: vegaDashTypingsLib.typesSpecLayoutMod.Layout = null,
    legends: js.Array[vegaDashTypingsLib.typesSpecLegendMod.Legend] = null,
    marks: js.Array[Mark] = null,
    name: java.lang.String = null,
    on: js.Array[vegaDashTypingsLib.typesSpecOnDashTriggerMod.OnMarkTrigger] = null,
    projections: js.Array[vegaDashTypingsLib.typesSpecProjectionMod.Projection] = null,
    role: java.lang.String = null,
    scales: js.Array[vegaDashTypingsLib.typesSpecScaleMod.Scale] = null,
    signals: js.Array[vegaDashTypingsLib.typesSpecSignalMod.Signal] = null,
    sort: Compare = null,
    style: java.lang.String | js.Array[java.lang.String] = null,
    title: java.lang.String | vegaDashTypingsLib.typesSpecTitleMod.Title = null,
    transform: js.Array[vegaDashTypingsLib.typesSpecTransformMod.Transforms] = null,
    zindex: scala.Int | scala.Double = null
  ): GroupMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (description != null) __obj.updateDynamic("description")(description)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (legends != null) __obj.updateDynamic("legends")(legends)
    if (marks != null) __obj.updateDynamic("marks")(marks)
    if (name != null) __obj.updateDynamic("name")(name)
    if (on != null) __obj.updateDynamic("on")(on)
    if (projections != null) __obj.updateDynamic("projections")(projections)
    if (role != null) __obj.updateDynamic("role")(role)
    if (scales != null) __obj.updateDynamic("scales")(scales)
    if (signals != null) __obj.updateDynamic("signals")(signals)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMark]
  }
}

