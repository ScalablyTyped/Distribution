package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyType[T] extends StObject {
  
  var convert: js.UndefOr[js.Function2[/* value */ Any, /* context */ js.UndefOr[NativeObject], T]] = js.undefined
  
  var decode: js.UndefOr[js.Function2[/* value */ Any, /* context */ js.UndefOr[NativeObject], T]] = js.undefined
  
  var encode: js.UndefOr[js.Function2[/* value */ T, /* context */ js.UndefOr[NativeObject], Any]] = js.undefined
}
object PropertyType {
  
  inline def apply[T](): PropertyType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyType[T]]
  }
  
  extension [Self <: PropertyType[?], T](x: Self & PropertyType[T]) {
    
    inline def setConvert(value: (/* value */ Any, /* context */ js.UndefOr[NativeObject]) => T): Self = StObject.set(x, "convert", js.Any.fromFunction2(value))
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setDecode(value: (/* value */ Any, /* context */ js.UndefOr[NativeObject]) => T): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
    
    inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
    
    inline def setEncode(value: (/* value */ T, /* context */ js.UndefOr[NativeObject]) => Any): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
  }
}
