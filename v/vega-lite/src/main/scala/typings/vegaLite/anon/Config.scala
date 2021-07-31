package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.parent
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]
  
  var expr: js.UndefOr[datum | parent | datumDotdatum] = js.undefined
  
  var fieldOrDatumDef: (typings.vegaLite.channeldefMod.FieldDef[String, js.Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var format: String | Dict[js.Any]
  
  var formatType: String
  
  var normalizeStack: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  @scala.inline
  def apply(
    config: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef],
    fieldOrDatumDef: (typings.vegaLite.channeldefMod.FieldDef[String, js.Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    format: String | Dict[js.Any],
    formatType: String
  ): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpr(value: datum | parent | datumDotdatum): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setFieldOrDatumDef(
      value: (typings.vegaLite.channeldefMod.FieldDef[String, js.Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String | Dict[js.Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeStack(value: Boolean): Self = StObject.set(x, "normalizeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizeStackUndefined: Self = StObject.set(x, "normalizeStack", js.undefined)
  }
}
