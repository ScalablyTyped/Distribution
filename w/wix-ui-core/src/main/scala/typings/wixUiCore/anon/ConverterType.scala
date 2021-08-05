package typings.wixUiCore.anon

import typings.wixUiCore.addressInputAddressInputMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterType extends StObject {
  
  var converterType: Converter
  
  var handler: typings.wixUiCore.typesMod.Handler
  
  var lang: String
  
  var throttleInterval: Double
}
object ConverterType {
  
  inline def apply(
    converterType: Converter,
    handler: typings.wixUiCore.typesMod.Handler,
    lang: String,
    throttleInterval: Double
  ): ConverterType = {
    val __obj = js.Dynamic.literal(converterType = converterType.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], throttleInterval = throttleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterType]
  }
  
  extension [Self <: ConverterType](x: Self) {
    
    inline def setConverterType(value: Converter): Self = StObject.set(x, "converterType", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: typings.wixUiCore.typesMod.Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setThrottleInterval(value: Double): Self = StObject.set(x, "throttleInterval", value.asInstanceOf[js.Any])
  }
}
