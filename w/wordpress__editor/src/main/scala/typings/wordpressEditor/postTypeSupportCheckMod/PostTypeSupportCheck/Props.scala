package typings.wordpressEditor.postTypeSupportCheckMod.PostTypeSupportCheck

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var supportKeys: String | js.Array[String]
}

object Props {
  @scala.inline
  def apply(supportKeys: String | js.Array[String], children: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal(supportKeys = supportKeys.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

