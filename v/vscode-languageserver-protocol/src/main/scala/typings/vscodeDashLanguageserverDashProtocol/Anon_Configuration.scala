package typings.vscodeDashLanguageserverDashProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Configuration extends js.Object {
  /**
    * The client supports `workspace/configuration` requests.
    */
  var configuration: js.UndefOr[Boolean] = js.undefined
}

object Anon_Configuration {
  @scala.inline
  def apply(configuration: js.UndefOr[Boolean] = js.undefined): Anon_Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configuration)) __obj.updateDynamic("configuration")(configuration)
    __obj.asInstanceOf[Anon_Configuration]
  }
}

