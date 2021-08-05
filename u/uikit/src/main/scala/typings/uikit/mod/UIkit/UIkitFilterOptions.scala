package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitFilterOptions extends StObject {
  
  var selActive: js.UndefOr[String | Boolean] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
}
object UIkitFilterOptions {
  
  inline def apply(): UIkitFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitFilterOptions]
  }
  
  extension [Self <: UIkitFilterOptions](x: Self) {
    
    inline def setSelActive(value: String | Boolean): Self = StObject.set(x, "selActive", value.asInstanceOf[js.Any])
    
    inline def setSelActiveUndefined: Self = StObject.set(x, "selActive", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
