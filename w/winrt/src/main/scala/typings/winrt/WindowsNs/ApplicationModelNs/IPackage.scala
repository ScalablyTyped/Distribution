package typings.winrt.WindowsNs.ApplicationModelNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackage extends js.Object {
  var dependencies: IVectorView[Package]
  var description: String
  var displayName: String
  var id: PackageId
  var installedLocation: StorageFolder
  var isBundle: Boolean
  var isDevelopmentMode: Boolean
  var isFramework: Boolean
  var isResourcePackage: Boolean
  var logo: Uri
  var publisherDisplayName: String
}

object IPackage {
  @scala.inline
  def apply(
    dependencies: IVectorView[Package],
    description: String,
    displayName: String,
    id: PackageId,
    installedLocation: StorageFolder,
    isBundle: Boolean,
    isDevelopmentMode: Boolean,
    isFramework: Boolean,
    isResourcePackage: Boolean,
    logo: Uri,
    publisherDisplayName: String
  ): IPackage = {
    val __obj = js.Dynamic.literal(dependencies = dependencies, description = description, displayName = displayName, id = id, installedLocation = installedLocation, isBundle = isBundle, isDevelopmentMode = isDevelopmentMode, isFramework = isFramework, isResourcePackage = isResourcePackage, logo = logo, publisherDisplayName = publisherDisplayName)
  
    __obj.asInstanceOf[IPackage]
  }
}

