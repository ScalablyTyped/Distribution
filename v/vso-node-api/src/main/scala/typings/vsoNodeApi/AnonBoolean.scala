package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoolean extends js.Object {
  var boolean: Double
  var branchFilter: Double
  var multiLine: Double
  var pickList: Double
  var radio: Double
  var string: Double
  var stringList: Double
}

object AnonBoolean {
  @scala.inline
  def apply(
    boolean: Double,
    branchFilter: Double,
    multiLine: Double,
    pickList: Double,
    radio: Double,
    string: Double,
    stringList: Double
  ): AnonBoolean = {
    val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], branchFilter = branchFilter.asInstanceOf[js.Any], multiLine = multiLine.asInstanceOf[js.Any], pickList = pickList.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], stringList = stringList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBoolean]
  }
}

