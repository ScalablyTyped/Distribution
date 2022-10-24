package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBrowserPreviewWidgetBrowserPreviewWidgetMod {
  
  /** Browser preview widget */
  @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", JSImport.Default)
  @js.native
  open class default protected () extends BrowserPreviewWidget {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.defaultProps.browserBarSize")
      @js.native
      def browserBarSize: String = js.native
      inline def browserBarSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserBarSize")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.defaultProps.height")
      @js.native
      def height: String = js.native
      inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.defaultProps.width")
      @js.native
      def width: String = js.native
      inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Mobile preview widget background color. Can be set with `design system` colors*/
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.backgroundColor")
      @js.native
      def backgroundColor: Requireable[String] = js.native
      inline def backgroundColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
      
      /** Browser bar height */
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.browserBarSize")
      @js.native
      def browserBarSize: Requireable[String] = js.native
      inline def browserBarSize_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("browserBarSize")(x.asInstanceOf[js.Any])
      
      /** Node to preview */
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.children")
      @js.native
      def children: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def children_=(x: Validator[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests*/
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Sets the height of the component.*/
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.height")
      @js.native
      def height: Requireable[String] = js.native
      inline def height_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      /** Background skin. To use `custom` skin, set it to `custom` and use the `backgroundColor` prop*/
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Sets the width of the component */
      @JSImport("wix-style-react/dist/types/BrowserPreviewWidget/BrowserPreviewWidget", "default.propTypes.width")
      @js.native
      def width: Requireable[String] = js.native
      inline def width_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  /** Browser preview widget */
  @js.native
  trait BrowserPreviewWidget extends PureComponent[Any, Any, Any]
}
