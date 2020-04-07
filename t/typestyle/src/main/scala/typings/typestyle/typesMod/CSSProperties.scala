package typings.typestyle.typesMod

import typings.csstype.mod.AlignmentBaselineProperty
import typings.csstype.mod.AnimationDirectionProperty
import typings.csstype.mod.AnimationFillModeProperty
import typings.csstype.mod.AnimationIterationCountProperty
import typings.csstype.mod.AnimationNameProperty
import typings.csstype.mod.AnimationPlayStateProperty
import typings.csstype.mod.AnimationProperty
import typings.csstype.mod.AnimationTimingFunctionProperty
import typings.csstype.mod.BackgroundClipProperty
import typings.csstype.mod.BackgroundOriginProperty
import typings.csstype.mod.BackgroundSizeProperty
import typings.csstype.mod.BaselineShiftProperty
import typings.csstype.mod.BorderBottomLeftRadiusProperty
import typings.csstype.mod.BorderBottomRightRadiusProperty
import typings.csstype.mod.BorderImageProperty
import typings.csstype.mod.BorderRadiusProperty
import typings.csstype.mod.BorderTopLeftRadiusProperty
import typings.csstype.mod.BorderTopRightRadiusProperty
import typings.csstype.mod.BoxAlignProperty
import typings.csstype.mod.BoxDecorationBreakProperty
import typings.csstype.mod.BoxDirectionProperty
import typings.csstype.mod.BoxLinesProperty
import typings.csstype.mod.BoxOrientProperty
import typings.csstype.mod.BoxPackProperty
import typings.csstype.mod.BoxShadowProperty
import typings.csstype.mod.ClipProperty
import typings.csstype.mod.ClipRuleProperty
import typings.csstype.mod.ColorInterpolationProperty
import typings.csstype.mod.ColorRenderingProperty
import typings.csstype.mod.DominantBaselineProperty
import typings.csstype.mod.FillProperty
import typings.csstype.mod.FillRuleProperty
import typings.csstype.mod.FloodColorProperty
import typings.csstype.mod.FontVariantAlternatesProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.GlobalsString
import typings.csstype.mod.GlyphOrientationVerticalProperty
import typings.csstype.mod.GridColumnGapProperty
import typings.csstype.mod.GridGapProperty
import typings.csstype.mod.GridRowGapProperty
import typings.csstype.mod.ImeModeProperty
import typings.csstype.mod.InsetBlockEndProperty
import typings.csstype.mod.InsetBlockProperty
import typings.csstype.mod.InsetBlockStartProperty
import typings.csstype.mod.InsetInlineEndProperty
import typings.csstype.mod.InsetInlineProperty
import typings.csstype.mod.InsetInlineStartProperty
import typings.csstype.mod.LightingColorProperty
import typings.csstype.mod.LineBreakProperty
import typings.csstype.mod.MarkerEndProperty
import typings.csstype.mod.MarkerMidProperty
import typings.csstype.mod.MarkerProperty
import typings.csstype.mod.MarkerStartProperty
import typings.csstype.mod.MozBindingProperty
import typings.csstype.mod.MozBorderBottomColorsProperty
import typings.csstype.mod.MozBorderLeftColorsProperty
import typings.csstype.mod.MozBorderRightColorsProperty
import typings.csstype.mod.MozBorderTopColorsProperty
import typings.csstype.mod.MozOutlineRadiusProperty
import typings.csstype.mod.MozTextBlinkProperty
import typings.csstype.mod.MozUserInputProperty
import typings.csstype.mod.MozWindowShadowProperty
import typings.csstype.mod.MsScrollbarTrackColorProperty
import typings.csstype.mod.OpacityProperty
import typings.csstype.mod.OutlineColorProperty
import typings.csstype.mod.OutlineProperty
import typings.csstype.mod.OutlineStyleProperty
import typings.csstype.mod.OutlineWidthProperty
import typings.csstype.mod.ScrollSnapCoordinateProperty
import typings.csstype.mod.ScrollSnapDestinationProperty
import typings.csstype.mod.ScrollSnapPointsXProperty
import typings.csstype.mod.ScrollSnapPointsYProperty
import typings.csstype.mod.ScrollSnapTypeXProperty
import typings.csstype.mod.ScrollSnapTypeYProperty
import typings.csstype.mod.ShapeRenderingProperty
import typings.csstype.mod.StandardLonghandPropertiesFallback
import typings.csstype.mod.StandardShorthandPropertiesFallback
import typings.csstype.mod.StopColorProperty
import typings.csstype.mod.StrokeDasharrayProperty
import typings.csstype.mod.StrokeDashoffsetProperty
import typings.csstype.mod.StrokeLinecapProperty
import typings.csstype.mod.StrokeLinejoinProperty
import typings.csstype.mod.StrokeProperty
import typings.csstype.mod.StrokeWidthProperty
import typings.csstype.mod.TextAlignLastProperty
import typings.csstype.mod.TextAnchorProperty
import typings.csstype.mod.TextCombineUprightProperty
import typings.csstype.mod.TextDecorationColorProperty
import typings.csstype.mod.TextDecorationLineProperty
import typings.csstype.mod.TextDecorationStyleProperty
import typings.csstype.mod.TransformProperty
import typings.csstype.mod.TransitionProperty
import typings.csstype.mod.TransitionPropertyProperty
import typings.csstype.mod.TransitionTimingFunctionProperty
import typings.csstype.mod.UserSelectProperty
import typings.csstype.mod.VectorEffectProperty
import typings.csstype.mod.VendorLonghandPropertiesHyphenFallback
import typings.csstype.mod.VendorShorthandPropertiesHyphenFallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.mod.ObsoletePropertiesFallback because var conflicts: clip. Inlined KhtmlBoxAlign, KhtmlBoxDirection, KhtmlBoxFlex, KhtmlBoxFlexGroup, KhtmlBoxLines, KhtmlBoxOrdinalGroup, KhtmlBoxOrient, KhtmlBoxPack, KhtmlLineBreak, KhtmlOpacity, KhtmlUserSelect, MozBackgroundClip, MozBackgroundInlinePolicy, MozBackgroundOrigin, MozBackgroundSize, MozBinding, MozBorderBottomColors, MozBorderLeftColors, MozBorderRadius, MozBorderRadiusBottomleft, MozBorderRadiusBottomright, MozBorderRadiusTopleft, MozBorderRadiusTopright, MozBorderRightColors, MozBorderTopColors, MozBoxAlign, MozBoxDirection, MozBoxFlex, MozBoxOrdinalGroup, MozBoxOrient, MozBoxPack, MozBoxShadow, MozOpacity, MozOutline, MozOutlineColor, MozOutlineRadius, MozOutlineStyle, MozOutlineWidth, MozTextAlignLast, MozTextBlink, MozTextDecorationColor, MozTextDecorationLine, MozTextDecorationStyle, MozUserInput, MozWindowShadow, OAnimation, OAnimationDelay, OAnimationDirection, OAnimationDuration, OAnimationFillMode, OAnimationIterationCount, OAnimationName, OAnimationPlayState, OAnimationTimingFunction, OBackgroundSize, OBorderImage, OTransform, OTransition, OTransitionDelay, OTransitionDuration, OTransitionProperty, OTransitionTimingFunction, WebkitBoxAlign, WebkitBoxDirection, WebkitBoxFlex, WebkitBoxFlexGroup, WebkitBoxLines, WebkitBoxOrdinalGroup, WebkitBoxOrient, WebkitBoxPack, WebkitScrollSnapPointsX, WebkitScrollSnapPointsY, boxAlign, boxDirection, boxFlex, boxFlexGroup, boxLines, boxOrdinalGroup, boxOrient, boxPack, fontVariantAlternates, gridColumnGap, gridGap, gridRowGap, imeMode, msImeMode, msScrollbarTrackColor, offsetBlock, offsetBlockEnd, offsetBlockStart, offsetInline, offsetInlineEnd, offsetInlineStart, scrollSnapCoordinate, scrollSnapDestination, scrollSnapPointsX, scrollSnapPointsY, scrollSnapTypeX, scrollSnapTypeY, scrollbarTrackColor, textCombineHorizontal
- typings.csstype.mod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait CSSProperties
  extends StandardLonghandPropertiesFallback[TLength]
     with StandardShorthandPropertiesFallback[TLength]
     with VendorLonghandPropertiesHyphenFallback[TLength]
     with VendorShorthandPropertiesHyphenFallback[TLength] {
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
  var KhtmlOpacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.undefined
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
    * In Mozilla applications like Firefox, the **`-moz-border-bottom-colors`** CSS property sets a list of colors for the bottom border.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBorderBottomColors: js.UndefOr[MozBorderBottomColorsProperty | js.Array[MozBorderBottomColorsProperty]] = js.undefined
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-left-colors`** CSS property sets a list of colors for the left border.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBorderLeftColors: js.UndefOr[MozBorderLeftColorsProperty | js.Array[MozBorderLeftColorsProperty]] = js.undefined
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
    * In Mozilla applications like Firefox, the **`-moz-border-right-colors`** CSS property sets a list of colors for the right border.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBorderRightColors: js.UndefOr[MozBorderRightColorsProperty | js.Array[MozBorderRightColorsProperty]] = js.undefined
  /**
    * In Mozilla applications like Firefox, the **`-moz-border-top-colors`** CSS property sets a list of colors for the top border.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBorderTopColors: js.UndefOr[MozBorderTopColorsProperty | js.Array[MozBorderTopColorsProperty]] = js.undefined
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
  var MozOpacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.undefined
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
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var msScrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.undefined
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
  /**
    * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
    *
    * **Initial value**: `Scrollbar`
    *
    * @deprecated
    */
  var scrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.undefined
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
    KhtmlBoxAlign: BoxAlignProperty | js.Array[BoxAlignProperty] = null,
    KhtmlBoxDirection: BoxDirectionProperty | js.Array[BoxDirectionProperty] = null,
    KhtmlBoxFlex: GlobalsNumber | js.Array[GlobalsNumber] = null,
    KhtmlBoxFlexGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    KhtmlBoxLines: BoxLinesProperty | js.Array[BoxLinesProperty] = null,
    KhtmlBoxOrdinalGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    KhtmlBoxOrient: BoxOrientProperty | js.Array[BoxOrientProperty] = null,
    KhtmlBoxPack: BoxPackProperty | js.Array[BoxPackProperty] = null,
    KhtmlLineBreak: LineBreakProperty | js.Array[LineBreakProperty] = null,
    KhtmlOpacity: OpacityProperty | js.Array[OpacityProperty] = null,
    KhtmlUserSelect: UserSelectProperty | js.Array[UserSelectProperty] = null,
    MozBackgroundClip: BackgroundClipProperty | js.Array[BackgroundClipProperty] = null,
    MozBackgroundInlinePolicy: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty] = null,
    MozBackgroundOrigin: BackgroundOriginProperty | js.Array[BackgroundOriginProperty] = null,
    MozBackgroundSize: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]] = null,
    MozBinding: MozBindingProperty | js.Array[MozBindingProperty] = null,
    MozBorderBottomColors: MozBorderBottomColorsProperty | js.Array[MozBorderBottomColorsProperty] = null,
    MozBorderLeftColors: MozBorderLeftColorsProperty | js.Array[MozBorderLeftColorsProperty] = null,
    MozBorderRadius: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]] = null,
    MozBorderRadiusBottomleft: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]] = null,
    MozBorderRadiusBottomright: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]] = null,
    MozBorderRadiusTopleft: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]] = null,
    MozBorderRadiusTopright: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]] = null,
    MozBorderRightColors: MozBorderRightColorsProperty | js.Array[MozBorderRightColorsProperty] = null,
    MozBorderTopColors: MozBorderTopColorsProperty | js.Array[MozBorderTopColorsProperty] = null,
    MozBoxAlign: BoxAlignProperty | js.Array[BoxAlignProperty] = null,
    MozBoxDirection: BoxDirectionProperty | js.Array[BoxDirectionProperty] = null,
    MozBoxFlex: GlobalsNumber | js.Array[GlobalsNumber] = null,
    MozBoxOrdinalGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    MozBoxOrient: BoxOrientProperty | js.Array[BoxOrientProperty] = null,
    MozBoxPack: BoxPackProperty | js.Array[BoxPackProperty] = null,
    MozBoxShadow: BoxShadowProperty | js.Array[BoxShadowProperty] = null,
    MozOpacity: OpacityProperty | js.Array[OpacityProperty] = null,
    MozOutline: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]] = null,
    MozOutlineColor: OutlineColorProperty | js.Array[OutlineColorProperty] = null,
    MozOutlineRadius: MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]] = null,
    MozOutlineStyle: OutlineStyleProperty | js.Array[OutlineStyleProperty] = null,
    MozOutlineWidth: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]] = null,
    MozTextAlignLast: TextAlignLastProperty | js.Array[TextAlignLastProperty] = null,
    MozTextBlink: MozTextBlinkProperty | js.Array[MozTextBlinkProperty] = null,
    MozTextDecorationColor: TextDecorationColorProperty | js.Array[TextDecorationColorProperty] = null,
    MozTextDecorationLine: TextDecorationLineProperty | js.Array[TextDecorationLineProperty] = null,
    MozTextDecorationStyle: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty] = null,
    MozUserInput: MozUserInputProperty | js.Array[MozUserInputProperty] = null,
    MozWindowShadow: MozWindowShadowProperty | js.Array[MozWindowShadowProperty] = null,
    OAnimation: AnimationProperty | js.Array[AnimationProperty] = null,
    OAnimationDelay: GlobalsString | js.Array[GlobalsString] = null,
    OAnimationDirection: AnimationDirectionProperty | js.Array[AnimationDirectionProperty] = null,
    OAnimationDuration: GlobalsString | js.Array[GlobalsString] = null,
    OAnimationFillMode: AnimationFillModeProperty | js.Array[AnimationFillModeProperty] = null,
    OAnimationIterationCount: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty] = null,
    OAnimationName: AnimationNameProperty | js.Array[AnimationNameProperty] = null,
    OAnimationPlayState: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty] = null,
    OAnimationTimingFunction: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty] = null,
    OBackgroundSize: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]] = null,
    OBorderImage: BorderImageProperty | js.Array[BorderImageProperty] = null,
    OTransform: TransformProperty | js.Array[TransformProperty] = null,
    OTransition: TransitionProperty | js.Array[TransitionProperty] = null,
    OTransitionDelay: GlobalsString | js.Array[GlobalsString] = null,
    OTransitionDuration: GlobalsString | js.Array[GlobalsString] = null,
    OTransitionProperty: TransitionPropertyProperty | js.Array[TransitionPropertyProperty] = null,
    OTransitionTimingFunction: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty] = null,
    StandardLonghandPropertiesFallback: StandardLonghandPropertiesFallback[TLength] = null,
    StandardShorthandPropertiesFallback: StandardShorthandPropertiesFallback[TLength] = null,
    VendorLonghandPropertiesHyphenFallback: VendorLonghandPropertiesHyphenFallback[TLength] = null,
    VendorShorthandPropertiesHyphenFallback: VendorShorthandPropertiesHyphenFallback[TLength] = null,
    WebkitBoxAlign: BoxAlignProperty | js.Array[BoxAlignProperty] = null,
    WebkitBoxDirection: BoxDirectionProperty | js.Array[BoxDirectionProperty] = null,
    WebkitBoxFlex: GlobalsNumber | js.Array[GlobalsNumber] = null,
    WebkitBoxFlexGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    WebkitBoxLines: BoxLinesProperty | js.Array[BoxLinesProperty] = null,
    WebkitBoxOrdinalGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    WebkitBoxOrient: BoxOrientProperty | js.Array[BoxOrientProperty] = null,
    WebkitBoxPack: BoxPackProperty | js.Array[BoxPackProperty] = null,
    WebkitScrollSnapPointsX: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty] = null,
    WebkitScrollSnapPointsY: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty] = null,
    alignmentBaseline: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty] = null,
    baselineShift: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]] = null,
    boxAlign: BoxAlignProperty | js.Array[BoxAlignProperty] = null,
    boxDirection: BoxDirectionProperty | js.Array[BoxDirectionProperty] = null,
    boxFlex: GlobalsNumber | js.Array[GlobalsNumber] = null,
    boxFlexGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    boxLines: BoxLinesProperty | js.Array[BoxLinesProperty] = null,
    boxOrdinalGroup: GlobalsNumber | js.Array[GlobalsNumber] = null,
    boxOrient: BoxOrientProperty | js.Array[BoxOrientProperty] = null,
    boxPack: BoxPackProperty | js.Array[BoxPackProperty] = null,
    clip: ClipProperty | js.Array[ClipProperty] = null,
    clipRule: ClipRuleProperty | js.Array[ClipRuleProperty] = null,
    colorInterpolation: ColorInterpolationProperty | js.Array[ColorInterpolationProperty] = null,
    colorRendering: ColorRenderingProperty | js.Array[ColorRenderingProperty] = null,
    dominantBaseline: DominantBaselineProperty | js.Array[DominantBaselineProperty] = null,
    fill: FillProperty | js.Array[FillProperty] = null,
    fillOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    fillRule: FillRuleProperty | js.Array[FillRuleProperty] = null,
    floodColor: FloodColorProperty | js.Array[FloodColorProperty] = null,
    floodOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    fontVariantAlternates: FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty] = null,
    glyphOrientationVertical: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty] = null,
    gridColumnGap: GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]] = null,
    gridGap: GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]] = null,
    gridRowGap: GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]] = null,
    imeMode: ImeModeProperty | js.Array[ImeModeProperty] = null,
    lightingColor: LightingColorProperty | js.Array[LightingColorProperty] = null,
    marker: MarkerProperty | js.Array[MarkerProperty] = null,
    markerEnd: MarkerEndProperty | js.Array[MarkerEndProperty] = null,
    markerMid: MarkerMidProperty | js.Array[MarkerMidProperty] = null,
    markerStart: MarkerStartProperty | js.Array[MarkerStartProperty] = null,
    msImeMode: ImeModeProperty | js.Array[ImeModeProperty] = null,
    msScrollbarTrackColor: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty] = null,
    offsetBlock: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]] = null,
    offsetBlockEnd: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]] = null,
    offsetBlockStart: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]] = null,
    offsetInline: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]] = null,
    offsetInlineEnd: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]] = null,
    offsetInlineStart: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]] = null,
    scrollSnapCoordinate: ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]] = null,
    scrollSnapDestination: ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]] = null,
    scrollSnapPointsX: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty] = null,
    scrollSnapPointsY: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty] = null,
    scrollSnapTypeX: ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty] = null,
    scrollSnapTypeY: ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty] = null,
    scrollbarTrackColor: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty] = null,
    shapeRendering: ShapeRenderingProperty | js.Array[ShapeRenderingProperty] = null,
    stopColor: StopColorProperty | js.Array[StopColorProperty] = null,
    stopOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    stroke: StrokeProperty | js.Array[StrokeProperty] = null,
    strokeDasharray: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]] = null,
    strokeDashoffset: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]] = null,
    strokeLinecap: StrokeLinecapProperty | js.Array[StrokeLinecapProperty] = null,
    strokeLinejoin: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty] = null,
    strokeMiterlimit: GlobalsNumber | js.Array[GlobalsNumber] = null,
    strokeOpacity: GlobalsNumber | js.Array[GlobalsNumber] = null,
    strokeWidth: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]] = null,
    textAnchor: TextAnchorProperty | js.Array[TextAnchorProperty] = null,
    textCombineHorizontal: TextCombineUprightProperty | js.Array[TextCombineUprightProperty] = null,
    vectorEffect: VectorEffectProperty | js.Array[VectorEffectProperty] = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($unique)) __obj.updateDynamic("$unique")($unique.asInstanceOf[js.Any])
    if (KhtmlBoxAlign != null) __obj.updateDynamic("KhtmlBoxAlign")(KhtmlBoxAlign.asInstanceOf[js.Any])
    if (KhtmlBoxDirection != null) __obj.updateDynamic("KhtmlBoxDirection")(KhtmlBoxDirection.asInstanceOf[js.Any])
    if (KhtmlBoxFlex != null) __obj.updateDynamic("KhtmlBoxFlex")(KhtmlBoxFlex.asInstanceOf[js.Any])
    if (KhtmlBoxFlexGroup != null) __obj.updateDynamic("KhtmlBoxFlexGroup")(KhtmlBoxFlexGroup.asInstanceOf[js.Any])
    if (KhtmlBoxLines != null) __obj.updateDynamic("KhtmlBoxLines")(KhtmlBoxLines.asInstanceOf[js.Any])
    if (KhtmlBoxOrdinalGroup != null) __obj.updateDynamic("KhtmlBoxOrdinalGroup")(KhtmlBoxOrdinalGroup.asInstanceOf[js.Any])
    if (KhtmlBoxOrient != null) __obj.updateDynamic("KhtmlBoxOrient")(KhtmlBoxOrient.asInstanceOf[js.Any])
    if (KhtmlBoxPack != null) __obj.updateDynamic("KhtmlBoxPack")(KhtmlBoxPack.asInstanceOf[js.Any])
    if (KhtmlLineBreak != null) __obj.updateDynamic("KhtmlLineBreak")(KhtmlLineBreak.asInstanceOf[js.Any])
    if (KhtmlOpacity != null) __obj.updateDynamic("KhtmlOpacity")(KhtmlOpacity.asInstanceOf[js.Any])
    if (KhtmlUserSelect != null) __obj.updateDynamic("KhtmlUserSelect")(KhtmlUserSelect.asInstanceOf[js.Any])
    if (MozBackgroundClip != null) __obj.updateDynamic("MozBackgroundClip")(MozBackgroundClip.asInstanceOf[js.Any])
    if (MozBackgroundInlinePolicy != null) __obj.updateDynamic("MozBackgroundInlinePolicy")(MozBackgroundInlinePolicy.asInstanceOf[js.Any])
    if (MozBackgroundOrigin != null) __obj.updateDynamic("MozBackgroundOrigin")(MozBackgroundOrigin.asInstanceOf[js.Any])
    if (MozBackgroundSize != null) __obj.updateDynamic("MozBackgroundSize")(MozBackgroundSize.asInstanceOf[js.Any])
    if (MozBinding != null) __obj.updateDynamic("MozBinding")(MozBinding.asInstanceOf[js.Any])
    if (MozBorderBottomColors != null) __obj.updateDynamic("MozBorderBottomColors")(MozBorderBottomColors.asInstanceOf[js.Any])
    if (MozBorderLeftColors != null) __obj.updateDynamic("MozBorderLeftColors")(MozBorderLeftColors.asInstanceOf[js.Any])
    if (MozBorderRadius != null) __obj.updateDynamic("MozBorderRadius")(MozBorderRadius.asInstanceOf[js.Any])
    if (MozBorderRadiusBottomleft != null) __obj.updateDynamic("MozBorderRadiusBottomleft")(MozBorderRadiusBottomleft.asInstanceOf[js.Any])
    if (MozBorderRadiusBottomright != null) __obj.updateDynamic("MozBorderRadiusBottomright")(MozBorderRadiusBottomright.asInstanceOf[js.Any])
    if (MozBorderRadiusTopleft != null) __obj.updateDynamic("MozBorderRadiusTopleft")(MozBorderRadiusTopleft.asInstanceOf[js.Any])
    if (MozBorderRadiusTopright != null) __obj.updateDynamic("MozBorderRadiusTopright")(MozBorderRadiusTopright.asInstanceOf[js.Any])
    if (MozBorderRightColors != null) __obj.updateDynamic("MozBorderRightColors")(MozBorderRightColors.asInstanceOf[js.Any])
    if (MozBorderTopColors != null) __obj.updateDynamic("MozBorderTopColors")(MozBorderTopColors.asInstanceOf[js.Any])
    if (MozBoxAlign != null) __obj.updateDynamic("MozBoxAlign")(MozBoxAlign.asInstanceOf[js.Any])
    if (MozBoxDirection != null) __obj.updateDynamic("MozBoxDirection")(MozBoxDirection.asInstanceOf[js.Any])
    if (MozBoxFlex != null) __obj.updateDynamic("MozBoxFlex")(MozBoxFlex.asInstanceOf[js.Any])
    if (MozBoxOrdinalGroup != null) __obj.updateDynamic("MozBoxOrdinalGroup")(MozBoxOrdinalGroup.asInstanceOf[js.Any])
    if (MozBoxOrient != null) __obj.updateDynamic("MozBoxOrient")(MozBoxOrient.asInstanceOf[js.Any])
    if (MozBoxPack != null) __obj.updateDynamic("MozBoxPack")(MozBoxPack.asInstanceOf[js.Any])
    if (MozBoxShadow != null) __obj.updateDynamic("MozBoxShadow")(MozBoxShadow.asInstanceOf[js.Any])
    if (MozOpacity != null) __obj.updateDynamic("MozOpacity")(MozOpacity.asInstanceOf[js.Any])
    if (MozOutline != null) __obj.updateDynamic("MozOutline")(MozOutline.asInstanceOf[js.Any])
    if (MozOutlineColor != null) __obj.updateDynamic("MozOutlineColor")(MozOutlineColor.asInstanceOf[js.Any])
    if (MozOutlineRadius != null) __obj.updateDynamic("MozOutlineRadius")(MozOutlineRadius.asInstanceOf[js.Any])
    if (MozOutlineStyle != null) __obj.updateDynamic("MozOutlineStyle")(MozOutlineStyle.asInstanceOf[js.Any])
    if (MozOutlineWidth != null) __obj.updateDynamic("MozOutlineWidth")(MozOutlineWidth.asInstanceOf[js.Any])
    if (MozTextAlignLast != null) __obj.updateDynamic("MozTextAlignLast")(MozTextAlignLast.asInstanceOf[js.Any])
    if (MozTextBlink != null) __obj.updateDynamic("MozTextBlink")(MozTextBlink.asInstanceOf[js.Any])
    if (MozTextDecorationColor != null) __obj.updateDynamic("MozTextDecorationColor")(MozTextDecorationColor.asInstanceOf[js.Any])
    if (MozTextDecorationLine != null) __obj.updateDynamic("MozTextDecorationLine")(MozTextDecorationLine.asInstanceOf[js.Any])
    if (MozTextDecorationStyle != null) __obj.updateDynamic("MozTextDecorationStyle")(MozTextDecorationStyle.asInstanceOf[js.Any])
    if (MozUserInput != null) __obj.updateDynamic("MozUserInput")(MozUserInput.asInstanceOf[js.Any])
    if (MozWindowShadow != null) __obj.updateDynamic("MozWindowShadow")(MozWindowShadow.asInstanceOf[js.Any])
    if (OAnimation != null) __obj.updateDynamic("OAnimation")(OAnimation.asInstanceOf[js.Any])
    if (OAnimationDelay != null) __obj.updateDynamic("OAnimationDelay")(OAnimationDelay.asInstanceOf[js.Any])
    if (OAnimationDirection != null) __obj.updateDynamic("OAnimationDirection")(OAnimationDirection.asInstanceOf[js.Any])
    if (OAnimationDuration != null) __obj.updateDynamic("OAnimationDuration")(OAnimationDuration.asInstanceOf[js.Any])
    if (OAnimationFillMode != null) __obj.updateDynamic("OAnimationFillMode")(OAnimationFillMode.asInstanceOf[js.Any])
    if (OAnimationIterationCount != null) __obj.updateDynamic("OAnimationIterationCount")(OAnimationIterationCount.asInstanceOf[js.Any])
    if (OAnimationName != null) __obj.updateDynamic("OAnimationName")(OAnimationName.asInstanceOf[js.Any])
    if (OAnimationPlayState != null) __obj.updateDynamic("OAnimationPlayState")(OAnimationPlayState.asInstanceOf[js.Any])
    if (OAnimationTimingFunction != null) __obj.updateDynamic("OAnimationTimingFunction")(OAnimationTimingFunction.asInstanceOf[js.Any])
    if (OBackgroundSize != null) __obj.updateDynamic("OBackgroundSize")(OBackgroundSize.asInstanceOf[js.Any])
    if (OBorderImage != null) __obj.updateDynamic("OBorderImage")(OBorderImage.asInstanceOf[js.Any])
    if (OTransform != null) __obj.updateDynamic("OTransform")(OTransform.asInstanceOf[js.Any])
    if (OTransition != null) __obj.updateDynamic("OTransition")(OTransition.asInstanceOf[js.Any])
    if (OTransitionDelay != null) __obj.updateDynamic("OTransitionDelay")(OTransitionDelay.asInstanceOf[js.Any])
    if (OTransitionDuration != null) __obj.updateDynamic("OTransitionDuration")(OTransitionDuration.asInstanceOf[js.Any])
    if (OTransitionProperty != null) __obj.updateDynamic("OTransitionProperty")(OTransitionProperty.asInstanceOf[js.Any])
    if (OTransitionTimingFunction != null) __obj.updateDynamic("OTransitionTimingFunction")(OTransitionTimingFunction.asInstanceOf[js.Any])
    if (StandardLonghandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandPropertiesFallback)
    if (StandardShorthandPropertiesFallback != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandPropertiesFallback)
    if (VendorLonghandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandPropertiesHyphenFallback)
    if (VendorShorthandPropertiesHyphenFallback != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandPropertiesHyphenFallback)
    if (WebkitBoxAlign != null) __obj.updateDynamic("WebkitBoxAlign")(WebkitBoxAlign.asInstanceOf[js.Any])
    if (WebkitBoxDirection != null) __obj.updateDynamic("WebkitBoxDirection")(WebkitBoxDirection.asInstanceOf[js.Any])
    if (WebkitBoxFlex != null) __obj.updateDynamic("WebkitBoxFlex")(WebkitBoxFlex.asInstanceOf[js.Any])
    if (WebkitBoxFlexGroup != null) __obj.updateDynamic("WebkitBoxFlexGroup")(WebkitBoxFlexGroup.asInstanceOf[js.Any])
    if (WebkitBoxLines != null) __obj.updateDynamic("WebkitBoxLines")(WebkitBoxLines.asInstanceOf[js.Any])
    if (WebkitBoxOrdinalGroup != null) __obj.updateDynamic("WebkitBoxOrdinalGroup")(WebkitBoxOrdinalGroup.asInstanceOf[js.Any])
    if (WebkitBoxOrient != null) __obj.updateDynamic("WebkitBoxOrient")(WebkitBoxOrient.asInstanceOf[js.Any])
    if (WebkitBoxPack != null) __obj.updateDynamic("WebkitBoxPack")(WebkitBoxPack.asInstanceOf[js.Any])
    if (WebkitScrollSnapPointsX != null) __obj.updateDynamic("WebkitScrollSnapPointsX")(WebkitScrollSnapPointsX.asInstanceOf[js.Any])
    if (WebkitScrollSnapPointsY != null) __obj.updateDynamic("WebkitScrollSnapPointsY")(WebkitScrollSnapPointsY.asInstanceOf[js.Any])
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (boxAlign != null) __obj.updateDynamic("boxAlign")(boxAlign.asInstanceOf[js.Any])
    if (boxDirection != null) __obj.updateDynamic("boxDirection")(boxDirection.asInstanceOf[js.Any])
    if (boxFlex != null) __obj.updateDynamic("boxFlex")(boxFlex.asInstanceOf[js.Any])
    if (boxFlexGroup != null) __obj.updateDynamic("boxFlexGroup")(boxFlexGroup.asInstanceOf[js.Any])
    if (boxLines != null) __obj.updateDynamic("boxLines")(boxLines.asInstanceOf[js.Any])
    if (boxOrdinalGroup != null) __obj.updateDynamic("boxOrdinalGroup")(boxOrdinalGroup.asInstanceOf[js.Any])
    if (boxOrient != null) __obj.updateDynamic("boxOrient")(boxOrient.asInstanceOf[js.Any])
    if (boxPack != null) __obj.updateDynamic("boxPack")(boxPack.asInstanceOf[js.Any])
    if (clip != null) __obj.updateDynamic("clip")(clip.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (fontVariantAlternates != null) __obj.updateDynamic("fontVariantAlternates")(fontVariantAlternates.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    if (imeMode != null) __obj.updateDynamic("imeMode")(imeMode.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (msImeMode != null) __obj.updateDynamic("msImeMode")(msImeMode.asInstanceOf[js.Any])
    if (msScrollbarTrackColor != null) __obj.updateDynamic("msScrollbarTrackColor")(msScrollbarTrackColor.asInstanceOf[js.Any])
    if (offsetBlock != null) __obj.updateDynamic("offsetBlock")(offsetBlock.asInstanceOf[js.Any])
    if (offsetBlockEnd != null) __obj.updateDynamic("offsetBlockEnd")(offsetBlockEnd.asInstanceOf[js.Any])
    if (offsetBlockStart != null) __obj.updateDynamic("offsetBlockStart")(offsetBlockStart.asInstanceOf[js.Any])
    if (offsetInline != null) __obj.updateDynamic("offsetInline")(offsetInline.asInstanceOf[js.Any])
    if (offsetInlineEnd != null) __obj.updateDynamic("offsetInlineEnd")(offsetInlineEnd.asInstanceOf[js.Any])
    if (offsetInlineStart != null) __obj.updateDynamic("offsetInlineStart")(offsetInlineStart.asInstanceOf[js.Any])
    if (scrollSnapCoordinate != null) __obj.updateDynamic("scrollSnapCoordinate")(scrollSnapCoordinate.asInstanceOf[js.Any])
    if (scrollSnapDestination != null) __obj.updateDynamic("scrollSnapDestination")(scrollSnapDestination.asInstanceOf[js.Any])
    if (scrollSnapPointsX != null) __obj.updateDynamic("scrollSnapPointsX")(scrollSnapPointsX.asInstanceOf[js.Any])
    if (scrollSnapPointsY != null) __obj.updateDynamic("scrollSnapPointsY")(scrollSnapPointsY.asInstanceOf[js.Any])
    if (scrollSnapTypeX != null) __obj.updateDynamic("scrollSnapTypeX")(scrollSnapTypeX.asInstanceOf[js.Any])
    if (scrollSnapTypeY != null) __obj.updateDynamic("scrollSnapTypeY")(scrollSnapTypeY.asInstanceOf[js.Any])
    if (scrollbarTrackColor != null) __obj.updateDynamic("scrollbarTrackColor")(scrollbarTrackColor.asInstanceOf[js.Any])
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
    if (textCombineHorizontal != null) __obj.updateDynamic("textCombineHorizontal")(textCombineHorizontal.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperties]
  }
}

