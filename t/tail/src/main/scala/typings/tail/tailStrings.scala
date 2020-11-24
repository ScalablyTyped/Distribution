package typings.tail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tailStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait line extends js.Object
}
