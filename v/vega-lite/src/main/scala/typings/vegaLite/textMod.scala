package typings.vegaLite

import typings.vegaLite.anon.PartialRecordVgEncodeChan
import typings.vegaLite.channeldefMod.StringFieldDef
import typings.vegaLite.channeldefMod.StringFieldDefWithCondition
import typings.vegaLite.channeldefMod.StringValueDefWithCondition
import typings.vegaLite.channeldefMod.TextDef
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.srcTypeMod.StandardType
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.description
import typings.vegaLite.vegaLiteStrings.href
import typings.vegaLite.vegaLiteStrings.url
import typings.vegaLite.vegaSchemaMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def text(model: UnitModel): PartialRecordVgEncodeChan = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan]
  inline def text(model: UnitModel, channel: typings.vegaLite.vegaLiteStrings.text | href | url | description): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  inline def textRef(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: js.Array[StringFieldDef[String]],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Null, config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Unit, config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Unit, config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: StringFieldDefWithCondition[String],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: StringValueDefWithCondition[String, StandardType], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: TextDef[String], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: TextDef[String], config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
}
