package typings.uniApp.Page

import typings.uniApp.uniAppStrings.backbutton
import typings.uniApp.uniAppStrings.navigateBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackPressOption extends js.Object {
  
  /**
    * - backbutton 顶部导航栏左边的返回按钮或 Android 实体返回键
    * - navigateBack 返回 API，即 uni.navigateBack()
    */
  var from: backbutton | navigateBack = js.native
}
object BackPressOption {
  
  @scala.inline
  def apply(from: backbutton | navigateBack): BackPressOption = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackPressOption]
  }
  
  @scala.inline
  implicit class BackPressOptionOps[Self <: BackPressOption] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: backbutton | navigateBack): Self = this.set("from", value.asInstanceOf[js.Any])
  }
}
