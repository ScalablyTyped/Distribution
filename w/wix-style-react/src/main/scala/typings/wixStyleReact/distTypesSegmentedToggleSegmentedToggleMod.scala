package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.wixStyleReact.anon.SelectedAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSegmentedToggleSegmentedToggleMod {
  
  @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", JSImport.Default)
  @js.native
  open class default protected () extends SegmentedToggle {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.defaultProps.children")
      @js.native
      def children: js.Array[scala.Nothing] = js.native
      inline def children_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Accepts <SegmentedToggle.Icon/> or <SegmentedToggle.Button/> as child items to list down available options */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.children")
      @js.native
      def children: Validator[js.Array[Any]] = js.native
      inline def children_=(x: Validator[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Specifies the initially selected option */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.defaultSelected")
      @js.native
      def defaultSelected: Requireable[ReactNodeLike] = js.native
      inline def defaultSelected_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelected")(x.asInstanceOf[js.Any])
      
      /** Specifies whether interactions are disabled. */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called every time option is clicked. Returns a selected element and its value. */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Specifies whether an option is selected */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.selected")
      @js.native
      def selected: Requireable[ReactNodeLike] = js.native
      inline def selected_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      /** Controls the size of the segmented toggle */
      @JSImport("wix-style-react/dist/types/SegmentedToggle/SegmentedToggle", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SegmentedToggle extends Component[Any, Any, Any] {
    
    def _addDividers(childrenNodes: Any, disabled: Any): js.Array[Any] = js.native
    
    def _onClick(evt: Any): Any = js.native
    
    @JSName("state")
    var state_SegmentedToggle: SelectedAny = js.native
  }
}
