package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransfer extends js.Object {
  var dropEffect: java.lang.String = js.native
  var effectAllowed: java.lang.String = js.native
  /**
       * Returns a FileList of the files being dragged, if any.
       */
  val files: FileList = js.native
  /**
       * Returns a DataTransferItemList object, with the drag data.
       */
  val items: DataTransferItemList = js.native
  /**
       * Returns a frozen array listing the formats that were set in the dragstart event. In addition, if any files are being
       * dragged, then one of the types will be the string "Files".
       */
  val types: js.Array[java.lang.String] = js.native
  /**
       * Removes the data of the specified formats. Removes all data if the argument is omitted.
       */
  def clearData(): scala.Unit = js.native
  /**
       * Removes the data of the specified formats. Removes all data if the argument is omitted.
       */
  def clearData(format: java.lang.String): scala.Unit = js.native
  /**
       * Returns the specified data. If there is no such data, returns the empty string.
       */
  def getData(format: java.lang.String): java.lang.String = js.native
  /**
       * Adds the specified data.
       */
  def setData(format: java.lang.String, data: java.lang.String): scala.Unit = js.native
  /**
       * Uses the given element to update the drag feedback, replacing any previously specified
       * feedback.
       */
  def setDragImage(image: Element, x: scala.Double, y: scala.Double): scala.Unit = js.native
}

@JSGlobal("DataTransfer")
@js.native
object DataTransfer
  extends org.scalablytyped.runtime.Instantiable0[DataTransfer]

