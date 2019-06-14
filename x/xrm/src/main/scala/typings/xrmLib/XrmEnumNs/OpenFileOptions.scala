package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for open file dialog options
  */
/* Rewritten from type alias, can be one of: 
  - xrmLib.xrmLibNumbers.`1`
  - xrmLib.xrmLibNumbers.`2`
*/
trait OpenFileOptions extends js.Object

object OpenFileOptions {
  @scala.inline
  def Open: xrmLib.xrmLibNumbers.`1` = this.cast(1)
  @scala.inline
  def Save: xrmLib.xrmLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

