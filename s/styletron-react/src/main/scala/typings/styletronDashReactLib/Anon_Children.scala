package typings
package styletronDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  def children(
    styletronEngine: styletronDashStandardLib.styletronDashStandardMod.StandardEngine,
    debugEngine: styletronDashReactLib.styletronDashReactMod.DebugEngine,
    hydrating: scala.Boolean
  ): reactLib.reactMod.ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(
    children: (styletronDashStandardLib.styletronDashStandardMod.StandardEngine, styletronDashReactLib.styletronDashReactMod.DebugEngine, scala.Boolean) => reactLib.reactMod.ReactNode
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

