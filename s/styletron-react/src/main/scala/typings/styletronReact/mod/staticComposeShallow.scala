package typings.styletronReact.mod

import typings.std.ReturnType
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-react", "staticComposeShallow")
@js.native
object staticComposeShallow extends js.Object {
  def apply(styletron: Styletron, style: StyleObject): ReturnType[
    js.Function2[/* styletron */ Styletron, /* reducerContainer */ ReducerContainer, Styletron]
  ] = js.native
}

