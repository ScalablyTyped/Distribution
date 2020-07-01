package typings.systemService.mod

import typings.systemService.anon.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfiguration extends js.Object {
  var log: Config
}

object ServiceConfiguration {
  @scala.inline
  def apply(log: Config): ServiceConfiguration = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfiguration]
  }
}

