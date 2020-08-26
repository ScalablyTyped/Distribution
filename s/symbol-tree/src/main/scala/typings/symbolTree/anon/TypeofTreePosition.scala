package typings.symbolTree.anon

import typings.symbolTree.symbolTreeNumbers.`16`
import typings.symbolTree.symbolTreeNumbers.`1`
import typings.symbolTree.symbolTreeNumbers.`2`
import typings.symbolTree.symbolTreeNumbers.`4`
import typings.symbolTree.symbolTreeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTreePosition extends js.Object {
  val CONTAINED_BY: `16` = js.native
  val CONTAINS: `8` = js.native
  val DISCONNECTED: `1` = js.native
  val FOLLOWING: `4` = js.native
  val PRECEDING: `2` = js.native
}

object TypeofTreePosition {
  @scala.inline
  def apply(CONTAINED_BY: `16`, CONTAINS: `8`, DISCONNECTED: `1`, FOLLOWING: `4`, PRECEDING: `2`): TypeofTreePosition = {
    val __obj = js.Dynamic.literal(CONTAINED_BY = CONTAINED_BY.asInstanceOf[js.Any], CONTAINS = CONTAINS.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], FOLLOWING = FOLLOWING.asInstanceOf[js.Any], PRECEDING = PRECEDING.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTreePosition]
  }
  @scala.inline
  implicit class TypeofTreePositionOps[Self <: TypeofTreePosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCONTAINED_BY(value: `16`): Self = this.set("CONTAINED_BY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTAINS(value: `8`): Self = this.set("CONTAINS", value.asInstanceOf[js.Any])
    @scala.inline
    def setDISCONNECTED(value: `1`): Self = this.set("DISCONNECTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setFOLLOWING(value: `4`): Self = this.set("FOLLOWING", value.asInstanceOf[js.Any])
    @scala.inline
    def setPRECEDING(value: `2`): Self = this.set("PRECEDING", value.asInstanceOf[js.Any])
  }
  
}

