package typings
package wordwrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wordwrapLibStrings {
  @js.native
  sealed trait hard
    extends wordwrapLib.wordwrapMod.Mode
  
  @js.native
  sealed trait soft
    extends wordwrapLib.wordwrapMod.Mode
  
  @scala.inline
  def hard: hard = "hard".asInstanceOf[hard]
  @scala.inline
  def soft: soft = "soft".asInstanceOf[soft]
}

