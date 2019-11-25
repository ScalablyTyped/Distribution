package typings.atWordpressWordcount.atWordpressWordcountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atWordpressWordcount.atWordpressWordcountStrings.words
  - typings.atWordpressWordcount.atWordpressWordcountStrings.characters_excluding_spaces
  - typings.atWordpressWordcount.atWordpressWordcountStrings.characters_including_spaces
*/
trait CountType extends js.Object

object CountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def characters_excluding_spaces: typings.atWordpressWordcount.atWordpressWordcountStrings.characters_excluding_spaces = this.cast("characters_excluding_spaces")
  @scala.inline
  def characters_including_spaces: typings.atWordpressWordcount.atWordpressWordcountStrings.characters_including_spaces = this.cast("characters_including_spaces")
  @scala.inline
  def words: typings.atWordpressWordcount.atWordpressWordcountStrings.words = this.cast("words")
}

