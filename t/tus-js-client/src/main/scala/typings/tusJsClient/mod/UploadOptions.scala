package typings.tusJsClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var endpoint: String
  var fingerprint: js.UndefOr[js.Function2[/* file */ File, /* options */ js.UndefOr[UploadOptions], String]] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
  var onChunkComplete: js.UndefOr[
    (js.Function3[/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double, Unit]) | Null
  ] = js.undefined
  var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.undefined
  var onProgress: js.UndefOr[(js.Function2[/* bytesSent */ Double, /* bytesTotal */ Double, Unit]) | Null] = js.undefined
  var onSuccess: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  var overridePatchMethod: js.UndefOr[Boolean] = js.undefined
  var removeFingerprintOnSuccess: js.UndefOr[Boolean] = js.undefined
  var resume: js.UndefOr[Boolean] = js.undefined
  var retryDelays: js.UndefOr[js.Array[Double]] = js.undefined
  var uploadLengthDeferred: js.UndefOr[Boolean] = js.undefined
  var uploadSize: js.UndefOr[Double | Null] = js.undefined
  var uploadUrl: js.UndefOr[String | Null] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    endpoint: String,
    chunkSize: Int | Double = null,
    fingerprint: (/* file */ File, /* options */ js.UndefOr[UploadOptions]) => String = null,
    headers: StringDictionary[String] = null,
    metadata: StringDictionary[String] = null,
    onChunkComplete: (/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit = null,
    onError: /* error */ Error => Unit = null,
    onProgress: (/* bytesSent */ Double, /* bytesTotal */ Double) => Unit = null,
    onSuccess: () => Unit = null,
    overridePatchMethod: js.UndefOr[Boolean] = js.undefined,
    removeFingerprintOnSuccess: js.UndefOr[Boolean] = js.undefined,
    resume: js.UndefOr[Boolean] = js.undefined,
    retryDelays: js.Array[Double] = null,
    uploadLengthDeferred: js.UndefOr[Boolean] = js.undefined,
    uploadSize: Int | Double = null,
    uploadUrl: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(js.Any.fromFunction2(fingerprint))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (onChunkComplete != null) __obj.updateDynamic("onChunkComplete")(js.Any.fromFunction3(onChunkComplete))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction2(onProgress))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction0(onSuccess))
    if (!js.isUndefined(overridePatchMethod)) __obj.updateDynamic("overridePatchMethod")(overridePatchMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFingerprintOnSuccess)) __obj.updateDynamic("removeFingerprintOnSuccess")(removeFingerprintOnSuccess.asInstanceOf[js.Any])
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume.asInstanceOf[js.Any])
    if (retryDelays != null) __obj.updateDynamic("retryDelays")(retryDelays.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadLengthDeferred)) __obj.updateDynamic("uploadLengthDeferred")(uploadLengthDeferred.asInstanceOf[js.Any])
    if (uploadSize != null) __obj.updateDynamic("uploadSize")(uploadSize.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

