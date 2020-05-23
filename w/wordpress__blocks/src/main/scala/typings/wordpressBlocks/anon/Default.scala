package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: js.UndefOr[Boolean] = js.undefined
  var `type`: boolean
}

object Default {
  @scala.inline
  def apply(`type`: boolean, default: js.UndefOr[Boolean] = js.undefined): Default = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

