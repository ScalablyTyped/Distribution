package typings.vegaTypings.typesSpecConfigMod

import typings.std.Exclude
import typings.vegaTypings.typesSpecEncodeMod.ColorValueRef
import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTitleMod.TitleFrame
import typings.vegaTypings.typesSpecTitleMod.TitleOrient
import typings.vegaTypings.typesSpecValuesMod.AlignValue
import typings.vegaTypings.typesSpecValuesMod.AnchorValue
import typings.vegaTypings.typesSpecValuesMod.ColorValue
import typings.vegaTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaTypings.typesSpecValuesMod.NumberValue
import typings.vegaTypings.typesSpecValuesMod.StringValue
import typings.vegaTypings.typesSpecValuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/spec/config.ExcludeMappedValueRef<vega-typings.vega-typings/types/spec/title.BaseTitle> */
trait TitleConfig extends StObject {
  
  var align: js.UndefOr[
    (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
  ] = js.undefined
  
  var anchor: js.UndefOr[
    (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
  ] = js.undefined
  
  var angle: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var aria: js.UndefOr[
    (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var baseline: js.UndefOr[
    (Exclude[
      js.UndefOr[TextBaselineValue], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
  ] = js.undefined
  
  var color: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var dx: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var dy: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var font: js.UndefOr[
    (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  ] = js.undefined
  
  var fontSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var fontStyle: js.UndefOr[
    (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  ] = js.undefined
  
  var fontWeight: js.UndefOr[
    (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  ] = js.undefined
  
  var frame: js.UndefOr[
    (Exclude[
      js.UndefOr[TitleFrame | StringValue], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
  ] = js.undefined
  
  var limit: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var lineHeight: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var offset: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var orient: js.UndefOr[
    (Exclude[
      js.UndefOr[TitleOrient | SignalRef], 
      ScaledValueRef[Any] | NumericValueRef | ColorValueRef
    ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
  ] = js.undefined
  
  var subtitleColor: js.UndefOr[
    (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  var subtitleFont: js.UndefOr[
    (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
  ] = js.undefined
  
  var subtitleFontSize: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var subtitleFontStyle: js.UndefOr[
    (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
  ] = js.undefined
  
  var subtitleFontWeight: js.UndefOr[
    (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
  ] = js.undefined
  
  var subtitleLineHeight: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var subtitlePadding: js.UndefOr[
    (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
  ] = js.undefined
  
  var zindex: js.UndefOr[
    (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
  ] = js.undefined
}
object TitleConfig {
  
  inline def apply(): TitleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleConfig]
  }
  
  extension [Self <: TitleConfig](x: Self) {
    
    inline def setAlign(
      value: (Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AlignValue]]
    ): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAnchor(
      value: (Exclude[js.UndefOr[AnchorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[AnchorValue]]
    ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAngle(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAria(
      value: (Exclude[js.UndefOr[Boolean], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Boolean]]
    ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setBaseline(
      value: (Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | KeepSignal[js.UndefOr[TextBaselineValue]]
    ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    inline def setColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDx(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
    ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(
      value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
    ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontWeight(
      value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
    ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFrame(
      value: (Exclude[
          js.UndefOr[TitleFrame | StringValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[TitleFrame | StringValue]])
    ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setLimit(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLineHeight(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setOffset(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrient(
      value: (Exclude[
          js.UndefOr[TitleOrient | SignalRef], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]) | (KeepSignal[js.UndefOr[TitleOrient | SignalRef]])
    ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setSubtitleColor(
      value: (Exclude[js.UndefOr[ColorValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    inline def setSubtitleFont(
      value: (Exclude[js.UndefOr[StringValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[StringValue]]
    ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontSize(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
    
    inline def setSubtitleFontStyle(
      value: (Exclude[js.UndefOr[FontStyleValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontStyleValue]]
    ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
    
    inline def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
    
    inline def setSubtitleFontWeight(
      value: (Exclude[js.UndefOr[FontWeightValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[FontWeightValue]]
    ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
    
    inline def setSubtitleLineHeight(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
    
    inline def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
    
    inline def setSubtitlePadding(
      value: (Exclude[js.UndefOr[NumberValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[NumberValue]]
    ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
    
    inline def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
    
    inline def setZindex(
      value: (Exclude[js.UndefOr[Double], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]) | KeepSignal[js.UndefOr[Double]]
    ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
