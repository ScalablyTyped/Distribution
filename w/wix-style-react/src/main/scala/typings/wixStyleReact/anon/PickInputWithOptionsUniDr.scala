package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> */
trait PickInputWithOptionsUniDr extends StObject {
  
  var driver: IsDisabled
}
object PickInputWithOptionsUniDr {
  
  inline def apply(driver: IsDisabled): PickInputWithOptionsUniDr = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickInputWithOptionsUniDr]
  }
  
  extension [Self <: PickInputWithOptionsUniDr](x: Self) {
    
    inline def setDriver(value: IsDisabled): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
  }
}
