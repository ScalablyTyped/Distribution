package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTransferItem extends js.Object {
  /**
       * Returns the drag data item kind, one of: "string",
       * "file".
       */
  val kind: java.lang.String = js.native
  /**
       * Returns the drag data item type string.
       */
  val `type`: java.lang.String = js.native
  /**
       * Returns a File object, if the drag data item kind is File.
       */
  def getAsFile(): File | scala.Null = js.native
  /**
       * Invokes the callback with the string data as the argument, if the drag data item
       * kind is Plain Unicode string.
       */
  def getAsString(): scala.Unit = js.native
  /**
       * Invokes the callback with the string data as the argument, if the drag data item
       * kind is Plain Unicode string.
       */
  def getAsString(callback: FunctionStringCallback): scala.Unit = js.native
  def webkitGetAsEntry(): js.Any = js.native
}

@JSGlobal("DataTransferItem")
@js.native
object DataTransferItem
  extends ScalablyTyped.runtime.Instantiable0[DataTransferItem]

