package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boolean extends js.Object {
  var boolean: scala.Double
  var branchFilter: scala.Double
  var multiLine: scala.Double
  var pickList: scala.Double
  var radio: scala.Double
  var string: scala.Double
  var stringList: scala.Double
}

object Anon_Boolean {
  @scala.inline
  def apply(
    boolean: scala.Double,
    branchFilter: scala.Double,
    multiLine: scala.Double,
    pickList: scala.Double,
    radio: scala.Double,
    string: scala.Double,
    stringList: scala.Double
  ): Anon_Boolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolean")(boolean)
    __obj.updateDynamic("branchFilter")(branchFilter)
    __obj.updateDynamic("multiLine")(multiLine)
    __obj.updateDynamic("pickList")(pickList)
    __obj.updateDynamic("radio")(radio)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("stringList")(stringList)
    __obj.asInstanceOf[Anon_Boolean]
  }
}

