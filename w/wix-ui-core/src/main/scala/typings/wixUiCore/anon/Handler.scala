package typings.wixUiCore.anon

import typings.wixUiCore.componentsAddressInputAddressInputMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handler extends StObject {
  
  var converterType: Converter
  
  var handler: typings.wixUiCore.googleMapsTypesMod.Handler
  
  var lang: String
  
  var throttleInterval: Double
}
object Handler {
  
  inline def apply(
    converterType: Converter,
    handler: typings.wixUiCore.googleMapsTypesMod.Handler,
    lang: String,
    throttleInterval: Double
  ): Handler = {
    val __obj = js.Dynamic.literal(converterType = converterType.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], throttleInterval = throttleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setConverterType(value: Converter): Self = StObject.set(x, "converterType", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: typings.wixUiCore.googleMapsTypesMod.Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setThrottleInterval(value: Double): Self = StObject.set(x, "throttleInterval", value.asInstanceOf[js.Any])
  }
}
