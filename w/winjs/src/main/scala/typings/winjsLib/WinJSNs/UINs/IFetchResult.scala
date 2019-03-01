package typings
package winjsLib.WinJSNs.UINs

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
  var absoluteIndex: scala.Double
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the last items at the end of the IListDataAdapter object's data source.
    **/
  var atEnd: scala.Boolean
  /**
    * Gets or sets a value that indicates whether this IFetchResult contains the first items at the beginning of the IListDataAdapter object's data source.
    **/
  var atStart: scala.Boolean
  /**
    * Gets or sets the items returned by the fetch operation.
    **/
  var items: js.Array[T]
  /**
    * Gets or sets the location of the requested item within the items array.
    **/
  var offset: scala.Double
  /**
    * Gets or sets the number of items in the IListDataAdapter object's underlying data source.
    **/
  var totalCount: scala.Double
}

object IFetchResult {
  @scala.inline
  def apply[T](
    absoluteIndex: scala.Double,
    atEnd: scala.Boolean,
    atStart: scala.Boolean,
    items: js.Array[T],
    offset: scala.Double,
    totalCount: scala.Double
  ): IFetchResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absoluteIndex")(absoluteIndex)
    __obj.updateDynamic("atEnd")(atEnd)
    __obj.updateDynamic("atStart")(atStart)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("totalCount")(totalCount)
    __obj.asInstanceOf[IFetchResult[T]]
  }
}

