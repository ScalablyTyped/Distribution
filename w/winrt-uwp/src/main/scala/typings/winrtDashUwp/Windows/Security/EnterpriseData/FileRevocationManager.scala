package typings.winrtDashUwp.Windows.Security.EnterpriseData

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.IStorageItem
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
  def copyProtectionAsync(sourceStorageItem: IStorageItem, targetStorageItem: IStorageItem): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Gets the selective wipe protection status for a file or folder.
    * @param storageItem The file or folder to get the selective wipe protection status for.
    * @return An aysnchronous operation that retrieves the selective wipe protection status for the storageItem.
    */
  def getStatusAsync(storageItem: IStorageItem): IPromiseWithIAsyncOperation[FileProtectionStatus] = js.native
  /**
    * Protects a file or folder for selective wipe.
    * @param storageItem The file or folder to protect for selective wipe.
    * @param enterpriseIdentity The enterprise id that the file or folder is protected for. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
    * @return An asynchronous operation that retrieves the selective wipe protection status for the storageItem.
    */
  def protectAsync(storageItem: IStorageItem, enterpriseIdentity: String): IPromiseWithIAsyncOperation[FileProtectionStatus] = js.native
  /**
    * Revokes all files and folders protected for selective wipe for a specified enterprise id.
    * @param enterpriseIdentity Revoke all files and folders protected by selective wipe for this enterprise id. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
    */
  def revoke(enterpriseIdentity: String): Unit = js.native
}

