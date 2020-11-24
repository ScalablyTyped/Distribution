package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entities[Entity, T] extends js.Object {
  
  var entities: js.Array[Entity] = js.native
  
  var raw: js.Array[T] = js.native
}
object Entities {
  
  @scala.inline
  def apply[Entity, T](entities: js.Array[Entity], raw: js.Array[T]): Entities[Entity, T] = {
    val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entities[Entity, T]]
  }
  
  @scala.inline
  implicit class EntitiesOps[Self <: Entities[_, _], Entity, T] (val x: Self with (Entities[Entity, T])) extends AnyVal {
    
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
    def setEntitiesVarargs(value: Entity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[Entity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawVarargs(value: T*): Self = this.set("raw", js.Array(value :_*))
    
    @scala.inline
    def setRaw(value: js.Array[T]): Self = this.set("raw", value.asInstanceOf[js.Any])
  }
}
