package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMarketingLayoutMarketingLayoutMod {
  
  /** Marketing layout is a layout designed to promote new features or display first time visit.
    * Component has title, description, action and illustration areas. */
  @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", JSImport.Default)
  @js.native
  open class default protected () extends MarketingLayout {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.defaultProps.alignItems")
      @js.native
      def alignItems: String = js.native
      inline def alignItems_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.defaultProps.direction")
      @js.native
      def direction: String = js.native
      inline def direction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.defaultProps.hiddenBadge")
      @js.native
      def hiddenBadge: Boolean = js.native
      inline def hiddenBadge_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenBadge")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.defaultProps.inverted")
      @js.native
      def inverted: Boolean = js.native
      inline def inverted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inverted")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Sets marketing layout actions. Accepts single or multiple interactive components. Most commonly contain `<Button/>` or `<TextButton/>`. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.actions")
      @js.native
      def actions: Requireable[ReactNodeLike] = js.native
      inline def actions_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("actions")(x.asInstanceOf[js.Any])
      
      /** Controls the vertical alignment of the content. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.alignItems")
      @js.native
      def alignItems: Requireable[String] = js.native
      inline def alignItems_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignItems")(x.asInstanceOf[js.Any])
      
      /** Adds a container for a `<Badge/>` component at the top left corner. Affect component height. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.badge")
      @js.native
      def badge: Requireable[ReactNodeLike] = js.native
      inline def badge_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badge")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Sets the marketing layout description. Accepts text string or a custom element. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.description")
      @js.native
      def description: Requireable[ReactNodeLike] = js.native
      inline def description_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
      
      /** Controls content direction. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.direction")
      @js.native
      def direction: Requireable[String] = js.native
      inline def direction_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the badge is hidden. Can be used to add additional vertical spacing, if no badge is given. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.hiddenBadge")
      @js.native
      def hiddenBadge: Requireable[Boolean] = js.native
      inline def hiddenBadge_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hiddenBadge")(x.asInstanceOf[js.Any])
      
      /** Accepts image URL or a custom element to be displayed on the side of content. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.image")
      @js.native
      def image: Requireable[ReactNodeLike] = js.native
      
      /** Specifies image area background color. Can be a keyword from color palette or any supported CSS color value (HEX, RGB, etc.). */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.imageBackgroundColor")
      @js.native
      def imageBackgroundColor: Requireable[String] = js.native
      inline def imageBackgroundColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageBackgroundColor")(x.asInstanceOf[js.Any])
      
      inline def image_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
      
      /** Flips content layout. If true, image will be displayed on the left side of the content. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.inverted")
      @js.native
      def inverted: Requireable[Boolean] = js.native
      inline def inverted_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inverted")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the size of the marketing layout.<br/>
        */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Sets the marketing layout title. Accepts text string or a custom element. */
      @JSImport("wix-style-react/dist/types/MarketingLayout/MarketingLayout", "default.propTypes.title")
      @js.native
      def title: Requireable[ReactNodeLike] = js.native
      inline def title_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  /** Marketing layout is a layout designed to promote new features or display first time visit.
    * Component has title, description, action and illustration areas. */
  @js.native
  trait MarketingLayout extends PureComponent[Any, Any, Any] {
    
    def _renderContent(): Element = js.native
    
    def _renderContentCell(span: Any): Element = js.native
    
    def _renderHorizontalCells(): js.Array[`false` | Element] = js.native
    
    def _renderImageCell(span: Any): Element = js.native
    
    def _renderImagePlaceholder(): Element = js.native
    
    def _renderSpacerCell(span: Any): Element = js.native
    
    def _renderVerticalCells(): js.Array[Any] = js.native
  }
}
