package typings.vegaLite

import typings.vegaLite.anon.Direction
import typings.vegaLite.anon.Legend
import typings.vegaLite.anon.LegendConfig
import typings.vegaLite.anon.Signal
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.NonPositionScaleChannel
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.MarkPropFieldOrDatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.ShapeDef
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.legendMod.LegendInternal
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.horizontal
import typings.vegaTypings.axisMod.FormatType
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.axisMod.TimeFormatSpecifier
import typings.vegaTypings.encodeMod.Orientation
import typings.vegaTypings.encodeMod.SymbolShape
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.layoutMod.LayoutAlign
import typings.vegaTypings.legendMod.LegendEncode
import typings.vegaTypings.legendMod.LegendOrient
import typings.vegaTypings.legendMod.LegendType
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.DashArrayValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.OrientValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.SymbolShapeValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendPropertiesMod {
  
  @JSImport("vega-lite/build/src/compile/legend/properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipHeight(legendType: LegendType): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clipHeight")(legendType.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defaultDirection(orient: LegendOrient, legendType: LegendType): js.UndefOr[horizontal] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDirection")(orient.asInstanceOf[js.Any], legendType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[horizontal]]
  
  inline def defaultGradientLength(hasLegendConfigModelDirectionOrientScaleType: Direction): Double | Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGradientLength")(hasLegendConfigModelDirectionOrientScaleType.asInstanceOf[js.Any]).asInstanceOf[Double | Signal]
  
  inline def defaultLabelOverlap(scaleType: ScaleType): LabelOverlap = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLabelOverlap")(scaleType.asInstanceOf[js.Any]).asInstanceOf[LabelOverlap]
  
  inline def defaultSymbolType(mark: Mark, channel: NonPositionScaleChannel, shapeChannelDef: Unit, markShape: SymbolShape): SymbolShape | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSymbolType")(mark.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], shapeChannelDef.asInstanceOf[js.Any], markShape.asInstanceOf[js.Any])).asInstanceOf[SymbolShape | SignalRef]
  inline def defaultSymbolType(mark: Mark, channel: NonPositionScaleChannel, shapeChannelDef: Unit, markShape: SignalRef): SymbolShape | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSymbolType")(mark.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], shapeChannelDef.asInstanceOf[js.Any], markShape.asInstanceOf[js.Any])).asInstanceOf[SymbolShape | SignalRef]
  inline def defaultSymbolType(
    mark: Mark,
    channel: NonPositionScaleChannel,
    shapeChannelDef: ShapeDef[String],
    markShape: SymbolShape
  ): SymbolShape | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSymbolType")(mark.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], shapeChannelDef.asInstanceOf[js.Any], markShape.asInstanceOf[js.Any])).asInstanceOf[SymbolShape | SignalRef]
  inline def defaultSymbolType(
    mark: Mark,
    channel: NonPositionScaleChannel,
    shapeChannelDef: ShapeDef[String],
    markShape: SignalRef
  ): SymbolShape | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSymbolType")(mark.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], shapeChannelDef.asInstanceOf[js.Any], markShape.asInstanceOf[js.Any])).asInstanceOf[SymbolShape | SignalRef]
  
  inline def defaultType(hasChannelTimeUnitScaleType: typings.vegaLite.anon.ScaleType): LegendType = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultType")(hasChannelTimeUnitScaleType.asInstanceOf[js.Any]).asInstanceOf[LegendType]
  
  inline def getDirection(hasLegendConfigLegendTypeOrientLegend: LegendConfig): Orientation = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(hasLegendConfigLegendTypeOrientLegend.asInstanceOf[js.Any]).asInstanceOf[Orientation]
  
  inline def getLegendType(params: Legend): LegendType = ^.asInstanceOf[js.Dynamic].applyDynamic("getLegendType")(params.asInstanceOf[js.Any]).asInstanceOf[LegendType]
  
  /* Inlined {[ k in keyof vega-lite.vega-lite/build/src/compile/legend/component.LegendComponentProps ]:? (params : vega-lite.vega-lite/build/src/compile/legend/properties.LegendRuleParams): vega-lite.vega-lite/build/src/compile/legend/component.LegendComponentProps[k]} */
  object legendRules {
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.aria")
    @js.native
    def aria: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Boolean]]] = js.native
    inline def aria_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.clipHeight")
    @js.native
    def clipHeight: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def clipHeight_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clipHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.columnPadding")
    @js.native
    def columnPadding: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def columnPadding_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columnPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.columns")
    @js.native
    def columns: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def columns_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columns")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.cornerRadius")
    @js.native
    def cornerRadius: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def cornerRadius_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cornerRadius")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.description")
    @js.native
    def description: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def description_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.direction")
    @js.native
    def direction: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Orientation]]] = js.native
    inline def direction_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Orientation]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.disable")
    @js.native
    def disable: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Boolean]]] = js.native
    inline def disable_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disable")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.encode")
    @js.native
    def encode: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[LegendEncode]]] = js.native
    inline def encode_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[LegendEncode]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.fill")
    @js.native
    def fill: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.fillColor")
    @js.native
    def fillColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def fillColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(x.asInstanceOf[js.Any])
    
    inline def fill_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.format")
    @js.native
    def format: js.UndefOr[
        js.Function1[
          /* params */ LegendRuleParams, 
          js.UndefOr[String | TimeFormatSpecifier | SignalRef]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.formatType")
    @js.native
    def formatType: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FormatType | SignalRef]]] = js.native
    inline def formatType_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FormatType | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatType")(x.asInstanceOf[js.Any])
    
    inline def format_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ LegendRuleParams, 
            js.UndefOr[String | TimeFormatSpecifier | SignalRef]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.gradientLength")
    @js.native
    def gradientLength: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def gradientLength_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientLength")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.gradientOpacity")
    @js.native
    def gradientOpacity: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def gradientOpacity_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.gradientStrokeColor")
    @js.native
    def gradientStrokeColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def gradientStrokeColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.gradientStrokeWidth")
    @js.native
    def gradientStrokeWidth: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def gradientStrokeWidth_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientStrokeWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.gradientThickness")
    @js.native
    def gradientThickness: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def gradientThickness_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gradientThickness")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.gridAlign")
    @js.native
    def gridAlign: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[LayoutAlign | SignalRef]]] = js.native
    inline def gridAlign_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[LayoutAlign | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelAlign")
    @js.native
    def labelAlign: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[AlignValue]]] = js.native
    inline def labelAlign_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[AlignValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelBaseline")
    @js.native
    def labelBaseline: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[TextBaselineValue]]] = js.native
    inline def labelBaseline_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[TextBaselineValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelColor")
    @js.native
    def labelColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def labelColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelExpr")
    @js.native
    def labelExpr: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def labelExpr_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelExpr")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelFont")
    @js.native
    def labelFont: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[StringValue]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelFontSize")
    @js.native
    def labelFontSize: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def labelFontSize_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelFontStyle")
    @js.native
    def labelFontStyle: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontStyleValue]]] = js.native
    inline def labelFontStyle_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontStyleValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelFontWeight")
    @js.native
    def labelFontWeight: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontWeightValue]]] = js.native
    inline def labelFontWeight_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontWeightValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    inline def labelFont_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[StringValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelLimit")
    @js.native
    def labelLimit: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def labelLimit_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelOffset")
    @js.native
    def labelOffset: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def labelOffset_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelOpacity")
    @js.native
    def labelOpacity: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def labelOpacity_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelOverlap")
    @js.native
    def labelOverlap: js.UndefOr[
        js.Function1[/* params */ LegendRuleParams, js.UndefOr[LabelOverlap | SignalRef]]
      ] = js.native
    inline def labelOverlap_=(
      x: js.UndefOr[
          js.Function1[/* params */ LegendRuleParams, js.UndefOr[LabelOverlap | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelPadding")
    @js.native
    def labelPadding: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def labelPadding_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.labelSeparation")
    @js.native
    def labelSeparation: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def labelSeparation_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.legendX")
    @js.native
    def legendX: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def legendX_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendX")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.legendY")
    @js.native
    def legendY: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def legendY_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legendY")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.offset")
    @js.native
    def offset: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def offset_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.opacity")
    @js.native
    def opacity: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def opacity_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.orient")
    @js.native
    def orient: js.UndefOr[
        js.Function1[/* params */ LegendRuleParams, js.UndefOr[LegendOrient | SignalRef]]
      ] = js.native
    inline def orient_=(
      x: js.UndefOr[
          js.Function1[/* params */ LegendRuleParams, js.UndefOr[LegendOrient | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.padding")
    @js.native
    def padding: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def padding_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.rowPadding")
    @js.native
    def rowPadding: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def rowPadding_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rowPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.selections")
    @js.native
    def selections: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[js.Array[String]]]] = js.native
    inline def selections_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[js.Array[String]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selections")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.shape")
    @js.native
    def shape: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def shape_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shape")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.size")
    @js.native
    def size: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def size_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.stroke")
    @js.native
    def stroke: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.strokeColor")
    @js.native
    def strokeColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def strokeColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.strokeDash")
    @js.native
    def strokeDash: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def strokeDash_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.strokeWidth")
    @js.native
    def strokeWidth: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]] = js.native
    inline def strokeWidth_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(x.asInstanceOf[js.Any])
    
    inline def stroke_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolDash")
    @js.native
    def symbolDash: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[DashArrayValue]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolDashOffset")
    @js.native
    def symbolDashOffset: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def symbolDashOffset_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolDashOffset")(x.asInstanceOf[js.Any])
    
    inline def symbolDash_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[DashArrayValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolFillColor")
    @js.native
    def symbolFillColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def symbolFillColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolFillColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolLimit")
    @js.native
    def symbolLimit: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def symbolLimit_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolOffset")
    @js.native
    def symbolOffset: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def symbolOffset_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolOpacity")
    @js.native
    def symbolOpacity: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def symbolOpacity_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolSize")
    @js.native
    def symbolSize: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def symbolSize_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolStrokeColor")
    @js.native
    def symbolStrokeColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def symbolStrokeColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolStrokeWidth")
    @js.native
    def symbolStrokeWidth: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def symbolStrokeWidth_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolStrokeWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.symbolType")
    @js.native
    def symbolType: js.UndefOr[
        js.Function1[/* params */ LegendRuleParams, js.UndefOr[SymbolShapeValue | SignalRef]]
      ] = js.native
    inline def symbolType_=(
      x: js.UndefOr[
          js.Function1[/* params */ LegendRuleParams, js.UndefOr[SymbolShapeValue | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolType")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.tickCount")
    @js.native
    def tickCount: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[TickCount]]] = js.native
    inline def tickCount_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[TickCount]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.tickMinStep")
    @js.native
    def tickMinStep: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    inline def tickMinStep_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickMinStep")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.title")
    @js.native
    def title: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Text | SignalRef]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleAlign")
    @js.native
    def titleAlign: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[AlignValue]]] = js.native
    inline def titleAlign_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[AlignValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleAnchor")
    @js.native
    def titleAnchor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[AnchorValue]]] = js.native
    inline def titleAnchor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[AnchorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleBaseline")
    @js.native
    def titleBaseline: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[TextBaselineValue]]] = js.native
    inline def titleBaseline_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[TextBaselineValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleColor")
    @js.native
    def titleColor: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]] = js.native
    inline def titleColor_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleFont")
    @js.native
    def titleFont: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[StringValue]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleFontSize")
    @js.native
    def titleFontSize: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def titleFontSize_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleFontStyle")
    @js.native
    def titleFontStyle: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontStyleValue]]] = js.native
    inline def titleFontStyle_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontStyleValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleFontWeight")
    @js.native
    def titleFontWeight: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontWeightValue]]] = js.native
    inline def titleFontWeight_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[FontWeightValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(x.asInstanceOf[js.Any])
    
    inline def titleFont_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[StringValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleLimit")
    @js.native
    def titleLimit: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def titleLimit_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleLineHeight")
    @js.native
    def titleLineHeight: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def titleLineHeight_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleOpacity")
    @js.native
    def titleOpacity: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def titleOpacity_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titleOrient")
    @js.native
    def titleOrient: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[OrientValue]]] = js.native
    inline def titleOrient_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[OrientValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOrient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.titlePadding")
    @js.native
    def titlePadding: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]] = js.native
    inline def titlePadding_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(x.asInstanceOf[js.Any])
    
    inline def title_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Text | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.type")
    @js.native
    val `type`: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[LegendType]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.values")
    @js.native
    def values: js.UndefOr[
        js.Function1[/* params */ LegendRuleParams, js.UndefOr[js.Array[js.Any] | SignalRef]]
      ] = js.native
    inline def values_=(
      x: js.UndefOr[
          js.Function1[/* params */ LegendRuleParams, js.UndefOr[js.Array[js.Any] | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/legend/properties", "legendRules.zindex")
    @js.native
    def zindex: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double]]] = js.native
    inline def zindex_=(x: js.UndefOr[js.Function1[/* params */ LegendRuleParams, js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zindex")(x.asInstanceOf[js.Any])
  }
  
  inline def values(
    legend: LegendInternal,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]
  ): SignalRef | (js.Array[String | Double | Boolean | DateTime | Signal]) = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(legend.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[SignalRef | (js.Array[String | Double | Boolean | DateTime | Signal])]
  
  inline def values_binned(
    legend: LegendInternal,
    fieldOrDatumDef: TypedFieldDef[String, js.Any, Boolean | BinParams | binned | Null]
  ): SignalRef | (js.Array[String | Double | Boolean | DateTime | Signal]) = (^.asInstanceOf[js.Dynamic].applyDynamic("values")(legend.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[SignalRef | (js.Array[String | Double | Boolean | DateTime | Signal])]
  
  trait LegendRuleParams extends StObject {
    
    var channel: NonPositionScaleChannel
    
    var config: Config[SignalRef]
    
    var direction: Orientation
    
    var encoding: Encoding[String]
    
    var fieldOrDatumDef: MarkPropFieldOrDatumDef[String, Type]
    
    var legend: LegendInternal
    
    var legendConfig: typings.vegaLite.legendMod.LegendConfig[SignalRef]
    
    var legendType: LegendType
    
    var markDef: MarkDef[Mark, SignalRef]
    
    var model: UnitModel
    
    var orient: LegendOrient
    
    var scaleType: ScaleType
  }
  object LegendRuleParams {
    
    inline def apply(
      channel: NonPositionScaleChannel,
      config: Config[SignalRef],
      direction: Orientation,
      encoding: Encoding[String],
      fieldOrDatumDef: MarkPropFieldOrDatumDef[String, Type],
      legend: LegendInternal,
      legendConfig: typings.vegaLite.legendMod.LegendConfig[SignalRef],
      legendType: LegendType,
      markDef: MarkDef[Mark, SignalRef],
      model: UnitModel,
      orient: LegendOrient,
      scaleType: ScaleType
    ): LegendRuleParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], legendType = legendType.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegendRuleParams]
    }
    
    extension [Self <: LegendRuleParams](x: Self) {
      
      inline def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEncoding(value: Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFieldOrDatumDef(value: MarkPropFieldOrDatumDef[String, Type]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      inline def setLegend(value: LegendInternal): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendConfig(value: typings.vegaLite.legendMod.LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
      
      inline def setLegendType(value: LegendType): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
      
      inline def setMarkDef(value: MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      inline def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setScaleType(value: ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    }
  }
}
