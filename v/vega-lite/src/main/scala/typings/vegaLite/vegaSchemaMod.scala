package typings.vegaLite

import org.scalablytyped.runtime.TopLevel
import typings.vegaLite.anon.ColumnFooter
import typings.vegaLite.anon.Datum
import typings.vegaLite.anon.Feature
import typings.vegaLite.anon.Signal
import typings.vegaLite.anon.VgValueRefteststringundef
import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.exprMod.ExprOrSignalRef
import typings.vegaLite.sortMod.SortOrder
import typings.vegaLite.vegaLiteNumbers.`1`
import typings.vegaLite.vegaLiteStrings.cornerRadius
import typings.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft
import typings.vegaLite.vegaLiteStrings.cornerRadiusBottomRight
import typings.vegaLite.vegaLiteStrings.cornerRadiusTopLeft
import typings.vegaLite.vegaLiteStrings.cornerRadiusTopRight
import typings.vegaLite.vegaLiteStrings.end
import typings.vegaLite.vegaLiteStrings.flush
import typings.vegaLite.vegaLiteStrings.full
import typings.vegaLite.vegaLiteStrings.joinaggregate
import typings.vegaLite.vegaLiteStrings.start
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.scaleMod.RangeBand
import typings.vegaTypings.scaleMod.RangeRaw
import typings.vegaTypings.scaleMod.RangeRawArray
import typings.vegaTypings.scaleMod.RangeScheme
import typings.vegaTypings.scaleMod.ScaleBins
import typings.vegaTypings.scaleMod.ScaleData
import typings.vegaTypings.scaleMod.ScaleDataRef
import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.ScaleInterpolate
import typings.vegaTypings.scaleMod.ScaleMultiDataRef
import typings.vegaTypings.scaleMod.ScaleMultiFieldsRef
import typings.vegaTypings.scaleMod.ScaleType
import typings.vegaTypings.scaleMod.SortField
import typings.vegaTypings.scaleMod.TimeInterval
import typings.vegaTypings.scaleMod.TimeIntervalStep
import typings.vegaTypings.scaleMod.UnionSortField
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.AggregateOp
import typings.vegaTypings.transformMod.GeoShapeTransform
import typings.vegaTypings.transformMod.Transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegaSchemaMod {
  
  @JSImport("vega-lite/build/src/vega.schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/vega.schema", "VG_CORNERRADIUS_CHANNELS")
  @js.native
  val VG_CORNERRADIUS_CHANNELS: js.Tuple5[
    cornerRadius, 
    cornerRadiusTopLeft, 
    cornerRadiusTopRight, 
    cornerRadiusBottomLeft, 
    cornerRadiusBottomRight
  ] = js.native
  
  @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_CONFIGS")
  @js.native
  val VG_MARK_CONFIGS: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 57 */ js.Any
  ] = js.native
  
  /* Inlined vega-lite.vega-lite/build/src/util.Flag<vega.vega.Mark['type']> */
  object VG_MARK_INDEX {
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.arc")
    @js.native
    def arc: `1` = js.native
    @scala.inline
    def arc_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arc")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.area")
    @js.native
    def area: `1` = js.native
    @scala.inline
    def area_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("area")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.group")
    @js.native
    def group: `1` = js.native
    @scala.inline
    def group_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("group")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.image")
    @js.native
    def image: `1` = js.native
    @scala.inline
    def image_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.line")
    @js.native
    def line: `1` = js.native
    @scala.inline
    def line_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("line")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.path")
    @js.native
    def path: `1` = js.native
    @scala.inline
    def path_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.rect")
    @js.native
    def rect: `1` = js.native
    @scala.inline
    def rect_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rect")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.rule")
    @js.native
    def rule: `1` = js.native
    @scala.inline
    def rule_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rule")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.shape")
    @js.native
    def shape: `1` = js.native
    @scala.inline
    def shape_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shape")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.symbol")
    @js.native
    def symbol: `1` = js.native
    @scala.inline
    def symbol_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbol")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.text")
    @js.native
    def text: `1` = js.native
    @scala.inline
    def text_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/vega.schema", "VG_MARK_INDEX.trail")
    @js.native
    def trail: `1` = js.native
    @scala.inline
    def trail_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trail")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def isDataRefDomain(domain: js.Any): /* is vega-lite.vega-lite/build/src/vega.schema.VgScaleDataRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataRefDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgScaleDataRefWithSort */ Boolean]
  @scala.inline
  def isDataRefDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgScaleDataRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataRefDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgScaleDataRefWithSort */ Boolean]
  
  @scala.inline
  def isDataRefUnionedDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgScaleMultiDataRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataRefUnionedDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgScaleMultiDataRefWithSort */ Boolean]
  
  @scala.inline
  def isFieldRefUnionDomain(domain: VgDomain): /* is vega-lite.vega-lite/build/src/vega.schema.VgMultiFieldsRefWithSort */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldRefUnionDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgMultiFieldsRefWithSort */ Boolean]
  
  @scala.inline
  def isSignalRef(o: js.Any): /* is vega-typings.vega-typings/types/spec/signal.SignalRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSignalRef")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/signal.SignalRef */ Boolean]
  
  @scala.inline
  def isVgRangeStep(range: VgRange): /* is vega-lite.vega-lite/build/src/vega.schema.VgRangeStep */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVgRangeStep")(range.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/vega.schema.VgRangeStep */ Boolean]
  
  type MapExcludeAndKeepSignalAs[T, E, S /* <: ExprOrSignalRef */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: vega-typings.vega-typings/types/spec/signal.SignalRef extends T[P]? std.Exclude<T[P], E> | S : std.Exclude<T[P], E>}
    */ typings.vegaLite.vegaLiteStrings.MapExcludeAndKeepSignalAs & TopLevel[js.Any]
  
  type MapExcludeValueRefAndReplaceSignalWith[T, S /* <: ExprOrSignalRef */] = MapExcludeAndKeepSignalAs[T, ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef, S]
  
  type MappedExclude[T, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: std.Exclude<T[P], E>}
    */ typings.vegaLite.vegaLiteStrings.MappedExclude & TopLevel[T]
  
  type MappedExcludeValueRef[T] = MappedExclude[T, ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]
  
  trait RowCol[T] extends StObject {
    
    var column: js.UndefOr[T] = js.undefined
    
    var row: js.UndefOr[T] = js.undefined
  }
  object RowCol {
    
    @scala.inline
    def apply[T](): RowCol[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowCol[T]]
    }
    
    @scala.inline
    implicit class RowColMutableBuilder[Self <: RowCol[?], T] (val x: Self & RowCol[T]) extends AnyVal {
      
      @scala.inline
      def setColumn(value: T): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setRow(value: T): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait VgComparator extends StObject {
    
    var field: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var order: js.UndefOr[SortOrder | js.Array[SortOrder]] = js.undefined
  }
  object VgComparator {
    
    @scala.inline
    def apply(): VgComparator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VgComparator]
    }
    
    @scala.inline
    implicit class VgComparatorMutableBuilder[Self <: VgComparator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String | js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setOrder(value: SortOrder | js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
    }
  }
  
  trait VgData extends StObject {
    
    var format: js.UndefOr[Feature] = js.undefined
    
    var name: String
    
    var source: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[js.Any] = js.undefined
  }
  object VgData {
    
    @scala.inline
    def apply(name: String): VgData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VgData]
    }
    
    @scala.inline
    implicit class VgDataMutableBuilder[Self <: VgData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type VgDomain = js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.x
    - typings.vegaLite.vegaLiteStrings.x2
    - typings.vegaLite.vegaLiteStrings.xc
    - typings.vegaLite.vegaLiteStrings.width
    - typings.vegaLite.vegaLiteStrings.y
    - typings.vegaLite.vegaLiteStrings.y2
    - typings.vegaLite.vegaLiteStrings.yc
    - typings.vegaLite.vegaLiteStrings.height
    - typings.vegaLite.vegaLiteStrings.opacity
    - typings.vegaLite.vegaLiteStrings.fill
    - typings.vegaLite.vegaLiteStrings.fillOpacity
    - typings.vegaLite.vegaLiteStrings.stroke
    - typings.vegaLite.vegaLiteStrings.strokeWidth
    - typings.vegaLite.vegaLiteStrings.strokeCap
    - typings.vegaLite.vegaLiteStrings.strokeOpacity
    - typings.vegaLite.vegaLiteStrings.strokeDash
    - typings.vegaLite.vegaLiteStrings.strokeDashOffset
    - typings.vegaLite.vegaLiteStrings.strokeMiterLimit
    - typings.vegaLite.vegaLiteStrings.strokeJoin
    - typings.vegaLite.vegaLiteStrings.strokeOffset
    - typings.vegaLite.vegaLiteStrings.strokeForeground
    - typings.vegaLite.vegaLiteStrings.cursor
    - typings.vegaLite.vegaLiteStrings.clip
    - typings.vegaLite.vegaLiteStrings.size
    - typings.vegaLite.vegaLiteStrings.shape
    - typings.vegaLite.vegaLiteStrings.path
    - typings.vegaLite.vegaLiteStrings.innerRadius
    - typings.vegaLite.vegaLiteStrings.outerRadius
    - typings.vegaLite.vegaLiteStrings.startAngle
    - typings.vegaLite.vegaLiteStrings.endAngle
    - typings.vegaLite.vegaLiteStrings.interpolate
    - typings.vegaLite.vegaLiteStrings.tension
    - typings.vegaLite.vegaLiteStrings.orient
    - typings.vegaLite.vegaLiteStrings.url
    - typings.vegaLite.vegaLiteStrings.align
    - typings.vegaLite.vegaLiteStrings.baseline
    - typings.vegaLite.vegaLiteStrings.text
    - typings.vegaLite.vegaLiteStrings.dir
    - typings.vegaLite.vegaLiteStrings.ellipsis
    - typings.vegaLite.vegaLiteStrings.limit
    - typings.vegaLite.vegaLiteStrings.dx
    - typings.vegaLite.vegaLiteStrings.dy
    - typings.vegaLite.vegaLiteStrings.radius
    - typings.vegaLite.vegaLiteStrings.theta
    - typings.vegaLite.vegaLiteStrings.angle
    - typings.vegaLite.vegaLiteStrings.font
    - typings.vegaLite.vegaLiteStrings.fontSize
    - typings.vegaLite.vegaLiteStrings.fontWeight
    - typings.vegaLite.vegaLiteStrings.fontStyle
    - typings.vegaLite.vegaLiteStrings.tooltip
    - typings.vegaLite.vegaLiteStrings.href
    - typings.vegaLite.vegaLiteStrings.defined
    - typings.vegaLite.vegaLiteStrings.cornerRadius
    - typings.vegaLite.vegaLiteStrings.cornerRadiusTopLeft
    - typings.vegaLite.vegaLiteStrings.cornerRadiusTopRight
    - typings.vegaLite.vegaLiteStrings.cornerRadiusBottomRight
    - typings.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft
    - typings.vegaLite.vegaLiteStrings.scaleX
    - typings.vegaLite.vegaLiteStrings.scaleY
  */
  trait VgEncodeChannel extends StObject
  object VgEncodeChannel {
    
    @scala.inline
    def align: typings.vegaLite.vegaLiteStrings.align = "align".asInstanceOf[typings.vegaLite.vegaLiteStrings.align]
    
    @scala.inline
    def angle: typings.vegaLite.vegaLiteStrings.angle = "angle".asInstanceOf[typings.vegaLite.vegaLiteStrings.angle]
    
    @scala.inline
    def baseline: typings.vegaLite.vegaLiteStrings.baseline = "baseline".asInstanceOf[typings.vegaLite.vegaLiteStrings.baseline]
    
    @scala.inline
    def clip: typings.vegaLite.vegaLiteStrings.clip = "clip".asInstanceOf[typings.vegaLite.vegaLiteStrings.clip]
    
    @scala.inline
    def cornerRadius: typings.vegaLite.vegaLiteStrings.cornerRadius = "cornerRadius".asInstanceOf[typings.vegaLite.vegaLiteStrings.cornerRadius]
    
    @scala.inline
    def cornerRadiusBottomLeft: typings.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft = "cornerRadiusBottomLeft".asInstanceOf[typings.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft]
    
    @scala.inline
    def cornerRadiusBottomRight: typings.vegaLite.vegaLiteStrings.cornerRadiusBottomRight = "cornerRadiusBottomRight".asInstanceOf[typings.vegaLite.vegaLiteStrings.cornerRadiusBottomRight]
    
    @scala.inline
    def cornerRadiusTopLeft: typings.vegaLite.vegaLiteStrings.cornerRadiusTopLeft = "cornerRadiusTopLeft".asInstanceOf[typings.vegaLite.vegaLiteStrings.cornerRadiusTopLeft]
    
    @scala.inline
    def cornerRadiusTopRight: typings.vegaLite.vegaLiteStrings.cornerRadiusTopRight = "cornerRadiusTopRight".asInstanceOf[typings.vegaLite.vegaLiteStrings.cornerRadiusTopRight]
    
    @scala.inline
    def cursor: typings.vegaLite.vegaLiteStrings.cursor = "cursor".asInstanceOf[typings.vegaLite.vegaLiteStrings.cursor]
    
    @scala.inline
    def defined: typings.vegaLite.vegaLiteStrings.defined = "defined".asInstanceOf[typings.vegaLite.vegaLiteStrings.defined]
    
    @scala.inline
    def dir: typings.vegaLite.vegaLiteStrings.dir = "dir".asInstanceOf[typings.vegaLite.vegaLiteStrings.dir]
    
    @scala.inline
    def dx: typings.vegaLite.vegaLiteStrings.dx = "dx".asInstanceOf[typings.vegaLite.vegaLiteStrings.dx]
    
    @scala.inline
    def dy: typings.vegaLite.vegaLiteStrings.dy = "dy".asInstanceOf[typings.vegaLite.vegaLiteStrings.dy]
    
    @scala.inline
    def ellipsis: typings.vegaLite.vegaLiteStrings.ellipsis = "ellipsis".asInstanceOf[typings.vegaLite.vegaLiteStrings.ellipsis]
    
    @scala.inline
    def endAngle: typings.vegaLite.vegaLiteStrings.endAngle = "endAngle".asInstanceOf[typings.vegaLite.vegaLiteStrings.endAngle]
    
    @scala.inline
    def fill: typings.vegaLite.vegaLiteStrings.fill = "fill".asInstanceOf[typings.vegaLite.vegaLiteStrings.fill]
    
    @scala.inline
    def fillOpacity: typings.vegaLite.vegaLiteStrings.fillOpacity = "fillOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.fillOpacity]
    
    @scala.inline
    def font: typings.vegaLite.vegaLiteStrings.font = "font".asInstanceOf[typings.vegaLite.vegaLiteStrings.font]
    
    @scala.inline
    def fontSize: typings.vegaLite.vegaLiteStrings.fontSize = "fontSize".asInstanceOf[typings.vegaLite.vegaLiteStrings.fontSize]
    
    @scala.inline
    def fontStyle: typings.vegaLite.vegaLiteStrings.fontStyle = "fontStyle".asInstanceOf[typings.vegaLite.vegaLiteStrings.fontStyle]
    
    @scala.inline
    def fontWeight: typings.vegaLite.vegaLiteStrings.fontWeight = "fontWeight".asInstanceOf[typings.vegaLite.vegaLiteStrings.fontWeight]
    
    @scala.inline
    def height: typings.vegaLite.vegaLiteStrings.height = "height".asInstanceOf[typings.vegaLite.vegaLiteStrings.height]
    
    @scala.inline
    def href: typings.vegaLite.vegaLiteStrings.href = "href".asInstanceOf[typings.vegaLite.vegaLiteStrings.href]
    
    @scala.inline
    def innerRadius: typings.vegaLite.vegaLiteStrings.innerRadius = "innerRadius".asInstanceOf[typings.vegaLite.vegaLiteStrings.innerRadius]
    
    @scala.inline
    def interpolate: typings.vegaLite.vegaLiteStrings.interpolate = "interpolate".asInstanceOf[typings.vegaLite.vegaLiteStrings.interpolate]
    
    @scala.inline
    def limit: typings.vegaLite.vegaLiteStrings.limit = "limit".asInstanceOf[typings.vegaLite.vegaLiteStrings.limit]
    
    @scala.inline
    def opacity: typings.vegaLite.vegaLiteStrings.opacity = "opacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.opacity]
    
    @scala.inline
    def orient: typings.vegaLite.vegaLiteStrings.orient = "orient".asInstanceOf[typings.vegaLite.vegaLiteStrings.orient]
    
    @scala.inline
    def outerRadius: typings.vegaLite.vegaLiteStrings.outerRadius = "outerRadius".asInstanceOf[typings.vegaLite.vegaLiteStrings.outerRadius]
    
    @scala.inline
    def path: typings.vegaLite.vegaLiteStrings.path = "path".asInstanceOf[typings.vegaLite.vegaLiteStrings.path]
    
    @scala.inline
    def radius: typings.vegaLite.vegaLiteStrings.radius = "radius".asInstanceOf[typings.vegaLite.vegaLiteStrings.radius]
    
    @scala.inline
    def scaleX: typings.vegaLite.vegaLiteStrings.scaleX = "scaleX".asInstanceOf[typings.vegaLite.vegaLiteStrings.scaleX]
    
    @scala.inline
    def scaleY: typings.vegaLite.vegaLiteStrings.scaleY = "scaleY".asInstanceOf[typings.vegaLite.vegaLiteStrings.scaleY]
    
    @scala.inline
    def shape: typings.vegaLite.vegaLiteStrings.shape = "shape".asInstanceOf[typings.vegaLite.vegaLiteStrings.shape]
    
    @scala.inline
    def size: typings.vegaLite.vegaLiteStrings.size = "size".asInstanceOf[typings.vegaLite.vegaLiteStrings.size]
    
    @scala.inline
    def startAngle: typings.vegaLite.vegaLiteStrings.startAngle = "startAngle".asInstanceOf[typings.vegaLite.vegaLiteStrings.startAngle]
    
    @scala.inline
    def stroke: typings.vegaLite.vegaLiteStrings.stroke = "stroke".asInstanceOf[typings.vegaLite.vegaLiteStrings.stroke]
    
    @scala.inline
    def strokeCap: typings.vegaLite.vegaLiteStrings.strokeCap = "strokeCap".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeCap]
    
    @scala.inline
    def strokeDash: typings.vegaLite.vegaLiteStrings.strokeDash = "strokeDash".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeDash]
    
    @scala.inline
    def strokeDashOffset: typings.vegaLite.vegaLiteStrings.strokeDashOffset = "strokeDashOffset".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeDashOffset]
    
    @scala.inline
    def strokeForeground: typings.vegaLite.vegaLiteStrings.strokeForeground = "strokeForeground".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeForeground]
    
    @scala.inline
    def strokeJoin: typings.vegaLite.vegaLiteStrings.strokeJoin = "strokeJoin".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeJoin]
    
    @scala.inline
    def strokeMiterLimit: typings.vegaLite.vegaLiteStrings.strokeMiterLimit = "strokeMiterLimit".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeMiterLimit]
    
    @scala.inline
    def strokeOffset: typings.vegaLite.vegaLiteStrings.strokeOffset = "strokeOffset".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeOffset]
    
    @scala.inline
    def strokeOpacity: typings.vegaLite.vegaLiteStrings.strokeOpacity = "strokeOpacity".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeOpacity]
    
    @scala.inline
    def strokeWidth: typings.vegaLite.vegaLiteStrings.strokeWidth = "strokeWidth".asInstanceOf[typings.vegaLite.vegaLiteStrings.strokeWidth]
    
    @scala.inline
    def tension: typings.vegaLite.vegaLiteStrings.tension = "tension".asInstanceOf[typings.vegaLite.vegaLiteStrings.tension]
    
    @scala.inline
    def text: typings.vegaLite.vegaLiteStrings.text = "text".asInstanceOf[typings.vegaLite.vegaLiteStrings.text]
    
    @scala.inline
    def theta: typings.vegaLite.vegaLiteStrings.theta = "theta".asInstanceOf[typings.vegaLite.vegaLiteStrings.theta]
    
    @scala.inline
    def tooltip: typings.vegaLite.vegaLiteStrings.tooltip = "tooltip".asInstanceOf[typings.vegaLite.vegaLiteStrings.tooltip]
    
    @scala.inline
    def url: typings.vegaLite.vegaLiteStrings.url = "url".asInstanceOf[typings.vegaLite.vegaLiteStrings.url]
    
    @scala.inline
    def width: typings.vegaLite.vegaLiteStrings.width = "width".asInstanceOf[typings.vegaLite.vegaLiteStrings.width]
    
    @scala.inline
    def x: typings.vegaLite.vegaLiteStrings.x = "x".asInstanceOf[typings.vegaLite.vegaLiteStrings.x]
    
    @scala.inline
    def x2: typings.vegaLite.vegaLiteStrings.x2 = "x2".asInstanceOf[typings.vegaLite.vegaLiteStrings.x2]
    
    @scala.inline
    def xc: typings.vegaLite.vegaLiteStrings.xc = "xc".asInstanceOf[typings.vegaLite.vegaLiteStrings.xc]
    
    @scala.inline
    def y: typings.vegaLite.vegaLiteStrings.y = "y".asInstanceOf[typings.vegaLite.vegaLiteStrings.y]
    
    @scala.inline
    def y2: typings.vegaLite.vegaLiteStrings.y2 = "y2".asInstanceOf[typings.vegaLite.vegaLiteStrings.y2]
    
    @scala.inline
    def yc: typings.vegaLite.vegaLiteStrings.yc = "yc".asInstanceOf[typings.vegaLite.vegaLiteStrings.yc]
  }
  
  /* Inlined std.Partial<std.Record<vega-lite.vega-lite/build/src/vega.schema.VgEncodeChannel, vega-lite.vega-lite/build/src/vega.schema.VgValueRef | std.Array<vega-lite.vega-lite/build/src/vega.schema.VgValueRef & {  test :string | undefined}>>> */
  trait VgEncodeEntry extends StObject {
    
    var align: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var angle: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var baseline: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var clip: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var cornerRadius: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var cornerRadiusBottomLeft: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var cornerRadiusBottomRight: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var cornerRadiusTopLeft: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var cornerRadiusTopRight: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var cursor: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var defined: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var dir: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var dx: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var dy: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var ellipsis: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var endAngle: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var fill: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var fillOpacity: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var font: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var fontSize: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var fontStyle: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var fontWeight: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var height: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var href: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var innerRadius: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var interpolate: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var limit: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var opacity: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var orient: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var outerRadius: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var path: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var radius: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var scaleX: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var scaleY: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var shape: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var size: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var startAngle: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var stroke: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeCap: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeDash: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeDashOffset: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeForeground: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeJoin: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeMiterLimit: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeOffset: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeOpacity: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var strokeWidth: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var tension: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var text: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var theta: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var tooltip: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var url: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var width: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var x: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var x2: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var xc: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var y: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var y2: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
    
    var yc: js.UndefOr[VgValueRef | js.Array[VgValueRefteststringundef]] = js.undefined
  }
  object VgEncodeEntry {
    
    @scala.inline
    def apply(): VgEncodeEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VgEncodeEntry]
    }
    
    @scala.inline
    implicit class VgEncodeEntryMutableBuilder[Self <: VgEncodeEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAlignVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "align", js.Array(value :_*))
      
      @scala.inline
      def setAngle(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAngleVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "angle", js.Array(value :_*))
      
      @scala.inline
      def setBaseline(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      @scala.inline
      def setBaselineVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "baseline", js.Array(value :_*))
      
      @scala.inline
      def setClip(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setClipVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "clip", js.Array(value :_*))
      
      @scala.inline
      def setCornerRadius(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusBottomLeft(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
      
      @scala.inline
      def setCornerRadiusBottomLeftVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "cornerRadiusBottomLeft", js.Array(value :_*))
      
      @scala.inline
      def setCornerRadiusBottomRight(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
      
      @scala.inline
      def setCornerRadiusBottomRightVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "cornerRadiusBottomRight", js.Array(value :_*))
      
      @scala.inline
      def setCornerRadiusTopLeft(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
      
      @scala.inline
      def setCornerRadiusTopLeftVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "cornerRadiusTopLeft", js.Array(value :_*))
      
      @scala.inline
      def setCornerRadiusTopRight(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
      
      @scala.inline
      def setCornerRadiusTopRightVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "cornerRadiusTopRight", js.Array(value :_*))
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setCornerRadiusVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "cornerRadius", js.Array(value :_*))
      
      @scala.inline
      def setCursor(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      @scala.inline
      def setCursorVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "cursor", js.Array(value :_*))
      
      @scala.inline
      def setDefined(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinedUndefined: Self = StObject.set(x, "defined", js.undefined)
      
      @scala.inline
      def setDefinedVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "defined", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDirVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "dir", js.Array(value :_*))
      
      @scala.inline
      def setDx(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDxVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "dx", js.Array(value :_*))
      
      @scala.inline
      def setDy(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setDyVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "dy", js.Array(value :_*))
      
      @scala.inline
      def setEllipsis(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setEllipsisVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "ellipsis", js.Array(value :_*))
      
      @scala.inline
      def setEndAngle(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setEndAngleVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "endAngle", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillOpacityVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "fillOpacity", js.Array(value :_*))
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFillVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "fill", js.Array(value :_*))
      
      @scala.inline
      def setFont(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontSizeVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "fontSize", js.Array(value :_*))
      
      @scala.inline
      def setFontStyle(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontStyleVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "fontStyle", js.Array(value :_*))
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "font", js.Array(value :_*))
      
      @scala.inline
      def setFontWeight(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFontWeightVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "fontWeight", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "height", js.Array(value :_*))
      
      @scala.inline
      def setHref(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHrefVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "href", js.Array(value :_*))
      
      @scala.inline
      def setInnerRadius(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      @scala.inline
      def setInnerRadiusVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "innerRadius", js.Array(value :_*))
      
      @scala.inline
      def setInterpolate(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setInterpolateVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "interpolate", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLimitVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "limit", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setOrient(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setOrientVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "orient", js.Array(value :_*))
      
      @scala.inline
      def setOuterRadius(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
      
      @scala.inline
      def setOuterRadiusVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "outerRadius", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRadiusVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "radius", js.Array(value :_*))
      
      @scala.inline
      def setScaleX(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      @scala.inline
      def setScaleXVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "scaleX", js.Array(value :_*))
      
      @scala.inline
      def setScaleY(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      @scala.inline
      def setScaleYVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "scaleY", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setShapeVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setStartAngle(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setStartAngleVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "startAngle", js.Array(value :_*))
      
      @scala.inline
      def setStroke(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeCap(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
      
      @scala.inline
      def setStrokeCapVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeCap", js.Array(value :_*))
      
      @scala.inline
      def setStrokeDash(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashOffset(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
      
      @scala.inline
      def setStrokeDashOffsetVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeDashOffset", js.Array(value :_*))
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeDashVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
      
      @scala.inline
      def setStrokeForeground(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeForeground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeForegroundUndefined: Self = StObject.set(x, "strokeForeground", js.undefined)
      
      @scala.inline
      def setStrokeForegroundVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeForeground", js.Array(value :_*))
      
      @scala.inline
      def setStrokeJoin(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
      
      @scala.inline
      def setStrokeJoinVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeJoin", js.Array(value :_*))
      
      @scala.inline
      def setStrokeMiterLimit(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
      
      @scala.inline
      def setStrokeMiterLimitVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeMiterLimit", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOffset(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
      
      @scala.inline
      def setStrokeOffsetVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeOffset", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeOpacityVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeOpacity", js.Array(value :_*))
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "stroke", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStrokeWidthVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "strokeWidth", js.Array(value :_*))
      
      @scala.inline
      def setTension(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
      
      @scala.inline
      def setTensionVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "tension", js.Array(value :_*))
      
      @scala.inline
      def setText(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTextVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "text", js.Array(value :_*))
      
      @scala.inline
      def setTheta(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      @scala.inline
      def setThetaVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "theta", js.Array(value :_*))
      
      @scala.inline
      def setTooltip(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTooltipVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "tooltip", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUrlVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "url", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWidthVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "width", js.Array(value :_*))
      
      @scala.inline
      def setX(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setX2Varargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "x2", js.Array(value :_*))
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setXVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      @scala.inline
      def setXc(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "xc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXcUndefined: Self = StObject.set(x, "xc", js.undefined)
      
      @scala.inline
      def setXcVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "xc", js.Array(value :_*))
      
      @scala.inline
      def setY(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setY2Varargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "y2", js.Array(value :_*))
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setYVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "y", js.Array(value :_*))
      
      @scala.inline
      def setYc(value: VgValueRef | js.Array[VgValueRefteststringundef]): Self = StObject.set(x, "yc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYcUndefined: Self = StObject.set(x, "yc", js.undefined)
      
      @scala.inline
      def setYcVarargs(value: VgValueRefteststringundef*): Self = StObject.set(x, "yc", js.Array(value :_*))
    }
  }
  
  trait VgJoinAggregateTransform extends StObject {
    
    var as: js.UndefOr[js.Array[String]] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var groupby: js.UndefOr[js.Array[String]] = js.undefined
    
    var ops: js.UndefOr[js.Array[AggregateOp]] = js.undefined
    
    var `type`: joinaggregate
  }
  object VgJoinAggregateTransform {
    
    @scala.inline
    def apply(): VgJoinAggregateTransform = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("joinaggregate")
      __obj.asInstanceOf[VgJoinAggregateTransform]
    }
    
    @scala.inline
    implicit class VgJoinAggregateTransformMutableBuilder[Self <: VgJoinAggregateTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
      
      @scala.inline
      def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value :_*))
      
      @scala.inline
      def setOps(value: js.Array[AggregateOp]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
      
      @scala.inline
      def setOpsVarargs(value: AggregateOp*): Self = StObject.set(x, "ops", js.Array(value :_*))
      
      @scala.inline
      def setType(value: joinaggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait VgLayout extends StObject {
    
    var align: js.UndefOr[LayoutAlign | RowCol[LayoutAlign]] = js.undefined
    
    var bounds: js.UndefOr[full | flush] = js.undefined
    
    var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.undefined
    
    var columns: js.UndefOr[Double | Signal] = js.undefined
    
    var footerBand: js.UndefOr[Double | RowCol[Double]] = js.undefined
    
    var headerBand: js.UndefOr[Double | RowCol[Double]] = js.undefined
    
    var offset: js.UndefOr[Double | ColumnFooter] = js.undefined
    
    var padding: js.UndefOr[Double | RowCol[Double]] = js.undefined
    
    var titleAnchor: js.UndefOr[start | end | (RowCol[start | end])] = js.undefined
  }
  object VgLayout {
    
    @scala.inline
    def apply(): VgLayout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VgLayout]
    }
    
    @scala.inline
    implicit class VgLayoutMutableBuilder[Self <: VgLayout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: LayoutAlign | RowCol[LayoutAlign]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBounds(value: full | flush): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean | RowCol[Boolean]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setColumns(value: Double | Signal): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setFooterBand(value: Double | RowCol[Double]): Self = StObject.set(x, "footerBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterBandUndefined: Self = StObject.set(x, "footerBand", js.undefined)
      
      @scala.inline
      def setHeaderBand(value: Double | RowCol[Double]): Self = StObject.set(x, "headerBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderBandUndefined: Self = StObject.set(x, "headerBand", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | ColumnFooter): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | RowCol[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setTitleAnchor(value: start | end | (RowCol[start | end])): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
    }
  }
  
  type VgMarkGroup = js.Any
  
  trait VgMultiFieldsRefWithSort
    extends StObject
       with ScaleMultiFieldsRef {
    
    var sort: js.UndefOr[UnionSortField] = js.undefined
  }
  object VgMultiFieldsRefWithSort {
    
    @scala.inline
    def apply(data: String, fields: js.Array[ScaleField]): VgMultiFieldsRefWithSort = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[VgMultiFieldsRefWithSort]
    }
    
    @scala.inline
    implicit class VgMultiFieldsRefWithSortMutableBuilder[Self <: VgMultiFieldsRefWithSort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSort(value: UnionSortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  type VgNonUnionDomain = (js.Array[Null | String | Double | Boolean | SignalRef]) | VgScaleDataRefWithSort | SignalRef
  
  type VgPostEncodingTransform = GeoShapeTransform
  
  type VgRange = RangeScheme | ScaleData | RangeBand | RangeRaw
  
  trait VgRangeStep extends StObject {
    
    var step: Double | SignalRef
  }
  object VgRangeStep {
    
    @scala.inline
    def apply(step: Double | SignalRef): VgRangeStep = {
      val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[VgRangeStep]
    }
    
    @scala.inline
    implicit class VgRangeStepMutableBuilder[Self <: VgRangeStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<vega.vega.BaseScale, 'type'> & {  range :vega.vega.RangeScheme | vega.vega.RangeBand | vega.vega.ScaleData | undefined,   nice :boolean | number | vega.vega.TimeInterval | vega.vega.TimeIntervalStep | vega.vega.SignalRef | undefined,   zero :boolean | vega.vega.SignalRef | undefined} & std.Omit<std.Omit<vega.vega.LinearScale, 'type'> & std.Omit<vega.vega.LogScale, 'type'> & std.Omit<vega.vega.SymLogScale, 'type'> & std.Omit<std.Partial<vega.vega.PowScale>, 'type'> & // use partial so exponent is not required
  std.Omit<vega.vega.SqrtScale, 'type'> & std.Omit<vega.vega.IdentityScale, 'type'> & std.Omit<vega.vega.TimeScale, 'type'> & std.Omit<vega.vega.QuantileScale, 'type'> & std.Omit<vega.vega.QuantizeScale, 'type'> & std.Omit<vega.vega.ThresholdScale, 'type'> & std.Omit<vega.vega.BinOrdinalScale, 'type'> & std.Omit<vega.vega.SequentialScale, 'type'> & std.Omit<vega.vega.BandScale, 'type'> & std.Omit<vega.vega.PointScale, 'type'> & std.Omit<vega.vega.OrdinalScale, 'type'>, 'range' | 'nice' | 'zero'> */
  trait VgScale extends StObject {
    
    var align: js.UndefOr[Double | SignalRef] = js.undefined
    
    var base: js.UndefOr[Double | SignalRef] = js.undefined
    
    var bins: js.UndefOr[ScaleBins] = js.undefined
    
    var clamp: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var constant: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domain: js.UndefOr[(js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef] = js.undefined
    
    var domainImplicit: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var domainMax: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domainMid: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domainMin: js.UndefOr[Double | SignalRef] = js.undefined
    
    var domainRaw: js.UndefOr[Null | js.Array[js.Any] | SignalRef] = js.undefined
    
    var exponent: js.UndefOr[Double | SignalRef] = js.undefined
    
    var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
    
    var name: String
    
    var nice: js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef] = js.undefined
    
    var padding: js.UndefOr[Double | SignalRef] = js.undefined
    
    var paddingInner: js.UndefOr[Double | SignalRef] = js.undefined
    
    var paddingOuter: js.UndefOr[Double | SignalRef] = js.undefined
    
    var range: js.UndefOr[RangeScheme | RangeBand | ScaleData] = js.undefined
    
    var reverse: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var round: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var `type`: js.UndefOr[ScaleType] = js.undefined
    
    var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
  }
  object VgScale {
    
    @scala.inline
    def apply(name: String): VgScale = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[VgScale]
    }
    
    @scala.inline
    implicit class VgScaleMutableBuilder[Self <: VgScale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Double | SignalRef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setBase(value: Double | SignalRef): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      @scala.inline
      def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value :_*))
      
      @scala.inline
      def setClamp(value: Boolean | SignalRef): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
      
      @scala.inline
      def setConstant(value: Double | SignalRef): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setDomain(value: (js.Array[Null | String | Double | Boolean | SignalRef]) | ScaleData | SignalRef): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainImplicit(value: Boolean | SignalRef): Self = StObject.set(x, "domainImplicit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainImplicitUndefined: Self = StObject.set(x, "domainImplicit", js.undefined)
      
      @scala.inline
      def setDomainMax(value: Double | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
      
      @scala.inline
      def setDomainMid(value: Double | SignalRef): Self = StObject.set(x, "domainMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMidUndefined: Self = StObject.set(x, "domainMid", js.undefined)
      
      @scala.inline
      def setDomainMin(value: Double | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
      
      @scala.inline
      def setDomainRaw(value: js.Array[js.Any] | SignalRef): Self = StObject.set(x, "domainRaw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainRawNull: Self = StObject.set(x, "domainRaw", null)
      
      @scala.inline
      def setDomainRawUndefined: Self = StObject.set(x, "domainRaw", js.undefined)
      
      @scala.inline
      def setDomainRawVarargs(value: js.Any*): Self = StObject.set(x, "domainRaw", js.Array(value :_*))
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setDomainVarargs(value: (Null | String | Double | Boolean | SignalRef)*): Self = StObject.set(x, "domain", js.Array(value :_*))
      
      @scala.inline
      def setExponent(value: Double | SignalRef): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
      
      @scala.inline
      def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNice(value: Boolean | Double | TimeInterval | TimeIntervalStep | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
      
      @scala.inline
      def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInner(value: Double | SignalRef): Self = StObject.set(x, "paddingInner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingInnerUndefined: Self = StObject.set(x, "paddingInner", js.undefined)
      
      @scala.inline
      def setPaddingOuter(value: Double | SignalRef): Self = StObject.set(x, "paddingOuter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingOuterUndefined: Self = StObject.set(x, "paddingOuter", js.undefined)
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setRange(value: RangeScheme | RangeBand | ScaleData): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setRangeVarargs(value: (Boolean | Double | Null | RangeRawArray | SignalRef | String)*): Self = StObject.set(x, "range", js.Array(value :_*))
      
      @scala.inline
      def setReverse(value: Boolean | SignalRef): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setType(value: ScaleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  trait VgScaleDataRefWithSort
    extends StObject
       with ScaleDataRef {
    
    var sort: js.UndefOr[SortField] = js.undefined
  }
  object VgScaleDataRefWithSort {
    
    @scala.inline
    def apply(data: String, field: ScaleField): VgScaleDataRefWithSort = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[VgScaleDataRefWithSort]
    }
    
    @scala.inline
    implicit class VgScaleDataRefWithSortMutableBuilder[Self <: VgScaleDataRefWithSort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait VgScaleMultiDataRefWithSort
    extends StObject
       with ScaleMultiDataRef {
    
    @JSName("fields")
    var fields_VgScaleMultiDataRefWithSort: js.Array[js.Array[js.Any] | VgScaleDataRefWithSort | SignalRef]
    
    var sort: js.UndefOr[UnionSortField] = js.undefined
  }
  object VgScaleMultiDataRefWithSort {
    
    @scala.inline
    def apply(fields: js.Array[js.Array[js.Any] | VgScaleDataRefWithSort | SignalRef]): VgScaleMultiDataRefWithSort = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[VgScaleMultiDataRefWithSort]
    }
    
    @scala.inline
    implicit class VgScaleMultiDataRefWithSortMutableBuilder[Self <: VgScaleMultiDataRefWithSort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[js.Array[js.Any] | VgScaleDataRefWithSort | SignalRef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: (js.Array[js.Any] | VgScaleDataRefWithSort | SignalRef)*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setSort(value: UnionSortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait VgValueRef extends StObject {
    
    var band: js.UndefOr[Boolean | Double | VgValueRef] = js.undefined
    
    var field: js.UndefOr[String | Datum] = js.undefined
    
    var mult: js.UndefOr[Double] = js.undefined
    
    var offset: js.UndefOr[Double | VgValueRef] = js.undefined
    
    var scale: js.UndefOr[String] = js.undefined
    
    var signal: js.UndefOr[String] = js.undefined
    
    var test: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[Value[Null]] = js.undefined
  }
  object VgValueRef {
    
    @scala.inline
    def apply(): VgValueRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VgValueRef]
    }
    
    @scala.inline
    implicit class VgValueRefMutableBuilder[Self <: VgValueRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBand(value: Boolean | Double | VgValueRef): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
      
      @scala.inline
      def setField(value: String | Datum): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setMult(value: Double): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultUndefined: Self = StObject.set(x, "mult", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setValue(value: Value[Null]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
