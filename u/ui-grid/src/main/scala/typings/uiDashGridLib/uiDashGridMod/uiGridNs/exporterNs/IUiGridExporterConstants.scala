package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridExporterConstants extends js.Object {
  /** export all data, including data not visible.  Can be set for either rowTypes or colTypes */
  var ALL: java.lang.String
  var BUTTON_LABEL: java.lang.String
  var CSV_CONTENT: java.lang.String
  var FILE_NAME: java.lang.String
  /**
    * Export all data, including data not visible.
    * Can be set only for rowTypes, selection of only some columns is not supported
    */
  var SELECTED: java.lang.String
  /** export only visible data, including data not visible.  Can be set for either rowTypes or colTypes */
  var VISIBLE: java.lang.String
  var featureName: java.lang.String
}

object IUiGridExporterConstants {
  @scala.inline
  def apply(
    ALL: java.lang.String,
    BUTTON_LABEL: java.lang.String,
    CSV_CONTENT: java.lang.String,
    FILE_NAME: java.lang.String,
    SELECTED: java.lang.String,
    VISIBLE: java.lang.String,
    featureName: java.lang.String
  ): IUiGridExporterConstants = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ALL")(ALL)
    __obj.updateDynamic("BUTTON_LABEL")(BUTTON_LABEL)
    __obj.updateDynamic("CSV_CONTENT")(CSV_CONTENT)
    __obj.updateDynamic("FILE_NAME")(FILE_NAME)
    __obj.updateDynamic("SELECTED")(SELECTED)
    __obj.updateDynamic("VISIBLE")(VISIBLE)
    __obj.updateDynamic("featureName")(featureName)
    __obj.asInstanceOf[IUiGridExporterConstants]
  }
}

