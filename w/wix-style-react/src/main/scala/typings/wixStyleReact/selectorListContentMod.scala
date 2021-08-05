package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorListContentMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/SelectorList/Content", JSImport.Default)
  @js.native
  val default: FC[SelectorListContentProps] = js.native
  
  trait SelectorListContentProps extends StObject {
    
    var checkIsSelected: js.UndefOr[js.Function1[/* item */ SelectorListItem, Boolean]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var emptyState: js.UndefOr[ReactNode] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var imageShape: js.UndefOr[SelectorListImageShape] = js.undefined
    
    var imageSize: js.UndefOr[SelectorListImageSize] = js.undefined
    
    var isEmpty: js.UndefOr[Boolean] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[SelectorListItem]
    
    def loadMore(): Unit
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var noResultsFound: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function1[/* item */ SelectorListItem, Unit]] = js.undefined
    
    var renderNoResults: js.UndefOr[js.Function1[/* searchValue */ String, ReactNode]] = js.undefined
    
    var searchValue: String
  }
  object SelectorListContentProps {
    
    inline def apply(items: js.Array[SelectorListItem], loadMore: () => Unit, searchValue: String): SelectorListContentProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loadMore = js.Any.fromFunction0(loadMore), searchValue = searchValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorListContentProps]
    }
    
    extension [Self <: SelectorListContentProps](x: Self) {
      
      inline def setCheckIsSelected(value: /* item */ SelectorListItem => Boolean): Self = StObject.set(x, "checkIsSelected", js.Any.fromFunction1(value))
      
      inline def setCheckIsSelectedUndefined: Self = StObject.set(x, "checkIsSelected", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEmptyState(value: ReactNode): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
      
      inline def setEmptyStateUndefined: Self = StObject.set(x, "emptyState", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setImageShape(value: SelectorListImageShape): Self = StObject.set(x, "imageShape", value.asInstanceOf[js.Any])
      
      inline def setImageShapeUndefined: Self = StObject.set(x, "imageShape", js.undefined)
      
      inline def setImageSize(value: SelectorListImageSize): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsEmptyUndefined: Self = StObject.set(x, "isEmpty", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setItems(value: js.Array[SelectorListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: SelectorListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLoadMore(value: () => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction0(value))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setNoResultsFound(value: Boolean): Self = StObject.set(x, "noResultsFound", value.asInstanceOf[js.Any])
      
      inline def setNoResultsFoundUndefined: Self = StObject.set(x, "noResultsFound", js.undefined)
      
      inline def setOnToggle(value: /* item */ SelectorListItem => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setRenderNoResults(value: /* searchValue */ String => ReactNode): Self = StObject.set(x, "renderNoResults", js.Any.fromFunction1(value))
      
      inline def setRenderNoResultsUndefined: Self = StObject.set(x, "renderNoResults", js.undefined)
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.rectangular
    - typings.wixStyleReact.wixStyleReactStrings.circle
  */
  trait SelectorListImageShape extends StObject
  object SelectorListImageShape {
    
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
  trait SelectorListImageSize extends StObject
  object SelectorListImageSize {
    
    inline def cinema: typings.wixStyleReact.wixStyleReactStrings.cinema = "cinema".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.cinema]
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def portrait: typings.wixStyleReact.wixStyleReactStrings.portrait = "portrait".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.portrait]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  trait SelectorListItem extends StObject {
    
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
  object SelectorListItem {
    
    inline def apply(id: Double | String): SelectorListItem = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorListItem]
    }
    
    extension [Self <: SelectorListItem](x: Self) {
      
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
  
  type _To = FC[SelectorListContentProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectorListContentMod.foo` */
  override def _to: FC[SelectorListContentProps] = default
}
