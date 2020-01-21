package typings.styletronReact

import typings.react.mod.ReactNode
import typings.styletronReact.mod.DebugEngine
import typings.styletronStandard.mod.StandardEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  def children(styletronEngine: StandardEngine, debugEngine: DebugEngine, hydrating: Boolean): ReactNode
}

object AnonChildren {
  @scala.inline
  def apply(children: (StandardEngine, DebugEngine, Boolean) => ReactNode): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
  
    __obj.asInstanceOf[AnonChildren]
  }
}

