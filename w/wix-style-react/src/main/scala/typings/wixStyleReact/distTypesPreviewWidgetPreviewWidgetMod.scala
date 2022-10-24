package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPreviewWidgetPreviewWidgetMod {
  
  /** Preview content widget*/
  @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", JSImport.Default)
  @js.native
  open class default protected () extends PreviewWidget {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps.children")
      @js.native
      def children: Element = js.native
      inline def children_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps.contentOutline")
      @js.native
      def contentOutline: String = js.native
      inline def contentOutline_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentOutline")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps.height")
      @js.native
      def height: String = js.native
      inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps.scrollable")
      @js.native
      def scrollable: Boolean = js.native
      inline def scrollable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.defaultProps.width")
      @js.native
      def width: String = js.native
      inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Sets content area background color in HEX code. Can be set with custom colors (from WSR design system color palette) */
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.backgroundColor")
      @js.native
      def backgroundColor: Requireable[String] = js.native
      inline def backgroundColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
      
      /** Sets the main preview content. Accepts an image, text paragraph or any other custom element */
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.children")
      @js.native
      def children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def children_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applies a CSS class to the component's root element */
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Sets the content outline as `shadow` (default), `border` or `none`*/
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.contentOutline")
      @js.native
      def contentOutline: Requireable[String] = js.native
      inline def contentOutline_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentOutline")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute to be used in the tests*/
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Adjusts the height of the component or can be set in specific % or px */
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.height")
      @js.native
      def height: Requireable[String] = js.native
      inline def height_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      /** Enables vertical scroll of the overflowed content **/
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.scrollable")
      @js.native
      def scrollable: Requireable[Boolean] = js.native
      inline def scrollable_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollable")(x.asInstanceOf[js.Any])
      
      /** Sets the color of the content area background (`neutral` or `gradient`). To use custom skin color, set it to `custom` and use the `backgroundColor` prop*/
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Sets the width of the component in % or px */
      @JSImport("wix-style-react/dist/types/PreviewWidget/PreviewWidget", "default.propTypes.width")
      @js.native
      def width: Requireable[String] = js.native
      inline def width_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  /** Preview content widget*/
  @js.native
  trait PreviewWidget extends PureComponent[Any, Any, Any]
}
