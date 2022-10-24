package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.NewOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableRowEditableRowMod {
  
  @JSImport("wix-style-react/dist/types/EditableSelector/EditableRow/EditableRow", JSImport.Default)
  @js.native
  open class default protected () extends EditableRow {
    def this(props: Any) = this()
  }
  object default {
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableRow/EditableRow", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableRow/EditableRow", "default.propTypes.newOption")
      @js.native
      def newOption: Requireable[String] = js.native
      inline def newOption_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newOption")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableRow/EditableRow", "default.propTypes.onApprove")
      @js.native
      def onApprove: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onApprove_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onApprove")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableRow/EditableRow", "default.propTypes.onCancel")
      @js.native
      def onCancel: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onCancel_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCancel")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditableRow extends Component[Any, Any, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableRow(): Unit = js.native
    
    var input: js.UndefOr[typings.wixStyleReact.distTypesInputMod.default | Null] = js.native
    
    def onApprove(): Unit = js.native
    
    def onCancel(): Unit = js.native
    
    @JSName("state")
    var state_EditableRow: NewOption = js.native
  }
}
