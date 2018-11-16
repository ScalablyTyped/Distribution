package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
@js.native
class FileSavePickerUI () extends IFileSavePickerUI {
  /* CompleteClass */
  override var allowedFileTypes: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var fileName: java.lang.String = js.native
  /* CompleteClass */
  override var onfilenamechanged: js.Any = js.native
  /* CompleteClass */
  override var ontargetfilerequested: js.Any = js.native
  /* CompleteClass */
  override var settingsIdentifier: java.lang.String = js.native
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /* CompleteClass */
  override def trySetFileName(value: java.lang.String): SetFileNameResult = js.native
}

