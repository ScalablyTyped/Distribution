package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.FadeIndication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAvatarAvatarMod {
  
  /**
    * Avatar is a type of element that visually represents a user, either as an image, name initials or placeholder icon.
    */
  @JSImport("wix-style-react/dist/types/Avatar/Avatar", JSImport.Default)
  @js.native
  open class default protected () extends Avatar {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.defaultProps.shape_1")
      @js.native
      val shape1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.defaultProps.showIndicationOnHover_1")
      @js.native
      val showIndicationOnHover1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.ariaLabel")
      @js.native
      val ariaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.color")
      @js.native
      val color: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.customIndication")
      @js.native
      val customIndication: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.imgProps")
      @js.native
      val imgProps: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.indication")
      @js.native
      val indication: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.loading")
      @js.native
      val loading: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.name")
      @js.native
      val name: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.onClick")
      @js.native
      val onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.onIndicationClick")
      @js.native
      val onIndicationClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.placeholder")
      @js.native
      val placeholder: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.presence")
      @js.native
      val presence: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.shape")
      @js.native
      val shape: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.showIndicationOnHover")
      @js.native
      val showIndicationOnHover: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.text")
      @js.native
      val text: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Avatar/Avatar", "default.propTypes.title")
      @js.native
      val title: Requireable[String] = js.native
    }
  }
  
  /**
    * Avatar is a type of element that visually represents a user, either as an image, name initials or placeholder icon.
    */
  @js.native
  trait Avatar extends PureComponent[Any, Any, Any] {
    
    def _onMouseEnter(): Unit = js.native
    
    def _onMouseLeave(): Unit = js.native
    
    @JSName("state")
    var state_Avatar: FadeIndication = js.native
  }
}
