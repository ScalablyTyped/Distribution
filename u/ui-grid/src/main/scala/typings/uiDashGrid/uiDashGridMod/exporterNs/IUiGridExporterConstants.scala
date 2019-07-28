package typings.uiDashGrid.uiDashGridMod.exporterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiGridExporterConstants extends js.Object {
  /** export all data, including data not visible.  Can be set for either rowTypes or colTypes */
  var ALL: String
  var BUTTON_LABEL: String
  var CSV_CONTENT: String
  var FILE_NAME: String
  /**
    * Export all data, including data not visible.
    * Can be set only for rowTypes, selection of only some columns is not supported
    */
  var SELECTED: String
  /** export only visible data, including data not visible.  Can be set for either rowTypes or colTypes */
  var VISIBLE: String
  var featureName: String
}

object IUiGridExporterConstants {
  @scala.inline
  def apply(
    ALL: String,
    BUTTON_LABEL: String,
    CSV_CONTENT: String,
    FILE_NAME: String,
    SELECTED: String,
    VISIBLE: String,
    featureName: String
  ): IUiGridExporterConstants = {
    val __obj = js.Dynamic.literal(ALL = ALL, BUTTON_LABEL = BUTTON_LABEL, CSV_CONTENT = CSV_CONTENT, FILE_NAME = FILE_NAME, SELECTED = SELECTED, VISIBLE = VISIBLE, featureName = featureName)
  
    __obj.asInstanceOf[IUiGridExporterConstants]
  }
}

