package typings.wordpressBlocks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStyle extends js.Object {
  val isDefault: js.UndefOr[Boolean] = js.undefined
  val label: String
  val name: String
}

object BlockStyle {
  @scala.inline
  def apply(label: String, name: String, isDefault: js.UndefOr[Boolean] = js.undefined): BlockStyle = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefault)) __obj.updateDynamic("isDefault")(isDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStyle]
  }
}

