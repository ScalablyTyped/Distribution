package typings.vegaLite.anon

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaLite.utilMod.Dict
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecifiedFormat extends StObject {
  
  var config: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]
  
  var normalizeStack: js.UndefOr[Boolean] = js.undefined
  
  var specifiedFormat: js.UndefOr[String | Dict[Any]] = js.undefined
  
  var `type`: Type
}
object SpecifiedFormat {
  
  inline def apply(config: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef], `type`: Type): SpecifiedFormat = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecifiedFormat]
  }
  
  extension [Self <: SpecifiedFormat](x: Self) {
    
    inline def setConfig(value: typings.vegaLite.srcConfigMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStack(value: Boolean): Self = StObject.set(x, "normalizeStack", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStackUndefined: Self = StObject.set(x, "normalizeStack", js.undefined)
    
    inline def setSpecifiedFormat(value: String | Dict[Any]): Self = StObject.set(x, "specifiedFormat", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedFormatUndefined: Self = StObject.set(x, "specifiedFormat", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
