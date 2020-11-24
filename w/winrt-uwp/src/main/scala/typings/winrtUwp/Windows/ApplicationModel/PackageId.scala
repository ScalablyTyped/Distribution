package typings.winrtUwp.Windows.ApplicationModel

import typings.winrtUwp.Windows.System.ProcessorArchitecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides package identification info, such as name, version, and publisher. */
@js.native
trait PackageId extends js.Object {
  
  /** Gets the processor architecture for which the package was created. */
  var architecture: ProcessorArchitecture = js.native
  
  /** Windows Phone only. Gets the value of the Author attribute for the specified application package. */
  var author: String = js.native
  
  /** Gets the family name of the package. */
  var familyName: String = js.native
  
  /** Gets the full name of the package. */
  var fullName: String = js.native
  
  /** Gets the name of the package. */
  var name: String = js.native
  
  /** Windows Phone only. Gets the value of the ProductID attribute associated with this application package. */
  var productId: String = js.native
  
  /** Gets the publisher of the package. */
  var publisher: String = js.native
  
  /** Gets the publisher ID of the package. */
  var publisherId: String = js.native
  
  /** Gets the resource ID of the package. */
  var resourceId: String = js.native
  
  /** Gets the package version info. */
  var version: PackageVersion = js.native
}
object PackageId {
  
  @scala.inline
  def apply(
    architecture: ProcessorArchitecture,
    author: String,
    familyName: String,
    fullName: String,
    name: String,
    productId: String,
    publisher: String,
    publisherId: String,
    resourceId: String,
    version: PackageVersion
  ): PackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
  
  @scala.inline
  implicit class PackageIdOps[Self <: PackageId] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
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
