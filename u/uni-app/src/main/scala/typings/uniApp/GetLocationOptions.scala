package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLocationOptions extends js.Object {
  
  /**
    * 传入 true 会返回高度信息，由于获取高度需要较高精确度，会减慢接口返回速度
    */
  var altitude: js.UndefOr[Boolean] = js.native
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 传入 true 会解析地址
    */
  var geocode: js.UndefOr[Boolean] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ GetLocationSuccess, Unit]] = js.native
  
  /**
    * 默认为 wgs84 返回 gps 坐标，gcj02 返回可用于uni.openLocation的坐标
    */
  var `type`: js.UndefOr[String] = js.native
}
object GetLocationOptions {
  
  @scala.inline
  def apply(): GetLocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationOptions]
  }
  
  @scala.inline
  implicit class GetLocationOptionsOps[Self <: GetLocationOptions] (val x: Self) extends AnyVal {
    
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
    def setAltitude(value: Boolean): Self = this.set("altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltitude: Self = this.set("altitude", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setGeocode(value: Boolean): Self = this.set("geocode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeocode: Self = this.set("geocode", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ GetLocationSuccess => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
