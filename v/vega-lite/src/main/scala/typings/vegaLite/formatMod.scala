package typings.vegaLite

import typings.vegaLite.anon.Expr
import typings.vegaLite.anon.IsUTCScale
import typings.vegaLite.anon.NormalizeStack
import typings.vegaLite.anon.OmitTimeFormatConfig
import typings.vegaLite.anon.Signal
import typings.vegaLite.anon.SpecifiedFormat
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.FieldDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
import typings.vegaLite.vegaLiteStrings.utc
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("vega-lite/build/src/compile/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/format", "BIN_RANGE_DELIMITER")
  @js.native
  val BIN_RANGE_DELIMITER: /* " \\u2013 " */ String = js.native
  
  inline def binFormatExpression(
    startField: String,
    endField: String,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("binFormatExpression")(startField.asInstanceOf[js.Any], endField.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def binFormatExpression(
    startField: String,
    endField: String,
    format: Dict[Any],
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("binFormatExpression")(startField.asInstanceOf[js.Any], endField.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatCustomType(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField: NormalizeStack): Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCustomType")(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField.asInstanceOf[js.Any]).asInstanceOf[Signal]
  
  inline def formatSignalRef(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig: Expr): Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSignalRef")(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig.asInstanceOf[js.Any]).asInstanceOf[Signal]
  
  inline def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  inline def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: Dict[Any],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  inline def guideFormat(
    fieldOrDatumDef: FieldDef[String, Any],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  inline def guideFormat(
    fieldOrDatumDef: FieldDef[String, Any],
    `type`: Type,
    format: Dict[Any],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  
  inline def guideFormatType(
    formatType: String,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef | utc = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef | utc]
  inline def guideFormatType(formatType: String, fieldOrDatumDef: FieldDef[String, Any], scaleType: ScaleType): time | number | SignalRef | utc = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef | utc]
  inline def guideFormatType(
    formatType: SignalRef,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef | utc = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef | utc]
  inline def guideFormatType(formatType: SignalRef, fieldOrDatumDef: FieldDef[String, Any], scaleType: ScaleType): time | number | SignalRef | utc = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef | utc]
  
  inline def isCustomFormatType(formatType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomFormatType")(formatType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def numberFormat(hasTypeSpecifiedFormatConfigNormalizeStack: SpecifiedFormat): String = ^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(hasTypeSpecifiedFormatConfigNormalizeStack.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def timeFormat(hasSpecifiedFormatTimeUnitConfigOmitTimeFormatConfig: OmitTimeFormatConfig): String | Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormat")(hasSpecifiedFormatTimeUnitConfigOmitTimeFormatConfig.asInstanceOf[js.Any]).asInstanceOf[String | Signal]
  
  inline def timeFormatExpression(hasFieldTimeUnitFormatFormatTypeRawTimeFormatIsUTCScale: IsUTCScale): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatExpression")(hasFieldTimeUnitFormatFormatTypeRawTimeFormatIsUTCScale.asInstanceOf[js.Any]).asInstanceOf[String]
}
