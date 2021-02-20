package typings.vegaLite

import typings.std.Exclude
import typings.vegaLite.anon.FieldOrDatumDef
import typings.vegaLite.anon.Signal
import typings.vegaLite.axisMod.AxisInternal
import typings.vegaLite.axisMod.ConditionalAxisColor
import typings.vegaLite.axisMod.ConditionalAxisLabelAlign
import typings.vegaLite.axisMod.ConditionalAxisLabelBaseline
import typings.vegaLite.axisMod.ConditionalAxisLabelFontStyle
import typings.vegaLite.axisMod.ConditionalAxisLabelFontWeight
import typings.vegaLite.axisMod.ConditionalAxisNumber
import typings.vegaLite.axisMod.ConditionalAxisNumberArray
import typings.vegaLite.axisMod.ConditionalAxisString
import typings.vegaLite.binMod.Bin
import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channelMod.PositionScaleChannel
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.FieldDefBase
import typings.vegaLite.channeldefMod.PositionDatumDef
import typings.vegaLite.channeldefMod.PositionFieldDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.configMod.AxisConfigs
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.sortMod.Sort
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcConfigMod.StyleConfigIndex
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaLite.vegaLiteNumbers.`0`
import typings.vegaLite.vegaLiteNumbers.`1`
import typings.vegaLite.vegaLiteStrings.binned
import typings.vegaLite.vegaLiteStrings.bottom
import typings.vegaLite.vegaLiteStrings.center
import typings.vegaLite.vegaLiteStrings.extent
import typings.vegaLite.vegaLiteStrings.greedy
import typings.vegaLite.vegaLiteStrings.left
import typings.vegaLite.vegaLiteStrings.middle
import typings.vegaLite.vegaLiteStrings.top
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaTypings.axisMod.AxisEncode
import typings.vegaTypings.axisMod.AxisOrient
import typings.vegaTypings.axisMod.FormatType
import typings.vegaTypings.axisMod.LabelOverlap
import typings.vegaTypings.axisMod.TickCount
import typings.vegaTypings.axisMod.TimeFormatSpecifier
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.ColorValueRef
import typings.vegaTypings.encodeMod.NumericValueRef
import typings.vegaTypings.encodeMod.Orient
import typings.vegaTypings.encodeMod.ScaledValueRef
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.valuesMod.AlignValue
import typings.vegaTypings.valuesMod.AnchorValue
import typings.vegaTypings.valuesMod.BooleanValue
import typings.vegaTypings.valuesMod.ColorValue
import typings.vegaTypings.valuesMod.DashArrayValue
import typings.vegaTypings.valuesMod.FontStyleValue
import typings.vegaTypings.valuesMod.FontWeightValue
import typings.vegaTypings.valuesMod.NumberValue
import typings.vegaTypings.valuesMod.StringValue
import typings.vegaTypings.valuesMod.StrokeCapValue
import typings.vegaTypings.valuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertiesMod {
  
  /* Inlined {[ k in keyof vega-lite.vega-lite/build/src/compile/axis/component.AxisComponentProps ]:? (params : vega-lite.vega-lite/build/src/compile/axis/properties.AxisRuleParams): vega-lite.vega-lite/build/src/compile/axis/component.AxisComponentProps[k]} */
  object axisRules {
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.aria")
    @js.native
    def aria: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]] = js.native
    @scala.inline
    def aria_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aria")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.bandPosition")
    @js.native
    def bandPosition: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def bandPosition_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bandPosition")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.description")
    @js.native
    def description: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[String]]] = js.native
    @scala.inline
    def description_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.disable")
    @js.native
    def disable: js.UndefOr[js.Function1[/* params */ AxisRuleParams, Boolean]] = js.native
    @scala.inline
    def disable_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disable")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domain")
    @js.native
    def domain: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domainCap")
    @js.native
    def domainCap: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StrokeCapValue]]] = js.native
    @scala.inline
    def domainCap_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StrokeCapValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domainColor")
    @js.native
    def domainColor: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[ColorValue]]] = js.native
    @scala.inline
    def domainColor_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domainDash")
    @js.native
    def domainDash: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[DashArrayValue]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domainDashOffset")
    @js.native
    def domainDashOffset: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def domainDashOffset_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def domainDash_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[DashArrayValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domainOpacity")
    @js.native
    def domainOpacity: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def domainOpacity_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.domainWidth")
    @js.native
    def domainWidth: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def domainWidth_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainWidth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def domain_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.encode")
    @js.native
    def encode: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[AxisEncode]]] = js.native
    @scala.inline
    def encode_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[AxisEncode]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encode")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.format")
    @js.native
    def format: js.UndefOr[
        js.Function1[/* params */ AxisRuleParams, js.UndefOr[String | TimeFormatSpecifier | SignalRef]]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.formatType")
    @js.native
    def formatType: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[FormatType | SignalRef]]] = js.native
    @scala.inline
    def formatType_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[FormatType | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def format_=(
      x: js.UndefOr[
          js.Function1[/* params */ AxisRuleParams, js.UndefOr[String | TimeFormatSpecifier | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.grid")
    @js.native
    def grid: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridCap")
    @js.native
    def gridCap: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StrokeCapValue]]] = js.native
    @scala.inline
    def gridCap_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StrokeCapValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridColor")
    @js.native
    def gridColor: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def gridColor_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridDash")
    @js.native
    def gridDash: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[
              js.UndefOr[DashArrayValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridDashOffset")
    @js.native
    def gridDashOffset: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def gridDashOffset_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def gridDash_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[
                js.UndefOr[DashArrayValue], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridOpacity")
    @js.native
    def gridOpacity: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def gridOpacity_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridScale")
    @js.native
    def gridScale: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[String]]] = js.native
    @scala.inline
    def gridScale_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridScale")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.gridWidth")
    @js.native
    def gridWidth: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def gridWidth_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gridWidth")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def grid_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grid")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelAlign")
    @js.native
    def labelAlign: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisLabelAlign[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelAlign_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[AlignValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisLabelAlign[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelAngle")
    @js.native
    def labelAngle: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def labelAngle_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelBaseline")
    @js.native
    def labelBaseline: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[
              js.UndefOr[TextBaselineValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | SignalRef | ConditionalAxisLabelBaseline[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelBaseline_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[
                js.UndefOr[TextBaselineValue], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | SignalRef | ConditionalAxisLabelBaseline[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelBound")
    @js.native
    def labelBound: js.UndefOr[
        js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | Boolean | SignalRef]]
      ] = js.native
    @scala.inline
    def labelBound_=(
      x: js.UndefOr[
          js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | Boolean | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelBound")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelColor")
    @js.native
    def labelColor: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelColor_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelExpr")
    @js.native
    def labelExpr: js.UndefOr[js.Function1[/* params */ AxisRuleParams, String]] = js.native
    @scala.inline
    def labelExpr_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelExpr")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelFlush")
    @js.native
    def labelFlush: js.UndefOr[
        js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | Boolean | SignalRef]]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelFlushOffset")
    @js.native
    def labelFlushOffset: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    @scala.inline
    def labelFlushOffset_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFlushOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFlush_=(
      x: js.UndefOr[
          js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | Boolean | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFlush")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelFont")
    @js.native
    def labelFont: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisString[SignalRef]
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelFontSize")
    @js.native
    def labelFontSize: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelFontSize_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelFontStyle")
    @js.native
    def labelFontStyle: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[
              js.UndefOr[FontStyleValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | SignalRef | ConditionalAxisLabelFontStyle[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelFontStyle_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[
                js.UndefOr[FontStyleValue], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | SignalRef | ConditionalAxisLabelFontStyle[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelFontWeight")
    @js.native
    def labelFontWeight: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[
              js.UndefOr[FontWeightValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | SignalRef | ConditionalAxisLabelFontWeight[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelFontWeight_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[
                js.UndefOr[FontWeightValue], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | SignalRef | ConditionalAxisLabelFontWeight[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFont_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[StringValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisString[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelLimit")
    @js.native
    def labelLimit: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def labelLimit_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelLineHeight")
    @js.native
    def labelLineHeight: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def labelLineHeight_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelOffset")
    @js.native
    def labelOffset: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelOffset_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelOpacity")
    @js.native
    def labelOpacity: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelOpacity_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelOverlap")
    @js.native
    def labelOverlap: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[LabelOverlap | SignalRef]]] = js.native
    @scala.inline
    def labelOverlap_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[LabelOverlap | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelOverlap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelPadding")
    @js.native
    def labelPadding: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def labelPadding_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labelSeparation")
    @js.native
    def labelSeparation: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    @scala.inline
    def labelSeparation_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelSeparation")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.labels")
    @js.native
    def labels: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]] = js.native
    @scala.inline
    def labels_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Boolean]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labels")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.maxExtent")
    @js.native
    def maxExtent: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def maxExtent_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxExtent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.minExtent")
    @js.native
    def minExtent: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def minExtent_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minExtent")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.offset")
    @js.native
    def offset: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def offset_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.orient")
    @js.native
    def orient: js.UndefOr[js.Function1[/* params */ AxisRuleParams, AxisOrient | SignalRef]] = js.native
    @scala.inline
    def orient_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, AxisOrient | SignalRef]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orient")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.position")
    @js.native
    def position: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def position_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("position")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.scale")
    @js.native
    def scale: js.UndefOr[js.Function1[/* params */ AxisRuleParams, String]] = js.native
    @scala.inline
    def scale_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickBand")
    @js.native
    def tickBand: js.UndefOr[
        js.Function1[/* params */ AxisRuleParams, js.UndefOr[center | extent | SignalRef]]
      ] = js.native
    @scala.inline
    def tickBand_=(
      x: js.UndefOr[
          js.Function1[/* params */ AxisRuleParams, js.UndefOr[center | extent | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickBand")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickCap")
    @js.native
    def tickCap: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StrokeCapValue]]] = js.native
    @scala.inline
    def tickCap_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StrokeCapValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCap")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickColor")
    @js.native
    def tickColor: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def tickColor_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[ColorValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisColor[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickCount")
    @js.native
    def tickCount: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[TickCount]]] = js.native
    @scala.inline
    def tickCount_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[TickCount]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickCount")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickDash")
    @js.native
    def tickDash: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[
              js.UndefOr[DashArrayValue], 
              ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
            ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
          ]
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickDashOffset")
    @js.native
    def tickDashOffset: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def tickDashOffset_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDashOffset")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def tickDash_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[
                js.UndefOr[DashArrayValue], 
                ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef
              ]) | SignalRef | ConditionalAxisNumberArray[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickDash")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickExtra")
    @js.native
    def tickExtra: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[BooleanValue]]] = js.native
    @scala.inline
    def tickExtra_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[BooleanValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickExtra")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickMinStep")
    @js.native
    def tickMinStep: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | SignalRef]]] = js.native
    @scala.inline
    def tickMinStep_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double | SignalRef]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickMinStep")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickOffset")
    @js.native
    def tickOffset: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def tickOffset_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOffset")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickOpacity")
    @js.native
    def tickOpacity: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def tickOpacity_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickRound")
    @js.native
    def tickRound: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[BooleanValue]]] = js.native
    @scala.inline
    def tickRound_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[BooleanValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickRound")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickSize")
    @js.native
    def tickSize: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def tickSize_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.tickWidth")
    @js.native
    def tickWidth: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          js.UndefOr[
            (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
          ]
        ]
      ] = js.native
    @scala.inline
    def tickWidth_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            js.UndefOr[
              (Exclude[js.UndefOr[NumberValue], ScaledValueRef[js.Any] | NumericValueRef | ColorValueRef]) | SignalRef | ConditionalAxisNumber[SignalRef]
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.ticks")
    @js.native
    def ticks: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[BooleanValue]]] = js.native
    @scala.inline
    def ticks_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[BooleanValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticks")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.title")
    @js.native
    def title: js.UndefOr[
        js.Function1[
          /* params */ AxisRuleParams, 
          Text | (js.Array[FieldDefBase[String, Bin]]) | SignalRef
        ]
      ] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleAlign")
    @js.native
    def titleAlign: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[AlignValue]]] = js.native
    @scala.inline
    def titleAlign_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[AlignValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAlign")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleAnchor")
    @js.native
    def titleAnchor: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[AnchorValue]]] = js.native
    @scala.inline
    def titleAnchor_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[AnchorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAnchor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleAngle")
    @js.native
    def titleAngle: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleAngle_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleAngle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleBaseline")
    @js.native
    def titleBaseline: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[TextBaselineValue]]] = js.native
    @scala.inline
    def titleBaseline_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[TextBaselineValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleBaseline")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleColor")
    @js.native
    def titleColor: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[ColorValue]]] = js.native
    @scala.inline
    def titleColor_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[ColorValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleColor")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleFont")
    @js.native
    def titleFont: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StringValue]]] = js.native
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleFontSize")
    @js.native
    def titleFontSize: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleFontSize_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontSize")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleFontStyle")
    @js.native
    def titleFontStyle: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[FontStyleValue]]] = js.native
    @scala.inline
    def titleFontStyle_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[FontStyleValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleFontWeight")
    @js.native
    def titleFontWeight: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[FontWeightValue]]] = js.native
    @scala.inline
    def titleFontWeight_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[FontWeightValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFontWeight")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def titleFont_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[StringValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleFont")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleLimit")
    @js.native
    def titleLimit: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleLimit_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLimit")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleLineHeight")
    @js.native
    def titleLineHeight: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleLineHeight_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleLineHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleOpacity")
    @js.native
    def titleOpacity: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleOpacity_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titlePadding")
    @js.native
    def titlePadding: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titlePadding_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titlePadding")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleX")
    @js.native
    def titleX: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleX_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleX")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.titleY")
    @js.native
    def titleY: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def titleY_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def title_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ AxisRuleParams, 
            Text | (js.Array[FieldDefBase[String, Bin]]) | SignalRef
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.translate")
    @js.native
    def translate: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]] = js.native
    @scala.inline
    def translate_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[NumberValue]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translate")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.values")
    @js.native
    def values: js.UndefOr[
        js.Function1[/* params */ AxisRuleParams, js.UndefOr[js.Array[js.Any] | SignalRef]]
      ] = js.native
    @scala.inline
    def values_=(
      x: js.UndefOr[
          js.Function1[/* params */ AxisRuleParams, js.UndefOr[js.Array[js.Any] | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("values")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/compile/axis/properties", "axisRules.zindex")
    @js.native
    def zindex: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double]]] = js.native
    @scala.inline
    def zindex_=(x: js.UndefOr[js.Function1[/* params */ AxisRuleParams, js.UndefOr[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zindex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultGrid")
  @js.native
  def defaultGrid(scaleType: ScaleType, fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Boolean = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultGrid")
  @js.native
  def defaultGrid_binned(scaleType: ScaleType, fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_x(angle: Double, orient: AxisOrient, channel: x): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_x(angle: Double, orient: SignalRef, channel: x): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_x(angle: SignalRef, orient: AxisOrient, channel: x): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_x(angle: SignalRef, orient: SignalRef, channel: x): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_y(angle: Double, orient: AxisOrient, channel: y): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_y(angle: Double, orient: SignalRef, channel: y): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_y(angle: SignalRef, orient: AxisOrient, channel: y): Align | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelAlign")
  @js.native
  def defaultLabelAlign_y(angle: SignalRef, orient: SignalRef, channel: y): Align | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: Double, orient: AxisOrient, channel: x): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: Double, orient: AxisOrient, channel: x, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: Double, orient: SignalRef, channel: x): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: Double, orient: SignalRef, channel: x, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: SignalRef, orient: AxisOrient, channel: x): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: SignalRef, orient: AxisOrient, channel: x, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: SignalRef, orient: SignalRef, channel: x): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_x(angle: SignalRef, orient: SignalRef, channel: x, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: Double, orient: AxisOrient, channel: y): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: Double, orient: AxisOrient, channel: y, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: Double, orient: SignalRef, channel: y): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: Double, orient: SignalRef, channel: y, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: SignalRef, orient: AxisOrient, channel: y): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: SignalRef, orient: AxisOrient, channel: y, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: SignalRef, orient: SignalRef, channel: y): bottom | middle | top | Signal = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelBaseline")
  @js.native
  def defaultLabelBaseline_y(angle: SignalRef, orient: SignalRef, channel: y, alwaysIncludeMiddle: Boolean): bottom | middle | top | Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelFlush")
  @js.native
  def defaultLabelFlush(`type`: Type, channel: PositionScaleChannel): Boolean = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelOverlap")
  @js.native
  def defaultLabelOverlap(`type`: Type, scaleType: ScaleType, hasTimeUnit: Boolean): `true` | greedy = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultLabelOverlap")
  @js.native
  def defaultLabelOverlap(`type`: Type, scaleType: ScaleType, hasTimeUnit: Boolean, sort: Sort[String]): `true` | greedy = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultOrient")
  @js.native
  def defaultOrient(channel: PositionScaleChannel): left | bottom = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultTickCount")
  @js.native
  def defaultTickCount(hasFieldOrDatumDefScaleTypeSizeValues: FieldOrDatumDef): Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultZindex")
  @js.native
  def defaultZindex(mark: Mark, fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): `1` | `0` = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "defaultZindex")
  @js.native
  def defaultZindex_binned(mark: Mark, fieldDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): `1` | `0` = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "getFieldDefTitle")
  @js.native
  def getFieldDefTitle_x(model: UnitModel, channel: x): String | js.Array[String] | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "getFieldDefTitle")
  @js.native
  def getFieldDefTitle_y(model: UnitModel, channel: y): String | js.Array[String] | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "getLabelAngle")
  @js.native
  def getLabelAngle(
    fieldOrDatumDef: PositionDatumDef[String],
    axis: AxisInternal,
    channel: PositionScaleChannel,
    styleConfig: StyleConfigIndex[SignalRef]
  ): Double | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "getLabelAngle")
  @js.native
  def getLabelAngle(
    fieldOrDatumDef: PositionDatumDef[String],
    axis: AxisInternal,
    channel: PositionScaleChannel,
    styleConfig: StyleConfigIndex[SignalRef],
    axisConfigs: AxisConfigs
  ): Double | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "getLabelAngle")
  @js.native
  def getLabelAngle(
    fieldOrDatumDef: PositionFieldDef[String],
    axis: AxisInternal,
    channel: PositionScaleChannel,
    styleConfig: StyleConfigIndex[SignalRef]
  ): Double | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "getLabelAngle")
  @js.native
  def getLabelAngle(
    fieldOrDatumDef: PositionFieldDef[String],
    axis: AxisInternal,
    channel: PositionScaleChannel,
    styleConfig: StyleConfigIndex[SignalRef],
    axisConfigs: AxisConfigs
  ): Double | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "gridScale")
  @js.native
  def gridScale(model: UnitModel, channel: PositionScaleChannel): String = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "normalizeAngleExpr")
  @js.native
  def normalizeAngleExpr(angle: SignalRef): String = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/properties", "values")
  @js.native
  def values(
    axis: AxisInternal,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]
  ): SignalRef | (js.Array[String | Double | Boolean | DateTime | Signal]) = js.native
  @JSImport("vega-lite/build/src/compile/axis/properties", "values")
  @js.native
  def values_binned(axis: AxisInternal, fieldOrDatumDef: TypedFieldDef[String, _, Boolean | BinParams | binned | Null]): SignalRef | (js.Array[String | Double | Boolean | DateTime | Signal]) = js.native
  
  @js.native
  trait AxisRuleParams extends StObject {
    
    var axis: AxisInternal = js.native
    
    var channel: PositionScaleChannel = js.native
    
    var config: Config[ExprRef | SignalRef] = js.native
    
    var fieldOrDatumDef: PositionFieldDef[String] | PositionDatumDef[String] = js.native
    
    var labelAngle: Double | SignalRef = js.native
    
    var mark: Mark = js.native
    
    var model: UnitModel = js.native
    
    var orient: Orient | SignalRef = js.native
    
    var scaleType: ScaleType = js.native
  }
  object AxisRuleParams {
    
    @scala.inline
    def apply(
      axis: AxisInternal,
      channel: PositionScaleChannel,
      config: Config[ExprRef | SignalRef],
      fieldOrDatumDef: PositionFieldDef[String] | PositionDatumDef[String],
      labelAngle: Double | SignalRef,
      mark: Mark,
      model: UnitModel,
      orient: Orient | SignalRef,
      scaleType: ScaleType
    ): AxisRuleParams = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], labelAngle = labelAngle.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisRuleParams]
    }
    
    @scala.inline
    implicit class AxisRuleParamsMutableBuilder[Self <: AxisRuleParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: AxisInternal): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel(value: PositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldOrDatumDef(value: PositionFieldDef[String] | PositionDatumDef[String]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAngle(value: Double | SignalRef): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMark(value: Mark): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: UnitModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrient(value: Orient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleType(value: ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    }
  }
}
