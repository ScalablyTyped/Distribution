package typings.wixStyleReact.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledDisabledMessage extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var disabledMessage: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[ReactNode] = js.undefined
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
}
object DisabledDisabledMessage {
  
  inline def apply(): DisabledDisabledMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledDisabledMessage]
  }
  
  extension [Self <: DisabledDisabledMessage](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledMessage(value: String): Self = StObject.set(x, "disabledMessage", value.asInstanceOf[js.Any])
    
    inline def setDisabledMessageUndefined: Self = StObject.set(x, "disabledMessage", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
