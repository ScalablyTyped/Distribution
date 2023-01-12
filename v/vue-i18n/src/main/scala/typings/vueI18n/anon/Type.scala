package typings.vueI18n.anon

import typings.std.ObjectConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: js.Array[ObjectConstructor | StringConstructor]
}
object Type {
  
  inline def apply(`type`: js.Array[ObjectConstructor | StringConstructor]): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: js.Array[ObjectConstructor | StringConstructor]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (ObjectConstructor | StringConstructor)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
