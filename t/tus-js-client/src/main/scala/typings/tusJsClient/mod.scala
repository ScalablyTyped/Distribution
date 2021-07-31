package typings.tusJsClient

import org.scalablytyped.runtime.StringDictionary
import typings.std.Blob
import typings.std.Error
import typings.std.File
import typings.tusJsClient.anon.PickReadableStreamDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tus-js-client", "Upload")
  @js.native
  class Upload protected () extends StObject {
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
    
    @scala.inline
    def terminate(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def terminate(url: String, options: UploadOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("terminate")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
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
    
    def openFile(input: js.Any, chunkSize: Double): js.Promise[FileSource]
  }
  object FileReader {
    
    @scala.inline
    def apply(openFile: (js.Any, Double) => js.Promise[FileSource]): FileReader = {
      val __obj = js.Dynamic.literal(openFile = js.Any.fromFunction2(openFile))
      __obj.asInstanceOf[FileReader]
    }
    
    @scala.inline
    implicit class FileReaderMutableBuilder[Self <: FileReader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenFile(value: (js.Any, Double) => js.Promise[FileSource]): Self = StObject.set(x, "openFile", js.Any.fromFunction2(value))
    }
  }
  
  trait FileSource extends StObject {
    
    def close(): Unit
    
    var size: Double
    
    def slice(start: Double, end: Double): js.Promise[SliceResult]
  }
  object FileSource {
    
    @scala.inline
    def apply(close: () => Unit, size: Double, slice: (Double, Double) => js.Promise[SliceResult]): FileSource = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), size = size.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
      __obj.asInstanceOf[FileSource]
    }
    
    @scala.inline
    implicit class FileSourceMutableBuilder[Self <: FileSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlice(value: (Double, Double) => js.Promise[SliceResult]): Self = StObject.set(x, "slice", js.Any.fromFunction2(value))
    }
  }
  
  trait HttpRequest extends StObject {
    
    def abort(): js.Promise[Unit]
    
    def getHeader(header: String): String
    
    def getMethod(): String
    
    def getURL(): String
    
    // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
    def getUnderlyingObject(): js.Any
    
    def send(body: js.Any): js.Promise[HttpResponse]
    
    def setHeader(header: String, value: String): Unit
    
    def setProgressHandler(handler: js.Function1[/* bytesSent */ Double, Unit]): Unit
  }
  object HttpRequest {
    
    @scala.inline
    def apply(
      abort: () => js.Promise[Unit],
      getHeader: String => String,
      getMethod: () => String,
      getURL: () => String,
      getUnderlyingObject: () => js.Any,
      send: js.Any => js.Promise[HttpResponse],
      setHeader: (String, String) => Unit,
      setProgressHandler: js.Function1[/* bytesSent */ Double, Unit] => Unit
    ): HttpRequest = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), getHeader = js.Any.fromFunction1(getHeader), getMethod = js.Any.fromFunction0(getMethod), getURL = js.Any.fromFunction0(getURL), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject), send = js.Any.fromFunction1(send), setHeader = js.Any.fromFunction2(setHeader), setProgressHandler = js.Any.fromFunction1(setProgressHandler))
      __obj.asInstanceOf[HttpRequest]
    }
    
    @scala.inline
    implicit class HttpRequestMutableBuilder[Self <: HttpRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => js.Promise[Unit]): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMethod(value: () => String): Self = StObject.set(x, "getMethod", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUnderlyingObject(value: () => js.Any): Self = StObject.set(x, "getUnderlyingObject", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSend(value: js.Any => js.Promise[HttpResponse]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHeader(value: (String, String) => Unit): Self = StObject.set(x, "setHeader", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetProgressHandler(value: js.Function1[/* bytesSent */ Double, Unit] => Unit): Self = StObject.set(x, "setProgressHandler", js.Any.fromFunction1(value))
    }
  }
  
  trait HttpResponse extends StObject {
    
    def getBody(): String
    
    def getHeader(header: String): String
    
    def getStatus(): Double
    
    // Return an environment specific object, e.g. the XMLHttpRequest object in browsers.
    def getUnderlyingObject(): js.Any
  }
  object HttpResponse {
    
    @scala.inline
    def apply(
      getBody: () => String,
      getHeader: String => String,
      getStatus: () => Double,
      getUnderlyingObject: () => js.Any
    ): HttpResponse = {
      val __obj = js.Dynamic.literal(getBody = js.Any.fromFunction0(getBody), getHeader = js.Any.fromFunction1(getHeader), getStatus = js.Any.fromFunction0(getStatus), getUnderlyingObject = js.Any.fromFunction0(getUnderlyingObject))
      __obj.asInstanceOf[HttpResponse]
    }
    
    @scala.inline
    implicit class HttpResponseMutableBuilder[Self <: HttpResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBody(value: () => String): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStatus(value: () => Double): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUnderlyingObject(value: () => js.Any): Self = StObject.set(x, "getUnderlyingObject", js.Any.fromFunction0(value))
    }
  }
  
  trait HttpStack extends StObject {
    
    def createRequest(method: String, url: String): HttpRequest
    
    def getName(): String
  }
  object HttpStack {
    
    @scala.inline
    def apply(createRequest: (String, String) => HttpRequest, getName: () => String): HttpStack = {
      val __obj = js.Dynamic.literal(createRequest = js.Any.fromFunction2(createRequest), getName = js.Any.fromFunction0(getName))
      __obj.asInstanceOf[HttpStack]
    }
    
    @scala.inline
    implicit class HttpStackMutableBuilder[Self <: HttpStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateRequest(value: (String, String) => HttpRequest): Self = StObject.set(x, "createRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    }
  }
  
  trait PreviousUpload extends StObject {
    
    var creationTime: String
    
    var metadata: StringDictionary[String]
    
    var size: Double | Null
  }
  object PreviousUpload {
    
    @scala.inline
    def apply(creationTime: String, metadata: StringDictionary[String]): PreviousUpload = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], size = null)
      __obj.asInstanceOf[PreviousUpload]
    }
    
    @scala.inline
    implicit class PreviousUploadMutableBuilder[Self <: PreviousUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeNull: Self = StObject.set(x, "size", null)
    }
  }
  
  trait SliceResult extends StObject {
    
    var done: Boolean
    
    // Platform-specific data type which must be usable by the HTTP stack as a body.
    var value: js.Any
  }
  object SliceResult {
    
    @scala.inline
    def apply(done: Boolean, value: js.Any): SliceResult = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliceResult]
    }
    
    @scala.inline
    implicit class SliceResultMutableBuilder[Self <: SliceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.undefined
    
    var onProgress: js.UndefOr[(js.Function2[/* bytesSent */ Double, /* bytesTotal */ Double, Unit]) | Null] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var overridePatchMethod: js.UndefOr[Boolean] = js.undefined
    
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
    
    @scala.inline
    def apply(): UploadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadOptions]
    }
    
    @scala.inline
    implicit class UploadOptionsMutableBuilder[Self <: UploadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddRequestId(value: Boolean): Self = StObject.set(x, "addRequestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddRequestIdUndefined: Self = StObject.set(x, "addRequestId", js.undefined)
      
      @scala.inline
      def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointNull: Self = StObject.set(x, "endpoint", null)
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setFileReader(value: FileReader): Self = StObject.set(x, "fileReader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileReaderUndefined: Self = StObject.set(x, "fileReader", js.undefined)
      
      @scala.inline
      def setFingerprint(value: (/* file */ File, /* options */ js.UndefOr[UploadOptions]) => js.Promise[String]): Self = StObject.set(x, "fingerprint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpStack(value: HttpStack): Self = StObject.set(x, "httpStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpStackUndefined: Self = StObject.set(x, "httpStack", js.undefined)
      
      @scala.inline
      def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setOnAfterResponse(value: (/* req */ HttpRequest, /* res */ HttpResponse) => Unit): Self = StObject.set(x, "onAfterResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnAfterResponseUndefined: Self = StObject.set(x, "onAfterResponse", js.undefined)
      
      @scala.inline
      def setOnBeforeRequest(value: /* req */ HttpRequest => Unit): Self = StObject.set(x, "onBeforeRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeRequestUndefined: Self = StObject.set(x, "onBeforeRequest", js.undefined)
      
      @scala.inline
      def setOnChunkComplete(value: (/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit): Self = StObject.set(x, "onChunkComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnChunkCompleteNull: Self = StObject.set(x, "onChunkComplete", null)
      
      @scala.inline
      def setOnChunkCompleteUndefined: Self = StObject.set(x, "onChunkComplete", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnProgress(value: (/* bytesSent */ Double, /* bytesTotal */ Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnProgressNull: Self = StObject.set(x, "onProgress", null)
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnSuccessNull: Self = StObject.set(x, "onSuccess", null)
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      @scala.inline
      def setOverridePatchMethod(value: Boolean): Self = StObject.set(x, "overridePatchMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridePatchMethodUndefined: Self = StObject.set(x, "overridePatchMethod", js.undefined)
      
      @scala.inline
      def setParallelUploads(value: Double): Self = StObject.set(x, "parallelUploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallelUploadsUndefined: Self = StObject.set(x, "parallelUploads", js.undefined)
      
      @scala.inline
      def setRemoveFingerprintOnSuccess(value: Boolean): Self = StObject.set(x, "removeFingerprintOnSuccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveFingerprintOnSuccessUndefined: Self = StObject.set(x, "removeFingerprintOnSuccess", js.undefined)
      
      @scala.inline
      def setRetryDelays(value: js.Array[Double]): Self = StObject.set(x, "retryDelays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelaysUndefined: Self = StObject.set(x, "retryDelays", js.undefined)
      
      @scala.inline
      def setRetryDelaysVarargs(value: Double*): Self = StObject.set(x, "retryDelays", js.Array(value :_*))
      
      @scala.inline
      def setStoreFingerprintForResuming(value: Boolean): Self = StObject.set(x, "storeFingerprintForResuming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreFingerprintForResumingUndefined: Self = StObject.set(x, "storeFingerprintForResuming", js.undefined)
      
      @scala.inline
      def setUploadDataDuringCreation(value: Boolean): Self = StObject.set(x, "uploadDataDuringCreation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadDataDuringCreationUndefined: Self = StObject.set(x, "uploadDataDuringCreation", js.undefined)
      
      @scala.inline
      def setUploadLengthDeferred(value: Boolean): Self = StObject.set(x, "uploadLengthDeferred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadLengthDeferredUndefined: Self = StObject.set(x, "uploadLengthDeferred", js.undefined)
      
      @scala.inline
      def setUploadSize(value: Double): Self = StObject.set(x, "uploadSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadSizeNull: Self = StObject.set(x, "uploadSize", null)
      
      @scala.inline
      def setUploadSizeUndefined: Self = StObject.set(x, "uploadSize", js.undefined)
      
      @scala.inline
      def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUrlNull: Self = StObject.set(x, "uploadUrl", null)
      
      @scala.inline
      def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
      
      @scala.inline
      def setUrlStorage(value: UrlStorage): Self = StObject.set(x, "urlStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlStorageUndefined: Self = StObject.set(x, "urlStorage", js.undefined)
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
    
    @scala.inline
    def apply(
      addUpload: (String, PreviousUpload) => js.Promise[String],
      findAllUploads: () => js.Promise[js.Array[PreviousUpload]],
      findUploadsByFingerprint: String => js.Promise[js.Array[PreviousUpload]],
      removeUpload: String => js.Promise[Unit]
    ): UrlStorage = {
      val __obj = js.Dynamic.literal(addUpload = js.Any.fromFunction2(addUpload), findAllUploads = js.Any.fromFunction0(findAllUploads), findUploadsByFingerprint = js.Any.fromFunction1(findUploadsByFingerprint), removeUpload = js.Any.fromFunction1(removeUpload))
      __obj.asInstanceOf[UrlStorage]
    }
    
    @scala.inline
    implicit class UrlStorageMutableBuilder[Self <: UrlStorage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddUpload(value: (String, PreviousUpload) => js.Promise[String]): Self = StObject.set(x, "addUpload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFindAllUploads(value: () => js.Promise[js.Array[PreviousUpload]]): Self = StObject.set(x, "findAllUploads", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFindUploadsByFingerprint(value: String => js.Promise[js.Array[PreviousUpload]]): Self = StObject.set(x, "findUploadsByFingerprint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveUpload(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeUpload", js.Any.fromFunction1(value))
    }
  }
}
