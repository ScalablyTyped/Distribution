package typings.webpackMerge

import typings.webpackMerge.mod.MergeStrategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webpackMergeStrings {
  @js.native
  sealed trait append extends MergeStrategy
  
  @js.native
  sealed trait prepend extends MergeStrategy
  
  @js.native
  sealed trait replace extends MergeStrategy
  
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  @scala.inline
  def prepend: prepend = "prepend".asInstanceOf[prepend]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}

