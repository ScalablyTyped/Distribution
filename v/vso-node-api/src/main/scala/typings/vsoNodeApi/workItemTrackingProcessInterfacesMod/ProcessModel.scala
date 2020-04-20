package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessModel extends js.Object {
  /**
    * Description of the process
    */
  var description: String
  /**
    * Name of the process
    */
  var name: String
  /**
    * Projects in this process
    */
  var projects: js.Array[ProjectReference]
  /**
    * Properties of the process
    */
  var properties: ProcessProperties
  /**
    * Reference name of the process
    */
  var referenceName: String
  /**
    * The ID of the process
    */
  var typeId: String
}

object ProcessModel {
  @scala.inline
  def apply(
    description: String,
    name: String,
    projects: js.Array[ProjectReference],
    properties: ProcessProperties,
    referenceName: String,
    typeId: String
  ): ProcessModel = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessModel]
  }
}

