package typings.atTestingDashLibraryVue.atTestingDashLibraryVueMod

import typings.atTestingDashLibraryDom.configMod.Config
import typings.atTestingDashLibraryDom.configMod.ConfigFn
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "configure")
@js.native
object configure extends js.Object {
  def apply(configDelta: ConfigFn): Unit = js.native
  def apply(configDelta: Partial[Config]): Unit = js.native
}

