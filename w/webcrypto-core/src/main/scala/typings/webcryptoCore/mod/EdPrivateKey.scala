package typings.webcryptoCore.mod

import typings.peculiarJsonSchema.typesMod.IJsonConvertible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdPrivateKey
  extends StObject
     with IJsonConvertible[Any] {
  
  var value: js.typedarray.ArrayBuffer
}
object EdPrivateKey {
  
  inline def apply(fromJSON: Any => EdPrivateKey, toJSON: () => Any, value: js.typedarray.ArrayBuffer): EdPrivateKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdPrivateKey]
  }
  
  extension [Self <: EdPrivateKey](x: Self) {
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
