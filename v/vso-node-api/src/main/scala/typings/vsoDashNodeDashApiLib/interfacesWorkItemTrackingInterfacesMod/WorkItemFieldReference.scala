package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemFieldReference extends js.Object {
  /**
    * The name of the field.
    */
  var name: java.lang.String
  /**
    * The reference name of the field.
    */
  var referenceName: java.lang.String
  /**
    * The REST URL of the resource.
    */
  var url: java.lang.String
}

object WorkItemFieldReference {
  @scala.inline
  def apply(name: java.lang.String, referenceName: java.lang.String, url: java.lang.String): WorkItemFieldReference = {
    val __obj = js.Dynamic.literal(name = name, referenceName = referenceName, url = url)
  
    __obj.asInstanceOf[WorkItemFieldReference]
  }
}

