package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemFieldReference extends js.Object {
  /**
    * The name of the field.
    */
  var name: String
  /**
    * The reference name of the field.
    */
  var referenceName: String
  /**
    * The REST URL of the resource.
    */
  var url: String
}

object WorkItemFieldReference {
  @scala.inline
  def apply(name: String, referenceName: String, url: String): WorkItemFieldReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldReference]
  }
}

