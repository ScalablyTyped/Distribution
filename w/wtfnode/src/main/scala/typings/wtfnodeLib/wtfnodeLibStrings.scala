package typings
package wtfnodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wtfnodeLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

