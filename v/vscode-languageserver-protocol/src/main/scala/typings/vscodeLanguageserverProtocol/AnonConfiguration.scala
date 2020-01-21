package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfiguration extends js.Object {
  /**
    * The client supports `workspace/configuration` requests.
    */
  var configuration: js.UndefOr[Boolean] = js.undefined
}

object AnonConfiguration {
  @scala.inline
  def apply(configuration: js.UndefOr[Boolean] = js.undefined): AnonConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configuration)) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfiguration]
  }
}

