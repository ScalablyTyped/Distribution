package typings.typedoc.anon

import typings.typedoc.serializationEventsMod.SerializeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Begin extends js.Object {
  
  var begin: js.UndefOr[SerializeEventData] = js.native
  
  var end: js.UndefOr[SerializeEventData] = js.native
}
object Begin {
  
  @scala.inline
  def apply(): Begin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Begin]
  }
  
  @scala.inline
  implicit class BeginOps[Self <: Begin] (val x: Self) extends AnyVal {
    
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
    def setBegin(value: SerializeEventData): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setEnd(value: SerializeEventData): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
  }
}
