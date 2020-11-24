package typings.uiGrid.mod.importer

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGridImporterApi extends js.Object {
  
  /**
    * Imports a file into the grid using the file object provided. Bypasses the grid menu
    * @param {File} fileObject The file we want to import as a javascript File object
    */
  def importFile(fileObject: File): Unit = js.native
}
object IGridImporterApi {
  
  @scala.inline
  def apply(importFile: File => Unit): IGridImporterApi = {
    val __obj = js.Dynamic.literal(importFile = js.Any.fromFunction1(importFile))
    __obj.asInstanceOf[IGridImporterApi]
  }
  
  @scala.inline
  implicit class IGridImporterApiOps[Self <: IGridImporterApi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImportFile(value: File => Unit): Self = this.set("importFile", js.Any.fromFunction1(value))
  }
}
