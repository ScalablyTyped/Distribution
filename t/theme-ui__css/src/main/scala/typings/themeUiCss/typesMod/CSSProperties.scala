package typings.themeUiCss.typesMod

import typings.csstype.mod.AlignmentBaselineProperty
import typings.csstype.mod.BaselineShiftProperty
import typings.csstype.mod.ClipProperty
import typings.csstype.mod.ClipRuleProperty
import typings.csstype.mod.ColorInterpolationProperty
import typings.csstype.mod.ColorRenderingProperty
import typings.csstype.mod.DominantBaselineProperty
import typings.csstype.mod.FillProperty
import typings.csstype.mod.FillRuleProperty
import typings.csstype.mod.FloodColorProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.GlyphOrientationVerticalProperty
import typings.csstype.mod.LightingColorProperty
import typings.csstype.mod.MarkerEndProperty
import typings.csstype.mod.MarkerMidProperty
import typings.csstype.mod.MarkerProperty
import typings.csstype.mod.MarkerStartProperty
import typings.csstype.mod.ShapeRenderingProperty
import typings.csstype.mod.StandardProperties
import typings.csstype.mod.StopColorProperty
import typings.csstype.mod.StrokeDasharrayProperty
import typings.csstype.mod.StrokeDashoffsetProperty
import typings.csstype.mod.StrokeLinecapProperty
import typings.csstype.mod.StrokeLinejoinProperty
import typings.csstype.mod.StrokeProperty
import typings.csstype.mod.StrokeWidthProperty
import typings.csstype.mod.TextAnchorProperty
import typings.csstype.mod.VectorEffectProperty
import typings.csstype.mod.VendorProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgProperties because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined textAnchor, shapeRendering, markerStart, strokeLinecap, strokeDashoffset, lightingColor, fillOpacity, colorRendering, floodColor, strokeWidth, strokeOpacity, strokeLinejoin, stroke, markerEnd, stopColor, clip, dominantBaseline, baselineShift, stopOpacity, fillRule, clipRule, colorInterpolation, marker, fill, glyphOrientationVertical, alignmentBaseline, vectorEffect, strokeDasharray, markerMid, strokeMiterlimit, floodOpacity */ trait CSSProperties
  extends StObject
     with StandardProperties[Double | String]
     with VendorProperties[Double | String] {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.undefined
  
  var baselineShift: js.UndefOr[BaselineShiftProperty[Double | String]] = js.undefined
  
  var clip: js.UndefOr[ClipProperty] = js.undefined
  
  var clipRule: js.UndefOr[ClipRuleProperty] = js.undefined
  
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.undefined
  
  var colorRendering: js.UndefOr[ColorRenderingProperty] = js.undefined
  
  var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.undefined
  
  var fill: js.UndefOr[FillProperty] = js.undefined
  
  var fillOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  
  var fillRule: js.UndefOr[FillRuleProperty] = js.undefined
  
  var floodColor: js.UndefOr[FloodColorProperty] = js.undefined
  
  var floodOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.undefined
  
  var lightingColor: js.UndefOr[LightingColorProperty] = js.undefined
  
  var marker: js.UndefOr[MarkerProperty] = js.undefined
  
  var markerEnd: js.UndefOr[MarkerEndProperty] = js.undefined
  
  var markerMid: js.UndefOr[MarkerMidProperty] = js.undefined
  
  var markerStart: js.UndefOr[MarkerStartProperty] = js.undefined
  
  var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.undefined
  
  var stopColor: js.UndefOr[StopColorProperty] = js.undefined
  
  var stopOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  
  var stroke: js.UndefOr[StrokeProperty] = js.undefined
  
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[Double | String]] = js.undefined
  
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[Double | String]] = js.undefined
  
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.undefined
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.undefined
  
  var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.undefined
  
  var strokeOpacity: js.UndefOr[GlobalsNumber] = js.undefined
  
  var strokeWidth: js.UndefOr[StrokeWidthProperty[Double | String]] = js.undefined
  
  var textAnchor: js.UndefOr[TextAnchorProperty] = js.undefined
  
  var vectorEffect: js.UndefOr[VectorEffectProperty] = js.undefined
}
object CSSProperties {
  
  inline def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
  
  extension [Self <: CSSProperties](x: Self) {
    
    inline def setAlignmentBaseline(value: AlignmentBaselineProperty): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    inline def setBaselineShift(value: BaselineShiftProperty[Double | String]): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    inline def setClip(value: ClipProperty): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipRule(value: ClipRuleProperty): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setColorInterpolation(value: ColorInterpolationProperty): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    inline def setColorRendering(value: ColorRenderingProperty): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    inline def setDominantBaseline(value: DominantBaselineProperty): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    inline def setFill(value: FillProperty): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillOpacity(value: GlobalsNumber): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillRule(value: FillRuleProperty): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFloodColor(value: FloodColorProperty): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    inline def setFloodOpacity(value: GlobalsNumber): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    inline def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    inline def setLightingColor(value: LightingColorProperty): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    inline def setMarker(value: MarkerProperty): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerEnd(value: MarkerEndProperty): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    inline def setMarkerMid(value: MarkerMidProperty): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    inline def setMarkerStart(value: MarkerStartProperty): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setShapeRendering(value: ShapeRenderingProperty): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    inline def setStopColor(value: StopColorProperty): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    inline def setStopOpacity(value: GlobalsNumber): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    inline def setStroke(value: StrokeProperty): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharray(value: StrokeDasharrayProperty[Double | String]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeDashoffset(value: StrokeDashoffsetProperty[Double | String]): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    inline def setStrokeLinecap(value: StrokeLinecapProperty): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    inline def setStrokeLinejoin(value: StrokeLinejoinProperty): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    inline def setStrokeMiterlimit(value: GlobalsNumber): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    inline def setStrokeOpacity(value: GlobalsNumber): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: StrokeWidthProperty[Double | String]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setTextAnchor(value: TextAnchorProperty): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    inline def setVectorEffect(value: VectorEffectProperty): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
  }
}
