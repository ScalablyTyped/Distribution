package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents an item in a list.
    **/

trait IItem[T] extends js.Object {
  //#region Properties
  /**
           * Gets or sets the item's data.
          **/
  var data: T
  /**
           * Gets the group key for the item. This property is only available for items that belong to a grouped data source.
          **/
  var groupKey: java.lang.String
  /**
           * Gets the temporary ID of the item.
          **/
  var handle: java.lang.String
  /**
           * Gets the item's index in the IListDataSource.
          **/
  var index: scala.Double
  /**
           * Gets or sets the key the identifies the item.
          **/
  var key: java.lang.String
}

