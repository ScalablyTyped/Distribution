package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreServicesHost extends StObject {
  
  var logger: ILogger
}
object ICoreServicesHost {
  
  inline def apply(logger: ILogger): ICoreServicesHost = {
    val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreServicesHost]
  }
  
  extension [Self <: ICoreServicesHost](x: Self) {
    
    inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
