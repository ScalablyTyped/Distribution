package typings.vegaTypings.markMod

import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.dataMod.Data
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.Encode
import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.layoutMod.Layout
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.onTriggerMod.OnMarkTrigger
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.scaleMod.Scale
import typings.vegaTypings.scopeMod.Scope
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.Title
import typings.vegaTypings.transformMod.Transforms
import typings.vegaTypings.vegaTypingsStrings.group
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
    aria: js.UndefOr[Boolean] = js.undefined,
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
    zindex: js.UndefOr[Double] = js.undefined
  ): GroupMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(aria)) __obj.updateDynamic("aria")(aria.get.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (projections != null) __obj.updateDynamic("projections")(projections.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (signals != null) __obj.updateDynamic("signals")(signals.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (usermeta != null) __obj.updateDynamic("usermeta")(usermeta.asInstanceOf[js.Any])
    if (!js.isUndefined(zindex)) __obj.updateDynamic("zindex")(zindex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMark]
  }
}

