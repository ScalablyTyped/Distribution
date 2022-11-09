package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectiveBinding[V] extends StObject {
  
  var arg: js.UndefOr[String] = js.undefined
  
  var dir: ObjectDirective[Any, V]
  
  var instance: (ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
    js.Object
  ]) | Null
  
  var modifiers: DirectiveModifiers
  
  var oldValue: V | Null
  
  var value: V
}
object DirectiveBinding {
  
  inline def apply[V](dir: ObjectDirective[Any, V], modifiers: DirectiveModifiers, value: V): DirectiveBinding[V] = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], instance = null, oldValue = null)
    __obj.asInstanceOf[DirectiveBinding[V]]
  }
  
  extension [Self <: DirectiveBinding[?], V](x: Self & DirectiveBinding[V]) {
    
    inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setDir(value: ObjectDirective[Any, V]): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setInstance(
      value: ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
          js.Object
        ]
    ): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setModifiers(value: DirectiveModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
