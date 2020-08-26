package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemFieldReference extends js.Object {
  /**
    * The name of the field.
    */
  var name: String = js.native
  /**
    * The reference name of the field.
    */
  var referenceName: String = js.native
  /**
    * The REST URL of the resource.
    */
  var url: String = js.native
}

object WorkItemFieldReference {
  @scala.inline
  def apply(name: String, referenceName: String, url: String): WorkItemFieldReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemFieldReference]
  }
  @scala.inline
  implicit class WorkItemFieldReferenceOps[Self <: WorkItemFieldReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceName(value: String): Self = this.set("referenceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

