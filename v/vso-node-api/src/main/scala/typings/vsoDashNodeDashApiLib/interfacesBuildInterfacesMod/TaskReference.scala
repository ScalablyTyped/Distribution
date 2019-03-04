package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskReference extends js.Object {
  /**
    * The ID of the task definition.
    */
  var id: java.lang.String
  /**
    * The name of the task definition.
    */
  var name: java.lang.String
  /**
    * The version of the task definition.
    */
  var version: java.lang.String
}

object TaskReference {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, version: java.lang.String): TaskReference = {
    val __obj = js.Dynamic.literal(id = id, name = name, version = version)
  
    __obj.asInstanceOf[TaskReference]
  }
}

