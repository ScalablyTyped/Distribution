package typings.vegaLite

import typings.vegaLite.channeldefMod.ConditionValueDefMixins
import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.channeldefMod.ValueDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGuideMod {
  
  @JSImport("vega-lite/build/src/guide", "VL_ONLY_LEGEND_CONFIG")
  @js.native
  val VL_ONLY_LEGEND_CONFIG: js.Array[
    /* keyof vega-lite.vega-lite/build/src/legend.LegendConfig<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 75 */ js.Any
  ] = js.native
  
  trait FormatMixins extends StObject {
    
    /**
      * When used with the default `"number"` and `"time"` format type, the text formatting pattern for labels of guides (axes, legends, headers) and text marks.
      *
      * - If the format type is `"number"` (e.g., for quantitative fields), this is D3's [number format pattern](https://github.com/d3/d3-format#locale_format).
      * - If the format type is `"time"` (e.g., for temporal fields), this is D3's [time format pattern](https://github.com/d3/d3-time-format#locale_format).
      *
      * See the [format documentation](https://vega.github.io/vega-lite/docs/format.html) for more examples.
      *
      * When used with a [custom `formatType`](https://vega.github.io/vega-lite/docs/config.html#custom-format-type), this value will be passed as `format` alongside `datum.value` to the registered function.
      *
      * __Default value:__  Derived from [numberFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for number format and from [timeFormat](https://vega.github.io/vega-lite/docs/config.html#format) config for time format.
      */
    var format: js.UndefOr[String | Dict[js.Any]] = js.undefined
    
    /**
      * The format type for labels. One of `"number"`, `"time"`, or a [registered custom format type](https://vega.github.io/vega-lite/docs/config.html#custom-format-type).
      *
      * __Default value:__
      * - `"time"` for temporal fields and ordinal and nominal fields with `timeUnit`.
      * - `"number"` for quantitative fields as well as ordinal and nominal fields without `timeUnit`.
      */
    var formatType: js.UndefOr[number | time | String] = js.undefined
    
    /**
      * [Vega expression](https://vega.github.io/vega/docs/expressions/) for customizing labels text.
      *
      * __Note:__ The label text and value can be assessed via the `label` and `value` properties of the axis's backing `datum` object.
      */
    var labelExpr: js.UndefOr[String] = js.undefined
  }
  object FormatMixins {
    
    inline def apply(): FormatMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatMixins]
    }
    
    extension [Self <: FormatMixins](x: Self) {
      
      inline def setFormat(value: String | Dict[js.Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatType(value: number | time | String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
    }
  }
  
  trait Guide
    extends StObject
       with TitleMixins
       with FormatMixins
  object Guide {
    
    inline def apply(): Guide = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Guide]
    }
  }
  
  trait GuideEncodingConditionalValueDef
    extends StObject
       with ValueDef[Value[ExprRef | SignalRef]]
       with ConditionValueDefMixins[Value[ExprRef | SignalRef]]
  object GuideEncodingConditionalValueDef {
    
    inline def apply(): GuideEncodingConditionalValueDef = {
      val __obj = js.Dynamic.literal(value = null)
      __obj.asInstanceOf[GuideEncodingConditionalValueDef]
    }
  }
  
  /* Inlined std.Partial<std.Record<vega-lite.vega-lite/build/src/vega.schema.VgEncodeChannel, vega-lite.vega-lite/build/src/guide.GuideEncodingConditionalValueDef>> */
  trait GuideEncodingEntry extends StObject {
    
    var align: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var angle: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var baseline: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var clip: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var cornerRadius: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var cornerRadiusBottomLeft: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var cornerRadiusBottomRight: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var cornerRadiusTopLeft: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var cornerRadiusTopRight: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var cursor: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var defined: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var dir: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var dx: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var dy: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var ellipsis: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var endAngle: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var fill: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var fillOpacity: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var font: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var fontSize: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var fontStyle: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var fontWeight: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var height: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var href: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var innerRadius: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var interpolate: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var limit: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var opacity: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var orient: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var outerRadius: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var path: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var radius: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var scaleX: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var scaleY: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var shape: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var size: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var startAngle: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var stroke: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeCap: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeDash: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeDashOffset: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeForeground: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeJoin: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeMiterLimit: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeOffset: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeOpacity: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var strokeWidth: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var tension: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var text: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var theta: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var tooltip: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var url: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var width: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var x: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var x2: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var xc: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var y: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var y2: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
    
    var yc: js.UndefOr[GuideEncodingConditionalValueDef] = js.undefined
  }
  object GuideEncodingEntry {
    
    inline def apply(): GuideEncodingEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GuideEncodingEntry]
    }
    
    extension [Self <: GuideEncodingEntry](x: Self) {
      
      inline def setAlign(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAngle(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setBaseline(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setClip(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setCornerRadius(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusBottomLeft(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "cornerRadiusBottomLeft", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusBottomLeftUndefined: Self = StObject.set(x, "cornerRadiusBottomLeft", js.undefined)
      
      inline def setCornerRadiusBottomRight(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "cornerRadiusBottomRight", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusBottomRightUndefined: Self = StObject.set(x, "cornerRadiusBottomRight", js.undefined)
      
      inline def setCornerRadiusTopLeft(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "cornerRadiusTopLeft", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusTopLeftUndefined: Self = StObject.set(x, "cornerRadiusTopLeft", js.undefined)
      
      inline def setCornerRadiusTopRight(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "cornerRadiusTopRight", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusTopRightUndefined: Self = StObject.set(x, "cornerRadiusTopRight", js.undefined)
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setCursor(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setDefined(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      inline def setDefinedUndefined: Self = StObject.set(x, "defined", js.undefined)
      
      inline def setDir(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setDx(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEllipsis(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEndAngle(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setFill(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setHeight(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHref(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setInnerRadius(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setInterpolate(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setLimit(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOpacity(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrient(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOuterRadius(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
      
      inline def setPath(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRadius(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setScaleX(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
      
      inline def setScaleY(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
      
      inline def setShape(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartAngle(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStroke(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeCap(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
      
      inline def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
      
      inline def setStrokeDash(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashOffset(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
      
      inline def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      inline def setStrokeForeground(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeForeground", value.asInstanceOf[js.Any])
      
      inline def setStrokeForegroundUndefined: Self = StObject.set(x, "strokeForeground", js.undefined)
      
      inline def setStrokeJoin(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
      
      inline def setStrokeMiterLimit(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
      
      inline def setStrokeOffset(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeOffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeOffsetUndefined: Self = StObject.set(x, "strokeOffset", js.undefined)
      
      inline def setStrokeOpacity(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTension(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "tension", value.asInstanceOf[js.Any])
      
      inline def setTensionUndefined: Self = StObject.set(x, "tension", js.undefined)
      
      inline def setText(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheta(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      inline def setTooltip(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setUrl(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWidth(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setX2(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXc(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "xc", value.asInstanceOf[js.Any])
      
      inline def setXcUndefined: Self = StObject.set(x, "xc", js.undefined)
      
      inline def setY(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY2(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYc(value: GuideEncodingConditionalValueDef): Self = StObject.set(x, "yc", value.asInstanceOf[js.Any])
      
      inline def setYcUndefined: Self = StObject.set(x, "yc", js.undefined)
    }
  }
  
  trait TitleMixins extends StObject {
    
    /**
      * A title for the field. If `null`, the title will be removed.
      *
      * __Default value:__  derived from the field's name and transformation function (`aggregate`, `bin` and `timeUnit`). If the field has an aggregate function, the function is displayed as part of the title (e.g., `"Sum of Profit"`). If the field is binned or has a time unit applied, the applied function is shown in parentheses (e.g., `"Profit (binned)"`, `"Transaction Date (year-month)"`). Otherwise, the title is simply the field name.
      *
      * __Notes__:
      *
      * 1) You can customize the default field title format by providing the [`fieldTitle`](https://vega.github.io/vega-lite/docs/config.html#top-level-config) property in the [config](https://vega.github.io/vega-lite/docs/config.html) or [`fieldTitle` function via the `compile` function's options](https://vega.github.io/vega-lite/docs/compile.html#field-title).
      *
      * 2) If both field definition's `title` and axis, header, or legend `title` are defined, axis/header/legend title will be used.
      */
    var title: js.UndefOr[Text | Null | SignalRef] = js.undefined
  }
  object TitleMixins {
    
    inline def apply(): TitleMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleMixins]
    }
    
    extension [Self <: TitleMixins](x: Self) {
      
      inline def setTitle(value: Text | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    }
  }
  
  trait VlOnlyGuideConfig extends StObject {
    
    /**
      * Set to null to disable title for the axis, legend, or header.
      */
    var title: js.UndefOr[Null] = js.undefined
  }
}
