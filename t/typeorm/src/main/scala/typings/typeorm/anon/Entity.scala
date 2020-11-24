package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity[E1, E2] extends js.Object {
  
  var entity: E1 = js.native
  
  var related: js.UndefOr[E2 | js.Array[E2]] = js.native
}
object Entity {
  
  @scala.inline
  def apply[E1, E2](entity: E1): Entity[E1, E2] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity[E1, E2]]
  }
  
  @scala.inline
  implicit class EntityOps[Self <: Entity[_, _], E1, E2] (val x: Self with (Entity[E1, E2])) extends AnyVal {
    
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
    def setEntity(value: E1): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedVarargs(value: E2*): Self = this.set("related", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: E2 | js.Array[E2]): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
  }
}
