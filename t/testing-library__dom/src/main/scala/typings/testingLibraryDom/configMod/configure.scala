package typings.testingLibraryDom.configMod

import typings.testingLibraryDom.PartialConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/config", "configure")
@js.native
object configure extends js.Object {
  def apply(configDelta: PartialConfig): Unit = js.native
  def apply(configDelta: ConfigFn): Unit = js.native
}

