package typings.xrm.XrmEnum

import typings.xrm.xrmNumbers.`15`
import typings.xrm.xrmNumbers.`16`
import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import typings.xrm.xrmNumbers.`47`
import typings.xrm.xrmNumbers.`58`
import typings.xrm.xrmNumbers.`59`
import typings.xrm.xrmNumbers.`5`
import typings.xrm.xrmNumbers.`6`
import typings.xrm.xrmNumbers.`70`
import typings.xrm.xrmNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of entity form save modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`1`
  - typings.xrm.xrmNumbers.`2`
  - typings.xrm.xrmNumbers.`59`
  - typings.xrm.xrmNumbers.`70`
  - typings.xrm.xrmNumbers.`58`
  - typings.xrm.xrmNumbers.`5`
  - typings.xrm.xrmNumbers.`6`
  - typings.xrm.xrmNumbers.`47`
  - typings.xrm.xrmNumbers.`7`
  - typings.xrm.xrmNumbers.`16`
  - typings.xrm.xrmNumbers.`15`
*/
trait SaveMode extends js.Object

object SaveMode {
  @scala.inline
  def Assign: `47` = this.cast(47)
  @scala.inline
  def AutoSave: `70` = this.cast(70)
  @scala.inline
  def Deactivate: `5` = this.cast(5)
  @scala.inline
  def Disqualify: `15` = this.cast(15)
  @scala.inline
  def Qualify: `16` = this.cast(16)
  @scala.inline
  def Reactivate: `6` = this.cast(6)
  @scala.inline
  def Save: `1` = this.cast(1)
  @scala.inline
  def SaveAndClose: `2` = this.cast(2)
  @scala.inline
  def SaveAndNew: `59` = this.cast(59)
  @scala.inline
  def SaveAsCompleted: `58` = this.cast(58)
  @scala.inline
  def Send: `7` = this.cast(7)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

