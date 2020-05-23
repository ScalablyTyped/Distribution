package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var default: js.UndefOr[Double] = js.undefined
  var `type`: number
}

object Type {
  @scala.inline
  def apply(`type`: number, default: js.UndefOr[Double] = js.undefined): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

