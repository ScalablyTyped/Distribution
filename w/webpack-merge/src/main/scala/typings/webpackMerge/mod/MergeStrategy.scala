package typings.webpackMerge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.webpackMerge.webpackMergeStrings.prepend
  - typings.webpackMerge.webpackMergeStrings.append
  - typings.webpackMerge.webpackMergeStrings.replace
*/
trait MergeStrategy extends js.Object

object MergeStrategy {
  @scala.inline
  def append: typings.webpackMerge.webpackMergeStrings.append = this.cast("append")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def prepend: typings.webpackMerge.webpackMergeStrings.prepend = this.cast("prepend")
  @scala.inline
  def replace: typings.webpackMerge.webpackMergeStrings.replace = this.cast("replace")
}

