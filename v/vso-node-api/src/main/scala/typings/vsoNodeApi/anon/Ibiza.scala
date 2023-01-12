package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ibiza extends StObject {
  
  var ibiza: scala.Double
  
  var portalExtensionApi: scala.Double
  
  var restApi: scala.Double
  
  var undefined: scala.Double
  
  var userInterface: scala.Double
}
object Ibiza {
  
  inline def apply(
    ibiza: scala.Double,
    portalExtensionApi: scala.Double,
    restApi: scala.Double,
    undefined: scala.Double,
    userInterface: scala.Double
  ): Ibiza = {
    val __obj = js.Dynamic.literal(ibiza = ibiza.asInstanceOf[js.Any], portalExtensionApi = portalExtensionApi.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any], userInterface = userInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ibiza]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ibiza] (val x: Self) extends AnyVal {
    
    inline def setIbiza(value: scala.Double): Self = StObject.set(x, "ibiza", value.asInstanceOf[js.Any])
    
    inline def setPortalExtensionApi(value: scala.Double): Self = StObject.set(x, "portalExtensionApi", value.asInstanceOf[js.Any])
    
    inline def setRestApi(value: scala.Double): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    inline def setUserInterface(value: scala.Double): Self = StObject.set(x, "userInterface", value.asInstanceOf[js.Any])
  }
}
