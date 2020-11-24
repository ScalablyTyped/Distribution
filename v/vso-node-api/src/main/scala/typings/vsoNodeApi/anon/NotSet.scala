package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotSet extends js.Object {
  
  var abandoned: scala.Double = js.native
  
  var active: scala.Double = js.native
  
  var all: scala.Double = js.native
  
  var completed: scala.Double = js.native
  
  var notSet: scala.Double = js.native
}
object NotSet {
  
  @scala.inline
  def apply(
    abandoned: scala.Double,
    active: scala.Double,
    all: scala.Double,
    completed: scala.Double,
    notSet: scala.Double
  ): NotSet = {
    val __obj = js.Dynamic.literal(abandoned = abandoned.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], notSet = notSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotSet]
  }
  
  @scala.inline
  implicit class NotSetOps[Self <: NotSet] (val x: Self) extends AnyVal {
    
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
    def setAbandoned(value: scala.Double): Self = this.set("abandoned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: scala.Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSet(value: scala.Double): Self = this.set("notSet", value.asInstanceOf[js.Any])
  }
}
