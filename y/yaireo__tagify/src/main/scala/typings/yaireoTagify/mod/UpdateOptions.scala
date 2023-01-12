package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional settings that can be passed to {@link Tagify.update}.
  */
trait UpdateOptions extends StObject {
  
  /**
    * When `true`, no change is event triggered and the change is applied
    * silently. When `false` or not given, a change event is triggered
    * normally as if the user had made the change. Note that no event is
    * triggered when the value of the INPUT or TEXTAREA element did not
    * change.
    * @default false
    */
  var withoutChangeEvent: js.UndefOr[Boolean] = js.undefined
}
object UpdateOptions {
  
  inline def apply(): UpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
    inline def setWithoutChangeEvent(value: Boolean): Self = StObject.set(x, "withoutChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setWithoutChangeEventUndefined: Self = StObject.set(x, "withoutChangeEvent", js.undefined)
  }
}
