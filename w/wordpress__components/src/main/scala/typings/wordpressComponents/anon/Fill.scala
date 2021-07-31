package typings.wordpressComponents.anon

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fill extends StObject {
  
  var Fill: FC[OmitPropsname]
  
  var Slot: FC[OmitPropsnameBubblesVirtually]
}
object Fill {
  
  @scala.inline
  def apply(Fill: FC[OmitPropsname], Slot: FC[OmitPropsnameBubblesVirtually]): Fill = {
    val __obj = js.Dynamic.literal(Fill = Fill.asInstanceOf[js.Any], Slot = Slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill]
  }
  
  @scala.inline
  implicit class FillMutableBuilder[Self <: Fill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: FC[OmitPropsname]): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlot(value: FC[OmitPropsnameBubblesVirtually]): Self = StObject.set(x, "Slot", value.asInstanceOf[js.Any])
  }
}
