package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTableSectionElement extends HTMLElement {
  /**
       * Sets or retrieves a value that indicates the table alignment.
       */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var ch: java.lang.String = js.native
  /** @deprecated */
  var chOff: java.lang.String = js.native
  /**
       * Sets or retrieves the number of horizontal rows contained in the object.
       */
  val rows: HTMLCollectionOf[HTMLTableRowElement] = js.native
  /** @deprecated */
  var vAlign: java.lang.String = js.native
  /**
       * Removes the specified row (tr) from the element and from the rows collection.
       * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
       */
  def deleteRow(index: scala.Double): scala.Unit = js.native
  /**
       * Creates a new row (tr) in the table, and adds the row to the rows collection.
       * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
       */
  def insertRow(): HTMLTableRowElement = js.native
  /**
       * Creates a new row (tr) in the table, and adds the row to the rows collection.
       * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
       */
  def insertRow(index: scala.Double): HTMLTableRowElement = js.native
}

@JSGlobal("HTMLTableSectionElement")
@js.native
object HTMLTableSectionElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLTableSectionElement]

