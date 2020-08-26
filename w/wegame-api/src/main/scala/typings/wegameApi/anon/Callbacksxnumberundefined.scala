package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.auto
import typings.wegameApi.wegameApiStrings.back
import typings.wegameApi.wegameApiStrings.front
import typings.wegameApi.wegameApiStrings.large
import typings.wegameApi.wegameApiStrings.medium
import typings.wegameApi.wegameApiStrings.off
import typings.wegameApi.wegameApiStrings.on
import typings.wegameApi.wegameApiStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.Callbacks & {  x :number | undefined,   y :number | undefined,   width :number | undefined,   height :number | undefined,   devicePosition :'front' | 'back' | undefined,   flash :'auto' | 'on' | 'off' | undefined,   size :'small' | 'medium' | 'large' | undefined} */
@js.native
trait Callbacksxnumberundefined extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 摄像头朝向，值为 front, back，默认值back
    */
  var devicePosition: js.UndefOr[front | back] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 闪光灯，值为 auto, on, off，默认值auto
    */
  var flash: js.UndefOr[auto | on | off] = js.native
  /**
    * 相机的高度，默认值150
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * 帧数据图像尺寸，值为 small, medium, large，默认值small
    */
  var size: js.UndefOr[small | medium | large] = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 相机的宽度，默认值300
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * 相机的左上角横坐标，默认值0
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * 相机的左上角纵坐标，默认值0
    */
  var y: js.UndefOr[Double] = js.native
}

object Callbacksxnumberundefined {
  @scala.inline
  def apply(): Callbacksxnumberundefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacksxnumberundefined]
  }
  @scala.inline
  implicit class CallbacksxnumberundefinedOps[Self <: Callbacksxnumberundefined] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDevicePosition(value: front | back): Self = this.set("devicePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicePosition: Self = this.set("devicePosition", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFlash(value: auto | on | off): Self = this.set("flash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlash: Self = this.set("flash", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

