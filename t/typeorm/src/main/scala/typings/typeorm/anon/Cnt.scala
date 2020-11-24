package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cnt extends js.Object {
  
  var cnt: js.Any = js.native
  
  var parentId: js.Any = js.native
}
object Cnt {
  
  @scala.inline
  def apply(cnt: js.Any, parentId: js.Any): Cnt = {
    val __obj = js.Dynamic.literal(cnt = cnt.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cnt]
  }
  
  @scala.inline
  implicit class CntOps[Self <: Cnt] (val x: Self) extends AnyVal {
    
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
    def setCnt(value: js.Any): Self = this.set("cnt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: js.Any): Self = this.set("parentId", value.asInstanceOf[js.Any])
  }
}
