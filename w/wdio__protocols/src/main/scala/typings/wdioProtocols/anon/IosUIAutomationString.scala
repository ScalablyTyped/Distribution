package typings.wdioProtocols.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosUIAutomationString extends StObject {
  
  var ios: UIAutomationString
}
object IosUIAutomationString {
  
  inline def apply(ios: UIAutomationString): IosUIAutomationString = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any])
    __obj.asInstanceOf[IosUIAutomationString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosUIAutomationString] (val x: Self) extends AnyVal {
    
    inline def setIos(value: UIAutomationString): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
  }
}
