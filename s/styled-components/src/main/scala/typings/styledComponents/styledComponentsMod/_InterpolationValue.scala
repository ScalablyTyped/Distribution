package typings.styledComponents.styledComponentsMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.AlignmentBaselineProperty
import typings.csstype.mod.BaselineShiftProperty
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
import typings.csstype.mod.ObsoleteProperties
import typings.csstype.mod.ShapeRenderingProperty
import typings.csstype.mod.StandardLonghandProperties
import typings.csstype.mod.StandardShorthandProperties
import typings.csstype.mod.StopColorProperty
import typings.csstype.mod.StrokeDasharrayProperty
import typings.csstype.mod.StrokeDashoffsetProperty
import typings.csstype.mod.StrokeLinecapProperty
import typings.csstype.mod.StrokeLinejoinProperty
import typings.csstype.mod.StrokeProperty
import typings.csstype.mod.StrokeWidthProperty
import typings.csstype.mod.TextAnchorProperty
import typings.csstype.mod.VectorEffectProperty
import typings.csstype.mod.VendorLonghandProperties
import typings.csstype.mod.VendorShorthandProperties
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InterpolationValue
  extends _Interpolation[js.Any]
     with _SimpleInterpolation

object _InterpolationValue {
  @scala.inline
  def Keyframes_(getName: () => String): _InterpolationValue = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName))
  
    __obj.asInstanceOf[_InterpolationValue]
  }
  @scala.inline
  def CSSObject(
    CSSPseudos: CSSPseudos = null,
    ObsoleteProperties: ObsoleteProperties[String | Double] = null,
    StandardLonghandProperties: StandardLonghandProperties[String | Double] = null,
    StandardShorthandProperties: StandardShorthandProperties[String | Double] = null,
    StringDictionary: /* key */ StringDictionary[
      js.UndefOr[typings.styledComponents.styledComponentsMod.CSSObject | String | Double]
    ] = null,
    VendorLonghandProperties: VendorLonghandProperties[String | Double] = null,
    VendorShorthandProperties: VendorShorthandProperties[String | Double] = null,
    alignmentBaseline: AlignmentBaselineProperty = null,
    baselineShift: BaselineShiftProperty[String | Double] = null,
    clipRule: ClipRuleProperty = null,
    colorInterpolation: ColorInterpolationProperty = null,
    colorRendering: ColorRenderingProperty = null,
    dominantBaseline: DominantBaselineProperty = null,
    fill: FillProperty = null,
    fillOpacity: GlobalsNumber = null,
    fillRule: FillRuleProperty = null,
    floodColor: FloodColorProperty = null,
    floodOpacity: GlobalsNumber = null,
    glyphOrientationVertical: GlyphOrientationVerticalProperty = null,
    lightingColor: LightingColorProperty = null,
    marker: MarkerProperty = null,
    markerEnd: MarkerEndProperty = null,
    markerMid: MarkerMidProperty = null,
    markerStart: MarkerStartProperty = null,
    shapeRendering: ShapeRenderingProperty = null,
    stopColor: StopColorProperty = null,
    stopOpacity: GlobalsNumber = null,
    stroke: StrokeProperty = null,
    strokeDasharray: StrokeDasharrayProperty[String | Double] = null,
    strokeDashoffset: StrokeDashoffsetProperty[String | Double] = null,
    strokeLinecap: StrokeLinecapProperty = null,
    strokeLinejoin: StrokeLinejoinProperty = null,
    strokeMiterlimit: GlobalsNumber = null,
    strokeOpacity: GlobalsNumber = null,
    strokeWidth: StrokeWidthProperty[String | Double] = null,
    textAnchor: TextAnchorProperty = null,
    vectorEffect: VectorEffectProperty = null
  ): _InterpolationValue = {
    val __obj = js.Dynamic.literal()
    if (CSSPseudos != null) js.Dynamic.global.Object.assign(__obj, CSSPseudos)
    if (ObsoleteProperties != null) js.Dynamic.global.Object.assign(__obj, ObsoleteProperties)
    if (StandardLonghandProperties != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandProperties)
    if (StandardShorthandProperties != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandProperties)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (VendorLonghandProperties != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandProperties)
    if (VendorShorthandProperties != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandProperties)
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InterpolationValue]
  }
  @scala.inline
  def PickStyledComponentBasean(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      _ | StyledComponentInnerAttrs[AnyStyledComponent]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, _]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, _]] = null
  ): _InterpolationValue = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InterpolationValue]
  }
  @scala.inline
  def PickStyledComponentBaseanDefaultProps(
    DollarDollartypeof: js.Symbol,
    withComponent: /* component */ AnyStyledComponent => StyledComponent[
      StyledComponentInnerComponent[AnyStyledComponent], 
      _, 
      js.Any with StyledComponentInnerOtherProps[AnyStyledComponent], 
      scala.Nothing | StyledComponentInnerAttrs[AnyStyledComponent]
    ],
    defaultProps: Partial[StyledComponentProps[_, _, _, scala.Nothing]] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[StyledComponentProps[_, _, _, scala.Nothing]] = null
  ): _InterpolationValue = {
    val __obj = js.Dynamic.literal(withComponent = js.Any.fromFunction1(withComponent))
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[_InterpolationValue]
  }
}

