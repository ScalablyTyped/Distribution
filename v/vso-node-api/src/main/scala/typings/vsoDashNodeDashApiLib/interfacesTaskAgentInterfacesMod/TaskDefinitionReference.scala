package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskDefinitionReference extends js.Object {
  var definitionType: java.lang.String
  var id: java.lang.String
  var versionSpec: java.lang.String
}

object TaskDefinitionReference {
  @scala.inline
  def apply(definitionType: java.lang.String, id: java.lang.String, versionSpec: java.lang.String): TaskDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionType = definitionType, id = id, versionSpec = versionSpec)
  
    __obj.asInstanceOf[TaskDefinitionReference]
  }
}

