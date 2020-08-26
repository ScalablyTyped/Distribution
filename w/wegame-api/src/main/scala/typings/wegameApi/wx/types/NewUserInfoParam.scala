package typings.wegameApi.wx.types

import typings.wegameApi.anon.DataReadonlyArray
import typings.wegameApi.wegameApiStrings.en
import typings.wegameApi.wegameApiStrings.zh_CN
import typings.wegameApi.wegameApiStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
@js.native
trait NewUserInfoParam extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.native
  /**
    * 要获取信息的用户的 openId 数组，如果要获取当前用户信息，则将数组中的一个元素设为 'selfOpenId'
    */
  var openIdList: js.UndefOr[js.Array[String]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ DataReadonlyArray, Unit]] = js.native
}

object NewUserInfoParam {
  @scala.inline
  def apply(): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUserInfoParam]
  }
  @scala.inline
  implicit class NewUserInfoParamOps[Self <: NewUserInfoParam] (val x: Self) extends AnyVal {
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
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setLang(value: en | zh_CN | zh_TW): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setOpenIdListVarargs(value: String*): Self = this.set("openIdList", js.Array(value :_*))
    @scala.inline
    def setOpenIdList(value: js.Array[String]): Self = this.set("openIdList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIdList: Self = this.set("openIdList", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ DataReadonlyArray => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

