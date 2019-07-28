package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object winjsStrings {
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait up extends js.Object
  
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

