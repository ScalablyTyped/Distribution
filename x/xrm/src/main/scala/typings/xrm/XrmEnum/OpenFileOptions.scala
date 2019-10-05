package typings.xrm.XrmEnum

import typings.xrm.xrmNumbers.`1`
import typings.xrm.xrmNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration for open file dialog options
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmNumbers.`1`
  - typings.xrm.xrmNumbers.`2`
*/
trait OpenFileOptions extends js.Object

object OpenFileOptions {
  @scala.inline
  def Open: `1` = this.cast(1)
  @scala.inline
  def Save: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

