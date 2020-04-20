package typings.uiGrid.mod.exporter

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
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], BUTTON_LABEL = BUTTON_LABEL.asInstanceOf[js.Any], CSV_CONTENT = CSV_CONTENT.asInstanceOf[js.Any], FILE_NAME = FILE_NAME.asInstanceOf[js.Any], SELECTED = SELECTED.asInstanceOf[js.Any], VISIBLE = VISIBLE.asInstanceOf[js.Any], featureName = featureName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUiGridExporterConstants]
  }
}

