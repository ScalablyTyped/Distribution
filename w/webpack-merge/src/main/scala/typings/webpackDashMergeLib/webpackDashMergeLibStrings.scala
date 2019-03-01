package typings
package webpackDashMergeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object webpackDashMergeLibStrings {
  @js.native
  sealed trait append
    extends webpackDashMergeLib.webpackDashMergeMod.webpackMergeNs.MergeStrategy
  
  @js.native
  sealed trait prepend
    extends webpackDashMergeLib.webpackDashMergeMod.webpackMergeNs.MergeStrategy
  
  @js.native
  sealed trait replace
    extends webpackDashMergeLib.webpackDashMergeMod.webpackMergeNs.MergeStrategy
  
  @scala.inline
  def append: append = "append".asInstanceOf[append]
  @scala.inline
  def prepend: prepend = "prepend".asInstanceOf[prepend]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
}

