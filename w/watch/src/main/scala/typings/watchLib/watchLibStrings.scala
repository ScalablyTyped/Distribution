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
  
  def changed: changed = "changed".asInstanceOf[changed]
  def created: created = "created".asInstanceOf[created]
  def removed: removed = "removed".asInstanceOf[removed]
}

