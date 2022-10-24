package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageBoxMarketerialLayoutMessageBoxMarketerialLayoutMod {
  
  @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", JSImport.Default)
  @js.native
  open class default protected () extends MessageBoxMarketerialLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.defaultProps.noBodyPadding_1")
      @js.native
      val noBodyPadding1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.defaultProps.removeButtonsPadding_1")
      @js.native
      val removeButtonsPadding1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.defaultProps.theme_1")
      @js.native
      val theme1: String = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.defaultProps.width_1")
      @js.native
      val width1: String = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.content")
      @js.native
      val content: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.footerBottomChildren")
      @js.native
      val footerBottomChildren: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.imageComponent")
      @js.native
      val imageComponent: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.imageUrl")
      @js.native
      val imageUrl: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.noBodyPadding")
      @js.native
      val noBodyPadding: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.onClose")
      @js.native
      val onClose: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.onPrimaryButtonClick")
      @js.native
      val onPrimaryButtonClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.onSecondaryButtonClick")
      @js.native
      val onSecondaryButtonClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.primaryButtonDisabled")
      @js.native
      val primaryButtonDisabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.primaryButtonLabel")
      @js.native
      val primaryButtonLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.primaryButtonNode")
      @js.native
      val primaryButtonNode: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.primaryButtonTheme")
      @js.native
      val primaryButtonTheme: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.removeButtonsPadding")
      @js.native
      val removeButtonsPadding: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.secondaryButtonLabel")
      @js.native
      val secondaryButtonLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.theme")
      @js.native
      val theme: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.title")
      @js.native
      val title: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      
      @JSImport("wix-style-react/dist/types/MessageBoxMarketerialLayout/MessageBoxMarketerialLayout", "default.propTypes.width")
      @js.native
      val width: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait MessageBoxMarketerialLayout extends PureComponent[Any, Any, Any] {
    
    def _renderButtons(newColorsBranding: Any): Element = js.native
  }
}
