package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.Items
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalSelectorLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/ModalSelectorLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[ModalSelectorLayoutProps, js.Object, js.Any]
  
  type ModalSelectorLayout = PureComponent[ModalSelectorLayoutProps, js.Object, js.Any]
  
  trait ModalSelectorLayoutCommonProps extends StObject {
    
    var cancelButtonText: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dataSource: ModalSelectorLayoutDatasourceFn
    
    var deselectAllText: js.UndefOr[String] = js.undefined
    
    var disableConfirmation: js.UndefOr[Boolean] = js.undefined
    
    var emptyState: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var imageShape: js.UndefOr[ModalSelectorLayoutImageShape] = js.undefined
    
    var imageSize: js.UndefOr[ModalSelectorLayoutImageSize] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var noResultsFoundStateFactory: js.UndefOr[js.Function1[/* searchValue */ String, ReactNode]] = js.undefined
    
    var okButtonText: js.UndefOr[String] = js.undefined
    
    var onCancel: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClose: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* item */ ModalSelectorLayoutItem, Unit]] = js.undefined
    
    var searchDebounceMs: js.UndefOr[Double] = js.undefined
    
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    var selectAllText: js.UndefOr[String] = js.undefined
    
    var sideActions: js.UndefOr[ReactNode] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var withSearch: js.UndefOr[Boolean] = js.undefined
  }
  object ModalSelectorLayoutCommonProps {
    
    @scala.inline
    def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[Items]
    ): ModalSelectorLayoutCommonProps = {
      val __obj = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      __obj.asInstanceOf[ModalSelectorLayoutCommonProps]
    }
    
    @scala.inline
    implicit class ModalSelectorLayoutCommonPropsMutableBuilder[Self <: ModalSelectorLayoutCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDataSource(value: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[Items]): Self = StObject.set(x, "dataSource", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      @scala.inline
      def setDisableConfirmation(value: Boolean): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableConfirmationUndefined: Self = StObject.set(x, "disableConfirmation", js.undefined)
      
      @scala.inline
      def setEmptyState(value: ReactNode): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageShape(value: ModalSelectorLayoutImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      @scala.inline
      def setImageSize(value: ModalSelectorLayoutImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setNoResultsFoundStateFactory(value: /* searchValue */ String => ReactNode): Self = StObject.set(x, "noResultsFoundStateFactory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNoResultsFoundStateFactoryUndefined: Self = StObject.set(x, "noResultsFoundStateFactory", js.undefined)
      
      @scala.inline
      def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkButtonTextUndefined: Self = StObject.set(x, "okButtonText", js.undefined)
      
      @scala.inline
      def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* item */ ModalSelectorLayoutItem => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSearchDebounceMs(value: Double): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchDebounceMsUndefined: Self = StObject.set(x, "searchDebounceMs", js.undefined)
      
      @scala.inline
      def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      @scala.inline
      def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      @scala.inline
      def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithSearchUndefined: Self = StObject.set(x, "withSearch", js.undefined)
    }
  }
  
  type ModalSelectorLayoutDatasourceFn = js.Function3[/* searchQuery */ String, /* offset */ Double, /* limit */ Double, js.Promise[Items]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.rectangular
    - typings.wixStyleReact.wixStyleReactStrings.circle
  */
  trait ModalSelectorLayoutImageShape extends StObject
  object ModalSelectorLayoutImageShape {
    
    @scala.inline
    def circle: typings.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.circle]
    
    @scala.inline
    def rectangular: typings.wixStyleReact.wixStyleReactStrings.rectangular = "rectangular".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.rectangular]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.portrait
    - typings.wixStyleReact.wixStyleReactStrings.large
    - typings.wixStyleReact.wixStyleReactStrings.cinema
  */
  trait ModalSelectorLayoutImageSize extends StObject
  object ModalSelectorLayoutImageSize {
    
    @scala.inline
    def cinema: typings.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.cinema]
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def portrait: typings.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.portrait]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    @scala.inline
    def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  trait ModalSelectorLayoutItem extends StObject {
    
    var belowNode: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var extraNode: js.UndefOr[ReactNode] = js.undefined
    
    var extraText: js.UndefOr[String] = js.undefined
    
    var id: Double | String
    
    var image: js.UndefOr[ReactNode] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var showBelowNodeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var subtitleNode: js.UndefOr[ReactNode] = js.undefined
    
    var title: ReactNode
  }
  object ModalSelectorLayoutItem {
    
    @scala.inline
    def apply(id: Double | String): ModalSelectorLayoutItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalSelectorLayoutItem]
    }
    
    @scala.inline
    implicit class ModalSelectorLayoutItemMutableBuilder[Self <: ModalSelectorLayoutItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBelowNode(value: ReactNode): Self = StObject.set(x, "belowNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBelowNodeUndefined: Self = StObject.set(x, "belowNode", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExtraNode(value: ReactNode): Self = StObject.set(x, "extraNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraNodeUndefined: Self = StObject.set(x, "extraNode", js.undefined)
      
      @scala.inline
      def setExtraText(value: String): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraTextUndefined: Self = StObject.set(x, "extraText", js.undefined)
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShowBelowNodeOnSelect(value: Boolean): Self = StObject.set(x, "showBelowNodeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowBelowNodeOnSelectUndefined: Self = StObject.set(x, "showBelowNodeOnSelect", js.undefined)
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleNode(value: ReactNode): Self = StObject.set(x, "subtitleNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleNodeUndefined: Self = StObject.set(x, "subtitleNode", js.undefined)
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ModalSelectorLayoutMultipleProps extends StObject {
    
    var multiple: `true`
    
    var onOk: js.UndefOr[js.Function1[/* selectedItems */ js.Array[ModalSelectorLayoutItem], Unit]] = js.undefined
  }
  object ModalSelectorLayoutMultipleProps {
    
    @scala.inline
    def apply(): ModalSelectorLayoutMultipleProps = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[ModalSelectorLayoutMultipleProps]
    }
    
    @scala.inline
    implicit class ModalSelectorLayoutMultiplePropsMutableBuilder[Self <: ModalSelectorLayoutMultipleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOk(value: /* selectedItems */ js.Array[ModalSelectorLayoutItem] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  type ModalSelectorLayoutProps = ModalSelectorLayoutCommonProps & (ModalSelectorLayoutSingleProps | ModalSelectorLayoutMultipleProps)
  
  trait ModalSelectorLayoutSingleProps extends StObject {
    
    var multiple: js.UndefOr[`false`] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* selectedItem */ ModalSelectorLayoutItem, Unit]] = js.undefined
  }
  object ModalSelectorLayoutSingleProps {
    
    @scala.inline
    def apply(): ModalSelectorLayoutSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalSelectorLayoutSingleProps]
    }
    
    @scala.inline
    implicit class ModalSelectorLayoutSinglePropsMutableBuilder[Self <: ModalSelectorLayoutSingleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnOk(value: /* selectedItem */ ModalSelectorLayoutItem => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
}
