package typings.wixStyleReact.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  def close(e: SyntheticEvent[Element, typings.std.Event]): Unit
  
  var delegateKeyDown: KeyboardEventHandler[Element]
  
  def open(): Unit
  
  var selectedOption: DropdownLayoutValueOption
  
  def toggle(): Unit
}
object Close {
  
  @scala.inline
  def apply(
    close: SyntheticEvent[Element, typings.std.Event] => Unit,
    delegateKeyDown: KeyboardEvent[Element] => Unit,
    open: () => Unit,
    selectedOption: DropdownLayoutValueOption,
    toggle: () => Unit
  ): Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), delegateKeyDown = js.Any.fromFunction1(delegateKeyDown), open = js.Any.fromFunction0(open), selectedOption = selectedOption.asInstanceOf[js.Any], toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: SyntheticEvent[Element, typings.std.Event] => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelegateKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "delegateKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectedOption(value: DropdownLayoutValueOption): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
