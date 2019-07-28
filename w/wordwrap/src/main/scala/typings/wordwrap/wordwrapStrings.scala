package typings.wordwrap

import typings.wordwrap.wordwrapMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wordwrapStrings {
  @js.native
  sealed trait hard extends Mode
  
  @js.native
  sealed trait soft extends Mode
  
  @scala.inline
  def hard: hard = "hard".asInstanceOf[hard]
  @scala.inline
  def soft: soft = "soft".asInstanceOf[soft]
}

