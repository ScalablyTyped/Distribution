package typings.uniApp

import typings.uniApp.uniAppStrings.`0`
import typings.uniApp.uniAppStrings.`1`
import typings.uniApp.uniAppStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniProgramShareOptions extends js.Object {
  
  /**
    * 微信小程序原始id
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * 点击链接进入的页面
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * 微信小程序版本类型，默认为0。
    * - 0: 正式版
    * - 1: 测试版
    * - 2: 体验版
    */
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.native
  
  /**
    * 兼容低版本的网页链接
    */
  var webUrl: js.UndefOr[String] = js.native
}
object MiniProgramShareOptions {
  
  @scala.inline
  def apply(): MiniProgramShareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiniProgramShareOptions]
  }
  
  @scala.inline
  implicit class MiniProgramShareOptionsOps[Self <: MiniProgramShareOptions] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setType(value: `0` | `1` | `2`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUrl: Self = this.set("webUrl", js.undefined)
  }
}
