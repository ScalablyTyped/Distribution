package typings.webdriver.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait W3CCapabilities extends StObject {
  
  var alwaysMatch: Capabilities
  
  var firstMatch: js.Array[Capabilities]
}
object W3CCapabilities {
  
  @scala.inline
  def apply(alwaysMatch: Capabilities, firstMatch: js.Array[Capabilities]): W3CCapabilities = {
    val __obj = js.Dynamic.literal(alwaysMatch = alwaysMatch.asInstanceOf[js.Any], firstMatch = firstMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[W3CCapabilities]
  }
  
  @scala.inline
  implicit class W3CCapabilitiesMutableBuilder[Self <: W3CCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysMatch(value: Capabilities): Self = StObject.set(x, "alwaysMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMatch(value: js.Array[Capabilities]): Self = StObject.set(x, "firstMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMatchVarargs(value: Capabilities*): Self = StObject.set(x, "firstMatch", js.Array(value :_*))
  }
}
