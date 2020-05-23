package typings.wordpressBlockEditor.writingFlowMod.WritingFlow

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

