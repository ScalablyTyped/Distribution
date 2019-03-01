package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamFieldValuesPatch extends js.Object {
  var defaultValue: java.lang.String
  var values: js.Array[TeamFieldValue]
}

object TeamFieldValuesPatch {
  @scala.inline
  def apply(defaultValue: java.lang.String, values: js.Array[TeamFieldValue]): TeamFieldValuesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultValue")(defaultValue)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TeamFieldValuesPatch]
  }
}

