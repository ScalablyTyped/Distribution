package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AutoHideTimeout
import typings.wixStyleReact.anon.HideByCloseClick
import typings.wixStyleReact.anon.Show
import typings.wixStyleReact.wixStyleReactInts.`6000`
import typings.wixStyleReact.wixStyleReactStrings.global
import typings.wixStyleReact.wixStyleReactStrings.local
import typings.wixStyleReact.wixStyleReactStrings.sticky
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNotificationNotificationMod {
  
  @JSImport("wix-style-react/dist/types/Notification/Notification", JSImport.Default)
  @js.native
  open class default protected () extends Notification {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.defaultProps.onClose_1")
      @js.native
      val onClose1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.defaultProps.theme_1")
      @js.native
      val theme1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Notification/Notification", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.autoHideTimeout")
      @js.native
      val autoHideTimeout: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.show")
      @js.native
      val show: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.theme")
      @js.native
      val theme: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Notification/Notification", "default.propTypes.zIndex")
      @js.native
      val zIndex: Requireable[Double] = js.native
    }
  }
  
  @JSImport("wix-style-react/dist/types/Notification/Notification", "DEFAULT_AUTO_HIDE_TIMEOUT")
  @js.native
  val DEFAULT_AUTO_HIDE_TIMEOUT: `6000` = js.native
  
  @JSImport("wix-style-react/dist/types/Notification/Notification", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: `6000` = js.native
  
  @JSImport("wix-style-react/dist/types/Notification/Notification", "GLOBAL_NOTIFICATION")
  @js.native
  val GLOBAL_NOTIFICATION: global = js.native
  
  @JSImport("wix-style-react/dist/types/Notification/Notification", "LOCAL_NOTIFICATION")
  @js.native
  val LOCAL_NOTIFICATION: local = js.native
  
  @JSImport("wix-style-react/dist/types/Notification/Notification", "STICKY_NOTIFICATION")
  @js.native
  val STICKY_NOTIFICATION: sticky = js.native
  
  @js.native
  trait Notification extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MNotification(nextProps: Any): Unit = js.native
    
    def _bypassCloseFlags(): Unit = js.native
    
    def _clearCloseTimeout(): Unit = js.native
    
    def _clearTransitionTimeout(): Unit = js.native
    
    def _getChildren(): Element | Null = js.native
    
    def _hideNotificationOnCloseClick(): Unit = js.native
    
    def _hideNotificationOnTimeout(): Unit = js.native
    
    def _setChildrenVisibility(param0: Show): Unit = js.native
    
    def _setHeightToChild(node: Any): Any = js.native
    
    def _shouldShowNotification(show: Any): Any = js.native
    
    def _startCloseTimer(param0: AutoHideTimeout): Unit = js.native
    
    var childRef: RefObject[Any] = js.native
    
    var closeTimeout: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MNotification(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MNotification(prevProps: Any, prevState: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNotification(): Unit = js.native
    
    var ref: RefObject[Any] = js.native
    
    @JSName("state")
    var state_Notification: HideByCloseClick = js.native
    
    var transitionTimeout: Any = js.native
  }
}
