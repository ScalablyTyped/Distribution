package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMatrixColumnOwner extends ILocalizableOwner {
  def getCellType(): java.lang.String
  def getRequiredText(): java.lang.String
  def onColumnPropertiesChanged(column: MatrixDropdownColumn): scala.Unit
}

