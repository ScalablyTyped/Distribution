package typings.typescriptCompare

import typings.typescriptCompare.mod.prv.Extends
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typescriptCompareBooleans {
  @js.native
  sealed trait `false`
    extends Extends[js.Any, js.Any]
  
  @js.native
  sealed trait `true`
    extends Extends[js.Any, js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

