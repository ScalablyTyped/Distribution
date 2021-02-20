package typings.typestyle

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.AlignmentBaselineProperty
import typings.csstype.mod.AnimationDirectionProperty
import typings.csstype.mod.AnimationFillModeProperty
import typings.csstype.mod.AnimationIterationCountProperty
import typings.csstype.mod.AnimationNameProperty
import typings.csstype.mod.AnimationPlayStateProperty
import typings.csstype.mod.AnimationProperty
import typings.csstype.mod.AnimationTimingFunctionProperty
import typings.csstype.mod.AzimuthProperty
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
import typings.csstype.mod.MozFloatEdgeProperty
import typings.csstype.mod.MozOutlineRadiusBottomleftProperty
import typings.csstype.mod.MozOutlineRadiusBottomrightProperty
import typings.csstype.mod.MozOutlineRadiusProperty
import typings.csstype.mod.MozOutlineRadiusTopleftProperty
import typings.csstype.mod.MozOutlineRadiusToprightProperty
import typings.csstype.mod.MozUserInputProperty
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
import typings.csstype.mod.StandardPropertiesFallback
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
import typings.csstype.mod.VendorPropertiesHyphenFallback
import typings.std.Record
import typings.typestyle.typestyleStrings.all
import typings.typestyle.typestyleStrings.landscape
import typings.typestyle.typestyleStrings.portrait
import typings.typestyle.typestyleStrings.print
import typings.typestyle.typestyleStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type CSSClassNames[K /* <: String */] = Record[K, String]
  
  type CSSClasses[K /* <: String */] = Record[K, NestedCSSProperties]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstype.mod.ObsoletePropertiesFallback because var conflicts: clip. Inlined msImeMode, MozOutlineStyle, KhtmlBoxLines, MozBackgroundInlinePolicy, MozForceBrokenImageIcon, MozOutlineRadiusBottomleft, WebkitScrollSnapPointsX, MozOutline, textCombineHorizontal, MozTextDecorationLine, MozBoxFlex, MozUserInput, WebkitBoxOrdinalGroup, OAnimationDuration, KhtmlBoxOrient, boxLines, WebkitBoxFlexGroup, MozFloatEdge, WebkitBoxDirection, MozOutlineRadiusTopright, MozBoxDirection, offsetInlineStart, scrollSnapCoordinate, KhtmlBoxAlign, imeMode, MozBackgroundSize, MozOutlineRadius, fontVariantAlternates, gridGap, msScrollbarTrackColor, MozBoxAlign, scrollSnapTypeY, offsetInline, offsetBlock, WebkitBoxLines, gridRowGap, MozBoxOrient, boxOrient, KhtmlLineBreak, OAnimationDelay, MozBinding, OTransform, MozBoxPack, WebkitBoxAlign, scrollSnapDestination, OTransitionDuration, MozTextDecorationColor, offsetBlockStart, MozBorderRadiusTopright, MozBorderRadiusBottomleft, MozOpacity, boxOrdinalGroup, WebkitBoxOrient, OAnimation, OBackgroundSize, OAnimationFillMode, offsetBlockEnd, scrollSnapPointsY, WebkitBoxFlex, MozBoxShadow, KhtmlUserSelect, gridColumnGap, scrollSnapTypeX, MozTextAlignLast, MozTextDecorationStyle, OTransitionTimingFunction, boxPack, MozBorderRadius, KhtmlBoxOrdinalGroup, OBorderImage, azimuth, MozBorderRadiusTopleft, OAnimationName, MozOutlineWidth, MozBorderRadiusBottomright, MozOutlineColor, OTransition, OTransitionProperty, KhtmlBoxFlex, KhtmlBoxDirection, MozBoxOrdinalGroup, boxAlign, KhtmlBoxFlexGroup, MozBackgroundOrigin, MozOutlineRadiusTopleft, MozOutlineRadiusBottomright, boxFlex, WebkitBoxPack, boxFlexGroup, OAnimationDirection, OTransitionDelay, MozBackgroundClip, OAnimationPlayState, boxDirection, OAnimationTimingFunction, KhtmlBoxPack, scrollbarTrackColor, scrollSnapPointsX, KhtmlOpacity, offsetInlineEnd, WebkitScrollSnapPointsY, OAnimationIterationCount
  - typings.csstype.mod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined textAnchor, shapeRendering, markerStart, strokeLinecap, strokeDashoffset, lightingColor, fillOpacity, colorRendering, floodColor, strokeWidth, strokeOpacity, strokeLinejoin, stroke, markerEnd, stopColor, clip, dominantBaseline, baselineShift, stopOpacity, fillRule, clipRule, colorInterpolation, marker, fill, glyphOrientationVertical, alignmentBaseline, vectorEffect, strokeDasharray, markerMid, strokeMiterlimit, floodOpacity */ @js.native
  trait CSSProperties
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
    var $unique: js.UndefOr[Boolean] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var KhtmlBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var KhtmlBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var KhtmlBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var KhtmlBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
      *
      * **Syntax**: `single | multiple`
      *
      * **Initial value**: `single`
      *
      * @deprecated
      */
    var KhtmlBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var KhtmlBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var KhtmlBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var KhtmlBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
    
    /**
      * The **`line-break`** CSS property sets how to break lines of Chinese, Japanese, or Korean (CJK) text when working with punctuation and symbols.
      *
      * **Syntax**: `auto | loose | normal | strict | anywhere`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var KhtmlLineBreak: js.UndefOr[LineBreakProperty | js.Array[LineBreakProperty]] = js.native
    
    /**
      * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
      *
      * **Syntax**: `<alpha-value>`
      *
      * **Initial value**: `1.0`
      *
      * @deprecated
      */
    var KhtmlOpacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
    
    /**
      * The `**user-select**` CSS property controls whether the user can select text. This doesn't have any effect on content loaded as chrome, except in textboxes.
      *
      * **Syntax**: `auto | text | none | contain | all`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var KhtmlUserSelect: js.UndefOr[UserSelectProperty | js.Array[UserSelectProperty]] = js.native
    
    /**
      * The **`background-clip`** CSS property sets whether an element's background `<color>` or `<image>` extends underneath its border.
      *
      * **Syntax**: `<box>#`
      *
      * **Initial value**: `border-box`
      *
      * @deprecated
      */
    var MozBackgroundClip: js.UndefOr[BackgroundClipProperty | js.Array[BackgroundClipProperty]] = js.native
    
    /**
      * The **`box-decoration-break`** CSS property specifies how an element's fragments should be rendered when broken across multiple lines, columns, or pages.
      *
      * **Syntax**: `slice | clone`
      *
      * **Initial value**: `slice`
      *
      * @deprecated
      */
    var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]] = js.native
    
    /**
      * The **`background-origin`** CSS property sets the _background positioning area_. In other words, it sets the origin position of an image set with the `background-image` property.
      *
      * **Syntax**: `<box>#`
      *
      * **Initial value**: `padding-box`
      *
      * @deprecated
      */
    var MozBackgroundOrigin: js.UndefOr[BackgroundOriginProperty | js.Array[BackgroundOriginProperty]] = js.native
    
    /**
      * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
      *
      * **Syntax**: `<bg-size>#`
      *
      * **Initial value**: `auto auto`
      *
      * @deprecated
      */
    var MozBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
    
    /**
      * The **`-moz-binding`** CSS property is used by Mozilla-based applications to attach an XBL binding to a DOM element.
      *
      * **Syntax**: `<url> | none`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozBinding: js.UndefOr[MozBindingProperty | js.Array[MozBindingProperty]] = js.native
    
    /**
      * The **`border-radius`** CSS property rounds the corners of an element's outer border edge. You can set a single radius to make circular corners, or two radii to make elliptical corners.
      *
      * **Syntax**: `<length-percentage>{1,4} [ / <length-percentage>{1,4} ]?`
      *
      * @deprecated
      */
    var MozBorderRadius: js.UndefOr[BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]] = js.native
    
    /**
      * The **`border-bottom-left-radius`** CSS property rounds the bottom-left corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusBottomleft: js.UndefOr[
        BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]
      ] = js.native
    
    /**
      * The **`border-bottom-right-radius`** CSS property rounds the bottom-right corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusBottomright: js.UndefOr[
        BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
      ] = js.native
    
    /**
      * The **`border-top-left-radius`** CSS property rounds the top-left corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusTopleft: js.UndefOr[
        BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]
      ] = js.native
    
    /**
      * The **`border-top-right-radius`** CSS property rounds the top-right corner of an element.
      *
      * **Syntax**: `<length-percentage>{1,2}`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBorderRadiusTopright: js.UndefOr[
        BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]
      ] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var MozBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var MozBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var MozBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var MozBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var MozBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
    
    /**
      * The **`box-shadow`** CSS property adds shadow effects around an element's frame. You can set multiple effects separated by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii, and color.
      *
      * **Syntax**: `none | <shadow>#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozBoxShadow: js.UndefOr[BoxShadowProperty | js.Array[BoxShadowProperty]] = js.native
    
    /**
      * The non-standard **`-moz-float-edge`** CSS property specifies whether the height and width properties of the element include the margin, border, or padding thickness.
      *
      * **Syntax**: `border-box | content-box | margin-box | padding-box`
      *
      * **Initial value**: `content-box`
      *
      * @deprecated
      */
    var MozFloatEdge: js.UndefOr[MozFloatEdgeProperty | js.Array[MozFloatEdgeProperty]] = js.native
    
    /**
      * The **`-moz-force-broken-image-icon`** extended CSS property can be used to force the broken image icon to be shown even when a broken image has an `alt` attribute.
      *
      * **Syntax**: `<integer [0,1]>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozForceBrokenImageIcon: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`opacity`** CSS property sets the transparency of an element or the degree to which content behind an element is visible.
      *
      * **Syntax**: `<alpha-value>`
      *
      * **Initial value**: `1.0`
      *
      * @deprecated
      */
    var MozOpacity: js.UndefOr[OpacityProperty | js.Array[OpacityProperty]] = js.native
    
    /**
      * The **`outline`** CSS property is a shorthand to set various outline properties in a single declaration: `outline-style`, `outline-width`, and `outline-color`.
      *
      * **Syntax**: `[ <'outline-color'> || <'outline-style'> || <'outline-width'> ]`
      *
      * @deprecated
      */
    var MozOutline: js.UndefOr[OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]] = js.native
    
    /**
      * The **`outline-color`** CSS property sets the color of an element's outline.
      *
      * **Syntax**: `<color> | invert`
      *
      * **Initial value**: `invert`, for browsers supporting it, `currentColor` for the other
      *
      * @deprecated
      */
    var MozOutlineColor: js.UndefOr[OutlineColorProperty | js.Array[OutlineColorProperty]] = js.native
    
    /**
      * In Mozilla applications like Firefox, the **`-moz-outline-radius`** CSS property can be used to give an element's `outline` rounded corners.
      *
      * **Syntax**: `<outline-radius>{1,4} [ / <outline-radius>{1,4} ]?`
      *
      * @deprecated
      */
    var MozOutlineRadius: js.UndefOr[MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-bottomleft`** CSS property can be used to round the bottom-left corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusBottomleft: js.UndefOr[
        MozOutlineRadiusBottomleftProperty[TLength] | js.Array[MozOutlineRadiusBottomleftProperty[TLength]]
      ] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-bottomright`** CSS property can be used to round the bottom-right corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusBottomright: js.UndefOr[
        MozOutlineRadiusBottomrightProperty[TLength] | js.Array[MozOutlineRadiusBottomrightProperty[TLength]]
      ] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-topleft`** CSS property can be used to round the top-left corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusTopleft: js.UndefOr[
        MozOutlineRadiusTopleftProperty[TLength] | js.Array[MozOutlineRadiusTopleftProperty[TLength]]
      ] = js.native
    
    /**
      * In Mozilla applications, the **`-moz-outline-radius-topright`** CSS property can be used to round the top-right corner of an element's `outline`.
      *
      * **Syntax**: `<outline-radius>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var MozOutlineRadiusTopright: js.UndefOr[
        MozOutlineRadiusToprightProperty[TLength] | js.Array[MozOutlineRadiusToprightProperty[TLength]]
      ] = js.native
    
    /**
      * The **`outline-style`** CSS property sets the style of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
      *
      * **Syntax**: `auto | <'border-style'>`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozOutlineStyle: js.UndefOr[OutlineStyleProperty | js.Array[OutlineStyleProperty]] = js.native
    
    /**
      * The **`outline-width`** CSS property sets the thickness of an element's outline. An outline is a line that is drawn around an element, outside the `border`.
      *
      * **Syntax**: `<line-width>`
      *
      * **Initial value**: `medium`
      *
      * @deprecated
      */
    var MozOutlineWidth: js.UndefOr[OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]] = js.native
    
    /**
      * The **`text-align-last`** CSS property sets how the last line of a block or a line, right before a forced line break, is aligned.
      *
      * **Syntax**: `auto | start | end | left | right | center | justify`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var MozTextAlignLast: js.UndefOr[TextAlignLastProperty | js.Array[TextAlignLastProperty]] = js.native
    
    /**
      * The **`text-decoration-color`** CSS property sets the color of decorations added to text by `text-decoration-line`.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `currentcolor`
      *
      * @deprecated
      */
    var MozTextDecorationColor: js.UndefOr[TextDecorationColorProperty | js.Array[TextDecorationColorProperty]] = js.native
    
    /**
      * The **`text-decoration-line`** CSS property sets the kind of decoration that is used on text in an element, such as an underline or overline.
      *
      * **Syntax**: `none | [ underline || overline || line-through || blink ] | spelling-error | grammar-error`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var MozTextDecorationLine: js.UndefOr[TextDecorationLineProperty | js.Array[TextDecorationLineProperty]] = js.native
    
    /**
      * The **`text-decoration-style`** CSS property sets the style of the lines specified by `text-decoration-line`. The style applies to all lines that are set with `text-decoration-line`.
      *
      * **Syntax**: `solid | double | dotted | dashed | wavy`
      *
      * **Initial value**: `solid`
      *
      * @deprecated
      */
    var MozTextDecorationStyle: js.UndefOr[TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]] = js.native
    
    /**
      * In Mozilla applications, **`-moz-user-input`** determines if an element will accept user input.
      *
      * **Syntax**: `auto | none | enabled | disabled`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var MozUserInput: js.UndefOr[MozUserInputProperty | js.Array[MozUserInputProperty]] = js.native
    
    /**
      * The **`animation`** shorthand CSS property sets an animated transition between styles. It is a shorthand for `animation-name`, `animation-duration`, `animation-timing-function`, `animation-delay`, `animation-iteration-count`, `animation-direction`, `animation-fill-mode`, and `animation-play-state`.
      *
      * **Syntax**: `<single-animation>#`
      *
      * @deprecated
      */
    var OAnimation: js.UndefOr[AnimationProperty | js.Array[AnimationProperty]] = js.native
    
    /**
      * The **`animation-delay`** CSS property sets when an animation starts. The animation can start later, immediately from its beginning, or immediately and partway through the animation.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OAnimationDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
    
    /**
      * The **`animation-direction`** CSS property sets whether an animation should play forwards, backwards, or alternating back and forth.
      *
      * **Syntax**: `<single-animation-direction>#`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var OAnimationDirection: js.UndefOr[AnimationDirectionProperty | js.Array[AnimationDirectionProperty]] = js.native
    
    /**
      * The **`animation-duration`** CSS property sets the length of time that an animation takes to complete one cycle.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OAnimationDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
    
    /**
      * The **`animation-fill-mode`** CSS property sets how a CSS animation applies styles to its target before and after its execution.
      *
      * **Syntax**: `<single-animation-fill-mode>#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var OAnimationFillMode: js.UndefOr[AnimationFillModeProperty | js.Array[AnimationFillModeProperty]] = js.native
    
    /**
      * The **`animation-iteration-count`** CSS property sets the number of times an animation cycle should be played before stopping.
      *
      * **Syntax**: `<single-animation-iteration-count>#`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var OAnimationIterationCount: js.UndefOr[AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]] = js.native
    
    /**
      * The **`animation-name`** CSS property sets one or more animations to apply to an element. Each name is an `@keyframes` at-rule that sets the property values for the animation sequence.
      *
      * **Syntax**: `[ none | <keyframes-name> ]#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var OAnimationName: js.UndefOr[AnimationNameProperty | js.Array[AnimationNameProperty]] = js.native
    
    /**
      * The **`animation-play-state`** CSS property sets whether an animation is running or paused.
      *
      * **Syntax**: `<single-animation-play-state>#`
      *
      * **Initial value**: `running`
      *
      * @deprecated
      */
    var OAnimationPlayState: js.UndefOr[AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]] = js.native
    
    /**
      * The `**animation-timing-function**` CSS property sets how an animation progresses through the duration of each cycle.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      *
      * @deprecated
      */
    var OAnimationTimingFunction: js.UndefOr[AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]] = js.native
    
    /**
      * The **`background-size`** CSS property sets the size of the element's background image. The image can be left to its natural size, stretched, or constrained to fit the available space.
      *
      * **Syntax**: `<bg-size>#`
      *
      * **Initial value**: `auto auto`
      *
      * @deprecated
      */
    var OBackgroundSize: js.UndefOr[BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]] = js.native
    
    /**
      * The **`border-image`** CSS property draws an image in place of an element's `border-style`.
      *
      * **Syntax**: `<'border-image-source'> || <'border-image-slice'> [ / <'border-image-width'> | / <'border-image-width'>? / <'border-image-outset'> ]? || <'border-image-repeat'>`
      *
      * @deprecated
      */
    var OBorderImage: js.UndefOr[BorderImageProperty | js.Array[BorderImageProperty]] = js.native
    
    /**
      * The **`transform`** CSS property lets you rotate, scale, skew, or translate an element. It modifies the coordinate space of the CSS visual formatting model.
      *
      * **Syntax**: `none | <transform-list>`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var OTransform: js.UndefOr[TransformProperty | js.Array[TransformProperty]] = js.native
    
    /**
      * The **`transition`** CSS property is a shorthand property for `transition-property`, `transition-duration`, `transition-timing-function`, and `transition-delay`.
      *
      * **Syntax**: `<single-transition>#`
      *
      * @deprecated
      */
    var OTransition: js.UndefOr[TransitionProperty | js.Array[TransitionProperty]] = js.native
    
    /**
      * The **`transition-delay`** CSS property specifies the duration to wait before starting a property's transition effect when its value changes.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OTransitionDelay: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
    
    /**
      * The **`transition-duration`** CSS property sets the length of time a transition animation should take to complete. By default, the value is `0s`, meaning that no animation will occur.
      *
      * **Syntax**: `<time>#`
      *
      * **Initial value**: `0s`
      *
      * @deprecated
      */
    var OTransitionDuration: js.UndefOr[GlobalsString | js.Array[GlobalsString]] = js.native
    
    /**
      * The **`transition-property`** CSS property sets the CSS properties to which a transition effect should be applied.
      *
      * **Syntax**: `none | <single-transition-property>#`
      *
      * **Initial value**: all
      *
      * @deprecated
      */
    var OTransitionProperty: js.UndefOr[TransitionPropertyProperty | js.Array[TransitionPropertyProperty]] = js.native
    
    /**
      * The **`transition-timing-function`** CSS property sets how intermediate values are calculated for CSS properties being affected by a transition effect.
      *
      * **Syntax**: `<timing-function>#`
      *
      * **Initial value**: `ease`
      *
      * @deprecated
      */
    var OTransitionTimingFunction: js.UndefOr[TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var WebkitBoxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var WebkitBoxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var WebkitBoxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var WebkitBoxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
      *
      * **Syntax**: `single | multiple`
      *
      * **Initial value**: `single`
      *
      * @deprecated
      */
    var WebkitBoxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var WebkitBoxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var WebkitBoxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var WebkitBoxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
    
    /**
      * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
    
    /**
      * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
    
    var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]] = js.native
    
    /**
      * In combination with `elevation`, the **`azimuth`** CSS property enables different audio sources to be positioned spatially for aural presentation. This is important in that it provides a natural way to tell several voices apart, as each can be positioned to originate at a different location on the sound stage. Stereo output produce a lateral sound stage, while binaural headphones and multi-speaker setups allow for a fully three-dimensional stage.
      *
      * **Syntax**: `<angle> | [ [ left-side | far-left | left | center-left | center | center-right | right | far-right | right-side ] || behind ] | leftwards | rightwards`
      *
      * **Initial value**: `center`
      *
      * @deprecated
      */
    var azimuth: js.UndefOr[AzimuthProperty | js.Array[AzimuthProperty]] = js.native
    
    var baselineShift: js.UndefOr[BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]] = js.native
    
    /**
      * The **`box-align`** CSS property specifies how an element aligns its contents across its layout in a perpendicular direction. The effect of the property is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | baseline | stretch`
      *
      * **Initial value**: `stretch`
      *
      * @deprecated
      */
    var boxAlign: js.UndefOr[BoxAlignProperty | js.Array[BoxAlignProperty]] = js.native
    
    /**
      * The **`box-direction`** CSS property specifies whether a box lays out its contents normally (from the top or left edge), or in reverse (from the bottom or right edge).
      *
      * **Syntax**: `normal | reverse | inherit`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var boxDirection: js.UndefOr[BoxDirectionProperty | js.Array[BoxDirectionProperty]] = js.native
    
    /**
      * The **`-moz-box-flex`** and **`-webkit-box-flex`** CSS properties specify how a `-moz-box` or `-webkit-box` grows to fill the box that contains it, in the direction of the containing box's layout.
      *
      * **Syntax**: `<number>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var boxFlex: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-flex-group`** CSS property assigns the flexbox's child elements to a flex group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var boxFlexGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-lines`** CSS property determines whether the box may have a single or multiple lines (rows for horizontally oriented boxes, columns for vertically oriented boxes).
      *
      * **Syntax**: `single | multiple`
      *
      * **Initial value**: `single`
      *
      * @deprecated
      */
    var boxLines: js.UndefOr[BoxLinesProperty | js.Array[BoxLinesProperty]] = js.native
    
    /**
      * The **`box-ordinal-group`** CSS property assigns the flexbox's child elements to an ordinal group.
      *
      * **Syntax**: `<integer>`
      *
      * **Initial value**: `1`
      *
      * @deprecated
      */
    var boxOrdinalGroup: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`box-orient`** CSS property specifies whether an element lays out its contents horizontally or vertically.
      *
      * **Syntax**: `horizontal | vertical | inline-axis | block-axis | inherit`
      *
      * **Initial value**: `inline-axis` (`horizontal` in XUL)
      *
      * @deprecated
      */
    var boxOrient: js.UndefOr[BoxOrientProperty | js.Array[BoxOrientProperty]] = js.native
    
    /**
      * The **`-moz-box-pack`** and **`-webkit-box-pack`** CSS properties specify how a `-moz-box` or `-webkit-box` packs its contents in the direction of its layout. The effect of this is only visible if there is extra space in the box.
      *
      * **Syntax**: `start | center | end | justify`
      *
      * **Initial value**: `start`
      *
      * @deprecated
      */
    var boxPack: js.UndefOr[BoxPackProperty | js.Array[BoxPackProperty]] = js.native
    
    var clip: js.UndefOr[ClipProperty | js.Array[ClipProperty]] = js.native
    
    var clipRule: js.UndefOr[ClipRuleProperty | js.Array[ClipRuleProperty]] = js.native
    
    var colorInterpolation: js.UndefOr[ColorInterpolationProperty | js.Array[ColorInterpolationProperty]] = js.native
    
    var colorRendering: js.UndefOr[ColorRenderingProperty | js.Array[ColorRenderingProperty]] = js.native
    
    var dominantBaseline: js.UndefOr[DominantBaselineProperty | js.Array[DominantBaselineProperty]] = js.native
    
    var fill: js.UndefOr[FillProperty | js.Array[FillProperty]] = js.native
    
    var fillOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    var fillRule: js.UndefOr[FillRuleProperty | js.Array[FillRuleProperty]] = js.native
    
    var floodColor: js.UndefOr[FloodColorProperty | js.Array[FloodColorProperty]] = js.native
    
    var floodOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    /**
      * The **`font-variant-alternates`** CSS property controls the usage of alternate glyphs. These alternate glyphs may be referenced by alternative names defined in `@font-feature-values`.
      *
      * **Syntax**: `normal | [ stylistic( <feature-value-name> ) || historical-forms || styleset( <feature-value-name># ) || character-variant( <feature-value-name># ) || swash( <feature-value-name> ) || ornaments( <feature-value-name> ) || annotation( <feature-value-name> ) ]`
      *
      * **Initial value**: `normal`
      *
      * @deprecated
      */
    var fontVariantAlternates: js.UndefOr[FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]] = js.native
    
    var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]] = js.native
    
    /**
      * The **`column-gap`** CSS property sets the size of the gap (gutter) between an element's columns.
      *
      * **Syntax**: `<length-percentage>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var gridColumnGap: js.UndefOr[GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]] = js.native
    
    /**
      * The **`gap`** CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for `row-gap` and `column-gap`.
      *
      * **Syntax**: `<'grid-row-gap'> <'grid-column-gap'>?`
      *
      * @deprecated
      */
    var gridGap: js.UndefOr[GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]] = js.native
    
    /**
      * The **`row-gap`** CSS property sets the size of the gap (gutter) between an element's grid rows.
      *
      * **Syntax**: `<length-percentage>`
      *
      * **Initial value**: `0`
      *
      * @deprecated
      */
    var gridRowGap: js.UndefOr[GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]] = js.native
    
    /**
      * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
      *
      * **Syntax**: `auto | normal | active | inactive | disabled`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var imeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
    
    var lightingColor: js.UndefOr[LightingColorProperty | js.Array[LightingColorProperty]] = js.native
    
    var marker: js.UndefOr[MarkerProperty | js.Array[MarkerProperty]] = js.native
    
    var markerEnd: js.UndefOr[MarkerEndProperty | js.Array[MarkerEndProperty]] = js.native
    
    var markerMid: js.UndefOr[MarkerMidProperty | js.Array[MarkerMidProperty]] = js.native
    
    var markerStart: js.UndefOr[MarkerStartProperty | js.Array[MarkerStartProperty]] = js.native
    
    /**
      * The **`ime-mode`** CSS property controls the state of the input method editor (IME) for text fields. This property is obsolete.
      *
      * **Syntax**: `auto | normal | active | inactive | disabled`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var msImeMode: js.UndefOr[ImeModeProperty | js.Array[ImeModeProperty]] = js.native
    
    /**
      * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `Scrollbar`
      *
      * @deprecated
      */
    var msScrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.native
    
    /**
      * The **`inset-block`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>{1,2}`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetBlock: js.UndefOr[InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]] = js.native
    
    /**
      * The **`inset-block-end`** CSS property defines the logical block end offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetBlockEnd: js.UndefOr[InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]] = js.native
    
    /**
      * The **`inset-block-start`** CSS property defines the logical block start offset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetBlockStart: js.UndefOr[InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]] = js.native
    
    /**
      * The **`inset-inline`** CSS property defines the logical block start and end offsets of an element, which maps to physical offsets depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top` and `bottom`, or `right` and `left` properties depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>{1,2}`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetInline: js.UndefOr[InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]] = js.native
    
    /**
      * The **`inset-inline-end`** CSS property defines the logical inline end inset of an element, which maps to a physical inset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetInlineEnd: js.UndefOr[InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]] = js.native
    
    /**
      * The **`inset-inline-start`** CSS property defines the logical inline start inset of an element, which maps to a physical offset depending on the element's writing mode, directionality, and text orientation. It corresponds to the `top`, `right`, `bottom`, or `left` property depending on the values defined for `writing-mode`, `direction`, and `text-orientation`.
      *
      * **Syntax**: `<'top'>`
      *
      * **Initial value**: `auto`
      *
      * @deprecated
      */
    var offsetInlineStart: js.UndefOr[InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]] = js.native
    
    /**
      * The **`scroll-snap-coordinate`** CSS property defines the x and y coordinate positions within an element that will align with its nearest ancestor scroll container's `scroll-snap-destination` for each respective axis.
      *
      * **Syntax**: `none | <position>#`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapCoordinate: js.UndefOr[
        ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]
      ] = js.native
    
    /**
      * The **`scroll-snap-destination`** CSS property defines the position in x and y coordinates within the scroll container's visual viewport which element snap points align with.
      *
      * **Syntax**: `<position>`
      *
      * **Initial value**: `0px 0px`
      *
      * @deprecated
      */
    var scrollSnapDestination: js.UndefOr[
        ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]
      ] = js.native
    
    /**
      * The **`scroll-snap-points-x`** CSS property defines the horizontal positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]] = js.native
    
    /**
      * The **`scroll-snap-points-y`** CSS property defines the vertical positioning of snap points within the content of the scroll container they are applied to.
      *
      * **Syntax**: `none | repeat( <length-percentage> )`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]] = js.native
    
    /**
      * The **`scroll-snap-type-x`** CSS property defines how strictly snap points are enforced on the horizontal axis of the scroll container in case there is one.
      *
      * **Syntax**: `none | mandatory | proximity`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]] = js.native
    
    /**
      * The **`scroll-snap-type-y`** CSS property defines how strictly snap points are enforced on the vertical axis of the scroll container in case there is one.
      *
      * **Syntax**: `none | mandatory | proximity`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]] = js.native
    
    /**
      * The **`-ms-scrollbar-track-color`** CSS property is a Microsoft extension that specifies the color of the track element of a scrollbar.
      *
      * **Syntax**: `<color>`
      *
      * **Initial value**: `Scrollbar`
      *
      * @deprecated
      */
    var scrollbarTrackColor: js.UndefOr[MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]] = js.native
    
    var shapeRendering: js.UndefOr[ShapeRenderingProperty | js.Array[ShapeRenderingProperty]] = js.native
    
    var stopColor: js.UndefOr[StopColorProperty | js.Array[StopColorProperty]] = js.native
    
    var stopOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    var stroke: js.UndefOr[StrokeProperty | js.Array[StrokeProperty]] = js.native
    
    var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]] = js.native
    
    var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]] = js.native
    
    var strokeLinecap: js.UndefOr[StrokeLinecapProperty | js.Array[StrokeLinecapProperty]] = js.native
    
    var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]] = js.native
    
    var strokeMiterlimit: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    var strokeOpacity: js.UndefOr[GlobalsNumber | js.Array[GlobalsNumber]] = js.native
    
    var strokeWidth: js.UndefOr[StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]] = js.native
    
    var textAnchor: js.UndefOr[TextAnchorProperty | js.Array[TextAnchorProperty]] = js.native
    
    /**
      * The **`text-combine-upright`** CSS property sets the combination of characters into the space of a single character. If the combined text is wider than 1em, the user agent must fit the contents within 1em. The resulting composition is treated as a single upright glyph for layout and decoration. This property only has an effect in vertical writing modes.
      *
      * **Syntax**: `none | all | [ digits <integer>? ]`
      *
      * **Initial value**: `none`
      *
      * @deprecated
      */
    var textCombineHorizontal: js.UndefOr[TextCombineUprightProperty | js.Array[TextCombineUprightProperty]] = js.native
    
    var vectorEffect: js.UndefOr[VectorEffectProperty | js.Array[VectorEffectProperty]] = js.native
  }
  object CSSProperties {
    
    @scala.inline
    def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
    
    @scala.inline
    implicit class CSSPropertiesMutableBuilder[Self <: CSSProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$unique(value: Boolean): Self = StObject.set(x, "$unique", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$uniqueUndefined: Self = StObject.set(x, "$unique", js.undefined)
      
      @scala.inline
      def setAlignmentBaseline(value: AlignmentBaselineProperty | js.Array[AlignmentBaselineProperty]): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      @scala.inline
      def setAlignmentBaselineVarargs(value: AlignmentBaselineProperty*): Self = StObject.set(x, "alignmentBaseline", js.Array(value :_*))
      
      @scala.inline
      def setAzimuth(value: AzimuthProperty | js.Array[AzimuthProperty]): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      @scala.inline
      def setAzimuthVarargs(value: AzimuthProperty*): Self = StObject.set(x, "azimuth", js.Array(value :_*))
      
      @scala.inline
      def setBaselineShift(value: BaselineShiftProperty[TLength] | js.Array[BaselineShiftProperty[TLength]]): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      @scala.inline
      def setBaselineShiftVarargs(value: BaselineShiftProperty[TLength]*): Self = StObject.set(x, "baselineShift", js.Array(value :_*))
      
      @scala.inline
      def setBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = StObject.set(x, "boxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxAlignUndefined: Self = StObject.set(x, "boxAlign", js.undefined)
      
      @scala.inline
      def setBoxAlignVarargs(value: BoxAlignProperty*): Self = StObject.set(x, "boxAlign", js.Array(value :_*))
      
      @scala.inline
      def setBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = StObject.set(x, "boxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxDirectionUndefined: Self = StObject.set(x, "boxDirection", js.undefined)
      
      @scala.inline
      def setBoxDirectionVarargs(value: BoxDirectionProperty*): Self = StObject.set(x, "boxDirection", js.Array(value :_*))
      
      @scala.inline
      def setBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "boxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "boxFlexGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxFlexGroupUndefined: Self = StObject.set(x, "boxFlexGroup", js.undefined)
      
      @scala.inline
      def setBoxFlexGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "boxFlexGroup", js.Array(value :_*))
      
      @scala.inline
      def setBoxFlexUndefined: Self = StObject.set(x, "boxFlex", js.undefined)
      
      @scala.inline
      def setBoxFlexVarargs(value: GlobalsNumber*): Self = StObject.set(x, "boxFlex", js.Array(value :_*))
      
      @scala.inline
      def setBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = StObject.set(x, "boxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxLinesUndefined: Self = StObject.set(x, "boxLines", js.undefined)
      
      @scala.inline
      def setBoxLinesVarargs(value: BoxLinesProperty*): Self = StObject.set(x, "boxLines", js.Array(value :_*))
      
      @scala.inline
      def setBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "boxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxOrdinalGroupUndefined: Self = StObject.set(x, "boxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "boxOrdinalGroup", js.Array(value :_*))
      
      @scala.inline
      def setBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = StObject.set(x, "boxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxOrientUndefined: Self = StObject.set(x, "boxOrient", js.undefined)
      
      @scala.inline
      def setBoxOrientVarargs(value: BoxOrientProperty*): Self = StObject.set(x, "boxOrient", js.Array(value :_*))
      
      @scala.inline
      def setBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = StObject.set(x, "boxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxPackUndefined: Self = StObject.set(x, "boxPack", js.undefined)
      
      @scala.inline
      def setBoxPackVarargs(value: BoxPackProperty*): Self = StObject.set(x, "boxPack", js.Array(value :_*))
      
      @scala.inline
      def setClip(value: ClipProperty | js.Array[ClipProperty]): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRule(value: ClipRuleProperty | js.Array[ClipRuleProperty]): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      @scala.inline
      def setClipRuleVarargs(value: ClipRuleProperty*): Self = StObject.set(x, "clipRule", js.Array(value :_*))
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setClipVarargs(value: ClipProperty*): Self = StObject.set(x, "clip", js.Array(value :_*))
      
      @scala.inline
      def setColorInterpolation(value: ColorInterpolationProperty | js.Array[ColorInterpolationProperty]): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      @scala.inline
      def setColorInterpolationVarargs(value: ColorInterpolationProperty*): Self = StObject.set(x, "colorInterpolation", js.Array(value :_*))
      
      @scala.inline
      def setColorRendering(value: ColorRenderingProperty | js.Array[ColorRenderingProperty]): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      @scala.inline
      def setColorRenderingVarargs(value: ColorRenderingProperty*): Self = StObject.set(x, "colorRendering", js.Array(value :_*))
      
      @scala.inline
      def setDominantBaseline(value: DominantBaselineProperty | js.Array[DominantBaselineProperty]): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      @scala.inline
      def setDominantBaselineVarargs(value: DominantBaselineProperty*): Self = StObject.set(x, "dominantBaseline", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: FillProperty | js.Array[FillProperty]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "fillOpacity", js.Array(value :_*))
      
      @scala.inline
      def setFillRule(value: FillRuleProperty | js.Array[FillRuleProperty]): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      @scala.inline
      def setFillRuleVarargs(value: FillRuleProperty*): Self = StObject.set(x, "fillRule", js.Array(value :_*))
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFillVarargs(value: FillProperty*): Self = StObject.set(x, "fill", js.Array(value :_*))
      
      @scala.inline
      def setFloodColor(value: FloodColorProperty | js.Array[FloodColorProperty]): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      @scala.inline
      def setFloodColorVarargs(value: FloodColorProperty*): Self = StObject.set(x, "floodColor", js.Array(value :_*))
      
      @scala.inline
      def setFloodOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      @scala.inline
      def setFloodOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "floodOpacity", js.Array(value :_*))
      
      @scala.inline
      def setFontVariantAlternates(value: FontVariantAlternatesProperty | js.Array[FontVariantAlternatesProperty]): Self = StObject.set(x, "fontVariantAlternates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantAlternatesUndefined: Self = StObject.set(x, "fontVariantAlternates", js.undefined)
      
      @scala.inline
      def setFontVariantAlternatesVarargs(value: FontVariantAlternatesProperty*): Self = StObject.set(x, "fontVariantAlternates", js.Array(value :_*))
      
      @scala.inline
      def setGlyphOrientationVertical(value: GlyphOrientationVerticalProperty | js.Array[GlyphOrientationVerticalProperty]): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      @scala.inline
      def setGlyphOrientationVerticalVarargs(value: GlyphOrientationVerticalProperty*): Self = StObject.set(x, "glyphOrientationVertical", js.Array(value :_*))
      
      @scala.inline
      def setGridColumnGap(value: GridColumnGapProperty[TLength] | js.Array[GridColumnGapProperty[TLength]]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      @scala.inline
      def setGridColumnGapVarargs(value: GridColumnGapProperty[TLength]*): Self = StObject.set(x, "gridColumnGap", js.Array(value :_*))
      
      @scala.inline
      def setGridGap(value: GridGapProperty[TLength] | js.Array[GridGapProperty[TLength]]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      @scala.inline
      def setGridGapVarargs(value: GridGapProperty[TLength]*): Self = StObject.set(x, "gridGap", js.Array(value :_*))
      
      @scala.inline
      def setGridRowGap(value: GridRowGapProperty[TLength] | js.Array[GridRowGapProperty[TLength]]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      @scala.inline
      def setGridRowGapVarargs(value: GridRowGapProperty[TLength]*): Self = StObject.set(x, "gridRowGap", js.Array(value :_*))
      
      @scala.inline
      def setImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      @scala.inline
      def setImeModeVarargs(value: ImeModeProperty*): Self = StObject.set(x, "imeMode", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = StObject.set(x, "KhtmlBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxAlignUndefined: Self = StObject.set(x, "KhtmlBoxAlign", js.undefined)
      
      @scala.inline
      def setKhtmlBoxAlignVarargs(value: BoxAlignProperty*): Self = StObject.set(x, "KhtmlBoxAlign", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = StObject.set(x, "KhtmlBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxDirectionUndefined: Self = StObject.set(x, "KhtmlBoxDirection", js.undefined)
      
      @scala.inline
      def setKhtmlBoxDirectionVarargs(value: BoxDirectionProperty*): Self = StObject.set(x, "KhtmlBoxDirection", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "KhtmlBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxFlexGroupUndefined: Self = StObject.set(x, "KhtmlBoxFlexGroup", js.undefined)
      
      @scala.inline
      def setKhtmlBoxFlexGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "KhtmlBoxFlexGroup", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxFlexUndefined: Self = StObject.set(x, "KhtmlBoxFlex", js.undefined)
      
      @scala.inline
      def setKhtmlBoxFlexVarargs(value: GlobalsNumber*): Self = StObject.set(x, "KhtmlBoxFlex", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = StObject.set(x, "KhtmlBoxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxLinesUndefined: Self = StObject.set(x, "KhtmlBoxLines", js.undefined)
      
      @scala.inline
      def setKhtmlBoxLinesVarargs(value: BoxLinesProperty*): Self = StObject.set(x, "KhtmlBoxLines", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxOrdinalGroupUndefined: Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setKhtmlBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = StObject.set(x, "KhtmlBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxOrientUndefined: Self = StObject.set(x, "KhtmlBoxOrient", js.undefined)
      
      @scala.inline
      def setKhtmlBoxOrientVarargs(value: BoxOrientProperty*): Self = StObject.set(x, "KhtmlBoxOrient", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = StObject.set(x, "KhtmlBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlBoxPackUndefined: Self = StObject.set(x, "KhtmlBoxPack", js.undefined)
      
      @scala.inline
      def setKhtmlBoxPackVarargs(value: BoxPackProperty*): Self = StObject.set(x, "KhtmlBoxPack", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlLineBreak(value: LineBreakProperty | js.Array[LineBreakProperty]): Self = StObject.set(x, "KhtmlLineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlLineBreakUndefined: Self = StObject.set(x, "KhtmlLineBreak", js.undefined)
      
      @scala.inline
      def setKhtmlLineBreakVarargs(value: LineBreakProperty*): Self = StObject.set(x, "KhtmlLineBreak", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlOpacity(value: OpacityProperty | js.Array[OpacityProperty]): Self = StObject.set(x, "KhtmlOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlOpacityUndefined: Self = StObject.set(x, "KhtmlOpacity", js.undefined)
      
      @scala.inline
      def setKhtmlOpacityVarargs(value: OpacityProperty*): Self = StObject.set(x, "KhtmlOpacity", js.Array(value :_*))
      
      @scala.inline
      def setKhtmlUserSelect(value: UserSelectProperty | js.Array[UserSelectProperty]): Self = StObject.set(x, "KhtmlUserSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKhtmlUserSelectUndefined: Self = StObject.set(x, "KhtmlUserSelect", js.undefined)
      
      @scala.inline
      def setKhtmlUserSelectVarargs(value: UserSelectProperty*): Self = StObject.set(x, "KhtmlUserSelect", js.Array(value :_*))
      
      @scala.inline
      def setLightingColor(value: LightingColorProperty | js.Array[LightingColorProperty]): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      @scala.inline
      def setLightingColorVarargs(value: LightingColorProperty*): Self = StObject.set(x, "lightingColor", js.Array(value :_*))
      
      @scala.inline
      def setMarker(value: MarkerProperty | js.Array[MarkerProperty]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEnd(value: MarkerEndProperty | js.Array[MarkerEndProperty]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      @scala.inline
      def setMarkerEndVarargs(value: MarkerEndProperty*): Self = StObject.set(x, "markerEnd", js.Array(value :_*))
      
      @scala.inline
      def setMarkerMid(value: MarkerMidProperty | js.Array[MarkerMidProperty]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      @scala.inline
      def setMarkerMidVarargs(value: MarkerMidProperty*): Self = StObject.set(x, "markerMid", js.Array(value :_*))
      
      @scala.inline
      def setMarkerStart(value: MarkerStartProperty | js.Array[MarkerStartProperty]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      @scala.inline
      def setMarkerStartVarargs(value: MarkerStartProperty*): Self = StObject.set(x, "markerStart", js.Array(value :_*))
      
      @scala.inline
      def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      @scala.inline
      def setMarkerVarargs(value: MarkerProperty*): Self = StObject.set(x, "marker", js.Array(value :_*))
      
      @scala.inline
      def setMozBackgroundClip(value: BackgroundClipProperty | js.Array[BackgroundClipProperty]): Self = StObject.set(x, "MozBackgroundClip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundClipUndefined: Self = StObject.set(x, "MozBackgroundClip", js.undefined)
      
      @scala.inline
      def setMozBackgroundClipVarargs(value: BackgroundClipProperty*): Self = StObject.set(x, "MozBackgroundClip", js.Array(value :_*))
      
      @scala.inline
      def setMozBackgroundInlinePolicy(value: BoxDecorationBreakProperty | js.Array[BoxDecorationBreakProperty]): Self = StObject.set(x, "MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundInlinePolicyUndefined: Self = StObject.set(x, "MozBackgroundInlinePolicy", js.undefined)
      
      @scala.inline
      def setMozBackgroundInlinePolicyVarargs(value: BoxDecorationBreakProperty*): Self = StObject.set(x, "MozBackgroundInlinePolicy", js.Array(value :_*))
      
      @scala.inline
      def setMozBackgroundOrigin(value: BackgroundOriginProperty | js.Array[BackgroundOriginProperty]): Self = StObject.set(x, "MozBackgroundOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundOriginUndefined: Self = StObject.set(x, "MozBackgroundOrigin", js.undefined)
      
      @scala.inline
      def setMozBackgroundOriginVarargs(value: BackgroundOriginProperty*): Self = StObject.set(x, "MozBackgroundOrigin", js.Array(value :_*))
      
      @scala.inline
      def setMozBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = StObject.set(x, "MozBackgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBackgroundSizeUndefined: Self = StObject.set(x, "MozBackgroundSize", js.undefined)
      
      @scala.inline
      def setMozBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = StObject.set(x, "MozBackgroundSize", js.Array(value :_*))
      
      @scala.inline
      def setMozBinding(value: MozBindingProperty | js.Array[MozBindingProperty]): Self = StObject.set(x, "MozBinding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBindingUndefined: Self = StObject.set(x, "MozBinding", js.undefined)
      
      @scala.inline
      def setMozBindingVarargs(value: MozBindingProperty*): Self = StObject.set(x, "MozBinding", js.Array(value :_*))
      
      @scala.inline
      def setMozBorderRadius(value: BorderRadiusProperty[TLength] | js.Array[BorderRadiusProperty[TLength]]): Self = StObject.set(x, "MozBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusBottomleft(value: BorderBottomLeftRadiusProperty[TLength] | js.Array[BorderBottomLeftRadiusProperty[TLength]]): Self = StObject.set(x, "MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusBottomleftUndefined: Self = StObject.set(x, "MozBorderRadiusBottomleft", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusBottomleftVarargs(value: BorderBottomLeftRadiusProperty[TLength]*): Self = StObject.set(x, "MozBorderRadiusBottomleft", js.Array(value :_*))
      
      @scala.inline
      def setMozBorderRadiusBottomright(
        value: BorderBottomRightRadiusProperty[TLength] | js.Array[BorderBottomRightRadiusProperty[TLength]]
      ): Self = StObject.set(x, "MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusBottomrightUndefined: Self = StObject.set(x, "MozBorderRadiusBottomright", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusBottomrightVarargs(value: BorderBottomRightRadiusProperty[TLength]*): Self = StObject.set(x, "MozBorderRadiusBottomright", js.Array(value :_*))
      
      @scala.inline
      def setMozBorderRadiusTopleft(value: BorderTopLeftRadiusProperty[TLength] | js.Array[BorderTopLeftRadiusProperty[TLength]]): Self = StObject.set(x, "MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusTopleftUndefined: Self = StObject.set(x, "MozBorderRadiusTopleft", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusTopleftVarargs(value: BorderTopLeftRadiusProperty[TLength]*): Self = StObject.set(x, "MozBorderRadiusTopleft", js.Array(value :_*))
      
      @scala.inline
      def setMozBorderRadiusTopright(value: BorderTopRightRadiusProperty[TLength] | js.Array[BorderTopRightRadiusProperty[TLength]]): Self = StObject.set(x, "MozBorderRadiusTopright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBorderRadiusToprightUndefined: Self = StObject.set(x, "MozBorderRadiusTopright", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusToprightVarargs(value: BorderTopRightRadiusProperty[TLength]*): Self = StObject.set(x, "MozBorderRadiusTopright", js.Array(value :_*))
      
      @scala.inline
      def setMozBorderRadiusUndefined: Self = StObject.set(x, "MozBorderRadius", js.undefined)
      
      @scala.inline
      def setMozBorderRadiusVarargs(value: BorderRadiusProperty[TLength]*): Self = StObject.set(x, "MozBorderRadius", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = StObject.set(x, "MozBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxAlignUndefined: Self = StObject.set(x, "MozBoxAlign", js.undefined)
      
      @scala.inline
      def setMozBoxAlignVarargs(value: BoxAlignProperty*): Self = StObject.set(x, "MozBoxAlign", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = StObject.set(x, "MozBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxDirectionUndefined: Self = StObject.set(x, "MozBoxDirection", js.undefined)
      
      @scala.inline
      def setMozBoxDirectionVarargs(value: BoxDirectionProperty*): Self = StObject.set(x, "MozBoxDirection", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "MozBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxFlexUndefined: Self = StObject.set(x, "MozBoxFlex", js.undefined)
      
      @scala.inline
      def setMozBoxFlexVarargs(value: GlobalsNumber*): Self = StObject.set(x, "MozBoxFlex", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxOrdinalGroupUndefined: Self = StObject.set(x, "MozBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setMozBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "MozBoxOrdinalGroup", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = StObject.set(x, "MozBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxOrientUndefined: Self = StObject.set(x, "MozBoxOrient", js.undefined)
      
      @scala.inline
      def setMozBoxOrientVarargs(value: BoxOrientProperty*): Self = StObject.set(x, "MozBoxOrient", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = StObject.set(x, "MozBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxPackUndefined: Self = StObject.set(x, "MozBoxPack", js.undefined)
      
      @scala.inline
      def setMozBoxPackVarargs(value: BoxPackProperty*): Self = StObject.set(x, "MozBoxPack", js.Array(value :_*))
      
      @scala.inline
      def setMozBoxShadow(value: BoxShadowProperty | js.Array[BoxShadowProperty]): Self = StObject.set(x, "MozBoxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozBoxShadowUndefined: Self = StObject.set(x, "MozBoxShadow", js.undefined)
      
      @scala.inline
      def setMozBoxShadowVarargs(value: BoxShadowProperty*): Self = StObject.set(x, "MozBoxShadow", js.Array(value :_*))
      
      @scala.inline
      def setMozFloatEdge(value: MozFloatEdgeProperty | js.Array[MozFloatEdgeProperty]): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
      
      @scala.inline
      def setMozFloatEdgeVarargs(value: MozFloatEdgeProperty*): Self = StObject.set(x, "MozFloatEdge", js.Array(value :_*))
      
      @scala.inline
      def setMozForceBrokenImageIcon(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
      
      @scala.inline
      def setMozForceBrokenImageIconVarargs(value: GlobalsNumber*): Self = StObject.set(x, "MozForceBrokenImageIcon", js.Array(value :_*))
      
      @scala.inline
      def setMozOpacity(value: OpacityProperty | js.Array[OpacityProperty]): Self = StObject.set(x, "MozOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOpacityUndefined: Self = StObject.set(x, "MozOpacity", js.undefined)
      
      @scala.inline
      def setMozOpacityVarargs(value: OpacityProperty*): Self = StObject.set(x, "MozOpacity", js.Array(value :_*))
      
      @scala.inline
      def setMozOutline(value: OutlineProperty[TLength] | js.Array[OutlineProperty[TLength]]): Self = StObject.set(x, "MozOutline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineColor(value: OutlineColorProperty | js.Array[OutlineColorProperty]): Self = StObject.set(x, "MozOutlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineColorUndefined: Self = StObject.set(x, "MozOutlineColor", js.undefined)
      
      @scala.inline
      def setMozOutlineColorVarargs(value: OutlineColorProperty*): Self = StObject.set(x, "MozOutlineColor", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineRadius(value: MozOutlineRadiusProperty[TLength] | js.Array[MozOutlineRadiusProperty[TLength]]): Self = StObject.set(x, "MozOutlineRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusBottomleft(
        value: MozOutlineRadiusBottomleftProperty[TLength] | js.Array[MozOutlineRadiusBottomleftProperty[TLength]]
      ): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusBottomleftVarargs(value: MozOutlineRadiusBottomleftProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineRadiusBottomright(
        value: MozOutlineRadiusBottomrightProperty[TLength] | js.Array[MozOutlineRadiusBottomrightProperty[TLength]]
      ): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusBottomrightVarargs(value: MozOutlineRadiusBottomrightProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusBottomright", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineRadiusTopleft(
        value: MozOutlineRadiusTopleftProperty[TLength] | js.Array[MozOutlineRadiusTopleftProperty[TLength]]
      ): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusTopleftVarargs(value: MozOutlineRadiusTopleftProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusTopleft", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineRadiusTopright(
        value: MozOutlineRadiusToprightProperty[TLength] | js.Array[MozOutlineRadiusToprightProperty[TLength]]
      ): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusToprightVarargs(value: MozOutlineRadiusToprightProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadiusTopright", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineRadiusUndefined: Self = StObject.set(x, "MozOutlineRadius", js.undefined)
      
      @scala.inline
      def setMozOutlineRadiusVarargs(value: MozOutlineRadiusProperty[TLength]*): Self = StObject.set(x, "MozOutlineRadius", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineStyle(value: OutlineStyleProperty | js.Array[OutlineStyleProperty]): Self = StObject.set(x, "MozOutlineStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineStyleUndefined: Self = StObject.set(x, "MozOutlineStyle", js.undefined)
      
      @scala.inline
      def setMozOutlineStyleVarargs(value: OutlineStyleProperty*): Self = StObject.set(x, "MozOutlineStyle", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineUndefined: Self = StObject.set(x, "MozOutline", js.undefined)
      
      @scala.inline
      def setMozOutlineVarargs(value: OutlineProperty[TLength]*): Self = StObject.set(x, "MozOutline", js.Array(value :_*))
      
      @scala.inline
      def setMozOutlineWidth(value: OutlineWidthProperty[TLength] | js.Array[OutlineWidthProperty[TLength]]): Self = StObject.set(x, "MozOutlineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozOutlineWidthUndefined: Self = StObject.set(x, "MozOutlineWidth", js.undefined)
      
      @scala.inline
      def setMozOutlineWidthVarargs(value: OutlineWidthProperty[TLength]*): Self = StObject.set(x, "MozOutlineWidth", js.Array(value :_*))
      
      @scala.inline
      def setMozTextAlignLast(value: TextAlignLastProperty | js.Array[TextAlignLastProperty]): Self = StObject.set(x, "MozTextAlignLast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextAlignLastUndefined: Self = StObject.set(x, "MozTextAlignLast", js.undefined)
      
      @scala.inline
      def setMozTextAlignLastVarargs(value: TextAlignLastProperty*): Self = StObject.set(x, "MozTextAlignLast", js.Array(value :_*))
      
      @scala.inline
      def setMozTextDecorationColor(value: TextDecorationColorProperty | js.Array[TextDecorationColorProperty]): Self = StObject.set(x, "MozTextDecorationColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextDecorationColorUndefined: Self = StObject.set(x, "MozTextDecorationColor", js.undefined)
      
      @scala.inline
      def setMozTextDecorationColorVarargs(value: TextDecorationColorProperty*): Self = StObject.set(x, "MozTextDecorationColor", js.Array(value :_*))
      
      @scala.inline
      def setMozTextDecorationLine(value: TextDecorationLineProperty | js.Array[TextDecorationLineProperty]): Self = StObject.set(x, "MozTextDecorationLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextDecorationLineUndefined: Self = StObject.set(x, "MozTextDecorationLine", js.undefined)
      
      @scala.inline
      def setMozTextDecorationLineVarargs(value: TextDecorationLineProperty*): Self = StObject.set(x, "MozTextDecorationLine", js.Array(value :_*))
      
      @scala.inline
      def setMozTextDecorationStyle(value: TextDecorationStyleProperty | js.Array[TextDecorationStyleProperty]): Self = StObject.set(x, "MozTextDecorationStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozTextDecorationStyleUndefined: Self = StObject.set(x, "MozTextDecorationStyle", js.undefined)
      
      @scala.inline
      def setMozTextDecorationStyleVarargs(value: TextDecorationStyleProperty*): Self = StObject.set(x, "MozTextDecorationStyle", js.Array(value :_*))
      
      @scala.inline
      def setMozUserInput(value: MozUserInputProperty | js.Array[MozUserInputProperty]): Self = StObject.set(x, "MozUserInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMozUserInputUndefined: Self = StObject.set(x, "MozUserInput", js.undefined)
      
      @scala.inline
      def setMozUserInputVarargs(value: MozUserInputProperty*): Self = StObject.set(x, "MozUserInput", js.Array(value :_*))
      
      @scala.inline
      def setMsImeMode(value: ImeModeProperty | js.Array[ImeModeProperty]): Self = StObject.set(x, "msImeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsImeModeUndefined: Self = StObject.set(x, "msImeMode", js.undefined)
      
      @scala.inline
      def setMsImeModeVarargs(value: ImeModeProperty*): Self = StObject.set(x, "msImeMode", js.Array(value :_*))
      
      @scala.inline
      def setMsScrollbarTrackColor(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): Self = StObject.set(x, "msScrollbarTrackColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsScrollbarTrackColorUndefined: Self = StObject.set(x, "msScrollbarTrackColor", js.undefined)
      
      @scala.inline
      def setMsScrollbarTrackColorVarargs(value: MsScrollbarTrackColorProperty*): Self = StObject.set(x, "msScrollbarTrackColor", js.Array(value :_*))
      
      @scala.inline
      def setOAnimation(value: AnimationProperty | js.Array[AnimationProperty]): Self = StObject.set(x, "OAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "OAnimationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDelayUndefined: Self = StObject.set(x, "OAnimationDelay", js.undefined)
      
      @scala.inline
      def setOAnimationDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "OAnimationDelay", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationDirection(value: AnimationDirectionProperty | js.Array[AnimationDirectionProperty]): Self = StObject.set(x, "OAnimationDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDirectionUndefined: Self = StObject.set(x, "OAnimationDirection", js.undefined)
      
      @scala.inline
      def setOAnimationDirectionVarargs(value: AnimationDirectionProperty*): Self = StObject.set(x, "OAnimationDirection", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "OAnimationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationDurationUndefined: Self = StObject.set(x, "OAnimationDuration", js.undefined)
      
      @scala.inline
      def setOAnimationDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "OAnimationDuration", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationFillMode(value: AnimationFillModeProperty | js.Array[AnimationFillModeProperty]): Self = StObject.set(x, "OAnimationFillMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationFillModeUndefined: Self = StObject.set(x, "OAnimationFillMode", js.undefined)
      
      @scala.inline
      def setOAnimationFillModeVarargs(value: AnimationFillModeProperty*): Self = StObject.set(x, "OAnimationFillMode", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationIterationCount(value: AnimationIterationCountProperty | js.Array[AnimationIterationCountProperty]): Self = StObject.set(x, "OAnimationIterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationIterationCountUndefined: Self = StObject.set(x, "OAnimationIterationCount", js.undefined)
      
      @scala.inline
      def setOAnimationIterationCountVarargs(value: AnimationIterationCountProperty*): Self = StObject.set(x, "OAnimationIterationCount", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationName(value: AnimationNameProperty | js.Array[AnimationNameProperty]): Self = StObject.set(x, "OAnimationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationNameUndefined: Self = StObject.set(x, "OAnimationName", js.undefined)
      
      @scala.inline
      def setOAnimationNameVarargs(value: AnimationNameProperty*): Self = StObject.set(x, "OAnimationName", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationPlayState(value: AnimationPlayStateProperty | js.Array[AnimationPlayStateProperty]): Self = StObject.set(x, "OAnimationPlayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationPlayStateUndefined: Self = StObject.set(x, "OAnimationPlayState", js.undefined)
      
      @scala.inline
      def setOAnimationPlayStateVarargs(value: AnimationPlayStateProperty*): Self = StObject.set(x, "OAnimationPlayState", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationTimingFunction(value: AnimationTimingFunctionProperty | js.Array[AnimationTimingFunctionProperty]): Self = StObject.set(x, "OAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOAnimationTimingFunctionUndefined: Self = StObject.set(x, "OAnimationTimingFunction", js.undefined)
      
      @scala.inline
      def setOAnimationTimingFunctionVarargs(value: AnimationTimingFunctionProperty*): Self = StObject.set(x, "OAnimationTimingFunction", js.Array(value :_*))
      
      @scala.inline
      def setOAnimationUndefined: Self = StObject.set(x, "OAnimation", js.undefined)
      
      @scala.inline
      def setOAnimationVarargs(value: AnimationProperty*): Self = StObject.set(x, "OAnimation", js.Array(value :_*))
      
      @scala.inline
      def setOBackgroundSize(value: BackgroundSizeProperty[TLength] | js.Array[BackgroundSizeProperty[TLength]]): Self = StObject.set(x, "OBackgroundSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOBackgroundSizeUndefined: Self = StObject.set(x, "OBackgroundSize", js.undefined)
      
      @scala.inline
      def setOBackgroundSizeVarargs(value: BackgroundSizeProperty[TLength]*): Self = StObject.set(x, "OBackgroundSize", js.Array(value :_*))
      
      @scala.inline
      def setOBorderImage(value: BorderImageProperty | js.Array[BorderImageProperty]): Self = StObject.set(x, "OBorderImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOBorderImageUndefined: Self = StObject.set(x, "OBorderImage", js.undefined)
      
      @scala.inline
      def setOBorderImageVarargs(value: BorderImageProperty*): Self = StObject.set(x, "OBorderImage", js.Array(value :_*))
      
      @scala.inline
      def setOTransform(value: TransformProperty | js.Array[TransformProperty]): Self = StObject.set(x, "OTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransformUndefined: Self = StObject.set(x, "OTransform", js.undefined)
      
      @scala.inline
      def setOTransformVarargs(value: TransformProperty*): Self = StObject.set(x, "OTransform", js.Array(value :_*))
      
      @scala.inline
      def setOTransition(value: TransitionProperty | js.Array[TransitionProperty]): Self = StObject.set(x, "OTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionDelay(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "OTransitionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionDelayUndefined: Self = StObject.set(x, "OTransitionDelay", js.undefined)
      
      @scala.inline
      def setOTransitionDelayVarargs(value: GlobalsString*): Self = StObject.set(x, "OTransitionDelay", js.Array(value :_*))
      
      @scala.inline
      def setOTransitionDuration(value: GlobalsString | js.Array[GlobalsString]): Self = StObject.set(x, "OTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionDurationUndefined: Self = StObject.set(x, "OTransitionDuration", js.undefined)
      
      @scala.inline
      def setOTransitionDurationVarargs(value: GlobalsString*): Self = StObject.set(x, "OTransitionDuration", js.Array(value :_*))
      
      @scala.inline
      def setOTransitionProperty(value: TransitionPropertyProperty | js.Array[TransitionPropertyProperty]): Self = StObject.set(x, "OTransitionProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionPropertyUndefined: Self = StObject.set(x, "OTransitionProperty", js.undefined)
      
      @scala.inline
      def setOTransitionPropertyVarargs(value: TransitionPropertyProperty*): Self = StObject.set(x, "OTransitionProperty", js.Array(value :_*))
      
      @scala.inline
      def setOTransitionTimingFunction(value: TransitionTimingFunctionProperty | js.Array[TransitionTimingFunctionProperty]): Self = StObject.set(x, "OTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTransitionTimingFunctionUndefined: Self = StObject.set(x, "OTransitionTimingFunction", js.undefined)
      
      @scala.inline
      def setOTransitionTimingFunctionVarargs(value: TransitionTimingFunctionProperty*): Self = StObject.set(x, "OTransitionTimingFunction", js.Array(value :_*))
      
      @scala.inline
      def setOTransitionUndefined: Self = StObject.set(x, "OTransition", js.undefined)
      
      @scala.inline
      def setOTransitionVarargs(value: TransitionProperty*): Self = StObject.set(x, "OTransition", js.Array(value :_*))
      
      @scala.inline
      def setOffsetBlock(value: InsetBlockProperty[TLength] | js.Array[InsetBlockProperty[TLength]]): Self = StObject.set(x, "offsetBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBlockEnd(value: InsetBlockEndProperty[TLength] | js.Array[InsetBlockEndProperty[TLength]]): Self = StObject.set(x, "offsetBlockEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBlockEndUndefined: Self = StObject.set(x, "offsetBlockEnd", js.undefined)
      
      @scala.inline
      def setOffsetBlockEndVarargs(value: InsetBlockEndProperty[TLength]*): Self = StObject.set(x, "offsetBlockEnd", js.Array(value :_*))
      
      @scala.inline
      def setOffsetBlockStart(value: InsetBlockStartProperty[TLength] | js.Array[InsetBlockStartProperty[TLength]]): Self = StObject.set(x, "offsetBlockStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBlockStartUndefined: Self = StObject.set(x, "offsetBlockStart", js.undefined)
      
      @scala.inline
      def setOffsetBlockStartVarargs(value: InsetBlockStartProperty[TLength]*): Self = StObject.set(x, "offsetBlockStart", js.Array(value :_*))
      
      @scala.inline
      def setOffsetBlockUndefined: Self = StObject.set(x, "offsetBlock", js.undefined)
      
      @scala.inline
      def setOffsetBlockVarargs(value: InsetBlockProperty[TLength]*): Self = StObject.set(x, "offsetBlock", js.Array(value :_*))
      
      @scala.inline
      def setOffsetInline(value: InsetInlineProperty[TLength] | js.Array[InsetInlineProperty[TLength]]): Self = StObject.set(x, "offsetInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetInlineEnd(value: InsetInlineEndProperty[TLength] | js.Array[InsetInlineEndProperty[TLength]]): Self = StObject.set(x, "offsetInlineEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetInlineEndUndefined: Self = StObject.set(x, "offsetInlineEnd", js.undefined)
      
      @scala.inline
      def setOffsetInlineEndVarargs(value: InsetInlineEndProperty[TLength]*): Self = StObject.set(x, "offsetInlineEnd", js.Array(value :_*))
      
      @scala.inline
      def setOffsetInlineStart(value: InsetInlineStartProperty[TLength] | js.Array[InsetInlineStartProperty[TLength]]): Self = StObject.set(x, "offsetInlineStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetInlineStartUndefined: Self = StObject.set(x, "offsetInlineStart", js.undefined)
      
      @scala.inline
      def setOffsetInlineStartVarargs(value: InsetInlineStartProperty[TLength]*): Self = StObject.set(x, "offsetInlineStart", js.Array(value :_*))
      
      @scala.inline
      def setOffsetInlineUndefined: Self = StObject.set(x, "offsetInline", js.undefined)
      
      @scala.inline
      def setOffsetInlineVarargs(value: InsetInlineProperty[TLength]*): Self = StObject.set(x, "offsetInline", js.Array(value :_*))
      
      @scala.inline
      def setScrollSnapCoordinate(value: ScrollSnapCoordinateProperty[TLength] | js.Array[ScrollSnapCoordinateProperty[TLength]]): Self = StObject.set(x, "scrollSnapCoordinate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapCoordinateUndefined: Self = StObject.set(x, "scrollSnapCoordinate", js.undefined)
      
      @scala.inline
      def setScrollSnapCoordinateVarargs(value: ScrollSnapCoordinateProperty[TLength]*): Self = StObject.set(x, "scrollSnapCoordinate", js.Array(value :_*))
      
      @scala.inline
      def setScrollSnapDestination(value: ScrollSnapDestinationProperty[TLength] | js.Array[ScrollSnapDestinationProperty[TLength]]): Self = StObject.set(x, "scrollSnapDestination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapDestinationUndefined: Self = StObject.set(x, "scrollSnapDestination", js.undefined)
      
      @scala.inline
      def setScrollSnapDestinationVarargs(value: ScrollSnapDestinationProperty[TLength]*): Self = StObject.set(x, "scrollSnapDestination", js.Array(value :_*))
      
      @scala.inline
      def setScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = StObject.set(x, "scrollSnapPointsX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapPointsXUndefined: Self = StObject.set(x, "scrollSnapPointsX", js.undefined)
      
      @scala.inline
      def setScrollSnapPointsXVarargs(value: ScrollSnapPointsXProperty*): Self = StObject.set(x, "scrollSnapPointsX", js.Array(value :_*))
      
      @scala.inline
      def setScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = StObject.set(x, "scrollSnapPointsY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapPointsYUndefined: Self = StObject.set(x, "scrollSnapPointsY", js.undefined)
      
      @scala.inline
      def setScrollSnapPointsYVarargs(value: ScrollSnapPointsYProperty*): Self = StObject.set(x, "scrollSnapPointsY", js.Array(value :_*))
      
      @scala.inline
      def setScrollSnapTypeX(value: ScrollSnapTypeXProperty | js.Array[ScrollSnapTypeXProperty]): Self = StObject.set(x, "scrollSnapTypeX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapTypeXUndefined: Self = StObject.set(x, "scrollSnapTypeX", js.undefined)
      
      @scala.inline
      def setScrollSnapTypeXVarargs(value: ScrollSnapTypeXProperty*): Self = StObject.set(x, "scrollSnapTypeX", js.Array(value :_*))
      
      @scala.inline
      def setScrollSnapTypeY(value: ScrollSnapTypeYProperty | js.Array[ScrollSnapTypeYProperty]): Self = StObject.set(x, "scrollSnapTypeY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSnapTypeYUndefined: Self = StObject.set(x, "scrollSnapTypeY", js.undefined)
      
      @scala.inline
      def setScrollSnapTypeYVarargs(value: ScrollSnapTypeYProperty*): Self = StObject.set(x, "scrollSnapTypeY", js.Array(value :_*))
      
      @scala.inline
      def setScrollbarTrackColor(value: MsScrollbarTrackColorProperty | js.Array[MsScrollbarTrackColorProperty]): Self = StObject.set(x, "scrollbarTrackColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarTrackColorUndefined: Self = StObject.set(x, "scrollbarTrackColor", js.undefined)
      
      @scala.inline
      def setScrollbarTrackColorVarargs(value: MsScrollbarTrackColorProperty*): Self = StObject.set(x, "scrollbarTrackColor", js.Array(value :_*))
      
      @scala.inline
      def setShapeRendering(value: ShapeRenderingProperty | js.Array[ShapeRenderingProperty]): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      @scala.inline
      def setShapeRenderingVarargs(value: ShapeRenderingProperty*): Self = StObject.set(x, "shapeRendering", js.Array(value :_*))
      
      @scala.inline
      def setStopColor(value: StopColorProperty | js.Array[StopColorProperty]): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      @scala.inline
      def setStopColorVarargs(value: StopColorProperty*): Self = StObject.set(x, "stopColor", js.Array(value :_*))
      
      @scala.inline
      def setStopOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      @scala.inline
      def setStopOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "stopOpacity", js.Array(value :_*))
      
      @scala.inline
      def setStroke(value: StrokeProperty | js.Array[StrokeProperty]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharray(value: StrokeDasharrayProperty[TLength] | js.Array[StrokeDasharrayProperty[TLength]]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      @scala.inline
      def setStrokeDasharrayVarargs(value: StrokeDasharrayProperty[TLength]*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
      
      @scala.inline
      def setStrokeDashoffset(value: StrokeDashoffsetProperty[TLength] | js.Array[StrokeDashoffsetProperty[TLength]]): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      @scala.inline
      def setStrokeDashoffsetVarargs(value: StrokeDashoffsetProperty[TLength]*): Self = StObject.set(x, "strokeDashoffset", js.Array(value :_*))
      
      @scala.inline
      def setStrokeLinecap(value: StrokeLinecapProperty | js.Array[StrokeLinecapProperty]): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeLinecapVarargs(value: StrokeLinecapProperty*): Self = StObject.set(x, "strokeLinecap", js.Array(value :_*))
      
      @scala.inline
      def setStrokeLinejoin(value: StrokeLinejoinProperty | js.Array[StrokeLinejoinProperty]): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      @scala.inline
      def setStrokeLinejoinVarargs(value: StrokeLinejoinProperty*): Self = StObject.set(x, "strokeLinejoin", js.Array(value :_*))
      
      @scala.inline
      def setStrokeMiterlimit(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      @scala.inline
      def setStrokeMiterlimitVarargs(value: GlobalsNumber*): Self = StObject.set(x, "strokeMiterlimit", js.Array(value :_*))
      
      @scala.inline
      def setStrokeOpacity(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeOpacityVarargs(value: GlobalsNumber*): Self = StObject.set(x, "strokeOpacity", js.Array(value :_*))
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeVarargs(value: StrokeProperty*): Self = StObject.set(x, "stroke", js.Array(value :_*))
      
      @scala.inline
      def setStrokeWidth(value: StrokeWidthProperty[TLength] | js.Array[StrokeWidthProperty[TLength]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStrokeWidthVarargs(value: StrokeWidthProperty[TLength]*): Self = StObject.set(x, "strokeWidth", js.Array(value :_*))
      
      @scala.inline
      def setTextAnchor(value: TextAnchorProperty | js.Array[TextAnchorProperty]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      @scala.inline
      def setTextAnchorVarargs(value: TextAnchorProperty*): Self = StObject.set(x, "textAnchor", js.Array(value :_*))
      
      @scala.inline
      def setTextCombineHorizontal(value: TextCombineUprightProperty | js.Array[TextCombineUprightProperty]): Self = StObject.set(x, "textCombineHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextCombineHorizontalUndefined: Self = StObject.set(x, "textCombineHorizontal", js.undefined)
      
      @scala.inline
      def setTextCombineHorizontalVarargs(value: TextCombineUprightProperty*): Self = StObject.set(x, "textCombineHorizontal", js.Array(value :_*))
      
      @scala.inline
      def setVectorEffect(value: VectorEffectProperty | js.Array[VectorEffectProperty]): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      @scala.inline
      def setVectorEffectVarargs(value: VectorEffectProperty*): Self = StObject.set(x, "vectorEffect", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxAlign(value: BoxAlignProperty | js.Array[BoxAlignProperty]): Self = StObject.set(x, "WebkitBoxAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxAlignUndefined: Self = StObject.set(x, "WebkitBoxAlign", js.undefined)
      
      @scala.inline
      def setWebkitBoxAlignVarargs(value: BoxAlignProperty*): Self = StObject.set(x, "WebkitBoxAlign", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxDirection(value: BoxDirectionProperty | js.Array[BoxDirectionProperty]): Self = StObject.set(x, "WebkitBoxDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "WebkitBoxDirection", js.undefined)
      
      @scala.inline
      def setWebkitBoxDirectionVarargs(value: BoxDirectionProperty*): Self = StObject.set(x, "WebkitBoxDirection", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxFlex(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "WebkitBoxFlex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxFlexGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxFlexGroupUndefined: Self = StObject.set(x, "WebkitBoxFlexGroup", js.undefined)
      
      @scala.inline
      def setWebkitBoxFlexGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "WebkitBoxFlexGroup", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxFlexUndefined: Self = StObject.set(x, "WebkitBoxFlex", js.undefined)
      
      @scala.inline
      def setWebkitBoxFlexVarargs(value: GlobalsNumber*): Self = StObject.set(x, "WebkitBoxFlex", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxLines(value: BoxLinesProperty | js.Array[BoxLinesProperty]): Self = StObject.set(x, "WebkitBoxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxLinesUndefined: Self = StObject.set(x, "WebkitBoxLines", js.undefined)
      
      @scala.inline
      def setWebkitBoxLinesVarargs(value: BoxLinesProperty*): Self = StObject.set(x, "WebkitBoxLines", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxOrdinalGroup(value: GlobalsNumber | js.Array[GlobalsNumber]): Self = StObject.set(x, "WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.undefined)
      
      @scala.inline
      def setWebkitBoxOrdinalGroupVarargs(value: GlobalsNumber*): Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxOrient(value: BoxOrientProperty | js.Array[BoxOrientProperty]): Self = StObject.set(x, "WebkitBoxOrient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxOrientUndefined: Self = StObject.set(x, "WebkitBoxOrient", js.undefined)
      
      @scala.inline
      def setWebkitBoxOrientVarargs(value: BoxOrientProperty*): Self = StObject.set(x, "WebkitBoxOrient", js.Array(value :_*))
      
      @scala.inline
      def setWebkitBoxPack(value: BoxPackProperty | js.Array[BoxPackProperty]): Self = StObject.set(x, "WebkitBoxPack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitBoxPackUndefined: Self = StObject.set(x, "WebkitBoxPack", js.undefined)
      
      @scala.inline
      def setWebkitBoxPackVarargs(value: BoxPackProperty*): Self = StObject.set(x, "WebkitBoxPack", js.Array(value :_*))
      
      @scala.inline
      def setWebkitScrollSnapPointsX(value: ScrollSnapPointsXProperty | js.Array[ScrollSnapPointsXProperty]): Self = StObject.set(x, "WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitScrollSnapPointsXUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsX", js.undefined)
      
      @scala.inline
      def setWebkitScrollSnapPointsXVarargs(value: ScrollSnapPointsXProperty*): Self = StObject.set(x, "WebkitScrollSnapPointsX", js.Array(value :_*))
      
      @scala.inline
      def setWebkitScrollSnapPointsY(value: ScrollSnapPointsYProperty | js.Array[ScrollSnapPointsYProperty]): Self = StObject.set(x, "WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebkitScrollSnapPointsYUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsY", js.undefined)
      
      @scala.inline
      def setWebkitScrollSnapPointsYVarargs(value: ScrollSnapPointsYProperty*): Self = StObject.set(x, "WebkitScrollSnapPointsY", js.Array(value :_*))
    }
  }
  
  type FontFace = typings.csstype.mod.FontFace
  
  @js.native
  trait KeyFrames
    extends /* key */ StringDictionary[js.UndefOr[CSSProperties | String]] {
    
    @JSName("$debugName")
    var $debugName: js.UndefOr[String] = js.native
  }
  object KeyFrames {
    
    @scala.inline
    def apply(): KeyFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyFrames]
    }
    
    @scala.inline
    implicit class KeyFramesMutableBuilder[Self <: KeyFrames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$debugName(value: String): Self = StObject.set(x, "$debugName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$debugNameUndefined: Self = StObject.set(x, "$debugName", js.undefined)
    }
  }
  
  @js.native
  trait MediaQuery extends StObject {
    
    var maxHeight: js.UndefOr[Double | String] = js.native
    
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    var minHeight: js.UndefOr[Double | String] = js.native
    
    var minWidth: js.UndefOr[Double | String] = js.native
    
    var orientation: js.UndefOr[landscape | portrait] = js.native
    
    var `type`: js.UndefOr[screen | print | all] = js.native
  }
  object MediaQuery {
    
    @scala.inline
    def apply(): MediaQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQuery]
    }
    
    @scala.inline
    implicit class MediaQueryMutableBuilder[Self <: MediaQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setType(value: screen | print | all): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NestedCSSProperties extends CSSProperties {
    
    /**
      * A debug only (stripped in process.env.NODE_ENV !== 'production') name
      * Helps you figure out where the class is coming from if you care
      **/
    @JSName("$debugName")
    var $debugName: js.UndefOr[String] = js.native
    
    @JSName("$nest")
    var $nest: js.UndefOr[NestedCSSSelectors] = js.native
  }
  object NestedCSSProperties {
    
    @scala.inline
    def apply(): NestedCSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedCSSProperties]
    }
    
    @scala.inline
    implicit class NestedCSSPropertiesMutableBuilder[Self <: NestedCSSProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$debugName(value: String): Self = StObject.set(x, "$debugName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$debugNameUndefined: Self = StObject.set(x, "$debugName", js.undefined)
      
      @scala.inline
      def set$nest(value: NestedCSSSelectors): Self = StObject.set(x, "$nest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$nestUndefined: Self = StObject.set(x, "$nest", js.undefined)
    }
  }
  
  @js.native
  trait NestedCSSSelectors
    extends /**
    * Also cater for any other nested query you want
    */
  /* selector */ StringDictionary[js.UndefOr[NestedCSSProperties]] {
    
    /**
      * Desktop first media query example
      **/
    @JSName("@media screen and (max-width: 700px)")
    var `@media screen and Leftparenthesismax-widthColon 700pxRightparenthesis`: js.UndefOr[NestedCSSProperties] = js.native
    
    /**
      * Mobile first media query example
      **/
    @JSName("@media screen and (min-width: 700px)")
    var `@media screen and Leftparenthesismin-widthColon 700pxRightparenthesis`: js.UndefOr[NestedCSSProperties] = js.native
    
    /**
      * Pseudo-elements
      * https://developer.mozilla.org/en/docs/Web/CSS/Pseudo-elements
      */
    @JSName("&::after")
    var AmpersandColonColonafter: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::backdrop")
    var AmpersandColonColonbackdrop: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::before")
    var AmpersandColonColonbefore: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::first-letter")
    var `AmpersandColonColonfirst-letter`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::first-line")
    var `AmpersandColonColonfirst-line`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::grammar-error")
    var `AmpersandColonColongrammar-error`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::marker")
    var AmpersandColonColonmarker: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::placeholder")
    var AmpersandColonColonplaceholder: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::selection")
    var AmpersandColonColonselection: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&::spelling-error")
    var `AmpersandColonColonspelling-error`: js.UndefOr[NestedCSSProperties] = js.native
    
    /** State selector */
    @JSName("&:active")
    var AmpersandColonactive: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:any")
    var AmpersandColonany: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:checked")
    var AmpersandColonchecked: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:default")
    var AmpersandColondefault: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:disabled")
    var AmpersandColondisabled: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:empty")
    var AmpersandColonempty: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:enabled")
    var AmpersandColonenabled: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:first")
    var AmpersandColonfirst: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:first-child")
    var `AmpersandColonfirst-child`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:first-of-type")
    var `AmpersandColonfirst-of-type`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:focus")
    var AmpersandColonfocus: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:fullscreen")
    var AmpersandColonfullscreen: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:hover")
    var AmpersandColonhover: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:in-range")
    var `AmpersandColonin-range`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:indeterminate")
    var AmpersandColonindeterminate: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:invalid")
    var AmpersandColoninvalid: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:last-child")
    var `AmpersandColonlast-child`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:last-of-type")
    var `AmpersandColonlast-of-type`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:left")
    var AmpersandColonleft: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:link")
    var AmpersandColonlink: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:only-child")
    var `AmpersandColononly-child`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:only-of-type")
    var `AmpersandColononly-of-type`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:optional")
    var AmpersandColonoptional: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:out-of-range")
    var `AmpersandColonout-of-range`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:read-only")
    var `AmpersandColonread-only`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:read-write")
    var `AmpersandColonread-write`: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:required")
    var AmpersandColonrequired: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:right")
    var AmpersandColonright: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:root")
    var AmpersandColonroot: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:scope")
    var AmpersandColonscope: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:target")
    var AmpersandColontarget: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:valid")
    var AmpersandColonvalid: js.UndefOr[NestedCSSProperties] = js.native
    
    @JSName("&:visited")
    var AmpersandColonvisited: js.UndefOr[NestedCSSProperties] = js.native
    
    /** Children */
    @JSName("&>*")
    var AmpersandGreaterthansignAsterisk: js.UndefOr[NestedCSSProperties] = js.native
  }
  object NestedCSSSelectors {
    
    @scala.inline
    def apply(): NestedCSSSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedCSSSelectors]
    }
    
    @scala.inline
    implicit class NestedCSSSelectorsMutableBuilder[Self <: NestedCSSSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@media screen and Leftparenthesismax-widthColon 700pxRightparenthesis`(value: NestedCSSProperties): Self = StObject.set(x, "@media screen and (max-width: 700px)", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@media screen and Leftparenthesismax-widthColon 700pxRightparenthesisUndefined`: Self = StObject.set(x, "@media screen and (max-width: 700px)", js.undefined)
      
      @scala.inline
      def `set@media screen and Leftparenthesismin-widthColon 700pxRightparenthesis`(value: NestedCSSProperties): Self = StObject.set(x, "@media screen and (min-width: 700px)", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@media screen and Leftparenthesismin-widthColon 700pxRightparenthesisUndefined`: Self = StObject.set(x, "@media screen and (min-width: 700px)", js.undefined)
      
      @scala.inline
      def setAmpersandColonColonafter(value: NestedCSSProperties): Self = StObject.set(x, "&::after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonColonafterUndefined: Self = StObject.set(x, "&::after", js.undefined)
      
      @scala.inline
      def setAmpersandColonColonbackdrop(value: NestedCSSProperties): Self = StObject.set(x, "&::backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonColonbackdropUndefined: Self = StObject.set(x, "&::backdrop", js.undefined)
      
      @scala.inline
      def setAmpersandColonColonbefore(value: NestedCSSProperties): Self = StObject.set(x, "&::before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonColonbeforeUndefined: Self = StObject.set(x, "&::before", js.undefined)
      
      @scala.inline
      def `setAmpersandColonColonfirst-letter`(value: NestedCSSProperties): Self = StObject.set(x, "&::first-letter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonColonfirst-letterUndefined`: Self = StObject.set(x, "&::first-letter", js.undefined)
      
      @scala.inline
      def `setAmpersandColonColonfirst-line`(value: NestedCSSProperties): Self = StObject.set(x, "&::first-line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonColonfirst-lineUndefined`: Self = StObject.set(x, "&::first-line", js.undefined)
      
      @scala.inline
      def `setAmpersandColonColongrammar-error`(value: NestedCSSProperties): Self = StObject.set(x, "&::grammar-error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonColongrammar-errorUndefined`: Self = StObject.set(x, "&::grammar-error", js.undefined)
      
      @scala.inline
      def setAmpersandColonColonmarker(value: NestedCSSProperties): Self = StObject.set(x, "&::marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonColonmarkerUndefined: Self = StObject.set(x, "&::marker", js.undefined)
      
      @scala.inline
      def setAmpersandColonColonplaceholder(value: NestedCSSProperties): Self = StObject.set(x, "&::placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonColonplaceholderUndefined: Self = StObject.set(x, "&::placeholder", js.undefined)
      
      @scala.inline
      def setAmpersandColonColonselection(value: NestedCSSProperties): Self = StObject.set(x, "&::selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonColonselectionUndefined: Self = StObject.set(x, "&::selection", js.undefined)
      
      @scala.inline
      def `setAmpersandColonColonspelling-error`(value: NestedCSSProperties): Self = StObject.set(x, "&::spelling-error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonColonspelling-errorUndefined`: Self = StObject.set(x, "&::spelling-error", js.undefined)
      
      @scala.inline
      def setAmpersandColonactive(value: NestedCSSProperties): Self = StObject.set(x, "&:active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonactiveUndefined: Self = StObject.set(x, "&:active", js.undefined)
      
      @scala.inline
      def setAmpersandColonany(value: NestedCSSProperties): Self = StObject.set(x, "&:any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonanyUndefined: Self = StObject.set(x, "&:any", js.undefined)
      
      @scala.inline
      def setAmpersandColonchecked(value: NestedCSSProperties): Self = StObject.set(x, "&:checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColoncheckedUndefined: Self = StObject.set(x, "&:checked", js.undefined)
      
      @scala.inline
      def setAmpersandColondefault(value: NestedCSSProperties): Self = StObject.set(x, "&:default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColondefaultUndefined: Self = StObject.set(x, "&:default", js.undefined)
      
      @scala.inline
      def setAmpersandColondisabled(value: NestedCSSProperties): Self = StObject.set(x, "&:disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColondisabledUndefined: Self = StObject.set(x, "&:disabled", js.undefined)
      
      @scala.inline
      def setAmpersandColonempty(value: NestedCSSProperties): Self = StObject.set(x, "&:empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonemptyUndefined: Self = StObject.set(x, "&:empty", js.undefined)
      
      @scala.inline
      def setAmpersandColonenabled(value: NestedCSSProperties): Self = StObject.set(x, "&:enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonenabledUndefined: Self = StObject.set(x, "&:enabled", js.undefined)
      
      @scala.inline
      def setAmpersandColonfirst(value: NestedCSSProperties): Self = StObject.set(x, "&:first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonfirst-child`(value: NestedCSSProperties): Self = StObject.set(x, "&:first-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonfirst-childUndefined`: Self = StObject.set(x, "&:first-child", js.undefined)
      
      @scala.inline
      def `setAmpersandColonfirst-of-type`(value: NestedCSSProperties): Self = StObject.set(x, "&:first-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonfirst-of-typeUndefined`: Self = StObject.set(x, "&:first-of-type", js.undefined)
      
      @scala.inline
      def setAmpersandColonfirstUndefined: Self = StObject.set(x, "&:first", js.undefined)
      
      @scala.inline
      def setAmpersandColonfocus(value: NestedCSSProperties): Self = StObject.set(x, "&:focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonfocusUndefined: Self = StObject.set(x, "&:focus", js.undefined)
      
      @scala.inline
      def setAmpersandColonfullscreen(value: NestedCSSProperties): Self = StObject.set(x, "&:fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonfullscreenUndefined: Self = StObject.set(x, "&:fullscreen", js.undefined)
      
      @scala.inline
      def setAmpersandColonhover(value: NestedCSSProperties): Self = StObject.set(x, "&:hover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonhoverUndefined: Self = StObject.set(x, "&:hover", js.undefined)
      
      @scala.inline
      def `setAmpersandColonin-range`(value: NestedCSSProperties): Self = StObject.set(x, "&:in-range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonin-rangeUndefined`: Self = StObject.set(x, "&:in-range", js.undefined)
      
      @scala.inline
      def setAmpersandColonindeterminate(value: NestedCSSProperties): Self = StObject.set(x, "&:indeterminate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonindeterminateUndefined: Self = StObject.set(x, "&:indeterminate", js.undefined)
      
      @scala.inline
      def setAmpersandColoninvalid(value: NestedCSSProperties): Self = StObject.set(x, "&:invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColoninvalidUndefined: Self = StObject.set(x, "&:invalid", js.undefined)
      
      @scala.inline
      def `setAmpersandColonlast-child`(value: NestedCSSProperties): Self = StObject.set(x, "&:last-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonlast-childUndefined`: Self = StObject.set(x, "&:last-child", js.undefined)
      
      @scala.inline
      def `setAmpersandColonlast-of-type`(value: NestedCSSProperties): Self = StObject.set(x, "&:last-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonlast-of-typeUndefined`: Self = StObject.set(x, "&:last-of-type", js.undefined)
      
      @scala.inline
      def setAmpersandColonleft(value: NestedCSSProperties): Self = StObject.set(x, "&:left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonleftUndefined: Self = StObject.set(x, "&:left", js.undefined)
      
      @scala.inline
      def setAmpersandColonlink(value: NestedCSSProperties): Self = StObject.set(x, "&:link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonlinkUndefined: Self = StObject.set(x, "&:link", js.undefined)
      
      @scala.inline
      def `setAmpersandColononly-child`(value: NestedCSSProperties): Self = StObject.set(x, "&:only-child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColononly-childUndefined`: Self = StObject.set(x, "&:only-child", js.undefined)
      
      @scala.inline
      def `setAmpersandColononly-of-type`(value: NestedCSSProperties): Self = StObject.set(x, "&:only-of-type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColononly-of-typeUndefined`: Self = StObject.set(x, "&:only-of-type", js.undefined)
      
      @scala.inline
      def setAmpersandColonoptional(value: NestedCSSProperties): Self = StObject.set(x, "&:optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonoptionalUndefined: Self = StObject.set(x, "&:optional", js.undefined)
      
      @scala.inline
      def `setAmpersandColonout-of-range`(value: NestedCSSProperties): Self = StObject.set(x, "&:out-of-range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonout-of-rangeUndefined`: Self = StObject.set(x, "&:out-of-range", js.undefined)
      
      @scala.inline
      def `setAmpersandColonread-only`(value: NestedCSSProperties): Self = StObject.set(x, "&:read-only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonread-onlyUndefined`: Self = StObject.set(x, "&:read-only", js.undefined)
      
      @scala.inline
      def `setAmpersandColonread-write`(value: NestedCSSProperties): Self = StObject.set(x, "&:read-write", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAmpersandColonread-writeUndefined`: Self = StObject.set(x, "&:read-write", js.undefined)
      
      @scala.inline
      def setAmpersandColonrequired(value: NestedCSSProperties): Self = StObject.set(x, "&:required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonrequiredUndefined: Self = StObject.set(x, "&:required", js.undefined)
      
      @scala.inline
      def setAmpersandColonright(value: NestedCSSProperties): Self = StObject.set(x, "&:right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonrightUndefined: Self = StObject.set(x, "&:right", js.undefined)
      
      @scala.inline
      def setAmpersandColonroot(value: NestedCSSProperties): Self = StObject.set(x, "&:root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonrootUndefined: Self = StObject.set(x, "&:root", js.undefined)
      
      @scala.inline
      def setAmpersandColonscope(value: NestedCSSProperties): Self = StObject.set(x, "&:scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonscopeUndefined: Self = StObject.set(x, "&:scope", js.undefined)
      
      @scala.inline
      def setAmpersandColontarget(value: NestedCSSProperties): Self = StObject.set(x, "&:target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColontargetUndefined: Self = StObject.set(x, "&:target", js.undefined)
      
      @scala.inline
      def setAmpersandColonvalid(value: NestedCSSProperties): Self = StObject.set(x, "&:valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonvalidUndefined: Self = StObject.set(x, "&:valid", js.undefined)
      
      @scala.inline
      def setAmpersandColonvisited(value: NestedCSSProperties): Self = StObject.set(x, "&:visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandColonvisitedUndefined: Self = StObject.set(x, "&:visited", js.undefined)
      
      @scala.inline
      def setAmpersandGreaterthansignAsterisk(value: NestedCSSProperties): Self = StObject.set(x, "&>*", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmpersandGreaterthansignAsteriskUndefined: Self = StObject.set(x, "&>*", js.undefined)
    }
  }
  
  type TLength = Double | String
}
