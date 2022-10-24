package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.wixStyleReact.anon.Focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableTitleEditableTitleMod {
  
  @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", JSImport.Default)
  @js.native
  open class default protected () extends EditableTitle {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.defaultProps.defaultValue")
      @js.native
      val defaultValue: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.defaultValue_1")
      @js.native
      val defaultValue1: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.initialValue")
      @js.native
      val initialValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.maxLength")
      @js.native
      val maxLength: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.onSubmit")
      @js.native
      val onSubmit: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/EditableTitle/EditableTitle", "default.propTypes.value")
      @js.native
      val value: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait EditableTitle extends Component[Any, Any, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableTitle(): Unit = js.native
    
    def onChange(e: Any): Unit = js.native
    
    def onEnterPressed(): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onValueSubmission(): Unit = js.native
    
    def showPlaceholder(): Any = js.native
    
    @JSName("state")
    var state_EditableTitle: Focus = js.native
    
    var wsrInput: js.UndefOr[typings.wixStyleReact.distTypesInputInputMod.default | Null] = js.native
  }
}
