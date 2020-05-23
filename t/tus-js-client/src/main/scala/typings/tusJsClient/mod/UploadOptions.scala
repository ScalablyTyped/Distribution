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
    chunkSize: js.UndefOr[Double] = js.undefined,
    fingerprint: (/* file */ File, /* options */ js.UndefOr[UploadOptions]) => String = null,
    headers: StringDictionary[String] = null,
    metadata: StringDictionary[String] = null,
    onChunkComplete: js.UndefOr[
      Null | ((/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit)
    ] = js.undefined,
    onError: js.UndefOr[Null | (/* error */ Error => Unit)] = js.undefined,
    onProgress: js.UndefOr[Null | ((/* bytesSent */ Double, /* bytesTotal */ Double) => Unit)] = js.undefined,
    onSuccess: js.UndefOr[Null | (() => Unit)] = js.undefined,
    overridePatchMethod: js.UndefOr[Boolean] = js.undefined,
    removeFingerprintOnSuccess: js.UndefOr[Boolean] = js.undefined,
    resume: js.UndefOr[Boolean] = js.undefined,
    retryDelays: js.Array[Double] = null,
    uploadLengthDeferred: js.UndefOr[Boolean] = js.undefined,
    uploadSize: js.UndefOr[Null | Double] = js.undefined,
    uploadUrl: js.UndefOr[Null | String] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(js.Any.fromFunction2(fingerprint))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(onChunkComplete)) __obj.updateDynamic("onChunkComplete")(if (onChunkComplete != null) js.Any.fromFunction3(onChunkComplete.asInstanceOf[(/* chunkSize */ Double, /* bytesAccepted */ Double, /* bytesTotal */ Double) => Unit]) else null)
    if (!js.isUndefined(onError)) __obj.updateDynamic("onError")(if (onError != null) js.Any.fromFunction1(onError.asInstanceOf[/* error */ Error => Unit]) else null)
    if (!js.isUndefined(onProgress)) __obj.updateDynamic("onProgress")(if (onProgress != null) js.Any.fromFunction2(onProgress.asInstanceOf[(/* bytesSent */ Double, /* bytesTotal */ Double) => Unit]) else null)
    if (!js.isUndefined(onSuccess)) __obj.updateDynamic("onSuccess")(if (onSuccess != null) js.Any.fromFunction0(onSuccess.asInstanceOf[() => Unit]) else null)
    if (!js.isUndefined(overridePatchMethod)) __obj.updateDynamic("overridePatchMethod")(overridePatchMethod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeFingerprintOnSuccess)) __obj.updateDynamic("removeFingerprintOnSuccess")(removeFingerprintOnSuccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume.get.asInstanceOf[js.Any])
    if (retryDelays != null) __obj.updateDynamic("retryDelays")(retryDelays.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadLengthDeferred)) __obj.updateDynamic("uploadLengthDeferred")(uploadLengthDeferred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadSize)) __obj.updateDynamic("uploadSize")(uploadSize.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadUrl)) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadOptions]
  }
}

