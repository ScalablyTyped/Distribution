package typings.typescriptLogic

import typings.typescriptLogic.mod.Not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typescriptLogicBooleans {
  @js.native
  sealed trait `false`
    extends Not[js.Any]
  
  @js.native
  sealed trait `true`
    extends Not[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

