package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreAcceleratorKeys extends StObject {
  
  var onacceleratorkeyactivated: js.Any
}
object ICoreAcceleratorKeys {
  
  inline def apply(onacceleratorkeyactivated: js.Any): ICoreAcceleratorKeys = {
    val __obj = js.Dynamic.literal(onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreAcceleratorKeys]
  }
  
  extension [Self <: ICoreAcceleratorKeys](x: Self) {
    
    inline def setOnacceleratorkeyactivated(value: js.Any): Self = StObject.set(x, "onacceleratorkeyactivated", value.asInstanceOf[js.Any])
  }
}
