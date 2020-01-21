package typings.symbolTree

import typings.symbolTree.symbolTreeNumbers.`16`
import typings.symbolTree.symbolTreeNumbers.`1`
import typings.symbolTree.symbolTreeNumbers.`2`
import typings.symbolTree.symbolTreeNumbers.`4`
import typings.symbolTree.symbolTreeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofTreePosition extends js.Object {
  val CONTAINED_BY: `16`
  val CONTAINS: `8`
  val DISCONNECTED: `1`
  val FOLLOWING: `4`
  val PRECEDING: `2`
}

object TypeofTreePosition {
  @scala.inline
  def apply(CONTAINED_BY: `16`, CONTAINS: `8`, DISCONNECTED: `1`, FOLLOWING: `4`, PRECEDING: `2`): TypeofTreePosition = {
    val __obj = js.Dynamic.literal(CONTAINED_BY = CONTAINED_BY.asInstanceOf[js.Any], CONTAINS = CONTAINS.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], FOLLOWING = FOLLOWING.asInstanceOf[js.Any], PRECEDING = PRECEDING.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofTreePosition]
  }
}

