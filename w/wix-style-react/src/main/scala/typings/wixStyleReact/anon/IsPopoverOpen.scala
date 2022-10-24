package typings.wixStyleReact.anon

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPopoverOpen extends StObject {
  
  var isPopoverOpen: Boolean
  
  var moveBy: YNumber
  
  def onClose(): Unit
  
  def onOpen(): Unit
  
  var popoverContentRef: MutableRefObject[Null]
}
object IsPopoverOpen {
  
  inline def apply(
    isPopoverOpen: Boolean,
    moveBy: YNumber,
    onClose: () => Unit,
    onOpen: () => Unit,
    popoverContentRef: MutableRefObject[Null]
  ): IsPopoverOpen = {
    val __obj = js.Dynamic.literal(isPopoverOpen = isPopoverOpen.asInstanceOf[js.Any], moveBy = moveBy.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen), popoverContentRef = popoverContentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPopoverOpen]
  }
  
  extension [Self <: IsPopoverOpen](x: Self) {
    
    inline def setIsPopoverOpen(value: Boolean): Self = StObject.set(x, "isPopoverOpen", value.asInstanceOf[js.Any])
    
    inline def setMoveBy(value: YNumber): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
    
    inline def setPopoverContentRef(value: MutableRefObject[Null]): Self = StObject.set(x, "popoverContentRef", value.asInstanceOf[js.Any])
  }
}
