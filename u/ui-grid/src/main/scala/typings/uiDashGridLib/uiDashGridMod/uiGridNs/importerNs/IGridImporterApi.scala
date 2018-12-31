package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.importerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridImporterApi extends js.Object {
  /**
    * Imports a file into the grid using the file object provided. Bypasses the grid menu
    * @param {File} fileObject The file we want to import as a javascript File object
    */
  def importFile(fileObject: stdLib.File): scala.Unit
}

