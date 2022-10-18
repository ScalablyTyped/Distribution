package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.ComponentInternalInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  // directly bailing on ComponentPublicInstance results in recursion
  // so we use this as a bail hint
  @JSName("$")
  var $: ComponentInternalInstance
}
object _empty {
  
  inline def apply($: ComponentInternalInstance): _empty = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def set$(value: ComponentInternalInstance): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
