package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of entity form save modes.
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
  - xrmLib.xrmLibNumbers.`59`
  - xrmLib.xrmLibNumbers.`70`
  - xrmLib.xrmLibNumbers.`58`
  - xrmLib.xrmLibNumbers.`5`
  - xrmLib.xrmLibNumbers.`6`
  - xrmLib.xrmLibNumbers.`47`
  - xrmLib.xrmLibNumbers.`7`
  - xrmLib.xrmLibNumbers.`16`
  - xrmLib.xrmLibNumbers.`15`
*/
trait SaveMode extends js.Object

object SaveMode {
  @scala.inline
  def Assign: xrmLib.xrmLibNumbers.`47` = this.cast(47)
  @scala.inline
  def AutoSave: xrmLib.xrmLibNumbers.`70` = this.cast(70)
  @scala.inline
  def Deactivate: xrmLib.xrmLibNumbers.`5` = this.cast(5)
  @scala.inline
  def Disqualify: xrmLib.xrmLibNumbers.`15` = this.cast(15)
  @scala.inline
  def Qualify: xrmLib.xrmLibNumbers.`16` = this.cast(16)
  @scala.inline
  def Reactivate: xrmLib.xrmLibNumbers.`6` = this.cast(6)
  @scala.inline
  def Save: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  def SaveAndClose: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  def SaveAndNew: xrmLib.xrmLibNumbers.`59` = this.cast(59)
  @scala.inline
  def SaveAsCompleted: xrmLib.xrmLibNumbers.`58` = this.cast(58)
  @scala.inline
  def Send: xrmLib.xrmLibNumbers.`7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

