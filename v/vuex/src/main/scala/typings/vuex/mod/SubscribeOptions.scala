package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeOptions extends StObject {
  
  var prepend: js.UndefOr[Boolean] = js.undefined
}
object SubscribeOptions {
  
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  @scala.inline
  implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
  }
}
