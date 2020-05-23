package typings.wordpressEditor.postExcerptCheckMod.PostExcerptCheck

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var supportKeys: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null, supportKeys: String | js.Array[String] = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (supportKeys != null) __obj.updateDynamic("supportKeys")(supportKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

