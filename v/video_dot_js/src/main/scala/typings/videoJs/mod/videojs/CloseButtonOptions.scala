package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseButtonOptions
  extends StObject
     with ComponentOptions {
  
  var controlText: js.UndefOr[String] = js.undefined
}
object CloseButtonOptions {
  
  inline def apply(): CloseButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseButtonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseButtonOptions] (val x: Self) extends AnyVal {
    
    inline def setControlText(value: String): Self = StObject.set(x, "controlText", value.asInstanceOf[js.Any])
    
    inline def setControlTextUndefined: Self = StObject.set(x, "controlText", js.undefined)
  }
}
