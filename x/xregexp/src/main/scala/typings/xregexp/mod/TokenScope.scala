package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region types
/**
  * Valid token scopes used as an argument to the token handler closure passed to `XRegExp.addToken`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xregexp.xregexpStrings.default
  - typings.xregexp.xregexpStrings.`class`
*/
trait TokenScope extends js.Object

object TokenScope {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `class`: typings.xregexp.xregexpStrings.`class` = this.cast("class")
  @scala.inline
  def default: typings.xregexp.xregexpStrings.default = this.cast("default")
}

