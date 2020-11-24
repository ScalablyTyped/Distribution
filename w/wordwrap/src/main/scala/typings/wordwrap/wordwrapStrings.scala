package typings.wordwrap

import typings.wordwrap.mod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordwrapStrings {
  
  @scala.inline
  def hard: hard = "hard".asInstanceOf[hard]
  
  @scala.inline
  def soft: soft = "soft".asInstanceOf[soft]
  
  @js.native
  sealed trait hard extends Mode
  
  @js.native
  sealed trait soft extends Mode
}
