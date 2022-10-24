package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.IsFormShown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRichTextInputAreaToolbarRichTextToolbarLinkButtonMod {
  
  @JSImport("wix-style-react/dist/types/RichTextInputArea/Toolbar/RichTextToolbarLinkButton", JSImport.Default)
  @js.native
  open class default protected () extends RichTextToolbarLinkButton {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  
  @js.native
  trait RichTextToolbarLinkButton extends Component[Any, Any, Any] {
    
    def _onButtonClick(): Unit = js.native
    
    def _onHide(): Unit = js.native
    
    def _onSubmit(event: Any, linkData: Any): Unit = js.native
    
    @JSName("state")
    var state_RichTextToolbarLinkButton: IsFormShown = js.native
  }
}
