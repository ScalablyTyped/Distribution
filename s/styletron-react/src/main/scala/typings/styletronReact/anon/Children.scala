package typings.styletronReact.anon

import typings.react.mod.ReactNode
import typings.styletronReact.mod.DebugEngine
import typings.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): ReactNode
}

object Children {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactNode): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
    __obj.asInstanceOf[Children]
  }
}

