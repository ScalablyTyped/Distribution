package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackgroundAudioOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 封面url
    */
  var coverImgUrl: js.UndefOr[String] = js.native
  /**
    * 音乐链接，目前支持的格式有 m4a, aac, mp3, wav
    */
  var dataUrl: js.UndefOr[String] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 音乐标题
    */
  var title: js.UndefOr[String] = js.native
}

object GetBackgroundAudioOptions {
  @scala.inline
  def apply(): GetBackgroundAudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioOptions]
  }
  @scala.inline
  implicit class GetBackgroundAudioOptionsOps[Self <: GetBackgroundAudioOptions] (val x: Self) extends AnyVal {
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
    def setCoverImgUrl(value: String): Self = this.set("coverImgUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverImgUrl: Self = this.set("coverImgUrl", js.undefined)
    @scala.inline
    def setDataUrl(value: String): Self = this.set("dataUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataUrl: Self = this.set("dataUrl", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

