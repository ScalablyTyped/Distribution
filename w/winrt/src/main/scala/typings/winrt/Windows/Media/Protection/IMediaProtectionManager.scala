package typings.winrt.Windows.Media.Protection

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMediaProtectionManager extends StObject {
  
  var oncomponentloadfailed: js.Any = js.native
  
  var onrebootneeded: js.Any = js.native
  
  var onservicerequested: js.Any = js.native
  
  var properties: IPropertySet = js.native
}
object IMediaProtectionManager {
  
  @scala.inline
  def apply(
    oncomponentloadfailed: js.Any,
    onrebootneeded: js.Any,
    onservicerequested: js.Any,
    properties: IPropertySet
  ): IMediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed.asInstanceOf[js.Any], onrebootneeded = onrebootneeded.asInstanceOf[js.Any], onservicerequested = onservicerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaProtectionManager]
  }
  
  @scala.inline
  implicit class IMediaProtectionManagerMutableBuilder[Self <: IMediaProtectionManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOncomponentloadfailed(value: js.Any): Self = StObject.set(x, "oncomponentloadfailed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnrebootneeded(value: js.Any): Self = StObject.set(x, "onrebootneeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnservicerequested(value: js.Any): Self = StObject.set(x, "onservicerequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
