package typings.winrtUwp.global.Windows.Security

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Deferral
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus
import typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel
import typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus
import typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus
import typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult
import typings.winrtUwp.Windows.Storage.CreationCollisionOption
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.NameCollisionOption
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.winrtUwpStrings.policychanged
import typings.winrtUwp.winrtUwpStrings.protectedaccessresumed
import typings.winrtUwp.winrtUwpStrings.protectedaccesssuspending
import typings.winrtUwp.winrtUwpStrings.protectedcontentrevoked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes that support enterprise data protection (EDP). For the full developer picture of how EDP relates to files, buffers, the clipboard, networking, background tasks, and data protection under lock, see Enterprise data protection. */
object EnterpriseData {
  
  /** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
  @JSGlobal("Windows.Security.EnterpriseData.BufferProtectUnprotectResult")
  @js.native
  abstract class BufferProtectUnprotectResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult {
    
    /** Gets the enterprise protected buffer that has been protected or unprotected. */
    /* CompleteClass */
    var buffer: IBuffer = js.native
    
    /** Gets the DataProtectionInfo object concerning the enterprise protected buffer that has been protected or unprotected. */
    /* CompleteClass */
    var protectionInfo: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo = js.native
  }
  
  /** Contains information about an enterprise protected buffer or stream. */
  @JSGlobal("Windows.Security.EnterpriseData.DataProtectionInfo")
  @js.native
  abstract class DataProtectionInfo ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo {
    
    /** The enterprise identity of the enterprise protected buffer or stream. */
    /* CompleteClass */
    var identity: String = js.native
    
    /** The protection status of the enterprise protected buffer or stream. */
    /* CompleteClass */
    var status: DataProtectionStatus = js.native
  }
  
  /** Provides access to operations that manage buffers and streams that are protected to an enterprise identity. */
  @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager")
  @js.native
  abstract class DataProtectionManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionManager
  object DataProtectionManager {
    
    @JSGlobal("Windows.Security.EnterpriseData.DataProtectionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the status of an enterprise protected buffer.
      * @param protectedData The buffer for which protection status is being queried.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the buffer.
      */
    /* static member */
    inline def getProtectionInfoAsync(protectedData: IBuffer): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtectionInfoAsync")(protectedData.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo]]
    
    /**
      * Get the status of an enterprise protected stream.
      * @param protectedStream The stream for which protection status is being queried.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the stream.
      */
    /* static member */
    inline def getStreamProtectionInfoAsync(protectedStream: IInputStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamProtectionInfoAsync")(protectedStream.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo]]
    
    /**
      * Protect the data in a buffer to an enterprise identity.
      * @param data The buffer to be protected.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return When the call to this method completes successfully, it returns a BufferProtectUnprotectResult object that contains the status of the newly protected buffer.
      */
    /* static member */
    inline def protectAsync(data: IBuffer, identity: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("protectAsync")(data.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult]]
    
    /**
      * Protect a stream of data to an enterprise identity.
      * @param unprotectedStream The input, unprotected stream.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param protectedStream The output, protected stream.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the protected stream.
      */
    /* static member */
    inline def protectStreamAsync(unprotectedStream: IInputStream, identity: String, protectedStream: IOutputStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("protectStreamAsync")(unprotectedStream.asInstanceOf[js.Any], identity.asInstanceOf[js.Any], protectedStream.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo]]
    
    /**
      * Removes the protection to an enterprise identity from a buffer.
      * @param data The buffer to be unprotected.
      * @return When the call to this method completes successfully, it returns a BufferProtectUnprotectResult object that contains the status of the unprotected buffer.
      */
    /* static member */
    inline def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("unprotectAsync")(data.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult]]
    
    /**
      * Removes the protection to an enterprise identity from a stream of data.
      * @param protectedStream The input, protected stream.
      * @param unprotectedStream The output, unprotected stream.
      * @return When the call to this method completes successfully, it returns a DataProtectionInfo object that contains the status of the unprotected stream.
      */
    /* static member */
    inline def unprotectStreamAsync(protectedStream: IInputStream, unprotectedStream: IOutputStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("unprotectStreamAsync")(protectedStream.asInstanceOf[js.Any], unprotectedStream.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo]]
  }
  
  /** Describes the enterprise identity protection state of a buffer or stream. */
  @JSGlobal("Windows.Security.EnterpriseData.DataProtectionStatus")
  @js.native
  object DataProtectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus & Double] = js.native
    
    /* 5 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.accessSuspended & Double = js.native
    
    /* 4 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.licenseExpired & Double = js.native
    
    /* 1 */ val `protected`: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.`protected` & Double = js.native
    
    /* 0 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.protectedToOtherIdentity & Double = js.native
    
    /* 2 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.revoked & Double = js.native
    
    /* 3 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionStatus.unprotected & Double = js.native
  }
  
  /** A set of enumerated values together describing the possible enterprise data protection (EDP) enforcement levels. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration. */
  @JSGlobal("Windows.Security.EnterpriseData.EnforcementLevel")
  @js.native
  object EnforcementLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel & Double] = js.native
    
    /* 3 */ val block: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.block & Double = js.native
    
    /* 0 */ val noProtection: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.noProtection & Double = js.native
    
    /* 2 */ val `override`: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.`override` & Double = js.native
    
    /* 1 */ val silent: typings.winrtUwp.Windows.Security.EnterpriseData.EnforcementLevel.silent & Double = js.native
  }
  
  /** Contains information about an enterprise protected file. */
  @JSGlobal("Windows.Security.EnterpriseData.FileProtectionInfo")
  @js.native
  abstract class FileProtectionInfo ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo {
    
    /** The enterprise identity of the enterprise protected file. */
    /* CompleteClass */
    var identity: String = js.native
    
    /** Specifies if the protection of the enterprise protected file can be roamed to other devices. */
    /* CompleteClass */
    var isRoamable: Boolean = js.native
    
    /** The protection status of the enterprise protected file. */
    /* CompleteClass */
    var status: FileProtectionStatus = js.native
  }
  
  /** Provides access to operations that manage files that are protected to an enterprise identity. */
  @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager")
  @js.native
  abstract class FileProtectionManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionManager
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
    inline def copyProtectionAsync(source: IStorageItem, target: IStorageItem): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyProtectionAsync")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    
    /**
      * Create an enterprise-protected file.
      * @param parentFolder The folder into which to create the enterprise protected file.
      * @param desiredName The desired name of the new enterprise protected file.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param collisionOption A CreationCollisionOption value that specifies what to do if desiredName already exists.
      * @return When the call to this method completes successfully, it returns a ProtectedFileCreateResult object representing the newly created protected file.
      */
    /* static member */
    inline def createProtectedAndOpenAsync(
      parentFolder: IStorageFolder,
      desiredName: String,
      identity: String,
      collisionOption: CreationCollisionOption
    ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProtectedAndOpenAsync")(parentFolder.asInstanceOf[js.Any], desiredName.asInstanceOf[js.Any], identity.asInstanceOf[js.Any], collisionOption.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult]]
    
    /**
      * Get the status of an enterprise-protected file.
      * @param source The file or folder for which protection status is being queried.
      * @return When the call to this method completes successfully, it returns a FileProtectionInfo object that contains the status of the file.
      */
    /* static member */
    inline def getProtectionInfoAsync(source: IStorageItem): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProtectionInfoAsync")(source.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo]]
    
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager.isContainerAsync")
    @js.native
    def isContainerAsync: js.Any = js.native
    inline def isContainerAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isContainerAsync")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /**
      * Create an enterprise-protected file, and load it from a container file.
      * @param containerFile The enterprise protected file to be created and loaded.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
      */
    /* static member */
    inline def loadFileFromContainerAsync(containerFile: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFileFromContainerAsync")(containerFile.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult]]
    /**
      * Create an enterprise-protected file in a specified storage item (such as a folder), and load it from a container file.
      * @param containerFile The enterprise protected file to be created and loaded.
      * @param target The storage item into which to create the enterprise protected file.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
      */
    /* static member */
    inline def loadFileFromContainerAsync(containerFile: IStorageFile, target: IStorageItem): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFileFromContainerAsync")(containerFile.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult]]
    /**
      * Create an enterprise-protected file in a specified storage item (such as a folder), and load it from a container file.
      * @param containerFile The enterprise protected file to be created and loaded.
      * @param target The storage item into which to create the enterprise protected file.
      * @param collisionOption The enum value that determines how Windows responds if the created file has the same name as an existing item in the container's location.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
      */
    /* static member */
    inline def loadFileFromContainerAsync(containerFile: IStorageFile, target: IStorageItem, collisionOption: NameCollisionOption): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFileFromContainerAsync")(containerFile.asInstanceOf[js.Any], target.asInstanceOf[js.Any], collisionOption.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult]]
    
    /**
      * Protect the data in a file to an enterprise identity. The app can then use standard APIs to read or write from the file.
      * @param target The file to be protected.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Use ProtectionPolicyManager.IsIdentityManaged to confirm that an email address or domain is managed before using the identity to protect a file.
      * @return When the call to this method completes successfully, it returns a FileProtectionInfo object that contains the status of the newly protected file.
      */
    /* static member */
    inline def protectAsync(target: IStorageItem, identity: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("protectAsync")(target.asInstanceOf[js.Any], identity.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo]]
    
    /**
      * Save an enterprise-protected file as a containerized version.
      * @param protectedFile The protected source file being copied.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerExportResult object representing the newly created container file.
      */
    /* static member */
    inline def saveFileAsContainerAsync(protectedFile: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveFileAsContainerAsync")(protectedFile.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult]]
    /**
      * Save an enterprise-protected file as a containerized version, and share it with a specified list of user identities.
      * @param protectedFile The protected source file being copied.
      * @param sharedWithIdentities A collection of strings representing the user identities to share the containerized file with. For example, email recipients.
      * @return When the call to this method completes successfully, it returns a ProtectedContainerExportResult object representing the newly created container file.
      */
    /* static member */
    inline def saveFileAsContainerAsync(protectedFile: IStorageFile, sharedWithIdentities: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("saveFileAsContainerAsync")(protectedFile.asInstanceOf[js.Any], sharedWithIdentities.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult]]
  }
  
  /** Describes the enterprise protection state of a file or folder. */
  @JSGlobal("Windows.Security.EnterpriseData.FileProtectionStatus")
  @js.native
  object FileProtectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus & Double] = js.native
    
    /* 10 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.accessSuspended & Double = js.native
    
    /* 9 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.licenseExpired & Double = js.native
    
    /* 7 */ val notProtectable: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.notProtectable & Double = js.native
    
    /* 4 */ val `protected`: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.`protected` & Double = js.native
    
    /* 5 */ val protectedByOtherUser: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedByOtherUser & Double = js.native
    
    /* 6 */ val protectedToOtherEnterprise: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedToOtherEnterprise & Double = js.native
    
    /* 8 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.protectedToOtherIdentity & Double = js.native
    
    /* 3 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.revoked & Double = js.native
    
    /* 0 */ val undetermined: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.undetermined & Double = js.native
    
    /* 1 */ val unknown: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.unknown & Double = js.native
    
    /* 2 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus.unprotected & Double = js.native
  }
  
  /** Provides access to Selective Wipe operations. */
  @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager")
  @js.native
  abstract class FileRevocationManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.FileRevocationManager
  object FileRevocationManager {
    
    @JSGlobal("Windows.Security.EnterpriseData.FileRevocationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copy the selective wipe protection state of a file or folder to a new file or folder.
      * @param sourceStorageItem The source item to copy the selective wipe protection status from.
      * @param targetStorageItem The target item to copy the selective wipe protection status to.
      * @return True if the copy operation was successful; otherwise false.
      */
    /* static member */
    inline def copyProtectionAsync(sourceStorageItem: IStorageItem, targetStorageItem: IStorageItem): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyProtectionAsync")(sourceStorageItem.asInstanceOf[js.Any], targetStorageItem.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
    
    /**
      * Gets the selective wipe protection status for a file or folder.
      * @param storageItem The file or folder to get the selective wipe protection status for.
      * @return An aysnchronous operation that retrieves the selective wipe protection status for the storageItem.
      */
    /* static member */
    inline def getStatusAsync(storageItem: IStorageItem): IPromiseWithIAsyncOperation[FileProtectionStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusAsync")(storageItem.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[FileProtectionStatus]]
    
    /**
      * Protects a file or folder for selective wipe.
      * @param storageItem The file or folder to protect for selective wipe.
      * @param enterpriseIdentity The enterprise id that the file or folder is protected for. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
      * @return An asynchronous operation that retrieves the selective wipe protection status for the storageItem.
      */
    /* static member */
    inline def protectAsync(storageItem: IStorageItem, enterpriseIdentity: String): IPromiseWithIAsyncOperation[FileProtectionStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("protectAsync")(storageItem.asInstanceOf[js.Any], enterpriseIdentity.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[FileProtectionStatus]]
    
    /**
      * Revokes all files and folders protected for selective wipe for a specified enterprise id.
      * @param enterpriseIdentity Revoke all files and folders protected by selective wipe for this enterprise id. The enterpriseIdentity value must be formatted as an Internationalized Domain Name (IDN) and cannot contain spaces. For example, contoso.com.
      */
    /* static member */
    inline def revoke(enterpriseIdentity: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revoke")(enterpriseIdentity.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /** Provides data when content protection is resumed. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs")
  @js.native
  abstract class ProtectedAccessResumedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedAccessResumedEventArgs {
    
    /** Contains the enterprise identities for which content protection is being resumed. */
    /* CompleteClass */
    var identities: IVectorView[String] = js.native
  }
  
  /** Provides data when content protection is being suspended. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs")
  @js.native
  abstract class ProtectedAccessSuspendingEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedAccessSuspendingEventArgs {
    
    /** DateTime at which content protection will be suspended. The app can subtract DateTime.Now from this value to determine how much time there is to perform any processing before the suspension occurs. */
    /* CompleteClass */
    var deadline: Date = js.native
    
    /**
      * Gets the Deferral object that manages the protection suspension. The app must call Deferral.Complete before it returns from the event handler.
      * @return The Deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): Deferral = js.native
    
    /** Contains the enterprise identities for which content protection is being suspended. */
    /* CompleteClass */
    var identities: IVectorView[String] = js.native
  }
  
  /** Represents the result of an enterprise protected file that has been exported to a container file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerExportResult")
  @js.native
  abstract class ProtectedContainerExportResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerExportResult {
    
    /** The container file that has been exported from an enterprise protected file. */
    /* CompleteClass */
    var file: StorageFile = js.native
    
    /** The protection status after an enterprise protected file has been exported to a container file. */
    /* CompleteClass */
    var status: ProtectedImportExportStatus = js.native
  }
  
  /** Represents the result of an enterprise protected file that has been imported from a container file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerImportResult")
  @js.native
  abstract class ProtectedContainerImportResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult {
    
    /** The enterprise protected file that has been loaded from a container file. */
    /* CompleteClass */
    var file: StorageFile = js.native
    
    /** The protection status after an enterprise protected file has been imported from a container file. */
    /* CompleteClass */
    var status: ProtectedImportExportStatus = js.native
  }
  
  /** Provides data when content protection has been revoked. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs")
  @js.native
  abstract class ProtectedContentRevokedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContentRevokedEventArgs {
    
    /** Contains the enterprise identities for which content protection has been revoked. */
    /* CompleteClass */
    var identities: IVectorView[String] = js.native
  }
  
  /** Contains information about a newly created enterprise protected file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedFileCreateResult")
  @js.native
  abstract class ProtectedFileCreateResult ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult {
    
    /** The newly created enterprise protected file. */
    /* CompleteClass */
    var file: StorageFile = js.native
    
    /** Information about the enterprise protected file. */
    /* CompleteClass */
    var protectionInfo: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo = js.native
    
    /** The stream random access to the newly created enterprise protected file. */
    /* CompleteClass */
    var stream: IRandomAccessStream = js.native
  }
  
  /** Possible status values for an enterprise protected file that has been imported from or exported to a container file. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectedImportExportStatus")
  @js.native
  object ProtectedImportExportStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus & Double
      ] = js.native
    
    /* 7 */ val accessSuspended: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.accessSuspended & Double = js.native
    
    /* 6 */ val licenseExpired: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.licenseExpired & Double = js.native
    
    /* 4 */ val notRoamable: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.notRoamable & Double = js.native
    
    /* 0 */ val ok: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.ok & Double = js.native
    
    /* 5 */ val protectedToOtherIdentity: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.protectedToOtherIdentity & Double = js.native
    
    /* 3 */ val revoked: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.revoked & Double = js.native
    
    /* 1 */ val undetermined: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.undetermined & Double = js.native
    
    /* 2 */ val unprotected: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus.unprotected & Double = js.native
  }
  
  /** Possible results when access to protected content is requested or queried. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult")
  @js.native
  object ProtectionPolicyEvaluationResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult & Double
      ] = js.native
    
    /* 0 */ val allowed: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.allowed & Double = js.native
    
    /* 1 */ val blocked: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.blocked & Double = js.native
    
    /* 2 */ val consentRequired: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyEvaluationResult.consentRequired & Double = js.native
  }
  
  /** Manages enterprise-protection policy on protected content. */
  @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager")
  @js.native
  abstract class ProtectionPolicyManager ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyManager {
    
    /** Gets or sets the enterprise identity. */
    /* CompleteClass */
    var identity: String = js.native
  }
  object ProtectionPolicyManager {
    
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def addEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_policychanged(`type`: policychanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_protectedaccessresumed(`type`: protectedaccessresumed, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_protectedaccesssuspending(`type`: protectedaccesssuspending, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def addEventListener_protectedcontentrevoked(`type`: protectedcontentrevoked, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Request if access to enterprise-protected content is available to an identity.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to check if an email address or domain is managed.
      * @param targetIdentity The enterprise identity you want to check has access to the protected content.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
      */
    /* static member */
    inline def checkAccess(sourceIdentity: String, targetIdentity: String): ProtectionPolicyEvaluationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAccess")(sourceIdentity.asInstanceOf[js.Any], targetIdentity.asInstanceOf[js.Any])).asInstanceOf[ProtectionPolicyEvaluationResult]
    
    /**
      * Perform enterprise-protection policy evaluation for a data transfer between your app and a specific target app.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to check if an email address or domain is managed.
      * @param appPackageFamilyName The package family name of the app you want to check has access to the protected content.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
      */
    /* static member */
    inline def checkAccessForApp(sourceIdentity: String, appPackageFamilyName: String): ProtectionPolicyEvaluationResult = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAccessForApp")(sourceIdentity.asInstanceOf[js.Any], appPackageFamilyName.asInstanceOf[js.Any])).asInstanceOf[ProtectionPolicyEvaluationResult]
    
    /** Clear UI policy enforcement for an enterprise identity. The app calls this method before it displays non-enterprise-protected content. */
    /* static member */
    inline def clearProcessUIPolicy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearProcessUIPolicy")().asInstanceOf[Unit]
    
    /**
      * Creates a ThreadNetworkContext protected to an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy.
      * @param identity The enterprise identity. This is an email address or domain that is managed. This may be returned from GetPrimaryManagedIdentityForNetworkEndpoint ; otherwise your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return The protected network context. The app must call ThreadNetworkContext.Close after access to the resource is completed.
      */
    /* static member */
    inline def createCurrentThreadNetworkContext(identity: String): typings.winrtUwp.Windows.Security.EnterpriseData.ThreadNetworkContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createCurrentThreadNetworkContext")(identity.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Security.EnterpriseData.ThreadNetworkContext]
    
    /**
      * You can use this method to determine the current enterprise data protection (EDP) enforcement level. EDP enforcement level is one aspect of mobile device management (MDM) policy configuration.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return A value of the EnforcementLevel enumeration.
      */
    /* static member */
    inline def getEnforcementLevel(identity: String): EnforcementLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnforcementLevel")(identity.asInstanceOf[js.Any]).asInstanceOf[EnforcementLevel]
    
    /**
      * Returns the ProtectionPolicyManager object associated with the current app window.
      * @return The ProtectionPolicyManager object associated with the current app window.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.Security.EnterpriseData.ProtectionPolicyManager]
    
    /**
      * Returns the enterprise identity of a network resource if the resource is on an enterprise-policy-managed endpoint.
      * @param endpointHost The host name or IP address of the network resource.
      * @return The enterprise identity.
      */
    /* static member */
    inline def getPrimaryManagedIdentityForNetworkEndpointAsync(endpointHost: HostName): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrimaryManagedIdentityForNetworkEndpointAsync")(endpointHost.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
    
    /**
      * Use this method to check whether access to protected data has been revoked since a specified date and time, or is still accessible.
      * @param identity The enterprise identity protecting the data. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param since The date and time from which point forward you want to include in the check.
      * @return true if access has been revoked since the specified date and time, otherwise false.
      */
    /* static member */
    inline def hasContentBeenRevokedSince(identity: String, since: Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasContentBeenRevokedSince")(identity.asInstanceOf[js.Any], since.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Determines if an enterprise entity is managed by an enterprise policy.
      * @param identity The enterprise identity. This is an email address or domain.
      * @return true if the enterprise identity is managed, or false if it is not.
      */
    /* static member */
    inline def isIdentityManaged(identity: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityManaged")(identity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Use this property to determine whether enterprise data protection (EDP) is enabled on the device. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.isProtectionEnabled")
    @js.native
    def isProtectionEnabled: Boolean = js.native
    inline def isProtectionEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProtectionEnabled")(x.asInstanceOf[js.Any])
    
    /**
      * Use this property to determine the value of the ProtectionUnderLockConfigRequired enterprise data protection (EDP) policy.
      * @param identity The enterprise identity you want to check has ProtectionUnderLockConfigRequired policy set.
      * @return true if ProtectionUnderLockConfigRequired policy is set for the identity, otherwise false.
      */
    /* static member */
    inline def isProtectionUnderLockRequired(identity: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProtectionUnderLockRequired")(identity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Use this property to determine whether decryption of files protected by enterprise data protection (EDP) is allowed.
      * @param identity The enterprise identity you want to check has access to the protected content.
      * @return true if decryption of files protected by EDP is allowed, otherwise false.
      */
    /* static member */
    inline def isUserDecryptionAllowed(identity: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUserDecryptionAllowed")(identity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** An event that is raised in response to changes in enterprise data protection (EDP) policy managed by the Policy CSP. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onpolicychanged")
    @js.native
    def onpolicychanged: EventHandler[js.Any] = js.native
    inline def onpolicychanged_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onpolicychanged")(x.asInstanceOf[js.Any])
    
    /** Event with which the app registers to receive notification that protection has been resumed. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onprotectedaccessresumed")
    @js.native
    def onprotectedaccessresumed: EventHandler[js.Any] = js.native
    inline def onprotectedaccessresumed_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprotectedaccessresumed")(x.asInstanceOf[js.Any])
    
    /** Event with which the app registers to receive notification that protection is to be suspended. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onprotectedaccesssuspending")
    @js.native
    def onprotectedaccesssuspending: EventHandler[js.Any] = js.native
    inline def onprotectedaccesssuspending_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprotectedaccesssuspending")(x.asInstanceOf[js.Any])
    
    /** Event with which the app registers to receive notification that protection is to be revoked. When the app receives this event, it should determine from ProtectedContentRevokedEventArgs.Identities which enterprise entities have had protection revoked, and call RevokeContent as well as delete any metadata associated with the identity. */
    /* static member */
    @JSGlobal("Windows.Security.EnterpriseData.ProtectionPolicyManager.onprotectedcontentrevoked")
    @js.native
    def onprotectedcontentrevoked: EventHandler[js.Any] = js.native
    inline def onprotectedcontentrevoked_=(x: EventHandler[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onprotectedcontentrevoked")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def removeEventListener(`type`: String, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_policychanged(`type`: policychanged, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_protectedaccessresumed(`type`: protectedaccessresumed, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_protectedaccesssuspending(`type`: protectedaccesssuspending, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def removeEventListener_protectedcontentrevoked(`type`: protectedcontentrevoked, listener: EventHandler[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Request access to enterprise protected content for an identity.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param targetIdentity The target enterprise identity to which the content is protected.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the request.
      */
    /* static member */
    inline def requestAccessAsync(sourceIdentity: String, targetIdentity: String): IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")(sourceIdentity.asInstanceOf[js.Any], targetIdentity.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult]]
    
    /**
      * Request access to enterprise-protected content for a specific target app.
      * @param sourceIdentity The source enterprise identity of the app. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @param appPackageFamilyName The package family name of the app you want to check has access to the protected content.
      * @return A value of the ProtectionPolicyEvaluationResult enumeration that is the result of the query.
      */
    /* static member */
    inline def requestAccessForAppAsync(sourceIdentity: String, appPackageFamilyName: String): IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessForAppAsync")(sourceIdentity.asInstanceOf[js.Any], appPackageFamilyName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[ProtectionPolicyEvaluationResult]]
    
    /**
      * Revoke the keys required to access all content protected to the specified enterprise identity.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      */
    /* static member */
    inline def revokeContent(identity: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeContent")(identity.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Enables UI policy enforcement for an enterprise identity. When an app is about to display a protected file (such as a PDF) or resource (buffer or stream) on its UI, it must enable UI policy enforcement based on the identity the file is protected to. A call to TryApplyProcessUIPolicy ensures that the OS knows about the current context of the app.
      * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
      * @return true if the identity is being managed by an enterprise policy, or false if it is not.
      */
    /* static member */
    inline def tryApplyProcessUIPolicy(identity: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryApplyProcessUIPolicy")(identity.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /** A protected network context for an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy. */
  @JSGlobal("Windows.Security.EnterpriseData.ThreadNetworkContext")
  @js.native
  abstract class ThreadNetworkContext ()
    extends StObject
       with typings.winrtUwp.Windows.Security.EnterpriseData.ThreadNetworkContext {
    
    /** Closes the protected network context. The app must call Close after access to the protected resource is completed. */
    /* CompleteClass */
    override def close(): Unit = js.native
  }
}
