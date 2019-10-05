package typings.winrt.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Package")
@js.native
class Package () extends IPackage {
  /* CompleteClass */
  override var dependencies: IVectorView[Package] = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var id: PackageId = js.native
  /* CompleteClass */
  override var installedLocation: StorageFolder = js.native
  /* CompleteClass */
  override var isBundle: Boolean = js.native
  /* CompleteClass */
  override var isDevelopmentMode: Boolean = js.native
  /* CompleteClass */
  override var isFramework: Boolean = js.native
  /* CompleteClass */
  override var isResourcePackage: Boolean = js.native
  /* CompleteClass */
  override var logo: Uri = js.native
  /* CompleteClass */
  override var publisherDisplayName: String = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
object Package extends js.Object {
  var current: Package = js.native
}

