package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobEventConfig extends js.Object {
  var timeout: java.lang.String
}

object JobEventConfig {
  @scala.inline
  def apply(timeout: java.lang.String): JobEventConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[JobEventConfig]
  }
}

