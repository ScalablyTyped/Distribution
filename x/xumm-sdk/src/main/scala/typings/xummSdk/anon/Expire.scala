package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expire extends StObject {
  
  var expire: js.UndefOr[Double] = js.undefined
  
  var force_network: js.UndefOr[String] = js.undefined
  
  var multisign: js.UndefOr[Boolean] = js.undefined
  
  var pathfinding: js.UndefOr[Boolean] = js.undefined
  
  var pathfinding_fallback: js.UndefOr[Boolean] = js.undefined
  
  var return_url: js.UndefOr[App] = js.undefined
  
  var signers: js.UndefOr[js.Array[String]] = js.undefined
  
  var submit: js.UndefOr[Boolean] = js.undefined
}
object Expire {
  
  inline def apply(): Expire = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expire]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expire] (val x: Self) extends AnyVal {
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setForce_network(value: String): Self = StObject.set(x, "force_network", value.asInstanceOf[js.Any])
    
    inline def setForce_networkUndefined: Self = StObject.set(x, "force_network", js.undefined)
    
    inline def setMultisign(value: Boolean): Self = StObject.set(x, "multisign", value.asInstanceOf[js.Any])
    
    inline def setMultisignUndefined: Self = StObject.set(x, "multisign", js.undefined)
    
    inline def setPathfinding(value: Boolean): Self = StObject.set(x, "pathfinding", value.asInstanceOf[js.Any])
    
    inline def setPathfindingUndefined: Self = StObject.set(x, "pathfinding", js.undefined)
    
    inline def setPathfinding_fallback(value: Boolean): Self = StObject.set(x, "pathfinding_fallback", value.asInstanceOf[js.Any])
    
    inline def setPathfinding_fallbackUndefined: Self = StObject.set(x, "pathfinding_fallback", js.undefined)
    
    inline def setReturn_url(value: App): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    inline def setSigners(value: js.Array[String]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
    
    inline def setSignersVarargs(value: String*): Self = StObject.set(x, "signers", js.Array(value*))
    
    inline def setSubmit(value: Boolean): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
  }
}
