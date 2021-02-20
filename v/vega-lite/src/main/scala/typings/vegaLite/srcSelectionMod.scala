package typings.vegaLite

import typings.std.Record
import typings.vegaLite.channelMod.SingleDefUnitChannel
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.scaleMod._Domain
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.all
import typings.vegaLite.vegaLiteStrings.interval
import typings.vegaLite.vegaLiteStrings.multi
import typings.vegaLite.vegaLiteStrings.none
import typings.vegaLite.vegaLiteStrings.scales
import typings.vegaLite.vegaLiteStrings.single
import typings.vegaTypings.bindMod.Binding
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.configMod.Cursor
import typings.vegaTypings.streamMod.Stream
import typings.vegaTypings.utilMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSelectionMod {
  
  @JSImport("vega-lite/build/src/selection", "SELECTION_ID")
  @js.native
  val SELECTION_ID: /* "_vgsid_" */ String = js.native
  
  @JSImport("vega-lite/build/src/selection", "defaultConfig")
  @js.native
  val defaultConfig: SelectionConfig = js.native
  
  @JSImport("vega-lite/build/src/selection", "isLegendBinding")
  @js.native
  def isLegendBinding(bind: js.Any): /* is vega-lite.vega-lite/build/src/selection.LegendBinding */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/selection", "isLegendStreamBinding")
  @js.native
  def isLegendStreamBinding(bind: js.Any): /* is vega-lite.vega-lite/build/src/selection.LegendStreamBinding */ Boolean = js.native
  
  @js.native
  trait BaseSelectionConfig extends StObject {
    
    /**
      * Clears the selection, emptying it of all values. Can be a
      * [Event Stream](https://vega.github.io/vega/docs/event-streams/) or `false` to disable.
      *
      * __Default value:__ `dblclick`.
      *
      * __See also:__ [`clear`](https://vega.github.io/vega-lite/docs/clear.html) documentation.
      */
    var clear: js.UndefOr[Stream | String | Boolean] = js.native
    
    /**
      * By default, `all` data values are considered to lie within an empty selection.
      * When set to `none`, empty selections contain no data values.
      */
    var empty: js.UndefOr[all | none] = js.native
    
    /**
      * An array of encoding channels. The corresponding data field values
      * must match for a data tuple to fall within the selection.
      *
      * __See also:__ [`encodings`](https://vega.github.io/vega-lite/docs/project.html) documentation.
      */
    var encodings: js.UndefOr[js.Array[SingleDefUnitChannel]] = js.native
    
    /**
      * An array of field names whose values must match for a data tuple to
      * fall within the selection.
      *
      * __See also:__ [`fields`](https://vega.github.io/vega-lite/docs/project.html) documentation.
      */
    var fields: js.UndefOr[js.Array[FieldName]] = js.native
    
    /**
      * A [Vega event stream](https://vega.github.io/vega/docs/event-streams/) (object or selector) that triggers the selection.
      * For interval selections, the event stream must specify a [start and end](https://vega.github.io/vega/docs/event-streams/#between-filters).
      */
    var on: js.UndefOr[Stream | String] = js.native
    
    /**
      * With layered and multi-view displays, a strategy that determines how
      * selections' data queries are resolved when applied in a filter transform,
      * conditional encoding rule, or scale domain.
      *
      * __See also:__ [`resolve`](https://vega.github.io/vega-lite/docs/selection-resolve.html) documentation.
      */
    var resolve: js.UndefOr[SelectionResolution] = js.native
  }
  object BaseSelectionConfig {
    
    @scala.inline
    def apply(): BaseSelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseSelectionConfig]
    }
    
    @scala.inline
    implicit class BaseSelectionConfigMutableBuilder[Self <: BaseSelectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: Stream | String | Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      @scala.inline
      def setEmpty(value: all | none): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setEncodings(value: js.Array[SingleDefUnitChannel]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingsUndefined: Self = StObject.set(x, "encodings", js.undefined)
      
      @scala.inline
      def setEncodingsVarargs(value: SingleDefUnitChannel*): Self = StObject.set(x, "encodings", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: js.Array[FieldName]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: FieldName*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setOn(value: Stream | String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setResolve(value: SelectionResolution): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  @js.native
  trait BaseSelectionDef[T /* <: single | multi | interval */] extends StObject {
    
    /**
      * Determines the default event processing and data query for the selection. Vega-Lite currently supports three selection types:
      *
      * - `"single"` -- to select a single discrete data value on `click`.
      * - `"multi"` -- to select multiple discrete data value; the first value is selected on `click` and additional values toggled on shift-`click`.
      * - `"interval"` -- to select a continuous range of data values on `drag`.
      */
    var `type`: T = js.native
  }
  object BaseSelectionDef {
    
    @scala.inline
    def apply[T /* <: single | multi | interval */](`type`: T): BaseSelectionDef[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseSelectionDef[T]]
    }
    
    @scala.inline
    implicit class BaseSelectionDefMutableBuilder[Self <: BaseSelectionDef[_], T /* <: single | multi | interval */] (val x: Self with BaseSelectionDef[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BrushConfig extends StObject {
    
    /**
      * The mouse cursor used over the interval mark. Any valid [CSS cursor type](https://developer.mozilla.org/en-US/docs/Web/CSS/cursor#Values) can be used.
      */
    var cursor: js.UndefOr[Cursor] = js.native
    
    /**
      * The fill color of the interval mark.
      *
      * __Default value:__ `"#333333"`
      *
      */
    var fill: js.UndefOr[Color] = js.native
    
    /**
      * The fill opacity of the interval mark (a value between `0` and `1`).
      *
      * __Default value:__ `0.125`
      */
    var fillOpacity: js.UndefOr[Double] = js.native
    
    /**
      * The stroke color of the interval mark.
      *
      * __Default value:__ `"#ffffff"`
      */
    var stroke: js.UndefOr[Color] = js.native
    
    /**
      * An array of alternating stroke and space lengths, for creating dashed or dotted lines.
      */
    var strokeDash: js.UndefOr[js.Array[Double]] = js.native
    
    /**
      * The offset (in pixels) with which to begin drawing the stroke dash array.
      */
    var strokeDashOffset: js.UndefOr[Double] = js.native
    
    /**
      * The stroke opacity of the interval mark (a value between `0` and `1`).
      */
    var strokeOpacity: js.UndefOr[Double] = js.native
    
    /**
      * The stroke width of the interval mark.
      */
    var strokeWidth: js.UndefOr[Double] = js.native
  }
  object BrushConfig {
    
    @scala.inline
    def apply(): BrushConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrushConfig]
    }
    
    @scala.inline
    implicit class BrushConfigMutableBuilder[Self <: BrushConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursor(value: Cursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setFill(value: Color): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setStroke(value: Color): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDash(value: js.Array[Double]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashOffset(value: Double): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  @js.native
  trait IntervalSelection
    extends IntervalSelectionConfig
       with BaseSelectionDef[interval]
       with SelectionDef
  object IntervalSelection {
    
    @scala.inline
    def apply(`type`: interval): IntervalSelection = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalSelection]
    }
  }
  
  @js.native
  trait IntervalSelectionConfig extends BaseSelectionConfig {
    
    /**
      * Establishes a two-way binding between the interval selection and the scales
      * used within the same view. This allows a user to interactively pan and
      * zoom the view.
      *
      * __See also:__ [`bind`](https://vega.github.io/vega-lite/docs/bind.html) documentation.
      */
    var bind: js.UndefOr[scales] = js.native
    
    /**
      * Initialize the selection with a mapping between [projected channels or field names](https://vega.github.io/vega-lite/docs/project.html) and arrays of
      * initial values.
      *
      * __See also:__ [`init`](https://vega.github.io/vega-lite/docs/init.html) documentation.
      */
    var init: js.UndefOr[SelectionInitIntervalMapping] = js.native
    
    /**
      * An interval selection also adds a rectangle mark to depict the
      * extents of the interval. The `mark` property can be used to customize the
      * appearance of the mark.
      *
      * __See also:__ [`mark`](https://vega.github.io/vega-lite/docs/selection-mark.html) documentation.
      */
    var mark: js.UndefOr[BrushConfig] = js.native
    
    /**
      * When truthy, allows a user to interactively move an interval selection
      * back-and-forth. Can be `true`, `false` (to disable panning), or a
      * [Vega event stream definition](https://vega.github.io/vega/docs/event-streams/)
      * which must include a start and end event to trigger continuous panning.
      *
      * __Default value:__ `true`, which corresponds to
      * `[mousedown, window:mouseup] > window:mousemove!` which corresponds to
      * clicks and dragging within an interval selection to reposition it.
      *
      * __See also:__ [`translate`](https://vega.github.io/vega-lite/docs/translate.html) documentation.
      */
    var translate: js.UndefOr[String | Boolean] = js.native
    
    /**
      * When truthy, allows a user to interactively resize an interval selection.
      * Can be `true`, `false` (to disable zooming), or a [Vega event stream
      * definition](https://vega.github.io/vega/docs/event-streams/). Currently,
      * only `wheel` events are supported.
      *
      * __Default value:__ `true`, which corresponds to `wheel!`.
      *
      * __See also:__ [`zoom`](https://vega.github.io/vega-lite/docs/zoom.html) documentation.
      */
    var zoom: js.UndefOr[String | Boolean] = js.native
  }
  object IntervalSelectionConfig {
    
    @scala.inline
    def apply(): IntervalSelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntervalSelectionConfig]
    }
    
    @scala.inline
    implicit class IntervalSelectionConfigMutableBuilder[Self <: IntervalSelectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: scales): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setInit(value: SelectionInitIntervalMapping): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setMark(value: BrushConfig): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      @scala.inline
      def setTranslate(value: String | Boolean): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setZoom(value: String | Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.legend
    - typings.vegaLite.srcSelectionMod.LegendStreamBinding
  */
  trait LegendBinding extends StObject
  
  @js.native
  trait LegendStreamBinding extends LegendBinding {
    
    var legend: String | Stream = js.native
  }
  object LegendStreamBinding {
    
    @scala.inline
    def apply(legend: String | Stream): LegendStreamBinding = {
      val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendStreamBinding]
    }
    
    @scala.inline
    implicit class LegendStreamBindingMutableBuilder[Self <: LegendStreamBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLegend(value: String | Stream): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiSelection
    extends MultiSelectionConfig
       with BaseSelectionDef[multi]
       with SelectionDef
  object MultiSelection {
    
    @scala.inline
    def apply(`type`: multi): MultiSelection = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelection]
    }
  }
  
  @js.native
  trait MultiSelectionConfig extends BaseSelectionConfig {
    
    /**
      * When set, a selection is populated by interacting with the corresponding legend. Direct manipulation interaction is disabled by default;
      * to re-enable it, set the selection's [`on`](https://vega.github.io/vega-lite/docs/selection.html#common-selection-properties) property.
      *
      * Legend bindings are restricted to selections that only specify a single field or encoding.
      */
    var bind: js.UndefOr[LegendBinding] = js.native
    
    /**
      * Initialize the selection with a mapping between [projected channels or field names](https://vega.github.io/vega-lite/docs/project.html) and an initial
      * value (or array of values).
      *
      * __See also:__ [`init`](https://vega.github.io/vega-lite/docs/init.html) documentation.
      */
    var init: js.UndefOr[js.Array[SelectionInitMapping]] = js.native
    
    /**
      * When true, an invisible voronoi diagram is computed to accelerate discrete
      * selection. The data value _nearest_ the mouse cursor is added to the selection.
      *
      * __See also:__ [`nearest`](https://vega.github.io/vega-lite/docs/nearest.html) documentation.
      */
    var nearest: js.UndefOr[Boolean] = js.native
    
    /**
      * Controls whether data values should be toggled or only ever inserted into
      * multi selections. Can be `true`, `false` (for insertion only), or a
      * [Vega expression](https://vega.github.io/vega/docs/expressions/).
      *
      * __Default value:__ `true`, which corresponds to `event.shiftKey` (i.e.,
      * data values are toggled when a user interacts with the shift-key pressed).
      *
      * Setting the value to the Vega expression `"true"` will toggle data values
      * without the user pressing the shift-key.
      *
      * __See also:__ [`toggle`](https://vega.github.io/vega-lite/docs/toggle.html) documentation.
      */
    var toggle: js.UndefOr[String | Boolean] = js.native
  }
  object MultiSelectionConfig {
    
    @scala.inline
    def apply(): MultiSelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectionConfig]
    }
    
    @scala.inline
    implicit class MultiSelectionConfigMutableBuilder[Self <: MultiSelectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: LegendBinding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setInit(value: js.Array[SelectionInitMapping]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setInitVarargs(value: SelectionInitMapping*): Self = StObject.set(x, "init", js.Array(value :_*))
      
      @scala.inline
      def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
      
      @scala.inline
      def setToggle(value: String | Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
  
  @js.native
  trait SelectionConfig extends StObject {
    
    /**
      * The default definition for an [`interval`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All properties and transformations
      * for an interval selection definition (except `type`) may be specified here.
      *
      * For instance, setting `interval` to `{"translate": false}` disables the ability to move
      * interval selections by default.
      */
    var interval: js.UndefOr[IntervalSelectionConfig] = js.native
    
    /**
      * The default definition for a [`multi`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All properties and transformations
      * for a multi selection definition (except `type`) may be specified here.
      *
      * For instance, setting `multi` to `{"toggle": "event.altKey"}` adds additional values to
      * multi selections when clicking with the alt-key pressed by default.
      */
    var multi: js.UndefOr[MultiSelectionConfig] = js.native
    
    /**
      * The default definition for a [`single`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All properties and transformations
      *  for a single selection definition (except `type`) may be specified here.
      *
      * For instance, setting `single` to `{"on": "dblclick"}` populates single selections on double-click by default.
      */
    var single: js.UndefOr[SingleSelectionConfig] = js.native
  }
  object SelectionConfig {
    
    @scala.inline
    def apply(): SelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionConfig]
    }
    
    @scala.inline
    implicit class SelectionConfigMutableBuilder[Self <: SelectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: IntervalSelectionConfig): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMulti(value: MultiSelectionConfig): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setSingle(value: SingleSelectionConfig): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.srcSelectionMod.SingleSelection
    - typings.vegaLite.srcSelectionMod.MultiSelection
    - typings.vegaLite.srcSelectionMod.IntervalSelection
  */
  trait SelectionDef extends StObject
  object SelectionDef {
    
    @scala.inline
    def IntervalSelection(`type`: interval): typings.vegaLite.srcSelectionMod.IntervalSelection = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.srcSelectionMod.IntervalSelection]
    }
    
    @scala.inline
    def MultiSelection(`type`: multi): typings.vegaLite.srcSelectionMod.MultiSelection = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.srcSelectionMod.MultiSelection]
    }
    
    @scala.inline
    def SingleSelection(`type`: single): typings.vegaLite.srcSelectionMod.SingleSelection = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.srcSelectionMod.SingleSelection]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.anon.FieldSelection
    - typings.vegaLite.anon.EncodingSelection
  */
  trait SelectionExtent extends _Domain
  object SelectionExtent {
    
    @scala.inline
    def EncodingSelection(selection: String): typings.vegaLite.anon.EncodingSelection = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.EncodingSelection]
    }
    
    @scala.inline
    def FieldSelection(selection: String): typings.vegaLite.anon.FieldSelection = {
      val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaLite.anon.FieldSelection]
    }
  }
  
  type SelectionInit = PrimitiveValue | DateTime
  
  type SelectionInitInterval = Vector2[Boolean | DateTime | Double | String]
  
  type SelectionInitIntervalMapping = Dict[SelectionInitInterval]
  
  type SelectionInitMapping = Dict[SelectionInit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.global
    - typings.vegaLite.vegaLiteStrings.union
    - typings.vegaLite.vegaLiteStrings.intersect
  */
  trait SelectionResolution extends StObject
  object SelectionResolution {
    
    @scala.inline
    def global: typings.vegaLite.vegaLiteStrings.global = "global".asInstanceOf[typings.vegaLite.vegaLiteStrings.global]
    
    @scala.inline
    def intersect: typings.vegaLite.vegaLiteStrings.intersect = "intersect".asInstanceOf[typings.vegaLite.vegaLiteStrings.intersect]
    
    @scala.inline
    def union: typings.vegaLite.vegaLiteStrings.union = "union".asInstanceOf[typings.vegaLite.vegaLiteStrings.union]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.single
    - typings.vegaLite.vegaLiteStrings.multi
    - typings.vegaLite.vegaLiteStrings.interval
  */
  trait SelectionType extends StObject
  object SelectionType {
    
    @scala.inline
    def interval: typings.vegaLite.vegaLiteStrings.interval = "interval".asInstanceOf[typings.vegaLite.vegaLiteStrings.interval]
    
    @scala.inline
    def multi: typings.vegaLite.vegaLiteStrings.multi = "multi".asInstanceOf[typings.vegaLite.vegaLiteStrings.multi]
    
    @scala.inline
    def single: typings.vegaLite.vegaLiteStrings.single = "single".asInstanceOf[typings.vegaLite.vegaLiteStrings.single]
  }
  
  @js.native
  trait SingleSelection
    extends SingleSelectionConfig
       with BaseSelectionDef[single]
       with SelectionDef
  object SingleSelection {
    
    @scala.inline
    def apply(`type`: single): SingleSelection = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleSelection]
    }
  }
  
  @js.native
  trait SingleSelectionConfig extends BaseSelectionConfig {
    
    /**
      * When set, a selection is populated by input elements (also known as dynamic query widgets)
      * or by interacting with the corresponding legend. Direct manipulation interaction is disabled by default;
      * to re-enable it, set the selection's [`on`](https://vega.github.io/vega-lite/docs/selection.html#common-selection-properties) property.
      *
      * Legend bindings are restricted to selections that only specify a single field or encoding.
      *
      * Query widget binding takes the form of Vega's [input element binding definition](https://vega.github.io/vega/docs/signals/#bind)
      * or can be a mapping between projected field/encodings and binding definitions.
      *
      * __See also:__ [`bind`](https://vega.github.io/vega-lite/docs/bind.html) documentation.
      */
    var bind: js.UndefOr[Binding | (Record[String, Binding]) | LegendBinding] = js.native
    
    /**
      * Initialize the selection with a mapping between [projected channels or field names](https://vega.github.io/vega-lite/docs/project.html) and initial values.
      *
      * __See also:__ [`init`](https://vega.github.io/vega-lite/docs/init.html) documentation.
      */
    var init: js.UndefOr[SelectionInitMapping] = js.native
    
    /**
      * When true, an invisible voronoi diagram is computed to accelerate discrete
      * selection. The data value _nearest_ the mouse cursor is added to the selection.
      *
      * __See also:__ [`nearest`](https://vega.github.io/vega-lite/docs/nearest.html) documentation.
      */
    var nearest: js.UndefOr[Boolean] = js.native
  }
  object SingleSelectionConfig {
    
    @scala.inline
    def apply(): SingleSelectionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SingleSelectionConfig]
    }
    
    @scala.inline
    implicit class SingleSelectionConfigMutableBuilder[Self <: SingleSelectionConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: Binding | (Record[String, Binding]) | LegendBinding): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      @scala.inline
      def setInit(value: SelectionInitMapping): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      @scala.inline
      def setNearest(value: Boolean): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearestUndefined: Self = StObject.set(x, "nearest", js.undefined)
    }
  }
}
