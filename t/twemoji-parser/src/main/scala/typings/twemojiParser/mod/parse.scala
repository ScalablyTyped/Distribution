package typings.twemojiParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twemoji-parser", "parse")
@js.native
object parse extends js.Object {
  def apply(text: String): js.Array[EmojiEntity] = js.native
  def apply(text: String, options: ParsingOptions): js.Array[EmojiEntity] = js.native
}

