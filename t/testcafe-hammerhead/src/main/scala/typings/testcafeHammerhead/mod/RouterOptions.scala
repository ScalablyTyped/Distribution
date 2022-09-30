package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterOptions extends StObject {
  
  var staticContentCaching: js.UndefOr[js.Object] = js.undefined
}
object RouterOptions {
  
  inline def apply(): RouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterOptions]
  }
  
  extension [Self <: RouterOptions](x: Self) {
    
    inline def setStaticContentCaching(value: js.Object): Self = StObject.set(x, "staticContentCaching", value.asInstanceOf[js.Any])
    
    inline def setStaticContentCachingUndefined: Self = StObject.set(x, "staticContentCaching", js.undefined)
  }
}
