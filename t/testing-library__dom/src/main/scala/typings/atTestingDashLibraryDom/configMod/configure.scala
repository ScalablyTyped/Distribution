package typings.atTestingDashLibraryDom.configMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/config", "configure")
@js.native
object configure extends js.Object {
  def apply(configDelta: ConfigFn): Unit = js.native
  def apply(configDelta: Partial[Config]): Unit = js.native
}

