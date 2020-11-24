package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexSchemaJson extends js.Object {
  
  var keyPath: String | js.Array[String] = js.native
  
  var multiEntry: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
}
object IndexSchemaJson {
  
  @scala.inline
  def apply(keyPath: String | js.Array[String]): IndexSchemaJson = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSchemaJson]
  }
  
  @scala.inline
  implicit class IndexSchemaJsonOps[Self <: IndexSchemaJson] (val x: Self) extends AnyVal {
    
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
    def setKeyPathVarargs(value: String*): Self = this.set("keyPath", js.Array(value :_*))
    
    @scala.inline
    def setKeyPath(value: String | js.Array[String]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiEntry(value: Boolean): Self = this.set("multiEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiEntry: Self = this.set("multiEntry", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
}
