package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.PrevEllipsis
import typings.wixStyleReact.anon.TextContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonEllipsisEllipsisMod {
  
  @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", JSImport.Default)
  @js.native
  open class default protected () extends Ellipsis {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.appendTo")
      @js.native
      def appendTo: String = js.native
      inline def appendTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.ellipsis")
      @js.native
      def ellipsis: Boolean = js.native
      inline def ellipsis_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.enterDelay")
      @js.native
      def enterDelay: Double = js.native
      inline def enterDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enterDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.exitDelay")
      @js.native
      def exitDelay: Double = js.native
      inline def exitDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exitDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.fixed")
      @js.native
      def fixed: Boolean = js.native
      inline def fixed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixed")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.flip")
      @js.native
      def flip: Boolean = js.native
      inline def flip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.showTooltip")
      @js.native
      def showTooltip: Boolean = js.native
      inline def showTooltip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.defaultProps.zIndex")
      @js.native
      def zIndex: Any = js.native
      inline def zIndex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: Any, state: Any): PrevEllipsis | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PrevEllipsis | Null]
    
    /* static member */
    @JSImport("wix-style-react/dist/types/common/Ellipsis/Ellipsis", "default.propTypes")
    @js.native
    def propTypes: Any = js.native
    inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Ellipsis extends PureComponent[Any, Any, Any] {
    
    def _checkShouldBeActive(): Any = js.native
    
    /**
      * A callback for resizing the window, must be debounced in order to improve performance.
      * @private
      */
    /* private */ var _debouncedUpdate: Any = js.native
    
    def _getTextContent(): Any = js.native
    
    def _isOverflowingHorizontally(): Any = js.native
    
    def _isOverflowingVertically(): Any = js.native
    
    /**
      * Once text component has rendered,
      * Update text content and tooltip active state
      * @private
      */
    /* private */ var _onTextRendered: Any = js.native
    
    def _renderText(): Element = js.native
    
    /**
      * An ellipsis is considered active when either the text's scroll width/height is wider than it's container or itself.
      * @private
      */
    /* private */ var _updateIsActive: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEllipsis(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEllipsis(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MEllipsis(): Unit = js.native
    
    var ref: RefObject[Any] = js.native
    
    @JSName("state")
    var state_Ellipsis: TextContent = js.native
  }
}
