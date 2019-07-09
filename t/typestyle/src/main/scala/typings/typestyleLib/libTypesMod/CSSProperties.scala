package typings
package typestyleLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- csstypeLib.csstypeMod.ObsoletePropertiesFallback because var conflicts: clip. Inlined KhtmlBoxAlign, KhtmlBoxDirection, KhtmlBoxFlex, KhtmlBoxFlexGroup, KhtmlBoxLines, KhtmlBoxOrdinalGroup, KhtmlBoxOrient, KhtmlBoxPack, KhtmlLineBreak, KhtmlOpacity, KhtmlUserSelect, MozBackgroundClip, MozBackgroundInlinePolicy, MozBackgroundOrigin, MozBackgroundSize, MozBinding, MozBorderRadius, MozBorderRadiusBottomleft, MozBorderRadiusBottomright, MozBorderRadiusTopleft, MozBorderRadiusTopright, MozBoxAlign, MozBoxDirection, MozBoxFlex, MozBoxOrdinalGroup, MozBoxOrient, MozBoxPack, MozBoxShadow, MozOpacity, MozOutline, MozOutlineColor, MozOutlineRadius, MozOutlineStyle, MozOutlineWidth, MozTextAlignLast, MozTextBlink, MozTextDecorationColor, MozTextDecorationLine, MozTextDecorationStyle, MozUserInput, MozWindowShadow, OAnimation, OAnimationDelay, OAnimationDirection, OAnimationDuration, OAnimationFillMode, OAnimationIterationCount, OAnimationName, OAnimationPlayState, OAnimationTimingFunction, OBackgroundSize, OBorderImage, OTransform, OTransition, OTransitionDelay, OTransitionDuration, OTransitionProperty, OTransitionTimingFunction, WebkitBoxAlign, WebkitBoxDirection, WebkitBoxFlex, WebkitBoxFlexGroup, WebkitBoxLines, WebkitBoxOrdinalGroup, WebkitBoxOrient, WebkitBoxPack, WebkitScrollSnapPointsX, WebkitScrollSnapPointsY, boxAlign, boxDirection, boxFlex, boxFlexGroup, boxLines, boxOrdinalGroup, boxOrient, boxPack, fontVariantAlternates, gridColumnGap, gridGap, gridRowGap, imeMode, msImeMode, offsetBlock, offsetBlockEnd, offsetBlockStart, offsetInline, offsetInlineEnd, offsetInlineStart, scrollSnapCoordinate, scrollSnapDestination, scrollSnapPointsX, scrollSnapPointsY, scrollSnapTypeX, scrollSnapTypeY, textCombineHorizontal- csstypeLib.csstypeMod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clip, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ trait CSSProperties
  extends csstypeLib.csstypeMod.StandardPropertiesFallback[TLength]
     with csstypeLib.csstypeMod.VendorPropertiesHyphenFallback[TLength] {
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
  var $unique: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var KhtmlBoxAlign: js.UndefOr[
    csstypeLib.csstypeMod.BoxAlignProperty | js.Array[csstypeLib.csstypeMod.BoxAlignProperty]
  ] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var KhtmlBoxDirection: js.UndefOr[
    csstypeLib.csstypeMod.BoxDirectionProperty | js.Array[csstypeLib.csstypeMod.BoxDirectionProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var KhtmlBoxFlex: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxFlexGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var KhtmlBoxLines: js.UndefOr[
    csstypeLib.csstypeMod.BoxLinesProperty | js.Array[csstypeLib.csstypeMod.BoxLinesProperty]
  ] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var KhtmlBoxOrdinalGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var KhtmlBoxOrient: js.UndefOr[
    csstypeLib.csstypeMod.BoxOrientProperty | js.Array[csstypeLib.csstypeMod.BoxOrientProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var KhtmlBoxPack: js.UndefOr[
    csstypeLib.csstypeMod.BoxPackProperty | js.Array[csstypeLib.csstypeMod.BoxPackProperty]
  ] = js.undefined
  /**
    * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlLineBreak: js.UndefOr[
    csstypeLib.csstypeMod.LineBreakProperty | js.Array[csstypeLib.csstypeMod.LineBreakProperty]
  ] = js.undefined
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var KhtmlOpacity: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var KhtmlUserSelect: js.UndefOr[
    csstypeLib.csstypeMod.UserSelectProperty | js.Array[csstypeLib.csstypeMod.UserSelectProperty]
  ] = js.undefined
  /**
    * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
    *
    * **Initial value**: `border-box`
    *
    * @deprecated
    */
  var MozBackgroundClip: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundClipProperty | js.Array[csstypeLib.csstypeMod.BackgroundClipProperty]
  ] = js.undefined
  /**
    * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
    *
    * **Initial value**: `slice`
    *
    * @deprecated
    */
  var MozBackgroundInlinePolicy: js.UndefOr[
    csstypeLib.csstypeMod.BoxDecorationBreakProperty | js.Array[csstypeLib.csstypeMod.BoxDecorationBreakProperty]
  ] = js.undefined
  /**
    * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
    *
    * **Initial value**: `padding-box`
    *
    * @deprecated
    */
  var MozBackgroundOrigin: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundOriginProperty | js.Array[csstypeLib.csstypeMod.BackgroundOriginProperty]
  ] = js.undefined
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var MozBackgroundSize: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundSizeProperty[TLength] | js.Array[csstypeLib.csstypeMod.BackgroundSizeProperty[TLength]]
  ] = js.undefined
  /**
    * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBinding: js.UndefOr[
    csstypeLib.csstypeMod.MozBindingProperty | js.Array[csstypeLib.csstypeMod.MozBindingProperty]
  ] = js.undefined
  /**
    * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
    *
    * @deprecated
    */
  var MozBorderRadius: js.UndefOr[
    csstypeLib.csstypeMod.BorderRadiusProperty[TLength] | js.Array[csstypeLib.csstypeMod.BorderRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomleft: js.UndefOr[
    csstypeLib.csstypeMod.BorderBottomLeftRadiusProperty[TLength] | js.Array[csstypeLib.csstypeMod.BorderBottomLeftRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusBottomright: js.UndefOr[
    csstypeLib.csstypeMod.BorderBottomRightRadiusProperty[TLength] | js.Array[csstypeLib.csstypeMod.BorderBottomRightRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopleft: js.UndefOr[
    csstypeLib.csstypeMod.BorderTopLeftRadiusProperty[TLength] | js.Array[csstypeLib.csstypeMod.BorderTopLeftRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBorderRadiusTopright: js.UndefOr[
    csstypeLib.csstypeMod.BorderTopRightRadiusProperty[TLength] | js.Array[csstypeLib.csstypeMod.BorderTopRightRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var MozBoxAlign: js.UndefOr[
    csstypeLib.csstypeMod.BoxAlignProperty | js.Array[csstypeLib.csstypeMod.BoxAlignProperty]
  ] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var MozBoxDirection: js.UndefOr[
    csstypeLib.csstypeMod.BoxDirectionProperty | js.Array[csstypeLib.csstypeMod.BoxDirectionProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var MozBoxFlex: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var MozBoxOrdinalGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var MozBoxOrient: js.UndefOr[
    csstypeLib.csstypeMod.BoxOrientProperty | js.Array[csstypeLib.csstypeMod.BoxOrientProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var MozBoxPack: js.UndefOr[
    csstypeLib.csstypeMod.BoxPackProperty | js.Array[csstypeLib.csstypeMod.BoxPackProperty]
  ] = js.undefined
  /**
    * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozBoxShadow: js.UndefOr[
    csstypeLib.csstypeMod.BoxShadowProperty | js.Array[csstypeLib.csstypeMod.BoxShadowProperty]
  ] = js.undefined
  /**
    * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
    *
    * **Initial value**: `1.0`
    *
    * @deprecated
    */
  var MozOpacity: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
    *
    * @deprecated
    */
  var MozOutline: js.UndefOr[
    csstypeLib.csstypeMod.OutlineProperty[TLength] | js.Array[csstypeLib.csstypeMod.OutlineProperty[TLength]]
  ] = js.undefined
  /**
    * The **`outline-color`** CSS property sets the color of an element's outline.
    *
    * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
    *
    * @deprecated
    */
  var MozOutlineColor: js.UndefOr[
    csstypeLib.csstypeMod.OutlineColorProperty | js.Array[csstypeLib.csstypeMod.OutlineColorProperty]
  ] = js.undefined
  /**
    * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
    *
    * @deprecated
    */
  var MozOutlineRadius: js.UndefOr[
    csstypeLib.csstypeMod.MozOutlineRadiusProperty[TLength] | js.Array[csstypeLib.csstypeMod.MozOutlineRadiusProperty[TLength]]
  ] = js.undefined
  /**
    * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozOutlineStyle: js.UndefOr[
    csstypeLib.csstypeMod.OutlineStyleProperty | js.Array[csstypeLib.csstypeMod.OutlineStyleProperty]
  ] = js.undefined
  /**
    * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
    *
    * **Initial value**: `medium`
    *
    * @deprecated
    */
  var MozOutlineWidth: js.UndefOr[
    csstypeLib.csstypeMod.OutlineWidthProperty[TLength] | js.Array[csstypeLib.csstypeMod.OutlineWidthProperty[TLength]]
  ] = js.undefined
  /**
    * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozTextAlignLast: js.UndefOr[
    csstypeLib.csstypeMod.TextAlignLastProperty | js.Array[csstypeLib.csstypeMod.TextAlignLastProperty]
  ] = js.undefined
  /**
    * The **`-moz-text-blink`** non-standard Mozilla CSS extension specifies the blink mode.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextBlink: js.UndefOr[
    csstypeLib.csstypeMod.MozTextBlinkProperty | js.Array[csstypeLib.csstypeMod.MozTextBlinkProperty]
  ] = js.undefined
  /**
    * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
    *
    * **Initial value**: `currentcolor`
    *
    * @deprecated
    */
  var MozTextDecorationColor: js.UndefOr[
    csstypeLib.csstypeMod.TextDecorationColorProperty | js.Array[csstypeLib.csstypeMod.TextDecorationColorProperty]
  ] = js.undefined
  /**
    * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var MozTextDecorationLine: js.UndefOr[
    csstypeLib.csstypeMod.TextDecorationLineProperty | js.Array[csstypeLib.csstypeMod.TextDecorationLineProperty]
  ] = js.undefined
  /**
    * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
    *
    * **Initial value**: `solid`
    *
    * @deprecated
    */
  var MozTextDecorationStyle: js.UndefOr[
    csstypeLib.csstypeMod.TextDecorationStyleProperty | js.Array[csstypeLib.csstypeMod.TextDecorationStyleProperty]
  ] = js.undefined
  /**
    * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var MozUserInput: js.UndefOr[
    csstypeLib.csstypeMod.MozUserInputProperty | js.Array[csstypeLib.csstypeMod.MozUserInputProperty]
  ] = js.undefined
  /**
    * The **`-moz-window-shadow`** CSS property specifies whether a window will have a shadow. It only works on Mac OS X.
    *
    * **Initial value**: `default`
    *
    * @deprecated
    */
  var MozWindowShadow: js.UndefOr[
    csstypeLib.csstypeMod.MozWindowShadowProperty | js.Array[csstypeLib.csstypeMod.MozWindowShadowProperty]
  ] = js.undefined
  /**
    * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
    *
    * @deprecated
    */
  var OAnimation: js.UndefOr[
    csstypeLib.csstypeMod.AnimationProperty | js.Array[csstypeLib.csstypeMod.AnimationProperty]
  ] = js.undefined
  /**
    * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDelay: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | js.Array[csstypeLib.csstypeMod.GlobalsString]
  ] = js.undefined
  /**
    * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var OAnimationDirection: js.UndefOr[
    csstypeLib.csstypeMod.AnimationDirectionProperty | js.Array[csstypeLib.csstypeMod.AnimationDirectionProperty]
  ] = js.undefined
  /**
    * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OAnimationDuration: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | js.Array[csstypeLib.csstypeMod.GlobalsString]
  ] = js.undefined
  /**
    * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationFillMode: js.UndefOr[
    csstypeLib.csstypeMod.AnimationFillModeProperty | js.Array[csstypeLib.csstypeMod.AnimationFillModeProperty]
  ] = js.undefined
  /**
    * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var OAnimationIterationCount: js.UndefOr[
    csstypeLib.csstypeMod.AnimationIterationCountProperty | js.Array[csstypeLib.csstypeMod.AnimationIterationCountProperty]
  ] = js.undefined
  /**
    * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OAnimationName: js.UndefOr[
    csstypeLib.csstypeMod.AnimationNameProperty | js.Array[csstypeLib.csstypeMod.AnimationNameProperty]
  ] = js.undefined
  /**
    * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
    *
    * **Initial value**: `running`
    *
    * @deprecated
    */
  var OAnimationPlayState: js.UndefOr[
    csstypeLib.csstypeMod.AnimationPlayStateProperty | js.Array[csstypeLib.csstypeMod.AnimationPlayStateProperty]
  ] = js.undefined
  /**
    * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OAnimationTimingFunction: js.UndefOr[
    csstypeLib.csstypeMod.AnimationTimingFunctionProperty | js.Array[csstypeLib.csstypeMod.AnimationTimingFunctionProperty]
  ] = js.undefined
  /**
    * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * **Initial value**: `auto auto`
    *
    * @deprecated
    */
  var OBackgroundSize: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundSizeProperty[TLength] | js.Array[csstypeLib.csstypeMod.BackgroundSizeProperty[TLength]]
  ] = js.undefined
  /**
    * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
    *
    * @deprecated
    */
  var OBorderImage: js.UndefOr[
    csstypeLib.csstypeMod.BorderImageProperty | js.Array[csstypeLib.csstypeMod.BorderImageProperty]
  ] = js.undefined
  /**
    * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var OTransform: js.UndefOr[
    csstypeLib.csstypeMod.TransformProperty | js.Array[csstypeLib.csstypeMod.TransformProperty]
  ] = js.undefined
  /**
    * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
    *
    * @deprecated
    */
  var OTransition: js.UndefOr[
    csstypeLib.csstypeMod.TransitionProperty | js.Array[csstypeLib.csstypeMod.TransitionProperty]
  ] = js.undefined
  /**
    * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDelay: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | js.Array[csstypeLib.csstypeMod.GlobalsString]
  ] = js.undefined
  /**
    * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
    *
    * **Initial value**: `0s`
    *
    * @deprecated
    */
  var OTransitionDuration: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsString | js.Array[csstypeLib.csstypeMod.GlobalsString]
  ] = js.undefined
  /**
    * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
    *
    * **Initial value**: all
    *
    * @deprecated
    */
  var OTransitionProperty: js.UndefOr[
    csstypeLib.csstypeMod.TransitionPropertyProperty | js.Array[csstypeLib.csstypeMod.TransitionPropertyProperty]
  ] = js.undefined
  /**
    * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
    *
    * **Initial value**: `ease`
    *
    * @deprecated
    */
  var OTransitionTimingFunction: js.UndefOr[
    csstypeLib.csstypeMod.TransitionTimingFunctionProperty | js.Array[csstypeLib.csstypeMod.TransitionTimingFunctionProperty]
  ] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var WebkitBoxAlign: js.UndefOr[
    csstypeLib.csstypeMod.BoxAlignProperty | js.Array[csstypeLib.csstypeMod.BoxAlignProperty]
  ] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var WebkitBoxDirection: js.UndefOr[
    csstypeLib.csstypeMod.BoxDirectionProperty | js.Array[csstypeLib.csstypeMod.BoxDirectionProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var WebkitBoxFlex: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxFlexGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var WebkitBoxLines: js.UndefOr[
    csstypeLib.csstypeMod.BoxLinesProperty | js.Array[csstypeLib.csstypeMod.BoxLinesProperty]
  ] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var WebkitBoxOrdinalGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var WebkitBoxOrient: js.UndefOr[
    csstypeLib.csstypeMod.BoxOrientProperty | js.Array[csstypeLib.csstypeMod.BoxOrientProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var WebkitBoxPack: js.UndefOr[
    csstypeLib.csstypeMod.BoxPackProperty | js.Array[csstypeLib.csstypeMod.BoxPackProperty]
  ] = js.undefined
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsX: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapPointsXProperty | js.Array[csstypeLib.csstypeMod.ScrollSnapPointsXProperty]
  ] = js.undefined
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var WebkitScrollSnapPointsY: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapPointsYProperty | js.Array[csstypeLib.csstypeMod.ScrollSnapPointsYProperty]
  ] = js.undefined
  var alignmentBaseline: js.UndefOr[
    csstypeLib.csstypeMod.AlignmentBaselineProperty | js.Array[csstypeLib.csstypeMod.AlignmentBaselineProperty]
  ] = js.undefined
  var baselineShift: js.UndefOr[
    csstypeLib.csstypeMod.BaselineShiftProperty[TLength] | js.Array[csstypeLib.csstypeMod.BaselineShiftProperty[TLength]]
  ] = js.undefined
  /**
    * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
    *
    * **Initial value**: `stretch`
    *
    * @deprecated
    */
  var boxAlign: js.UndefOr[
    csstypeLib.csstypeMod.BoxAlignProperty | js.Array[csstypeLib.csstypeMod.BoxAlignProperty]
  ] = js.undefined
  /**
    * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var boxDirection: js.UndefOr[
    csstypeLib.csstypeMod.BoxDirectionProperty | js.Array[csstypeLib.csstypeMod.BoxDirectionProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var boxFlex: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxFlexGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
    *
    * **Initial value**: `single`
    *
    * @deprecated
    */
  var boxLines: js.UndefOr[
    csstypeLib.csstypeMod.BoxLinesProperty | js.Array[csstypeLib.csstypeMod.BoxLinesProperty]
  ] = js.undefined
  /**
    * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
    *
    * **Initial value**: `1`
    *
    * @deprecated
    */
  var boxOrdinalGroup: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
    *
    * **Initial value**: `inline-axis` (`horizontal` in XUL)
    *
    * @deprecated
    */
  var boxOrient: js.UndefOr[
    csstypeLib.csstypeMod.BoxOrientProperty | js.Array[csstypeLib.csstypeMod.BoxOrientProperty]
  ] = js.undefined
  /**
    * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
    *
    * **Initial value**: `start`
    *
    * @deprecated
    */
  var boxPack: js.UndefOr[
    csstypeLib.csstypeMod.BoxPackProperty | js.Array[csstypeLib.csstypeMod.BoxPackProperty]
  ] = js.undefined
  var clip: js.UndefOr[
    csstypeLib.csstypeMod.ClipProperty | js.Array[csstypeLib.csstypeMod.ClipProperty]
  ] = js.undefined
  var clipRule: js.UndefOr[
    csstypeLib.csstypeMod.ClipRuleProperty | js.Array[csstypeLib.csstypeMod.ClipRuleProperty]
  ] = js.undefined
  var colorInterpolation: js.UndefOr[
    csstypeLib.csstypeMod.ColorInterpolationProperty | js.Array[csstypeLib.csstypeMod.ColorInterpolationProperty]
  ] = js.undefined
  var colorRendering: js.UndefOr[
    csstypeLib.csstypeMod.ColorRenderingProperty | js.Array[csstypeLib.csstypeMod.ColorRenderingProperty]
  ] = js.undefined
  var dominantBaseline: js.UndefOr[
    csstypeLib.csstypeMod.DominantBaselineProperty | js.Array[csstypeLib.csstypeMod.DominantBaselineProperty]
  ] = js.undefined
  var fill: js.UndefOr[
    csstypeLib.csstypeMod.FillProperty | js.Array[csstypeLib.csstypeMod.FillProperty]
  ] = js.undefined
  var fillOpacity: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  var fillRule: js.UndefOr[
    csstypeLib.csstypeMod.FillRuleProperty | js.Array[csstypeLib.csstypeMod.FillRuleProperty]
  ] = js.undefined
  var floodColor: js.UndefOr[
    csstypeLib.csstypeMod.FloodColorProperty | js.Array[csstypeLib.csstypeMod.FloodColorProperty]
  ] = js.undefined
  var floodOpacity: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  /**
    * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
    *
    * **Initial value**: `normal`
    *
    * @deprecated
    */
  var fontVariantAlternates: js.UndefOr[
    csstypeLib.csstypeMod.FontVariantAlternatesProperty | js.Array[csstypeLib.csstypeMod.FontVariantAlternatesProperty]
  ] = js.undefined
  var glyphOrientationVertical: js.UndefOr[
    csstypeLib.csstypeMod.GlyphOrientationVerticalProperty | js.Array[csstypeLib.csstypeMod.GlyphOrientationVerticalProperty]
  ] = js.undefined
  /**
    * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridColumnGap: js.UndefOr[
    csstypeLib.csstypeMod.GridColumnGapProperty[TLength] | js.Array[csstypeLib.csstypeMod.GridColumnGapProperty[TLength]]
  ] = js.undefined
  /**
    * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
    *
    * @deprecated
    */
  var gridGap: js.UndefOr[
    csstypeLib.csstypeMod.GridGapProperty[TLength] | js.Array[csstypeLib.csstypeMod.GridGapProperty[TLength]]
  ] = js.undefined
  /**
    * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
    *
    * **Initial value**: `0`
    *
    * @deprecated
    */
  var gridRowGap: js.UndefOr[
    csstypeLib.csstypeMod.GridRowGapProperty[TLength] | js.Array[csstypeLib.csstypeMod.GridRowGapProperty[TLength]]
  ] = js.undefined
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var imeMode: js.UndefOr[
    csstypeLib.csstypeMod.ImeModeProperty | js.Array[csstypeLib.csstypeMod.ImeModeProperty]
  ] = js.undefined
  var lightingColor: js.UndefOr[
    csstypeLib.csstypeMod.LightingColorProperty | js.Array[csstypeLib.csstypeMod.LightingColorProperty]
  ] = js.undefined
  var marker: js.UndefOr[
    csstypeLib.csstypeMod.MarkerProperty | js.Array[csstypeLib.csstypeMod.MarkerProperty]
  ] = js.undefined
  var markerEnd: js.UndefOr[
    csstypeLib.csstypeMod.MarkerEndProperty | js.Array[csstypeLib.csstypeMod.MarkerEndProperty]
  ] = js.undefined
  var markerMid: js.UndefOr[
    csstypeLib.csstypeMod.MarkerMidProperty | js.Array[csstypeLib.csstypeMod.MarkerMidProperty]
  ] = js.undefined
  var markerStart: js.UndefOr[
    csstypeLib.csstypeMod.MarkerStartProperty | js.Array[csstypeLib.csstypeMod.MarkerStartProperty]
  ] = js.undefined
  /**
    * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var msImeMode: js.UndefOr[
    csstypeLib.csstypeMod.ImeModeProperty | js.Array[csstypeLib.csstypeMod.ImeModeProperty]
  ] = js.undefined
  /**
    * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlock: js.UndefOr[
    csstypeLib.csstypeMod.InsetBlockProperty[TLength] | js.Array[csstypeLib.csstypeMod.InsetBlockProperty[TLength]]
  ] = js.undefined
  /**
    * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockEnd: js.UndefOr[
    csstypeLib.csstypeMod.InsetBlockEndProperty[TLength] | js.Array[csstypeLib.csstypeMod.InsetBlockEndProperty[TLength]]
  ] = js.undefined
  /**
    * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetBlockStart: js.UndefOr[
    csstypeLib.csstypeMod.InsetBlockStartProperty[TLength] | js.Array[csstypeLib.csstypeMod.InsetBlockStartProperty[TLength]]
  ] = js.undefined
  /**
    * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInline: js.UndefOr[
    csstypeLib.csstypeMod.InsetInlineProperty[TLength] | js.Array[csstypeLib.csstypeMod.InsetInlineProperty[TLength]]
  ] = js.undefined
  /**
    * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineEnd: js.UndefOr[
    csstypeLib.csstypeMod.InsetInlineEndProperty[TLength] | js.Array[csstypeLib.csstypeMod.InsetInlineEndProperty[TLength]]
  ] = js.undefined
  /**
    * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
    *
    * **Initial value**: `auto`
    *
    * @deprecated
    */
  var offsetInlineStart: js.UndefOr[
    csstypeLib.csstypeMod.InsetInlineStartProperty[TLength] | js.Array[csstypeLib.csstypeMod.InsetInlineStartProperty[TLength]]
  ] = js.undefined
  /**
    * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapCoordinate: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapCoordinateProperty[TLength] | js.Array[csstypeLib.csstypeMod.ScrollSnapCoordinateProperty[TLength]]
  ] = js.undefined
  /**
    * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
    *
    * **Initial value**: `0px 0px`
    *
    * @deprecated
    */
  var scrollSnapDestination: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapDestinationProperty[TLength] | js.Array[csstypeLib.csstypeMod.ScrollSnapDestinationProperty[TLength]]
  ] = js.undefined
  /**
    * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsX: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapPointsXProperty | js.Array[csstypeLib.csstypeMod.ScrollSnapPointsXProperty]
  ] = js.undefined
  /**
    * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapPointsY: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapPointsYProperty | js.Array[csstypeLib.csstypeMod.ScrollSnapPointsYProperty]
  ] = js.undefined
  /**
    * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeX: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapTypeXProperty | js.Array[csstypeLib.csstypeMod.ScrollSnapTypeXProperty]
  ] = js.undefined
  /**
    * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var scrollSnapTypeY: js.UndefOr[
    csstypeLib.csstypeMod.ScrollSnapTypeYProperty | js.Array[csstypeLib.csstypeMod.ScrollSnapTypeYProperty]
  ] = js.undefined
  var shapeRendering: js.UndefOr[
    csstypeLib.csstypeMod.ShapeRenderingProperty | js.Array[csstypeLib.csstypeMod.ShapeRenderingProperty]
  ] = js.undefined
  var stopColor: js.UndefOr[
    csstypeLib.csstypeMod.StopColorProperty | js.Array[csstypeLib.csstypeMod.StopColorProperty]
  ] = js.undefined
  var stopOpacity: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  var stroke: js.UndefOr[
    csstypeLib.csstypeMod.StrokeProperty | js.Array[csstypeLib.csstypeMod.StrokeProperty]
  ] = js.undefined
  var strokeDasharray: js.UndefOr[
    csstypeLib.csstypeMod.StrokeDasharrayProperty[TLength] | js.Array[csstypeLib.csstypeMod.StrokeDasharrayProperty[TLength]]
  ] = js.undefined
  var strokeDashoffset: js.UndefOr[
    csstypeLib.csstypeMod.StrokeDashoffsetProperty[TLength] | js.Array[csstypeLib.csstypeMod.StrokeDashoffsetProperty[TLength]]
  ] = js.undefined
  var strokeLinecap: js.UndefOr[
    csstypeLib.csstypeMod.StrokeLinecapProperty | js.Array[csstypeLib.csstypeMod.StrokeLinecapProperty]
  ] = js.undefined
  var strokeLinejoin: js.UndefOr[
    csstypeLib.csstypeMod.StrokeLinejoinProperty | js.Array[csstypeLib.csstypeMod.StrokeLinejoinProperty]
  ] = js.undefined
  var strokeMiterlimit: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  var strokeOpacity: js.UndefOr[
    csstypeLib.csstypeMod.GlobalsNumber | js.Array[csstypeLib.csstypeMod.GlobalsNumber]
  ] = js.undefined
  var strokeWidth: js.UndefOr[
    csstypeLib.csstypeMod.StrokeWidthProperty[TLength] | js.Array[csstypeLib.csstypeMod.StrokeWidthProperty[TLength]]
  ] = js.undefined
  var textAnchor: js.UndefOr[
    csstypeLib.csstypeMod.TextAnchorProperty | js.Array[csstypeLib.csstypeMod.TextAnchorProperty]
  ] = js.undefined
  /**
    * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
    *
    * **Initial value**: `none`
    *
    * @deprecated
    */
  var textCombineHorizontal: js.UndefOr[
    csstypeLib.csstypeMod.TextCombineUprightProperty | js.Array[csstypeLib.csstypeMod.TextCombineUprightProperty]
  ] = js.undefined
  var vectorEffect: js.UndefOr[
    csstypeLib.csstypeMod.VectorEffectProperty | js.Array[csstypeLib.csstypeMod.VectorEffectProperty]
  ] = js.undefined
}

object CSSProperties {
  @scala.inline
  def apply(
    $unique: js.UndefOr[scala.Boolean] = js.undefined,
    ObsoletePropertiesFallback: csstypeLib.csstypeMod.ObsoletePropertiesFallback[TLength] = null,
    StandardPropertiesFallback: csstypeLib.csstypeMod.StandardPropertiesFallback[TLength] = null,
    SvgPropertiesFallback: csstypeLib.csstypeMod.SvgPropertiesFallback[TLength] = null,
    VendorPropertiesHyphenFallback: csstypeLib.csstypeMod.VendorPropertiesHyphenFallback[TLength] = null
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

