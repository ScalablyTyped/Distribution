package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.CancelButtonText
import typings.wixStyleReact.anon.DeselectAllText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalSelectorLayoutModalSelectorLayoutMod {
  
  @JSImport("wix-style-react/dist/types/ModalSelectorLayout/ModalSelectorLayout", JSImport.Default)
  @js.native
  open class default protected () extends ModalSelectorLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ModalSelectorLayout/ModalSelectorLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ModalSelectorLayout/ModalSelectorLayout", "default.defaultProps")
    @js.native
    def defaultProps: DeselectAllText = js.native
    inline def defaultProps_=(x: DeselectAllText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/ModalSelectorLayout/ModalSelectorLayout", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/ModalSelectorLayout/ModalSelectorLayout", "default.propTypes")
    @js.native
    def propTypes: CancelButtonText = js.native
    inline def propTypes_=(x: CancelButtonText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ModalSelectorLayout extends PureComponent[Any, Any, Any] {
    
    def _getEnabledItems(items: Any): Any = js.native
  }
}
