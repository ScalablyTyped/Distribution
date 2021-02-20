package typings.vegaLite

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.channeldefMod.ColorDef
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.ShapeDef
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.channeldefMod.Value
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.legendComponentMod.LegendComponent
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaTypings.encodeMod.EncodeEntry
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.encodeMod.SymbolEncodeEntry
import typings.vegaTypings.legendMod.LegendType
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendEncodeMod {
  
  @JSImport("vega-lite/build/src/compile/legend/encode", "entries")
  @js.native
  def entries(entriesSpec: js.Any, hasLegendCmpt: LegendEncodeParams): js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/encode", "getFirstConditionValue")
  @js.native
  def getFirstConditionValue[V /* <: (Value[ExprRef | SignalRef]) | Gradient */](): V = js.native
  @JSImport("vega-lite/build/src/compile/legend/encode", "getFirstConditionValue")
  @js.native
  def getFirstConditionValue[V /* <: (Value[ExprRef | SignalRef]) | Gradient */](channelDef: ColorDef[String] | ShapeDef[String]): V = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/encode", "gradient")
  @js.native
  def gradient(gradientSpec: js.Any, hasModelLegendTypeLegendCmpt: LegendEncodeParams): SymbolEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/encode", "labels")
  @js.native
  def labels(specifiedlabelsSpec: js.Any, hasFieldOrDatumDefModelChannelLegendCmpt: LegendEncodeParams): js.Any = js.native
  
  /* Inlined {[ part in keyof vega.vega.LegendEncode ]:? (spec : vega.vega.EncodeEntry, params : vega-lite.vega-lite/build/src/compile/legend/encode.LegendEncodeParams): vega.vega.EncodeEntry} */
  object legendEncodeRules {
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules.entries")
    @js.native
    def entries: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    @scala.inline
    def entries_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entries")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules.gradient")
    @js.native
    def gradient: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    @scala.inline
    def gradient_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules.labels")
    @js.native
    def labels: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    @scala.inline
    def labels_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules.legend")
    @js.native
    def legend: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    @scala.inline
    def legend_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules.symbols")
    @js.native
    def symbols: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    @scala.inline
    def symbols_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbols")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/encode", "legendEncodeRules.title")
    @js.native
    def title: js.UndefOr[
        js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
      ] = js.native
    @scala.inline
    def title_=(
      x: js.UndefOr[
          js.Function2[/* spec */ EncodeEntry, /* params */ LegendEncodeParams, EncodeEntry]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/compile/legend/encode", "symbols")
  @js.native
  def symbols(symbolsSpec: js.Any, hasFieldOrDatumDefModelChannelLegendCmptLegendType: LegendEncodeParams): SymbolEncodeEntry = js.native
  
  @js.native
  trait LegendEncodeParams extends StObject {
    
    var channel: NonPositionScaleChannel = js.native
    
    var fieldOrDatumDef: (TypedFieldDef[String, _, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = js.native
    
    var legendCmpt: LegendComponent = js.native
    
    var legendType: LegendType = js.native
    
    var model: UnitModel = js.native
  }
  object LegendEncodeParams {
    
    @scala.inline
    def apply(
      channel: NonPositionScaleChannel,
      fieldOrDatumDef: (TypedFieldDef[String, _, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
      legendCmpt: LegendComponent,
      legendType: LegendType,
      model: UnitModel
    ): LegendEncodeParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], legendCmpt = legendCmpt.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendEncodeParams]
    }
    
    @scala.inline
    implicit class LegendEncodeParamsMutableBuilder[Self <: LegendEncodeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldOrDatumDef(
        value: (TypedFieldDef[String, _, Boolean | BinParams | binned | Null]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
      ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendCmpt(value: LegendComponent): Self = StObject.set(x, "legendCmpt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
}
