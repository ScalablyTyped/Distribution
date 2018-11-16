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
  
  def error: error = "error".asInstanceOf[error]
  def tokenExpired: tokenExpired = "tokenExpired".asInstanceOf[tokenExpired]
  def tokenUpdated: tokenUpdated = "tokenUpdated".asInstanceOf[tokenUpdated]
  def tokenWillExpire: tokenWillExpire = "tokenWillExpire".asInstanceOf[tokenWillExpire]
}

