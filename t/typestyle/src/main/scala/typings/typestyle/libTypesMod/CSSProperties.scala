package typings.typestyle.libTypesMod

import typings.csstype.csstypeMod.AlignmentBaselineProperty
import typings.csstype.csstypeMod.AnimationDirectionProperty
import typings.csstype.csstypeMod.AnimationFillModeProperty
import typings.csstype.csstypeMod.AnimationIterationCountProperty
import typings.csstype.csstypeMod.AnimationNameProperty
import typings.csstype.csstypeMod.AnimationPlayStateProperty
import typings.csstype.csstypeMod.AnimationProperty
import typings.csstype.csstypeMod.AnimationTimingFunctionProperty
import typings.csstype.csstypeMod.BackgroundClipProperty
import typings.csstype.csstypeMod.BackgroundOriginProperty
import typings.csstype.csstypeMod.BackgroundSizeProperty
import typings.csstype.csstypeMod.BaselineShiftProperty
import typings.csstype.csstypeMod.BorderBottomLeftRadiusProperty
import typings.csstype.csstypeMod.BorderBottomRightRadiusProperty
import typings.csstype.csstypeMod.BorderImageProperty
import typings.csstype.csstypeMod.BorderRadiusProperty
import typings.csstype.csstypeMod.BorderTopLeftRadiusProperty
import typings.csstype.csstypeMod.BorderTopRightRadiusProperty
import typings.csstype.csstypeMod.BoxAlignProperty
import typings.csstype.csstypeMod.BoxDecorationBreakProperty
import typings.csstype.csstypeMod.BoxDirectionProperty
import typings.csstype.csstypeMod.BoxLinesProperty
import typings.csstype.csstypeMod.BoxOrientProperty
import typings.csstype.csstypeMod.BoxPackProperty
import typings.csstype.csstypeMod.BoxShadowProperty
import typings.csstype.csstypeMod.ClipProperty
import typings.csstype.csstypeMod.ClipRuleProperty
import typings.csstype.csstypeMod.ColorInterpolationProperty
import typings.csstype.csstypeMod.ColorRenderingProperty
import typings.csstype.csstypeMod.DominantBaselineProperty
import typings.csstype.csstypeMod.FillProperty
import typings.csstype.csstypeMod.FillRuleProperty
import typings.csstype.csstypeMod.FloodColorProperty
import typings.csstype.csstypeMod.FontVariantAlternatesProperty
import typings.csstype.csstypeMod.GlobalsNumber
import typings.csstype.csstypeMod.GlobalsString
import typings.csstype.csstypeMod.GlyphOrientationVerticalProperty
import typings.csstype.csstypeMod.GridColumnGapProperty
import typings.csstype.csstypeMod.GridGapProperty
import typings.csstype.csstypeMod.GridRowGapProperty
import typings.csstype.csstypeMod.ImeModeProperty
import typings.csstype.csstypeMod.InsetBlockEndProperty
import typings.csstype.csstypeMod.InsetBlockProperty
import typings.csstype.csstypeMod.InsetBlockStartProperty
import typings.csstype.csstypeMod.InsetInlineEndProperty
import typings.csstype.csstypeMod.InsetInlineProperty
import typings.csstype.csstypeMod.InsetInlineStartProperty
import typings.csstype.csstypeMod.LightingColorProperty
import typings.csstype.csstypeMod.LineBreakProperty
import typings.csstype.csstypeMod.MarkerEndProperty
import typings.csstype.csstypeMod.MarkerMidProperty
import typings.csstype.csstypeMod.MarkerProperty
import typings.csstype.csstypeMod.MarkerStartProperty
import typings.csstype.csstypeMod.MozBindingProperty
import typings.csstype.csstypeMod.MozOutlineRadiusProperty
import typings.csstype.csstypeMod.MozTextBlinkProperty
import typings.csstype.csstypeMod.MozUserInputProperty
import typings.csstype.csstypeMod.MozWindowShadowProperty
import typings.csstype.csstypeMod.ObsoletePropertiesFallback
import typings.csstype.csstypeMod.OutlineColorProperty
import typings.csstype.csstypeMod.OutlineProperty
import typings.csstype.csstypeMod.OutlineStyleProperty
import typings.csstype.csstypeMod.OutlineWidthProperty
import typings.csstype.csstypeMod.ScrollSnapCoordinateProperty
import typings.csstype.csstypeMod.ScrollSnapDestinationProperty
import typings.csstype.csstypeMod.ScrollSnapPointsXProperty
import typings.csstype.csstypeMod.ScrollSnapPointsYProperty
import typings.csstype.csstypeMod.ScrollSnapTypeXProperty
import typings.csstype.csstypeMod.ScrollSnapTypeYProperty
import typings.csstype.csstypeMod.ShapeRenderingProperty
import typings.csstype.csstypeMod.StandardPropertiesFallback
import typings.csstype.csstypeMod.StopColorProperty
import typings.csstype.csstypeMod.StrokeDasharrayProperty
import typings.csstype.csstypeMod.StrokeDashoffsetProperty
import typings.csstype.csstypeMod.StrokeLinecapProperty
import typings.csstype.csstypeMod.StrokeLinejoinProperty
import typings.csstype.csstypeMod.StrokeProperty
import typings.csstype.csstypeMod.StrokeWidthProperty
import typings.csstype.csstypeMod.SvgPropertiesFallback
import typings.csstype.csstypeMod.TextAlignLastProperty
import typings.csstype.csstypeMod.TextAnchorProperty
import typings.csstype.csstypeMod.TextCombineUprightProperty
import typings.csstype.csstypeMod.TextDecorationColorProperty
import typings.csstype.csstypeMod.TextDecorationLineProperty
import typings.csstype.csstypeMod.TextDecorationStyleProperty
import typings.csstype.csstypeMod.TransformProperty
import typings.csstype.csstypeMod.TransitionProperty
import typings.csstype.csstypeMod.TransitionPropertyProperty
import typings.csstype.csstypeMod.TransitionTimingFunctionProperty
import typings.csstype.csstypeMod.UserSelectProperty
import typings.csstype.csstypeMod.VectorEffectProperty
import typings.csstype.csstypeMod.VendorPropertiesHyphenFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.csstypeMod.ObsoletePropertiesFallback because var conflicts: clip. Inlined KhtmlBoxAlign, KhtmlBoxDirection, KhtmlBoxFlex, KhtmlBoxFlexGroup, KhtmlBoxLines, KhtmlBoxOrdinalGroup, KhtmlBoxOrient, KhtmlBoxPack, KhtmlLineBreak, KhtmlOpacity, KhtmlUserSelect, MozBackgroundClip, MozBackgroundInlinePolicy, MozBackgroundOrigin, MozBackgroundSize, MozBinding, MozBorderRadius, MozBorderRadiusBottomleft, MozBorderRadiusBottomright, MozBorderRadiusTopleft, MozBorderRadiusTopright, MozBoxAlign, MozBoxDirection, MozBoxFlex, MozBoxOrdinalGroup, MozBoxOrient, MozBoxPack, MozBoxShadow, MozOpacity, MozOutline, MozOutlineColor, MozOutlineRadius, MozOutlineStyle, MozOutlineWidth, MozTextAlignLast, MozTextBlink, MozTextDecorationColor, MozTextDecorationLine, MozTextDecorationStyle, MozUserInput, MozWindowShadow, OAnimation, OAnimationDelay, OAnimationDirection, OAnimationDuration, OAnimationFillMode, OAnimationIterationCount, OAnimationName, OAnimationPlayState, OAnimationTimingFunction, OBackgroundSize, OBorderImage, OTransform, OTransition, OTransitionDelay, OTransitionDuration, OTransitionProperty, OTransitionTimingFunction, WebkitBoxAlign, WebkitBoxDirection, WebkitBoxFlex, WebkitBoxFlexGroup, WebkitBoxLines, WebkitBoxOrdinalGroup, WebkitBoxOrient, WebkitBoxPack, WebkitScrollSnapPointsX, WebkitScrollSnapPointsY, boxAlign, boxDirection, boxFlex, boxFlexGroup, boxLines, boxOrdinalGroup, boxOrient, boxPack, fontVariantAlternates, gridColumnGap, gridGap, gridRowGap, imeMode, msImeMode, offsetBlock, offsetBlockEnd, offsetBlockStart, offsetInline, offsetInlineEnd, offsetInlineStart, scrollSnapCoordinate, scrollSnapDestination, scrollSnapPointsX, scrollSnapPointsY, scrollSnapTypeX, scrollSnapTypeY, textCombineHorizontal- typings.csstype.csstypeMod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait CSSProperties
  extends StandardPropertiesFallback[TLength]
     with VendorPropertiesHyphenFallback[TLength] {
  /**
    * Typestyle configuration options
    **/
  /**
    * The generated CSS selector gets its own unique location in the generated CSS (disables deduping).
    * So instead of `.classA,.classB{same properties}`
    * you get `.classA {same properties} .classB {same properties}`
    * This is needed for certain browser edge cases like placeholder styling
    **/
  @JSName("$unique")
  var $unique: js.UndefOr[Boolean] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.undefined
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.undefined
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.undefined
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.undefined
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.undefined
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.undefined
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.undefined
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[MozBindingProperty | js.Array[MozBindingProperty]] = js.undefined
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.undefined
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[
    BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[
    BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[
    BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[
    BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.undefined
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.undefined
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.undefined
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.undefined
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]] = js.undefined
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.undefined
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.undefined
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.undefined
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextBlink: js.UndefOr[MozTextBlinkProperty | js.Array[MozTextBlinkProperty]] = js.undefined
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.undefined
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.undefined
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.undefined
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[MozUserInputProperty | js.Array[MozUserInputProperty]] = js.undefined
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Initial value**: `default`
    *
    * @deprecated
    */
  var MozWindowShadow: js.UndefOr[MozWindowShadowProperty | js.Array[MozWindowShadowProperty]] = js.undefined
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.undefined
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.undefined
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.undefined
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.undefined
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.undefined
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.undefined
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.undefined
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.undefined
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.undefined
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.undefined
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.undefined
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.undefined
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.undefined
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.undefined
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.undefined
  var baselineShift: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.undefined
  var clip: js.UndefOr[ClipProperty | js.Array[ClipProperty]] = js.undefined
  var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.undefined
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.undefined
  var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.undefined
  var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.undefined
  var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.undefined
  var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.undefined
  var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.undefined
  var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]] = js.undefined
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.undefined
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]] = js.undefined
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]] = js.undefined
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]] = js.undefined
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.undefined
  var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.undefined
  var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.undefined
  var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.undefined
  var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.undefined
  var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.undefined
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.undefined
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.undefined
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.undefined
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.undefined
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.undefined
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.undefined
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.undefined
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[
    ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]
  ] = js.undefined
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[
    ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]
  ] = js.undefined
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.undefined
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.undefined
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]] = js.undefined
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]] = js.undefined
  var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.undefined
  var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.undefined
  var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.undefined
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.undefined
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.undefined
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.undefined
  var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.undefined
  var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.undefined
  var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.undefined
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.undefined
  var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.undefined
}

object CSSProperties {
  @scala.inline
  def apply(
    $unique: js.UndefOr[Boolean] = js.undefined,
    ObsoletePropertiesFallback: ObsoletePropertiesFallback[TLength] = null,
    StandardPropertiesFallback: StandardPropertiesFallback[TLength] = null,
    SvgPropertiesFallback: SvgPropertiesFallback[TLength] = null,
    VendorPropertiesHyphenFallback: VendorPropertiesHyphenFallback[TLength] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($unique)) __obj.updateDynamic("$unique")($unique)
    js.Dynamic.global.Object.assign(__obj, ObsoletePropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, StandardPropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, SvgPropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, VendorPropertiesHyphenFallback)
    __obj.asInstanceOf[CSSProperties]
  }
}

