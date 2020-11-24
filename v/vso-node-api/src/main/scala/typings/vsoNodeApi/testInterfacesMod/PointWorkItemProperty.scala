package typings.vsoNodeApi.testInterfacesMod

import typings.vsoNodeApi.anon.ValueAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointWorkItemProperty extends js.Object {
  
  var workItem: ValueAny = js.native
}
object PointWorkItemProperty {
  
  @scala.inline
  def apply(workItem: ValueAny): PointWorkItemProperty = {
    val __obj = js.Dynamic.literal(workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointWorkItemProperty]
  }
  
  @scala.inline
  implicit class PointWorkItemPropertyOps[Self <: PointWorkItemProperty] (val x: Self) extends AnyVal {
    
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
    def setWorkItem(value: ValueAny): Self = this.set("workItem", value.asInstanceOf[js.Any])
  }
}
