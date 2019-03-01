package typings
package urlDashMetadataLib.urlDashMetadataMod.urlMetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var descriptionLength: js.UndefOr[scala.Double] = js.undefined
  var encode: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ensureSecureImageRequest: js.UndefOr[scala.Boolean] = js.undefined
  var fromEmail: js.UndefOr[java.lang.String] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var sourceMap: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    descriptionLength: scala.Int | scala.Double = null,
    encode: js.Function0[scala.Unit] = null,
    ensureSecureImageRequest: js.UndefOr[scala.Boolean] = js.undefined,
    fromEmail: java.lang.String = null,
    maxRedirects: scala.Int | scala.Double = null,
    sourceMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    timeout: scala.Int | scala.Double = null,
    userAgent: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (descriptionLength != null) __obj.updateDynamic("descriptionLength")(descriptionLength.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(ensureSecureImageRequest)) __obj.updateDynamic("ensureSecureImageRequest")(ensureSecureImageRequest)
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Options]
  }
}

