package typings.typesettable.buildSrcUtilsTokenizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/utils/tokenizer", "Tokenizer")
@js.native
class Tokenizer () extends js.Object {
  var WhitespaceRegExp: js.Any = js.native
  var WordDividerRegExp: js.Any = js.native
  /* private */ def shouldCreateNewToken(token: js.Any, newCharacter: js.Any): js.Any = js.native
  def tokenize(line: String): js.Array[String] = js.native
}

