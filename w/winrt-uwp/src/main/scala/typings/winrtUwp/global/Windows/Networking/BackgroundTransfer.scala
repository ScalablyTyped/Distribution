package typings.winrtUwp.global.Windows.Networking

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Background.IBackgroundTrigger
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundDownloadProgress
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority
import typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundUploadProgress
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables advanced download and upload transfer capabilities within an app. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
object BackgroundTransfer {
  
  /** Used to configure downloads prior to the actual creation of the download operation using CreateDownload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
  @js.native
  /** Creates a new BackgroundDownloader object. */
  class BackgroundDownloader ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundDownloader {
    /**
      * Creates a new BackgroundDownloader object with a BackgroundTransferCompletionGroup .
      * @param completionGroup The completion group to associate with this BackgroundDownloader object.
      */
    def this(completionGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup) = this()
  }
  object BackgroundDownloader {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a collection of pending downloads that are not associated with a group.
      * @return A collection of pending downloads for the current application instance.
      */
    /* static member */
    inline def getCurrentDownloadsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentDownloadsAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    /**
      * Returns a collection of pending downloads for a specific Group .
      * @param group A string indicating a specific group of transfers.
      * @return A collection of pending downloads for the specific group.
      */
    /* static member */
    inline def getCurrentDownloadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentDownloadsAsync")(group.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Gets all downloads associated with the provided BackgroundTransferGroup .
      * @param group Contains information used to identify a group of downloads.
      * @return A list of downloads currently associated with the specified group.
      */
    /* static member */
    inline def getCurrentDownloadsForTransferGroupAsync(group: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentDownloadsForTransferGroupAsync")(group.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Used to request an unconstrained download operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
      * @param operations The download operation to run unconstrained.
      * @return Indicates if the operations will run unconstrained.
      */
    /* static member */
    inline def requestUnconstrainedDownloadsAsync(operations: IIterable[typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation]): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUnconstrainedDownloadsAsync")(operations.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
      ]]
  }
  
  /** Defines values used to indicate if downloads and uploads within a BackgroundTransferGroup run in simultaneously or in serial. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior")
  @js.native
  object BackgroundTransferBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior & Double
      ] = js.native
    
    /* 0 */ val parallel: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.parallel & Double = js.native
    
    /* 1 */ val serialized: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.serialized & Double = js.native
  }
  
  /** Represents a set of background transfer operations ( DownloadOperation or UploadOperation objects) that trigger a background task once all the operations are done (if the operations completed successfully) or fail with an error. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup")
  @js.native
  /** Creates a new BackgroundTransferCompletionGroup object. */
  class BackgroundTransferCompletionGroup ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup {
    
    /** Indicates that the BackgroundTransferCompletionGroup is complete and no more background transfer operations ( DownloadOperation or UploadOperation objects) will be added t the completion group. */
    /* CompleteClass */
    override def enable(): Unit = js.native
    
    /** Gets a value that indicates if Enable method on a BackgroundTransferCompletionGroup has already been called. */
    /* CompleteClass */
    var isEnabled: Boolean = js.native
    
    /** Gets the IBackgroundTrigger used to set up the background task associated with the BackgroundTransferCompletionGroup . */
    /* CompleteClass */
    var trigger: IBackgroundTrigger = js.native
  }
  
  /** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails")
  @js.native
  abstract class BackgroundTransferCompletionGroupTriggerDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails {
    
    /** Gets the list of DownloadOperation objects associated with the BackgroundTransferCompletionGroup . */
    /* CompleteClass */
    var downloads: IVectorView[typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation] = js.native
    
    /** Gets the list of UploadOperation objects associated with the BackgroundTransferCompletionGroup . */
    /* CompleteClass */
    var uploads: IVectorView[typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation] = js.native
  }
  
  /** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
  @js.native
  /** Creates a BackgroundTransferContentPart object. */
  class BackgroundTransferContentPart ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
    /**
      * Creates a BackgroundTransferContentPart object that identifies the content it represents.
      * @param name Identifies the content.
      */
    def this(name: String) = this()
    /**
      * Creates a BackgroundTransferContentPart object that identifies the file content and the name of the file that it represents.
      * @param name Identifies the content.
      * @param fileName The fully qualified file name, including the local path.
      */
    def this(name: String, fileName: String) = this()
    
    /**
      * Sets the source file for a BackgroundTransferContentPart containing the file for upload.
      * @param value The source file.
      */
    /* CompleteClass */
    override def setFile(value: IStorageFile): Unit = js.native
    
    /**
      * Sets content disposition header values that indicate the nature of the information that this BackgroundTransferContentPart represents.
      * @param headerName The header name.
      * @param headerValue The header value.
      */
    /* CompleteClass */
    override def setHeader(headerName: String, headerValue: String): Unit = js.native
    
    /**
      * Use this method to set text information that the BackgroundTransferContentPart represents.
      * @param value A string value used to represent text information. (e.g. api_sig, api_key, auth_token, etc...)
      */
    /* CompleteClass */
    override def setText(value: String): Unit = js.native
  }
  
  /** Defines values used to specify whether transfers can occur on metered networks. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
  @js.native
  object BackgroundTransferCostPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy & Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default & Double = js.native
    
    /* 2 */ val always: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always & Double = js.native
    
    /* 1 */ val unrestrictedOnly: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly & Double = js.native
  }
  
  /** Used to provide errors encountered during a transfer operation. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
  @js.native
  abstract class BackgroundTransferError ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  object BackgroundTransferError {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets the specific error using the returned HRESULT value. Possible values are defined by WebErrorStatus .
      * @param hresult An HRESULT returned during the operation.
      * @return The error encountered.
      */
    /* static member */
    inline def getStatus(hresult: Double): WebErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[WebErrorStatus]
  }
  
  /** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
  @js.native
  abstract class BackgroundTransferGroup ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup {
    
    /** Gets the name of the group. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Gets or sets the property used to specify if transfers within this group run simultaneously or in serial. Possible values are defined by BackgroundTransferBehavior . */
    /* CompleteClass */
    var transferBehavior: BackgroundTransferBehavior = js.native
  }
  object BackgroundTransferGroup {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a transfer group using the provided group name.
      * @param name The name of the group. If a group with the this name already exists, this method will return a reference to the existing group object.
      * @return The new BackgroundTransferGroup .
      */
    /* static member */
    inline def createGroup(name: String): typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("createGroup")(name.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup]
  }
  
  /** Defines the values used to indicate the priority of a download or upload operation when within a BackgroundTransferGroup . */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferPriority")
  @js.native
  object BackgroundTransferPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority & Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.default & Double = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.high & Double = js.native
  }
  
  /** Defines transfer operation status values. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
  @js.native
  object BackgroundTransferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus & Double
      ] = js.native
    
    /* 6 */ val canceled: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled & Double = js.native
    
    /* 5 */ val completed: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed & Double = js.native
    
    /* 7 */ val error: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error & Double = js.native
    
    /* 0 */ val idle: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle & Double = js.native
    
    /* 2 */ val pausedByApplication: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication & Double = js.native
    
    /* 3 */ val pausedCostedNetwork: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork & Double = js.native
    
    /* 4 */ val pausedNoNetwork: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork & Double = js.native
    
    /* 8 */ val pausedSystemPolicy: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedSystemPolicy & Double = js.native
    
    /* 1 */ val running: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running & Double = js.native
  }
  
  /** Used to configure upload prior to the actual creation of the upload operation using CreateUpload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
  @js.native
  /** Instantiates a new BackgroundUploader object. */
  class BackgroundUploader ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundUploader {
    /**
      * Instantiates a new BackgroundUploader object as a member of a completion group.
      * @param completionGroup The completion group that the created BackgroundUploader instance is to be a member of.
      */
    def this(completionGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup) = this()
  }
  object BackgroundUploader {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a collection of pending uploads that are not associated with a group.
      * @return A collection of pending uploads for the current application instance.
      */
    /* static member */
    inline def getCurrentUploadsAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUploadsAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    /**
      * Returns a collection of pending uploads for a specific Group .
      * @param group A string indicating a specific group of uploads.
      * @return A collection of pending uploads for the specific group.
      */
    /* static member */
    inline def getCurrentUploadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUploadsAsync")(group.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Gets all uploads associated with the provided BackgroundTransferGroup .
      * @param group Contains information used to identify a group of uploads.
      * @return A list of uploads currently associated with the specified group.
      */
    /* static member */
    inline def getCurrentUploadsForTransferGroupAsync(group: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentUploadsForTransferGroupAsync")(group.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[js.Any]]]
    
    /**
      * Used to request an unconstrained upload operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
      * @param operations The upload operation to run unconstrained.
      * @return Indicates if the operations will run unconstrained.
      */
    /* static member */
    inline def requestUnconstrainedUploadsAsync(operations: IIterable[typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation]): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUnconstrainedUploadsAsync")(operations.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
      ]]
  }
  
  /** Provides properties for specifying web resources to be prefetched. Windows will use heuristics to attempt to download the specified resources in advance of your app being launched by the user. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
  @js.native
  abstract class ContentPrefetcher ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.ContentPrefetcher
  object ContentPrefetcher {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
    @js.native
    val ^ : js.Any = js.native
    
    /** Array of URIs to download when prefetch is performed for the app. */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher.contentUris")
    @js.native
    def contentUris: IVector[Uri] = js.native
    inline def contentUris_=(x: IVector[Uri]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentUris")(x.asInstanceOf[js.Any])
    
    /** Specifies the location of a well-formed XML file that contains a list of resources to be prefetched. */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher.indirectContentUri")
    @js.native
    def indirectContentUri: Uri = js.native
    inline def indirectContentUri_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectContentUri")(x.asInstanceOf[js.Any])
    
    /** Gets the date and time of the last successful content prefetch operation. */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher.lastSuccessfulPrefetchTime")
    @js.native
    def lastSuccessfulPrefetchTime: Date = js.native
    inline def lastSuccessfulPrefetchTime_=(x: Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulPrefetchTime")(x.asInstanceOf[js.Any])
  }
  
  /** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
  @js.native
  abstract class DownloadOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation {
    
    /**
      * Returns an asynchronous operation that can be used to monitor progress and completion of the attached download. Calling this method allows an app to attach download operations that were started in a previous app instance.
      * @return Download operation with callback.
      */
    /* CompleteClass */
    override def attachAsync(): IPromiseWithIAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation, 
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation
      ] = js.native
    
    /** Gets and sets the cost policy for the download. */
    /* CompleteClass */
    var costPolicy: BackgroundTransferCostPolicy = js.native
    
    /**
      * Gets the response information.
      * @return Contains the data returned by a server response.
      */
    /* CompleteClass */
    override def getResponseInformation(): typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
    
    /**
      * Gets the partially downloaded response at the specified position.
      * @param position The position at which to start reading.
      * @return The result stream.
      */
    /* CompleteClass */
    override def getResultStreamAt(position: Double): IInputStream = js.native
    
    /** Gets a string value indicating the group the transfer belongs to. */
    /* CompleteClass */
    var group: String = js.native
    
    /** This is a unique identifier for a specific download operation. A GUID associated to a download operation will not change for the duration of the download. */
    /* CompleteClass */
    var guid: String = js.native
    
    /** Gets the method to use for the download. */
    /* CompleteClass */
    var method: String = js.native
    
    /** Pauses a download operation. */
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /** Gets or sets the transfer priority of this download operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
    /* CompleteClass */
    var priority: BackgroundTransferPriority = js.native
    
    /** Gets the current progress of the upload operation. */
    /* CompleteClass */
    var progress: BackgroundDownloadProgress = js.native
    
    /** Gets the URI from which to download the file. */
    /* CompleteClass */
    var requestedUri: Uri = js.native
    
    /** Returns the IStorageFile object provided by the caller when creating the DownloadOperation object using CreateDownload . */
    /* CompleteClass */
    var resultFile: IStorageFile = js.native
    
    /** Resumes a paused download operation. */
    /* CompleteClass */
    override def resume(): Unit = js.native
    
    /**
      * Starts an asynchronous download operation.
      * @return An asynchronous download operation that includes progress updates.
      */
    /* CompleteClass */
    override def startAsync(): IPromiseWithIAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation, 
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation
      ] = js.native
    
    /** Gets the group that this download operation belongs to. */
    /* CompleteClass */
    var transferGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = js.native
  }
  
  /** Represents data that is returned by a server response. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
  @js.native
  abstract class ResponseInformation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation {
    
    /** Gets the URI that contains the requested data. */
    /* CompleteClass */
    var actualUri: Uri = js.native
    
    /** Gets all response headers sent by the server. */
    /* CompleteClass */
    var headers: IMapView[String, String] = js.native
    
    /** Gets a value that specifies whether the download is resumable. */
    /* CompleteClass */
    var isResumable: Boolean = js.native
    
    /** Gets the status code returned by the server. */
    /* CompleteClass */
    var statusCode: Double = js.native
  }
  
  /** Represents the result a request for unconstrained transfers from a BackgroundDownloader or BackgroundUploader object. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult")
  @js.native
  abstract class UnconstrainedTransferRequestResult ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult {
    
    /** Gets a value that indicates if the download or upload operations will run without the resource restrictions normally associated with background network operations while a device running on battery. */
    /* CompleteClass */
    var isUnconstrained: Boolean = js.native
  }
  
  /** Performs an asynchronous upload operation. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
  @js.native
  abstract class UploadOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation {
    
    /**
      * Returns an asynchronous operation that can be used to monitor progress and completion of the attached upload. Calling this method allows an app to attach upload operations that were started in a previous app instance.
      * @return Upload operation with callback.
      */
    /* CompleteClass */
    override def attachAsync(): IPromiseWithIAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation, 
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation
      ] = js.native
    
    /** Gets and sets the cost policy for the upload. */
    /* CompleteClass */
    var costPolicy: BackgroundTransferCostPolicy = js.native
    
    /**
      * Gets the response information.
      * @return Contains the data returned by a server response.
      */
    /* CompleteClass */
    override def getResponseInformation(): typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation = js.native
    
    /**
      * Gets the partially uploaded response at the specified location.
      * @param position The position at which to start reading.
      * @return The result stream.
      */
    /* CompleteClass */
    override def getResultStreamAt(position: Double): IInputStream = js.native
    
    /** Gets a string value indicating the group the upload belongs to. */
    /* CompleteClass */
    var group: String = js.native
    
    /** This is a unique identifier for a specific upload operation. A GUID associated to a upload operation will not change for the duration of the upload. */
    /* CompleteClass */
    var guid: String = js.native
    
    /** Gets the method to use for the upload. */
    /* CompleteClass */
    var method: String = js.native
    
    /** Gets or sets the transfer priority of this upload operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
    /* CompleteClass */
    var priority: BackgroundTransferPriority = js.native
    
    /** Gets the current progress of the upload operation. */
    /* CompleteClass */
    var progress: BackgroundUploadProgress = js.native
    
    /** Gets the URI to upload from. */
    /* CompleteClass */
    var requestedUri: Uri = js.native
    
    /** Specifies the IStorageFile to upload. */
    /* CompleteClass */
    var sourceFile: IStorageFile = js.native
    
    /**
      * Starts an asynchronous upload operation.
      * @return An asynchronous upload operation that includes progress updates.
      */
    /* CompleteClass */
    override def startAsync(): IPromiseWithIAsyncOperationWithProgress[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation, 
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation
      ] = js.native
    
    /** Gets the group that this upload operation belongs to. */
    /* CompleteClass */
    var transferGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = js.native
  }
}
