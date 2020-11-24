package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowActionSheetRes extends js.Object {
  
  /**
    * 用户点击的按钮，从上到下的顺序，从0开始
    */
  var tapIndex: js.UndefOr[Double] = js.native
}
object ShowActionSheetRes {
  
  @scala.inline
  def apply(): ShowActionSheetRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowActionSheetRes]
  }
  
  @scala.inline
  implicit class ShowActionSheetResOps[Self <: ShowActionSheetRes] (val x: Self) extends AnyVal {
    
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
    def setTapIndex(value: Double): Self = this.set("tapIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapIndex: Self = this.set("tapIndex", js.undefined)
  }
}
