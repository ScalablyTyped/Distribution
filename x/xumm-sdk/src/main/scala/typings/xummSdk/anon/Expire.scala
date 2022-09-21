package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expire extends StObject {
  
  var expire: js.UndefOr[Double] = js.undefined
  
  var multisign: js.UndefOr[Boolean] = js.undefined
  
  var pathfinding: js.UndefOr[Boolean] = js.undefined
  
  var return_url: js.UndefOr[App] = js.undefined
  
  var signers: js.UndefOr[js.Array[String]] = js.undefined
  
  var submit: js.UndefOr[Boolean] = js.undefined
}
object Expire {
  
  inline def apply(): Expire = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expire]
  }
  
  extension [Self <: Expire](x: Self) {
    
    inline def setExpire(value: Double): Self = StObject.set(x, "expire", value.asInstanceOf[js.Any])
    
    inline def setExpireUndefined: Self = StObject.set(x, "expire", js.undefined)
    
    inline def setMultisign(value: Boolean): Self = StObject.set(x, "multisign", value.asInstanceOf[js.Any])
    
    inline def setMultisignUndefined: Self = StObject.set(x, "multisign", js.undefined)
    
    inline def setPathfinding(value: Boolean): Self = StObject.set(x, "pathfinding", value.asInstanceOf[js.Any])
    
    inline def setPathfindingUndefined: Self = StObject.set(x, "pathfinding", js.undefined)
    
    inline def setReturn_url(value: App): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlUndefined: Self = StObject.set(x, "return_url", js.undefined)
    
    inline def setSigners(value: js.Array[String]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    inline def setSignersUndefined: Self = StObject.set(x, "signers", js.undefined)
    
    inline def setSignersVarargs(value: String*): Self = StObject.set(x, "signers", js.Array(value*))
    
    inline def setSubmit(value: Boolean): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setSubmitUndefined: Self = StObject.set(x, "submit", js.undefined)
  }
}
