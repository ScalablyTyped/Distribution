package typings
package whenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object whenLibStrings {
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}

