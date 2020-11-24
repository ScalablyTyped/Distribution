package typings.tusJsClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadOptions extends js.Object {
  
  var addRequestId: js.UndefOr[Boolean] = js.native
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var endpoint: js.UndefOr[String | Null] = js.native
  
  var fileReader: js.UndefOr[FileReader] = js.native
  
  var fingerprint: js.UndefOr[
    js.Function2[/* file */ File, /* options */ js.UndefOr[this.type], js.Promise[String]]
  ] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var httpStack: js.UndefOr[HttpStack] = js.native
  
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  var onAfterResponse: js.UndefOr[js.Function2[/* req */ HttpRequest, /* res */ HttpResponse, Unit]] = js.native
  
  var onBeforeRequest: js.UndefOr[js.Function1[/* req */ HttpRequest, Unit]] = js.native
  
  var onChunkComplete: js.UndefOr[
    (js.Function3[/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double, Unit]) | Null
  ] = js.native
  
  var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.native
  
  var onProgress: js.UndefOr[(js.Function2[/* bytesSent */ Double, /* bytesTotal */ Double, Unit]) | Null] = js.native
  
  var onSuccess: js.UndefOr[js.Function0[Unit] | Null] = js.native
  
  var overridePatchMethod: js.UndefOr[Boolean] = js.native
  
  var parallelUploads: js.UndefOr[Double] = js.native
  
  var removeFingerprintOnSuccess: js.UndefOr[Boolean] = js.native
  
  var retryDelays: js.UndefOr[js.Array[Double]] = js.native
  
  var storeFingerprintForResuming: js.UndefOr[Boolean] = js.native
  
  var uploadDataDuringCreation: js.UndefOr[Boolean] = js.native
  
  var uploadLengthDeferred: js.UndefOr[Boolean] = js.native
  
  var uploadSize: js.UndefOr[Double | Null] = js.native
  
  var uploadUrl: js.UndefOr[String | Null] = js.native
  
  var urlStorage: js.UndefOr[UrlStorage] = js.native
}
object UploadOptions {
  
  @scala.inline
  def apply(): UploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptions]
  }
  
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRequestId(value: Boolean): Self = this.set("addRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddRequestId: Self = this.set("addRequestId", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setEndpointNull: Self = this.set("endpoint", null)
    
    @scala.inline
    def setFileReader(value: FileReader): Self = this.set("fileReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileReader: Self = this.set("fileReader", js.undefined)
    
    @scala.inline
    def setFingerprint(value: (/* file */ File, /* options */ js.UndefOr[UploadOptions]) => js.Promise[String]): Self = this.set("fingerprint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setHttpStack(value: HttpStack): Self = this.set("httpStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStack: Self = this.set("httpStack", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOnAfterResponse(value: (/* req */ HttpRequest, /* res */ HttpResponse) => Unit): Self = this.set("onAfterResponse", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAfterResponse: Self = this.set("onAfterResponse", js.undefined)
    
    @scala.inline
    def setOnBeforeRequest(value: /* req */ HttpRequest => Unit): Self = this.set("onBeforeRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeRequest: Self = this.set("onBeforeRequest", js.undefined)
    
    @scala.inline
    def setOnChunkComplete(value: (/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit): Self = this.set("onChunkComplete", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChunkComplete: Self = this.set("onChunkComplete", js.undefined)
    
    @scala.inline
    def setOnChunkCompleteNull: Self = this.set("onChunkComplete", null)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnErrorNull: Self = this.set("onError", null)
    
    @scala.inline
    def setOnProgress(value: (/* bytesSent */ Double, /* bytesTotal */ Double) => Unit): Self = this.set("onProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnProgressNull: Self = this.set("onProgress", null)
    
    @scala.inline
    def setOnSuccess(value: () => Unit): Self = this.set("onSuccess", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setOnSuccessNull: Self = this.set("onSuccess", null)
    
    @scala.inline
    def setOverridePatchMethod(value: Boolean): Self = this.set("overridePatchMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverridePatchMethod: Self = this.set("overridePatchMethod", js.undefined)
    
    @scala.inline
    def setParallelUploads(value: Double): Self = this.set("parallelUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelUploads: Self = this.set("parallelUploads", js.undefined)
    
    @scala.inline
    def setRemoveFingerprintOnSuccess(value: Boolean): Self = this.set("removeFingerprintOnSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFingerprintOnSuccess: Self = this.set("removeFingerprintOnSuccess", js.undefined)
    
    @scala.inline
    def setRetryDelaysVarargs(value: Double*): Self = this.set("retryDelays", js.Array(value :_*))
    
    @scala.inline
    def setRetryDelays(value: js.Array[Double]): Self = this.set("retryDelays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDelays: Self = this.set("retryDelays", js.undefined)
    
    @scala.inline
    def setStoreFingerprintForResuming(value: Boolean): Self = this.set("storeFingerprintForResuming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreFingerprintForResuming: Self = this.set("storeFingerprintForResuming", js.undefined)
    
    @scala.inline
    def setUploadDataDuringCreation(value: Boolean): Self = this.set("uploadDataDuringCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadDataDuringCreation: Self = this.set("uploadDataDuringCreation", js.undefined)
    
    @scala.inline
    def setUploadLengthDeferred(value: Boolean): Self = this.set("uploadLengthDeferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadLengthDeferred: Self = this.set("uploadLengthDeferred", js.undefined)
    
    @scala.inline
    def setUploadSize(value: Double): Self = this.set("uploadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadSize: Self = this.set("uploadSize", js.undefined)
    
    @scala.inline
    def setUploadSizeNull: Self = this.set("uploadSize", null)
    
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
    
    @scala.inline
    def setUploadUrlNull: Self = this.set("uploadUrl", null)
    
    @scala.inline
    def setUrlStorage(value: UrlStorage): Self = this.set("urlStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlStorage: Self = this.set("urlStorage", js.undefined)
  }
}
