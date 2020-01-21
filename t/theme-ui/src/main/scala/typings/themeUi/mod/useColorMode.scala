package typings.themeUi.mod

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("theme-ui", "useColorMode")
@js.native
object useColorMode extends js.Object {
  def apply[Modes /* <: String */](): js.Tuple2[Modes, Dispatch[SetStateAction[Modes]]] = js.native
  def apply[Modes /* <: String */](initialMode: Modes): js.Tuple2[Modes, Dispatch[SetStateAction[Modes]]] = js.native
}

