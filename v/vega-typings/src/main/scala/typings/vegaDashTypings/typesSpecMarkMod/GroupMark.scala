package typings.vegaDashTypings.typesSpecMarkMod

import typings.vegaDashTypings.typesSpecAxisMod.Axis
import typings.vegaDashTypings.typesSpecDataMod.Data
import typings.vegaDashTypings.typesSpecEncodeMod.Encodable
import typings.vegaDashTypings.typesSpecEncodeMod.Encode
import typings.vegaDashTypings.typesSpecEncodeMod.GroupEncodeEntry
import typings.vegaDashTypings.typesSpecLayoutMod.Layout
import typings.vegaDashTypings.typesSpecLegendMod.Legend
import typings.vegaDashTypings.typesSpecOnDashTriggerMod.OnMarkTrigger
import typings.vegaDashTypings.typesSpecProjectionMod.Projection
import typings.vegaDashTypings.typesSpecScaleMod.Scale
import typings.vegaDashTypings.typesSpecScopeMod.Scope
import typings.vegaDashTypings.typesSpecSignalMod.Signal
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecTitleMod.Title
import typings.vegaDashTypings.typesSpecTransformMod.Transforms
import typings.vegaDashTypings.vegaDashTypingsStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMark
  extends BaseMark
     with Scope
     with Encodable[GroupEncodeEntry]
     with Mark {
  @JSName("from")
  var from_GroupMark: js.UndefOr[FromFacet] = js.undefined
  var `type`: group
}

object GroupMark {
  @scala.inline
  def apply(
    `type`: group,
    axes: js.Array[Axis] = null,
    clip: Clip = null,
    data: js.Array[Data] = null,
    description: String = null,
    encode: Encode[GroupEncodeEntry] = null,
    from: FromFacet = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    layout: Layout = null,
    legends: js.Array[Legend] = null,
    marks: js.Array[Mark] = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    projections: js.Array[Projection] = null,
    role: String = null,
    scales: js.Array[Scale] = null,
    signals: js.Array[Signal] = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    title: String | Title = null,
    transform: js.Array[Transforms] = null,
    usermeta: js.Object = null,
    zindex: Int | Double = null
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
    if (usermeta != null) __obj.updateDynamic("usermeta")(usermeta)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMark]
  }
}

