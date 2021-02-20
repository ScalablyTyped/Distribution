package typings.wegameApi.anon

import typings.wegameApi.wegameApiStrings.develop
import typings.wegameApi.wegameApiStrings.release
import typings.wegameApi.wegameApiStrings.trial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  appId :string,   path :string | undefined,   extraData :unknown | undefined,   envVersion :'develop' | 'trial' | 'release' | undefined} & wegame-api.wx.types.Callbacks */
@js.native
trait appIdstringpathstringunde extends StObject {
  
  /**
    * 要打开的小程序 appId
    */
  var appId: String = js.native
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 要打开的小程序版本。仅在当前小程序为开发版或体验版时此参数有效。如果当前小程序是正式版，则打开的小程序必定是正式版。默认值release
    * develop    开发版
    * trial    体验版
    * release    正式版
    */
  var envVersion: js.UndefOr[develop | trial | release] = js.native
  
  /**
    * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch，App.onShow 中获取到这份数据。如果跳转的是小游戏，可以在 wx.onShow、wx.getLaunchOptionsSync 中可以获取到这份数据数据。
    */
  var extraData: js.UndefOr[js.Any] = js.native
  
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 打开的页面路径，如果为空则打开首页。path 中 ? 后面的部分会成为 query，在小程序的 App.onLaunch、App.onShow
    * 和 Page.onLoad 的回调函数或小游戏的 wx.onShow 回调函数、wx.getLaunchOptionsSync 中可以获取到 query 数据。
    * 对于小游戏，可以只传入 query 部分，来实现传参效果，如：传入 "?foo=bar"。
    */
  var path: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object appIdstringpathstringunde {
  
  @scala.inline
  def apply(appId: String): appIdstringpathstringunde = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[appIdstringpathstringunde]
  }
  
  @scala.inline
  implicit class appIdstringpathstringundeMutableBuilder[Self <: appIdstringpathstringunde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEnvVersion(value: develop | trial | release): Self = StObject.set(x, "envVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvVersionUndefined: Self = StObject.set(x, "envVersion", js.undefined)
    
    @scala.inline
    def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
