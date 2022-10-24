package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSegmentedToggleToggleIconToggleIconMod {
  
  @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", JSImport.Default)
  @js.native
  open class default protected () extends ToggleIcon {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes.selected")
      @js.native
      def selected: Requireable[Boolean] = js.native
      inline def selected_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes.tooltipProps")
      @js.native
      def tooltipProps: Requireable[InferProps[Any]] = js.native
      inline def tooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes.tooltipText")
      @js.native
      def tooltipText: Requireable[String] = js.native
      inline def tooltipText_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipText")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/ToggleIcon/ToggleIcon", "default.propTypes.value")
      @js.native
      def value: Requireable[String] = js.native
      inline def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleIcon extends Component[Any, Any, Any]
}
