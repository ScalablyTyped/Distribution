package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ibiza extends StObject {
  
  var ibiza: scala.Double = js.native
  
  var portalExtensionApi: scala.Double = js.native
  
  var restApi: scala.Double = js.native
  
  var undefined: scala.Double = js.native
  
  var userInterface: scala.Double = js.native
}
object Ibiza {
  
  @scala.inline
  def apply(
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
  implicit class IbizaMutableBuilder[Self <: Ibiza] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIbiza(value: scala.Double): Self = StObject.set(x, "ibiza", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalExtensionApi(value: scala.Double): Self = StObject.set(x, "portalExtensionApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApi(value: scala.Double): Self = StObject.set(x, "restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserInterface(value: scala.Double): Self = StObject.set(x, "userInterface", value.asInstanceOf[js.Any])
  }
}
