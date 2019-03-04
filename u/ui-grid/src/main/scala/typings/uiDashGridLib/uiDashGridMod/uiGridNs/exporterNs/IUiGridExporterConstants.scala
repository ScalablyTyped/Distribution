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
    val __obj = js.Dynamic.literal(ALL = ALL, BUTTON_LABEL = BUTTON_LABEL, CSV_CONTENT = CSV_CONTENT, FILE_NAME = FILE_NAME, SELECTED = SELECTED, VISIBLE = VISIBLE, featureName = featureName)
  
    __obj.asInstanceOf[IUiGridExporterConstants]
  }
}

