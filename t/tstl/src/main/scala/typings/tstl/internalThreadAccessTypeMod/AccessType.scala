package typings.tstl.internalThreadAccessTypeMod

import typings.tstl.tstlNumbers.`0`
import typings.tstl.tstlNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tstl.tstlNumbers.`0`
  - typings.tstl.tstlNumbers.`1`
*/
trait AccessType extends js.Object

object AccessType {
  @scala.inline
  def READ: `1` = this.cast(1)
  @scala.inline
  def WRITE: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

