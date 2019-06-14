package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: {@link Entity.save Entity} Save Modes
  * @see {@link Xrm.EntitySaveMode}
  * @see {@link Entity}
  * @see {@link Entity.save}
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibStrings.saveandclose
  - xrmLib.xrmLibStrings.saveandnew
*/
trait EntitySaveMode extends js.Object

object EntitySaveMode {
  @scala.inline
  def SaveAndClose: xrmLib.xrmLibStrings.saveandclose = this.cast("saveandclose")
  @scala.inline
  def SaveAndNew: xrmLib.xrmLibStrings.saveandnew = this.cast("saveandnew")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

