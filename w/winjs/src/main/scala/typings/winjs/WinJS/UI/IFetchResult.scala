package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains items that were requested from an IListDataAdapter and provides some information about those items.
  **/
trait IFetchResult[T] extends StObject {
  
  //#region Properties
  /**
    * Gets or sets the index of the requested item in the IListDataAdapter object's data source.
    **/
  var absoluteIndex: Double
  
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the last items at the end of the IListDataAdapter object's data source.
    **/
  var atEnd: Boolean
  
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the first items at the beginning of the IListDataAdapter object's data source.
    **/
  var atStart: Boolean
  
  /**
    * Gets or sets the items returned by the fetch operation.
    **/
  var items: js.Array[T]
  
  /**
    * Gets or sets the location of the requested item within the items array.
    **/
  var offset: Double
  
  /**
    * Gets or sets the number of items in the IListDataAdapter object's underlying data source.
    **/
  var totalCount: Double
}
object IFetchResult {
  
  inline def apply[T](
    absoluteIndex: Double,
    atEnd: Boolean,
    atStart: Boolean,
    items: js.Array[T],
    offset: Double,
    totalCount: Double
  ): IFetchResult[T] = {
    val __obj = js.Dynamic.literal(absoluteIndex = absoluteIndex.asInstanceOf[js.Any], atEnd = atEnd.asInstanceOf[js.Any], atStart = atStart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchResult[T]]
  }
  
  extension [Self <: IFetchResult[?], T](x: Self & IFetchResult[T]) {
    
    inline def setAbsoluteIndex(value: Double): Self = StObject.set(x, "absoluteIndex", value.asInstanceOf[js.Any])
    
    inline def setAtEnd(value: Boolean): Self = StObject.set(x, "atEnd", value.asInstanceOf[js.Any])
    
    inline def setAtStart(value: Boolean): Self = StObject.set(x, "atStart", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
