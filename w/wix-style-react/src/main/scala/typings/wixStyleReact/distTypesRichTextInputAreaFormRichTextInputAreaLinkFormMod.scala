package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRichTextInputAreaFormRichTextInputAreaLinkFormMod {
  
  @JSImport("wix-style-react/dist/types/RichTextInputArea/Form/RichTextInputAreaLinkForm", JSImport.Default)
  @js.native
  open class default protected () extends RichTextInputAreaLinkForm {
    def this(props: Any) = this()
  }
  
  @js.native
  trait RichTextInputAreaLinkForm extends Component[Any, Any, Any] {
    
    def _onSubmit(event: Any): Unit = js.native
    
    def _setInputValue(event: Any, key: Any): Unit = js.native
    
    @JSName("state")
    var state_RichTextInputAreaLinkForm: Text = js.native
  }
}
