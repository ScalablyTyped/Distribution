package typings
package webpackDashChunkDashHashLib.webpackDashChunkDashHashMod.WebpackChunkHashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    	 * @default null
    	 * @description A callback to add more content to the resulting hash
    	 */
  var additionalHashContent: js.UndefOr[js.Function1[/* chunk */ js.Any, java.lang.String]] = js.undefined
  /**
    	 * @default 'md5'
    	 * @description The hash algorithm to use
    	 * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    	 */
  var algorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    	 * @default 'hex'
    	 * @description The digest enconding to use
    	 * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    	 */
  var digest: js.UndefOr[
    webpackDashChunkDashHashLib.webpackDashChunkDashHashLibStrings.hex | webpackDashChunkDashHashLib.webpackDashChunkDashHashLibStrings.latin1 | webpackDashChunkDashHashLib.webpackDashChunkDashHashLibStrings.base64
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    additionalHashContent: js.Function1[/* chunk */ js.Any, java.lang.String] = null,
    algorithm: java.lang.String = null,
    digest: webpackDashChunkDashHashLib.webpackDashChunkDashHashLibStrings.hex | webpackDashChunkDashHashLib.webpackDashChunkDashHashLibStrings.latin1 | webpackDashChunkDashHashLib.webpackDashChunkDashHashLibStrings.base64 = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (additionalHashContent != null) __obj.updateDynamic("additionalHashContent")(additionalHashContent)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

