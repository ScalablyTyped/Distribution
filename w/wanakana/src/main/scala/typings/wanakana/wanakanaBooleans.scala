package typings.wanakana

import typings.wanakana.mod.IMEModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wanakanaBooleans {
  @js.native
  sealed trait `false` extends IMEModes
  
  @js.native
  sealed trait `true` extends IMEModes
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

