package typings
package tinycopyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tinycopyLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def success: success = "success".asInstanceOf[success]
}

