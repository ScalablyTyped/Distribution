package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSchemaJson extends js.Object {
  
  var autoIncrement: js.UndefOr[Boolean] = js.native
  
  var dispatchEvents: js.UndefOr[Boolean] = js.native
  
  var indexes: js.UndefOr[js.Array[IndexSchemaJson]] = js.native
  
  var keyPath: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object StoreSchemaJson {
  
  @scala.inline
  def apply(): StoreSchemaJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreSchemaJson]
  }
  
  @scala.inline
  implicit class StoreSchemaJsonOps[Self <: StoreSchemaJson] (val x: Self) extends AnyVal {
    
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
    def setAutoIncrement(value: Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    
    @scala.inline
    def setDispatchEvents(value: Boolean): Self = this.set("dispatchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispatchEvents: Self = this.set("dispatchEvents", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: IndexSchemaJson*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[IndexSchemaJson]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    
    @scala.inline
    def setKeyPath(value: String): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPath: Self = this.set("keyPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
