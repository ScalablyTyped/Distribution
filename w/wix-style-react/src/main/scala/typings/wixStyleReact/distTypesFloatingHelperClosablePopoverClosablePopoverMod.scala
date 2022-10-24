package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.Mode
import typings.wixStyleReact.anon.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperClosablePopoverClosablePopoverMod {
  
  /**
    * Closable Popover
    * Either a normal Controlled Popover, or a Popover that is initially opened and can be the closed by
    * calling a closeAction.
    */
  @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", JSImport.Default)
  @js.native
  open class default protected () extends ClosablePopover {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.defaultProps.closeOnMouseLeave")
      @js.native
      val closeOnMouseLeave: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.defaultProps.hideDelay")
      @js.native
      val hideDelay: Double = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.defaultProps.initiallyOpened")
      @js.native
      val initiallyOpened: Boolean = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.closeOnMouseLeave_1")
      @js.native
      val closeOnMouseLeave1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.content")
      @js.native
      val content: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.initiallyOpened_1")
      @js.native
      val initiallyOpened1: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.onOpen")
      @js.native
      val onOpen: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.opened")
      @js.native
      val opened: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FloatingHelper/ClosablePopover/ClosablePopover", "default.propTypes.target")
      @js.native
      val target: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
    }
  }
  
  /**
    * Closable Popover
    * Either a normal Controlled Popover, or a Popover that is initially opened and can be the closed by
    * calling a closeAction.
    */
  @js.native
  trait ClosablePopover extends PureComponent[Any, Any, Any] {
    
    def _doOpen(nextMode: Any): Unit = js.native
    
    def _handleMouseEnter(): Unit = js.native
    
    def _handleMouseLeave(): Unit = js.native
    
    def _isControlled(): Boolean = js.native
    
    var actions: `6` = js.native
    
    def close(): Unit = js.native
    
    def open(): Unit = js.native
    
    @JSName("state")
    var state_ClosablePopover: Mode = js.native
  }
}
