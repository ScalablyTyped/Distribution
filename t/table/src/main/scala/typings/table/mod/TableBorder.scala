package typings.table.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableBorder extends js.Object {
  
  var bodyJoin: js.UndefOr[String] = js.native
  
  var bodyLeft: js.UndefOr[String] = js.native
  
  var bodyRight: js.UndefOr[String] = js.native
  
  var bottomBody: js.UndefOr[String] = js.native
  
  var bottomJoin: js.UndefOr[String] = js.native
  
  var bottomLeft: js.UndefOr[String] = js.native
  
  var bottomRight: js.UndefOr[String] = js.native
  
  var joinBody: js.UndefOr[String] = js.native
  
  var joinJoin: js.UndefOr[String] = js.native
  
  var joinLeft: js.UndefOr[String] = js.native
  
  var joinRight: js.UndefOr[String] = js.native
  
  var topBody: js.UndefOr[String] = js.native
  
  var topJoin: js.UndefOr[String] = js.native
  
  var topLeft: js.UndefOr[String] = js.native
  
  var topRight: js.UndefOr[String] = js.native
}
object TableBorder {
  
  @scala.inline
  def apply(): TableBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorder]
  }
  
  @scala.inline
  implicit class TableBorderOps[Self <: TableBorder] (val x: Self) extends AnyVal {
    
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
    def setBodyJoin(value: String): Self = this.set("bodyJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyJoin: Self = this.set("bodyJoin", js.undefined)
    
    @scala.inline
    def setBodyLeft(value: String): Self = this.set("bodyLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyLeft: Self = this.set("bodyLeft", js.undefined)
    
    @scala.inline
    def setBodyRight(value: String): Self = this.set("bodyRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyRight: Self = this.set("bodyRight", js.undefined)
    
    @scala.inline
    def setBottomBody(value: String): Self = this.set("bottomBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBody: Self = this.set("bottomBody", js.undefined)
    
    @scala.inline
    def setBottomJoin(value: String): Self = this.set("bottomJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomJoin: Self = this.set("bottomJoin", js.undefined)
    
    @scala.inline
    def setBottomLeft(value: String): Self = this.set("bottomLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomLeft: Self = this.set("bottomLeft", js.undefined)
    
    @scala.inline
    def setBottomRight(value: String): Self = this.set("bottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomRight: Self = this.set("bottomRight", js.undefined)
    
    @scala.inline
    def setJoinBody(value: String): Self = this.set("joinBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinBody: Self = this.set("joinBody", js.undefined)
    
    @scala.inline
    def setJoinJoin(value: String): Self = this.set("joinJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinJoin: Self = this.set("joinJoin", js.undefined)
    
    @scala.inline
    def setJoinLeft(value: String): Self = this.set("joinLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinLeft: Self = this.set("joinLeft", js.undefined)
    
    @scala.inline
    def setJoinRight(value: String): Self = this.set("joinRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoinRight: Self = this.set("joinRight", js.undefined)
    
    @scala.inline
    def setTopBody(value: String): Self = this.set("topBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBody: Self = this.set("topBody", js.undefined)
    
    @scala.inline
    def setTopJoin(value: String): Self = this.set("topJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopJoin: Self = this.set("topJoin", js.undefined)
    
    @scala.inline
    def setTopLeft(value: String): Self = this.set("topLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLeft: Self = this.set("topLeft", js.undefined)
    
    @scala.inline
    def setTopRight(value: String): Self = this.set("topRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopRight: Self = this.set("topRight", js.undefined)
  }
}
