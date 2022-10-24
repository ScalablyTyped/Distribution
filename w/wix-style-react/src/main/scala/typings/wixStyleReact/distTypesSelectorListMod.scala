package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.ItemsTotalCount
import typings.wixStyleReact.anon.RenderList
import typings.wixStyleReact.distTypesSelectorListContentMod.SelectorListImageShape
import typings.wixStyleReact.distTypesSelectorListContentMod.SelectorListImageSize
import typings.wixStyleReact.distTypesSelectorListContentMod.SelectorListItem
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListMod {
  
  @JSImport("wix-style-react/dist/types/SelectorList", JSImport.Default)
  @js.native
  open class default () extends SelectorList
  
  @js.native
  trait SelectorList
    extends PureComponent[SelectorListProps, js.Object, Any] {
    
    def reloadInitialItems(): Unit = js.native
  }
  
  trait SelectorListCommonProps extends StObject {
    
    var children: js.UndefOr[SelectorListRenderProp] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dataSource: SelectorListDatasourceFn
    
    var deselectAllText: js.UndefOr[String] = js.undefined
    
    var emptyState: js.UndefOr[ReactNode] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var imageShape: js.UndefOr[SelectorListImageShape] = js.undefined
    
    var imageSize: js.UndefOr[SelectorListImageSize] = js.undefined
    
    var initialAmountToLoad: js.UndefOr[Double] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[String] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* item */ SelectorListItem, Unit]] = js.undefined
    
    var renderNoResults: js.UndefOr[js.Function1[/* searchValue */ String, ReactNode]] = js.undefined
    
    var searchDebounceMs: js.UndefOr[Double] = js.undefined
    
    var searchPlaceholder: js.UndefOr[String] = js.undefined
    
    var selectAllText: js.UndefOr[String] = js.undefined
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var withSearch: js.UndefOr[Boolean] = js.undefined
  }
  object SelectorListCommonProps {
    
    inline def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[ItemsTotalCount]
    ): SelectorListCommonProps = {
      val __obj = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      __obj.asInstanceOf[SelectorListCommonProps]
    }
    
    extension [Self <: SelectorListCommonProps](x: Self) {
      
      inline def setChildren(value: /* args */ RenderList => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataSource(
        value: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[ItemsTotalCount]
      ): Self = StObject.set(x, "dataSource", js.Any.fromFunction3(value))
      
      inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
      
      inline def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
      
      inline def setEmptyState(value: ReactNode): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
      
      inline def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageShape(value: SelectorListImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setImageSize(value: SelectorListImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setInitialAmountToLoad(value: Double): Self = StObject.set(x, "initialAmountToLoad", value.asInstanceOf[js.Any])
      
      inline def setInitialAmountToLoadUndefined: Self = StObject.set(x, "initialAmountToLoad", js.undefined)
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setOnSelect(value: /* item */ SelectorListItem => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setRenderNoResults(value: /* searchValue */ String => ReactNode): Self = StObject.set(x, "renderNoResults", js.Any.fromFunction1(value))
      
      inline def setRenderNoResultsUndefined: Self = StObject.set(x, "renderNoResults", js.undefined)
      
      inline def setSearchDebounceMs(value: Double): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
      
      inline def setSearchDebounceMsUndefined: Self = StObject.set(x, "searchDebounceMs", js.undefined)
      
      inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
      
      inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
      
      inline def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
      
      inline def setWithSearchUndefined: Self = StObject.set(x, "withSearch", js.undefined)
    }
  }
  
  type SelectorListDatasourceFn = js.Function3[
    /* searchQuery */ String, 
    /* offset */ Double, 
    /* limit */ Double, 
    js.Promise[ItemsTotalCount]
  ]
  
  trait SelectorListMultipleProps extends StObject {
    
    var multiple: `true`
  }
  object SelectorListMultipleProps {
    
    inline def apply(): SelectorListMultipleProps = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[SelectorListMultipleProps]
    }
    
    extension [Self <: SelectorListMultipleProps](x: Self) {
      
      inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectorListProps = (SelectorListSingleProps & SelectorListCommonProps) | (SelectorListMultipleProps & SelectorListCommonProps)
  
  type SelectorListRenderProp = js.Function1[/* args */ RenderList, ReactNode]
  
  trait SelectorListSingleProps extends StObject {
    
    var multiple: js.UndefOr[`false`] = js.undefined
  }
  object SelectorListSingleProps {
    
    inline def apply(): SelectorListSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectorListSingleProps]
    }
    
    extension [Self <: SelectorListSingleProps](x: Self) {
      
      inline def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
}
