package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppOnline extends StObject {
  
  var appOnline: Boolean
}
object AppOnline {
  
  inline def apply(appOnline: Boolean): AppOnline = {
    val __obj = js.Dynamic.literal(appOnline = appOnline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppOnline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppOnline] (val x: Self) extends AnyVal {
    
    inline def setAppOnline(value: Boolean): Self = StObject.set(x, "appOnline", value.asInstanceOf[js.Any])
  }
}
