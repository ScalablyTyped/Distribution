package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickableComponentOptions
  extends StObject
     with ComponentOptions {
  
  var clickHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object ClickableComponentOptions {
  
  inline def apply(): ClickableComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClickableComponentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClickableComponentOptions] (val x: Self) extends AnyVal {
    
    inline def setClickHandler(value: () => Unit): Self = StObject.set(x, "clickHandler", js.Any.fromFunction0(value))
    
    inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
  }
}
