package typings.tabris

import typings.tabris.mod._ConstraintValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tabrisBooleans {
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait `true` extends _ConstraintValue
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

