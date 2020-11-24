package typings.webgme.GmeCommon

import typings.webgme.webgmeStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefStringObject extends DefObject {
  
  var enum: js.UndefOr[js.Array[String]] = js.native
  
  var regex: js.UndefOr[String] = js.native
  
  var `type`: string = js.native
}
object DefStringObject {
  
  @scala.inline
  def apply(`type`: string): DefStringObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefStringObject]
  }
  
  @scala.inline
  implicit class DefStringObjectOps[Self <: DefStringObject] (val x: Self) extends AnyVal {
    
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
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    
    @scala.inline
    def setRegex(value: String): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
