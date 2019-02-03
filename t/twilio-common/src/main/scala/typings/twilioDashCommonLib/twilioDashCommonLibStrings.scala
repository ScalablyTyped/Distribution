package typings
package twilioDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilioDashCommonLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait tokenExpired extends js.Object
  
  @js.native
  sealed trait tokenUpdated extends js.Object
  
  @js.native
  sealed trait tokenWillExpire extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def tokenExpired: tokenExpired = "tokenExpired".asInstanceOf[tokenExpired]
  @scala.inline
  def tokenUpdated: tokenUpdated = "tokenUpdated".asInstanceOf[tokenUpdated]
  @scala.inline
  def tokenWillExpire: tokenWillExpire = "tokenWillExpire".asInstanceOf[tokenWillExpire]
}

