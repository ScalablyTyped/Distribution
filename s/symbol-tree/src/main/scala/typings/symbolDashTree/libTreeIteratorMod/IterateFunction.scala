package typings.symbolDashTree.libTreeIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The iteration function to use.
	 *
	 * - `1`: Iterate previous sibling nodes.
	 * - `2`: Iterate next sibling nodes.
	 * - `3`: Iterate ancestor nodes.
	 * - `4`: Iterate all tree-inclusive preceding nodes.
	 * - `5`: Iterate all tree-inclusive following nodes.
	 */
/* Rewritten from type alias, can be one of: 
  - typings.symbolDashTree.symbolDashTreeNumbers.`1`
  - typings.symbolDashTree.symbolDashTreeNumbers.`2`
  - typings.symbolDashTree.symbolDashTreeNumbers.`3`
  - typings.symbolDashTree.symbolDashTreeNumbers.`4`
  - typings.symbolDashTree.symbolDashTreeNumbers.`5`
*/
trait IterateFunction extends js.Object

object IterateFunction {
  @scala.inline
  def `1`: typings.symbolDashTree.symbolDashTreeNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typings.symbolDashTree.symbolDashTreeNumbers.`2` = this.cast(2)
  @scala.inline
  def `3`: typings.symbolDashTree.symbolDashTreeNumbers.`3` = this.cast(3)
  @scala.inline
  def `4`: typings.symbolDashTree.symbolDashTreeNumbers.`4` = this.cast(4)
  @scala.inline
  def `5`: typings.symbolDashTree.symbolDashTreeNumbers.`5` = this.cast(5)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

