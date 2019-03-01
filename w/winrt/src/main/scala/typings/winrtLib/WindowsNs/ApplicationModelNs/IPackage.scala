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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("installedLocation")(installedLocation)
    __obj.updateDynamic("isBundle")(isBundle)
    __obj.updateDynamic("isDevelopmentMode")(isDevelopmentMode)
    __obj.updateDynamic("isFramework")(isFramework)
    __obj.updateDynamic("isResourcePackage")(isResourcePackage)
    __obj.updateDynamic("logo")(logo)
    __obj.updateDynamic("publisherDisplayName")(publisherDisplayName)
    __obj.asInstanceOf[IPackage]
  }
}

