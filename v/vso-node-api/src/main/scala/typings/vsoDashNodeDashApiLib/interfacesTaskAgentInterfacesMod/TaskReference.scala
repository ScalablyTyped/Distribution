package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskReference extends js.Object {
  var id: java.lang.String
  var inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var name: java.lang.String
  var version: java.lang.String
}

object TaskReference {
  @scala.inline
  def apply(
    id: java.lang.String,
    inputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    name: java.lang.String,
    version: java.lang.String
  ): TaskReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskReference]
  }
}

