package typings
package tabrisDashPluginDashFirebaseLib.tabrisDashPluginDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedEvent[T, U] extends js.Object {
  val target: T
  val timeStamp: scala.Double
  val `type`: java.lang.String
  val value: U
}

object PropertyChangedEvent {
  @scala.inline
  def apply[T, U](target: T, timeStamp: scala.Double, `type`: java.lang.String, value: U): PropertyChangedEvent[T, U] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyChangedEvent[T, U]]
  }
}

