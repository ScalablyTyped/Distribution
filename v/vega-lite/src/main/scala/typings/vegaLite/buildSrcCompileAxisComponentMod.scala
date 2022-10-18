package typings.vegaLite

import typings.vegaLite.anon.PartialAxisComponentProps
import typings.vegaLite.buildSrcAxisMod.AxisInternal
import typings.vegaLite.buildSrcAxisMod.AxisPart
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisColor
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisLabelAlign
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisLabelBaseline
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisLabelFontStyle
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisLabelFontWeight
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisNumber
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisNumberArray
import typings.vegaLite.buildSrcAxisMod.ConditionalAxisString
import typings.vegaLite.buildSrcBinMod.Bin
import typings.vegaLite.buildSrcChanneldefMod.FieldDefBase
import typings.vegaLite.buildSrcCompileSplitMod.Split
import typings.vegaLite.vegaLiteStrings.center
import typings.vegaLite.vegaLiteStrings.extent
import typings.vegaTypings.typesSpecAxisMod.AxisEncode
import typings.vegaTypings.typesSpecAxisMod.AxisOrient
import typings.vegaTypings.typesSpecAxisMod.FormatType
import typings.vegaTypings.typesSpecAxisMod.LabelOverlap
import typings.vegaTypings.typesSpecAxisMod.TickCount
import typings.vegaTypings.typesSpecAxisMod.TimeFormatSpecifier
import typings.vegaTypings.typesSpecEncodeMod.Text
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecValuesMod.AlignValue
import typings.vegaTypings.typesSpecValuesMod.AnchorValue
import typings.vegaTypings.typesSpecValuesMod.BooleanValue
import typings.vegaTypings.typesSpecValuesMod.ColorValue
import typings.vegaTypings.typesSpecValuesMod.DashArrayValue
import typings.vegaTypings.typesSpecValuesMod.FontStyleValue
import typings.vegaTypings.typesSpecValuesMod.FontWeightValue
import typings.vegaTypings.typesSpecValuesMod.NumberValue
import typings.vegaTypings.typesSpecValuesMod.StringValue
import typings.vegaTypings.typesSpecValuesMod.StrokeCapValue
import typings.vegaTypings.typesSpecValuesMod.TextBaselineValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileAxisComponentMod {
  
  @JSImport("vega-lite/build/src/compile/axis/component", "AXIS_COMPONENT_PROPERTIES")
  @js.native
  val AXIS_COMPONENT_PROPERTIES: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 81, starting with typings.vegaLite.vegaLiteStrings.values, typings.vegaLite.vegaLiteStrings.description, typings.vegaLite.vegaLiteStrings.offset */ Any
  ] = js.native
  
  @JSImport("vega-lite/build/src/compile/axis/component", "AxisComponent")
  @js.native
  open class AxisComponent () extends Split[AxisComponentProps] {
    def this(explicit: PartialAxisComponentProps) = this()
    def this(explicit: Unit, `implicit`: PartialAxisComponentProps) = this()
    def this(explicit: PartialAxisComponentProps, `implicit`: PartialAxisComponentProps) = this()
    def this(explicit: Unit, `implicit`: Unit, mainExtracted: Boolean) = this()
    def this(explicit: Unit, `implicit`: PartialAxisComponentProps, mainExtracted: Boolean) = this()
    def this(explicit: PartialAxisComponentProps, `implicit`: Unit, mainExtracted: Boolean) = this()
    def this(explicit: PartialAxisComponentProps, `implicit`: PartialAxisComponentProps, mainExtracted: Boolean) = this()
    
    @JSName("explicit")
    val explicit_AxisComponent: PartialAxisComponentProps = js.native
    
    def hasAxisPart(part: AxisPart): Boolean = js.native
    
    def hasOrientSignalRef(): Boolean = js.native
    
    @JSName("implicit")
    val implicit_AxisComponent: PartialAxisComponentProps = js.native
    
    var mainExtracted: Boolean = js.native
  }
  
  trait AxisComponentIndex extends StObject {
    
    var x: js.UndefOr[js.Array[AxisComponent]] = js.undefined
    
    var y: js.UndefOr[js.Array[AxisComponent]] = js.undefined
  }
  object AxisComponentIndex {
    
    inline def apply(): AxisComponentIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisComponentIndex]
    }
    
    extension [Self <: AxisComponentIndex](x: Self) {
      
      inline def setX(value: js.Array[AxisComponent]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXVarargs(value: AxisComponent*): Self = StObject.set(x, "x", js.Array(value*))
      
      inline def setY(value: js.Array[AxisComponent]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setYVarargs(value: AxisComponent*): Self = StObject.set(x, "y", js.Array(value*))
    }
  }
  
  /* Inlined std.Omit<vega.vega.Axis, 'title' | vega-lite.vega-lite/build/src/axis.ConditionalAxisProp> & std.Omit<vega-lite.vega-lite/build/src/axis.AxisPropsWithCondition<vega.vega.SignalRef>, 'title'> & {  title :vega.vega.Text | std.Array<vega-lite.vega-lite/build/src/channeldef.FieldDefBase<string, vega-lite.vega-lite/build/src/bin.Bin>> | vega.vega.SignalRef,   labelExpr :string,   disable :boolean} */
  trait AxisComponentProps extends StObject {
    
    var aria: js.UndefOr[Boolean] = js.undefined
    
    var bandPosition: js.UndefOr[NumberValue] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var disable: Boolean
    
    var domain: js.UndefOr[Boolean] = js.undefined
    
    var domainCap: js.UndefOr[StrokeCapValue] = js.undefined
    
    var domainColor: js.UndefOr[ColorValue] = js.undefined
    
    var domainDash: js.UndefOr[DashArrayValue] = js.undefined
    
    var domainDashOffset: js.UndefOr[NumberValue] = js.undefined
    
    var domainOpacity: js.UndefOr[NumberValue] = js.undefined
    
    var domainWidth: js.UndefOr[NumberValue] = js.undefined
    
    var encode: js.UndefOr[AxisEncode] = js.undefined
    
    var format: js.UndefOr[String | TimeFormatSpecifier | SignalRef] = js.undefined
    
    var formatType: js.UndefOr[FormatType | SignalRef] = js.undefined
    
    var grid: js.UndefOr[Boolean] = js.undefined
    
    var gridCap: js.UndefOr[StrokeCapValue] = js.undefined
    
    var gridColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[SignalRef]
      ] = js.undefined
    
    var gridDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[SignalRef]
      ] = js.undefined
    
    var gridDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var gridOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var gridScale: js.UndefOr[String] = js.undefined
    
    var gridWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var labelAlign: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[SignalRef]
      ] = js.undefined
    
    var labelAngle: js.UndefOr[NumberValue] = js.undefined
    
    var labelBaseline: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[SignalRef]
      ] = js.undefined
    
    var labelBound: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
    
    var labelColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[SignalRef]
      ] = js.undefined
    
    var labelExpr: String
    
    var labelFlush: js.UndefOr[Double | Boolean | SignalRef] = js.undefined
    
    var labelFlushOffset: js.UndefOr[Double | SignalRef] = js.undefined
    
    var labelFont: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[SignalRef]
      ] = js.undefined
    
    var labelFontSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var labelFontStyle: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[SignalRef]
      ] = js.undefined
    
    var labelFontWeight: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[SignalRef]
      ] = js.undefined
    
    var labelLimit: js.UndefOr[NumberValue] = js.undefined
    
    var labelLineHeight: js.UndefOr[NumberValue] & (js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ])
    
    var labelOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var labelOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var labelOverlap: js.UndefOr[LabelOverlap | SignalRef] = js.undefined
    
    var labelPadding: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var labelSeparation: js.UndefOr[Double | SignalRef] = js.undefined
    
    var labels: js.UndefOr[Boolean] = js.undefined
    
    var maxExtent: js.UndefOr[NumberValue] = js.undefined
    
    var minExtent: js.UndefOr[NumberValue] = js.undefined
    
    var offset: js.UndefOr[NumberValue] = js.undefined
    
    var orient: AxisOrient | SignalRef
    
    var position: js.UndefOr[NumberValue] = js.undefined
    
    var scale: String
    
    var tickBand: js.UndefOr[center | extent | SignalRef] = js.undefined
    
    var tickCap: js.UndefOr[StrokeCapValue] = js.undefined
    
    var tickColor: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[SignalRef]
      ] = js.undefined
    
    var tickCount: js.UndefOr[TickCount] = js.undefined
    
    var tickDash: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[SignalRef]
      ] = js.undefined
    
    var tickDashOffset: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var tickExtra: js.UndefOr[BooleanValue] = js.undefined
    
    var tickMinStep: js.UndefOr[Double | SignalRef] = js.undefined
    
    var tickOffset: js.UndefOr[NumberValue] = js.undefined
    
    var tickOpacity: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var tickRound: js.UndefOr[BooleanValue] = js.undefined
    
    var tickSize: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var tickWidth: js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ] = js.undefined
    
    var ticks: js.UndefOr[BooleanValue] = js.undefined
    
    var title: Text | (js.Array[FieldDefBase[String, Bin]]) | SignalRef
    
    var titleAlign: js.UndefOr[AlignValue] = js.undefined
    
    var titleAnchor: js.UndefOr[AnchorValue] = js.undefined
    
    var titleAngle: js.UndefOr[NumberValue] = js.undefined
    
    var titleBaseline: js.UndefOr[TextBaselineValue] = js.undefined
    
    var titleColor: js.UndefOr[ColorValue] = js.undefined
    
    var titleFont: js.UndefOr[StringValue] = js.undefined
    
    var titleFontSize: js.UndefOr[NumberValue] = js.undefined
    
    var titleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
    
    var titleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
    
    var titleLimit: js.UndefOr[NumberValue] = js.undefined
    
    var titleLineHeight: js.UndefOr[NumberValue] = js.undefined
    
    var titleOpacity: js.UndefOr[NumberValue] = js.undefined
    
    var titlePadding: js.UndefOr[NumberValue] = js.undefined
    
    var titleX: js.UndefOr[NumberValue] = js.undefined
    
    var titleY: js.UndefOr[NumberValue] = js.undefined
    
    var translate: js.UndefOr[NumberValue] = js.undefined
    
    var values: js.UndefOr[js.Array[Any] | SignalRef] = js.undefined
    
    var zindex: js.UndefOr[Double] = js.undefined
  }
  object AxisComponentProps {
    
    inline def apply(
      disable: Boolean,
      labelExpr: String,
      labelLineHeight: js.UndefOr[NumberValue] & (js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
        ]),
      orient: AxisOrient | SignalRef,
      scale: String,
      title: Text | (js.Array[FieldDefBase[String, Bin]]) | SignalRef
    ): AxisComponentProps = {
      val __obj = js.Dynamic.literal(disable = disable.asInstanceOf[js.Any], labelExpr = labelExpr.asInstanceOf[js.Any], labelLineHeight = labelLineHeight.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AxisComponentProps]
    }
    
    extension [Self <: AxisComponentProps](x: Self) {
      
      inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      inline def setBandPosition(value: NumberValue): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
      
      inline def setBandPositionUndefined: Self = StObject.set(x, "bandPosition", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: Boolean): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainCap(value: StrokeCapValue): Self = StObject.set(x, "domainCap", value.asInstanceOf[js.Any])
      
      inline def setDomainCapUndefined: Self = StObject.set(x, "domainCap", js.undefined)
      
      inline def setDomainColor(value: ColorValue): Self = StObject.set(x, "domainColor", value.asInstanceOf[js.Any])
      
      inline def setDomainColorNull: Self = StObject.set(x, "domainColor", null)
      
      inline def setDomainColorUndefined: Self = StObject.set(x, "domainColor", js.undefined)
      
      inline def setDomainDash(value: DashArrayValue): Self = StObject.set(x, "domainDash", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffset(value: NumberValue): Self = StObject.set(x, "domainDashOffset", value.asInstanceOf[js.Any])
      
      inline def setDomainDashOffsetUndefined: Self = StObject.set(x, "domainDashOffset", js.undefined)
      
      inline def setDomainDashUndefined: Self = StObject.set(x, "domainDash", js.undefined)
      
      inline def setDomainDashVarargs(value: Double*): Self = StObject.set(x, "domainDash", js.Array(value*))
      
      inline def setDomainOpacity(value: NumberValue): Self = StObject.set(x, "domainOpacity", value.asInstanceOf[js.Any])
      
      inline def setDomainOpacityUndefined: Self = StObject.set(x, "domainOpacity", js.undefined)
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainWidth(value: NumberValue): Self = StObject.set(x, "domainWidth", value.asInstanceOf[js.Any])
      
      inline def setDomainWidthUndefined: Self = StObject.set(x, "domainWidth", js.undefined)
      
      inline def setEncode(value: AxisEncode): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setFormat(value: String | TimeFormatSpecifier | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatType(value: FormatType | SignalRef): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
      
      inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridCap(value: StrokeCapValue): Self = StObject.set(x, "gridCap", value.asInstanceOf[js.Any])
      
      inline def setGridCapUndefined: Self = StObject.set(x, "gridCap", js.undefined)
      
      inline def setGridColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[SignalRef]
      ): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridColorUndefined: Self = StObject.set(x, "gridColor", js.undefined)
      
      inline def setGridDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[SignalRef]
      ): Self = StObject.set(x, "gridDash", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "gridDashOffset", value.asInstanceOf[js.Any])
      
      inline def setGridDashOffsetUndefined: Self = StObject.set(x, "gridDashOffset", js.undefined)
      
      inline def setGridDashUndefined: Self = StObject.set(x, "gridDash", js.undefined)
      
      inline def setGridOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "gridOpacity", value.asInstanceOf[js.Any])
      
      inline def setGridOpacityUndefined: Self = StObject.set(x, "gridOpacity", js.undefined)
      
      inline def setGridScale(value: String): Self = StObject.set(x, "gridScale", value.asInstanceOf[js.Any])
      
      inline def setGridScaleUndefined: Self = StObject.set(x, "gridScale", js.undefined)
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      inline def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      inline def setLabelAlign(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.AlignValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.AlignValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelAlign[SignalRef]
      ): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelAngle(value: NumberValue): Self = StObject.set(x, "labelAngle", value.asInstanceOf[js.Any])
      
      inline def setLabelAngleUndefined: Self = StObject.set(x, "labelAngle", js.undefined)
      
      inline def setLabelBaseline(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.TextBaselineValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelBaseline[SignalRef]
      ): Self = StObject.set(x, "labelBaseline", value.asInstanceOf[js.Any])
      
      inline def setLabelBaselineUndefined: Self = StObject.set(x, "labelBaseline", js.undefined)
      
      inline def setLabelBound(value: Double | Boolean | SignalRef): Self = StObject.set(x, "labelBound", value.asInstanceOf[js.Any])
      
      inline def setLabelBoundUndefined: Self = StObject.set(x, "labelBound", js.undefined)
      
      inline def setLabelColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[SignalRef]
      ): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
      
      inline def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelFlush(value: Double | Boolean | SignalRef): Self = StObject.set(x, "labelFlush", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffset(value: Double | SignalRef): Self = StObject.set(x, "labelFlushOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelFlushOffsetUndefined: Self = StObject.set(x, "labelFlushOffset", js.undefined)
      
      inline def setLabelFlushUndefined: Self = StObject.set(x, "labelFlush", js.undefined)
      
      inline def setLabelFont(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.StringValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.StringValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisString[SignalRef]
      ): Self = StObject.set(x, "labelFont", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
      
      inline def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
      
      inline def setLabelFontStyle(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.FontStyleValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontStyle[SignalRef]
      ): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
      
      inline def setLabelFontUndefined: Self = StObject.set(x, "labelFont", js.undefined)
      
      inline def setLabelFontWeight(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.FontWeightValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisLabelFontWeight[SignalRef]
      ): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
      
      inline def setLabelLimit(value: NumberValue): Self = StObject.set(x, "labelLimit", value.asInstanceOf[js.Any])
      
      inline def setLabelLimitUndefined: Self = StObject.set(x, "labelLimit", js.undefined)
      
      inline def setLabelLineHeight(
        value: js.UndefOr[NumberValue] & (js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
            ])
      ): Self = StObject.set(x, "labelLineHeight", value.asInstanceOf[js.Any])
      
      inline def setLabelOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "labelOffset", value.asInstanceOf[js.Any])
      
      inline def setLabelOffsetUndefined: Self = StObject.set(x, "labelOffset", js.undefined)
      
      inline def setLabelOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "labelOpacity", value.asInstanceOf[js.Any])
      
      inline def setLabelOpacityUndefined: Self = StObject.set(x, "labelOpacity", js.undefined)
      
      inline def setLabelOverlap(value: LabelOverlap | SignalRef): Self = StObject.set(x, "labelOverlap", value.asInstanceOf[js.Any])
      
      inline def setLabelOverlapUndefined: Self = StObject.set(x, "labelOverlap", js.undefined)
      
      inline def setLabelPadding(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "labelPadding", value.asInstanceOf[js.Any])
      
      inline def setLabelPaddingUndefined: Self = StObject.set(x, "labelPadding", js.undefined)
      
      inline def setLabelSeparation(value: Double | SignalRef): Self = StObject.set(x, "labelSeparation", value.asInstanceOf[js.Any])
      
      inline def setLabelSeparationUndefined: Self = StObject.set(x, "labelSeparation", js.undefined)
      
      inline def setLabels(value: Boolean): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMaxExtent(value: NumberValue): Self = StObject.set(x, "maxExtent", value.asInstanceOf[js.Any])
      
      inline def setMaxExtentUndefined: Self = StObject.set(x, "maxExtent", js.undefined)
      
      inline def setMinExtent(value: NumberValue): Self = StObject.set(x, "minExtent", value.asInstanceOf[js.Any])
      
      inline def setMinExtentUndefined: Self = StObject.set(x, "minExtent", js.undefined)
      
      inline def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrient(value: AxisOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: NumberValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTickBand(value: center | extent | SignalRef): Self = StObject.set(x, "tickBand", value.asInstanceOf[js.Any])
      
      inline def setTickBandUndefined: Self = StObject.set(x, "tickBand", js.undefined)
      
      inline def setTickCap(value: StrokeCapValue): Self = StObject.set(x, "tickCap", value.asInstanceOf[js.Any])
      
      inline def setTickCapUndefined: Self = StObject.set(x, "tickCap", js.undefined)
      
      inline def setTickColor(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.ColorValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.ColorValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisColor[SignalRef]
      ): Self = StObject.set(x, "tickColor", value.asInstanceOf[js.Any])
      
      inline def setTickColorUndefined: Self = StObject.set(x, "tickColor", js.undefined)
      
      inline def setTickCount(value: TickCount): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
      
      inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
      
      inline def setTickDash(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.DashArrayValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumberArray[SignalRef]
      ): Self = StObject.set(x, "tickDash", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffset(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "tickDashOffset", value.asInstanceOf[js.Any])
      
      inline def setTickDashOffsetUndefined: Self = StObject.set(x, "tickDashOffset", js.undefined)
      
      inline def setTickDashUndefined: Self = StObject.set(x, "tickDash", js.undefined)
      
      inline def setTickExtra(value: BooleanValue): Self = StObject.set(x, "tickExtra", value.asInstanceOf[js.Any])
      
      inline def setTickExtraUndefined: Self = StObject.set(x, "tickExtra", js.undefined)
      
      inline def setTickMinStep(value: Double | SignalRef): Self = StObject.set(x, "tickMinStep", value.asInstanceOf[js.Any])
      
      inline def setTickMinStepUndefined: Self = StObject.set(x, "tickMinStep", js.undefined)
      
      inline def setTickOffset(value: NumberValue): Self = StObject.set(x, "tickOffset", value.asInstanceOf[js.Any])
      
      inline def setTickOffsetUndefined: Self = StObject.set(x, "tickOffset", js.undefined)
      
      inline def setTickOpacity(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "tickOpacity", value.asInstanceOf[js.Any])
      
      inline def setTickOpacityUndefined: Self = StObject.set(x, "tickOpacity", js.undefined)
      
      inline def setTickRound(value: BooleanValue): Self = StObject.set(x, "tickRound", value.asInstanceOf[js.Any])
      
      inline def setTickRoundUndefined: Self = StObject.set(x, "tickRound", js.undefined)
      
      inline def setTickSize(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
      
      inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
      
      inline def setTickWidth(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/signal.SignalRef extends vega-typings.vega-typings/types/spec/values.NumberValue | undefined ? std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> | vega-typings.vega-typings/types/spec/signal.SignalRef : std.Exclude<vega-typings.vega-typings/types/spec/values.NumberValue | undefined, vega-typings.vega-typings/types/spec/encode.ScaledValueRef<any> | vega-typings.vega-typings/types/spec/encode.NumericValueRef | vega-typings.vega-typings/types/spec/encode.ColorValueRef> */ js.Any) | ConditionalAxisNumber[SignalRef]
      ): Self = StObject.set(x, "tickWidth", value.asInstanceOf[js.Any])
      
      inline def setTickWidthUndefined: Self = StObject.set(x, "tickWidth", js.undefined)
      
      inline def setTicks(value: BooleanValue): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
      
      inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
      
      inline def setTitle(value: Text | (js.Array[FieldDefBase[String, Bin]]) | SignalRef): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlign(value: AlignValue): Self = StObject.set(x, "titleAlign", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignUndefined: Self = StObject.set(x, "titleAlign", js.undefined)
      
      inline def setTitleAnchor(value: AnchorValue): Self = StObject.set(x, "titleAnchor", value.asInstanceOf[js.Any])
      
      inline def setTitleAnchorNull: Self = StObject.set(x, "titleAnchor", null)
      
      inline def setTitleAnchorUndefined: Self = StObject.set(x, "titleAnchor", js.undefined)
      
      inline def setTitleAngle(value: NumberValue): Self = StObject.set(x, "titleAngle", value.asInstanceOf[js.Any])
      
      inline def setTitleAngleUndefined: Self = StObject.set(x, "titleAngle", js.undefined)
      
      inline def setTitleBaseline(value: TextBaselineValue): Self = StObject.set(x, "titleBaseline", value.asInstanceOf[js.Any])
      
      inline def setTitleBaselineUndefined: Self = StObject.set(x, "titleBaseline", js.undefined)
      
      inline def setTitleColor(value: ColorValue): Self = StObject.set(x, "titleColor", value.asInstanceOf[js.Any])
      
      inline def setTitleColorNull: Self = StObject.set(x, "titleColor", null)
      
      inline def setTitleColorUndefined: Self = StObject.set(x, "titleColor", js.undefined)
      
      inline def setTitleFont(value: StringValue): Self = StObject.set(x, "titleFont", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSize(value: NumberValue): Self = StObject.set(x, "titleFontSize", value.asInstanceOf[js.Any])
      
      inline def setTitleFontSizeUndefined: Self = StObject.set(x, "titleFontSize", js.undefined)
      
      inline def setTitleFontStyle(value: FontStyleValue): Self = StObject.set(x, "titleFontStyle", value.asInstanceOf[js.Any])
      
      inline def setTitleFontStyleUndefined: Self = StObject.set(x, "titleFontStyle", js.undefined)
      
      inline def setTitleFontUndefined: Self = StObject.set(x, "titleFont", js.undefined)
      
      inline def setTitleFontWeight(value: FontWeightValue): Self = StObject.set(x, "titleFontWeight", value.asInstanceOf[js.Any])
      
      inline def setTitleFontWeightUndefined: Self = StObject.set(x, "titleFontWeight", js.undefined)
      
      inline def setTitleLimit(value: NumberValue): Self = StObject.set(x, "titleLimit", value.asInstanceOf[js.Any])
      
      inline def setTitleLimitUndefined: Self = StObject.set(x, "titleLimit", js.undefined)
      
      inline def setTitleLineHeight(value: NumberValue): Self = StObject.set(x, "titleLineHeight", value.asInstanceOf[js.Any])
      
      inline def setTitleLineHeightUndefined: Self = StObject.set(x, "titleLineHeight", js.undefined)
      
      inline def setTitleOpacity(value: NumberValue): Self = StObject.set(x, "titleOpacity", value.asInstanceOf[js.Any])
      
      inline def setTitleOpacityUndefined: Self = StObject.set(x, "titleOpacity", js.undefined)
      
      inline def setTitlePadding(value: NumberValue): Self = StObject.set(x, "titlePadding", value.asInstanceOf[js.Any])
      
      inline def setTitlePaddingUndefined: Self = StObject.set(x, "titlePadding", js.undefined)
      
      inline def setTitleVarargs(value: ((FieldDefBase[String, Bin]) | String)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleX(value: NumberValue): Self = StObject.set(x, "titleX", value.asInstanceOf[js.Any])
      
      inline def setTitleXUndefined: Self = StObject.set(x, "titleX", js.undefined)
      
      inline def setTitleY(value: NumberValue): Self = StObject.set(x, "titleY", value.asInstanceOf[js.Any])
      
      inline def setTitleYUndefined: Self = StObject.set(x, "titleY", js.undefined)
      
      inline def setTranslate(value: NumberValue): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      inline def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      inline def setValues(value: js.Array[Any] | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
      
      inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
    }
  }
  
  trait AxisInternalIndex extends StObject {
    
    var x: js.UndefOr[AxisInternal] = js.undefined
    
    var y: js.UndefOr[AxisInternal] = js.undefined
  }
  object AxisInternalIndex {
    
    inline def apply(): AxisInternalIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisInternalIndex]
    }
    
    extension [Self <: AxisInternalIndex](x: Self) {
      
      inline def setX(value: AxisInternal): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: AxisInternal): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
