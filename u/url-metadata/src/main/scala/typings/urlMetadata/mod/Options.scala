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
    descriptionLength: Int | Double = null,
    encode: () => Unit = null,
    ensureSecureImageRequest: js.UndefOr[Boolean] = js.undefined,
    fromEmail: String = null,
    maxRedirects: Int | Double = null,
    sourceMap: StringDictionary[String] = null,
    timeout: Int | Double = null,
    userAgent: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (descriptionLength != null) __obj.updateDynamic("descriptionLength")(descriptionLength.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction0(encode))
    if (!js.isUndefined(ensureSecureImageRequest)) __obj.updateDynamic("ensureSecureImageRequest")(ensureSecureImageRequest.asInstanceOf[js.Any])
    if (fromEmail != null) __obj.updateDynamic("fromEmail")(fromEmail.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

