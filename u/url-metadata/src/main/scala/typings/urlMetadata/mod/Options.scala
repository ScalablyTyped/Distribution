package typings.urlMetadata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var descriptionLength: js.UndefOr[Double] = js.undefined
  var encode: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ensureSecureImageRequest: js.UndefOr[Boolean] = js.undefined
  var fromEmail: js.UndefOr[String] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var sourceMap: js.UndefOr[StringDictionary[String]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    descriptionLength: js.UndefOr[Double] = js.undefined,
    encode: () => Unit = null,
    ensureSecureImageRequest: js.UndefOr[Boolean] = js.undefined,
    fromEmail: String = null,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    sourceMap: StringDictionary[String] = null,
    timeout: js.UndefOr[Double] = js.undefined,
    userAgent: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descriptionLength)) __obj.updateDynamic("descriptionLength")(descriptionLength.get.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction0(encode))
    if (!js.isUndefined(ensureSecureImageRequest)) __obj.updateDynamic("ensureSecureImageRequest")(ensureSecureImageRequest.get.asInstanceOf[js.Any])
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

