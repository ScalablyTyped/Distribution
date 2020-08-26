package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.System.ProcessorArchitecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPackageId extends js.Object {
  var architecture: ProcessorArchitecture = js.native
  var familyName: String = js.native
  var fullName: String = js.native
  var name: String = js.native
  var publisher: String = js.native
  var publisherId: String = js.native
  var resourceId: String = js.native
  var version: PackageVersion = js.native
}

object IPackageId {
  @scala.inline
  def apply(
    architecture: ProcessorArchitecture,
    familyName: String,
    fullName: String,
    name: String,
    publisher: String,
    publisherId: String,
    resourceId: String,
    version: PackageVersion
  ): IPackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackageId]
  }
  @scala.inline
  implicit class IPackageIdOps[Self <: IPackageId] (val x: Self) extends AnyVal {
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
    def setArchitecture(value: ProcessorArchitecture): Self = this.set("architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: PackageVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

