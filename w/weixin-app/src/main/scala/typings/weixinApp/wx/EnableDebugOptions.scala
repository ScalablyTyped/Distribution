package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #endregion
trait EnableDebugOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var enableDebug: Boolean
}
object EnableDebugOptions {
  
  @scala.inline
  def apply(enableDebug: Boolean): EnableDebugOptions = {
    val __obj = js.Dynamic.literal(enableDebug = enableDebug.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDebugOptions]
  }
  
  @scala.inline
  implicit class EnableDebugOptionsMutableBuilder[Self <: EnableDebugOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDebug(value: Boolean): Self = StObject.set(x, "enableDebug", value.asInstanceOf[js.Any])
  }
}
