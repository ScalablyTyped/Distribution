package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButtonText extends StObject {
  
  /** Cancel button's text */
  var cancelButtonText: Requireable[String]
  
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
  
  /** to disable confirm button */
  var disableConfirmation: Requireable[Boolean]
  
  /**
    * Component/element that will be rendered when there is nothing to display,
    * i.e. empty `{items:[], totalCount: 0}` was returned on the first call to `dataSource`
    * */
  var emptyState: Requireable[ReactNodeLike]
  
  /** Height CSS property, sets the height of the modal */
  var height: Requireable[String]
  
  /**
    * Image icon shape, `rectangular` or `circle`.<br>
    * NOTE: `circle` is not compatible with `imageSize` of `portrait` or `cinema`
    * */
  def imageShape(props: Any, propName: Any, componentName: Any): js.UndefOr[js.Error]
  
  /** Image icon size */
  var imageSize: Requireable[String]
  
  /** Number of items loaded each time the user scrolls down */
  var itemsPerPage: Requireable[Double]
  
  /** Max-height CSS property, sets the maximum height of the modal. */
  var maxHeight: Requireable[String]
  
  /** display checkbox and allow multi selection */
  var multiple: Requireable[Boolean]
  
  /**
    * Function that will get the current `searchQuery` and should return the component/element
    * that will be rendered when there are no items that suffice the entered search query
    *  */
  var noResultsFoundStateFactory: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** OK button's text */
  var okButtonText: Requireable[String]
  
  /** Cancel button callback */
  var onCancel: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** X button callback */
  var onClose: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** OK button callback, called with the currently selected item  */
  var onOk: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** callback that triggers on select and return selected item object*/
  var onSelect: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  /** Search debounce in milliseconds */
  var searchDebounceMs: Requireable[Double]
  
  /** Placeholder text of the search input */
  var searchPlaceholder: Requireable[String]
  
  /** string to be displayed in footer when `multiple` prop is used and no items are selected  */
  var selectAllText: Requireable[String]
  
  /** Used to display some side component in the footer.
    * Will override element select all in the footer when multiple=true */
  var sideActions: Requireable[ReactNodeLike]
  
  /** Fixed text displayed above the list */
  var subtitle: Requireable[ReactNodeLike]
  
  /** Title of the modal */
  var title: Requireable[ReactNodeLike]
  
  /** Whether to display the search input or not */
  var withSearch: Requireable[Boolean]
}
object CancelButtonText {
  
  inline def apply(
    cancelButtonText: Requireable[String],
    dataHook: Requireable[String],
    dataSource: Validator[js.Function1[/* repeated */ Any, Any]],
    deselectAllText: Requireable[String],
    disableConfirmation: Requireable[Boolean],
    emptyState: Requireable[ReactNodeLike],
    height: Requireable[String],
    imageShape: (Any, Any, Any) => js.UndefOr[js.Error],
    imageSize: Requireable[String],
    itemsPerPage: Requireable[Double],
    maxHeight: Requireable[String],
    multiple: Requireable[Boolean],
    noResultsFoundStateFactory: Requireable[js.Function1[/* repeated */ Any, Any]],
    okButtonText: Requireable[String],
    onCancel: Requireable[js.Function1[/* repeated */ Any, Any]],
    onClose: Requireable[js.Function1[/* repeated */ Any, Any]],
    onOk: Requireable[js.Function1[/* repeated */ Any, Any]],
    onSelect: Requireable[js.Function1[/* repeated */ Any, Any]],
    searchDebounceMs: Requireable[Double],
    searchPlaceholder: Requireable[String],
    selectAllText: Requireable[String],
    sideActions: Requireable[ReactNodeLike],
    subtitle: Requireable[ReactNodeLike],
    title: Requireable[ReactNodeLike],
    withSearch: Requireable[Boolean]
  ): CancelButtonText = {
    val __obj = js.Dynamic.literal(cancelButtonText = cancelButtonText.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], deselectAllText = deselectAllText.asInstanceOf[js.Any], disableConfirmation = disableConfirmation.asInstanceOf[js.Any], emptyState = emptyState.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imageShape = js.Any.fromFunction3(imageShape), imageSize = imageSize.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], noResultsFoundStateFactory = noResultsFoundStateFactory.asInstanceOf[js.Any], okButtonText = okButtonText.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any], searchDebounceMs = searchDebounceMs.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAllText = selectAllText.asInstanceOf[js.Any], sideActions = sideActions.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], withSearch = withSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelButtonText]
  }
  
  extension [Self <: CancelButtonText](x: Self) {
    
    inline def setCancelButtonText(value: Requireable[String]): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: Validator[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDeselectAllText(value: Requireable[String]): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    inline def setDisableConfirmation(value: Requireable[Boolean]): Self = StObject.set(x, "disableConfirmation", value.asInstanceOf[js.Any])
    
    inline def setEmptyState(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "emptyState", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageShape(value: (Any, Any, Any) => js.UndefOr[js.Error]): Self = StObject.set(x, "imageShape", js.Any.fromFunction3(value))
    
    inline def setImageSize(value: Requireable[String]): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Requireable[Double]): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Requireable[String]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Requireable[Boolean]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setNoResultsFoundStateFactory(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "noResultsFoundStateFactory", value.asInstanceOf[js.Any])
    
    inline def setOkButtonText(value: Requireable[String]): Self = StObject.set(x, "okButtonText", value.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnClose(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    
    inline def setOnOk(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
    
    inline def setSearchDebounceMs(value: Requireable[Double]): Self = StObject.set(x, "searchDebounceMs", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholder(value: Requireable[String]): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSelectAllText(value: Requireable[String]): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSideActions(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "sideActions", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWithSearch(value: Requireable[Boolean]): Self = StObject.set(x, "withSearch", value.asInstanceOf[js.Any])
  }
}
