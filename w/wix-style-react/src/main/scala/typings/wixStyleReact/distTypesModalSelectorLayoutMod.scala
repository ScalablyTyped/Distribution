package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.anon.TotalCount
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesModalSelectorLayoutMod {
  
  @JSImport("wix-style-react/dist/types/ModalSelectorLayout", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ModalSelectorLayoutProps, js.Object, Any]
  
  type ModalSelectorLayout = PureComponent[ModalSelectorLayoutProps, js.Object, Any]
  
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
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
    ): ModalSelectorLayoutCommonProps = {
      val __obj = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      __obj.asInstanceOf[ModalSelectorLayoutCommonProps]
    }
    
    extension [Self <: ModalSelectorLayoutCommonProps](x: Self) {
      
      inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataSource(
        value: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
      ): Self = StObject.set(x, "dataSource", js.Any.fromFunction3(value))
      
      inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      inline def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      inline def setDisableConfirmation(value: Boolean): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
      
      inline def setDisableConfirmationUndefined: Self = StObject.set(x, "disableConfirmation", js.undefined)
      
      inline def setEmptyState(value: ReactNode): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
      
      inline def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageShape(value: ModalSelectorLayoutImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setImageSize(value: ModalSelectorLayoutImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setNoResultsFoundStateFactory(value: /* searchValue */ String => ReactNode): Self = StObject.set(x, "noResultsFoundStateFactory", js.Any.fromFunction1(value))
      
      inline def setNoResultsFoundStateFactoryUndefined: Self = StObject.set(x, "noResultsFoundStateFactory", js.undefined)
      
      inline def setOkButtonText(value: String): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
      
      inline def setOkButtonTextUndefined: Self = StObject.set(x, "okButtonText", js.undefined)
      
      inline def setOnCancel(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnClose(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnSelect(value: /* item */ ModalSelectorLayoutItem => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSearchDebounceMs(value: Double): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def setSearchDebounceMsUndefined: Self = StObject.set(x, "searchDebounceMs", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      inline def setSideActions(value: ReactNode): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
      
      inline def setSideActionsUndefined: Self = StObject.set(x, "sideActions", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
      
      inline def setWithSearchUndefined: Self = StObject.set(x, "withSearch", js.undefined)
    }
  }
  
  type ModalSelectorLayoutDatasourceFn = js.Function3[
    /* searchQuery */ String, 
    /* offset */ Double, 
    /* limit */ Double, 
    js.Promise[TotalCount]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.rectangular
    - typings.wixStyleReact.wixStyleReactStrings.circle
  */
  trait ModalSelectorLayoutImageShape extends StObject
  object ModalSelectorLayoutImageShape {
    
    inline def circle: typings.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.circle]
    
    inline def rectangular: typings.wixStyleReact.wixStyleReactStrings.rectangular = "rectangular".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.rectangular]
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
    
    inline def cinema: typings.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.cinema]
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def portrait: typings.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.portrait]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
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
    
    inline def apply(id: Double | String): ModalSelectorLayoutItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalSelectorLayoutItem]
    }
    
    extension [Self <: ModalSelectorLayoutItem](x: Self) {
      
      inline def setBelowNode(value: ReactNode): Self = StObject.set(x, "belowNode", value.asInstanceOf[js.Any])
      
      inline def setBelowNodeUndefined: Self = StObject.set(x, "belowNode", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExtraNode(value: ReactNode): Self = StObject.set(x, "extraNode", value.asInstanceOf[js.Any])
      
      inline def setExtraNodeUndefined: Self = StObject.set(x, "extraNode", js.undefined)
      
      inline def setExtraText(value: String): Self = StObject.set(x, "extraText", value.asInstanceOf[js.Any])
      
      inline def setExtraTextUndefined: Self = StObject.set(x, "extraText", js.undefined)
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: ReactNode): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShowBelowNodeOnSelect(value: Boolean): Self = StObject.set(x, "showBelowNodeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShowBelowNodeOnSelectUndefined: Self = StObject.set(x, "showBelowNodeOnSelect", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleNode(value: ReactNode): Self = StObject.set(x, "subtitleNode", value.asInstanceOf[js.Any])
      
      inline def setSubtitleNodeUndefined: Self = StObject.set(x, "subtitleNode", js.undefined)
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ModalSelectorLayoutMultipleProps extends StObject {
    
    var multiple: `true`
    
    var onOk: js.UndefOr[js.Function1[/* selectedItems */ js.Array[ModalSelectorLayoutItem], Unit]] = js.undefined
  }
  object ModalSelectorLayoutMultipleProps {
    
    inline def apply(): ModalSelectorLayoutMultipleProps = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[ModalSelectorLayoutMultipleProps]
    }
    
    extension [Self <: ModalSelectorLayoutMultipleProps](x: Self) {
      
      inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setOnOk(value: /* selectedItems */ js.Array[ModalSelectorLayoutItem] => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  type ModalSelectorLayoutProps = (ModalSelectorLayoutSingleProps & ModalSelectorLayoutCommonProps) | (ModalSelectorLayoutMultipleProps & ModalSelectorLayoutCommonProps)
  
  trait ModalSelectorLayoutSingleProps extends StObject {
    
    var multiple: js.UndefOr[`false`] = js.undefined
    
    var onOk: js.UndefOr[js.Function1[/* selectedItem */ ModalSelectorLayoutItem, Unit]] = js.undefined
  }
  object ModalSelectorLayoutSingleProps {
    
    inline def apply(): ModalSelectorLayoutSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalSelectorLayoutSingleProps]
    }
    
    extension [Self <: ModalSelectorLayoutSingleProps](x: Self) {
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnOk(value: /* selectedItem */ ModalSelectorLayoutItem => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction1(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
}
