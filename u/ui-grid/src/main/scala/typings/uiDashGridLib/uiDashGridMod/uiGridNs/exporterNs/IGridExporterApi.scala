package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridExporterApi extends js.Object {
  /**
    * Exports rows from the grid in csv format, the data exported is selected based on the provided options
    * @param {string} rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
    * @param {string} colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE
    */
  def csvExport(rowTypes: java.lang.String, colTypes: java.lang.String): scala.Unit
  /**
    * Exports rows from the grid in pdf format, the data exported is selected based on the provided options
    * Note that this function has a dependency on pdfMake, all going well this has been installed for you. The
    * resulting pdf opens in a new browser window.
    * @param {string} rowTypes which rows to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE, uiGridExporterConstants.SELECTED
    * @param {string} colTypes which columns to export, valid values are uiGridExporterConstants.ALL,
    * uiGridExporterConstants.VISIBLE
    */
  def pdfExport(rowTypes: java.lang.String, colTypes: java.lang.String): scala.Unit
}

object IGridExporterApi {
  @scala.inline
  def apply(
    csvExport: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    pdfExport: js.Function2[java.lang.String, java.lang.String, scala.Unit]
  ): IGridExporterApi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("csvExport")(csvExport)
    __obj.updateDynamic("pdfExport")(pdfExport)
    __obj.asInstanceOf[IGridExporterApi]
  }
}

