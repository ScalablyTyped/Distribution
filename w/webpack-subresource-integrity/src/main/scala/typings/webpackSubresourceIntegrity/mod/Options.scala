package typings.webpackSubresourceIntegrity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default value: true
    * When this value is falsy, the plugin doesn't run and no integrity values are calculated. It is recommended to disable the plugin in development mode.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of strings, each specifying the name of a hash function to be used for calculating integrity hash values. For example, ['sha256', 'sha512'].
    */
  var hashFuncNames: js.Array[String]
}

object Options {
  @scala.inline
  def apply(hashFuncNames: js.Array[String], enabled: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal(hashFuncNames = hashFuncNames.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

