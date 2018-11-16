package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationData extends js.Object {
  var localFolder: StorageFolder = js.native
  var localSettings: ApplicationDataContainer = js.native
  var ondatachanged: js.Any = js.native
  var roamingFolder: StorageFolder = js.native
  var roamingSettings: ApplicationDataContainer = js.native
  var roamingStorageQuota: scala.Double = js.native
  var temporaryFolder: StorageFolder = js.native
  var version: scala.Double = js.native
  def clearAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def clearAsync(locality: ApplicationDataLocality): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def setVersionAsync(desiredVersion: scala.Double, handler: ApplicationDataSetVersionHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def signalDataChanged(): scala.Unit = js.native
}

