package typings.vegaTypings.encodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encodable[T] extends StObject {
  
  var encode: js.UndefOr[Encode[T]] = js.undefined
}
object Encodable {
  
  @scala.inline
  def apply[T](): Encodable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encodable[T]]
  }
  
  @scala.inline
  implicit class EncodableMutableBuilder[Self <: Encodable[?], T] (val x: Self & Encodable[T]) extends AnyVal {
    
    @scala.inline
    def setEncode(value: Encode[T]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
  }
}
