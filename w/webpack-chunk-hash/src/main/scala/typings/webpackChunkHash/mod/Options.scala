package typings.webpackChunkHash.mod

import typings.webpackChunkHash.webpackChunkHashStrings.base64
import typings.webpackChunkHash.webpackChunkHashStrings.hex
import typings.webpackChunkHash.webpackChunkHashStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    	 * @default null
    	 * @description A callback to add more content to the resulting hash
    	 */
  var additionalHashContent: js.UndefOr[js.Function1[/* chunk */ js.Any, String]] = js.undefined
  /**
    	 * @default 'md5'
    	 * @description The hash algorithm to use
    	 * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    	 */
  var algorithm: js.UndefOr[String] = js.undefined
  /**
    	 * @default 'hex'
    	 * @description The digest enconding to use
    	 * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    	 */
  var digest: js.UndefOr[hex | latin1 | base64] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalHashContent: /* chunk */ js.Any => String = null,
    algorithm: String = null,
    digest: hex | latin1 | base64 = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalHashContent != null) __obj.updateDynamic("additionalHashContent")(js.Any.fromFunction1(additionalHashContent))
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

