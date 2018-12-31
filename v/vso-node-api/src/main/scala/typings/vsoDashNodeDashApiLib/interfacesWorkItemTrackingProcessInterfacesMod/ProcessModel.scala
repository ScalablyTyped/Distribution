package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessModel extends js.Object {
  /**
    * Description of the process
    */
  var description: java.lang.String
  /**
    * Name of the process
    */
  var name: java.lang.String
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
  var referenceName: java.lang.String
  /**
    * The ID of the process
    */
  var typeId: java.lang.String
}

