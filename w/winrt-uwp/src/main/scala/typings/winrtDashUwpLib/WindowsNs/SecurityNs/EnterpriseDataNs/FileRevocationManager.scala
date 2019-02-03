package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to Selective Wipe operations. */
@JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager")
@js.native
abstract class FileRevocationManager () extends js.Object

/* static members */
@JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager")
@js.native
object FileRevocationManager extends js.Object {
  /**
    * Copy the selective wipe protection state of a file or folder to a new file or folder.
    * @param sourceStorageItem The source item to copy the selective wipe protection status from.
    * @param targetStorageItem The target item to copy the selective wipe protection status to.
    * @return True if the copy operation was successful; otherwise false.
    */
  def copyProtectionAsync(
    sourceStorageItem: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    targetStorageItem: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Gets the selective wipe protection status for a file or folder.
    * @param storageItem The file or folder to get the selective wipe protection status for.
    * @return An aysnchronous operation that retrieves the selective wipe protection status for the storageItem.
    */
  def getStatusAsync(storageItem: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus] = js.native
  /**
    * Protects a file or folder for selective wipe.
    * @param storageItem The file or folder to protect for selective wipe.
    * @param enterpriseIdentity The enterprise id that the file or folder is protected for. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
    * @return An asynchronous operation that retrieves the selective wipe protection status for the storageItem.
    */
  def protectAsync(
    storageItem: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    enterpriseIdentity: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionStatus] = js.native
  /**
    * Revokes all files and folders protected for selective wipe for a specified enterprise id.
    * @param enterpriseIdentity Revoke all files and folders protected by selective wipe for this enterprise id. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
    */
  def revoke(enterpriseIdentity: java.lang.String): scala.Unit = js.native
}

