package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessTokenOptions extends StObject {
  
  /**
    * The identity of the first person
    */
  var identity: js.UndefOr[String] = js.undefined
  
  /**
    * Time from epoch in seconds for not before value
    */
  var nbf: js.UndefOr[Double] = js.undefined
  
  /**
    * The region value associated with this account
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Time to live in seconds
    */
  var ttl: js.UndefOr[Double] = js.undefined
}
object AccessTokenOptions {
  
  inline def apply(): AccessTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessTokenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessTokenOptions] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
    
    inline def setNbfUndefined: Self = StObject.set(x, "nbf", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
