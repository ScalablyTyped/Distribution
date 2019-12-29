package typings.vegaDashTypings.typesSpecMarkMod

import typings.vegaDashTypings.typesSpecAxisMod.Axis
import typings.vegaDashTypings.typesSpecDataMod.Data
import typings.vegaDashTypings.typesSpecEncodeMod.ArcEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.AreaEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.Encode
import typings.vegaDashTypings.typesSpecEncodeMod.GroupEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.ImageEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.LineEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.PathEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.RectEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.RuleEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.ShapeEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.SymbolEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.TextEncodeEntry
import typings.vegaDashTypings.typesSpecEncodeMod.TrailEncodeEntry
import typings.vegaDashTypings.typesSpecLayoutMod.Layout
import typings.vegaDashTypings.typesSpecLegendMod.Legend
import typings.vegaDashTypings.typesSpecOnDashTriggerMod.OnMarkTrigger
import typings.vegaDashTypings.typesSpecProjectionMod.Projection
import typings.vegaDashTypings.typesSpecScaleMod.Scale
import typings.vegaDashTypings.typesSpecSignalMod.Signal
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import typings.vegaDashTypings.typesSpecTitleMod.Title
import typings.vegaDashTypings.typesSpecTransformMod.Transforms
import typings.vegaDashTypings.vegaDashTypingsStrings.arc
import typings.vegaDashTypings.vegaDashTypingsStrings.area
import typings.vegaDashTypings.vegaDashTypingsStrings.group
import typings.vegaDashTypings.vegaDashTypingsStrings.image
import typings.vegaDashTypings.vegaDashTypingsStrings.line
import typings.vegaDashTypings.vegaDashTypingsStrings.path
import typings.vegaDashTypings.vegaDashTypingsStrings.rect
import typings.vegaDashTypings.vegaDashTypingsStrings.rule
import typings.vegaDashTypings.vegaDashTypingsStrings.shape
import typings.vegaDashTypings.vegaDashTypingsStrings.symbol
import typings.vegaDashTypings.vegaDashTypingsStrings.text
import typings.vegaDashTypings.vegaDashTypingsStrings.trail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.typesSpecMarkMod.ArcMark
  - typings.vegaDashTypings.typesSpecMarkMod.AreaMark
  - typings.vegaDashTypings.typesSpecMarkMod.ImageMark
  - typings.vegaDashTypings.typesSpecMarkMod.GroupMark
  - typings.vegaDashTypings.typesSpecMarkMod.LineMark
  - typings.vegaDashTypings.typesSpecMarkMod.PathMark
  - typings.vegaDashTypings.typesSpecMarkMod.RectMark
  - typings.vegaDashTypings.typesSpecMarkMod.RuleMark
  - typings.vegaDashTypings.typesSpecMarkMod.ShapeMark
  - typings.vegaDashTypings.typesSpecMarkMod.SymbolMark
  - typings.vegaDashTypings.typesSpecMarkMod.TextMark
  - typings.vegaDashTypings.typesSpecMarkMod.TrailMark
*/
trait Mark extends js.Object

object Mark {
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
}

