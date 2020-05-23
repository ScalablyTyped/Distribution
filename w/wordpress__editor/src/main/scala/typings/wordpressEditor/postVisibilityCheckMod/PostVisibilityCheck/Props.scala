package typings.wordpressEditor.postVisibilityCheckMod.PostVisibilityCheck

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def render(props: RenderProps): Element
}

object Props {
  @scala.inline
  def apply(render: RenderProps => Element): Props = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props]
  }
}

