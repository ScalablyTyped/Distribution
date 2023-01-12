package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManuallyValidatedOption[T] extends StObject {
  
  var __validated: T
}
object ManuallyValidatedOption {
  
  inline def apply[T](__validated: T): ManuallyValidatedOption[T] = {
    val __obj = js.Dynamic.literal(__validated = __validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManuallyValidatedOption[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManuallyValidatedOption[?], T] (val x: Self & ManuallyValidatedOption[T]) extends AnyVal {
    
    inline def set__validated(value: T): Self = StObject.set(x, "__validated", value.asInstanceOf[js.Any])
  }
}
