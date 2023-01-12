package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeOptions extends StObject {
  
  var prepend: js.UndefOr[Boolean] = js.undefined
}
object SubscribeOptions {
  
  inline def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    
    inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
  }
}
