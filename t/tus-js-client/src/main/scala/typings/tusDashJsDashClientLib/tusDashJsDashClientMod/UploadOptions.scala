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
  var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var metadata: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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

