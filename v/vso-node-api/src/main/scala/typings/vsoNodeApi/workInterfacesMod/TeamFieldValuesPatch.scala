package typings.vsoNodeApi.workInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFieldValuesPatch extends js.Object {
  var defaultValue: String
  var values: js.Array[TeamFieldValue]
}

object TeamFieldValuesPatch {
  @scala.inline
  def apply(defaultValue: String, values: js.Array[TeamFieldValue]): TeamFieldValuesPatch = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamFieldValuesPatch]
  }
}

