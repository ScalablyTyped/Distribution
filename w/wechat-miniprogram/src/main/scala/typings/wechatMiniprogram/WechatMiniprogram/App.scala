package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ThisType
import typings.wechatMiniprogram.anon.PartialOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  type Constructor = js.Function1[/* options */ Options[IAnyObject], Unit]
  
  type GetApp = js.Function1[/* opts */ js.UndefOr[GetAppOption], Instance[IAnyObject]]
  
  trait GetAppOption extends StObject {
    
    /** 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
      *
      * 最低基础库： 2.2.4
      */
    var allowDefault: js.UndefOr[Boolean] = js.undefined
  }
  object GetAppOption {
    
    inline def apply(): GetAppOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAppOption]
    }
    
    extension [Self <: GetAppOption](x: Self) {
      
      inline def setAllowDefault(value: Boolean): Self = StObject.set(x, "allowDefault", value.asInstanceOf[js.Any])
      
      inline def setAllowDefaultUndefined: Self = StObject.set(x, "allowDefault", js.undefined)
    }
  }
  
  type Instance[T /* <: IAnyObject */] = Option & T
  
  trait LaunchShowOption extends StObject {
    
    /** 打开小程序的路径 */
    var path: String
    
    /** 打开小程序的query */
    var query: IAnyObject
    
    /** 当场景为由从另一个小程序或公众号或App打开时，返回此字段 */
    var referrerInfo: js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo] = js.undefined
    
    /** 打开小程序的场景值
      * - 1001：发现栏小程序主入口，「最近使用」列表（基础库2.2.4版本起包含「我的小程序」列表）
      * - 1005：微信首页顶部搜索框的搜索结果页
      * - 1006：发现栏小程序主入口搜索框的搜索结果页
      * - 1007：单人聊天会话中的小程序消息卡片
      * - 1008：群聊会话中的小程序消息卡片
      * - 1011：扫描二维码
      * - 1012：长按图片识别二维码
      * - 1013：扫描手机相册中选取的二维码
      * - 1014：小程序模板消息
      * - 1017：前往小程序体验版的入口页
      * - 1019：微信钱包（微信客户端7.0.0版本改为支付入口）
      * - 1020：公众号 profile 页相关小程序列表
      * - 1023：安卓系统桌面图标
      * - 1024：小程序 profile 页
      * - 1025：扫描一维码
      * - 1026：发现栏小程序主入口，「附近的小程序」列表
      * - 1027：微信首页顶部搜索框搜索结果页「使用过的小程序」列表
      * - 1028：我的卡包
      * - 1029：小程序中的卡券详情页
      * - 1030：自动化测试下打开小程序
      * - 1031：长按图片识别一维码
      * - 1032：扫描手机相册中选取的一维码
      * - 1034：微信支付完成页
      * - 1035：公众号自定义菜单
      * - 1036：App 分享消息卡片
      * - 1037：小程序打开小程序
      * - 1038：从另一个小程序返回
      * - 1039：摇电视
      * - 1042：添加好友搜索框的搜索结果页
      * - 1043：公众号模板消息
      * - 1044：带 shareTicket 的小程序消息卡片 [详情](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html)
      * - 1045：朋友圈广告
      * - 1046：朋友圈广告详情页
      * - 1047：扫描小程序码
      * - 1048：长按图片识别小程序码
      * - 1049：扫描手机相册中选取的小程序码
      * - 1052：卡券的适用门店列表
      * - 1053：搜一搜的结果页
      * - 1056：聊天顶部音乐播放器右上角菜单
      * - 1057：钱包中的银行卡详情页
      * - 1058：公众号文章
      * - 1059：体验版小程序绑定邀请页
      * - 1064：微信首页连Wi-Fi状态栏
      * - 1067：公众号文章广告
      * - 1069：移动应用
      * - 1071：钱包中的银行卡列表页
      * - 1072：二维码收款页面
      * - 1073：客服消息列表下发的小程序消息卡片
      * - 1074：公众号会话下发的小程序消息卡片
      * - 1077：摇周边
      * - 1078：微信连Wi-Fi成功提示页
      * - 1079：微信游戏中心
      * - 1081：客服消息下发的文字链
      * - 1082：公众号会话下发的文字链
      * - 1084：朋友圈广告原生页
      * - 1089：微信聊天主界面下拉，「最近使用」栏（基础库2.2.4版本起包含「我的小程序」栏）
      * - 1090：长按小程序右上角菜单唤出最近使用历史
      * - 1091：公众号文章商品卡片
      * - 1092：城市服务入口
      * - 1095：小程序广告组件
      * - 1096：聊天记录
      * - 1097：微信支付签约页
      * - 1099：页面内嵌插件
      * - 1102：公众号 profile 页服务预览
      * - 1124：扫“一物一码”打开小程序
      * - 1125：长按图片识别“一物一码”
      * - 1126：扫描手机相册中选取的“一物一码”
      * - 1129：微信爬虫访问 [详情](https://developers.weixin.qq.com/miniprogram/dev/reference/configuration/sitemap.html)
      */
    var scene: SceneValues
    
    /** shareTicket，详见 [获取更多转发信息]((转发#获取更多转发信息)) */
    var shareTicket: String
  }
  object LaunchShowOption {
    
    inline def apply(path: String, query: IAnyObject, scene: SceneValues, shareTicket: String): LaunchShowOption = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchShowOption]
    }
    
    extension [Self <: LaunchShowOption](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReferrerInfo(value: typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
      
      inline def setReferrerInfoUndefined: Self = StObject.set(x, "referrerInfo", js.undefined)
      
      inline def setScene(value: SceneValues): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    }
  }
  
  trait Option extends StObject {
    
    /** 错误监听函数
      *
      * 小程序发生脚本错误，或者 api
      */
    def onError(/** 错误信息，包含堆栈 */ error: String): Unit
    
    /** 生命周期回调—监听小程序隐藏
      *
      * 小程序从前台进入后台时
      */
    def onHide(): Unit
    
    /** 生命周期回调—监听小程序初始化
      *
      * 小程序初始化完成时触发，全局只触发一次。
      */
    def onLaunch(options: LaunchShowOption): Unit
    
    /** 页面不存在监听函数
      *
      * 小程序要打开的页面不存在时触发，会带上页面信息回调该函数
      *
      * **注意：**
      * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
      * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
      *
      * 最低基础库： 1.9.90
      */
    def onPageNotFound(options: PageNotFoundOption): Unit
    
    /** 生命周期回调—监听小程序显示
      *
      * 小程序启动，或从后台进入前台显示时
      */
    def onShow(options: LaunchShowOption): Unit
    
    /**
      * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
      *
      * 最低基础库： 2.11.0
      */
    def onThemeChange(result: OnThemeChangeCallbackResult): Unit
    /**
      * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
      *
      * 最低基础库： 2.11.0
      */
    @JSName("onThemeChange")
    var onThemeChange_Original: OnThemeChangeCallback
    
    /**
      * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
      * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
      */
    def onUnhandledRejection(result: OnUnhandledRejectionCallbackResult): Unit
    /**
      * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
      * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
      */
    @JSName("onUnhandledRejection")
    var onUnhandledRejection_Original: OnUnhandledRejectionCallback
  }
  object Option {
    
    inline def apply(
      onError: String => Unit,
      onHide: () => Unit,
      onLaunch: LaunchShowOption => Unit,
      onPageNotFound: PageNotFoundOption => Unit,
      onShow: LaunchShowOption => Unit,
      onThemeChange: /* result */ OnThemeChangeCallbackResult => Unit,
      onUnhandledRejection: /* result */ OnUnhandledRejectionCallbackResult => Unit
    ): Option = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onHide = js.Any.fromFunction0(onHide), onLaunch = js.Any.fromFunction1(onLaunch), onPageNotFound = js.Any.fromFunction1(onPageNotFound), onShow = js.Any.fromFunction1(onShow), onThemeChange = js.Any.fromFunction1(onThemeChange), onUnhandledRejection = js.Any.fromFunction1(onUnhandledRejection))
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setOnError(value: String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnLaunch(value: LaunchShowOption => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
      
      inline def setOnPageNotFound(value: PageNotFoundOption => Unit): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction1(value))
      
      inline def setOnShow(value: LaunchShowOption => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnThemeChange(value: /* result */ OnThemeChangeCallbackResult => Unit): Self = StObject.set(x, "onThemeChange", js.Any.fromFunction1(value))
      
      inline def setOnUnhandledRejection(value: /* result */ OnUnhandledRejectionCallbackResult => Unit): Self = StObject.set(x, "onUnhandledRejection", js.Any.fromFunction1(value))
    }
  }
  
  type Options[T /* <: IAnyObject */] = PartialOption & T & ThisType[Instance[T]]
  
  trait PageNotFoundOption extends StObject {
    
    /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
    var isEntryPage: Boolean
    
    /** 不存在页面的路径 */
    var path: String
    
    /** 打开不存在页面的 query */
    var query: IAnyObject
  }
  object PageNotFoundOption {
    
    inline def apply(isEntryPage: Boolean, path: String, query: IAnyObject): PageNotFoundOption = {
      val __obj = js.Dynamic.literal(isEntryPage = isEntryPage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageNotFoundOption]
    }
    
    extension [Self <: PageNotFoundOption](x: Self) {
      
      inline def setIsEntryPage(value: Boolean): Self = StObject.set(x, "isEntryPage", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReferrerInfo extends StObject {
    
    /** 来源小程序或公众号或App的 appId
      *
      * 以下场景支持返回 referrerInfo.appId：
      * - 1020（公众号 profile 页相关小程序列表）： appId
      * - 1035（公众号自定义菜单）：来源公众号 appId
      * - 1036（App 分享消息卡片）：来源应用 appId
      * - 1037（小程序打开小程序）：来源小程序 appId
      * - 1038（从另一个小程序返回）：来源小程序 appId
      * - 1043（公众号模板消息）：来源公众号 appId
      */
    var appId: String
    
    /** 来源小程序传过来的数据，scene=1037或1038时支持 */
    var extraData: js.UndefOr[Any] = js.undefined
  }
  object ReferrerInfo {
    
    inline def apply(appId: String): typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo]
    }
    
    extension [Self <: typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo](x: Self) {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setExtraData(value: Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      inline def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1001`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1005`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1006`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1007`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1008`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1011`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1012`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1013`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1014`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1017`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1019`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1020`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1023`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1024`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1025`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1026`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1027`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1028`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1029`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1030`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1031`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1032`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1034`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1035`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1036`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1037`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1038`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1039`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1042`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1043`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1044`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1045`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1046`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1047`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1048`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1049`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1052`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1053`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1056`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1057`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1058`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1059`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1064`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1067`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1069`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1071`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1072`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1073`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1074`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1077`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1078`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1079`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1081`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1082`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1084`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1089`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1090`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1091`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1092`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1095`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1096`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1097`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1099`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1102`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1124`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1125`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1126`
    - typings.wechatMiniprogram.wechatMiniprogramInts.`1129`
  */
  trait SceneValues extends StObject
  object SceneValues {
    
    inline def `1001`: typings.wechatMiniprogram.wechatMiniprogramInts.`1001` = 1001.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1001`]
    
    inline def `1005`: typings.wechatMiniprogram.wechatMiniprogramInts.`1005` = 1005.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1005`]
    
    inline def `1006`: typings.wechatMiniprogram.wechatMiniprogramInts.`1006` = 1006.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1006`]
    
    inline def `1007`: typings.wechatMiniprogram.wechatMiniprogramInts.`1007` = 1007.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1007`]
    
    inline def `1008`: typings.wechatMiniprogram.wechatMiniprogramInts.`1008` = 1008.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1008`]
    
    inline def `1011`: typings.wechatMiniprogram.wechatMiniprogramInts.`1011` = 1011.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1011`]
    
    inline def `1012`: typings.wechatMiniprogram.wechatMiniprogramInts.`1012` = 1012.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1012`]
    
    inline def `1013`: typings.wechatMiniprogram.wechatMiniprogramInts.`1013` = 1013.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1013`]
    
    inline def `1014`: typings.wechatMiniprogram.wechatMiniprogramInts.`1014` = 1014.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1014`]
    
    inline def `1017`: typings.wechatMiniprogram.wechatMiniprogramInts.`1017` = 1017.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1017`]
    
    inline def `1019`: typings.wechatMiniprogram.wechatMiniprogramInts.`1019` = 1019.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1019`]
    
    inline def `1020`: typings.wechatMiniprogram.wechatMiniprogramInts.`1020` = 1020.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1020`]
    
    inline def `1023`: typings.wechatMiniprogram.wechatMiniprogramInts.`1023` = 1023.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1023`]
    
    inline def `1024`: typings.wechatMiniprogram.wechatMiniprogramInts.`1024` = 1024.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1024`]
    
    inline def `1025`: typings.wechatMiniprogram.wechatMiniprogramInts.`1025` = 1025.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1025`]
    
    inline def `1026`: typings.wechatMiniprogram.wechatMiniprogramInts.`1026` = 1026.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1026`]
    
    inline def `1027`: typings.wechatMiniprogram.wechatMiniprogramInts.`1027` = 1027.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1027`]
    
    inline def `1028`: typings.wechatMiniprogram.wechatMiniprogramInts.`1028` = 1028.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1028`]
    
    inline def `1029`: typings.wechatMiniprogram.wechatMiniprogramInts.`1029` = 1029.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1029`]
    
    inline def `1030`: typings.wechatMiniprogram.wechatMiniprogramInts.`1030` = 1030.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1030`]
    
    inline def `1031`: typings.wechatMiniprogram.wechatMiniprogramInts.`1031` = 1031.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1031`]
    
    inline def `1032`: typings.wechatMiniprogram.wechatMiniprogramInts.`1032` = 1032.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1032`]
    
    inline def `1034`: typings.wechatMiniprogram.wechatMiniprogramInts.`1034` = 1034.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1034`]
    
    inline def `1035`: typings.wechatMiniprogram.wechatMiniprogramInts.`1035` = 1035.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1035`]
    
    inline def `1036`: typings.wechatMiniprogram.wechatMiniprogramInts.`1036` = 1036.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1036`]
    
    inline def `1037`: typings.wechatMiniprogram.wechatMiniprogramInts.`1037` = 1037.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1037`]
    
    inline def `1038`: typings.wechatMiniprogram.wechatMiniprogramInts.`1038` = 1038.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1038`]
    
    inline def `1039`: typings.wechatMiniprogram.wechatMiniprogramInts.`1039` = 1039.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1039`]
    
    inline def `1042`: typings.wechatMiniprogram.wechatMiniprogramInts.`1042` = 1042.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1042`]
    
    inline def `1043`: typings.wechatMiniprogram.wechatMiniprogramInts.`1043` = 1043.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1043`]
    
    inline def `1044`: typings.wechatMiniprogram.wechatMiniprogramInts.`1044` = 1044.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1044`]
    
    inline def `1045`: typings.wechatMiniprogram.wechatMiniprogramInts.`1045` = 1045.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1045`]
    
    inline def `1046`: typings.wechatMiniprogram.wechatMiniprogramInts.`1046` = 1046.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1046`]
    
    inline def `1047`: typings.wechatMiniprogram.wechatMiniprogramInts.`1047` = 1047.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1047`]
    
    inline def `1048`: typings.wechatMiniprogram.wechatMiniprogramInts.`1048` = 1048.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1048`]
    
    inline def `1049`: typings.wechatMiniprogram.wechatMiniprogramInts.`1049` = 1049.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1049`]
    
    inline def `1052`: typings.wechatMiniprogram.wechatMiniprogramInts.`1052` = 1052.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1052`]
    
    inline def `1053`: typings.wechatMiniprogram.wechatMiniprogramInts.`1053` = 1053.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1053`]
    
    inline def `1056`: typings.wechatMiniprogram.wechatMiniprogramInts.`1056` = 1056.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1056`]
    
    inline def `1057`: typings.wechatMiniprogram.wechatMiniprogramInts.`1057` = 1057.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1057`]
    
    inline def `1058`: typings.wechatMiniprogram.wechatMiniprogramInts.`1058` = 1058.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1058`]
    
    inline def `1059`: typings.wechatMiniprogram.wechatMiniprogramInts.`1059` = 1059.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1059`]
    
    inline def `1064`: typings.wechatMiniprogram.wechatMiniprogramInts.`1064` = 1064.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1064`]
    
    inline def `1067`: typings.wechatMiniprogram.wechatMiniprogramInts.`1067` = 1067.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1067`]
    
    inline def `1069`: typings.wechatMiniprogram.wechatMiniprogramInts.`1069` = 1069.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1069`]
    
    inline def `1071`: typings.wechatMiniprogram.wechatMiniprogramInts.`1071` = 1071.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1071`]
    
    inline def `1072`: typings.wechatMiniprogram.wechatMiniprogramInts.`1072` = 1072.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1072`]
    
    inline def `1073`: typings.wechatMiniprogram.wechatMiniprogramInts.`1073` = 1073.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1073`]
    
    inline def `1074`: typings.wechatMiniprogram.wechatMiniprogramInts.`1074` = 1074.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1074`]
    
    inline def `1077`: typings.wechatMiniprogram.wechatMiniprogramInts.`1077` = 1077.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1077`]
    
    inline def `1078`: typings.wechatMiniprogram.wechatMiniprogramInts.`1078` = 1078.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1078`]
    
    inline def `1079`: typings.wechatMiniprogram.wechatMiniprogramInts.`1079` = 1079.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1079`]
    
    inline def `1081`: typings.wechatMiniprogram.wechatMiniprogramInts.`1081` = 1081.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1081`]
    
    inline def `1082`: typings.wechatMiniprogram.wechatMiniprogramInts.`1082` = 1082.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1082`]
    
    inline def `1084`: typings.wechatMiniprogram.wechatMiniprogramInts.`1084` = 1084.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1084`]
    
    inline def `1089`: typings.wechatMiniprogram.wechatMiniprogramInts.`1089` = 1089.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1089`]
    
    inline def `1090`: typings.wechatMiniprogram.wechatMiniprogramInts.`1090` = 1090.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1090`]
    
    inline def `1091`: typings.wechatMiniprogram.wechatMiniprogramInts.`1091` = 1091.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1091`]
    
    inline def `1092`: typings.wechatMiniprogram.wechatMiniprogramInts.`1092` = 1092.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1092`]
    
    inline def `1095`: typings.wechatMiniprogram.wechatMiniprogramInts.`1095` = 1095.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1095`]
    
    inline def `1096`: typings.wechatMiniprogram.wechatMiniprogramInts.`1096` = 1096.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1096`]
    
    inline def `1097`: typings.wechatMiniprogram.wechatMiniprogramInts.`1097` = 1097.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1097`]
    
    inline def `1099`: typings.wechatMiniprogram.wechatMiniprogramInts.`1099` = 1099.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1099`]
    
    inline def `1102`: typings.wechatMiniprogram.wechatMiniprogramInts.`1102` = 1102.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1102`]
    
    inline def `1124`: typings.wechatMiniprogram.wechatMiniprogramInts.`1124` = 1124.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1124`]
    
    inline def `1125`: typings.wechatMiniprogram.wechatMiniprogramInts.`1125` = 1125.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1125`]
    
    inline def `1126`: typings.wechatMiniprogram.wechatMiniprogramInts.`1126` = 1126.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1126`]
    
    inline def `1129`: typings.wechatMiniprogram.wechatMiniprogramInts.`1129` = 1129.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramInts.`1129`]
  }
  
  type TrivialInstance = Instance[IAnyObject]
}
