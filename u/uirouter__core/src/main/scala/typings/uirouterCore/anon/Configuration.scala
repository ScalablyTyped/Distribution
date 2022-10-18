package typings.uirouterCore.anon

import typings.uirouterCore.libCommonCoreservicesMod.LocationConfig
import typings.uirouterCore.libCommonCoreservicesMod.LocationServices
import typings.uirouterCore.libRouterMod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var configuration: LocationConfig
  
  def dispose(router: UIRouter): Unit
  
  var name: String
  
  var service: LocationServices
}
object Configuration {
  
  inline def apply(configuration: LocationConfig, dispose: UIRouter => Unit, name: String, service: LocationServices): Configuration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], dispose = js.Any.fromFunction1(dispose), name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setConfiguration(value: LocationConfig): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setDispose(value: UIRouter => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setService(value: LocationServices): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
