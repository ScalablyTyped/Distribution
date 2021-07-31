package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.System.ProcessorArchitecture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageId
  extends StObject
     with IPackageId
object PackageId {
  
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
  ): PackageId = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], familyName = familyName.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
}
