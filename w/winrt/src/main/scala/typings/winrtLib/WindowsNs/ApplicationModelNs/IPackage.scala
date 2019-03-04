package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackage extends js.Object {
  var dependencies: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Package]
  var description: java.lang.String
  var displayName: java.lang.String
  var id: PackageId
  var installedLocation: winrtLib.WindowsNs.StorageNs.StorageFolder
  var isBundle: scala.Boolean
  var isDevelopmentMode: scala.Boolean
  var isFramework: scala.Boolean
  var isResourcePackage: scala.Boolean
  var logo: winrtLib.WindowsNs.FoundationNs.Uri
  var publisherDisplayName: java.lang.String
}

object IPackage {
  @scala.inline
  def apply(
    dependencies: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Package],
    description: java.lang.String,
    displayName: java.lang.String,
    id: PackageId,
    installedLocation: winrtLib.WindowsNs.StorageNs.StorageFolder,
    isBundle: scala.Boolean,
    isDevelopmentMode: scala.Boolean,
    isFramework: scala.Boolean,
    isResourcePackage: scala.Boolean,
    logo: winrtLib.WindowsNs.FoundationNs.Uri,
    publisherDisplayName: java.lang.String
  ): IPackage = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, description = description, displayName = displayName, id = id, installedLocation = installedLocation, isBundle = isBundle, isDevelopmentMode = isDevelopmentMode, isFramework = isFramework, isResourcePackage = isResourcePackage, logo = logo, publisherDisplayName = publisherDisplayName)
  
    __obj.asInstanceOf[IPackage]
  }
}

