package typings.winrtUwp.global.Windows.Security

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel
import typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus
import typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult
import typings.winrtUwp.Windows.Storage.CreationCollisionOption
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.NameCollisionOption
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.winrtUwpStrings.policychanged
import typings.winrtUwp.winrtUwpStrings.protectedaccessresumed
import typings.winrtUwp.winrtUwpStrings.protectedaccesssuspending
import typings.winrtUwp.winrtUwpStrings.protectedcontentrevoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that support enterprise data protection (EDP). For the full developer picture of how EDP relates to files, buffers, the clipboard, networking, background tasks, and data protection under lock, see Enterprise data protection. */
object EnterpriseData {
  
  /** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
  @JSGlobal("Windows.Security.EnterpriseData.BufferProtectUnprotectResult")
  @js.native
  abstract class BufferProtectUnprotectResult ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult
  
  /** Contains information about an enterprise protected buffer or stream. */
  @JSGlobal("Windows.Security.EnterpriseData.DataProtectionInfo")
  @js.native
  abstract class DataProtectionInfo ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo
  
  /** Provides access to operations that manage buffers and streams that are protected to an enterprise identity. */
  @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager")
  @js.native
  abstract class DataProtectionManager ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionManager
  object DataProtectionManager {
    
    /**
      * Get the status of an enterprise protected buffer.
      * @param protectedData The buffer for which protection status is being queried.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the buffer.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager.getProtectionInfoAsync")
    @js.native
    def getProtectionInfoAsync(protectedData: IBuffer): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
    
    /**
      * Get the status of an enterprise protected stream.
      * @param protectedStream The stream for which protection status is being queried.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the stream.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager.getStreamProtectionInfoAsync")
    @js.native
    def getStreamProtectionInfoAsync(protectedStream: IInputStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
    
    /**
      * Protect the data in a buffer to an enterprise identity.
      * @param data The buffer to be protected.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return When the call to this method completes successfully, it returns a BufferProtectUnprotectResult object that contains the status of the newly protected buffer.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager.protectAsync")
    @js.native
    def protectAsync(data: IBuffer, identity: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult] = js.native
    
    /**
      * Protect a stream of data to an enterprise identity.
      * @param unprotectedStream The input, unprotected stream.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param protectedStream The output, protected stream.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the protected stream.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager.protectStreamAsync")
    @js.native
    def protectStreamAsync(unprotectedStream: IInputStream, identity: String, protectedStream: IOutputStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
    
    /**
      * Removes the protection to an enterprise identity from a buffer.
      * @param data The buffer to be unprotected.
      * @return When the call to this method completes successfully, it returns a BufferProtectUnprotectResult object that contains the status of the unprotected buffer.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager.unprotectAsync")
    @js.native
    def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult] = js.native
    
    /**
      * Removes the protection to an enterprise identity from a stream of data.
      * @param protectedStream The input, protected stream.
      * @param unprotectedStream The output, unprotected stream.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the unprotected stream.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager.unprotectStreamAsync")
    @js.native
    def unprotectStreamAsync(protectedStream: IInputStream, unprotectedStream: IOutputStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = js.native
  }
  
  /** Describes the enterprise identity protection state of a buffer or stream. */
  @JSGlobal("Windows.Security.EnterpriseData.DataProtectionStatus")
  @js.native
  object DataProtectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus with Double
      ] = js.native
    
    /* 5 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.accessSuspended with Double = js.native
    
    /* 4 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.licenseExpired with Double = js.native
    
    /* 1 */ val `protected`: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.`protected` with Double = js.native
    
    /* 0 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.protectedToOtherIdentity with Double = js.native
    
    /* 2 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.revoked with Double = js.native
    
    /* 3 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.unprotected with Double = js.native
  }
  
  /** A set of enumerated values together describing the possible enterprise data protection (EDP) enforcement levels. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration. */
  @JSGlobal("Windows.Security.EnterpriseData.EnforcementLevel")
  @js.native
  object EnforcementLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel with Double] = js.native
    
    /* 3 */ val block: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.block with Double = js.native
    
    /* 0 */ val noProtection: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.noProtection with Double = js.native
    
    /* 2 */ val `override`: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.`override` with Double = js.native
    
    /* 1 */ val silent: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.silent with Double = js.native
  }
  
  /** Contains information about an enterprise protected file. */
  @JSGlobal("Windows.Security.EnterpriseData.FileProtectionInfo")
  @js.native
  abstract class FileProtectionInfo ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo
  
  /** Provides access to operations that manage files that are protected to an enterprise identity. */
  @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager")
  @js.native
  abstract class FileProtectionManager ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionManager
  object FileProtectionManager {
    
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Replicate the file protection of one file onto another file.
      * @param source The source file, from which file protection is being copied.
      * @param target The target file, to which file protection is being copied.
      * @return When the call to this method completes successfully, it returns true if the file protection was copied, or false if there was an error.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.copyProtectionAsync")
    @js.native
    def copyProtectionAsync(source: IStorageItem, target: IStorageItem): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Create an enterprise-protected file.
      * @param parentFolder The folder into which to create the enterprise protected file.
      * @param desiredName The desired name of the new enterprise protected file.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param collisionOption A CreationCollisionOption value that specifies what to do if desiredName already exists.
      * @return When the call to this method completes successfully, it returns a ProtectedFileCreateResult object representing the newly created protected file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.createProtectedAndOpenAsync")
    @js.native
    def createProtectedAndOpenAsync(
      parentFolder: IStorageFolder,
      desiredName: String,
      identity: String,
      collisionOption: CreationCollisionOption
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult] = js.native
    
    /**
      * Get the status of an enterprise-protected file.
      * @param source The file or folder for which protection status is being queried.
      * @return When the call to this method completes successfully, it returns a FileProtectionInfo object that contains the status of the file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.getProtectionInfoAsync")
    @js.native
    def getProtectionInfoAsync(source: IStorageItem): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo] = js.native
    
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.isContainerAsync")
    @js.native
    def isContainerAsync: js.Any = js.native
    @scala.inline
    def isContainerAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isContainerAsync")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /**
      * Create an enterprise-protected file, and load it from a container file.
      * @param containerFile The enterprise protected file to be created and loaded.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.loadFileFromContainerAsync")
    @js.native
    def loadFileFromContainerAsync(containerFile: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult] = js.native
    /**
      * Create an enterprise-protected file in a specified storage item (such as a folder), and load it from a container file.
      * @param containerFile The enterprise protected file to be created and loaded.
      * @param target The storage item into which to create the enterprise protected file.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.loadFileFromContainerAsync")
    @js.native
    def loadFileFromContainerAsync(containerFile: IStorageFile, target: IStorageItem): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult] = js.native
    /**
      * Create an enterprise-protected file in a specified storage item (such as a folder), and load it from a container file.
      * @param containerFile The enterprise protected file to be created and loaded.
      * @param target The storage item into which to create the enterprise protected file.
      * @param collisionOption The enum value that determines how Windows responds if the created file has the same name as an existing item in the container's location.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.loadFileFromContainerAsync")
    @js.native
    def loadFileFromContainerAsync(containerFile: IStorageFile, target: IStorageItem, collisionOption: NameCollisionOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult] = js.native
    
    /**
      * Protect the data in a file to an enterprise identity. The app can then use standard APIs to read or write from the file.
      * @param target The file to be protected.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Use ProtectionPolicyManager.IsIdentityManaged to confirm that an email address or domain is managed before using the identity to protect a file.
      * @return When the call to this method completes successfully, it returns a FileProtectionInfo object that contains the status of the newly protected file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.protectAsync")
    @js.native
    def protectAsync(target: IStorageItem, identity: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo] = js.native
    
    /**
      * Save an enterprise-protected file as a containerized version.
      * @param protectedFile The protected source file being copied.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerExportResult object representing the newly created container file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.saveFileAsContainerAsync")
    @js.native
    def saveFileAsContainerAsync(protectedFile: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult] = js.native
    /**
      * Save an enterprise-protected file as a containerized version, and share it with a specified list of user identities.
      * @param protectedFile The protected source file being copied.
      * @param sharedWithIdentities A collection of strings representing the user identities to share the containerized file with. For example, email recipients.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerExportResult object representing the newly created container file.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.saveFileAsContainerAsync")
    @js.native
    def saveFileAsContainerAsync(protectedFile: IStorageFile, sharedWithIdentities: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult] = js.native
  }
  
  /** Describes the enterprise protection state of a file or folder. */
  @JSGlobal("Windows.Security.EnterpriseData.FileProtectionStatus")
  @js.native
  object FileProtectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus with Double
      ] = js.native
    
    /* 10 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.accessSuspended with Double = js.native
    
    /* 9 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.licenseExpired with Double = js.native
    
    /* 7 */ val notProtectable: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.notProtectable with Double = js.native
    
    /* 4 */ val `protected`: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.`protected` with Double = js.native
    
    /* 5 */ val protectedByOtherUser: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedByOtherUser with Double = js.native
    
    /* 6 */ val protectedToOtherEnterprise: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedToOtherEnterprise with Double = js.native
    
    /* 8 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedToOtherIdentity with Double = js.native
    
    /* 3 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.revoked with Double = js.native
    
    /* 0 */ val undetermined: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.undetermined with Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.unknown with Double = js.native
    
    /* 2 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.unprotected with Double = js.native
  }
  
  /** Provides access to Selective Wipe operations. */
  @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager")
  @js.native
  abstract class FileRevocationManager ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.FileRevocationManager
  object FileRevocationManager {
    
    /**
      * Copy the selective wipe protection state of a file or folder to a new file or folder.
      * @param sourceStorageItem The source item to copy the selective wipe protection status from.
      * @param targetStorageItem The target item to copy the selective wipe protection status to.
      * @return True if the copy operation was successful; otherwise false.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager.copyProtectionAsync")
    @js.native
    def copyProtectionAsync(sourceStorageItem: IStorageItem, targetStorageItem: IStorageItem): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Gets the selective wipe protection status for a file or folder.
      * @param storageItem The file or folder to get the selective wipe protection status for.
      * @return An aysnchronous operation that retrieves the selective wipe protection status for the storageItem.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager.getStatusAsync")
    @js.native
    def getStatusAsync(storageItem: IStorageItem): IPromiseWithIAsyncOperation[FileProtectionStatus] = js.native
    
    /**
      * Protects a file or folder for selective wipe.
      * @param storageItem The file or folder to protect for selective wipe.
      * @param enterpriseIdentity The enterprise id that the file or folder is protected for. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
      * @return An asynchronous operation that retrieves the selective wipe protection status for the storageItem.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager.protectAsync")
    @js.native
    def protectAsync(storageItem: IStorageItem, enterpriseIdentity: String): IPromiseWithIAsyncOperation[FileProtectionStatus] = js.native
    
    /**
      * Revokes all files and folders protected for selective wipe for a specified enterprise id.
      * @param enterpriseIdentity Revoke all files and folders protected by selective wipe for this enterprise id. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager.revoke")
    @js.native
    def revoke(enterpriseIdentity: String): Unit = js.native
  }
  
  /** Provides data when content protection is resumed. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs")
  @js.native
  abstract class ProtectedAccessResumedEventArgs ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs
  
  /** Provides data when content protection is being suspended. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs")
  @js.native
  abstract class ProtectedAccessSuspendingEventArgs ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs
  
  /** Represents the result of an enterprise protected file that has been exported to a container file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerExportResult")
  @js.native
  abstract class ProtectedContainerExportResult ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult
  
  /** Represents the result of an enterprise protected file that has been imported from a container file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerImportResult")
  @js.native
  abstract class ProtectedContainerImportResult ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult
  
  /** Provides data when content protection has been revoked. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs")
  @js.native
  abstract class ProtectedContentRevokedEventArgs ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs
  
  /** Contains information about a newly created enterprise protected file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedFileCreateResult")
  @js.native
  abstract class ProtectedFileCreateResult ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult
  
  /** Possible status values for an enterprise protected file that has been imported from or exported to a container file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedImportExportStatus")
  @js.native
  object ProtectedImportExportStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus with Double
      ] = js.native
    
    /* 7 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.accessSuspended with Double = js.native
    
    /* 6 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.licenseExpired with Double = js.native
    
    /* 4 */ val notRoamable: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.notRoamable with Double = js.native
    
    /* 0 */ val ok: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.ok with Double = js.native
    
    /* 5 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.protectedToOtherIdentity with Double = js.native
    
    /* 3 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.revoked with Double = js.native
    
    /* 1 */ val undetermined: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.undetermined with Double = js.native
    
    /* 2 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.unprotected with Double = js.native
  }
  
  /** Possible results when access to protected content is requested or queried. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult")
  @js.native
  object ProtectionPolicyEvaluationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult with Double
      ] = js.native
    
    /* 0 */ val allowed: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.allowed with Double = js.native
    
    /* 1 */ val blocked: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.blocked with Double = js.native
    
    /* 2 */ val consentRequired: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.consentRequired with Double = js.native
  }
  
  /** Manages enterprise-protection policy on protected content. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager")
  @js.native
  abstract class ProtectionPolicyManager ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyManager
  object ProtectionPolicyManager {
    
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.addEventListener")
    @js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.addEventListener")
    @js.native
    def addEventListener_policychanged(`type`: policychanged, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.addEventListener")
    @js.native
    def addEventListener_protectedaccessresumed(`type`: protectedaccessresumed, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.addEventListener")
    @js.native
    def addEventListener_protectedaccesssuspending(`type`: protectedaccesssuspending, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.addEventListener")
    @js.native
    def addEventListener_protectedcontentrevoked(`type`: protectedcontentrevoked, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Request if access to enterprise-protected content is available to an identity.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to check if an email address or domain is managed.
      * @param targetIdentity The enterprise identity you want to check has access to the protected content.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.checkAccess")
    @js.native
    def checkAccess(sourceIdentity: String, targetIdentity: String): ProtectionPolicyEvaluationResult = js.native
    
    /**
      * Perform enterprise-protection policy evaluation for a data transfer between your app and a specific target app.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to check if an email address or domain is managed.
      * @param appPackageFamilyName The package family name of the app you want to check has access to the protected content.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.checkAccessForApp")
    @js.native
    def checkAccessForApp(sourceIdentity: String, appPackageFamilyName: String): ProtectionPolicyEvaluationResult = js.native
    
    /** Clear UI policy enforcement for an enterprise identity. The app calls this method before it displays non-enterprise-protected content. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.clearProcessUIPolicy")
    @js.native
    def clearProcessUIPolicy(): Unit = js.native
    
    /**
      * Creates a ThreadNetworkContext protected to an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy.
      * @param identity The enterprise identity. This is an email address or domain that is managed. This may be returned from GetPrimaryManagedIdentityForNetworkEndpoint ; otherwise your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return The protected network context. The app must call ThreadNetworkContext.Close after access to the resource is completed.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.createCurrentThreadNetworkContext")
    @js.native
    def createCurrentThreadNetworkContext(identity: String): typings.winrtUwp.Windows.Security.EnterpriseData.ThreadNetworkContext = js.native
    
    /**
      * You can use this method to determine the current enterprise data protection (EDP) enforcement level. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return A value of the EnforcementLevel enumeration.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.getEnforcementLevel")
    @js.native
    def getEnforcementLevel(identity: String): EnforcementLevel = js.native
    
    /**
      * Returns the ProtectionPolicyManager object associated with the current app window.
      * @return The ProtectionPolicyManager object associated with the current app window.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyManager = js.native
    
    /**
      * Returns the enterprise identity of a network resource if the resource is on an enterprise-policy-managed endpoint.
      * @param endpointHost The host name or IP address of the network resource.
      * @return The enterprise identity.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.getPrimaryManagedIdentityForNetworkEndpointAsync")
    @js.native
    def getPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost: HostName): IPromiseWithIAsyncOperation[String] = js.native
    
    /**
      * Use this method to check whether access to protected data has been revoked since a specified date and time, or is still accessible.
      * @param identity The enterprise identity protecting the data. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param since The date and time from which point forward you want to include in the check.
      * @return true if access has been revoked since the specified date and time, otherwise false.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.hasContentBeenRevokedSince")
    @js.native
    def hasContentBeenRevokedSince(identity: String, since: Date): Boolean = js.native
    
    /**
      * Determines if an enterprise entity is managed by an enterprise policy.
      * @param identity The enterprise identity. This is an email address or domain.
      * @return true if the enterprise identity is managed, or false if it is not.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.isIdentityManaged")
    @js.native
    def isIdentityManaged(identity: String): Boolean = js.native
    
    /** Use this property to determine whether enterprise data protection (EDP) is enabled on the device. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.isProtectionEnabled")
    @js.native
    def isProtectionEnabled: Boolean = js.native
    @scala.inline
    def isProtectionEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProtectionEnabled")(x.asInstanceOf[js.Any])
    
    /**
      * Use this property to determine the value of the ProtectionUnderLockConfigRequired enterprise data protection (EDP) policy.
      * @param identity The enterprise identity you want to check has ProtectionUnderLockConfigRequired policy set.
      * @return true if ProtectionUnderLockConfigRequired policy is set for the identity, otherwise false.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.isProtectionUnderLockRequired")
    @js.native
    def isProtectionUnderLockRequired(identity: String): Boolean = js.native
    
    /**
      * Use this property to determine whether decryption of files protected by enterprise data protection (EDP) is allowed.
      * @param identity The enterprise identity you want to check has access to the protected content.
      * @return true if decryption of files protected by EDP is allowed, otherwise false.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.isUserDecryptionAllowed")
    @js.native
    def isUserDecryptionAllowed(identity: String): Boolean = js.native
    
    /** An event that is raised in response to changes in enterprise data protection (EDP) policy managed by the Policy CSP. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onpolicychanged")
    @js.native
    def onpolicychanged: EventHandler[js.Any] = js.native
    @scala.inline
    def onpolicychanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onpolicychanged")(x.asInstanceOf[js.Any])
    
    /** Event with which the app registers to receive notification that protection has been resumed. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onprotectedaccessresumed")
    @js.native
    def onprotectedaccessresumed: EventHandler[js.Any] = js.native
    @scala.inline
    def onprotectedaccessresumed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprotectedaccessresumed")(x.asInstanceOf[js.Any])
    
    /** Event with which the app registers to receive notification that protection is to be suspended. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onprotectedaccesssuspending")
    @js.native
    def onprotectedaccesssuspending: EventHandler[js.Any] = js.native
    @scala.inline
    def onprotectedaccesssuspending_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprotectedaccesssuspending")(x.asInstanceOf[js.Any])
    
    /** Event with which the app registers to receive notification that protection is to be revoked. When the app receives this event, it should determine from ProtectedContentRevokedEventArgs.Identities which enterprise entities have had protection revoked, and call RevokeContent as well as delete any metadata associated with the identity. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onprotectedcontentrevoked")
    @js.native
    def onprotectedcontentrevoked: EventHandler[js.Any] = js.native
    @scala.inline
    def onprotectedcontentrevoked_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprotectedcontentrevoked")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.removeEventListener")
    @js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.removeEventListener")
    @js.native
    def removeEventListener_policychanged(`type`: policychanged, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.removeEventListener")
    @js.native
    def removeEventListener_protectedaccessresumed(`type`: protectedaccessresumed, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.removeEventListener")
    @js.native
    def removeEventListener_protectedaccesssuspending(`type`: protectedaccesssuspending, listener: EventHandler[_]): Unit = js.native
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.removeEventListener")
    @js.native
    def removeEventListener_protectedcontentrevoked(`type`: protectedcontentrevoked, listener: EventHandler[_]): Unit = js.native
    
    /**
      * Request access to enterprise protected content for an identity.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param targetIdentity The target enterprise identity to which the content is protected.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the request.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.requestAccessAsync")
    @js.native
    def requestAccessAsync(sourceIdentity: String, targetIdentity: String): IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult] = js.native
    
    /**
      * Request access to enterprise-protected content for a specific target app.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param appPackageFamilyName The package family name of the app you want to check has access to the protected content.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.requestAccessForAppAsync")
    @js.native
    def requestAccessForAppAsync(sourceIdentity: String, appPackageFamilyName: String): IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult] = js.native
    
    /**
      * Revoke the keys required to access all content protected to the specified enterprise identity.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.revokeContent")
    @js.native
    def revokeContent(identity: String): Unit = js.native
    
    /**
      * Enables UI policy enforcement for an enterprise identity. When an app is about to display a protected file (such as a PDF) or resource (buffer or stream) on its UI, it must enable UI policy enforcement based on the identity the file is protected to. A call to TryApplyProcessUIPolicy ensures that the OS knows about the current context of the app.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return true if the identity is being managed by an enterprise policy, or false if it is not.
      */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.tryApplyProcessUIPolicy")
    @js.native
    def tryApplyProcessUIPolicy(identity: String): Boolean = js.native
  }
  
  /** A protected network context for an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy. */
  @JSGlobal("Windows.Security.EnterpriseData.ThreadNetworkContext")
  @js.native
  abstract class ThreadNetworkContext ()
    extends typings.winrtUwp.Windows.Security.EnterpriseData.ThreadNetworkContext
}
