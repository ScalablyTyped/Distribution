package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.anon.NonMark
import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import typings.vegaTypings.titleMod.TitleFrame
import typings.vegaTypings.titleMod.TitleOrient
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("vega-lite/build/src/title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractTitleConfig(titleConfig: TitleConfig[SignalRef]): NonMark = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTitleConfig")(titleConfig.asInstanceOf[js.Any]).asInstanceOf[NonMark]
  
  @scala.inline
  def isText(v: js.Any): /* is vega-typings.vega-typings/types/spec/encode.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(v.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/encode.Text */ Boolean]
  
  /* Inlined vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<std.Omit<vega.vega.BaseTitle, 'align' | 'baseline'>, ES> & vega-lite.vega-lite/build/src/vega.schema.MappedExcludeValueRef<std.Pick<vega.vega.BaseTitle, 'align' | 'baseline'>> */
  trait BaseTitleNoValueRefs[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var align: js.UndefOr[
        Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]
      ] = js.undefined
    
    var anchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var angle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var baseline: js.UndefOr[
        Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]
      ] = js.undefined
    
    var color: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var dx: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var dy: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var font: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var frame: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleFrame | StringValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var limit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var orient: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleOrient | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var subtitleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitleFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var subtitleFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var subtitleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
  }
  object BaseTitleNoValueRefs {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): BaseTitleNoValueRefs[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTitleNoValueRefs[ES]]
    }
    
    @scala.inline
    implicit class BaseTitleNoValueRefsMutableBuilder[Self <: BaseTitleNoValueRefs[?], ES /* <: ExprRef | SignalRef */] (val x: Self & BaseTitleNoValueRefs[ES]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBaseline(
        value: Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      @scala.inline
      def setColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDx(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(
        value: (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFrame(
        value: (Exclude[
              js.UndefOr[TitleFrame | StringValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(
        value: (Exclude[
              js.UndefOr[TitleOrient | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setSubtitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColorNull: Self = StObject.set(x, "subtitleColor", null)
      
      @scala.inline
      def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      @scala.inline
      def setSubtitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      @scala.inline
      def setSubtitleFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      @scala.inline
      def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      @scala.inline
      def setSubtitleFontWeight(
        value: (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      @scala.inline
      def setSubtitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      @scala.inline
      def setSubtitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait TitleBase[ES /* <: ExprRef | SignalRef */]
    extends StObject
       with BaseTitleNoValueRefs[ES] {
    
    /**
      * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For example, with an orientation of top these anchor positions map to a left-, center-, or right-aligned title.
      *
      * __Default value:__ `"middle"` for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views.
      * `"start"` for other composite views.
      *
      * __Note:__ [For now](https://github.com/vega/vega-lite/issues/2875), `anchor` is only customizable only for [single](https://vega.github.io/vega-lite/docs/spec.html) and [layered](https://vega.github.io/vega-lite/docs/layer.html) views. For other composite views, `anchor` is always `"start"`.
      */
    @JSName("anchor")
    var anchor_TitleBase: js.UndefOr[TitleAnchor] = js.undefined
    
    /**
      * Mark definitions for custom encoding.
      *
      * @hidden
      */
    var encoding: js.UndefOr[TextEncodeEntry] = js.undefined
    
    /**
      * A [mark style property](https://vega.github.io/vega-lite/docs/config.html#style) to apply to the title text mark.
      *
      * __Default value:__ `"group-title"`.
      */
    var style: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * 	The integer z-index indicating the layering of the title group relative to other axis, mark and legend groups.
      *
      * __Default value:__ `0`.
      *
      * @TJS-type integer
      * @minimum 0
      */
    @JSName("zindex")
    var zindex_TitleBase: js.UndefOr[Double] = js.undefined
  }
  object TitleBase {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): TitleBase[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleBase[ES]]
    }
    
    @scala.inline
    implicit class TitleBaseMutableBuilder[Self <: TitleBase[?], ES /* <: ExprRef | SignalRef */] (val x: Self & TitleBase[ES]) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: TitleAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setEncoding(value: TextEncodeEntry): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value :_*))
      
      @scala.inline
      def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/title.BaseTitleNoValueRefs<ES> */
  trait TitleConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var align: js.UndefOr[
        Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]
      ] = js.undefined
    
    var anchor: js.UndefOr[
        (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var angle: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var aria: js.UndefOr[
        (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var baseline: js.UndefOr[
        Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]
      ] = js.undefined
    
    var color: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var dx: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var dy: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var font: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var frame: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleFrame | StringValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var limit: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var offset: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var orient: js.UndefOr[
        (Exclude[
          js.UndefOr[TitleOrient | SignalRef], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var subtitleColor: js.UndefOr[
        (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitleFont: js.UndefOr[
        (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitleFontSize: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitleFontStyle: js.UndefOr[
        (Exclude[
          js.UndefOr[FontStyleValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var subtitleFontWeight: js.UndefOr[
        (Exclude[
          js.UndefOr[FontWeightValue], 
          ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
        ]) | ES
      ] = js.undefined
    
    var subtitleLineHeight: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var subtitlePadding: js.UndefOr[
        (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
    
    var zindex: js.UndefOr[
        (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ] = js.undefined
  }
  object TitleConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): TitleConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleConfig[ES]]
    }
    
    @scala.inline
    implicit class TitleConfigMutableBuilder[Self <: TitleConfig[?], ES /* <: ExprRef | SignalRef */] (val x: Self & TitleConfig[ES]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnchor(
        value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setAngle(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setAria(
        value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setBaseline(
        value: Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      @scala.inline
      def setColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorNull: Self = StObject.set(x, "color", null)
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDx(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      @scala.inline
      def setDy(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      @scala.inline
      def setFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontWeight(
        value: (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setFrame(
        value: (Exclude[
              js.UndefOr[TitleFrame | StringValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setLimit(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      @scala.inline
      def setOffset(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrient(
        value: (Exclude[
              js.UndefOr[TitleOrient | SignalRef], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      @scala.inline
      def setSubtitleColor(
        value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleColorNull: Self = StObject.set(x, "subtitleColor", null)
      
      @scala.inline
      def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      @scala.inline
      def setSubtitleFont(
        value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSize(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      @scala.inline
      def setSubtitleFontStyle(
        value: (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      @scala.inline
      def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      @scala.inline
      def setSubtitleFontWeight(
        value: (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | ES
      ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      @scala.inline
      def setSubtitleLineHeight(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      @scala.inline
      def setSubtitlePadding(
        value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      @scala.inline
      def setZindex(
        value: (Exclude[js.UndefOr[Double], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | ES
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait TitleParams[ES /* <: ExprRef | SignalRef */]
    extends StObject
       with TitleBase[ES] {
    
    /**
      * The subtitle Text.
      */
    var subtitle: js.UndefOr[Text] = js.undefined
    
    /**
      * The title text.
      */
    var text: Text | ES
  }
  object TitleParams {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](text: Text | ES): TitleParams[ES] = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleParams[ES]]
    }
    
    @scala.inline
    implicit class TitleParamsMutableBuilder[Self <: TitleParams[?], ES /* <: ExprRef | SignalRef */] (val x: Self & TitleParams[ES]) extends AnyVal {
      
      @scala.inline
      def setSubtitle(value: Text): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setSubtitleVarargs(value: String*): Self = StObject.set(x, "subtitle", js.Array(value :_*))
      
      @scala.inline
      def setText(value: Text | ES): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
    }
  }
}
