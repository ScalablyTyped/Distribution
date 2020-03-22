package typings.vegaTypings.markMod

import typings.vegaTypings.axisMod.Axis
import typings.vegaTypings.dataMod.Data
import typings.vegaTypings.encodeMod.ArcEncodeEntry
import typings.vegaTypings.encodeMod.AreaEncodeEntry
import typings.vegaTypings.encodeMod.Encode
import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.ImageEncodeEntry
import typings.vegaTypings.encodeMod.LineEncodeEntry
import typings.vegaTypings.encodeMod.PathEncodeEntry
import typings.vegaTypings.encodeMod.RectEncodeEntry
import typings.vegaTypings.encodeMod.RuleEncodeEntry
import typings.vegaTypings.encodeMod.ShapeEncodeEntry
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.encodeMod.TrailEncodeEntry
import typings.vegaTypings.layoutMod.Layout
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.onTriggerMod.OnMarkTrigger
import typings.vegaTypings.projectionMod.Projection
import typings.vegaTypings.scaleMod.Scale
import typings.vegaTypings.signalMod.Signal
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.Title
import typings.vegaTypings.transformMod.Transforms
import typings.vegaTypings.vegaTypingsStrings.arc
import typings.vegaTypings.vegaTypingsStrings.area
import typings.vegaTypings.vegaTypingsStrings.group
import typings.vegaTypings.vegaTypingsStrings.image
import typings.vegaTypings.vegaTypingsStrings.line
import typings.vegaTypings.vegaTypingsStrings.path
import typings.vegaTypings.vegaTypingsStrings.rect
import typings.vegaTypings.vegaTypingsStrings.rule
import typings.vegaTypings.vegaTypingsStrings.shape
import typings.vegaTypings.vegaTypingsStrings.symbol
import typings.vegaTypings.vegaTypingsStrings.text
import typings.vegaTypings.vegaTypingsStrings.trail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.markMod.ArcMark
  - typings.vegaTypings.markMod.AreaMark
  - typings.vegaTypings.markMod.ImageMark
  - typings.vegaTypings.markMod.GroupMark
  - typings.vegaTypings.markMod.LineMark
  - typings.vegaTypings.markMod.PathMark
  - typings.vegaTypings.markMod.RectMark
  - typings.vegaTypings.markMod.RuleMark
  - typings.vegaTypings.markMod.ShapeMark
  - typings.vegaTypings.markMod.SymbolMark
  - typings.vegaTypings.markMod.TextMark
  - typings.vegaTypings.markMod.TrailMark
*/
trait Mark extends js.Object

object Mark {
  @scala.inline
  def TrailMark(
    `type`: trail,
    clip: Clip = null,
    description: String = null,
    encode: Encode[TrailEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def GroupMark(
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
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def RectMark(
    `type`: rect,
    clip: Clip = null,
    description: String = null,
    encode: Encode[RectEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def TextMark(
    `type`: text,
    clip: Clip = null,
    description: String = null,
    encode: Encode[TextEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def ImageMark(
    `type`: image,
    clip: Clip = null,
    description: String = null,
    encode: Encode[ImageEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def LineMark(
    `type`: line,
    clip: Clip = null,
    description: String = null,
    encode: Encode[LineEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def PathMark(
    `type`: path,
    clip: Clip = null,
    description: String = null,
    encode: Encode[PathEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def SymbolMark(
    `type`: symbol,
    clip: Clip = null,
    description: String = null,
    encode: Encode[SymbolEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def AreaMark(
    `type`: area,
    clip: Clip = null,
    description: String = null,
    encode: Encode[AreaEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def ArcMark(
    `type`: arc,
    clip: Clip = null,
    description: String = null,
    encode: Encode[ArcEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def RuleMark(
    `type`: rule,
    clip: Clip = null,
    description: String = null,
    encode: Encode[RuleEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
  @scala.inline
  def ShapeMark(
    `type`: shape,
    clip: Clip = null,
    description: String = null,
    encode: Encode[ShapeEncodeEntry] = null,
    from: From = null,
    interactive: Boolean | SignalRef = null,
    key: String = null,
    name: String = null,
    on: js.Array[OnMarkTrigger] = null,
    role: String = null,
    sort: Compare = null,
    style: String | js.Array[String] = null,
    transform: js.Array[Transforms] = null,
    zindex: Int | Double = null
  ): Mark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (interactive != null) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mark]
  }
}

