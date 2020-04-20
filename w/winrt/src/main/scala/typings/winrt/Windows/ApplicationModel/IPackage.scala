package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFolder
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
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], installedLocation = installedLocation.asInstanceOf[js.Any], isBundle = isBundle.asInstanceOf[js.Any], isDevelopmentMode = isDevelopmentMode.asInstanceOf[js.Any], isFramework = isFramework.asInstanceOf[js.Any], isResourcePackage = isResourcePackage.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], publisherDisplayName = publisherDisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPackage]
  }
}

