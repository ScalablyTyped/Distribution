package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid non-letter and non-number characters that can be used as a flag for when adding a new token to XRegExp.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.xregexpStrings._underscore
  - typings.xregexp.xregexpStrings.$
*/
trait TokenFlagOTHER extends js.Object

object TokenFlagOTHER {
  @scala.inline
  def $: typings.xregexp.xregexpStrings.$ = this.cast("$")
  @scala.inline
  def _underscore: typings.xregexp.xregexpStrings._underscore = this.cast("_")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

