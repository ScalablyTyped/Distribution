package typings.webicon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemConfigurationHandlerMod {
  import typings.webicon.systemPublicApiMod.PublicApi

  type ConfigurationHandler = js.Function1[/* api */ PublicApi, Unit]
}
