package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * The client supports `workspace/configuration` requests.
    */
  var configuration: js.UndefOr[Boolean] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(configuration: js.UndefOr[Boolean] = js.undefined): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configuration)) __obj.updateDynamic("configuration")(configuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

