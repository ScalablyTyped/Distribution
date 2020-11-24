package typings.uniApp.Page

import typings.uniApp.AnyObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageInstanceBaseProps[D /* <: AnyObject */] extends js.Object {
  
  /**
    * 到当前页面的路径，类型为 `String`
    */
  var route: js.UndefOr[String] = js.native
}
object PageInstanceBaseProps {
  
  @scala.inline
  def apply[D /* <: AnyObject */](): PageInstanceBaseProps[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageInstanceBaseProps[D]]
  }
  
  @scala.inline
  implicit class PageInstanceBasePropsOps[Self <: PageInstanceBaseProps[_], D /* <: AnyObject */] (val x: Self with PageInstanceBaseProps[D]) extends AnyVal {
    
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
    def setRoute(value: String): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
  }
}
