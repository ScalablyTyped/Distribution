package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.EnclosingTypeWalkerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnclosingTypeWalkerState1 extends js.Object {
  var enclosingTypeWalkerState1: EnclosingTypeWalkerState = js.native
  var enclosingTypeWalkerState2: EnclosingTypeWalkerState = js.native
}

object EnclosingTypeWalkerState1 {
  @scala.inline
  def apply(
    enclosingTypeWalkerState1: EnclosingTypeWalkerState,
    enclosingTypeWalkerState2: EnclosingTypeWalkerState
  ): EnclosingTypeWalkerState1 = {
    val __obj = js.Dynamic.literal(enclosingTypeWalkerState1 = enclosingTypeWalkerState1.asInstanceOf[js.Any], enclosingTypeWalkerState2 = enclosingTypeWalkerState2.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnclosingTypeWalkerState1]
  }
  @scala.inline
  implicit class EnclosingTypeWalkerState1Ops[Self <: EnclosingTypeWalkerState1] (val x: Self) extends AnyVal {
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
    def setEnclosingTypeWalkerState1(value: EnclosingTypeWalkerState): Self = this.set("enclosingTypeWalkerState1", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnclosingTypeWalkerState2(value: EnclosingTypeWalkerState): Self = this.set("enclosingTypeWalkerState2", value.asInstanceOf[js.Any])
  }
  
}

