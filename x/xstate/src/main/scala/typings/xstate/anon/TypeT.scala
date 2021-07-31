package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeT[T] extends StObject {
  
  var `type`: T
}
object TypeT {
  
  @scala.inline
  def apply[T](`type`: T): TypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeT[T]]
  }
  
  @scala.inline
  implicit class TypeTMutableBuilder[Self <: TypeT[?], T] (val x: Self & TypeT[T]) extends AnyVal {
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
