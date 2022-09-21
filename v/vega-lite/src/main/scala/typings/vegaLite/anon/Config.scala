package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.DatumDef
import typings.vegaLite.channeldefMod.PrimitiveValue
import typings.vegaLite.channeldefMod.SecondaryChannelDef
import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typings.vegaLite.srcConfigMod.Config[SignalRef]
  
  var fieldDef: (typings.vegaLite.channeldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var fieldDef2: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
  
  var markDef: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, SignalRef]
}
object Config {
  
  inline def apply(
    config: typings.vegaLite.srcConfigMod.Config[SignalRef],
    fieldDef: (typings.vegaLite.channeldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    markDef: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, SignalRef]
  ): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typings.vegaLite.srcConfigMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(
      value: (typings.vegaLite.channeldefMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2(value: SecondaryChannelDef[String]): Self = StObject.set(x, "fieldDef2", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2Undefined: Self = StObject.set(x, "fieldDef2", js.undefined)
    
    inline def setMarkDef(value: typings.vegaLite.srcMarkMod.MarkDef[typings.vegaLite.srcMarkMod.Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
  }
}
