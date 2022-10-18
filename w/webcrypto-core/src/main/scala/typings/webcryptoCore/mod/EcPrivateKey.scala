package typings.webcryptoCore.mod

import typings.peculiarJsonSchema.buildTypesTypesMod.IJsonConvertible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcPrivateKey
  extends StObject
     with IJsonConvertible[Any] {
  
  var parameters: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var privateKey: js.typedarray.ArrayBuffer
  
  var publicKey: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var version: Double
}
object EcPrivateKey {
  
  inline def apply(
    fromJSON: Any => EcPrivateKey,
    privateKey: js.typedarray.ArrayBuffer,
    toJSON: () => Any,
    version: Double
  ): EcPrivateKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), privateKey = privateKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcPrivateKey]
  }
  
  extension [Self <: EcPrivateKey](x: Self) {
    
    inline def setParameters(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPrivateKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
