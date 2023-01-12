package typings.xrm

import typings.xrm.Xrm.GlobalContext
import typings.xrm.Xrm.XrmStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  def GetGlobalContext(): GlobalContext
  
  var Xrm: XrmStatic
}
object Window {
  
  inline def apply(GetGlobalContext: () => GlobalContext, Xrm: XrmStatic): Window = {
    val __obj = js.Dynamic.literal(GetGlobalContext = js.Any.fromFunction0(GetGlobalContext), Xrm = Xrm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setGetGlobalContext(value: () => GlobalContext): Self = StObject.set(x, "GetGlobalContext", js.Any.fromFunction0(value))
    
    inline def setXrm(value: XrmStatic): Self = StObject.set(x, "Xrm", value.asInstanceOf[js.Any])
  }
}
