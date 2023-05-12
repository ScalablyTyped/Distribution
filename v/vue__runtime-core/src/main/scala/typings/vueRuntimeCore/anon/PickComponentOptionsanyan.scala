package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any, any>, 'name' | 'inheritAttrs'> */
trait PickComponentOptionsanyan extends StObject {
  
  var inheritAttrs: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object PickComponentOptionsanyan {
  
  inline def apply(): PickComponentOptionsanyan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickComponentOptionsanyan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickComponentOptionsanyan] (val x: Self) extends AnyVal {
    
    inline def setInheritAttrs(value: Boolean): Self = StObject.set(x, "inheritAttrs", value.asInstanceOf[js.Any])
    
    inline def setInheritAttrsUndefined: Self = StObject.set(x, "inheritAttrs", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
