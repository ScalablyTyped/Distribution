package typings
package tusDashJsDashClientLib.tusDashJsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var endpoint: java.lang.String
  var fingerprint: js.UndefOr[
    js.Function2[/* file */ stdLib.File, /* options */ js.UndefOr[UploadOptions], java.lang.String]
  ] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var onChunkComplete: js.UndefOr[
    (js.Function3[
      /* chunkSize */ scala.Double, 
      /* bytesAccepted */ scala.Double, 
      /* bytesTotal */ scala.Double, 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var onError: js.UndefOr[(js.Function1[/* error */ stdLib.Error, scala.Unit]) | scala.Null] = js.undefined
  var onProgress: js.UndefOr[
    (js.Function2[/* bytesSent */ scala.Double, /* bytesTotal */ scala.Double, scala.Unit]) | scala.Null
  ] = js.undefined
  var onSuccess: js.UndefOr[js.Function0[scala.Unit] | scala.Null] = js.undefined
  var overridePatchMethod: js.UndefOr[scala.Boolean] = js.undefined
  var removeFingerprintOnSuccess: js.UndefOr[scala.Boolean] = js.undefined
  var resume: js.UndefOr[scala.Boolean] = js.undefined
  var retryDelays: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var uploadSize: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var uploadUrl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    endpoint: java.lang.String,
    chunkSize: scala.Int | scala.Double = null,
    fingerprint: js.Function2[/* file */ stdLib.File, /* options */ js.UndefOr[UploadOptions], java.lang.String] = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    onChunkComplete: js.Function3[
      /* chunkSize */ scala.Double, 
      /* bytesAccepted */ scala.Double, 
      /* bytesTotal */ scala.Double, 
      scala.Unit
    ] = null,
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    onProgress: js.Function2[/* bytesSent */ scala.Double, /* bytesTotal */ scala.Double, scala.Unit] = null,
    onSuccess: js.Function0[scala.Unit] = null,
    overridePatchMethod: js.UndefOr[scala.Boolean] = js.undefined,
    removeFingerprintOnSuccess: js.UndefOr[scala.Boolean] = js.undefined,
    resume: js.UndefOr[scala.Boolean] = js.undefined,
    retryDelays: js.Array[scala.Double] = null,
    uploadSize: scala.Int | scala.Double = null,
    uploadUrl: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): UploadOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (onChunkComplete != null) __obj.updateDynamic("onChunkComplete")(onChunkComplete)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(onSuccess)
    if (!js.isUndefined(overridePatchMethod)) __obj.updateDynamic("overridePatchMethod")(overridePatchMethod)
    if (!js.isUndefined(removeFingerprintOnSuccess)) __obj.updateDynamic("removeFingerprintOnSuccess")(removeFingerprintOnSuccess)
    if (!js.isUndefined(resume)) __obj.updateDynamic("resume")(resume)
    if (retryDelays != null) __obj.updateDynamic("retryDelays")(retryDelays)
    if (uploadSize != null) __obj.updateDynamic("uploadSize")(uploadSize.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[UploadOptions]
  }
}

