package typings.styletronDashReact

import typings.react.reactMod.ReactNode
import typings.styletronDashReact.styletronDashReactMod.DebugEngine
import typings.styletronDashStandard.styletronDashStandardMod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactNode): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

