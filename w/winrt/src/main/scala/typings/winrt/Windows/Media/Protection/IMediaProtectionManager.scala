package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMediaProtectionManager extends StObject {
  
  var oncomponentloadfailed: Any
  
  var onrebootneeded: Any
  
  var onservicerequested: Any
  
  var properties: IPropertySet
}
object IMediaProtectionManager {
  
  inline def apply(oncomponentloadfailed: Any, onrebootneeded: Any, onservicerequested: Any, properties: IPropertySet): IMediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed.asInstanceOf[js.Any], onrebootneeded = onrebootneeded.asInstanceOf[js.Any], onservicerequested = onservicerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaProtectionManager]
  }
  
  extension [Self <: IMediaProtectionManager](x: Self) {
    
    inline def setOncomponentloadfailed(value: Any): Self = StObject.set(x, "oncomponentloadfailed", value.asInstanceOf[js.Any])
    
    inline def setOnrebootneeded(value: Any): Self = StObject.set(x, "onrebootneeded", value.asInstanceOf[js.Any])
    
    inline def setOnservicerequested(value: Any): Self = StObject.set(x, "onservicerequested", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
