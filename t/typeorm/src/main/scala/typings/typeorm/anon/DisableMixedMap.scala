package typings.typeorm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableMixedMap extends js.Object {
  
  var disableMixedMap: js.UndefOr[Boolean] = js.native
  
  var relations: js.UndefOr[js.Array[String]] = js.native
}
object DisableMixedMap {
  
  @scala.inline
  def apply(): DisableMixedMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableMixedMap]
  }
  
  @scala.inline
  implicit class DisableMixedMapOps[Self <: DisableMixedMap] (val x: Self) extends AnyVal {
    
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
    def setDisableMixedMap(value: Boolean): Self = this.set("disableMixedMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMixedMap: Self = this.set("disableMixedMap", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: String*): Self = this.set("relations", js.Array(value :_*))
    
    @scala.inline
    def setRelations(value: js.Array[String]): Self = this.set("relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelations: Self = this.set("relations", js.undefined)
  }
}
