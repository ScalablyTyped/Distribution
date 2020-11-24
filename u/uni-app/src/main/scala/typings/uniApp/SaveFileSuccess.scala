package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveFileSuccess extends js.Object {
  
  /**
    * 文件的保存路径
    */
  var savedFilePath: js.UndefOr[String] = js.native
}
object SaveFileSuccess {
  
  @scala.inline
  def apply(): SaveFileSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveFileSuccess]
  }
  
  @scala.inline
  implicit class SaveFileSuccessOps[Self <: SaveFileSuccess] (val x: Self) extends AnyVal {
    
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
    def setSavedFilePath(value: String): Self = this.set("savedFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedFilePath: Self = this.set("savedFilePath", js.undefined)
  }
}
