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

