package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransferItemList
  extends /* name */ ScalablyTyped.runtime.NumberDictionary[DataTransferItem] {
  /**
       * Returns the number of items in the drag data store.
       */
  val length: scala.Double = js.native
  /**
       * Adds a new entry for the given data to the drag data store. If the data is plain
       * text  then a type string has to be provided
       * also.
       */
  def add(data: java.lang.String, `type`: java.lang.String): DataTransferItem | scala.Null = js.native
  def add(data: File): DataTransferItem | scala.Null = js.native
  /**
       * Removes all the entries in the drag data store.
       */
  def clear(): scala.Unit = js.native
  def item(index: scala.Double): DataTransferItem = js.native
  /**
       * Removes the indexth entry in the drag data store.
       */
  def remove(index: scala.Double): scala.Unit = js.native
}

@JSGlobal("DataTransferItemList")
@js.native
object DataTransferItemList
  extends ScalablyTyped.runtime.Instantiable0[DataTransferItemList]

