package typings
package stropheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stropheLibStrings {
  @js.native
  sealed trait chat extends js.Object
  
  @js.native
  sealed trait groupchat extends js.Object
  
  @js.native
  sealed trait message extends js.Object
  
  @js.native
  sealed trait presence extends js.Object
  
  @js.native
  sealed trait roster extends js.Object
  
  def chat: chat = "chat".asInstanceOf[chat]
  def groupchat: groupchat = "groupchat".asInstanceOf[groupchat]
  def message: message = "message".asInstanceOf[message]
  def presence: presence = "presence".asInstanceOf[presence]
  def roster: roster = "roster".asInstanceOf[roster]
}

