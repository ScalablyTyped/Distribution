package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the actions to which the user can respond. */
@js.native
trait RcsEndUserMessageAction extends StObject {
  
  /** Gets the label of the action. */
  var label: String = js.native
}
object RcsEndUserMessageAction {
  
  @scala.inline
  def apply(label: String): RcsEndUserMessageAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAction]
  }
  
  @scala.inline
  implicit class RcsEndUserMessageActionMutableBuilder[Self <: RcsEndUserMessageAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
