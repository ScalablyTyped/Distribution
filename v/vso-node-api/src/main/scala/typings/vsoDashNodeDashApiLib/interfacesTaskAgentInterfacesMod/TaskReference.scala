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
    val __obj = js.Dynamic.literal(id = id, inputs = inputs, name = name, version = version)
  
    __obj.asInstanceOf[TaskReference]
  }
}

