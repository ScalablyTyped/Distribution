package typings.webcryptoCore.mod

import typings.peculiarJsonSchema.buildTypesTypesMod.IJsonConvertible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdPublicKey
  extends StObject
     with IJsonConvertible[Any] {
  
  var value: js.typedarray.ArrayBuffer
}
object EdPublicKey {
  
  inline def apply(fromJSON: Any => EdPublicKey, toJSON: () => Any, value: js.typedarray.ArrayBuffer): EdPublicKey = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdPublicKey] (val x: Self) extends AnyVal {
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
