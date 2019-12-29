package typings.typescriptDashLogic

import typings.typescriptDashLogic.typescriptDashLogicMod.Not
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typescriptDashLogicBooleans {
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

