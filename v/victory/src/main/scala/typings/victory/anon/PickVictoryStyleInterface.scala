package typings.victory.anon

import typings.victory.mod.VictoryStyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<victory.victory.VictoryStyleInterface, 'parent'> */
@js.native
trait PickVictoryStyleInterface extends js.Object {
  
  var parent: js.UndefOr[VictoryStyleObject] = js.native
}
object PickVictoryStyleInterface {
  
  @scala.inline
  def apply(): PickVictoryStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickVictoryStyleInterface]
  }
  
  @scala.inline
  implicit class PickVictoryStyleInterfaceOps[Self <: PickVictoryStyleInterface] (val x: Self) extends AnyVal {
    
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
    def setParent(value: VictoryStyleObject): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
