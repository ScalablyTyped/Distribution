package typings.wixStyleReact.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriverReturnType[Driver] extends StObject {
  
  var driver: ReturnType[Driver]
}
object DriverReturnType {
  
  inline def apply[Driver](driver: ReturnType[Driver]): DriverReturnType[Driver] = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriverReturnType[Driver]]
  }
  
  extension [Self <: DriverReturnType[?], Driver](x: Self & DriverReturnType[Driver]) {
    
    inline def setDriver(value: ReturnType[Driver]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
  }
}
