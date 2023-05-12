package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  @JSName("$")
  var $: SetupState
}
object _empty {
  
  inline def apply($: SetupState): _empty = {
    val __obj = js.Dynamic.literal($ = $.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: _empty] (val x: Self) extends AnyVal {
    
    inline def set$(value: SetupState): Self = StObject.set(x, "$", value.asInstanceOf[js.Any])
  }
}
