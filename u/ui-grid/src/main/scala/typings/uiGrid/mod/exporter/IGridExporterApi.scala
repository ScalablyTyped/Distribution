package typings.uiGrid.mod.exporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridExporterApi extends js.Object {
  /**
    * Exports rows from the grid in csv format, the data exported is selected based on the provided options
    * @param {string} rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
    * @param {string} colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE
    */
  def csvExport(rowTypes: String, colTypes: String): Unit = js.native
  /**
    * Exports rows from the grid in pdf format, the data exported is selected based on the provided options
    * Note that this function has a dependency on pdfMake, all going well this has been installed for you. The
    * resulting pdf opens in a new browser window.
    * @param {string} rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
    * @param {string} colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE
    */
  def pdfExport(rowTypes: String, colTypes: String): Unit = js.native
}

object IGridExporterApi {
  @scala.inline
  def apply(csvExport: (String, String) => Unit, pdfExport: (String, String) => Unit): IGridExporterApi = {
    val __obj = js.Dynamic.literal(csvExport = js.Any.fromFunction2(csvExport), pdfExport = js.Any.fromFunction2(pdfExport))
    __obj.asInstanceOf[IGridExporterApi]
  }
  @scala.inline
  implicit class IGridExporterApiOps[Self <: IGridExporterApi] (val x: Self) extends AnyVal {
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
    def setCsvExport(value: (String, String) => Unit): Self = this.set("csvExport", js.Any.fromFunction2(value))
    @scala.inline
    def setPdfExport(value: (String, String) => Unit): Self = this.set("pdfExport", js.Any.fromFunction2(value))
  }
  
}

