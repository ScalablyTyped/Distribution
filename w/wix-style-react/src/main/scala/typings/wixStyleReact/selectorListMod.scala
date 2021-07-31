package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.RenderList
import typings.wixStyleReact.anon.TotalCount
import typings.wixStyleReact.selectorListContentMod.SelectorListImageShape
import typings.wixStyleReact.selectorListContentMod.SelectorListImageSize
import typings.wixStyleReact.selectorListContentMod.SelectorListItem
import typings.wixStyleReact.wixStyleReactBooleans.`false`
import typings.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorListMod {
  
  @JSImport("wix-style-react/dist/es/src/SelectorList", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SelectorListProps, js.Object, js.Any]
  
  type SelectorList = PureComponent[SelectorListProps, js.Object, js.Any]
  
  trait SelectorListCommonProps extends StObject {
    
    var children: js.UndefOr[SelectorListRenderProp] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dataSource: SelectorListDatasourceFn
    
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
    
    var subtitle: js.UndefOr[ReactNode] = js.undefined
    
    var withSearch: js.UndefOr[Boolean] = js.undefined
  }
  object SelectorListCommonProps {
    
    @scala.inline
    def apply(
      dataSource: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
    ): SelectorListCommonProps = {
      val __obj = js.Dynamic.literal(dataSource = js.Any.fromFunction3(dataSource))
      __obj.asInstanceOf[SelectorListCommonProps]
    }
    
    @scala.inline
    implicit class SelectorListCommonPropsMutableBuilder[Self <: SelectorListCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* args */ RenderList => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDataSource(
        value: (/* searchQuery */ String, /* offset */ Double, /* limit */ Double) => js.Promise[TotalCount]
      ): Self = StObject.set(x, "dataSource", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEmptyState(value: ReactNode): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setImageShape(value: SelectorListImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      @scala.inline
      def setImageSize(value: SelectorListImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setInitialAmountToLoad(value: Double): Self = StObject.set(x, "initialAmountToLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialAmountToLoadUndefined: Self = StObject.set(x, "initialAmountToLoad", js.undefined)
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* item */ SelectorListItem => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setRenderNoResults(value: /* searchValue */ String => ReactNode): Self = StObject.set(x, "renderNoResults", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderNoResultsUndefined: Self = StObject.set(x, "renderNoResults", js.undefined)
      
      @scala.inline
      def setSearchDebounceMs(value: Double): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchDebounceMsUndefined: Self = StObject.set(x, "searchDebounceMs", js.undefined)
      
      @scala.inline
      def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactNode): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setWithSearch(value: Boolean): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithSearchUndefined: Self = StObject.set(x, "withSearch", js.undefined)
    }
  }
  
  type SelectorListDatasourceFn = js.Function3[
    /* searchQuery */ String, 
    /* offset */ Double, 
    /* limit */ Double, 
    js.Promise[TotalCount]
  ]
  
  trait SelectorListMultipleProps extends StObject {
    
    var multiple: `true`
  }
  object SelectorListMultipleProps {
    
    @scala.inline
    def apply(): SelectorListMultipleProps = {
      val __obj = js.Dynamic.literal(multiple = true)
      __obj.asInstanceOf[SelectorListMultipleProps]
    }
    
    @scala.inline
    implicit class SelectorListMultiplePropsMutableBuilder[Self <: SelectorListMultipleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectorListProps = SelectorListCommonProps & (SelectorListSingleProps | SelectorListMultipleProps)
  
  type SelectorListRenderProp = js.Function1[/* args */ RenderList, ReactNode]
  
  trait SelectorListSingleProps extends StObject {
    
    var multiple: js.UndefOr[`false`] = js.undefined
  }
  object SelectorListSingleProps {
    
    @scala.inline
    def apply(): SelectorListSingleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectorListSingleProps]
    }
    
    @scala.inline
    implicit class SelectorListSinglePropsMutableBuilder[Self <: SelectorListSingleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    }
  }
}
