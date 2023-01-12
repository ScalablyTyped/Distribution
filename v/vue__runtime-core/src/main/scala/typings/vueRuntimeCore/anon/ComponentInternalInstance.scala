package typings.vueRuntimeCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentInternalInstance extends StObject {
  
  // directly bailing on ComponentPublicInstance results in recursion
  // so we use this as a bail hint
  @JSName("$")
  var $: typings.vueRuntimeCore.mod.ComponentInternalInstance
}
object ComponentInternalInstance {
  
  inline def apply($: typings.vueRuntimeCore.mod.ComponentInternalInstance): ComponentInternalInstance = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInternalInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentInternalInstance] (val x: Self) extends AnyVal {
    
    inline def set$(value: typings.vueRuntimeCore.mod.ComponentInternalInstance): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
