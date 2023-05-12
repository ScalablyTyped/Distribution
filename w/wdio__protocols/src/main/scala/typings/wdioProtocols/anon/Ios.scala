package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ios extends StObject {
  
  var ios: UIAutomation
}
object Ios {
  
  inline def apply(ios: UIAutomation): Ios = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ios]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ios] (val x: Self) extends AnyVal {
    
    inline def setIos(value: UIAutomation): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
