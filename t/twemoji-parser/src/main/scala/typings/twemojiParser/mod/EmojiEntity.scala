package typings.twemojiParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmojiEntity extends js.Object {
  /**
    * [startIndex: number, lastIndex: number]
    */
  var indices: js.Tuple2[Double, Double]
  var text: String
  /**
    * @default 'emoji'
    */
  var `type`: /* "emoji" */ String
  /**
    * @default ''
    */
  var url: String
}

object EmojiEntity {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], text: String, `type`: /* "emoji" */ String, url: String): EmojiEntity = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmojiEntity]
  }
}

