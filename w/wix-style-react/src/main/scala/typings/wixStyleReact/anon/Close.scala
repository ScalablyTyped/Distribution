package typings.wixStyleReact.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.SyntheticEvent
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(e: SyntheticEvent[typings.std.Element, typings.std.Event]): Unit
  
  var delegateKeyDown: KeyboardEventHandler[typings.std.Element]
  
  var isOpen: Boolean
  
  def open(): Unit
  
  var selectedOption: DropdownLayoutValueOption
  
  def toggle(): Unit
}
object Close {
  
  inline def apply(
    close: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit,
    delegateKeyDown: KeyboardEvent[typings.std.Element] => Unit,
    isOpen: Boolean,
    open: () => Unit,
    selectedOption: DropdownLayoutValueOption,
    toggle: () => Unit
  ): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), delegateKeyDown = js.Any.fromFunction1(delegateKeyDown), isOpen = isOpen.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), selectedOption = selectedOption.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setClose(value: SyntheticEvent[typings.std.Element, typings.std.Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setDelegateKeyDown(value: KeyboardEvent[typings.std.Element] => Unit): Self = StObject.set(x, "delegateKeyDown", js.Any.fromFunction1(value))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setSelectedOption(value: DropdownLayoutValueOption): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
