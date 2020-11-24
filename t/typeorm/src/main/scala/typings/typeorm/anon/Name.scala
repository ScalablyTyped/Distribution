package typings.typeorm.anon

import typings.typeorm.commonEntityTargetMod._EntityTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name[Entity]
  extends _EntityTarget[Entity]
     with typings.typeorm.entityTargetMod._EntityTarget[Entity] {
  
  var name: String = js.native
  
  var `type`: Entity = js.native
}
object Name {
  
  @scala.inline
  def apply[Entity](name: String, `type`: Entity): Name[Entity] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[Entity]]
  }
  
  @scala.inline
  implicit class NameOps[Self <: Name[_], Entity] (val x: Self with Name[Entity]) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Entity): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
