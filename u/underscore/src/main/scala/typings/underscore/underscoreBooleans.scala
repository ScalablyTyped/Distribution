package typings.underscore

import typings.underscore.mod._AnyFalsy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object underscoreBooleans {
  @js.native
  sealed trait `false` extends _AnyFalsy
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

