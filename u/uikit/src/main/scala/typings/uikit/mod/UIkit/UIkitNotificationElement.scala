package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitNotificationElement extends StObject {
  
  def close(immediate: Boolean): Unit = js.native
}
object UIkitNotificationElement {
  
  @scala.inline
  def apply(close: Boolean => Unit): UIkitNotificationElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close))
    __obj.asInstanceOf[UIkitNotificationElement]
  }
  
  @scala.inline
  implicit class UIkitNotificationElementMutableBuilder[Self <: UIkitNotificationElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: Boolean => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
  }
}
