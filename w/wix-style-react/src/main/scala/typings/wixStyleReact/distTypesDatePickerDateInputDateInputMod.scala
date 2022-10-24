package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.StatusMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerDateInputDateInputMod {
  
  @JSImport("wix-style-react/dist/types/DatePicker/DateInput/DateInput", JSImport.Default)
  @js.native
  open class default protected () extends DateInput {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/DatePicker/DateInput/DateInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/DatePicker/DateInput/DateInput", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/DatePicker/DateInput/DateInput", "default.propTypes")
    @js.native
    val propTypes: Any = js.native
  }
  
  @js.native
  trait DateInput extends PureComponent[Any, Any, Any] {
    
    def _getFormattedDate(value: Any): js.UndefOr[String] = js.native
    
    def _getLocale(): Any = js.native
    
    def _handleBlur(): Unit = js.native
    
    def _handleChange(event: Any): Unit = js.native
    
    def _handleClear(event: Any): Unit = js.native
    
    def _handleValidation(date: Any): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDateInput(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDateInput(prevProps: Any): Unit = js.native
    
    @JSName("state")
    var state_DateInput: StatusMessage = js.native
  }
}
