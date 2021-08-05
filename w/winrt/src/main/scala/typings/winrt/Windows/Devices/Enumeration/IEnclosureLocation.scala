package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEnclosureLocation extends StObject {
  
  var inDock: Boolean
  
  var inLid: Boolean
  
  var panel: Panel
}
object IEnclosureLocation {
  
  inline def apply(inDock: Boolean, inLid: Boolean, panel: Panel): IEnclosureLocation = {
    val __obj = js.Dynamic.literal(inDock = inDock.asInstanceOf[js.Any], inLid = inLid.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnclosureLocation]
  }
  
  extension [Self <: IEnclosureLocation](x: Self) {
    
    inline def setInDock(value: Boolean): Self = StObject.set(x, "inDock", value.asInstanceOf[js.Any])
    
    inline def setInLid(value: Boolean): Self = StObject.set(x, "inLid", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: Panel): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
  }
}
