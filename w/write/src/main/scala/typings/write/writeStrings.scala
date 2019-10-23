package typings.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object writeStrings {
  @js.native
  sealed trait encoding extends js.Object
  
  @js.native
  sealed trait recursive extends js.Object
  
  @scala.inline
  def encoding: encoding = "encoding".asInstanceOf[encoding]
  @scala.inline
  def recursive: recursive = "recursive".asInstanceOf[recursive]
}

