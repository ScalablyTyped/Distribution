package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertiesEventMap extends ProxyEventMap {
  
  var change: PropertiesChangeEvent = js.native
}
object PropertiesEventMap {
  
  @scala.inline
  def apply(change: PropertiesChangeEvent): PropertiesEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesEventMap]
  }
  
  @scala.inline
  implicit class PropertiesEventMapMutableBuilder[Self <: PropertiesEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: PropertiesChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
