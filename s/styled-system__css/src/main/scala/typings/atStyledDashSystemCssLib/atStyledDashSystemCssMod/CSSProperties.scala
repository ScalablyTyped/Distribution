package typings
package atStyledDashSystemCssLib.atStyledDashSystemCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- csstypeLib.csstypeMod.SvgProperties because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait CSSProperties
  extends csstypeLib.csstypeMod.StandardProperties[scala.Double | java.lang.String] {
  var alignmentBaseline: js.UndefOr[csstypeLib.csstypeMod.AlignmentBaselineProperty] = js.undefined
  var baselineShift: js.UndefOr[csstypeLib.csstypeMod.BaselineShiftProperty[scala.Double | java.lang.String]] = js.undefined
  var clip: js.UndefOr[csstypeLib.csstypeMod.ClipProperty] = js.undefined
  var clipRule: js.UndefOr[csstypeLib.csstypeMod.ClipRuleProperty] = js.undefined
  var colorInterpolation: js.UndefOr[csstypeLib.csstypeMod.ColorInterpolationProperty] = js.undefined
  var colorRendering: js.UndefOr[csstypeLib.csstypeMod.ColorRenderingProperty] = js.undefined
  var dominantBaseline: js.UndefOr[csstypeLib.csstypeMod.DominantBaselineProperty] = js.undefined
  var fill: js.UndefOr[csstypeLib.csstypeMod.FillProperty] = js.undefined
  var fillOpacity: js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber] = js.undefined
  var fillRule: js.UndefOr[csstypeLib.csstypeMod.FillRuleProperty] = js.undefined
  var floodColor: js.UndefOr[csstypeLib.csstypeMod.FloodColorProperty] = js.undefined
  var floodOpacity: js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber] = js.undefined
  var glyphOrientationVertical: js.UndefOr[csstypeLib.csstypeMod.GlyphOrientationVerticalProperty] = js.undefined
  var lightingColor: js.UndefOr[csstypeLib.csstypeMod.LightingColorProperty] = js.undefined
  var marker: js.UndefOr[csstypeLib.csstypeMod.MarkerProperty] = js.undefined
  var markerEnd: js.UndefOr[csstypeLib.csstypeMod.MarkerEndProperty] = js.undefined
  var markerMid: js.UndefOr[csstypeLib.csstypeMod.MarkerMidProperty] = js.undefined
  var markerStart: js.UndefOr[csstypeLib.csstypeMod.MarkerStartProperty] = js.undefined
  var shapeRendering: js.UndefOr[csstypeLib.csstypeMod.ShapeRenderingProperty] = js.undefined
  var stopColor: js.UndefOr[csstypeLib.csstypeMod.StopColorProperty] = js.undefined
  var stopOpacity: js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber] = js.undefined
  var stroke: js.UndefOr[csstypeLib.csstypeMod.StrokeProperty] = js.undefined
  var strokeDasharray: js.UndefOr[csstypeLib.csstypeMod.StrokeDasharrayProperty[scala.Double | java.lang.String]] = js.undefined
  var strokeDashoffset: js.UndefOr[csstypeLib.csstypeMod.StrokeDashoffsetProperty[scala.Double | java.lang.String]] = js.undefined
  var strokeLinecap: js.UndefOr[csstypeLib.csstypeMod.StrokeLinecapProperty] = js.undefined
  var strokeLinejoin: js.UndefOr[csstypeLib.csstypeMod.StrokeLinejoinProperty] = js.undefined
  var strokeMiterlimit: js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber] = js.undefined
  var strokeOpacity: js.UndefOr[csstypeLib.csstypeMod.GlobalsNumber] = js.undefined
  var strokeWidth: js.UndefOr[csstypeLib.csstypeMod.StrokeWidthProperty[scala.Double | java.lang.String]] = js.undefined
  var textAnchor: js.UndefOr[csstypeLib.csstypeMod.TextAnchorProperty] = js.undefined
  var vectorEffect: js.UndefOr[csstypeLib.csstypeMod.VectorEffectProperty] = js.undefined
}

object CSSProperties {
  @scala.inline
  def apply(
    StandardProperties: csstypeLib.csstypeMod.StandardProperties[scala.Double | java.lang.String] = null,
    SvgProperties: csstypeLib.csstypeMod.SvgProperties[scala.Double | java.lang.String] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StandardProperties)
    js.Dynamic.global.Object.assign(__obj, SvgProperties)
    __obj.asInstanceOf[CSSProperties]
  }
}

