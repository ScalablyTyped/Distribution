package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingProcessInterfacesMod

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
    val __obj = js.Dynamic.literal(description = description, name = name, projects = projects, properties = properties, referenceName = referenceName, typeId = typeId)
  
    __obj.asInstanceOf[ProcessModel]
  }
}

