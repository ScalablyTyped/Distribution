package typings.vegaLite

import typings.vegaLite.anon.Expr
import typings.vegaLite.anon.Signal
import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.FieldDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.scaleMod.ScaleType
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcTimeunitMod.TimeUnit
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.number
import typings.vegaLite.vegaLiteStrings.time
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
  
  @scala.inline
  def binFormatExpression(
    startField: String,
    endField: String,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("binFormatExpression")(startField.asInstanceOf[js.Any], endField.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def binFormatExpression(
    startField: String,
    endField: String,
    format: Dict[js.Any],
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("binFormatExpression")(startField.asInstanceOf[js.Any], endField.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def formatCustomType(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField: Expr): Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCustomType")(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField.asInstanceOf[js.Any]).asInstanceOf[Signal]
  
  @scala.inline
  def formatSignalRef(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig: typings.vegaLite.anon.Config): Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSignalRef")(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig.asInstanceOf[js.Any]).asInstanceOf[Signal]
  
  @scala.inline
  def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  @scala.inline
  def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: Dict[js.Any],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  @scala.inline
  def guideFormat(
    fieldOrDatumDef: FieldDef[String, js.Any],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  @scala.inline
  def guideFormat(
    fieldOrDatumDef: FieldDef[String, js.Any],
    `type`: Type,
    format: Dict[js.Any],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  
  @scala.inline
  def guideFormatType(
    formatType: String,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  @scala.inline
  def guideFormatType(formatType: String, fieldOrDatumDef: FieldDef[String, js.Any], scaleType: ScaleType): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  @scala.inline
  def guideFormatType(
    formatType: SignalRef,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  @scala.inline
  def guideFormatType(formatType: SignalRef, fieldOrDatumDef: FieldDef[String, js.Any], scaleType: ScaleType): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  
  @scala.inline
  def isCustomFormatType(formatType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomFormatType")(formatType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def numberFormat(`type`: Type, specifiedFormat: String, config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(`type`.asInstanceOf[js.Any], specifiedFormat.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def numberFormat(`type`: Type, specifiedFormat: Dict[js.Any], config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(`type`.asInstanceOf[js.Any], specifiedFormat.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def timeFormat(
    specifiedFormat: String,
    timeUnit: TimeUnit,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormat")(specifiedFormat.asInstanceOf[js.Any], timeUnit.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  
  @scala.inline
  def timeFormatExpression(
    field: String,
    timeUnit: TimeUnit,
    format: String,
    rawTimeFormat: String,
    // should be provided only for actual text and headers, not axis/legend labels
  isUTCScale: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatExpression")(field.asInstanceOf[js.Any], timeUnit.asInstanceOf[js.Any], format.asInstanceOf[js.Any], rawTimeFormat.asInstanceOf[js.Any], isUTCScale.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def timeFormatExpression(
    field: String,
    timeUnit: TimeUnit,
    format: Dict[js.Any],
    rawTimeFormat: String,
    // should be provided only for actual text and headers, not axis/legend labels
  isUTCScale: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatExpression")(field.asInstanceOf[js.Any], timeUnit.asInstanceOf[js.Any], format.asInstanceOf[js.Any], rawTimeFormat.asInstanceOf[js.Any], isUTCScale.asInstanceOf[js.Any])).asInstanceOf[String]
}
