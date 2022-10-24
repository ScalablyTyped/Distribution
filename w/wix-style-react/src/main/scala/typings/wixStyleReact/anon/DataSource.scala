package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /** applied as data-hook HTML attribute that can be used to create driver in testing */
  var dataHook: Requireable[String]
  
  /**
    * paging function that should have a signature of
    * ```typescript
    * (searchQuery: string, offset: number, limit: number) =>
    * Promise<{
    *  items: Array<{
    *    id: number | string,
    *    title: node,
    *    subtitle?: string,
    *    extraText?: string,
    *    extraNode?: node,
    *    disabled?: boolean // show item as disabled, dont count it in "select all", exclude from `onOk`
    *    selected?: boolean // force item as selected
    *    image?: node
    *    subtitleNode?: node,
    *    belowNode?: node,
    *    showBelowNodeOnSelect?: boolean,
    *  }>,
    *  totalCount: number
    * }>
    * ```
    * `offset` - next requested item's index<br>
    * `limit` - number of items requested<br>
    * `totalCount` - total number of items that suffice the current search query
    * */
  var dataSource: Validator[js.Function1[/* repeated */ Any, Any]]
  
  /** string to be displayed in footer when `multiple` prop is used and some or all items ar selected */
  var deselectAllText: Requireable[String]
  
  /**
    * Component/element that will be rendered when there is nothing to display,
    * i.e. empty `{items:[], totalCount: 0}` was returned on the first call to `dataSource`
    * */
  var emptyState: Requireable[ReactNodeLike]
  
  /** Height classes property, sets the height of the list container */
  var height: Requireable[String]
  
  /**
    * Image icon shape, `rectangular` or `circle`.<br>
    * NOTE: `circle` is not compatible with `imageSize` of `portrait` or `cinema`
    * */
  def imageShape(props: Any, propName: Any, componentName: Any): js.UndefOr[js.Error]
  
  /** Image icon size */
  var imageSize: Requireable[String]
  
  /** amount of items to load on initial render or after search */
  var initialAmountToLoad: Requireable[Double]
  
  /** Number of items loaded each time the user scrolls down */
  var itemsPerPage: Requireable[Double]
  
  /** Max-height classes property, sets the maximum height of the list container. */
  var maxHeight: Requireable[String]
  
  /** display checkbox and allow multi selection */
  var multiple: Requireable[Boolean]
  
  /** callback that triggers on select and return selected item object*/
  var onSelect: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /**
    * Function that will get the current `searchQuery` and should return the component/element
    * that will be rendered when there are no items that suffice the entered search query
    *  */
  var renderNoResults: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** Search debounce in milliseconds */
  var searchDebounceMs: Requireable[Double]
  
  /** Placeholder text of the search input */
  var searchPlaceholder: Requireable[String]
  
  /** string to be displayed in footer when `multiple` prop is used and no items are selected  */
  var selectAllText: Requireable[String]
  
  /** Fixed text displayed above the list */
  var subtitle: Requireable[ReactNodeLike]
  
  /** Whether to display the search input or not */
  var withSearch: Requireable[Boolean]
}
object DataSource {
  
  inline def apply(
    dataHook: Requireable[String],
    dataSource: Validator[js.Function1[/* repeated */ Any, Any]],
    deselectAllText: Requireable[String],
    emptyState: Requireable[ReactNodeLike],
    height: Requireable[String],
    imageShape: (Any, Any, Any) => js.UndefOr[js.Error],
    imageSize: Requireable[String],
    initialAmountToLoad: Requireable[Double],
    itemsPerPage: Requireable[Double],
    maxHeight: Requireable[String],
    multiple: Requireable[Boolean],
    onSelect: Requireable[js.Function1[/* repeated */ Any, Any]],
    renderNoResults: Requireable[js.Function1[/* repeated */ Any, Any]],
    searchDebounceMs: Requireable[Double],
    searchPlaceholder: Requireable[String],
    selectAllText: Requireable[String],
    subtitle: Requireable[ReactNodeLike],
    withSearch: Requireable[Boolean]
  ): DataSource = {
    val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], deselectAllText = deselectAllText.asInstanceOf[js.Any], emptyState = emptyState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageShape = js.Any.fromFunction3(imageShape), imageSize = imageSize.asInstanceOf[js.Any], initialAmountToLoad = initialAmountToLoad.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], renderNoResults = renderNoResults.asInstanceOf[js.Any], searchDebounceMs = searchDebounceMs.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAllText = selectAllText.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], withSearch = withSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDeselectAllText(value: Requireable[String]): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    inline def setEmptyState(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageShape(value: (Any, Any, Any) => js.UndefOr[js.Error]): Self = StObject.set(x, "imageShape", js.Any.fromFunction3(value))
    
    inline def setImageSize(value: Requireable[String]): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setInitialAmountToLoad(value: Requireable[Double]): Self = StObject.set(x, "initialAmountToLoad", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Requireable[Double]): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Requireable[String]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Requireable[Boolean]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setRenderNoResults(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "renderNoResults", value.asInstanceOf[js.Any])
    
    inline def setSearchDebounceMs(value: Requireable[Double]): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholder(value: Requireable[String]): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSelectAllText(value: Requireable[String]): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setWithSearch(value: Requireable[Boolean]): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
  }
}
