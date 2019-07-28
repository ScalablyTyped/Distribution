package typings.winjs.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains items that were requested from an IListDataAdapter and provides some information about those items.
  **/
trait IFetchResult[T] extends js.Object {
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
  @scala.inline
  def apply[T](
    absoluteIndex: Double,
    atEnd: Boolean,
    atStart: Boolean,
    items: js.Array[T],
    offset: Double,
    totalCount: Double
  ): IFetchResult[T] = {
    val __obj = js.Dynamic.literal(absoluteIndex = absoluteIndex, atEnd = atEnd, atStart = atStart, items = items, offset = offset, totalCount = totalCount)
  
    __obj.asInstanceOf[IFetchResult[T]]
  }
}

