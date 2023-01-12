package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #endregion
trait EnableDebugOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var enableDebug: Boolean
}
object EnableDebugOptions {
  
  inline def apply(enableDebug: Boolean): EnableDebugOptions = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDebugOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableDebugOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableDebug(value: Boolean): Self = StObject.set(x, "enableDebug", value.asInstanceOf[js.Any])
  }
}
