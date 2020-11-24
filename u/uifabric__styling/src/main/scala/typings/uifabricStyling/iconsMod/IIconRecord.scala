package typings.uifabricStyling.iconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIconRecord extends js.Object {
  
  var code: js.UndefOr[String] = js.native
  
  var subset: IIconSubsetRecord = js.native
}
object IIconRecord {
  
  @scala.inline
  def apply(subset: IIconSubsetRecord): IIconRecord = {
    val __obj = js.Dynamic.literal(subset = subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconRecord]
  }
  
  @scala.inline
  implicit class IIconRecordOps[Self <: IIconRecord] (val x: Self) extends AnyVal {
    
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
    def setSubset(value: IIconSubsetRecord): Self = this.set("subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
  }
}
