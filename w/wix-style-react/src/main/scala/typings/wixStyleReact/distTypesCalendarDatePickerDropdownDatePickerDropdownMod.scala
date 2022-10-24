package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.AriaLabelledBy
import typings.wixStyleReact.anon.Open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarDatePickerDropdownDatePickerDropdownMod {
  
  @JSImport("wix-style-react/dist/types/Calendar/DatePickerDropdown/DatePickerDropdown", JSImport.Default)
  @js.native
  open class default protected () extends DropdownPicker {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/Calendar/DatePickerDropdown/DatePickerDropdown", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Calendar/DatePickerDropdown/DatePickerDropdown", "default.propTypes")
    @js.native
    def propTypes: AriaLabelledBy = js.native
    inline def propTypes_=(x: AriaLabelledBy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DropdownPicker extends Component[Any, Any, Any] {
    
    def _close(): Unit = js.native
    
    def _onKeyDown(e: Any, delegateKeyDown: Any): Unit = js.native
    
    def _onSelect(data: Any): Unit = js.native
    
    def _open(): Unit = js.native
    
    def _toggle(): Unit = js.native
    
    @JSName("state")
    var state_DropdownPicker: Open = js.native
  }
}
