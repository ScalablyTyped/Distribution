package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.ObsoleteProperties
import typings.csstype.mod.Property.AlignmentBaseline
import typings.csstype.mod.Property.BaselineShift
import typings.csstype.mod.Property.ClipRule
import typings.csstype.mod.Property.ColorInterpolation
import typings.csstype.mod.Property.ColorRendering
import typings.csstype.mod.Property.DominantBaseline
import typings.csstype.mod.Property.Fill
import typings.csstype.mod.Property.FillOpacity
import typings.csstype.mod.Property.FillRule
import typings.csstype.mod.Property.FloodColor
import typings.csstype.mod.Property.FloodOpacity
import typings.csstype.mod.Property.GlyphOrientationVertical
import typings.csstype.mod.Property.LightingColor
import typings.csstype.mod.Property.Marker
import typings.csstype.mod.Property.MarkerEnd
import typings.csstype.mod.Property.MarkerMid
import typings.csstype.mod.Property.MarkerStart
import typings.csstype.mod.Property.ShapeRendering
import typings.csstype.mod.Property.StopColor
import typings.csstype.mod.Property.StopOpacity
import typings.csstype.mod.Property.Stroke
import typings.csstype.mod.Property.StrokeDasharray
import typings.csstype.mod.Property.StrokeDashoffset
import typings.csstype.mod.Property.StrokeLinecap
import typings.csstype.mod.Property.StrokeLinejoin
import typings.csstype.mod.Property.StrokeMiterlimit
import typings.csstype.mod.Property.StrokeOpacity
import typings.csstype.mod.Property.StrokeWidth
import typings.csstype.mod.Property.TextAnchor
import typings.csstype.mod.Property.VectorEffect
import typings.csstype.mod.StandardLonghandProperties
import typings.csstype.mod.StandardShorthandProperties
import typings.csstype.mod.VendorLonghandProperties
import typings.csstype.mod.VendorShorthandProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgProperties because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait CSSObject
  extends _InterpolationValue
     with StandardLonghandProperties[String | Double, String with js.Object]
     with StandardShorthandProperties[String | Double, String with js.Object]
     with VendorLonghandProperties[String | Double, String with js.Object]
     with VendorShorthandProperties[String | Double, String with js.Object]
     with ObsoleteProperties[String | Double, String with js.Object]
     with CSSPseudos
     with /* key */ StringDictionary[js.UndefOr[CSSObject | String | Double]] {
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  var baselineShift: js.UndefOr[BaselineShift[String | Double]] = js.native
  var clipRule: js.UndefOr[ClipRule] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolation] = js.native
  var colorRendering: js.UndefOr[ColorRendering] = js.native
  var dominantBaseline: js.UndefOr[DominantBaseline] = js.native
  var fill: js.UndefOr[Fill] = js.native
  var fillOpacity: js.UndefOr[FillOpacity] = js.native
  var fillRule: js.UndefOr[FillRule] = js.native
  var floodColor: js.UndefOr[FloodColor] = js.native
  var floodOpacity: js.UndefOr[FloodOpacity] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVertical] = js.native
  var lightingColor: js.UndefOr[LightingColor] = js.native
  var marker: js.UndefOr[Marker] = js.native
  var markerEnd: js.UndefOr[MarkerEnd] = js.native
  var markerMid: js.UndefOr[MarkerMid] = js.native
  var markerStart: js.UndefOr[MarkerStart] = js.native
  var shapeRendering: js.UndefOr[ShapeRendering] = js.native
  var stopColor: js.UndefOr[StopColor] = js.native
  var stopOpacity: js.UndefOr[StopOpacity] = js.native
  var stroke: js.UndefOr[Stroke] = js.native
  var strokeDasharray: js.UndefOr[StrokeDasharray[String | Double]] = js.native
  var strokeDashoffset: js.UndefOr[StrokeDashoffset[String | Double]] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.native
  var strokeMiterlimit: js.UndefOr[StrokeMiterlimit] = js.native
  var strokeOpacity: js.UndefOr[StrokeOpacity] = js.native
  var strokeWidth: js.UndefOr[StrokeWidth[String | Double]] = js.native
  var textAnchor: js.UndefOr[TextAnchor] = js.native
  var vectorEffect: js.UndefOr[VectorEffect] = js.native
}

object CSSObject {
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
  @scala.inline
  implicit class CSSObjectOps[Self <: CSSObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaseline): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    @scala.inline
    def setBaselineShift(value: BaselineShift[String | Double]): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    @scala.inline
    def setClipRule(value: ClipRule): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    @scala.inline
    def setColorInterpolation(value: ColorInterpolation): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    @scala.inline
    def setColorRendering(value: ColorRendering): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    @scala.inline
    def setDominantBaseline(value: DominantBaseline): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    @scala.inline
    def setFill(value: Fill): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillOpacity(value: FillOpacity): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: FillRule): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setFloodColor(value: FloodColor): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    @scala.inline
    def setFloodOpacity(value: FloodOpacity): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVertical): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    @scala.inline
    def setLightingColor(value: LightingColor): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setMarkerEnd(value: MarkerEnd): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    @scala.inline
    def setMarkerMid(value: MarkerMid): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    @scala.inline
    def setMarkerStart(value: MarkerStart): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    @scala.inline
    def setShapeRendering(value: ShapeRendering): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    @scala.inline
    def setStopColor(value: StopColor): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    @scala.inline
    def setStopOpacity(value: StopOpacity): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    @scala.inline
    def setStroke(value: Stroke): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharray[String | Double]): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffset[String | Double]): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecap): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoin): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimit(value: StrokeMiterlimit): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: StrokeOpacity): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: StrokeWidth[String | Double]): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTextAnchor(value: TextAnchor): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    @scala.inline
    def setVectorEffect(value: VectorEffect): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
  }
  
}

