package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHideTimeout extends StObject {
  
  var autoHideTimeout: Any
}
object AutoHideTimeout {
  
  inline def apply(autoHideTimeout: Any): AutoHideTimeout = {
    val __obj = js.Dynamic.literal(autoHideTimeout = autoHideTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHideTimeout]
  }
  
  extension [Self <: AutoHideTimeout](x: Self) {
    
    inline def setAutoHideTimeout(value: Any): Self = StObject.set(x, "autoHideTimeout", value.asInstanceOf[js.Any])
  }
}
