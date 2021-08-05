package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IApplicationDataStatics extends StObject {
  
  var current: ApplicationData
}
object IApplicationDataStatics {
  
  inline def apply(current: ApplicationData): IApplicationDataStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationDataStatics]
  }
  
  extension [Self <: IApplicationDataStatics](x: Self) {
    
    inline def setCurrent(value: ApplicationData): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
