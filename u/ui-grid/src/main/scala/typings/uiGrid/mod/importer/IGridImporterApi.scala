package typings.uiGrid.mod.importer

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridImporterApi extends js.Object {
  /**
    * Imports a file into the grid using the file object provided. Bypasses the grid menu
    * @param {File} fileObject The file we want to import as a javascript File object
    */
  def importFile(fileObject: File): Unit
}

object IGridImporterApi {
  @scala.inline
  def apply(importFile: File => Unit): IGridImporterApi = {
    val __obj = js.Dynamic.literal(importFile = js.Any.fromFunction1(importFile))
  
    __obj.asInstanceOf[IGridImporterApi]
  }
}

