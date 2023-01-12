package typings.vegaTypings.typesSpecEncodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encodable[T] extends StObject {
  
  var encode: js.UndefOr[Encode[T]] = js.undefined
}
object Encodable {
  
  inline def apply[T](): Encodable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encodable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encodable[?], T] (val x: Self & Encodable[T]) extends AnyVal {
    
    inline def setEncode(value: Encode[T]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
  }
}
