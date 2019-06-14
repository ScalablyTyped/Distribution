package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumeration of grid control context resolutions.
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`0`
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
  - xrmLib.xrmLibNumbers.`3`
  - xrmLib.xrmLibNumbers.`4`
*/
trait GridControlContext extends js.Object

object GridControlContext {
  @scala.inline
  def FormContextRelated: xrmLib.xrmLibNumbers.`4` = this.cast(4)
  @scala.inline
  def FormContextUnrelated: xrmLib.xrmLibNumbers.`3` = this.cast(3)
  @scala.inline
  def RibbonContextForm: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  def RibbonContextListing: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  def Unknown: xrmLib.xrmLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

