package typings.webpackChunkHash.mod

import typings.webpackChunkHash.webpackChunkHashStrings.base64
import typings.webpackChunkHash.webpackChunkHashStrings.hex
import typings.webpackChunkHash.webpackChunkHashStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @default null
    * @description A callback to add more content to the resulting hash
    */
  var additionalHashContent: js.UndefOr[js.Function1[/* chunk */ js.Any, String]] = js.native
  /**
    * @default 'md5'
    * @description The hash algorithm to use
    * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * @default 'hex'
    * @description The digest enconding to use
    * @see {@link https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options}
    */
  var digest: js.UndefOr[hex | latin1 | base64] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAdditionalHashContent(value: /* chunk */ js.Any => String): Self = this.set("additionalHashContent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAdditionalHashContent: Self = this.set("additionalHashContent", js.undefined)
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    @scala.inline
    def setDigest(value: hex | latin1 | base64): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
  }
  
}

