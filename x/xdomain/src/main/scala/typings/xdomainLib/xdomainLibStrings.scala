package typings
package xdomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xdomainLibStrings {
  @js.native
  sealed trait log extends js.Object
  
  @js.native
  sealed trait timeout extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  def log: log = "log".asInstanceOf[log]
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  def warn: warn = "warn".asInstanceOf[warn]
}

