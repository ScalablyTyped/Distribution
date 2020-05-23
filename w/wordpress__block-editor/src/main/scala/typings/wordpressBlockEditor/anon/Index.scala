package typings.wordpressBlockEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: Double
  var rootClientId: js.UndefOr[String] = js.undefined
}

object Index {
  @scala.inline
  def apply(index: Double, rootClientId: String = null): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (rootClientId != null) __obj.updateDynamic("rootClientId")(rootClientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

