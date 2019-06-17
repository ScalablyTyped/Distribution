package typings
package atWordpressBlockDashSerializationDashSpecDashParserLib.atWordpressBlockDashSerializationDashSpecDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var attrs: stdLib.Record[java.lang.String, _]
  var blockName: java.lang.String | scala.Null
  var innerBlocks: js.Array[Block]
  var innerContent: js.Array[java.lang.String]
  var innerHTML: java.lang.String
}

object Block {
  @scala.inline
  def apply(
    attrs: stdLib.Record[java.lang.String, _],
    innerBlocks: js.Array[Block],
    innerContent: js.Array[java.lang.String],
    innerHTML: java.lang.String,
    blockName: java.lang.String = null
  ): Block = {
    val __obj = js.Dynamic.literal(attrs = attrs, innerBlocks = innerBlocks, innerContent = innerContent, innerHTML = innerHTML)
    if (blockName != null) __obj.updateDynamic("blockName")(blockName)
    __obj.asInstanceOf[Block]
  }
}

