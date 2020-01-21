package typings.typescriptOptional

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object typescriptOptionalStrings {
  @js.native
  sealed trait empty extends js.Object
  
  @js.native
  sealed trait present extends js.Object
  
  @scala.inline
  def empty: empty = "empty".asInstanceOf[empty]
  @scala.inline
  def present: present = "present".asInstanceOf[present]
}

