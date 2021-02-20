package typings.winrtUwp.global.Windows.Networking

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables advanced download and upload transfer capabilities within an app. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
object BackgroundTransfer {
  
  /** Used to configure downloads prior to the actual creation of the download operation using CreateDownload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader")
  @js.native
  /** Creates a new BackgroundDownloader object. */
  class BackgroundDownloader ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundDownloader {
    /**
      * Creates a new BackgroundDownloader object with a BackgroundTransferCompletionGroup .
      * @param completionGroup The completion group to associate with this BackgroundDownloader object.
      */
    def this(completionGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup) = this()
  }
  object BackgroundDownloader {
    
    /**
      * Returns a collection of pending downloads that are not associated with a group.
      * @return A collection of pending downloads for the current application instance.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader.getCurrentDownloadsAsync")
    @js.native
    def getCurrentDownloadsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Returns a collection of pending downloads for a specific Group .
      * @param group A string indicating a specific group of transfers.
      * @return A collection of pending downloads for the specific group.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader.getCurrentDownloadsAsync")
    @js.native
    def getCurrentDownloadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets all downloads associated with the provided BackgroundTransferGroup .
      * @param group Contains information used to identify a group of downloads.
      * @return A list of downloads currently associated with the specified group.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader.getCurrentDownloadsForTransferGroupAsync")
    @js.native
    def getCurrentDownloadsForTransferGroupAsync(group: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Used to request an unconstrained download operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
      * @param operations The download operation to run unconstrained.
      * @return Indicates if the operations will run unconstrained.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundDownloader.requestUnconstrainedDownloadsAsync")
    @js.native
    def requestUnconstrainedDownloadsAsync(operations: IIterable[typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation]): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
      ] = js.native
  }
  
  /** Defines values used to indicate if downloads and uploads within a BackgroundTransferGroup run in simultaneously or in serial. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior")
  @js.native
  object BackgroundTransferBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior with Double
      ] = js.native
    
    /* 0 */ val parallel: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.parallel with Double = js.native
    
    /* 1 */ val serialized: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior.serialized with Double = js.native
  }
  
  /** Represents a set of background transfer operations ( DownloadOperation or UploadOperation objects) that trigger a background task once all the operations are done (if the operations completed successfully) or fail with an error. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup")
  @js.native
  /** Creates a new BackgroundTransferCompletionGroup object. */
  class BackgroundTransferCompletionGroup ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup
  
  /** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails")
  @js.native
  abstract class BackgroundTransferCompletionGroupTriggerDetails ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails
  
  /** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
  @js.native
  /** Creates a BackgroundTransferContentPart object. */
  class BackgroundTransferContentPart ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
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
  }
  
  /** Defines values used to specify whether transfers can occur on metered networks. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy")
  @js.native
  object BackgroundTransferCostPolicy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.default with Double = js.native
    
    /* 2 */ val always: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.always with Double = js.native
    
    /* 1 */ val unrestrictedOnly: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCostPolicy.unrestrictedOnly with Double = js.native
  }
  
  /** Used to provide errors encountered during a transfer operation. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError")
  @js.native
  abstract class BackgroundTransferError ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferError
  object BackgroundTransferError {
    
    /**
      * Gets the specific error using the returned HRESULT value. Possible values are defined by WebErrorStatus .
      * @param hresult An HRESULT returned during the operation.
      * @return The error encountered.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferError.getStatus")
    @js.native
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
  
  /** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup")
  @js.native
  abstract class BackgroundTransferGroup ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup
  object BackgroundTransferGroup {
    
    /**
      * Creates a transfer group using the provided group name.
      * @param name The name of the group. If a group with the this name already exists, this method will return a reference to the existing group object.
      * @return The new BackgroundTransferGroup .
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferGroup.createGroup")
    @js.native
    def createGroup(name: String): typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup = js.native
  }
  
  /** Defines the values used to indicate the priority of a download or upload operation when within a BackgroundTransferGroup . */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferPriority")
  @js.native
  object BackgroundTransferPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority with Double
      ] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.default with Double = js.native
    
    /* 1 */ val high: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.high with Double = js.native
  }
  
  /** Defines transfer operation status values. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferStatus")
  @js.native
  object BackgroundTransferStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus with Double
      ] = js.native
    
    /* 6 */ val canceled: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.canceled with Double = js.native
    
    /* 5 */ val completed: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.completed with Double = js.native
    
    /* 7 */ val error: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.error with Double = js.native
    
    /* 0 */ val idle: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.idle with Double = js.native
    
    /* 2 */ val pausedByApplication: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedByApplication with Double = js.native
    
    /* 3 */ val pausedCostedNetwork: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedCostedNetwork with Double = js.native
    
    /* 4 */ val pausedNoNetwork: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedNoNetwork with Double = js.native
    
    /* 8 */ val pausedSystemPolicy: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.pausedSystemPolicy with Double = js.native
    
    /* 1 */ val running: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferStatus.running with Double = js.native
  }
  
  /** Used to configure upload prior to the actual creation of the upload operation using CreateUpload . For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader")
  @js.native
  /** Instantiates a new BackgroundUploader object. */
  class BackgroundUploader ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundUploader {
    /**
      * Instantiates a new BackgroundUploader object as a member of a completion group.
      * @param completionGroup The completion group that the created BackgroundUploader instance is to be a member of.
      */
    def this(completionGroup: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup) = this()
  }
  object BackgroundUploader {
    
    /**
      * Returns a collection of pending uploads that are not associated with a group.
      * @return A collection of pending uploads for the current application instance.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader.getCurrentUploadsAsync")
    @js.native
    def getCurrentUploadsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Returns a collection of pending uploads for a specific Group .
      * @param group A string indicating a specific group of uploads.
      * @return A collection of pending uploads for the specific group.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader.getCurrentUploadsAsync")
    @js.native
    def getCurrentUploadsAsync(group: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Gets all uploads associated with the provided BackgroundTransferGroup .
      * @param group Contains information used to identify a group of uploads.
      * @return A list of uploads currently associated with the specified group.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader.getCurrentUploadsForTransferGroupAsync")
    @js.native
    def getCurrentUploadsForTransferGroupAsync(group: typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferGroup): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Used to request an unconstrained upload operation. When this method is called the user is provided with a UI prompt that they can use to indicate their consent for an unconstrained operation.
      * @param operations The upload operation to run unconstrained.
      * @return Indicates if the operations will run unconstrained.
      */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundUploader.requestUnconstrainedUploadsAsync")
    @js.native
    def requestUnconstrainedUploadsAsync(operations: IIterable[typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation]): IPromiseWithIAsyncOperation[
        typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
      ] = js.native
  }
  
  /** Provides properties for specifying web resources to be prefetched. Windows will use heuristics to attempt to download the specified resources in advance of your app being launched by the user. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
  @js.native
  abstract class ContentPrefetcher ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.ContentPrefetcher
  object ContentPrefetcher {
    
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher")
    @js.native
    val ^ : js.Any = js.native
    
    /** Array of URIs to download when prefetch is performed for the app. */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher.contentUris")
    @js.native
    def contentUris: IVector[Uri] = js.native
    @scala.inline
    def contentUris_=(x: IVector[Uri]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentUris")(x.asInstanceOf[js.Any])
    
    /** Specifies the location of a well-formed XML file that contains a list of resources to be prefetched. */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher.indirectContentUri")
    @js.native
    def indirectContentUri: Uri = js.native
    @scala.inline
    def indirectContentUri_=(x: Uri): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indirectContentUri")(x.asInstanceOf[js.Any])
    
    /** Gets the date and time of the last successful content prefetch operation. */
    /* static member */
    @JSGlobal("Windows.Networking.BackgroundTransfer.ContentPrefetcher.lastSuccessfulPrefetchTime")
    @js.native
    def lastSuccessfulPrefetchTime: Date = js.native
    @scala.inline
    def lastSuccessfulPrefetchTime_=(x: Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastSuccessfulPrefetchTime")(x.asInstanceOf[js.Any])
  }
  
  /** Performs an asynchronous download operation. The Background Transfer sample demonstrates this functionality. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.DownloadOperation")
  @js.native
  abstract class DownloadOperation ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation
  
  /** Represents data that is returned by a server response. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.ResponseInformation")
  @js.native
  abstract class ResponseInformation ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.ResponseInformation
  
  /** Represents the result a request for unconstrained transfers from a BackgroundDownloader or BackgroundUploader object. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult")
  @js.native
  abstract class UnconstrainedTransferRequestResult ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.UnconstrainedTransferRequestResult
  
  /** Performs an asynchronous upload operation. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
  @JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
  @js.native
  abstract class UploadOperation ()
    extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation
}
