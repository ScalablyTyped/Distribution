package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreAcceleratorKeys extends StObject {
  
  var onacceleratorkeyactivated: Any
}
object ICoreAcceleratorKeys {
  
  inline def apply(onacceleratorkeyactivated: Any): ICoreAcceleratorKeys = {
    val __obj = js.Dynamic.literal(onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreAcceleratorKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICoreAcceleratorKeys] (val x: Self) extends AnyVal {
    
    inline def setOnacceleratorkeyactivated(value: Any): Self = StObject.set(x, "onacceleratorkeyactivated", value.asInstanceOf[js.Any])
  }
}
