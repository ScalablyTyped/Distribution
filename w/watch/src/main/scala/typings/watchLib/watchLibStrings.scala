package typings
package watchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object watchLibStrings {
  @js.native
  sealed trait changed extends js.Object
  
  @js.native
  sealed trait created extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
  
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
}

