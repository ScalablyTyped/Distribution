package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Available extends StObject {
  
  var available: scala.Double
  
  var offline: scala.Double
  
  var unavailable: scala.Double
}
object Available {
  
  @scala.inline
  def apply(available: scala.Double, offline: scala.Double, unavailable: scala.Double): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], offline = offline.asInstanceOf[js.Any], unavailable = unavailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
  
  @scala.inline
  implicit class AvailableMutableBuilder[Self <: Available] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: scala.Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline(value: scala.Double): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnavailable(value: scala.Double): Self = StObject.set(x, "unavailable", value.asInstanceOf[js.Any])
  }
}
