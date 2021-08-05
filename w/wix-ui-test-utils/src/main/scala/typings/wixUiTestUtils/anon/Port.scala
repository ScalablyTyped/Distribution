package typings.wixUiTestUtils.anon

import typings.wixUiTestUtils.wixUiTestUtilsNumbers.`6006`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Port extends StObject {
  
  var port: `6006`
}
object Port {
  
  inline def apply(): Port = {
    val __obj = js.Dynamic.literal(port = 6006)
    __obj.asInstanceOf[Port]
  }
  
  extension [Self <: Port](x: Self) {
    
    inline def setPort(value: `6006`): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
