package typings.atStyledDashSystemCss.atStyledDashSystemCssMod

import typings.csstype.csstypeMod.AlignmentBaselineProperty
import typings.csstype.csstypeMod.BaselineShiftProperty
import typings.csstype.csstypeMod.ClipProperty
import typings.csstype.csstypeMod.ClipRuleProperty
import typings.csstype.csstypeMod.ColorInterpolationProperty
import typings.csstype.csstypeMod.ColorRenderingProperty
import typings.csstype.csstypeMod.DominantBaselineProperty
import typings.csstype.csstypeMod.FillProperty
import typings.csstype.csstypeMod.FillRuleProperty
import typings.csstype.csstypeMod.FloodColorProperty
import typings.csstype.csstypeMod.GlobalsNumber
import typings.csstype.csstypeMod.GlyphOrientationVerticalProperty
import typings.csstype.csstypeMod.LightingColorProperty
import typings.csstype.csstypeMod.MarkerEndProperty
import typings.csstype.csstypeMod.MarkerMidProperty
import typings.csstype.csstypeMod.MarkerProperty
import typings.csstype.csstypeMod.MarkerStartProperty
import typings.csstype.csstypeMod.ShapeRenderingProperty
import typings.csstype.csstypeMod.StandardProperties
import typings.csstype.csstypeMod.StopColorProperty
import typings.csstype.csstypeMod.StrokeDasharrayProperty
import typings.csstype.csstypeMod.StrokeDashoffsetProperty
import typings.csstype.csstypeMod.StrokeLinecapProperty
import typings.csstype.csstypeMod.StrokeLinejoinProperty
import typings.csstype.csstypeMod.StrokeProperty
import typings.csstype.csstypeMod.StrokeWidthProperty
import typings.csstype.csstypeMod.SvgProperties
import typings.csstype.csstypeMod.TextAnchorProperty
import typings.csstype.csstypeMod.VectorEffectProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.csstypeMod.SvgProperties because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait CSSProperties extends StandardProperties[Double | String] {
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
  @scala.inline
  def apply(
    StandardProperties: StandardProperties[Double | String] = null,
    SvgProperties: SvgProperties[Double | String] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StandardProperties)
    js.Dynamic.global.Object.assign(__obj, SvgProperties)
    __obj.asInstanceOf[CSSProperties]
  }
}

