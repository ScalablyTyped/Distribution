package typings.useDashSidecar.distEs5ConfigMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  def onError(e: Error): Unit
}

object IConfig {
  @scala.inline
  def apply(onError: Error => Unit): IConfig = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError))
  
    __obj.asInstanceOf[IConfig]
  }
}

