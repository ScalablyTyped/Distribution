package typings.wegameApi.wx.types

import typings.wegameApi.anon.DataReadonlyArray
import typings.wegameApi.wegameApiStrings.en
import typings.wegameApi.wegameApiStrings.zh_CN
import typings.wegameApi.wegameApiStrings.zh_TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 新版本wx.getUserInfo的参数，需要在开放数据域内调用
  */
trait NewUserInfoParam extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 显示用户信息的语言
    */
  var lang: js.UndefOr[en | zh_CN | zh_TW] = js.undefined
  
  /**
    * 要获取信息的用户的 openId 数组，如果要获取当前用户信息，则将数组中的一个元素设为 'selfOpenId'
    */
  var openIdList: js.UndefOr[js.Array[String]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* res */ DataReadonlyArray, Unit]] = js.undefined
}
object NewUserInfoParam {
  
  inline def apply(): NewUserInfoParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUserInfoParam]
  }
  
  extension [Self <: NewUserInfoParam](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setLang(value: en | zh_CN | zh_TW): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setOpenIdList(value: js.Array[String]): Self = StObject.set(x, "openIdList", value.asInstanceOf[js.Any])
    
    inline def setOpenIdListUndefined: Self = StObject.set(x, "openIdList", js.undefined)
    
    inline def setOpenIdListVarargs(value: String*): Self = StObject.set(x, "openIdList", js.Array(value :_*))
    
    inline def setSuccess(value: /* res */ DataReadonlyArray => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
