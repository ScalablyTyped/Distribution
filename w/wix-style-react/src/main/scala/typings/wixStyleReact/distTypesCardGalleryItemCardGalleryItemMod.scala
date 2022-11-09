package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DisabledMessage
import typings.wixStyleReact.anon.IsFocused
import typings.wixStyleReact.anon.LabelOnClick
import typings.wixStyleReact.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardGalleryItemCardGalleryItemMod {
  
  @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", JSImport.Default)
  @js.native
  open class default protected () extends CardGalleryItem {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.defaultProps.aspectRatio")
      @js.native
      def aspectRatio: Double = js.native
      inline def aspectRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.defaultProps.primaryActionProps")
      @js.native
      def primaryActionProps: `3` = js.native
      inline def primaryActionProps_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryActionProps")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Recommended values:
        * - Square - 1
        * - Portrait - 3/4
        * - Cinema - 16/9
        * - Landscape - 4/3
        * - Custom number (e.g. 1.5)
        */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.aspectRatio")
      @js.native
      def aspectRatio: Requireable[String | Double] = js.native
      inline def aspectRatio_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
      
      /** Accepts any component to be rendered as a background image. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.backgroundImageNode")
      @js.native
      def backgroundImageNode: Requireable[ReactNodeLike] = js.native
      inline def backgroundImageNode_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageNode")(x.asInstanceOf[js.Any])
      
      /** Specifies background image URL. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.backgroundImageUrl")
      @js.native
      def backgroundImageUrl: Requireable[String] = js.native
      inline def backgroundImageUrl_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundImageUrl")(x.asInstanceOf[js.Any])
      
      /** Accepts a <Badge/> or any other static indicator. Passed element will be displayed at the top left corner of a card. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.badge")
      @js.native
      def badge: Requireable[ReactNodeLike] = js.native
      inline def badge_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("badge")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /**
        Show disabled drag handle
        */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.dragDisabled")
      @js.native
      def dragDisabled: Requireable[Boolean] = js.native
      inline def dragDisabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragDisabled")(x.asInstanceOf[js.Any])
      
      /**
        Extra props to pass to the `<DragHandle />` element
        */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.dragHandleProps")
      @js.native
      def dragHandleProps: Requireable[js.Object] = js.native
      inline def dragHandleProps_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragHandleProps")(x.asInstanceOf[js.Any])
      
      /**
        Show drag handle
        */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.draggable")
      @js.native
      def draggable: Requireable[Boolean] = js.native
      inline def draggable_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("draggable")(x.asInstanceOf[js.Any])
      
      /**
        * Indicates the element is dragging
        */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.dragging")
      @js.native
      def dragging: Requireable[Boolean] = js.native
      inline def dragging_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragging")(x.asInstanceOf[js.Any])
      
      /**
        * Removes buttons when other element is dragging and this card is droppable
        */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.droppable")
      @js.native
      def droppable: Requireable[Boolean] = js.native
      inline def droppable_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("droppable")(x.asInstanceOf[js.Any])
      
      /** Defines properties for the primary action button. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.primaryActionProps")
      @js.native
      def primaryActionProps: Validator[InferProps[DisabledMessage]] = js.native
      inline def primaryActionProps_=(x: Validator[InferProps[DisabledMessage]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryActionProps")(x.asInstanceOf[js.Any])
      
      /** Defines properties for the secondary action button. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.secondaryActionProps")
      @js.native
      def secondaryActionProps: Requireable[InferProps[LabelOnClick]] = js.native
      inline def secondaryActionProps_=(x: Requireable[InferProps[LabelOnClick]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryActionProps")(x.asInstanceOf[js.Any])
      
      /** Defines a popover menu to be displayed on hover at the top right corner or a card. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.settingsMenu")
      @js.native
      def settingsMenu: Requireable[ReactNodeLike] = js.native
      inline def settingsMenu_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settingsMenu")(x.asInstanceOf[js.Any])
      
      /** Set card size. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Set card subtitle. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.subtitle")
      @js.native
      def subtitle: Requireable[ReactNodeLike] = js.native
      inline def subtitle_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      /** Accepts any component to be rendered as a suffix of the card's footer */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.suffix")
      @js.native
      def suffix: Requireable[ReactNodeLike] = js.native
      inline def suffix_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffix")(x.asInstanceOf[js.Any])
      
      /** Specifies the tab order of the component. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.tabIndex")
      @js.native
      def tabIndex: Requireable[Double] = js.native
      inline def tabIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
      
      /** Set card title. */
      @JSImport("wix-style-react/dist/types/CardGalleryItem/CardGalleryItem", "default.propTypes.title")
      @js.native
      def title: Requireable[ReactNodeLike] = js.native
      inline def title_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CardGalleryItem extends PureComponent[Any, Any, Any] {
    
    def _hasFooter(): Boolean = js.native
    
    def _onBlur(): Unit = js.native
    
    def _onFocus(): Unit = js.native
    
    def _onMouseEnter(): Unit = js.native
    
    def _onMouseLeave(): Unit = js.native
    
    def _renderActions(): Element = js.native
    
    def _renderBadge(): Element = js.native
    
    def _renderDragHandle(): Element = js.native
    
    def _renderFooter(): Element = js.native
    
    def _renderSettingsMenu(): Element = js.native
    
    @JSName("state")
    var state_CardGalleryItem: IsFocused = js.native
  }
}
