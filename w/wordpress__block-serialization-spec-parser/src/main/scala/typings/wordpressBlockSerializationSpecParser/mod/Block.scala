package typings.wordpressBlockSerializationSpecParser.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var attrs: Record[String, _]
  var blockName: String | Null
  var innerBlocks: js.Array[Block]
  var innerContent: js.Array[String]
  var innerHTML: String
}

object Block {
  @scala.inline
  def apply(
    attrs: Record[String, _],
    innerBlocks: js.Array[Block],
    innerContent: js.Array[String],
    innerHTML: String,
    blockName: String = null
  ): Block = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], innerContent = innerContent.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

