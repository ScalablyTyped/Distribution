package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.EnclosingTypeWalkerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateWhenStartedWalkingTypes1 extends js.Object {
  
  var stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState = js.native
  
  var stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState = js.native
}
object StateWhenStartedWalkingTypes1 {
  
  @scala.inline
  def apply(
    stateWhenStartedWalkingTypes1: EnclosingTypeWalkerState,
    stateWhenStartedWalkingTypes2: EnclosingTypeWalkerState
  ): StateWhenStartedWalkingTypes1 = {
    val __obj = js.Dynamic.literal(stateWhenStartedWalkingTypes1 = stateWhenStartedWalkingTypes1.asInstanceOf[js.Any], stateWhenStartedWalkingTypes2 = stateWhenStartedWalkingTypes2.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateWhenStartedWalkingTypes1]
  }
  
  @scala.inline
  implicit class StateWhenStartedWalkingTypes1Ops[Self <: StateWhenStartedWalkingTypes1] (val x: Self) extends AnyVal {
    
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
    def setStateWhenStartedWalkingTypes1(value: EnclosingTypeWalkerState): Self = this.set("stateWhenStartedWalkingTypes1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateWhenStartedWalkingTypes2(value: EnclosingTypeWalkerState): Self = this.set("stateWhenStartedWalkingTypes2", value.asInstanceOf[js.Any])
  }
}
