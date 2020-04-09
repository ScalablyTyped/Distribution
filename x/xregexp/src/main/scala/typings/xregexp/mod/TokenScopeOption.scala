package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Valid token scopes for adding a token to XRegExp.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.xregexpStrings.all
  - typings.xregexp.xregexpStrings.default
  - typings.xregexp.xregexpStrings.`class`
*/
trait TokenScopeOption extends js.Object

object TokenScopeOption {
  @scala.inline
  def all: typings.xregexp.xregexpStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `class`: typings.xregexp.xregexpStrings.`class` = this.cast("class")
  @scala.inline
  def default: typings.xregexp.xregexpStrings.default = this.cast("default")
}

