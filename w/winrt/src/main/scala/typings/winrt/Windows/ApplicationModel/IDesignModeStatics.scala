package typings.winrt.Windows.ApplicationModel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDesignModeStatics extends StObject {
  
  var designModeEnabled: Boolean
}
object IDesignModeStatics {
  
  inline def apply(designModeEnabled: Boolean): IDesignModeStatics = {
    val __obj = js.Dynamic.literal(designModeEnabled = designModeEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDesignModeStatics]
  }
  
  extension [Self <: IDesignModeStatics](x: Self) {
    
    inline def setDesignModeEnabled(value: Boolean): Self = StObject.set(x, "designModeEnabled", value.asInstanceOf[js.Any])
  }
}
