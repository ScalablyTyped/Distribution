package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheTime extends js.Object {
  
  var cacheTime: js.UndefOr[Double] = js.native
  
  var showAlert: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object CacheTime {
  
  @scala.inline
  def apply(): CacheTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheTime]
  }
  
  @scala.inline
  implicit class CacheTimeOps[Self <: CacheTime] (val x: Self) extends AnyVal {
    
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
    def setCacheTime(value: Double): Self = this.set("cacheTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheTime: Self = this.set("cacheTime", js.undefined)
    
    @scala.inline
    def setShowAlert(value: Boolean): Self = this.set("showAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAlert: Self = this.set("showAlert", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
