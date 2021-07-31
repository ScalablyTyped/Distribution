package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreAcceleratorKeys extends StObject {
  
  var onacceleratorkeyactivated: js.Any
}
object ICoreAcceleratorKeys {
  
  @scala.inline
  def apply(onacceleratorkeyactivated: js.Any): ICoreAcceleratorKeys = {
    val __obj = js.Dynamic.literal(onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreAcceleratorKeys]
  }
  
  @scala.inline
  implicit class ICoreAcceleratorKeysMutableBuilder[Self <: ICoreAcceleratorKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnacceleratorkeyactivated(value: js.Any): Self = StObject.set(x, "onacceleratorkeyactivated", value.asInstanceOf[js.Any])
  }
}
