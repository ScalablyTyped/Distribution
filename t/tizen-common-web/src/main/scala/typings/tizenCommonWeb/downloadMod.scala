package typings.tizenCommonWeb

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.tizenCommonWeb.tizenCommonWebStrings.ALL
import typings.tizenCommonWeb.tizenCommonWebStrings.CELLULAR
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI
import typings.tizenCommonWeb.tizenMod.WebAPIError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadMod {
  
  @js.native
  sealed trait DownloadNetworkType extends StObject
  @JSImport("tizen-common-web/download", "DownloadNetworkType")
  @js.native
  object DownloadNetworkType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DownloadNetworkType with String] = js.native
    
    @js.native
    sealed trait ALL extends DownloadNetworkType
    /* "ALL" */ val ALL: typings.tizenCommonWeb.downloadMod.DownloadNetworkType.ALL with String = js.native
    
    @js.native
    sealed trait CELLULAR extends DownloadNetworkType
    /* "CELLULAR" */ val CELLULAR: typings.tizenCommonWeb.downloadMod.DownloadNetworkType.CELLULAR with String = js.native
    
    @js.native
    sealed trait WIFI extends DownloadNetworkType
    /* "WIFI" */ val WIFI: typings.tizenCommonWeb.downloadMod.DownloadNetworkType.WIFI with String = js.native
  }
  
  @JSImport("tizen-common-web/download", "DownloadRequest")
  @js.native
  class DownloadRequest protected () extends StObject {
    /**
      * @param url An attribute to store the URL of the object to download.
      * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
      * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
      * The default value is an empty string.
      * @param fileName? An attribute to store the file name for the specified URL.
      * If the file name is not given or is an empty string, the original file name from the URL is used.
      * The default value is an empty string.
      * @param networkType? An attribute to store the allowed network type.
      * If the network type is not given, all network types are allowed.
      * The default value is ***ALL***
      * @since 2.1
      * @param httpHeader? An attribute to store extra HTTP header fields.
      * @since 2.1
      * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
      * The default value is an empty object.
      */
    def this(url: String) = this()
    def this(url: String, destination: String) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String) = this()
    def this(url: String, destination: String, fileName: String) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: ALL
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: CELLULAR
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: WIFI
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: DownloadNetworkType
    ) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: ALL) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: CELLULAR) = this()
    def this(url: String, destination: js.UndefOr[scala.Nothing], fileName: String, networkType: WIFI) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType
    ) = this()
    def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: ALL) = this()
    def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: CELLULAR) = this()
    def this(url: String, destination: String, fileName: js.UndefOr[scala.Nothing], networkType: WIFI) = this()
    def this(url: String, destination: String, fileName: String, networkType: DownloadNetworkType) = this()
    def this(url: String, destination: String, fileName: String, networkType: ALL) = this()
    def this(url: String, destination: String, fileName: String, networkType: CELLULAR) = this()
    def this(url: String, destination: String, fileName: String, networkType: WIFI) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: js.UndefOr[scala.Nothing],
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: js.UndefOr[scala.Nothing],
      fileName: String,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: js.UndefOr[scala.Nothing],
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: js.UndefOr[scala.Nothing],
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    
    var destnation: js.UndefOr[String] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var httpHeader: js.UndefOr[DownloadHTTPHeaderFields] = js.native
    
    var networkType: js.UndefOr[DownloadNetworkType | CELLULAR | WIFI | ALL] = js.native
    
    var url: String = js.native
  }
  
  @js.native
  sealed trait DownloadState extends StObject
  @JSImport("tizen-common-web/download", "DownloadState")
  @js.native
  object DownloadState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DownloadState with String] = js.native
    
    @js.native
    sealed trait ABANDONED extends DownloadState
    /* "ABANDONED" */ val ABANDONED: typings.tizenCommonWeb.downloadMod.DownloadState.ABANDONED with String = js.native
    
    @js.native
    sealed trait CANCELED extends DownloadState
    /* "CANCELED" */ val CANCELED: typings.tizenCommonWeb.downloadMod.DownloadState.CANCELED with String = js.native
    
    @js.native
    sealed trait COMPLETED extends DownloadState
    /* "COMPLETED" */ val COMPLETED: typings.tizenCommonWeb.downloadMod.DownloadState.COMPLETED with String = js.native
    
    @js.native
    sealed trait DOWNLOADING extends DownloadState
    /* "DOWNLOADING" */ val DOWNLOADING: typings.tizenCommonWeb.downloadMod.DownloadState.DOWNLOADING with String = js.native
    
    @js.native
    sealed trait FAILED extends DownloadState
    /* "FAILED" */ val FAILED: typings.tizenCommonWeb.downloadMod.DownloadState.FAILED with String = js.native
    
    @js.native
    sealed trait PAUSED extends DownloadState
    /* "PAUSED" */ val PAUSED: typings.tizenCommonWeb.downloadMod.DownloadState.PAUSED with String = js.native
    
    @js.native
    sealed trait QUEUED extends DownloadState
    /* "QUEUED" */ val QUEUED: typings.tizenCommonWeb.downloadMod.DownloadState.QUEUED with String = js.native
  }
  
  @js.native
  trait DownloadCallback extends StObject {
    
    /**
      * Called when the download operation is canceled by the `cancel()` method.
      *
      *
      * @param downloadId The ID of the corresponding download operation.
      */
    var oncanceled: js.UndefOr[js.Function1[/* downloadId */ Double, Unit]] = js.native
    
    /**
      * Called when the download operation is completed with the final full path or virtual path.
      * If the same file name already exists in the destination, it is changed according to the platform policy and delivered in this callback.
      *
      *
      * @param downloadId The ID of the corresponding download operation.
      * @param path The final full path or virtual path for the downloaded file.
      */
    var oncompleted: js.UndefOr[js.Function2[/* downloadId */ Double, /* path */ String, Unit]] = js.native
    
    /**
      * Called when the download operation fails.
      *
      *
      * @param downloadId The ID of the corresponding download operation.
      * @param error The reason for download failure.
      */
    var onfailed: js.UndefOr[js.Function2[/* downloadId */ Double, /* error */ WebAPIError, Unit]] = js.native
    
    /**
      * Called when the download operation is paused by the `pause()` method.
      *
      *
      * @param downloadId The ID of the corresponding download operation.
      */
    var onpaused: js.UndefOr[js.Function1[/* downloadId */ Double, Unit]] = js.native
    
    /**
      * Called when a download is successful and it is called multiple times as the download progresses.
      * The interval between the `onprogress()` callback is platform-dependent. When the download is started, the `receivedSize` can be ***0***.
      *
      *
      * @param downloadId The ID of the corresponding download operation.
      * @param receivedSize The size of data received in bytes.
      * @param totalSize The total size of data to receive in bytes.
      */
    var onprogress: js.UndefOr[
        js.Function3[/* downloadId */ Double, /* receivedSize */ Double, /* totalSize */ Double, Unit]
      ] = js.native
  }
  object DownloadCallback {
    
    @scala.inline
    def apply(): DownloadCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadCallback]
    }
    
    @scala.inline
    implicit class DownloadCallbackMutableBuilder[Self <: DownloadCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOncanceled(value: /* downloadId */ Double => Unit): Self = StObject.set(x, "oncanceled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOncanceledUndefined: Self = StObject.set(x, "oncanceled", js.undefined)
      
      @scala.inline
      def setOncompleted(value: (/* downloadId */ Double, /* path */ String) => Unit): Self = StObject.set(x, "oncompleted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOncompletedUndefined: Self = StObject.set(x, "oncompleted", js.undefined)
      
      @scala.inline
      def setOnfailed(value: (/* downloadId */ Double, /* error */ WebAPIError) => Unit): Self = StObject.set(x, "onfailed", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnfailedUndefined: Self = StObject.set(x, "onfailed", js.undefined)
      
      @scala.inline
      def setOnpaused(value: /* downloadId */ Double => Unit): Self = StObject.set(x, "onpaused", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnpausedUndefined: Self = StObject.set(x, "onpaused", js.undefined)
      
      @scala.inline
      def setOnprogress(value: (/* downloadId */ Double, /* receivedSize */ Double, /* totalSize */ Double) => Unit): Self = StObject.set(x, "onprogress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnprogressUndefined: Self = StObject.set(x, "onprogress", js.undefined)
    }
  }
  
  type DownloadHTTPHeaderFields = StringDictionary[String]
  
  @js.native
  trait DownloadManager extends StObject {
    
    /**
      * Abandons a download operation that is specified by the `downloadId` parameter.
      * The abandoned download operation cannot be resumed later with the `resume()` method.
      * Trying to resume this download operation will result in `InvalidValuesError` exception.
      * Calling the `pause()` method or the `cancel()` method with this `downloadId` will also result in `InvalidValuesError` exception.
      * All resources needed by download operation are freed.
      *
      * @since 5.5
      *
      * @param downloadId The ID of the ongoing download operation to abandon.
      *
      * @throw WebAPIException InvalidValuesError, UnknownError
      *
      */
    def abandon(downloadId: Double): Unit = js.native
    
    /**
      * Cancels an ongoing download operation that is specified by the `downloadId` parameter.
      * The abandoned download operation cannot be canceled and trying to do so will result in InvalidValuesError exception.
      *
      *
      * @param downloadId The ID of the ongoing download operation to stop.
      *
      * @throw WebAPIException InvalidValuesError, UnknownError
      *
      */
    def cancel(downloadId: Double): Unit = js.native
    
    /**
      * Gets the DownloadRequest object from a given ID.
      *
      *
      * @param downloadId The ID to get the download request information.
      *
      * @returns The download request information of the given ID.
      *
      * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
      *
      */
    def getDownloadRequest(downloadId: Double): DownloadRequest = js.native
    
    /**
      * Gets the MIME type of the downloaded file.
      *
      *
      * @remark This function returns a valid MIME type when the download operation has been started
      *         and successfully retrieves the file header.
      *
      * @param downloadId The ID to get the MIME type information.
      *
      * @returns The MIME type of the downloaded file.
      *
      * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
      *
      */
    def getMIMEType(downloadId: Double): String = js.native
    
    /**
      * Gets the download state of an operation synchronously with the specified ID.
      *
      *
      * @param downloadId The ID to get the current state of the download operation.
      *
      * @returns The current download state of the specified ID.
      *
      * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
      *
      */
    def getState(downloadId: Double): DownloadState = js.native
    
    /**
      * Pauses an ongoing download operation that is specified by the `downloadId` parameter.
      * The paused download operation can be resumed later by the `resume()` method.
      *
      * The abandoned download operation cannot be paused and trying to do so will result in InvalidValuesError exception.
      *
      *
      * @param downloadId The ID of the ongoing download operation to pause.
      *
      * @throw WebAPIException InvalidValuesError, UnknownError
      *
      */
    def pause(downloadId: Double): Unit = js.native
    
    /**
      * Resumes a paused download operation that is specified by the `downloadId` parameter.
      *
      * The abandoned download operation cannot be resumed and trying to do so will result in InvalidValuesError exception.
      * Resuming operation that is queued, completed or currently in progress will have no effect.
      *
      *
      * @param downloadId The ID of the paused download operation to resume.
      *
      * @throw WebAPIException InvalidValuesError, UnknownError
      *
      */
    def resume(downloadId: Double): Unit = js.native
    
    /**
      * Sets the download callback to the download operation of the given ID.
      * It's possible to change or register the listener of the download operation using the saved ID.
      *
      *
      * @param downloadId The ID to set the download callback.
      * @param downloadCallback The method to invoke when the download state changes or an error occurs.
      *
      * @throw WebAPIException NotFoundError, TypeMismatchError, InvalidValuesError, UnknownError
      *
      */
    def setListener(downloadId: Double, downloadCallback: DownloadCallback): Unit = js.native
    
    /**
      * Starts a download operation with the specified URL information.
      *
      *
      * @privilegeLevel public
      * @privilegeName http://tizen.org/privilege/download
      *
      * @remark To check if ***CELLULAR*** type is supported, use ***tizen.systeminfo.getCapability("http://tizen.org/feature/network.telephony")***
      * @remark To check if ***WIFI*** type is supported, use ***tizen.systeminfo.getCapability("http://tizen.org/feature/network.wifi")***
      *
      * @param downloadRequest The URL and destination information of the object to download.
      * @param downloadCallback The method to invoke when the download state changes or an error occurs.
      *
      * @returns An identifier for each download operation.
      *   If the network is not available for downloading, the return value is -1 since Tizen 2.3.
      *
      * @throw WebAPIException TypeMismatchError, NotSupportedError, InvalidValuesError, SecurityError, UnknownError
      *
      */
    def start(downloadRequest: DownloadRequest): Double = js.native
    def start(downloadRequest: DownloadRequest, downloadCallback: DownloadCallback): Double = js.native
  }
  
  @js.native
  trait DownloadRequestConstructor
    extends /**
    * @param url An attribute to store the URL of the object to download.
    * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
    * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
    * The default value is an empty string.
    * @param fileName? An attribute to store the file name for the specified URL.
    * If the file name is not given or is an empty string, the original file name from the URL is used.
    * The default value is an empty string.
    * @param networkType? An attribute to store the allowed network type.
    * If the network type is not given, all network types are allowed.
    * The default value is ***ALL***
    * @since 2.1
    * @param httpHeader? An attribute to store extra HTTP header fields.
    * @since 2.1
    * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
    * The default value is an empty object.
    */
  Instantiable1[/* url */ String, DownloadRequest]
       with Instantiable2[/* url */ String, /* destination */ String, DownloadRequest]
       with Instantiable3[
          /* url */ String, 
          js.UndefOr[/* destination */ String], 
          /* fileName */ String, 
          DownloadRequest
        ]
       with Instantiable4[
          /* url */ String, 
          js.UndefOr[/* destination */ String], 
          js.UndefOr[/* fileName */ String], 
          ALL | CELLULAR | WIFI | (/* networkType */ DownloadNetworkType), 
          DownloadRequest
        ]
       with Instantiable5[
          /* url */ String, 
          js.UndefOr[/* destination */ String], 
          js.UndefOr[/* fileName */ String], 
          js.UndefOr[ALL | CELLULAR | WIFI | (/* networkType */ DownloadNetworkType)], 
          /* httpHeader */ DownloadHTTPHeaderFields, 
          DownloadRequest
        ]
}
