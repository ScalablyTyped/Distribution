package typings.styletronReact.mod

import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styletron-react", "composeDynamic")
@js.native
object composeDynamic extends js.Object {
  
  def apply(
    styletron: Styletron,
    reducer: js.Function2[/* style */ StyleObject, /* props */ js.Object, StyleObject]
  ): Styletron = js.native
}
