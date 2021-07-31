package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Online extends StObject {
  
  var offline: scala.Double
  
  var online: scala.Double
}
object Online {
  
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Online = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  
  @scala.inline
  implicit class OnlineMutableBuilder[Self <: Online] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffline(value: scala.Double): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: scala.Double): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
  }
}
