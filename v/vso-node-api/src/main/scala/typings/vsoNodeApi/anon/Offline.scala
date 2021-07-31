package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offline extends StObject {
  
  var offline: scala.Double
  
  var online: scala.Double
}
object Offline {
  
  @scala.inline
  def apply(offline: scala.Double, online: scala.Double): Offline = {
    val __obj = js.Dynamic.literal(offline = offline.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offline]
  }
  
  @scala.inline
  implicit class OfflineMutableBuilder[Self <: Offline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffline(value: scala.Double): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnline(value: scala.Double): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
  }
}
