package typings.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.styleSearch.styleSearchStrings.skip
  - typings.styleSearch.styleSearchStrings.check
  - typings.styleSearch.styleSearchStrings.only
*/
trait SyntaxFeatureOption extends js.Object

object SyntaxFeatureOption {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def check: typings.styleSearch.styleSearchStrings.check = this.cast("check")
  @scala.inline
  def only: typings.styleSearch.styleSearchStrings.only = this.cast("only")
  @scala.inline
  def skip: typings.styleSearch.styleSearchStrings.skip = this.cast("skip")
}

