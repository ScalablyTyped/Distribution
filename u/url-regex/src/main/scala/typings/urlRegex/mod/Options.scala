package typings.urlRegex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Only match an exact string. Useful with `RegExp#test` to check if a string is a URL.
  		@default false
  		*/
  val exact: js.UndefOr[Boolean] = js.undefined
  /**
  		Force URLs to start with a valid protocol or `www`. If set to `false` it'll match the TLD against a list of valid [TLDs](https://github.com/stephenmathieson/node-tlds).
  		@default true
  		*/
  val strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(exact: js.UndefOr[Boolean] = js.undefined, strict: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

