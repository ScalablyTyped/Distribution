package typings
package tailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tailLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait line extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def line: line = "line".asInstanceOf[line]
}

