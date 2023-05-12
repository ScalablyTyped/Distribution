package typings.typestyle

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Property.AlignmentBaseline
import typings.csstype.mod.Property.Animation
import typings.csstype.mod.Property.AnimationDelay
import typings.csstype.mod.Property.AnimationDirection
import typings.csstype.mod.Property.AnimationDuration
import typings.csstype.mod.Property.AnimationFillMode
import typings.csstype.mod.Property.AnimationIterationCount
import typings.csstype.mod.Property.AnimationName
import typings.csstype.mod.Property.AnimationPlayState
import typings.csstype.mod.Property.AnimationTimingFunction
import typings.csstype.mod.Property.Azimuth
import typings.csstype.mod.Property.BackgroundClip
import typings.csstype.mod.Property.BackgroundOrigin
import typings.csstype.mod.Property.BackgroundSize
import typings.csstype.mod.Property.BaselineShift
import typings.csstype.mod.Property.BorderBottomLeftRadius
import typings.csstype.mod.Property.BorderBottomRightRadius
import typings.csstype.mod.Property.BorderImage
import typings.csstype.mod.Property.BorderRadius
import typings.csstype.mod.Property.BorderTopLeftRadius
import typings.csstype.mod.Property.BorderTopRightRadius
import typings.csstype.mod.Property.BoxAlign
import typings.csstype.mod.Property.BoxDecorationBreak
import typings.csstype.mod.Property.BoxDirection
import typings.csstype.mod.Property.BoxFlex
import typings.csstype.mod.Property.BoxFlexGroup
import typings.csstype.mod.Property.BoxLines
import typings.csstype.mod.Property.BoxOrdinalGroup
import typings.csstype.mod.Property.BoxOrient
import typings.csstype.mod.Property.BoxPack
import typings.csstype.mod.Property.BoxShadow
import typings.csstype.mod.Property.Clip
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
import typings.csstype.mod.Property.GridColumnGap
import typings.csstype.mod.Property.GridGap
import typings.csstype.mod.Property.GridRowGap
import typings.csstype.mod.Property.ImeMode
import typings.csstype.mod.Property.InsetBlock
import typings.csstype.mod.Property.InsetBlockEnd
import typings.csstype.mod.Property.InsetBlockStart
import typings.csstype.mod.Property.InsetInline
import typings.csstype.mod.Property.InsetInlineEnd
import typings.csstype.mod.Property.InsetInlineStart
import typings.csstype.mod.Property.LightingColor
import typings.csstype.mod.Property.LineBreak
import typings.csstype.mod.Property.Marker
import typings.csstype.mod.Property.MarkerEnd
import typings.csstype.mod.Property.MarkerMid
import typings.csstype.mod.Property.MarkerStart
import typings.csstype.mod.Property.MozFloatEdge
import typings.csstype.mod.Property.MozForceBrokenImageIcon
import typings.csstype.mod.Property.MozOutlineRadius
import typings.csstype.mod.Property.MozOutlineRadiusBottomleft
import typings.csstype.mod.Property.MozOutlineRadiusBottomright
import typings.csstype.mod.Property.MozOutlineRadiusTopleft
import typings.csstype.mod.Property.MozOutlineRadiusTopright
import typings.csstype.mod.Property.MozUserInput
import typings.csstype.mod.Property.ObjectFit
import typings.csstype.mod.Property.ObjectPosition
import typings.csstype.mod.Property.Opacity
import typings.csstype.mod.Property.Outline
import typings.csstype.mod.Property.OutlineColor
import typings.csstype.mod.Property.OutlineStyle
import typings.csstype.mod.Property.OutlineWidth
import typings.csstype.mod.Property.ScrollSnapCoordinate
import typings.csstype.mod.Property.ScrollSnapDestination
import typings.csstype.mod.Property.ScrollSnapPointsX
import typings.csstype.mod.Property.ScrollSnapPointsY
import typings.csstype.mod.Property.ScrollSnapTypeX
import typings.csstype.mod.Property.ScrollSnapTypeY
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
import typings.csstype.mod.Property.TabSize
import typings.csstype.mod.Property.TextAlignLast
import typings.csstype.mod.Property.TextAnchor
import typings.csstype.mod.Property.TextDecorationColor
import typings.csstype.mod.Property.TextDecorationLine
import typings.csstype.mod.Property.TextDecorationStyle
import typings.csstype.mod.Property.TextOverflow
import typings.csstype.mod.Property.Transform
import typings.csstype.mod.Property.TransformOrigin
import typings.csstype.mod.Property.Transition
import typings.csstype.mod.Property.TransitionDelay
import typings.csstype.mod.Property.TransitionDuration
import typings.csstype.mod.Property.TransitionProperty
import typings.csstype.mod.Property.TransitionTimingFunction
import typings.csstype.mod.Property.UserSelect
import typings.csstype.mod.Property.VectorEffect
import typings.csstype.mod.StandardPropertiesFallback
import typings.csstype.mod.VendorPropertiesHyphenFallback
import typings.std.NonNullable
import typings.std.Record
import typings.typestyle.typestyleInts.`0`
import typings.typestyle.typestyleStrings.all
import typings.typestyle.typestyleStrings.dark
import typings.typestyle.typestyleStrings.landscape
import typings.typestyle.typestyleStrings.light
import typings.typestyle.typestyleStrings.portrait
import typings.typestyle.typestyleStrings.print
import typings.typestyle.typestyleStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type CSSClassNames[K /* <: String */] = Record[K, String]
  
  type CSSClasses[K /* <: String */] = Record[K, NestedCSSProperties]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.csstype.mod.ObsoletePropertiesFallback because var conflicts: clip. Inlined msImeMode, MozOutlineStyle, KhtmlBoxLines, MozBackgroundInlinePolicy, MozForceBrokenImageIcon, MozOutlineRadiusBottomleft, WebkitScrollSnapPointsX, MozOutline, MozTextDecorationLine, MozBoxFlex, MozUserInput, WebkitBoxOrdinalGroup, OAnimationDuration, KhtmlBoxOrient, boxLines, WebkitBoxFlexGroup, MozFloatEdge, WebkitBoxDirection, MozOutlineRadiusTopright, MozBoxDirection, offsetInlineStart, scrollSnapCoordinate, KhtmlBoxAlign, imeMode, MozBackgroundSize, MozOutlineRadius, gridGap, OObjectPosition, MozBoxAlign, scrollSnapTypeY, offsetInline, offsetBlock, WebkitBoxLines, gridRowGap, MozBoxOrient, boxOrient, KhtmlLineBreak, OAnimationDelay, OTransform, OTextOverflow, MozBoxPack, WebkitBoxAlign, scrollSnapDestination, OTransitionDuration, MozTextDecorationColor, OTabSize, offsetBlockStart, MozBorderRadiusTopright, MozBorderRadiusBottomleft, MozOpacity, boxOrdinalGroup, WebkitBoxOrient, OAnimation, OBackgroundSize, OAnimationFillMode, offsetBlockEnd, scrollSnapPointsY, WebkitBoxFlex, MozBoxShadow, KhtmlUserSelect, OObjectFit, gridColumnGap, scrollSnapTypeX, MozTextAlignLast, MozTextDecorationStyle, OTransitionTimingFunction, OTransformOrigin, boxPack, MozBorderRadius, KhtmlBoxOrdinalGroup, OBorderImage, azimuth, MozBorderRadiusTopleft, OAnimationName, MozOutlineWidth, MozBorderRadiusBottomright, MozOutlineColor, OTransition, OTransitionProperty, KhtmlBoxFlex, KhtmlBoxDirection, MozBoxOrdinalGroup, boxAlign, KhtmlBoxFlexGroup, MozBackgroundOrigin, MozOutlineRadiusTopleft, MozOutlineRadiusBottomright, boxFlex, WebkitBoxPack, boxFlexGroup, OAnimationDirection, OTransitionDelay, MozBackgroundClip, OAnimationPlayState, boxDirection, OAnimationTimingFunction, KhtmlBoxPack, scrollSnapPointsX, KhtmlOpacity, offsetInlineEnd, WebkitScrollSnapPointsY, OAnimationIterationCount
  - typings.csstype.mod.SvgPropertiesFallback because var conflicts: clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined textAnchor, shapeRendering, markerStart, strokeLinecap, strokeDashoffset, lightingColor, fillOpacity, colorRendering, floodColor, strokeWidth, strokeOpacity, strokeLinejoin, stroke, markerEnd, stopColor, clip, dominantBaseline, baselineShift, stopOpacity, fillRule, clipRule, colorInterpolation, marker, fill, glyphOrientationVertical, alignmentBaseline, vectorEffect, strokeDasharray, markerMid, strokeMiterlimit, floodOpacity */ trait CSSProperties
    extends StObject
       with StandardPropertiesFallback[TLength, String]
       with VendorPropertiesHyphenFallback[TLength, String] {
    
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
    
    var KhtmlBoxAlign: js.UndefOr[BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]] = js.undefined
    
    var KhtmlBoxDirection: js.UndefOr[BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]] = js.undefined
    
    var KhtmlBoxFlex: js.UndefOr[BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]] = js.undefined
    
    var KhtmlBoxFlexGroup: js.UndefOr[BoxFlexGroup | js.Array[NonNullable[js.UndefOr[BoxFlexGroup]]]] = js.undefined
    
    var KhtmlBoxLines: js.UndefOr[BoxLines | js.Array[NonNullable[js.UndefOr[BoxLines]]]] = js.undefined
    
    var KhtmlBoxOrdinalGroup: js.UndefOr[BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]] = js.undefined
    
    var KhtmlBoxOrient: js.UndefOr[BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]] = js.undefined
    
    var KhtmlBoxPack: js.UndefOr[BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]] = js.undefined
    
    var KhtmlLineBreak: js.UndefOr[LineBreak | js.Array[NonNullable[js.UndefOr[LineBreak]]]] = js.undefined
    
    var KhtmlOpacity: js.UndefOr[Opacity | js.Array[NonNullable[js.UndefOr[Opacity]]]] = js.undefined
    
    var KhtmlUserSelect: js.UndefOr[UserSelect | js.Array[NonNullable[js.UndefOr[UserSelect]]]] = js.undefined
    
    var MozBackgroundClip: js.UndefOr[BackgroundClip | js.Array[NonNullable[js.UndefOr[BackgroundClip]]]] = js.undefined
    
    var MozBackgroundInlinePolicy: js.UndefOr[BoxDecorationBreak | js.Array[NonNullable[js.UndefOr[BoxDecorationBreak]]]] = js.undefined
    
    var MozBackgroundOrigin: js.UndefOr[BackgroundOrigin | js.Array[NonNullable[js.UndefOr[BackgroundOrigin]]]] = js.undefined
    
    var MozBackgroundSize: js.UndefOr[
        BackgroundSize[TLength] | js.Array[NonNullable[js.UndefOr[BackgroundSize[TLength]]]]
      ] = js.undefined
    
    var MozBorderRadius: js.UndefOr[BorderRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderRadius[TLength]]]]] = js.undefined
    
    var MozBorderRadiusBottomleft: js.UndefOr[
        BorderBottomLeftRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderBottomLeftRadius[TLength]]]]
      ] = js.undefined
    
    var MozBorderRadiusBottomright: js.UndefOr[
        BorderBottomRightRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderBottomRightRadius[TLength]]]]
      ] = js.undefined
    
    var MozBorderRadiusTopleft: js.UndefOr[
        BorderTopLeftRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderTopLeftRadius[TLength]]]]
      ] = js.undefined
    
    var MozBorderRadiusTopright: js.UndefOr[
        BorderTopRightRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderTopRightRadius[TLength]]]]
      ] = js.undefined
    
    var MozBoxAlign: js.UndefOr[BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]] = js.undefined
    
    var MozBoxDirection: js.UndefOr[BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]] = js.undefined
    
    var MozBoxFlex: js.UndefOr[BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]] = js.undefined
    
    var MozBoxOrdinalGroup: js.UndefOr[BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]] = js.undefined
    
    var MozBoxOrient: js.UndefOr[BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]] = js.undefined
    
    var MozBoxPack: js.UndefOr[BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]] = js.undefined
    
    var MozBoxShadow: js.UndefOr[BoxShadow | js.Array[NonNullable[js.UndefOr[BoxShadow]]]] = js.undefined
    
    var MozFloatEdge: js.UndefOr[
        typings.csstype.mod.Property.MozFloatEdge | js.Array[NonNullable[js.UndefOr[typings.csstype.mod.Property.MozFloatEdge]]]
      ] = js.undefined
    
    var MozForceBrokenImageIcon: js.UndefOr[
        typings.csstype.mod.Property.MozForceBrokenImageIcon | js.Array[NonNullable[js.UndefOr[typings.csstype.mod.Property.MozForceBrokenImageIcon]]]
      ] = js.undefined
    
    var MozOpacity: js.UndefOr[Opacity | js.Array[NonNullable[js.UndefOr[Opacity]]]] = js.undefined
    
    var MozOutline: js.UndefOr[Outline[TLength] | js.Array[NonNullable[js.UndefOr[Outline[TLength]]]]] = js.undefined
    
    var MozOutlineColor: js.UndefOr[OutlineColor | js.Array[NonNullable[js.UndefOr[OutlineColor]]]] = js.undefined
    
    var MozOutlineRadius: js.UndefOr[
        typings.csstype.mod.Property.MozOutlineRadius[TLength] | js.Array[NonNullable[js.UndefOr[typings.csstype.mod.Property.MozOutlineRadius[TLength]]]]
      ] = js.undefined
    
    var MozOutlineRadiusBottomleft: js.UndefOr[
        typings.csstype.mod.Property.MozOutlineRadiusBottomleft[TLength] | (js.Array[
          NonNullable[js.UndefOr[typings.csstype.mod.Property.MozOutlineRadiusBottomleft[TLength]]]
        ])
      ] = js.undefined
    
    var MozOutlineRadiusBottomright: js.UndefOr[
        typings.csstype.mod.Property.MozOutlineRadiusBottomright[TLength] | (js.Array[
          NonNullable[js.UndefOr[typings.csstype.mod.Property.MozOutlineRadiusBottomright[TLength]]]
        ])
      ] = js.undefined
    
    var MozOutlineRadiusTopleft: js.UndefOr[
        typings.csstype.mod.Property.MozOutlineRadiusTopleft[TLength] | (js.Array[
          NonNullable[js.UndefOr[typings.csstype.mod.Property.MozOutlineRadiusTopleft[TLength]]]
        ])
      ] = js.undefined
    
    var MozOutlineRadiusTopright: js.UndefOr[
        typings.csstype.mod.Property.MozOutlineRadiusTopright[TLength] | (js.Array[
          NonNullable[js.UndefOr[typings.csstype.mod.Property.MozOutlineRadiusTopright[TLength]]]
        ])
      ] = js.undefined
    
    var MozOutlineStyle: js.UndefOr[OutlineStyle | js.Array[NonNullable[js.UndefOr[OutlineStyle]]]] = js.undefined
    
    var MozOutlineWidth: js.UndefOr[OutlineWidth[TLength] | js.Array[NonNullable[js.UndefOr[OutlineWidth[TLength]]]]] = js.undefined
    
    var MozTextAlignLast: js.UndefOr[TextAlignLast | js.Array[NonNullable[js.UndefOr[TextAlignLast]]]] = js.undefined
    
    var MozTextDecorationColor: js.UndefOr[TextDecorationColor | js.Array[NonNullable[js.UndefOr[TextDecorationColor]]]] = js.undefined
    
    var MozTextDecorationLine: js.UndefOr[TextDecorationLine | js.Array[NonNullable[js.UndefOr[TextDecorationLine]]]] = js.undefined
    
    var MozTextDecorationStyle: js.UndefOr[TextDecorationStyle | js.Array[NonNullable[js.UndefOr[TextDecorationStyle]]]] = js.undefined
    
    var MozUserInput: js.UndefOr[
        typings.csstype.mod.Property.MozUserInput | js.Array[NonNullable[js.UndefOr[typings.csstype.mod.Property.MozUserInput]]]
      ] = js.undefined
    
    var OAnimation: js.UndefOr[Animation[String] | js.Array[NonNullable[js.UndefOr[Animation[String]]]]] = js.undefined
    
    var OAnimationDelay: js.UndefOr[
        AnimationDelay[String] | js.Array[NonNullable[js.UndefOr[AnimationDelay[String]]]]
      ] = js.undefined
    
    var OAnimationDirection: js.UndefOr[AnimationDirection | js.Array[NonNullable[js.UndefOr[AnimationDirection]]]] = js.undefined
    
    var OAnimationDuration: js.UndefOr[
        AnimationDuration[String] | js.Array[NonNullable[js.UndefOr[AnimationDuration[String]]]]
      ] = js.undefined
    
    var OAnimationFillMode: js.UndefOr[AnimationFillMode | js.Array[NonNullable[js.UndefOr[AnimationFillMode]]]] = js.undefined
    
    var OAnimationIterationCount: js.UndefOr[
        AnimationIterationCount | js.Array[NonNullable[js.UndefOr[AnimationIterationCount]]]
      ] = js.undefined
    
    var OAnimationName: js.UndefOr[AnimationName | js.Array[NonNullable[js.UndefOr[AnimationName]]]] = js.undefined
    
    var OAnimationPlayState: js.UndefOr[AnimationPlayState | js.Array[NonNullable[js.UndefOr[AnimationPlayState]]]] = js.undefined
    
    var OAnimationTimingFunction: js.UndefOr[
        AnimationTimingFunction | js.Array[NonNullable[js.UndefOr[AnimationTimingFunction]]]
      ] = js.undefined
    
    var OBackgroundSize: js.UndefOr[
        BackgroundSize[TLength] | js.Array[NonNullable[js.UndefOr[BackgroundSize[TLength]]]]
      ] = js.undefined
    
    var OBorderImage: js.UndefOr[BorderImage | js.Array[NonNullable[js.UndefOr[BorderImage]]]] = js.undefined
    
    var OObjectFit: js.UndefOr[ObjectFit | js.Array[NonNullable[js.UndefOr[ObjectFit]]]] = js.undefined
    
    var OObjectPosition: js.UndefOr[
        ObjectPosition[TLength] | js.Array[NonNullable[js.UndefOr[ObjectPosition[TLength]]]]
      ] = js.undefined
    
    var OTabSize: js.UndefOr[TabSize[TLength] | js.Array[NonNullable[js.UndefOr[TabSize[TLength]]]]] = js.undefined
    
    var OTextOverflow: js.UndefOr[TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]] = js.undefined
    
    var OTransform: js.UndefOr[Transform | js.Array[NonNullable[js.UndefOr[Transform]]]] = js.undefined
    
    var OTransformOrigin: js.UndefOr[
        TransformOrigin[TLength] | js.Array[NonNullable[js.UndefOr[TransformOrigin[TLength]]]]
      ] = js.undefined
    
    var OTransition: js.UndefOr[Transition[String] | js.Array[NonNullable[js.UndefOr[Transition[String]]]]] = js.undefined
    
    var OTransitionDelay: js.UndefOr[
        TransitionDelay[String] | js.Array[NonNullable[js.UndefOr[TransitionDelay[String]]]]
      ] = js.undefined
    
    var OTransitionDuration: js.UndefOr[
        TransitionDuration[String] | js.Array[NonNullable[js.UndefOr[TransitionDuration[String]]]]
      ] = js.undefined
    
    var OTransitionProperty: js.UndefOr[TransitionProperty | js.Array[NonNullable[js.UndefOr[TransitionProperty]]]] = js.undefined
    
    var OTransitionTimingFunction: js.UndefOr[
        TransitionTimingFunction | js.Array[NonNullable[js.UndefOr[TransitionTimingFunction]]]
      ] = js.undefined
    
    var WebkitBoxAlign: js.UndefOr[BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]] = js.undefined
    
    var WebkitBoxDirection: js.UndefOr[BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]] = js.undefined
    
    var WebkitBoxFlex: js.UndefOr[BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]] = js.undefined
    
    var WebkitBoxFlexGroup: js.UndefOr[BoxFlexGroup | js.Array[NonNullable[js.UndefOr[BoxFlexGroup]]]] = js.undefined
    
    var WebkitBoxLines: js.UndefOr[BoxLines | js.Array[NonNullable[js.UndefOr[BoxLines]]]] = js.undefined
    
    var WebkitBoxOrdinalGroup: js.UndefOr[BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]] = js.undefined
    
    var WebkitBoxOrient: js.UndefOr[BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]] = js.undefined
    
    var WebkitBoxPack: js.UndefOr[BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]] = js.undefined
    
    var WebkitScrollSnapPointsX: js.UndefOr[ScrollSnapPointsX | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsX]]]] = js.undefined
    
    var WebkitScrollSnapPointsY: js.UndefOr[ScrollSnapPointsY | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsY]]]] = js.undefined
    
    var alignmentBaseline: js.UndefOr[AlignmentBaseline | js.Array[NonNullable[js.UndefOr[AlignmentBaseline]]]] = js.undefined
    
    var azimuth: js.UndefOr[Azimuth | js.Array[NonNullable[js.UndefOr[Azimuth]]]] = js.undefined
    
    var baselineShift: js.UndefOr[
        BaselineShift[TLength] | js.Array[NonNullable[js.UndefOr[BaselineShift[TLength]]]]
      ] = js.undefined
    
    var boxAlign: js.UndefOr[BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]] = js.undefined
    
    var boxDirection: js.UndefOr[BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]] = js.undefined
    
    var boxFlex: js.UndefOr[BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]] = js.undefined
    
    var boxFlexGroup: js.UndefOr[BoxFlexGroup | js.Array[NonNullable[js.UndefOr[BoxFlexGroup]]]] = js.undefined
    
    var boxLines: js.UndefOr[BoxLines | js.Array[NonNullable[js.UndefOr[BoxLines]]]] = js.undefined
    
    var boxOrdinalGroup: js.UndefOr[BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]] = js.undefined
    
    var boxOrient: js.UndefOr[BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]] = js.undefined
    
    var boxPack: js.UndefOr[BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]] = js.undefined
    
    var clip: js.UndefOr[Clip | js.Array[NonNullable[js.UndefOr[Clip]]]] = js.undefined
    
    var clipRule: js.UndefOr[ClipRule | js.Array[NonNullable[js.UndefOr[ClipRule]]]] = js.undefined
    
    var colorInterpolation: js.UndefOr[ColorInterpolation | js.Array[NonNullable[js.UndefOr[ColorInterpolation]]]] = js.undefined
    
    var colorRendering: js.UndefOr[ColorRendering | js.Array[NonNullable[js.UndefOr[ColorRendering]]]] = js.undefined
    
    var dominantBaseline: js.UndefOr[DominantBaseline | js.Array[NonNullable[js.UndefOr[DominantBaseline]]]] = js.undefined
    
    var fill: js.UndefOr[Fill | js.Array[NonNullable[js.UndefOr[Fill]]]] = js.undefined
    
    var fillOpacity: js.UndefOr[FillOpacity | js.Array[NonNullable[js.UndefOr[FillOpacity]]]] = js.undefined
    
    var fillRule: js.UndefOr[FillRule | js.Array[NonNullable[js.UndefOr[FillRule]]]] = js.undefined
    
    var floodColor: js.UndefOr[FloodColor | js.Array[NonNullable[js.UndefOr[FloodColor]]]] = js.undefined
    
    var floodOpacity: js.UndefOr[FloodOpacity | js.Array[NonNullable[js.UndefOr[FloodOpacity]]]] = js.undefined
    
    var glyphOrientationVertical: js.UndefOr[
        GlyphOrientationVertical | js.Array[NonNullable[js.UndefOr[GlyphOrientationVertical]]]
      ] = js.undefined
    
    var gridColumnGap: js.UndefOr[
        GridColumnGap[TLength] | js.Array[NonNullable[js.UndefOr[GridColumnGap[TLength]]]]
      ] = js.undefined
    
    var gridGap: js.UndefOr[GridGap[TLength] | js.Array[NonNullable[js.UndefOr[GridGap[TLength]]]]] = js.undefined
    
    var gridRowGap: js.UndefOr[GridRowGap[TLength] | js.Array[NonNullable[js.UndefOr[GridRowGap[TLength]]]]] = js.undefined
    
    var imeMode: js.UndefOr[ImeMode | js.Array[NonNullable[js.UndefOr[ImeMode]]]] = js.undefined
    
    var lightingColor: js.UndefOr[LightingColor | js.Array[NonNullable[js.UndefOr[LightingColor]]]] = js.undefined
    
    var marker: js.UndefOr[Marker | js.Array[NonNullable[js.UndefOr[Marker]]]] = js.undefined
    
    var markerEnd: js.UndefOr[MarkerEnd | js.Array[NonNullable[js.UndefOr[MarkerEnd]]]] = js.undefined
    
    var markerMid: js.UndefOr[MarkerMid | js.Array[NonNullable[js.UndefOr[MarkerMid]]]] = js.undefined
    
    var markerStart: js.UndefOr[MarkerStart | js.Array[NonNullable[js.UndefOr[MarkerStart]]]] = js.undefined
    
    var msImeMode: js.UndefOr[ImeMode | js.Array[NonNullable[js.UndefOr[ImeMode]]]] = js.undefined
    
    var offsetBlock: js.UndefOr[InsetBlock[TLength] | js.Array[NonNullable[js.UndefOr[InsetBlock[TLength]]]]] = js.undefined
    
    var offsetBlockEnd: js.UndefOr[
        InsetBlockEnd[TLength] | js.Array[NonNullable[js.UndefOr[InsetBlockEnd[TLength]]]]
      ] = js.undefined
    
    var offsetBlockStart: js.UndefOr[
        InsetBlockStart[TLength] | js.Array[NonNullable[js.UndefOr[InsetBlockStart[TLength]]]]
      ] = js.undefined
    
    var offsetInline: js.UndefOr[InsetInline[TLength] | js.Array[NonNullable[js.UndefOr[InsetInline[TLength]]]]] = js.undefined
    
    var offsetInlineEnd: js.UndefOr[
        InsetInlineEnd[TLength] | js.Array[NonNullable[js.UndefOr[InsetInlineEnd[TLength]]]]
      ] = js.undefined
    
    var offsetInlineStart: js.UndefOr[
        InsetInlineStart[TLength] | js.Array[NonNullable[js.UndefOr[InsetInlineStart[TLength]]]]
      ] = js.undefined
    
    var scrollSnapCoordinate: js.UndefOr[
        ScrollSnapCoordinate[TLength] | js.Array[NonNullable[js.UndefOr[ScrollSnapCoordinate[TLength]]]]
      ] = js.undefined
    
    var scrollSnapDestination: js.UndefOr[
        ScrollSnapDestination[TLength] | js.Array[NonNullable[js.UndefOr[ScrollSnapDestination[TLength]]]]
      ] = js.undefined
    
    var scrollSnapPointsX: js.UndefOr[ScrollSnapPointsX | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsX]]]] = js.undefined
    
    var scrollSnapPointsY: js.UndefOr[ScrollSnapPointsY | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsY]]]] = js.undefined
    
    var scrollSnapTypeX: js.UndefOr[ScrollSnapTypeX | js.Array[NonNullable[js.UndefOr[ScrollSnapTypeX]]]] = js.undefined
    
    var scrollSnapTypeY: js.UndefOr[ScrollSnapTypeY | js.Array[NonNullable[js.UndefOr[ScrollSnapTypeY]]]] = js.undefined
    
    var shapeRendering: js.UndefOr[ShapeRendering | js.Array[NonNullable[js.UndefOr[ShapeRendering]]]] = js.undefined
    
    var stopColor: js.UndefOr[StopColor | js.Array[NonNullable[js.UndefOr[StopColor]]]] = js.undefined
    
    var stopOpacity: js.UndefOr[StopOpacity | js.Array[NonNullable[js.UndefOr[StopOpacity]]]] = js.undefined
    
    var stroke: js.UndefOr[Stroke | js.Array[NonNullable[js.UndefOr[Stroke]]]] = js.undefined
    
    var strokeDasharray: js.UndefOr[
        StrokeDasharray[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDasharray[TLength]]]]
      ] = js.undefined
    
    var strokeDashoffset: js.UndefOr[
        StrokeDashoffset[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDashoffset[TLength]]]]
      ] = js.undefined
    
    var strokeLinecap: js.UndefOr[StrokeLinecap | js.Array[NonNullable[js.UndefOr[StrokeLinecap]]]] = js.undefined
    
    var strokeLinejoin: js.UndefOr[StrokeLinejoin | js.Array[NonNullable[js.UndefOr[StrokeLinejoin]]]] = js.undefined
    
    var strokeMiterlimit: js.UndefOr[StrokeMiterlimit | js.Array[NonNullable[js.UndefOr[StrokeMiterlimit]]]] = js.undefined
    
    var strokeOpacity: js.UndefOr[StrokeOpacity | js.Array[NonNullable[js.UndefOr[StrokeOpacity]]]] = js.undefined
    
    var strokeWidth: js.UndefOr[StrokeWidth[TLength] | js.Array[NonNullable[js.UndefOr[StrokeWidth[TLength]]]]] = js.undefined
    
    var textAnchor: js.UndefOr[TextAnchor | js.Array[NonNullable[js.UndefOr[TextAnchor]]]] = js.undefined
    
    var vectorEffect: js.UndefOr[VectorEffect | js.Array[NonNullable[js.UndefOr[VectorEffect]]]] = js.undefined
  }
  object CSSProperties {
    
    inline def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSSProperties] (val x: Self) extends AnyVal {
      
      inline def set$unique(value: Boolean): Self = StObject.set(x, "$unique", value.asInstanceOf[js.Any])
      
      inline def set$uniqueUndefined: Self = StObject.set(x, "$unique", js.undefined)
      
      inline def setAlignmentBaseline(value: AlignmentBaseline | js.Array[NonNullable[js.UndefOr[AlignmentBaseline]]]): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
      
      inline def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
      
      inline def setAlignmentBaselineVarargs(value: NonNullable[js.UndefOr[AlignmentBaseline]]*): Self = StObject.set(x, "alignmentBaseline", js.Array(value*))
      
      inline def setAzimuth(value: Azimuth | js.Array[NonNullable[js.UndefOr[Azimuth]]]): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
      
      inline def setAzimuthVarargs(value: NonNullable[js.UndefOr[Azimuth]]*): Self = StObject.set(x, "azimuth", js.Array(value*))
      
      inline def setBaselineShift(value: BaselineShift[TLength] | js.Array[NonNullable[js.UndefOr[BaselineShift[TLength]]]]): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
      
      inline def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
      
      inline def setBaselineShiftVarargs(value: NonNullable[js.UndefOr[BaselineShift[TLength]]]*): Self = StObject.set(x, "baselineShift", js.Array(value*))
      
      inline def setBoxAlign(value: BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]): Self = StObject.set(x, "boxAlign", value.asInstanceOf[js.Any])
      
      inline def setBoxAlignUndefined: Self = StObject.set(x, "boxAlign", js.undefined)
      
      inline def setBoxAlignVarargs(value: NonNullable[js.UndefOr[BoxAlign]]*): Self = StObject.set(x, "boxAlign", js.Array(value*))
      
      inline def setBoxDirection(value: BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]): Self = StObject.set(x, "boxDirection", value.asInstanceOf[js.Any])
      
      inline def setBoxDirectionUndefined: Self = StObject.set(x, "boxDirection", js.undefined)
      
      inline def setBoxDirectionVarargs(value: NonNullable[js.UndefOr[BoxDirection]]*): Self = StObject.set(x, "boxDirection", js.Array(value*))
      
      inline def setBoxFlex(value: BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]): Self = StObject.set(x, "boxFlex", value.asInstanceOf[js.Any])
      
      inline def setBoxFlexGroup(value: BoxFlexGroup | js.Array[NonNullable[js.UndefOr[BoxFlexGroup]]]): Self = StObject.set(x, "boxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setBoxFlexGroupUndefined: Self = StObject.set(x, "boxFlexGroup", js.undefined)
      
      inline def setBoxFlexGroupVarargs(value: NonNullable[js.UndefOr[BoxFlexGroup]]*): Self = StObject.set(x, "boxFlexGroup", js.Array(value*))
      
      inline def setBoxFlexUndefined: Self = StObject.set(x, "boxFlex", js.undefined)
      
      inline def setBoxFlexVarargs(value: NonNullable[js.UndefOr[BoxFlex]]*): Self = StObject.set(x, "boxFlex", js.Array(value*))
      
      inline def setBoxLines(value: BoxLines | js.Array[NonNullable[js.UndefOr[BoxLines]]]): Self = StObject.set(x, "boxLines", value.asInstanceOf[js.Any])
      
      inline def setBoxLinesUndefined: Self = StObject.set(x, "boxLines", js.undefined)
      
      inline def setBoxLinesVarargs(value: NonNullable[js.UndefOr[BoxLines]]*): Self = StObject.set(x, "boxLines", js.Array(value*))
      
      inline def setBoxOrdinalGroup(value: BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]): Self = StObject.set(x, "boxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setBoxOrdinalGroupUndefined: Self = StObject.set(x, "boxOrdinalGroup", js.undefined)
      
      inline def setBoxOrdinalGroupVarargs(value: NonNullable[js.UndefOr[BoxOrdinalGroup]]*): Self = StObject.set(x, "boxOrdinalGroup", js.Array(value*))
      
      inline def setBoxOrient(value: BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]): Self = StObject.set(x, "boxOrient", value.asInstanceOf[js.Any])
      
      inline def setBoxOrientUndefined: Self = StObject.set(x, "boxOrient", js.undefined)
      
      inline def setBoxOrientVarargs(value: NonNullable[js.UndefOr[BoxOrient]]*): Self = StObject.set(x, "boxOrient", js.Array(value*))
      
      inline def setBoxPack(value: BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]): Self = StObject.set(x, "boxPack", value.asInstanceOf[js.Any])
      
      inline def setBoxPackUndefined: Self = StObject.set(x, "boxPack", js.undefined)
      
      inline def setBoxPackVarargs(value: NonNullable[js.UndefOr[BoxPack]]*): Self = StObject.set(x, "boxPack", js.Array(value*))
      
      inline def setClip(value: Clip | js.Array[NonNullable[js.UndefOr[Clip]]]): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      inline def setClipRule(value: ClipRule | js.Array[NonNullable[js.UndefOr[ClipRule]]]): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setClipRuleVarargs(value: NonNullable[js.UndefOr[ClipRule]]*): Self = StObject.set(x, "clipRule", js.Array(value*))
      
      inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      inline def setClipVarargs(value: NonNullable[js.UndefOr[Clip]]*): Self = StObject.set(x, "clip", js.Array(value*))
      
      inline def setColorInterpolation(value: ColorInterpolation | js.Array[NonNullable[js.UndefOr[ColorInterpolation]]]): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
      
      inline def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
      
      inline def setColorInterpolationVarargs(value: NonNullable[js.UndefOr[ColorInterpolation]]*): Self = StObject.set(x, "colorInterpolation", js.Array(value*))
      
      inline def setColorRendering(value: ColorRendering | js.Array[NonNullable[js.UndefOr[ColorRendering]]]): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
      
      inline def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
      
      inline def setColorRenderingVarargs(value: NonNullable[js.UndefOr[ColorRendering]]*): Self = StObject.set(x, "colorRendering", js.Array(value*))
      
      inline def setDominantBaseline(value: DominantBaseline | js.Array[NonNullable[js.UndefOr[DominantBaseline]]]): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
      
      inline def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
      
      inline def setDominantBaselineVarargs(value: NonNullable[js.UndefOr[DominantBaseline]]*): Self = StObject.set(x, "dominantBaseline", js.Array(value*))
      
      inline def setFill(value: Fill | js.Array[NonNullable[js.UndefOr[Fill]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: FillOpacity | js.Array[NonNullable[js.UndefOr[FillOpacity]]]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillOpacityVarargs(value: NonNullable[js.UndefOr[FillOpacity]]*): Self = StObject.set(x, "fillOpacity", js.Array(value*))
      
      inline def setFillRule(value: FillRule | js.Array[NonNullable[js.UndefOr[FillRule]]]): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
      
      inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
      
      inline def setFillRuleVarargs(value: NonNullable[js.UndefOr[FillRule]]*): Self = StObject.set(x, "fillRule", js.Array(value*))
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFillVarargs(value: NonNullable[js.UndefOr[Fill]]*): Self = StObject.set(x, "fill", js.Array(value*))
      
      inline def setFloodColor(value: FloodColor | js.Array[NonNullable[js.UndefOr[FloodColor]]]): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
      
      inline def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
      
      inline def setFloodColorVarargs(value: NonNullable[js.UndefOr[FloodColor]]*): Self = StObject.set(x, "floodColor", js.Array(value*))
      
      inline def setFloodOpacity(value: FloodOpacity | js.Array[NonNullable[js.UndefOr[FloodOpacity]]]): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
      
      inline def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
      
      inline def setFloodOpacityVarargs(value: NonNullable[js.UndefOr[FloodOpacity]]*): Self = StObject.set(x, "floodOpacity", js.Array(value*))
      
      inline def setGlyphOrientationVertical(value: GlyphOrientationVertical | js.Array[NonNullable[js.UndefOr[GlyphOrientationVertical]]]): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
      
      inline def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
      
      inline def setGlyphOrientationVerticalVarargs(value: NonNullable[js.UndefOr[GlyphOrientationVertical]]*): Self = StObject.set(x, "glyphOrientationVertical", js.Array(value*))
      
      inline def setGridColumnGap(value: GridColumnGap[TLength] | js.Array[NonNullable[js.UndefOr[GridColumnGap[TLength]]]]): Self = StObject.set(x, "gridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setGridColumnGapUndefined: Self = StObject.set(x, "gridColumnGap", js.undefined)
      
      inline def setGridColumnGapVarargs(value: NonNullable[js.UndefOr[GridColumnGap[TLength]]]*): Self = StObject.set(x, "gridColumnGap", js.Array(value*))
      
      inline def setGridGap(value: GridGap[TLength] | js.Array[NonNullable[js.UndefOr[GridGap[TLength]]]]): Self = StObject.set(x, "gridGap", value.asInstanceOf[js.Any])
      
      inline def setGridGapUndefined: Self = StObject.set(x, "gridGap", js.undefined)
      
      inline def setGridGapVarargs(value: NonNullable[js.UndefOr[GridGap[TLength]]]*): Self = StObject.set(x, "gridGap", js.Array(value*))
      
      inline def setGridRowGap(value: GridRowGap[TLength] | js.Array[NonNullable[js.UndefOr[GridRowGap[TLength]]]]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
      
      inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
      
      inline def setGridRowGapVarargs(value: NonNullable[js.UndefOr[GridRowGap[TLength]]]*): Self = StObject.set(x, "gridRowGap", js.Array(value*))
      
      inline def setImeMode(value: ImeMode | js.Array[NonNullable[js.UndefOr[ImeMode]]]): Self = StObject.set(x, "imeMode", value.asInstanceOf[js.Any])
      
      inline def setImeModeUndefined: Self = StObject.set(x, "imeMode", js.undefined)
      
      inline def setImeModeVarargs(value: NonNullable[js.UndefOr[ImeMode]]*): Self = StObject.set(x, "imeMode", js.Array(value*))
      
      inline def setKhtmlBoxAlign(value: BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]): Self = StObject.set(x, "KhtmlBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxAlignUndefined: Self = StObject.set(x, "KhtmlBoxAlign", js.undefined)
      
      inline def setKhtmlBoxAlignVarargs(value: NonNullable[js.UndefOr[BoxAlign]]*): Self = StObject.set(x, "KhtmlBoxAlign", js.Array(value*))
      
      inline def setKhtmlBoxDirection(value: BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]): Self = StObject.set(x, "KhtmlBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxDirectionUndefined: Self = StObject.set(x, "KhtmlBoxDirection", js.undefined)
      
      inline def setKhtmlBoxDirectionVarargs(value: NonNullable[js.UndefOr[BoxDirection]]*): Self = StObject.set(x, "KhtmlBoxDirection", js.Array(value*))
      
      inline def setKhtmlBoxFlex(value: BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]): Self = StObject.set(x, "KhtmlBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxFlexGroup(value: BoxFlexGroup | js.Array[NonNullable[js.UndefOr[BoxFlexGroup]]]): Self = StObject.set(x, "KhtmlBoxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxFlexGroupUndefined: Self = StObject.set(x, "KhtmlBoxFlexGroup", js.undefined)
      
      inline def setKhtmlBoxFlexGroupVarargs(value: NonNullable[js.UndefOr[BoxFlexGroup]]*): Self = StObject.set(x, "KhtmlBoxFlexGroup", js.Array(value*))
      
      inline def setKhtmlBoxFlexUndefined: Self = StObject.set(x, "KhtmlBoxFlex", js.undefined)
      
      inline def setKhtmlBoxFlexVarargs(value: NonNullable[js.UndefOr[BoxFlex]]*): Self = StObject.set(x, "KhtmlBoxFlex", js.Array(value*))
      
      inline def setKhtmlBoxLines(value: BoxLines | js.Array[NonNullable[js.UndefOr[BoxLines]]]): Self = StObject.set(x, "KhtmlBoxLines", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxLinesUndefined: Self = StObject.set(x, "KhtmlBoxLines", js.undefined)
      
      inline def setKhtmlBoxLinesVarargs(value: NonNullable[js.UndefOr[BoxLines]]*): Self = StObject.set(x, "KhtmlBoxLines", js.Array(value*))
      
      inline def setKhtmlBoxOrdinalGroup(value: BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxOrdinalGroupUndefined: Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.undefined)
      
      inline def setKhtmlBoxOrdinalGroupVarargs(value: NonNullable[js.UndefOr[BoxOrdinalGroup]]*): Self = StObject.set(x, "KhtmlBoxOrdinalGroup", js.Array(value*))
      
      inline def setKhtmlBoxOrient(value: BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]): Self = StObject.set(x, "KhtmlBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxOrientUndefined: Self = StObject.set(x, "KhtmlBoxOrient", js.undefined)
      
      inline def setKhtmlBoxOrientVarargs(value: NonNullable[js.UndefOr[BoxOrient]]*): Self = StObject.set(x, "KhtmlBoxOrient", js.Array(value*))
      
      inline def setKhtmlBoxPack(value: BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]): Self = StObject.set(x, "KhtmlBoxPack", value.asInstanceOf[js.Any])
      
      inline def setKhtmlBoxPackUndefined: Self = StObject.set(x, "KhtmlBoxPack", js.undefined)
      
      inline def setKhtmlBoxPackVarargs(value: NonNullable[js.UndefOr[BoxPack]]*): Self = StObject.set(x, "KhtmlBoxPack", js.Array(value*))
      
      inline def setKhtmlLineBreak(value: LineBreak | js.Array[NonNullable[js.UndefOr[LineBreak]]]): Self = StObject.set(x, "KhtmlLineBreak", value.asInstanceOf[js.Any])
      
      inline def setKhtmlLineBreakUndefined: Self = StObject.set(x, "KhtmlLineBreak", js.undefined)
      
      inline def setKhtmlLineBreakVarargs(value: NonNullable[js.UndefOr[LineBreak]]*): Self = StObject.set(x, "KhtmlLineBreak", js.Array(value*))
      
      inline def setKhtmlOpacity(value: Opacity | js.Array[NonNullable[js.UndefOr[Opacity]]]): Self = StObject.set(x, "KhtmlOpacity", value.asInstanceOf[js.Any])
      
      inline def setKhtmlOpacityUndefined: Self = StObject.set(x, "KhtmlOpacity", js.undefined)
      
      inline def setKhtmlOpacityVarargs(value: NonNullable[js.UndefOr[Opacity]]*): Self = StObject.set(x, "KhtmlOpacity", js.Array(value*))
      
      inline def setKhtmlUserSelect(value: UserSelect | js.Array[NonNullable[js.UndefOr[UserSelect]]]): Self = StObject.set(x, "KhtmlUserSelect", value.asInstanceOf[js.Any])
      
      inline def setKhtmlUserSelectUndefined: Self = StObject.set(x, "KhtmlUserSelect", js.undefined)
      
      inline def setKhtmlUserSelectVarargs(value: NonNullable[js.UndefOr[UserSelect]]*): Self = StObject.set(x, "KhtmlUserSelect", js.Array(value*))
      
      inline def setLightingColor(value: LightingColor | js.Array[NonNullable[js.UndefOr[LightingColor]]]): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
      
      inline def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
      
      inline def setLightingColorVarargs(value: NonNullable[js.UndefOr[LightingColor]]*): Self = StObject.set(x, "lightingColor", js.Array(value*))
      
      inline def setMarker(value: Marker | js.Array[NonNullable[js.UndefOr[Marker]]]): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerEnd(value: MarkerEnd | js.Array[NonNullable[js.UndefOr[MarkerEnd]]]): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerEndVarargs(value: NonNullable[js.UndefOr[MarkerEnd]]*): Self = StObject.set(x, "markerEnd", js.Array(value*))
      
      inline def setMarkerMid(value: MarkerMid | js.Array[NonNullable[js.UndefOr[MarkerMid]]]): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerMidVarargs(value: NonNullable[js.UndefOr[MarkerMid]]*): Self = StObject.set(x, "markerMid", js.Array(value*))
      
      inline def setMarkerStart(value: MarkerStart | js.Array[NonNullable[js.UndefOr[MarkerStart]]]): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMarkerStartVarargs(value: NonNullable[js.UndefOr[MarkerStart]]*): Self = StObject.set(x, "markerStart", js.Array(value*))
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setMarkerVarargs(value: NonNullable[js.UndefOr[Marker]]*): Self = StObject.set(x, "marker", js.Array(value*))
      
      inline def setMozBackgroundClip(value: BackgroundClip | js.Array[NonNullable[js.UndefOr[BackgroundClip]]]): Self = StObject.set(x, "MozBackgroundClip", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundClipUndefined: Self = StObject.set(x, "MozBackgroundClip", js.undefined)
      
      inline def setMozBackgroundClipVarargs(value: NonNullable[js.UndefOr[BackgroundClip]]*): Self = StObject.set(x, "MozBackgroundClip", js.Array(value*))
      
      inline def setMozBackgroundInlinePolicy(value: BoxDecorationBreak | js.Array[NonNullable[js.UndefOr[BoxDecorationBreak]]]): Self = StObject.set(x, "MozBackgroundInlinePolicy", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundInlinePolicyUndefined: Self = StObject.set(x, "MozBackgroundInlinePolicy", js.undefined)
      
      inline def setMozBackgroundInlinePolicyVarargs(value: NonNullable[js.UndefOr[BoxDecorationBreak]]*): Self = StObject.set(x, "MozBackgroundInlinePolicy", js.Array(value*))
      
      inline def setMozBackgroundOrigin(value: BackgroundOrigin | js.Array[NonNullable[js.UndefOr[BackgroundOrigin]]]): Self = StObject.set(x, "MozBackgroundOrigin", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundOriginUndefined: Self = StObject.set(x, "MozBackgroundOrigin", js.undefined)
      
      inline def setMozBackgroundOriginVarargs(value: NonNullable[js.UndefOr[BackgroundOrigin]]*): Self = StObject.set(x, "MozBackgroundOrigin", js.Array(value*))
      
      inline def setMozBackgroundSize(value: BackgroundSize[TLength] | js.Array[NonNullable[js.UndefOr[BackgroundSize[TLength]]]]): Self = StObject.set(x, "MozBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setMozBackgroundSizeUndefined: Self = StObject.set(x, "MozBackgroundSize", js.undefined)
      
      inline def setMozBackgroundSizeVarargs(value: NonNullable[js.UndefOr[BackgroundSize[TLength]]]*): Self = StObject.set(x, "MozBackgroundSize", js.Array(value*))
      
      inline def setMozBorderRadius(value: BorderRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderRadius[TLength]]]]): Self = StObject.set(x, "MozBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomleft(
        value: BorderBottomLeftRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderBottomLeftRadius[TLength]]]]
      ): Self = StObject.set(x, "MozBorderRadiusBottomleft", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomleftUndefined: Self = StObject.set(x, "MozBorderRadiusBottomleft", js.undefined)
      
      inline def setMozBorderRadiusBottomleftVarargs(value: NonNullable[js.UndefOr[BorderBottomLeftRadius[TLength]]]*): Self = StObject.set(x, "MozBorderRadiusBottomleft", js.Array(value*))
      
      inline def setMozBorderRadiusBottomright(
        value: BorderBottomRightRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderBottomRightRadius[TLength]]]]
      ): Self = StObject.set(x, "MozBorderRadiusBottomright", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusBottomrightUndefined: Self = StObject.set(x, "MozBorderRadiusBottomright", js.undefined)
      
      inline def setMozBorderRadiusBottomrightVarargs(value: NonNullable[js.UndefOr[BorderBottomRightRadius[TLength]]]*): Self = StObject.set(x, "MozBorderRadiusBottomright", js.Array(value*))
      
      inline def setMozBorderRadiusTopleft(
        value: BorderTopLeftRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderTopLeftRadius[TLength]]]]
      ): Self = StObject.set(x, "MozBorderRadiusTopleft", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusTopleftUndefined: Self = StObject.set(x, "MozBorderRadiusTopleft", js.undefined)
      
      inline def setMozBorderRadiusTopleftVarargs(value: NonNullable[js.UndefOr[BorderTopLeftRadius[TLength]]]*): Self = StObject.set(x, "MozBorderRadiusTopleft", js.Array(value*))
      
      inline def setMozBorderRadiusTopright(
        value: BorderTopRightRadius[TLength] | js.Array[NonNullable[js.UndefOr[BorderTopRightRadius[TLength]]]]
      ): Self = StObject.set(x, "MozBorderRadiusTopright", value.asInstanceOf[js.Any])
      
      inline def setMozBorderRadiusToprightUndefined: Self = StObject.set(x, "MozBorderRadiusTopright", js.undefined)
      
      inline def setMozBorderRadiusToprightVarargs(value: NonNullable[js.UndefOr[BorderTopRightRadius[TLength]]]*): Self = StObject.set(x, "MozBorderRadiusTopright", js.Array(value*))
      
      inline def setMozBorderRadiusUndefined: Self = StObject.set(x, "MozBorderRadius", js.undefined)
      
      inline def setMozBorderRadiusVarargs(value: NonNullable[js.UndefOr[BorderRadius[TLength]]]*): Self = StObject.set(x, "MozBorderRadius", js.Array(value*))
      
      inline def setMozBoxAlign(value: BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]): Self = StObject.set(x, "MozBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setMozBoxAlignUndefined: Self = StObject.set(x, "MozBoxAlign", js.undefined)
      
      inline def setMozBoxAlignVarargs(value: NonNullable[js.UndefOr[BoxAlign]]*): Self = StObject.set(x, "MozBoxAlign", js.Array(value*))
      
      inline def setMozBoxDirection(value: BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]): Self = StObject.set(x, "MozBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setMozBoxDirectionUndefined: Self = StObject.set(x, "MozBoxDirection", js.undefined)
      
      inline def setMozBoxDirectionVarargs(value: NonNullable[js.UndefOr[BoxDirection]]*): Self = StObject.set(x, "MozBoxDirection", js.Array(value*))
      
      inline def setMozBoxFlex(value: BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]): Self = StObject.set(x, "MozBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setMozBoxFlexUndefined: Self = StObject.set(x, "MozBoxFlex", js.undefined)
      
      inline def setMozBoxFlexVarargs(value: NonNullable[js.UndefOr[BoxFlex]]*): Self = StObject.set(x, "MozBoxFlex", js.Array(value*))
      
      inline def setMozBoxOrdinalGroup(value: BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]): Self = StObject.set(x, "MozBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setMozBoxOrdinalGroupUndefined: Self = StObject.set(x, "MozBoxOrdinalGroup", js.undefined)
      
      inline def setMozBoxOrdinalGroupVarargs(value: NonNullable[js.UndefOr[BoxOrdinalGroup]]*): Self = StObject.set(x, "MozBoxOrdinalGroup", js.Array(value*))
      
      inline def setMozBoxOrient(value: BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]): Self = StObject.set(x, "MozBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setMozBoxOrientUndefined: Self = StObject.set(x, "MozBoxOrient", js.undefined)
      
      inline def setMozBoxOrientVarargs(value: NonNullable[js.UndefOr[BoxOrient]]*): Self = StObject.set(x, "MozBoxOrient", js.Array(value*))
      
      inline def setMozBoxPack(value: BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]): Self = StObject.set(x, "MozBoxPack", value.asInstanceOf[js.Any])
      
      inline def setMozBoxPackUndefined: Self = StObject.set(x, "MozBoxPack", js.undefined)
      
      inline def setMozBoxPackVarargs(value: NonNullable[js.UndefOr[BoxPack]]*): Self = StObject.set(x, "MozBoxPack", js.Array(value*))
      
      inline def setMozBoxShadow(value: BoxShadow | js.Array[NonNullable[js.UndefOr[BoxShadow]]]): Self = StObject.set(x, "MozBoxShadow", value.asInstanceOf[js.Any])
      
      inline def setMozBoxShadowUndefined: Self = StObject.set(x, "MozBoxShadow", js.undefined)
      
      inline def setMozBoxShadowVarargs(value: NonNullable[js.UndefOr[BoxShadow]]*): Self = StObject.set(x, "MozBoxShadow", js.Array(value*))
      
      inline def setMozFloatEdge(value: MozFloatEdge | js.Array[NonNullable[js.UndefOr[MozFloatEdge]]]): Self = StObject.set(x, "MozFloatEdge", value.asInstanceOf[js.Any])
      
      inline def setMozFloatEdgeUndefined: Self = StObject.set(x, "MozFloatEdge", js.undefined)
      
      inline def setMozFloatEdgeVarargs(value: NonNullable[js.UndefOr[MozFloatEdge]]*): Self = StObject.set(x, "MozFloatEdge", js.Array(value*))
      
      inline def setMozForceBrokenImageIcon(value: MozForceBrokenImageIcon | js.Array[NonNullable[js.UndefOr[MozForceBrokenImageIcon]]]): Self = StObject.set(x, "MozForceBrokenImageIcon", value.asInstanceOf[js.Any])
      
      inline def setMozForceBrokenImageIconUndefined: Self = StObject.set(x, "MozForceBrokenImageIcon", js.undefined)
      
      inline def setMozForceBrokenImageIconVarargs(value: NonNullable[js.UndefOr[MozForceBrokenImageIcon]]*): Self = StObject.set(x, "MozForceBrokenImageIcon", js.Array(value*))
      
      inline def setMozOpacity(value: Opacity | js.Array[NonNullable[js.UndefOr[Opacity]]]): Self = StObject.set(x, "MozOpacity", value.asInstanceOf[js.Any])
      
      inline def setMozOpacityUndefined: Self = StObject.set(x, "MozOpacity", js.undefined)
      
      inline def setMozOpacityVarargs(value: NonNullable[js.UndefOr[Opacity]]*): Self = StObject.set(x, "MozOpacity", js.Array(value*))
      
      inline def setMozOutline(value: Outline[TLength] | js.Array[NonNullable[js.UndefOr[Outline[TLength]]]]): Self = StObject.set(x, "MozOutline", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineColor(value: OutlineColor | js.Array[NonNullable[js.UndefOr[OutlineColor]]]): Self = StObject.set(x, "MozOutlineColor", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineColorUndefined: Self = StObject.set(x, "MozOutlineColor", js.undefined)
      
      inline def setMozOutlineColorVarargs(value: NonNullable[js.UndefOr[OutlineColor]]*): Self = StObject.set(x, "MozOutlineColor", js.Array(value*))
      
      inline def setMozOutlineRadius(value: MozOutlineRadius[TLength] | js.Array[NonNullable[js.UndefOr[MozOutlineRadius[TLength]]]]): Self = StObject.set(x, "MozOutlineRadius", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomleft(
        value: MozOutlineRadiusBottomleft[TLength] | js.Array[NonNullable[js.UndefOr[MozOutlineRadiusBottomleft[TLength]]]]
      ): Self = StObject.set(x, "MozOutlineRadiusBottomleft", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomleftUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.undefined)
      
      inline def setMozOutlineRadiusBottomleftVarargs(value: NonNullable[js.UndefOr[MozOutlineRadiusBottomleft[TLength]]]*): Self = StObject.set(x, "MozOutlineRadiusBottomleft", js.Array(value*))
      
      inline def setMozOutlineRadiusBottomright(
        value: MozOutlineRadiusBottomright[TLength] | js.Array[NonNullable[js.UndefOr[MozOutlineRadiusBottomright[TLength]]]]
      ): Self = StObject.set(x, "MozOutlineRadiusBottomright", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusBottomrightUndefined: Self = StObject.set(x, "MozOutlineRadiusBottomright", js.undefined)
      
      inline def setMozOutlineRadiusBottomrightVarargs(value: NonNullable[js.UndefOr[MozOutlineRadiusBottomright[TLength]]]*): Self = StObject.set(x, "MozOutlineRadiusBottomright", js.Array(value*))
      
      inline def setMozOutlineRadiusTopleft(
        value: MozOutlineRadiusTopleft[TLength] | js.Array[NonNullable[js.UndefOr[MozOutlineRadiusTopleft[TLength]]]]
      ): Self = StObject.set(x, "MozOutlineRadiusTopleft", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusTopleftUndefined: Self = StObject.set(x, "MozOutlineRadiusTopleft", js.undefined)
      
      inline def setMozOutlineRadiusTopleftVarargs(value: NonNullable[js.UndefOr[MozOutlineRadiusTopleft[TLength]]]*): Self = StObject.set(x, "MozOutlineRadiusTopleft", js.Array(value*))
      
      inline def setMozOutlineRadiusTopright(
        value: MozOutlineRadiusTopright[TLength] | js.Array[NonNullable[js.UndefOr[MozOutlineRadiusTopright[TLength]]]]
      ): Self = StObject.set(x, "MozOutlineRadiusTopright", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineRadiusToprightUndefined: Self = StObject.set(x, "MozOutlineRadiusTopright", js.undefined)
      
      inline def setMozOutlineRadiusToprightVarargs(value: NonNullable[js.UndefOr[MozOutlineRadiusTopright[TLength]]]*): Self = StObject.set(x, "MozOutlineRadiusTopright", js.Array(value*))
      
      inline def setMozOutlineRadiusUndefined: Self = StObject.set(x, "MozOutlineRadius", js.undefined)
      
      inline def setMozOutlineRadiusVarargs(value: NonNullable[js.UndefOr[MozOutlineRadius[TLength]]]*): Self = StObject.set(x, "MozOutlineRadius", js.Array(value*))
      
      inline def setMozOutlineStyle(value: OutlineStyle | js.Array[NonNullable[js.UndefOr[OutlineStyle]]]): Self = StObject.set(x, "MozOutlineStyle", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineStyleUndefined: Self = StObject.set(x, "MozOutlineStyle", js.undefined)
      
      inline def setMozOutlineStyleVarargs(value: NonNullable[js.UndefOr[OutlineStyle]]*): Self = StObject.set(x, "MozOutlineStyle", js.Array(value*))
      
      inline def setMozOutlineUndefined: Self = StObject.set(x, "MozOutline", js.undefined)
      
      inline def setMozOutlineVarargs(value: NonNullable[js.UndefOr[Outline[TLength]]]*): Self = StObject.set(x, "MozOutline", js.Array(value*))
      
      inline def setMozOutlineWidth(value: OutlineWidth[TLength] | js.Array[NonNullable[js.UndefOr[OutlineWidth[TLength]]]]): Self = StObject.set(x, "MozOutlineWidth", value.asInstanceOf[js.Any])
      
      inline def setMozOutlineWidthUndefined: Self = StObject.set(x, "MozOutlineWidth", js.undefined)
      
      inline def setMozOutlineWidthVarargs(value: NonNullable[js.UndefOr[OutlineWidth[TLength]]]*): Self = StObject.set(x, "MozOutlineWidth", js.Array(value*))
      
      inline def setMozTextAlignLast(value: TextAlignLast | js.Array[NonNullable[js.UndefOr[TextAlignLast]]]): Self = StObject.set(x, "MozTextAlignLast", value.asInstanceOf[js.Any])
      
      inline def setMozTextAlignLastUndefined: Self = StObject.set(x, "MozTextAlignLast", js.undefined)
      
      inline def setMozTextAlignLastVarargs(value: NonNullable[js.UndefOr[TextAlignLast]]*): Self = StObject.set(x, "MozTextAlignLast", js.Array(value*))
      
      inline def setMozTextDecorationColor(value: TextDecorationColor | js.Array[NonNullable[js.UndefOr[TextDecorationColor]]]): Self = StObject.set(x, "MozTextDecorationColor", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationColorUndefined: Self = StObject.set(x, "MozTextDecorationColor", js.undefined)
      
      inline def setMozTextDecorationColorVarargs(value: NonNullable[js.UndefOr[TextDecorationColor]]*): Self = StObject.set(x, "MozTextDecorationColor", js.Array(value*))
      
      inline def setMozTextDecorationLine(value: TextDecorationLine | js.Array[NonNullable[js.UndefOr[TextDecorationLine]]]): Self = StObject.set(x, "MozTextDecorationLine", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationLineUndefined: Self = StObject.set(x, "MozTextDecorationLine", js.undefined)
      
      inline def setMozTextDecorationLineVarargs(value: NonNullable[js.UndefOr[TextDecorationLine]]*): Self = StObject.set(x, "MozTextDecorationLine", js.Array(value*))
      
      inline def setMozTextDecorationStyle(value: TextDecorationStyle | js.Array[NonNullable[js.UndefOr[TextDecorationStyle]]]): Self = StObject.set(x, "MozTextDecorationStyle", value.asInstanceOf[js.Any])
      
      inline def setMozTextDecorationStyleUndefined: Self = StObject.set(x, "MozTextDecorationStyle", js.undefined)
      
      inline def setMozTextDecorationStyleVarargs(value: NonNullable[js.UndefOr[TextDecorationStyle]]*): Self = StObject.set(x, "MozTextDecorationStyle", js.Array(value*))
      
      inline def setMozUserInput(value: MozUserInput | js.Array[NonNullable[js.UndefOr[MozUserInput]]]): Self = StObject.set(x, "MozUserInput", value.asInstanceOf[js.Any])
      
      inline def setMozUserInputUndefined: Self = StObject.set(x, "MozUserInput", js.undefined)
      
      inline def setMozUserInputVarargs(value: NonNullable[js.UndefOr[MozUserInput]]*): Self = StObject.set(x, "MozUserInput", js.Array(value*))
      
      inline def setMsImeMode(value: ImeMode | js.Array[NonNullable[js.UndefOr[ImeMode]]]): Self = StObject.set(x, "msImeMode", value.asInstanceOf[js.Any])
      
      inline def setMsImeModeUndefined: Self = StObject.set(x, "msImeMode", js.undefined)
      
      inline def setMsImeModeVarargs(value: NonNullable[js.UndefOr[ImeMode]]*): Self = StObject.set(x, "msImeMode", js.Array(value*))
      
      inline def setOAnimation(value: Animation[String] | js.Array[NonNullable[js.UndefOr[Animation[String]]]]): Self = StObject.set(x, "OAnimation", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDelay(value: AnimationDelay[String] | js.Array[NonNullable[js.UndefOr[AnimationDelay[String]]]]): Self = StObject.set(x, "OAnimationDelay", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDelayUndefined: Self = StObject.set(x, "OAnimationDelay", js.undefined)
      
      inline def setOAnimationDelayVarargs(value: NonNullable[js.UndefOr[AnimationDelay[String]]]*): Self = StObject.set(x, "OAnimationDelay", js.Array(value*))
      
      inline def setOAnimationDirection(value: AnimationDirection | js.Array[NonNullable[js.UndefOr[AnimationDirection]]]): Self = StObject.set(x, "OAnimationDirection", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDirectionUndefined: Self = StObject.set(x, "OAnimationDirection", js.undefined)
      
      inline def setOAnimationDirectionVarargs(value: NonNullable[js.UndefOr[AnimationDirection]]*): Self = StObject.set(x, "OAnimationDirection", js.Array(value*))
      
      inline def setOAnimationDuration(value: AnimationDuration[String] | js.Array[NonNullable[js.UndefOr[AnimationDuration[String]]]]): Self = StObject.set(x, "OAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setOAnimationDurationUndefined: Self = StObject.set(x, "OAnimationDuration", js.undefined)
      
      inline def setOAnimationDurationVarargs(value: NonNullable[js.UndefOr[AnimationDuration[String]]]*): Self = StObject.set(x, "OAnimationDuration", js.Array(value*))
      
      inline def setOAnimationFillMode(value: AnimationFillMode | js.Array[NonNullable[js.UndefOr[AnimationFillMode]]]): Self = StObject.set(x, "OAnimationFillMode", value.asInstanceOf[js.Any])
      
      inline def setOAnimationFillModeUndefined: Self = StObject.set(x, "OAnimationFillMode", js.undefined)
      
      inline def setOAnimationFillModeVarargs(value: NonNullable[js.UndefOr[AnimationFillMode]]*): Self = StObject.set(x, "OAnimationFillMode", js.Array(value*))
      
      inline def setOAnimationIterationCount(value: AnimationIterationCount | js.Array[NonNullable[js.UndefOr[AnimationIterationCount]]]): Self = StObject.set(x, "OAnimationIterationCount", value.asInstanceOf[js.Any])
      
      inline def setOAnimationIterationCountUndefined: Self = StObject.set(x, "OAnimationIterationCount", js.undefined)
      
      inline def setOAnimationIterationCountVarargs(value: NonNullable[js.UndefOr[AnimationIterationCount]]*): Self = StObject.set(x, "OAnimationIterationCount", js.Array(value*))
      
      inline def setOAnimationName(value: AnimationName | js.Array[NonNullable[js.UndefOr[AnimationName]]]): Self = StObject.set(x, "OAnimationName", value.asInstanceOf[js.Any])
      
      inline def setOAnimationNameUndefined: Self = StObject.set(x, "OAnimationName", js.undefined)
      
      inline def setOAnimationNameVarargs(value: NonNullable[js.UndefOr[AnimationName]]*): Self = StObject.set(x, "OAnimationName", js.Array(value*))
      
      inline def setOAnimationPlayState(value: AnimationPlayState | js.Array[NonNullable[js.UndefOr[AnimationPlayState]]]): Self = StObject.set(x, "OAnimationPlayState", value.asInstanceOf[js.Any])
      
      inline def setOAnimationPlayStateUndefined: Self = StObject.set(x, "OAnimationPlayState", js.undefined)
      
      inline def setOAnimationPlayStateVarargs(value: NonNullable[js.UndefOr[AnimationPlayState]]*): Self = StObject.set(x, "OAnimationPlayState", js.Array(value*))
      
      inline def setOAnimationTimingFunction(value: AnimationTimingFunction | js.Array[NonNullable[js.UndefOr[AnimationTimingFunction]]]): Self = StObject.set(x, "OAnimationTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setOAnimationTimingFunctionUndefined: Self = StObject.set(x, "OAnimationTimingFunction", js.undefined)
      
      inline def setOAnimationTimingFunctionVarargs(value: NonNullable[js.UndefOr[AnimationTimingFunction]]*): Self = StObject.set(x, "OAnimationTimingFunction", js.Array(value*))
      
      inline def setOAnimationUndefined: Self = StObject.set(x, "OAnimation", js.undefined)
      
      inline def setOAnimationVarargs(value: NonNullable[js.UndefOr[Animation[String]]]*): Self = StObject.set(x, "OAnimation", js.Array(value*))
      
      inline def setOBackgroundSize(value: BackgroundSize[TLength] | js.Array[NonNullable[js.UndefOr[BackgroundSize[TLength]]]]): Self = StObject.set(x, "OBackgroundSize", value.asInstanceOf[js.Any])
      
      inline def setOBackgroundSizeUndefined: Self = StObject.set(x, "OBackgroundSize", js.undefined)
      
      inline def setOBackgroundSizeVarargs(value: NonNullable[js.UndefOr[BackgroundSize[TLength]]]*): Self = StObject.set(x, "OBackgroundSize", js.Array(value*))
      
      inline def setOBorderImage(value: BorderImage | js.Array[NonNullable[js.UndefOr[BorderImage]]]): Self = StObject.set(x, "OBorderImage", value.asInstanceOf[js.Any])
      
      inline def setOBorderImageUndefined: Self = StObject.set(x, "OBorderImage", js.undefined)
      
      inline def setOBorderImageVarargs(value: NonNullable[js.UndefOr[BorderImage]]*): Self = StObject.set(x, "OBorderImage", js.Array(value*))
      
      inline def setOObjectFit(value: ObjectFit | js.Array[NonNullable[js.UndefOr[ObjectFit]]]): Self = StObject.set(x, "OObjectFit", value.asInstanceOf[js.Any])
      
      inline def setOObjectFitUndefined: Self = StObject.set(x, "OObjectFit", js.undefined)
      
      inline def setOObjectFitVarargs(value: NonNullable[js.UndefOr[ObjectFit]]*): Self = StObject.set(x, "OObjectFit", js.Array(value*))
      
      inline def setOObjectPosition(value: ObjectPosition[TLength] | js.Array[NonNullable[js.UndefOr[ObjectPosition[TLength]]]]): Self = StObject.set(x, "OObjectPosition", value.asInstanceOf[js.Any])
      
      inline def setOObjectPositionUndefined: Self = StObject.set(x, "OObjectPosition", js.undefined)
      
      inline def setOObjectPositionVarargs(value: NonNullable[js.UndefOr[ObjectPosition[TLength]]]*): Self = StObject.set(x, "OObjectPosition", js.Array(value*))
      
      inline def setOTabSize(value: TabSize[TLength] | js.Array[NonNullable[js.UndefOr[TabSize[TLength]]]]): Self = StObject.set(x, "OTabSize", value.asInstanceOf[js.Any])
      
      inline def setOTabSizeUndefined: Self = StObject.set(x, "OTabSize", js.undefined)
      
      inline def setOTabSizeVarargs(value: NonNullable[js.UndefOr[TabSize[TLength]]]*): Self = StObject.set(x, "OTabSize", js.Array(value*))
      
      inline def setOTextOverflow(value: TextOverflow | js.Array[NonNullable[js.UndefOr[TextOverflow]]]): Self = StObject.set(x, "OTextOverflow", value.asInstanceOf[js.Any])
      
      inline def setOTextOverflowUndefined: Self = StObject.set(x, "OTextOverflow", js.undefined)
      
      inline def setOTextOverflowVarargs(value: NonNullable[js.UndefOr[TextOverflow]]*): Self = StObject.set(x, "OTextOverflow", js.Array(value*))
      
      inline def setOTransform(value: Transform | js.Array[NonNullable[js.UndefOr[Transform]]]): Self = StObject.set(x, "OTransform", value.asInstanceOf[js.Any])
      
      inline def setOTransformOrigin(value: TransformOrigin[TLength] | js.Array[NonNullable[js.UndefOr[TransformOrigin[TLength]]]]): Self = StObject.set(x, "OTransformOrigin", value.asInstanceOf[js.Any])
      
      inline def setOTransformOriginUndefined: Self = StObject.set(x, "OTransformOrigin", js.undefined)
      
      inline def setOTransformOriginVarargs(value: NonNullable[js.UndefOr[TransformOrigin[TLength]]]*): Self = StObject.set(x, "OTransformOrigin", js.Array(value*))
      
      inline def setOTransformUndefined: Self = StObject.set(x, "OTransform", js.undefined)
      
      inline def setOTransformVarargs(value: NonNullable[js.UndefOr[Transform]]*): Self = StObject.set(x, "OTransform", js.Array(value*))
      
      inline def setOTransition(value: Transition[String] | js.Array[NonNullable[js.UndefOr[Transition[String]]]]): Self = StObject.set(x, "OTransition", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDelay(value: TransitionDelay[String] | js.Array[NonNullable[js.UndefOr[TransitionDelay[String]]]]): Self = StObject.set(x, "OTransitionDelay", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDelayUndefined: Self = StObject.set(x, "OTransitionDelay", js.undefined)
      
      inline def setOTransitionDelayVarargs(value: NonNullable[js.UndefOr[TransitionDelay[String]]]*): Self = StObject.set(x, "OTransitionDelay", js.Array(value*))
      
      inline def setOTransitionDuration(value: TransitionDuration[String] | js.Array[NonNullable[js.UndefOr[TransitionDuration[String]]]]): Self = StObject.set(x, "OTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setOTransitionDurationUndefined: Self = StObject.set(x, "OTransitionDuration", js.undefined)
      
      inline def setOTransitionDurationVarargs(value: NonNullable[js.UndefOr[TransitionDuration[String]]]*): Self = StObject.set(x, "OTransitionDuration", js.Array(value*))
      
      inline def setOTransitionProperty(value: TransitionProperty | js.Array[NonNullable[js.UndefOr[TransitionProperty]]]): Self = StObject.set(x, "OTransitionProperty", value.asInstanceOf[js.Any])
      
      inline def setOTransitionPropertyUndefined: Self = StObject.set(x, "OTransitionProperty", js.undefined)
      
      inline def setOTransitionPropertyVarargs(value: NonNullable[js.UndefOr[TransitionProperty]]*): Self = StObject.set(x, "OTransitionProperty", js.Array(value*))
      
      inline def setOTransitionTimingFunction(value: TransitionTimingFunction | js.Array[NonNullable[js.UndefOr[TransitionTimingFunction]]]): Self = StObject.set(x, "OTransitionTimingFunction", value.asInstanceOf[js.Any])
      
      inline def setOTransitionTimingFunctionUndefined: Self = StObject.set(x, "OTransitionTimingFunction", js.undefined)
      
      inline def setOTransitionTimingFunctionVarargs(value: NonNullable[js.UndefOr[TransitionTimingFunction]]*): Self = StObject.set(x, "OTransitionTimingFunction", js.Array(value*))
      
      inline def setOTransitionUndefined: Self = StObject.set(x, "OTransition", js.undefined)
      
      inline def setOTransitionVarargs(value: NonNullable[js.UndefOr[Transition[String]]]*): Self = StObject.set(x, "OTransition", js.Array(value*))
      
      inline def setOffsetBlock(value: InsetBlock[TLength] | js.Array[NonNullable[js.UndefOr[InsetBlock[TLength]]]]): Self = StObject.set(x, "offsetBlock", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockEnd(value: InsetBlockEnd[TLength] | js.Array[NonNullable[js.UndefOr[InsetBlockEnd[TLength]]]]): Self = StObject.set(x, "offsetBlockEnd", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockEndUndefined: Self = StObject.set(x, "offsetBlockEnd", js.undefined)
      
      inline def setOffsetBlockEndVarargs(value: NonNullable[js.UndefOr[InsetBlockEnd[TLength]]]*): Self = StObject.set(x, "offsetBlockEnd", js.Array(value*))
      
      inline def setOffsetBlockStart(value: InsetBlockStart[TLength] | js.Array[NonNullable[js.UndefOr[InsetBlockStart[TLength]]]]): Self = StObject.set(x, "offsetBlockStart", value.asInstanceOf[js.Any])
      
      inline def setOffsetBlockStartUndefined: Self = StObject.set(x, "offsetBlockStart", js.undefined)
      
      inline def setOffsetBlockStartVarargs(value: NonNullable[js.UndefOr[InsetBlockStart[TLength]]]*): Self = StObject.set(x, "offsetBlockStart", js.Array(value*))
      
      inline def setOffsetBlockUndefined: Self = StObject.set(x, "offsetBlock", js.undefined)
      
      inline def setOffsetBlockVarargs(value: NonNullable[js.UndefOr[InsetBlock[TLength]]]*): Self = StObject.set(x, "offsetBlock", js.Array(value*))
      
      inline def setOffsetInline(value: InsetInline[TLength] | js.Array[NonNullable[js.UndefOr[InsetInline[TLength]]]]): Self = StObject.set(x, "offsetInline", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineEnd(value: InsetInlineEnd[TLength] | js.Array[NonNullable[js.UndefOr[InsetInlineEnd[TLength]]]]): Self = StObject.set(x, "offsetInlineEnd", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineEndUndefined: Self = StObject.set(x, "offsetInlineEnd", js.undefined)
      
      inline def setOffsetInlineEndVarargs(value: NonNullable[js.UndefOr[InsetInlineEnd[TLength]]]*): Self = StObject.set(x, "offsetInlineEnd", js.Array(value*))
      
      inline def setOffsetInlineStart(value: InsetInlineStart[TLength] | js.Array[NonNullable[js.UndefOr[InsetInlineStart[TLength]]]]): Self = StObject.set(x, "offsetInlineStart", value.asInstanceOf[js.Any])
      
      inline def setOffsetInlineStartUndefined: Self = StObject.set(x, "offsetInlineStart", js.undefined)
      
      inline def setOffsetInlineStartVarargs(value: NonNullable[js.UndefOr[InsetInlineStart[TLength]]]*): Self = StObject.set(x, "offsetInlineStart", js.Array(value*))
      
      inline def setOffsetInlineUndefined: Self = StObject.set(x, "offsetInline", js.undefined)
      
      inline def setOffsetInlineVarargs(value: NonNullable[js.UndefOr[InsetInline[TLength]]]*): Self = StObject.set(x, "offsetInline", js.Array(value*))
      
      inline def setScrollSnapCoordinate(
        value: ScrollSnapCoordinate[TLength] | js.Array[NonNullable[js.UndefOr[ScrollSnapCoordinate[TLength]]]]
      ): Self = StObject.set(x, "scrollSnapCoordinate", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapCoordinateUndefined: Self = StObject.set(x, "scrollSnapCoordinate", js.undefined)
      
      inline def setScrollSnapCoordinateVarargs(value: NonNullable[js.UndefOr[ScrollSnapCoordinate[TLength]]]*): Self = StObject.set(x, "scrollSnapCoordinate", js.Array(value*))
      
      inline def setScrollSnapDestination(
        value: ScrollSnapDestination[TLength] | js.Array[NonNullable[js.UndefOr[ScrollSnapDestination[TLength]]]]
      ): Self = StObject.set(x, "scrollSnapDestination", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapDestinationUndefined: Self = StObject.set(x, "scrollSnapDestination", js.undefined)
      
      inline def setScrollSnapDestinationVarargs(value: NonNullable[js.UndefOr[ScrollSnapDestination[TLength]]]*): Self = StObject.set(x, "scrollSnapDestination", js.Array(value*))
      
      inline def setScrollSnapPointsX(value: ScrollSnapPointsX | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsX]]]): Self = StObject.set(x, "scrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapPointsXUndefined: Self = StObject.set(x, "scrollSnapPointsX", js.undefined)
      
      inline def setScrollSnapPointsXVarargs(value: NonNullable[js.UndefOr[ScrollSnapPointsX]]*): Self = StObject.set(x, "scrollSnapPointsX", js.Array(value*))
      
      inline def setScrollSnapPointsY(value: ScrollSnapPointsY | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsY]]]): Self = StObject.set(x, "scrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapPointsYUndefined: Self = StObject.set(x, "scrollSnapPointsY", js.undefined)
      
      inline def setScrollSnapPointsYVarargs(value: NonNullable[js.UndefOr[ScrollSnapPointsY]]*): Self = StObject.set(x, "scrollSnapPointsY", js.Array(value*))
      
      inline def setScrollSnapTypeX(value: ScrollSnapTypeX | js.Array[NonNullable[js.UndefOr[ScrollSnapTypeX]]]): Self = StObject.set(x, "scrollSnapTypeX", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeXUndefined: Self = StObject.set(x, "scrollSnapTypeX", js.undefined)
      
      inline def setScrollSnapTypeXVarargs(value: NonNullable[js.UndefOr[ScrollSnapTypeX]]*): Self = StObject.set(x, "scrollSnapTypeX", js.Array(value*))
      
      inline def setScrollSnapTypeY(value: ScrollSnapTypeY | js.Array[NonNullable[js.UndefOr[ScrollSnapTypeY]]]): Self = StObject.set(x, "scrollSnapTypeY", value.asInstanceOf[js.Any])
      
      inline def setScrollSnapTypeYUndefined: Self = StObject.set(x, "scrollSnapTypeY", js.undefined)
      
      inline def setScrollSnapTypeYVarargs(value: NonNullable[js.UndefOr[ScrollSnapTypeY]]*): Self = StObject.set(x, "scrollSnapTypeY", js.Array(value*))
      
      inline def setShapeRendering(value: ShapeRendering | js.Array[NonNullable[js.UndefOr[ShapeRendering]]]): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setShapeRenderingVarargs(value: NonNullable[js.UndefOr[ShapeRendering]]*): Self = StObject.set(x, "shapeRendering", js.Array(value*))
      
      inline def setStopColor(value: StopColor | js.Array[NonNullable[js.UndefOr[StopColor]]]): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
      
      inline def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
      
      inline def setStopColorVarargs(value: NonNullable[js.UndefOr[StopColor]]*): Self = StObject.set(x, "stopColor", js.Array(value*))
      
      inline def setStopOpacity(value: StopOpacity | js.Array[NonNullable[js.UndefOr[StopOpacity]]]): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
      
      inline def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
      
      inline def setStopOpacityVarargs(value: NonNullable[js.UndefOr[StopOpacity]]*): Self = StObject.set(x, "stopOpacity", js.Array(value*))
      
      inline def setStroke(value: Stroke | js.Array[NonNullable[js.UndefOr[Stroke]]]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharray(value: StrokeDasharray[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDasharray[TLength]]]]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
      
      inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
      
      inline def setStrokeDasharrayVarargs(value: NonNullable[js.UndefOr[StrokeDasharray[TLength]]]*): Self = StObject.set(x, "strokeDasharray", js.Array(value*))
      
      inline def setStrokeDashoffset(value: StrokeDashoffset[TLength] | js.Array[NonNullable[js.UndefOr[StrokeDashoffset[TLength]]]]): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
      
      inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
      
      inline def setStrokeDashoffsetVarargs(value: NonNullable[js.UndefOr[StrokeDashoffset[TLength]]]*): Self = StObject.set(x, "strokeDashoffset", js.Array(value*))
      
      inline def setStrokeLinecap(value: StrokeLinecap | js.Array[NonNullable[js.UndefOr[StrokeLinecap]]]): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setStrokeLinecapVarargs(value: NonNullable[js.UndefOr[StrokeLinecap]]*): Self = StObject.set(x, "strokeLinecap", js.Array(value*))
      
      inline def setStrokeLinejoin(value: StrokeLinejoin | js.Array[NonNullable[js.UndefOr[StrokeLinejoin]]]): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
      
      inline def setStrokeLinejoinVarargs(value: NonNullable[js.UndefOr[StrokeLinejoin]]*): Self = StObject.set(x, "strokeLinejoin", js.Array(value*))
      
      inline def setStrokeMiterlimit(value: StrokeMiterlimit | js.Array[NonNullable[js.UndefOr[StrokeMiterlimit]]]): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
      
      inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
      
      inline def setStrokeMiterlimitVarargs(value: NonNullable[js.UndefOr[StrokeMiterlimit]]*): Self = StObject.set(x, "strokeMiterlimit", js.Array(value*))
      
      inline def setStrokeOpacity(value: StrokeOpacity | js.Array[NonNullable[js.UndefOr[StrokeOpacity]]]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeOpacityVarargs(value: NonNullable[js.UndefOr[StrokeOpacity]]*): Self = StObject.set(x, "strokeOpacity", js.Array(value*))
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeVarargs(value: NonNullable[js.UndefOr[Stroke]]*): Self = StObject.set(x, "stroke", js.Array(value*))
      
      inline def setStrokeWidth(value: StrokeWidth[TLength] | js.Array[NonNullable[js.UndefOr[StrokeWidth[TLength]]]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStrokeWidthVarargs(value: NonNullable[js.UndefOr[StrokeWidth[TLength]]]*): Self = StObject.set(x, "strokeWidth", js.Array(value*))
      
      inline def setTextAnchor(value: TextAnchor | js.Array[NonNullable[js.UndefOr[TextAnchor]]]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextAnchorVarargs(value: NonNullable[js.UndefOr[TextAnchor]]*): Self = StObject.set(x, "textAnchor", js.Array(value*))
      
      inline def setVectorEffect(value: VectorEffect | js.Array[NonNullable[js.UndefOr[VectorEffect]]]): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
      
      inline def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
      
      inline def setVectorEffectVarargs(value: NonNullable[js.UndefOr[VectorEffect]]*): Self = StObject.set(x, "vectorEffect", js.Array(value*))
      
      inline def setWebkitBoxAlign(value: BoxAlign | js.Array[NonNullable[js.UndefOr[BoxAlign]]]): Self = StObject.set(x, "WebkitBoxAlign", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxAlignUndefined: Self = StObject.set(x, "WebkitBoxAlign", js.undefined)
      
      inline def setWebkitBoxAlignVarargs(value: NonNullable[js.UndefOr[BoxAlign]]*): Self = StObject.set(x, "WebkitBoxAlign", js.Array(value*))
      
      inline def setWebkitBoxDirection(value: BoxDirection | js.Array[NonNullable[js.UndefOr[BoxDirection]]]): Self = StObject.set(x, "WebkitBoxDirection", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxDirectionUndefined: Self = StObject.set(x, "WebkitBoxDirection", js.undefined)
      
      inline def setWebkitBoxDirectionVarargs(value: NonNullable[js.UndefOr[BoxDirection]]*): Self = StObject.set(x, "WebkitBoxDirection", js.Array(value*))
      
      inline def setWebkitBoxFlex(value: BoxFlex | js.Array[NonNullable[js.UndefOr[BoxFlex]]]): Self = StObject.set(x, "WebkitBoxFlex", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexGroup(value: BoxFlexGroup | js.Array[NonNullable[js.UndefOr[BoxFlexGroup]]]): Self = StObject.set(x, "WebkitBoxFlexGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxFlexGroupUndefined: Self = StObject.set(x, "WebkitBoxFlexGroup", js.undefined)
      
      inline def setWebkitBoxFlexGroupVarargs(value: NonNullable[js.UndefOr[BoxFlexGroup]]*): Self = StObject.set(x, "WebkitBoxFlexGroup", js.Array(value*))
      
      inline def setWebkitBoxFlexUndefined: Self = StObject.set(x, "WebkitBoxFlex", js.undefined)
      
      inline def setWebkitBoxFlexVarargs(value: NonNullable[js.UndefOr[BoxFlex]]*): Self = StObject.set(x, "WebkitBoxFlex", js.Array(value*))
      
      inline def setWebkitBoxLines(value: BoxLines | js.Array[NonNullable[js.UndefOr[BoxLines]]]): Self = StObject.set(x, "WebkitBoxLines", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxLinesUndefined: Self = StObject.set(x, "WebkitBoxLines", js.undefined)
      
      inline def setWebkitBoxLinesVarargs(value: NonNullable[js.UndefOr[BoxLines]]*): Self = StObject.set(x, "WebkitBoxLines", js.Array(value*))
      
      inline def setWebkitBoxOrdinalGroup(value: BoxOrdinalGroup | js.Array[NonNullable[js.UndefOr[BoxOrdinalGroup]]]): Self = StObject.set(x, "WebkitBoxOrdinalGroup", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrdinalGroupUndefined: Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.undefined)
      
      inline def setWebkitBoxOrdinalGroupVarargs(value: NonNullable[js.UndefOr[BoxOrdinalGroup]]*): Self = StObject.set(x, "WebkitBoxOrdinalGroup", js.Array(value*))
      
      inline def setWebkitBoxOrient(value: BoxOrient | js.Array[NonNullable[js.UndefOr[BoxOrient]]]): Self = StObject.set(x, "WebkitBoxOrient", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxOrientUndefined: Self = StObject.set(x, "WebkitBoxOrient", js.undefined)
      
      inline def setWebkitBoxOrientVarargs(value: NonNullable[js.UndefOr[BoxOrient]]*): Self = StObject.set(x, "WebkitBoxOrient", js.Array(value*))
      
      inline def setWebkitBoxPack(value: BoxPack | js.Array[NonNullable[js.UndefOr[BoxPack]]]): Self = StObject.set(x, "WebkitBoxPack", value.asInstanceOf[js.Any])
      
      inline def setWebkitBoxPackUndefined: Self = StObject.set(x, "WebkitBoxPack", js.undefined)
      
      inline def setWebkitBoxPackVarargs(value: NonNullable[js.UndefOr[BoxPack]]*): Self = StObject.set(x, "WebkitBoxPack", js.Array(value*))
      
      inline def setWebkitScrollSnapPointsX(value: ScrollSnapPointsX | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsX]]]): Self = StObject.set(x, "WebkitScrollSnapPointsX", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapPointsXUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsX", js.undefined)
      
      inline def setWebkitScrollSnapPointsXVarargs(value: NonNullable[js.UndefOr[ScrollSnapPointsX]]*): Self = StObject.set(x, "WebkitScrollSnapPointsX", js.Array(value*))
      
      inline def setWebkitScrollSnapPointsY(value: ScrollSnapPointsY | js.Array[NonNullable[js.UndefOr[ScrollSnapPointsY]]]): Self = StObject.set(x, "WebkitScrollSnapPointsY", value.asInstanceOf[js.Any])
      
      inline def setWebkitScrollSnapPointsYUndefined: Self = StObject.set(x, "WebkitScrollSnapPointsY", js.undefined)
      
      inline def setWebkitScrollSnapPointsYVarargs(value: NonNullable[js.UndefOr[ScrollSnapPointsY]]*): Self = StObject.set(x, "WebkitScrollSnapPointsY", js.Array(value*))
    }
  }
  
  type FontFace = typings.csstype.mod.AtRule.FontFace[String | `0`, String]
  
  trait KeyFrames
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[CSSProperties | String]] {
    
    @JSName("$debugName")
    var $debugName: js.UndefOr[String] = js.undefined
  }
  object KeyFrames {
    
    inline def apply(): KeyFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyFrames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyFrames] (val x: Self) extends AnyVal {
      
      inline def set$debugName(value: String): Self = StObject.set(x, "$debugName", value.asInstanceOf[js.Any])
      
      inline def set$debugNameUndefined: Self = StObject.set(x, "$debugName", js.undefined)
    }
  }
  
  trait MediaQuery extends StObject {
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    var orientation: js.UndefOr[landscape | portrait] = js.undefined
    
    var prefersColorScheme: js.UndefOr[dark | light] = js.undefined
    
    var `type`: js.UndefOr[screen | print | all] = js.undefined
  }
  object MediaQuery {
    
    inline def apply(): MediaQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaQuery] (val x: Self) extends AnyVal {
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPrefersColorScheme(value: dark | light): Self = StObject.set(x, "prefersColorScheme", value.asInstanceOf[js.Any])
      
      inline def setPrefersColorSchemeUndefined: Self = StObject.set(x, "prefersColorScheme", js.undefined)
      
      inline def setType(value: screen | print | all): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait NestedCSSProperties
    extends StObject
       with CSSProperties {
    
    /**
      * A debug only (stripped in process.env.NODE_ENV !== 'production') name
      * Helps you figure out where the class is coming from if you care
      **/
    @JSName("$debugName")
    var $debugName: js.UndefOr[String] = js.undefined
    
    @JSName("$nest")
    var $nest: js.UndefOr[NestedCSSSelectors] = js.undefined
  }
  object NestedCSSProperties {
    
    inline def apply(): NestedCSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedCSSProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedCSSProperties] (val x: Self) extends AnyVal {
      
      inline def set$debugName(value: String): Self = StObject.set(x, "$debugName", value.asInstanceOf[js.Any])
      
      inline def set$debugNameUndefined: Self = StObject.set(x, "$debugName", js.undefined)
      
      inline def set$nest(value: NestedCSSSelectors): Self = StObject.set(x, "$nest", value.asInstanceOf[js.Any])
      
      inline def set$nestUndefined: Self = StObject.set(x, "$nest", js.undefined)
    }
  }
  
  trait NestedCSSSelectors
    extends StObject
       with /**
    * Also cater for any other nested query you want
    */
  /* selector */ StringDictionary[js.UndefOr[NestedCSSProperties]] {
    
    /**
      * Desktop first media query example
      **/
    @JSName("@media screen and (max-width: 700px)")
    var `@media screen and Leftparenthesismax-widthColon 700pxRightparenthesis`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    /**
      * Mobile first media query example
      **/
    @JSName("@media screen and (min-width: 700px)")
    var `@media screen and Leftparenthesismin-widthColon 700pxRightparenthesis`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    /**
      * Pseudo-elements
      * https://developer.mozilla.org/en/docs/Web/CSS/Pseudo-elements
      */
    @JSName("&::after")
    var AmpersandColonColonafter: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::backdrop")
    var AmpersandColonColonbackdrop: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::before")
    var AmpersandColonColonbefore: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::first-letter")
    var `AmpersandColonColonfirst-letter`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::first-line")
    var `AmpersandColonColonfirst-line`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::grammar-error")
    var `AmpersandColonColongrammar-error`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::marker")
    var AmpersandColonColonmarker: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::placeholder")
    var AmpersandColonColonplaceholder: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::selection")
    var AmpersandColonColonselection: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&::spelling-error")
    var `AmpersandColonColonspelling-error`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    /** State selector */
    @JSName("&:active")
    var AmpersandColonactive: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:any")
    var AmpersandColonany: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:checked")
    var AmpersandColonchecked: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:default")
    var AmpersandColondefault: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:disabled")
    var AmpersandColondisabled: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:empty")
    var AmpersandColonempty: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:enabled")
    var AmpersandColonenabled: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:first")
    var AmpersandColonfirst: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:first-child")
    var `AmpersandColonfirst-child`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:first-of-type")
    var `AmpersandColonfirst-of-type`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:focus")
    var AmpersandColonfocus: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:fullscreen")
    var AmpersandColonfullscreen: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:hover")
    var AmpersandColonhover: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:in-range")
    var `AmpersandColonin-range`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:indeterminate")
    var AmpersandColonindeterminate: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:invalid")
    var AmpersandColoninvalid: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:last-child")
    var `AmpersandColonlast-child`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:last-of-type")
    var `AmpersandColonlast-of-type`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:left")
    var AmpersandColonleft: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:link")
    var AmpersandColonlink: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:only-child")
    var `AmpersandColononly-child`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:only-of-type")
    var `AmpersandColononly-of-type`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:optional")
    var AmpersandColonoptional: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:out-of-range")
    var `AmpersandColonout-of-range`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:read-only")
    var `AmpersandColonread-only`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:read-write")
    var `AmpersandColonread-write`: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:required")
    var AmpersandColonrequired: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:right")
    var AmpersandColonright: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:root")
    var AmpersandColonroot: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:scope")
    var AmpersandColonscope: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:target")
    var AmpersandColontarget: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:valid")
    var AmpersandColonvalid: js.UndefOr[NestedCSSProperties] = js.undefined
    
    @JSName("&:visited")
    var AmpersandColonvisited: js.UndefOr[NestedCSSProperties] = js.undefined
    
    /** Children */
    @JSName("&>*")
    var AmpersandGreaterthansignAsterisk: js.UndefOr[NestedCSSProperties] = js.undefined
  }
  object NestedCSSSelectors {
    
    inline def apply(): NestedCSSSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestedCSSSelectors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NestedCSSSelectors] (val x: Self) extends AnyVal {
      
      inline def `set@media screen and Leftparenthesismax-widthColon 700pxRightparenthesis`(value: NestedCSSProperties): Self = StObject.set(x, "@media screen and (max-width: 700px)", value.asInstanceOf[js.Any])
      
      inline def `set@media screen and Leftparenthesismax-widthColon 700pxRightparenthesisUndefined`: Self = StObject.set(x, "@media screen and (max-width: 700px)", js.undefined)
      
      inline def `set@media screen and Leftparenthesismin-widthColon 700pxRightparenthesis`(value: NestedCSSProperties): Self = StObject.set(x, "@media screen and (min-width: 700px)", value.asInstanceOf[js.Any])
      
      inline def `set@media screen and Leftparenthesismin-widthColon 700pxRightparenthesisUndefined`: Self = StObject.set(x, "@media screen and (min-width: 700px)", js.undefined)
      
      inline def setAmpersandColonColonafter(value: NestedCSSProperties): Self = StObject.set(x, "&::after", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonColonafterUndefined: Self = StObject.set(x, "&::after", js.undefined)
      
      inline def setAmpersandColonColonbackdrop(value: NestedCSSProperties): Self = StObject.set(x, "&::backdrop", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonColonbackdropUndefined: Self = StObject.set(x, "&::backdrop", js.undefined)
      
      inline def setAmpersandColonColonbefore(value: NestedCSSProperties): Self = StObject.set(x, "&::before", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonColonbeforeUndefined: Self = StObject.set(x, "&::before", js.undefined)
      
      inline def `setAmpersandColonColonfirst-letter`(value: NestedCSSProperties): Self = StObject.set(x, "&::first-letter", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonColonfirst-letterUndefined`: Self = StObject.set(x, "&::first-letter", js.undefined)
      
      inline def `setAmpersandColonColonfirst-line`(value: NestedCSSProperties): Self = StObject.set(x, "&::first-line", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonColonfirst-lineUndefined`: Self = StObject.set(x, "&::first-line", js.undefined)
      
      inline def `setAmpersandColonColongrammar-error`(value: NestedCSSProperties): Self = StObject.set(x, "&::grammar-error", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonColongrammar-errorUndefined`: Self = StObject.set(x, "&::grammar-error", js.undefined)
      
      inline def setAmpersandColonColonmarker(value: NestedCSSProperties): Self = StObject.set(x, "&::marker", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonColonmarkerUndefined: Self = StObject.set(x, "&::marker", js.undefined)
      
      inline def setAmpersandColonColonplaceholder(value: NestedCSSProperties): Self = StObject.set(x, "&::placeholder", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonColonplaceholderUndefined: Self = StObject.set(x, "&::placeholder", js.undefined)
      
      inline def setAmpersandColonColonselection(value: NestedCSSProperties): Self = StObject.set(x, "&::selection", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonColonselectionUndefined: Self = StObject.set(x, "&::selection", js.undefined)
      
      inline def `setAmpersandColonColonspelling-error`(value: NestedCSSProperties): Self = StObject.set(x, "&::spelling-error", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonColonspelling-errorUndefined`: Self = StObject.set(x, "&::spelling-error", js.undefined)
      
      inline def setAmpersandColonactive(value: NestedCSSProperties): Self = StObject.set(x, "&:active", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonactiveUndefined: Self = StObject.set(x, "&:active", js.undefined)
      
      inline def setAmpersandColonany(value: NestedCSSProperties): Self = StObject.set(x, "&:any", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonanyUndefined: Self = StObject.set(x, "&:any", js.undefined)
      
      inline def setAmpersandColonchecked(value: NestedCSSProperties): Self = StObject.set(x, "&:checked", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColoncheckedUndefined: Self = StObject.set(x, "&:checked", js.undefined)
      
      inline def setAmpersandColondefault(value: NestedCSSProperties): Self = StObject.set(x, "&:default", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColondefaultUndefined: Self = StObject.set(x, "&:default", js.undefined)
      
      inline def setAmpersandColondisabled(value: NestedCSSProperties): Self = StObject.set(x, "&:disabled", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColondisabledUndefined: Self = StObject.set(x, "&:disabled", js.undefined)
      
      inline def setAmpersandColonempty(value: NestedCSSProperties): Self = StObject.set(x, "&:empty", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonemptyUndefined: Self = StObject.set(x, "&:empty", js.undefined)
      
      inline def setAmpersandColonenabled(value: NestedCSSProperties): Self = StObject.set(x, "&:enabled", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonenabledUndefined: Self = StObject.set(x, "&:enabled", js.undefined)
      
      inline def setAmpersandColonfirst(value: NestedCSSProperties): Self = StObject.set(x, "&:first", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonfirst-child`(value: NestedCSSProperties): Self = StObject.set(x, "&:first-child", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonfirst-childUndefined`: Self = StObject.set(x, "&:first-child", js.undefined)
      
      inline def `setAmpersandColonfirst-of-type`(value: NestedCSSProperties): Self = StObject.set(x, "&:first-of-type", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonfirst-of-typeUndefined`: Self = StObject.set(x, "&:first-of-type", js.undefined)
      
      inline def setAmpersandColonfirstUndefined: Self = StObject.set(x, "&:first", js.undefined)
      
      inline def setAmpersandColonfocus(value: NestedCSSProperties): Self = StObject.set(x, "&:focus", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonfocusUndefined: Self = StObject.set(x, "&:focus", js.undefined)
      
      inline def setAmpersandColonfullscreen(value: NestedCSSProperties): Self = StObject.set(x, "&:fullscreen", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonfullscreenUndefined: Self = StObject.set(x, "&:fullscreen", js.undefined)
      
      inline def setAmpersandColonhover(value: NestedCSSProperties): Self = StObject.set(x, "&:hover", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonhoverUndefined: Self = StObject.set(x, "&:hover", js.undefined)
      
      inline def `setAmpersandColonin-range`(value: NestedCSSProperties): Self = StObject.set(x, "&:in-range", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonin-rangeUndefined`: Self = StObject.set(x, "&:in-range", js.undefined)
      
      inline def setAmpersandColonindeterminate(value: NestedCSSProperties): Self = StObject.set(x, "&:indeterminate", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonindeterminateUndefined: Self = StObject.set(x, "&:indeterminate", js.undefined)
      
      inline def setAmpersandColoninvalid(value: NestedCSSProperties): Self = StObject.set(x, "&:invalid", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColoninvalidUndefined: Self = StObject.set(x, "&:invalid", js.undefined)
      
      inline def `setAmpersandColonlast-child`(value: NestedCSSProperties): Self = StObject.set(x, "&:last-child", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonlast-childUndefined`: Self = StObject.set(x, "&:last-child", js.undefined)
      
      inline def `setAmpersandColonlast-of-type`(value: NestedCSSProperties): Self = StObject.set(x, "&:last-of-type", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonlast-of-typeUndefined`: Self = StObject.set(x, "&:last-of-type", js.undefined)
      
      inline def setAmpersandColonleft(value: NestedCSSProperties): Self = StObject.set(x, "&:left", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonleftUndefined: Self = StObject.set(x, "&:left", js.undefined)
      
      inline def setAmpersandColonlink(value: NestedCSSProperties): Self = StObject.set(x, "&:link", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonlinkUndefined: Self = StObject.set(x, "&:link", js.undefined)
      
      inline def `setAmpersandColononly-child`(value: NestedCSSProperties): Self = StObject.set(x, "&:only-child", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColononly-childUndefined`: Self = StObject.set(x, "&:only-child", js.undefined)
      
      inline def `setAmpersandColononly-of-type`(value: NestedCSSProperties): Self = StObject.set(x, "&:only-of-type", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColononly-of-typeUndefined`: Self = StObject.set(x, "&:only-of-type", js.undefined)
      
      inline def setAmpersandColonoptional(value: NestedCSSProperties): Self = StObject.set(x, "&:optional", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonoptionalUndefined: Self = StObject.set(x, "&:optional", js.undefined)
      
      inline def `setAmpersandColonout-of-range`(value: NestedCSSProperties): Self = StObject.set(x, "&:out-of-range", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonout-of-rangeUndefined`: Self = StObject.set(x, "&:out-of-range", js.undefined)
      
      inline def `setAmpersandColonread-only`(value: NestedCSSProperties): Self = StObject.set(x, "&:read-only", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonread-onlyUndefined`: Self = StObject.set(x, "&:read-only", js.undefined)
      
      inline def `setAmpersandColonread-write`(value: NestedCSSProperties): Self = StObject.set(x, "&:read-write", value.asInstanceOf[js.Any])
      
      inline def `setAmpersandColonread-writeUndefined`: Self = StObject.set(x, "&:read-write", js.undefined)
      
      inline def setAmpersandColonrequired(value: NestedCSSProperties): Self = StObject.set(x, "&:required", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonrequiredUndefined: Self = StObject.set(x, "&:required", js.undefined)
      
      inline def setAmpersandColonright(value: NestedCSSProperties): Self = StObject.set(x, "&:right", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonrightUndefined: Self = StObject.set(x, "&:right", js.undefined)
      
      inline def setAmpersandColonroot(value: NestedCSSProperties): Self = StObject.set(x, "&:root", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonrootUndefined: Self = StObject.set(x, "&:root", js.undefined)
      
      inline def setAmpersandColonscope(value: NestedCSSProperties): Self = StObject.set(x, "&:scope", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonscopeUndefined: Self = StObject.set(x, "&:scope", js.undefined)
      
      inline def setAmpersandColontarget(value: NestedCSSProperties): Self = StObject.set(x, "&:target", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColontargetUndefined: Self = StObject.set(x, "&:target", js.undefined)
      
      inline def setAmpersandColonvalid(value: NestedCSSProperties): Self = StObject.set(x, "&:valid", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonvalidUndefined: Self = StObject.set(x, "&:valid", js.undefined)
      
      inline def setAmpersandColonvisited(value: NestedCSSProperties): Self = StObject.set(x, "&:visited", value.asInstanceOf[js.Any])
      
      inline def setAmpersandColonvisitedUndefined: Self = StObject.set(x, "&:visited", js.undefined)
      
      inline def setAmpersandGreaterthansignAsterisk(value: NestedCSSProperties): Self = StObject.set(x, "&>*", value.asInstanceOf[js.Any])
      
      inline def setAmpersandGreaterthansignAsteriskUndefined: Self = StObject.set(x, "&>*", js.undefined)
    }
  }
  
  type TLength = Double | String
}
