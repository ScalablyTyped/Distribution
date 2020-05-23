package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object {
  var boolean: scala.Double
  var branchFilter: scala.Double
  var multiLine: scala.Double
  var pickList: scala.Double
  var radio: scala.Double
  var string: scala.Double
  var stringList: scala.Double
}

object Boolean {
  @scala.inline
  def apply(
    boolean: scala.Double,
    branchFilter: scala.Double,
    multiLine: scala.Double,
    pickList: scala.Double,
    radio: scala.Double,
    string: scala.Double,
    stringList: scala.Double
  ): Boolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], branchFilter = branchFilter.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], stringList = stringList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
}

