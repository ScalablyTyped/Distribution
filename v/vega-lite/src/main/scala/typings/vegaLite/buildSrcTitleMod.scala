package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.anon.NonMarkTitleProperties
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecEncodeMod.ColorValueRef
import typings.vegaTypings.typesSpecEncodeMod.NumericValueRef
import typings.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecEncodeMod.TextEncodeEntry
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecTitleMod.TitleAnchor
import typings.vegaTypings.typesSpecValuesMod.AlignValue
import typings.vegaTypings.typesSpecValuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTitleMod {
  
  @JSImport("vega-lite/build/src/title", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractTitleConfig(titleConfig: TitleConfig[SignalRef]): NonMarkTitleProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("extractTitleConfig")(titleConfig.asInstanceOf[js.Any]).asInstanceOf[NonMarkTitleProperties]
  
  inline def isText(v: Any): /* is vega-typings.vega-typings/types/spec/encode.Text */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isText")(v.asInstanceOf[js.Any]).asInstanceOf[/* is vega-typings.vega-typings/types/spec/encode.Text */ Boolean]
  
  /* Inlined vega-lite.vega-lite/build/src/vega.schema.MapExcludeValueRefAndReplaceSignalWith<std.Omit<vega.vega.BaseTitle, 'align' | 'baseline'>, ES> & vega-lite.vega-lite/build/src/vega.schema.MappedExcludeValueRef<std.Pick<vega.vega.BaseTitle, 'align' | 'baseline'>> */
  trait BaseTitleNoValueRefs[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var align: js.UndefOr[
        Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]
      ] = js.undefined
    
    var anchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var angle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var aria: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined | undefined ? std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var baseline: js.UndefOr[
        Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]
      ] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var dx: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var dy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var font: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var frame: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var limit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var offset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var orient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFont: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleLineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitlePadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var zindex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined | undefined ? std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
  }
  object BaseTitleNoValueRefs {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): BaseTitleNoValueRefs[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTitleNoValueRefs[ES]]
    }
    
    extension [Self <: BaseTitleNoValueRefs[?], ES /* <: ExprRef | SignalRef */](x: Self & BaseTitleNoValueRefs[ES]) {
      
      inline def setAlign(value: Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAria(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined | undefined ? std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBaseline(
        value: Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDx(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFrame(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setSubtitleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      inline def setSubtitleFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      inline def setSubtitleFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      inline def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      inline def setSubtitleFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      inline def setSubtitleLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      inline def setSubtitlePadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      inline def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      inline def setZindex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined | undefined ? std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
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
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): TitleBase[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleBase[ES]]
    }
    
    extension [Self <: TitleBase[?], ES /* <: ExprRef | SignalRef */](x: Self & TitleBase[ES]) {
      
      inline def setAnchor(value: TitleAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setEncoding(value: TextEncodeEntry): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  /* Inlined vega-lite.vega-lite/build/src/title.BaseTitleNoValueRefs<ES> */
  trait TitleConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    var align: js.UndefOr[
        Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]
      ] = js.undefined
    
    var anchor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var angle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var aria: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined | undefined ? std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var baseline: js.UndefOr[
        Exclude[
          js.UndefOr[TextBaselineValue], 
          ScaledValueRef[Any] | NumericValueRef | ColorValueRef
        ]
      ] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var dx: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var dy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var font: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var fontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var frame: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var limit: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var offset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var orient: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleColor: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFont: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFontStyle: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleFontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitleLineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var subtitlePadding: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
    
    var zindex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined | undefined ? std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ] = js.undefined
  }
  object TitleConfig {
    
    inline def apply[ES /* <: ExprRef | SignalRef */](): TitleConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleConfig[ES]]
    }
    
    extension [Self <: TitleConfig[?], ES /* <: ExprRef | SignalRef */](x: Self & TitleConfig[ES]) {
      
      inline def setAlign(value: Exclude[js.UndefOr[AlignValue], ScaledValueRef[Any] | NumericValueRef | ColorValueRef]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnchor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.AnchorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAngle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAria(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends boolean | undefined | undefined ? std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<boolean | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBaseline(
        value: Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[Any] | NumericValueRef | ColorValueRef
            ]
      ): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDx(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setFrame(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleFrame | vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setLimit(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/title.TitleOrient | vega-typings.vega-typings/types/spec/signal.SignalRef | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setSubtitleColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
      
      inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
      
      inline def setSubtitleFont(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
      
      inline def setSubtitleFontStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
      
      inline def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
      
      inline def setSubtitleFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
      
      inline def setSubtitleLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
      
      inline def setSubtitlePadding(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
      
      inline def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
      
      inline def setZindex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends number | undefined | undefined ? std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | ES : std.Exclude<number | undefined | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any
      ): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
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
    
    inline def apply[ES /* <: ExprRef | SignalRef */](text: Text | ES): TitleParams[ES] = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TitleParams[ES]]
    }
    
    extension [Self <: TitleParams[?], ES /* <: ExprRef | SignalRef */](x: Self & TitleParams[ES]) {
      
      inline def setSubtitle(value: Text): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSubtitleVarargs(value: String*): Self = StObject.set(x, "subtitle", js.Array(value*))
      
      inline def setText(value: Text | ES): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    }
  }
}
