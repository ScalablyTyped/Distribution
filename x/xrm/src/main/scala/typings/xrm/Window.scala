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
  
  extension [Self <: Window](x: Self) {
    
    inline def setGetGlobalContext(value: () => GlobalContext): Self = StObject.set(x, "GetGlobalContext", js.Any.fromFunction0(value))
    
    inline def setXrm(value: XrmStatic): Self = StObject.set(x, "Xrm", value.asInstanceOf[js.Any])
  }
}
