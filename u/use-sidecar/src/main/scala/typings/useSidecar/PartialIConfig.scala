package typings.useSidecar

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/config.IConfig> */
trait PartialIConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
}

object PartialIConfig {
  @scala.inline
  def apply(onError: /* e */ Error => Unit = null): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PartialIConfig]
  }
}

