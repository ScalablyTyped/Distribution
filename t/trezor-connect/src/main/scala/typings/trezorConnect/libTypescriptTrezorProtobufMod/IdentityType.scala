package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityType extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[String] = js.undefined
  
  var proto: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object IdentityType {
  
  inline def apply(): IdentityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityType]
  }
  
  extension [Self <: IdentityType](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
