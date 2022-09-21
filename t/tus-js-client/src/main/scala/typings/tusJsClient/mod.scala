package typings.tusJsClient

import org.scalablytyped.runtime.StringDictionary
import typings.std.Blob
import typings.std.Error
import typings.std.File
import typings.tusJsClient.anon.End
import typings.tusJsClient.anon.PickReadableStreamDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tus-js-client", "DefaultHttpStack")
  @js.native
  open class DefaultHttpStack protected ()
    extends StObject
       with HttpStack {
    def this(options: Any) = this()
    
    /* CompleteClass */
    override def createRequest(method: String, url: String): HttpRequest = js.native
    
    /* CompleteClass */
    override def getName(): String = js.native
  }
  
  @JSImport("tus-js-client", "DetailedError")
  @js.native
  open class DetailedError ()
    extends StObject
       with Error {
    
    var causingError: js.Error = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var originalRequest: HttpRequest = js.native
    
    var originalResponse: HttpResponse = js.native
  }
  
  @JSImport("tus-js-client", "Upload")
  @js.native
  open class Upload protected () extends StObject {
    def this(file: Blob, options: UploadOptions) = this()
    def this(file: File, options: UploadOptions) = this()
    def this(file: PickReadableStreamDefault, options: UploadOptions) = this()
    
    def abort(): js.Promise[Unit] = js.native
    def abort(shouldTerminate: Boolean): js.Promise[Unit] = js.native
    
    var file: File | Blob | PickReadableStreamDefault = js.native
    
    def findPreviousUploads(): js.Promise[js.Array[PreviousUpload]] = js.native
    
    var options: UploadOptions = js.native
    
    def resumeFromPreviousUpload(previousUpload: PreviousUpload): Unit = js.native
    
    def start(): Unit = js.native
    
    var url: String | Null = js.native
  }
  /* static members */
  object Upload {
    
    @JSImport("tus-js-client", "Upload")
    @js.native
    val ^ : js.Any = js.native
    
    inline def terminate(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def terminate(url: String, options: UploadOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("tus-js-client", "canStoreURLs")
  @js.native
  val canStoreURLs: Boolean = js.native
  
  @JSImport("tus-js-client", "defaultOptions")
  @js.native
  val defaultOptions: UploadOptions = js.native
  
  @JSImport("tus-js-client", "isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  trait FileReader extends StObject {
    
    def openFile(input: Any, chunkSize: Double): js.Promise[FileSource]
  }
  object FileReader {
    
    inline def apply(openFile: (Any, Double) => js.Promise[FileSource]): FileReader = {
      val __obj = js.Dynamic.literal(openFile = js.Any.fromFunction2(openFile))
      __obj.asInstanceOf[FileReader]
    }
    
    extension [Self <: FileReader](x: Self) {
      
      inline def setOpenFile(value: (Any, Double) => js.Promise[FileSource]): Self = StObject.set(x, "openFile", js.Any.fromFunction2(value))
    }
  }
  
  trait FileSource extends StObject {
    
    def close(): Unit
    
    var size: Double
    
    def slice(start: Double, end: Double): js.Promise[SliceResult]
  }
  object FileSource {
    
    inline def apply(close: () => Unit, size: Double, slice: (Double, Double) => js.Promise[SliceResult]): FileSource = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), size = size.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
      __obj.asInstanceOf[FileSource]
    }
    
    extension [Self <: FileSource](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: (Double, Double) => js.Promise[SliceResult]): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
    }
  }
  
  trait HttpRequest extends StObject {
    
    def abort(): js.Promise[Unit]
    
    def getHeader(header: String): String
    
    def getMethod(): String
    
    def getURL(): String
    
    // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
    def getUnderlyingObject(): Any
    
    def send(body: Any): js.Promise[HttpResponse]
    
    def setHeader(header: String, value: String): Unit
    
    def setProgressHandler(handler: js.Function1[/* bytesSent */ Double, Unit]): Unit
  }
  object HttpRequest {
    
    inline def apply(
      abort: () => js.Promise[Unit],
      getHeader: String => String,
      getMethod: () => String,
      getURL: () => String,
      getUnderlyingObject: () => Any,
      send: Any => js.Promise[HttpResponse],
      setHeader: (String, String) => Unit,
      setProgressHandler: js.Function1[/* bytesSent */ Double, Unit] => Unit
    ): HttpRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getHeader = js.Any.fromFunction1(getHeader), getMethod = js.Any.fromFunction0(getMethod), getURL = js.Any.fromFunction0(getURL), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject), send = js.Any.fromFunction1(send), setHeader = js.Any.fromFunction2(setHeader), setProgressHandler = js.Any.fromFunction1(setProgressHandler))
      __obj.asInstanceOf[HttpRequest]
    }
    
    extension [Self <: HttpRequest](x: Self) {
      
      inline def setAbort(value: () => js.Promise[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
      
      inline def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
      
      inline def setGetUnderlyingObject(value: () => Any): Self = StObject.set(x, "getUnderlyingObject", js.Any.fromFunction0(value))
      
      inline def setSend(value: Any => js.Promise[HttpResponse]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
      
      inline def setSetProgressHandler(value: js.Function1[/* bytesSent */ Double, Unit] => Unit): Self = StObject.set(x, "setProgressHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait HttpResponse extends StObject {
    
    def getBody(): String
    
    def getHeader(header: String): String
    
    def getStatus(): Double
    
    // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
    def getUnderlyingObject(): Any
  }
  object HttpResponse {
    
    inline def apply(
      getBody: () => String,
      getHeader: String => String,
      getStatus: () => Double,
      getUnderlyingObject: () => Any
    ): HttpResponse = {
      val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getHeader = js.Any.fromFunction1(getHeader), getStatus = js.Any.fromFunction0(getStatus), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject))
      __obj.asInstanceOf[HttpResponse]
    }
    
    extension [Self <: HttpResponse](x: Self) {
      
      inline def setGetBody(value: () => String): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
      
      inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      inline def setGetStatus(value: () => Double): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      inline def setGetUnderlyingObject(value: () => Any): Self = StObject.set(x, "getUnderlyingObject", js.Any.fromFunction0(value))
    }
  }
  
  trait HttpStack extends StObject {
    
    def createRequest(method: String, url: String): HttpRequest
    
    def getName(): String
  }
  object HttpStack {
    
    inline def apply(createRequest: (String, String) => HttpRequest, getName: () => String): HttpStack = {
      val __obj = js.Dynamic.literal(createRequest = js.Any.fromFunction2(createRequest), getName = js.Any.fromFunction0(getName))
      __obj.asInstanceOf[HttpStack]
    }
    
    extension [Self <: HttpStack](x: Self) {
      
      inline def setCreateRequest(value: (String, String) => HttpRequest): Self = StObject.set(x, "createRequest", js.Any.fromFunction2(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    }
  }
  
  trait PreviousUpload extends StObject {
    
    var creationTime: String
    
    var metadata: StringDictionary[String]
    
    var size: Double | Null
  }
  object PreviousUpload {
    
    inline def apply(creationTime: String, metadata: StringDictionary[String]): PreviousUpload = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], size = null)
      __obj.asInstanceOf[PreviousUpload]
    }
    
    extension [Self <: PreviousUpload](x: Self) {
      
      inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
    }
  }
  
  trait SliceResult extends StObject {
    
    var done: Boolean
    
    // Platform-specific data type which must be usable by the HTTP stack as a body.
    var value: Any
  }
  object SliceResult {
    
    inline def apply(done: Boolean, value: Any): SliceResult = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliceResult]
    }
    
    extension [Self <: SliceResult](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadOptions extends StObject {
    
    var addRequestId: js.UndefOr[Boolean] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var endpoint: js.UndefOr[String | Null] = js.undefined
    
    var fileReader: js.UndefOr[FileReader] = js.undefined
    
    var fingerprint: js.UndefOr[
        js.Function2[/* file */ File, /* options */ js.UndefOr[this.type], js.Promise[String]]
      ] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var httpStack: js.UndefOr[HttpStack] = js.undefined
    
    var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var onAfterResponse: js.UndefOr[js.Function2[/* req */ HttpRequest, /* res */ HttpResponse, Unit]] = js.undefined
    
    var onBeforeRequest: js.UndefOr[js.Function1[/* req */ HttpRequest, Unit]] = js.undefined
    
    var onChunkComplete: js.UndefOr[
        (js.Function3[/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double, Unit]) | Null
      ] = js.undefined
    
    var onError: js.UndefOr[(js.Function1[/* error */ js.Error | DetailedError, Unit]) | Null] = js.undefined
    
    var onProgress: js.UndefOr[(js.Function2[/* bytesSent */ Double, /* bytesTotal */ Double, Unit]) | Null] = js.undefined
    
    var onShouldRetry: js.UndefOr[
        (js.Function3[
          /* error */ js.Error | DetailedError, 
          /* retryAttempt */ Double, 
          /* options */ this.type, 
          Boolean
        ]) | Null
      ] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var overridePatchMethod: js.UndefOr[Boolean] = js.undefined
    
    var parallelUploadBoundaries: js.UndefOr[js.Array[End] | Null] = js.undefined
    
    var parallelUploads: js.UndefOr[Double] = js.undefined
    
    var removeFingerprintOnSuccess: js.UndefOr[Boolean] = js.undefined
    
    var retryDelays: js.UndefOr[js.Array[Double]] = js.undefined
    
    var storeFingerprintForResuming: js.UndefOr[Boolean] = js.undefined
    
    var uploadDataDuringCreation: js.UndefOr[Boolean] = js.undefined
    
    var uploadLengthDeferred: js.UndefOr[Boolean] = js.undefined
    
    var uploadSize: js.UndefOr[Double | Null] = js.undefined
    
    var uploadUrl: js.UndefOr[String | Null] = js.undefined
    
    var urlStorage: js.UndefOr[UrlStorage] = js.undefined
  }
  object UploadOptions {
    
    inline def apply(): UploadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadOptions]
    }
    
    extension [Self <: UploadOptions](x: Self) {
      
      inline def setAddRequestId(value: Boolean): Self = StObject.set(x, "addRequestId", value.asInstanceOf[js.Any])
      
      inline def setAddRequestIdUndefined: Self = StObject.set(x, "addRequestId", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointNull: Self = StObject.set(x, "endpoint", null)
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setFileReader(value: FileReader): Self = StObject.set(x, "fileReader", value.asInstanceOf[js.Any])
      
      inline def setFileReaderUndefined: Self = StObject.set(x, "fileReader", js.undefined)
      
      inline def setFingerprint(value: (/* file */ File, /* options */ js.UndefOr[UploadOptions]) => js.Promise[String]): Self = StObject.set(x, "fingerprint", js.Any.fromFunction2(value))
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpStack(value: HttpStack): Self = StObject.set(x, "httpStack", value.asInstanceOf[js.Any])
      
      inline def setHttpStackUndefined: Self = StObject.set(x, "httpStack", js.undefined)
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setOnAfterResponse(value: (/* req */ HttpRequest, /* res */ HttpResponse) => Unit): Self = StObject.set(x, "onAfterResponse", js.Any.fromFunction2(value))
      
      inline def setOnAfterResponseUndefined: Self = StObject.set(x, "onAfterResponse", js.undefined)
      
      inline def setOnBeforeRequest(value: /* req */ HttpRequest => Unit): Self = StObject.set(x, "onBeforeRequest", js.Any.fromFunction1(value))
      
      inline def setOnBeforeRequestUndefined: Self = StObject.set(x, "onBeforeRequest", js.undefined)
      
      inline def setOnChunkComplete(value: (/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit): Self = StObject.set(x, "onChunkComplete", js.Any.fromFunction3(value))
      
      inline def setOnChunkCompleteNull: Self = StObject.set(x, "onChunkComplete", null)
      
      inline def setOnChunkCompleteUndefined: Self = StObject.set(x, "onChunkComplete", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error | DetailedError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnProgress(value: (/* bytesSent */ Double, /* bytesTotal */ Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressNull: Self = StObject.set(x, "onProgress", null)
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setOnShouldRetry(value: (/* error */ js.Error | DetailedError, /* retryAttempt */ Double, UploadOptions) => Boolean): Self = StObject.set(x, "onShouldRetry", js.Any.fromFunction3(value))
      
      inline def setOnShouldRetryNull: Self = StObject.set(x, "onShouldRetry", null)
      
      inline def setOnShouldRetryUndefined: Self = StObject.set(x, "onShouldRetry", js.undefined)
      
      inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
      
      inline def setOnSuccessNull: Self = StObject.set(x, "onSuccess", null)
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setOverridePatchMethod(value: Boolean): Self = StObject.set(x, "overridePatchMethod", value.asInstanceOf[js.Any])
      
      inline def setOverridePatchMethodUndefined: Self = StObject.set(x, "overridePatchMethod", js.undefined)
      
      inline def setParallelUploadBoundaries(value: js.Array[End]): Self = StObject.set(x, "parallelUploadBoundaries", value.asInstanceOf[js.Any])
      
      inline def setParallelUploadBoundariesNull: Self = StObject.set(x, "parallelUploadBoundaries", null)
      
      inline def setParallelUploadBoundariesUndefined: Self = StObject.set(x, "parallelUploadBoundaries", js.undefined)
      
      inline def setParallelUploadBoundariesVarargs(value: End*): Self = StObject.set(x, "parallelUploadBoundaries", js.Array(value*))
      
      inline def setParallelUploads(value: Double): Self = StObject.set(x, "parallelUploads", value.asInstanceOf[js.Any])
      
      inline def setParallelUploadsUndefined: Self = StObject.set(x, "parallelUploads", js.undefined)
      
      inline def setRemoveFingerprintOnSuccess(value: Boolean): Self = StObject.set(x, "removeFingerprintOnSuccess", value.asInstanceOf[js.Any])
      
      inline def setRemoveFingerprintOnSuccessUndefined: Self = StObject.set(x, "removeFingerprintOnSuccess", js.undefined)
      
      inline def setRetryDelays(value: js.Array[Double]): Self = StObject.set(x, "retryDelays", value.asInstanceOf[js.Any])
      
      inline def setRetryDelaysUndefined: Self = StObject.set(x, "retryDelays", js.undefined)
      
      inline def setRetryDelaysVarargs(value: Double*): Self = StObject.set(x, "retryDelays", js.Array(value*))
      
      inline def setStoreFingerprintForResuming(value: Boolean): Self = StObject.set(x, "storeFingerprintForResuming", value.asInstanceOf[js.Any])
      
      inline def setStoreFingerprintForResumingUndefined: Self = StObject.set(x, "storeFingerprintForResuming", js.undefined)
      
      inline def setUploadDataDuringCreation(value: Boolean): Self = StObject.set(x, "uploadDataDuringCreation", value.asInstanceOf[js.Any])
      
      inline def setUploadDataDuringCreationUndefined: Self = StObject.set(x, "uploadDataDuringCreation", js.undefined)
      
      inline def setUploadLengthDeferred(value: Boolean): Self = StObject.set(x, "uploadLengthDeferred", value.asInstanceOf[js.Any])
      
      inline def setUploadLengthDeferredUndefined: Self = StObject.set(x, "uploadLengthDeferred", js.undefined)
      
      inline def setUploadSize(value: Double): Self = StObject.set(x, "uploadSize", value.asInstanceOf[js.Any])
      
      inline def setUploadSizeNull: Self = StObject.set(x, "uploadSize", null)
      
      inline def setUploadSizeUndefined: Self = StObject.set(x, "uploadSize", js.undefined)
      
      inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      inline def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
      
      inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      inline def setUrlStorage(value: UrlStorage): Self = StObject.set(x, "urlStorage", value.asInstanceOf[js.Any])
      
      inline def setUrlStorageUndefined: Self = StObject.set(x, "urlStorage", js.undefined)
    }
  }
  
  trait UrlStorage extends StObject {
    
    // Returns the URL storage key, which can be used for removing the upload.
    def addUpload(fingerprint: String, upload: PreviousUpload): js.Promise[String]
    
    def findAllUploads(): js.Promise[js.Array[PreviousUpload]]
    
    def findUploadsByFingerprint(fingerprint: String): js.Promise[js.Array[PreviousUpload]]
    
    def removeUpload(urlStorageKey: String): js.Promise[Unit]
  }
  object UrlStorage {
    
    inline def apply(
      addUpload: (String, PreviousUpload) => js.Promise[String],
      findAllUploads: () => js.Promise[js.Array[PreviousUpload]],
      findUploadsByFingerprint: String => js.Promise[js.Array[PreviousUpload]],
      removeUpload: String => js.Promise[Unit]
    ): UrlStorage = {
      val __obj = js.Dynamic.literal(addUpload = js.Any.fromFunction2(addUpload), findAllUploads = js.Any.fromFunction0(findAllUploads), findUploadsByFingerprint = js.Any.fromFunction1(findUploadsByFingerprint), removeUpload = js.Any.fromFunction1(removeUpload))
      __obj.asInstanceOf[UrlStorage]
    }
    
    extension [Self <: UrlStorage](x: Self) {
      
      inline def setAddUpload(value: (String, PreviousUpload) => js.Promise[String]): Self = StObject.set(x, "addUpload", js.Any.fromFunction2(value))
      
      inline def setFindAllUploads(value: () => js.Promise[js.Array[PreviousUpload]]): Self = StObject.set(x, "findAllUploads", js.Any.fromFunction0(value))
      
      inline def setFindUploadsByFingerprint(value: String => js.Promise[js.Array[PreviousUpload]]): Self = StObject.set(x, "findUploadsByFingerprint", js.Any.fromFunction1(value))
      
      inline def setRemoveUpload(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeUpload", js.Any.fromFunction1(value))
    }
  }
}
