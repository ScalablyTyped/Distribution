package typings
package winrtLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Package")
@js.native
class Package () extends IPackage {
  /* CompleteClass */
  override var dependencies: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[Package] = js.native
  /* CompleteClass */
  override var description: java.lang.String = js.native
  /* CompleteClass */
  override var displayName: java.lang.String = js.native
  /* CompleteClass */
  override var id: PackageId = js.native
  /* CompleteClass */
  override var installedLocation: winrtLib.WindowsNs.StorageNs.StorageFolder = js.native
  /* CompleteClass */
  override var isBundle: scala.Boolean = js.native
  /* CompleteClass */
  override var isDevelopmentMode: scala.Boolean = js.native
  /* CompleteClass */
  override var isFramework: scala.Boolean = js.native
  /* CompleteClass */
  override var isResourcePackage: scala.Boolean = js.native
  /* CompleteClass */
  override var logo: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var publisherDisplayName: java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
object Package extends js.Object {
  var current: winrtLib.WindowsNs.ApplicationModelNs.Package = js.native
}

