package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of entity form states/types.
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`0`
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
  - xrmLib.xrmLibNumbers.`3`
  - xrmLib.xrmLibNumbers.`4`
  - xrmLib.xrmLibNumbers.`6`
  - xrmLib.xrmLibNumbers.`5`
  - xrmLib.xrmLibNumbers.`11`
*/
trait FormType extends js.Object

object FormType {
  @scala.inline
  def BulkEdit: xrmLib.xrmLibNumbers.`6` = this.cast(6)
  @scala.inline
  def Create: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Disabled: xrmLib.xrmLibNumbers.`4` = this.cast(4)
  /**
    * @deprecated QuickCreate has been deprecated
    */
  @scala.inline
  def QuickCreate: xrmLib.xrmLibNumbers.`5` = this.cast(5)
  @scala.inline
  def ReadOnly: xrmLib.xrmLibNumbers.`3` = this.cast(3)
  /**
    * @deprecated ReadOptimized has been deprecated.
    */
  @scala.inline
  def ReadOptimized: xrmLib.xrmLibNumbers.`11` = this.cast(11)
  @scala.inline
  def Undefined: xrmLib.xrmLibNumbers.`0` = this.cast(0)
  @scala.inline
  def Update: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

