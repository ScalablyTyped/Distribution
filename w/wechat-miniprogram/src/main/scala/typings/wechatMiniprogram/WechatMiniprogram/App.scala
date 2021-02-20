package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ThisType
import typings.wechatMiniprogram.anon.PartialOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  type Constructor = js.Function1[/* options */ Options[IAnyObject], Unit]
  
  type GetApp = js.Function1[/* opts */ js.UndefOr[GetAppOption], Instance[IAnyObject]]
  
  @js.native
  trait GetAppOption extends StObject {
    
    /** 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
      *
      * 最低基础库： 2.2.4
      */
    var allowDefault: js.UndefOr[Boolean] = js.native
  }
  object GetAppOption {
    
    @scala.inline
    def apply(): GetAppOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAppOption]
    }
    
    @scala.inline
    implicit class GetAppOptionMutableBuilder[Self <: GetAppOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDefault(value: Boolean): Self = StObject.set(x, "allowDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDefaultUndefined: Self = StObject.set(x, "allowDefault", js.undefined)
    }
  }
  
  type Instance[T /* <: IAnyObject */] = Option with T
  
  @js.native
  trait LaunchShowOption extends StObject {
    
    /** 打开小程序的路径 */
    var path: String = js.native
    
    /** 打开小程序的query */
    var query: IAnyObject = js.native
    
    /** 当场景为由从另一个小程序或公众号或App打开时，返回此字段 */
    var referrerInfo: js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo] = js.native
    
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
    var scene: SceneValues = js.native
    
    /** shareTicket，详见 [获取更多转发信息]((转发#获取更多转发信息)) */
    var shareTicket: String = js.native
  }
  object LaunchShowOption {
    
    @scala.inline
    def apply(path: String, query: IAnyObject, scene: SceneValues, shareTicket: String): LaunchShowOption = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchShowOption]
    }
    
    @scala.inline
    implicit class LaunchShowOptionMutableBuilder[Self <: LaunchShowOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerInfo(value: typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerInfoUndefined: Self = StObject.set(x, "referrerInfo", js.undefined)
      
      @scala.inline
      def setScene(value: SceneValues): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Option extends StObject {
    
    /** 错误监听函数
      *
      * 小程序发生脚本错误，或者 api
      */
    def onError(/** 错误信息，包含堆栈 */ error: String): Unit = js.native
    
    /** 生命周期回调—监听小程序隐藏
      *
      * 小程序从前台进入后台时
      */
    def onHide(): Unit = js.native
    
    /** 生命周期回调—监听小程序初始化
      *
      * 小程序初始化完成时触发，全局只触发一次。
      */
    def onLaunch(options: LaunchShowOption): Unit = js.native
    
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
    def onPageNotFound(options: PageNotFoundOption): Unit = js.native
    
    /** 生命周期回调—监听小程序显示
      *
      * 小程序启动，或从后台进入前台显示时
      */
    def onShow(options: LaunchShowOption): Unit = js.native
    
    /**
      * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
      *
      * 最低基础库： 2.11.0
      */
    def onThemeChange(result: OnThemeChangeCallbackResult): Unit = js.native
    /**
      * 系统切换主题时触发。也可以使用 wx.onThemeChange 绑定监听。
      *
      * 最低基础库： 2.11.0
      */
    @JSName("onThemeChange")
    var onThemeChange_Original: OnThemeChangeCallback = js.native
    
    /**
      * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
      * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
      */
    def onUnhandledRejection(result: OnUnhandledRejectionCallbackResult): Unit = js.native
    /**
      * 小程序有未处理的 Promise 拒绝时触发。也可以使用 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 绑定监听。注意事项请参考 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html)。
      * **参数**：与 [wx.onUnhandledRejection](https://developers.weixin.qq.com/miniprogram/dev/api/base/app/app-event/wx.onUnhandledRejection.html) 一致
      */
    @JSName("onUnhandledRejection")
    var onUnhandledRejection_Original: OnUnhandledRejectionCallback = js.native
  }
  
  type Options[T /* <: IAnyObject */] = PartialOption with T with ThisType[Instance[T]]
  
  @js.native
  trait PageNotFoundOption extends StObject {
    
    /** 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面） */
    var isEntryPage: Boolean = js.native
    
    /** 不存在页面的路径 */
    var path: String = js.native
    
    /** 打开不存在页面的 query */
    var query: IAnyObject = js.native
  }
  object PageNotFoundOption {
    
    @scala.inline
    def apply(isEntryPage: Boolean, path: String, query: IAnyObject): PageNotFoundOption = {
      val __obj = js.Dynamic.literal(isEntryPage = isEntryPage.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageNotFoundOption]
    }
    
    @scala.inline
    implicit class PageNotFoundOptionMutableBuilder[Self <: PageNotFoundOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsEntryPage(value: Boolean): Self = StObject.set(x, "isEntryPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: IAnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
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
    var appId: String = js.native
    
    /** 来源小程序传过来的数据，scene=1037或1038时支持 */
    var extraData: js.UndefOr[js.Any] = js.native
  }
  object ReferrerInfo {
    
    @scala.inline
    def apply(appId: String): typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo]
    }
    
    @scala.inline
    implicit class ReferrerInfoMutableBuilder[Self <: typings.wechatMiniprogram.WechatMiniprogram.App.ReferrerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1001`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1005`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1006`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1007`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1008`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1011`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1012`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1013`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1014`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1017`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1019`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1020`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1023`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1024`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1025`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1026`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1027`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1028`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1029`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1030`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1031`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1032`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1034`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1035`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1036`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1037`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1038`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1039`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1042`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1043`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1044`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1045`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1046`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1047`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1048`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1049`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1052`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1053`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1056`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1057`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1058`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1059`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1064`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1067`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1069`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1071`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1072`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1073`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1074`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1077`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1078`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1079`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1081`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1082`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1084`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1089`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1090`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1091`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1092`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1095`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1096`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1097`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1099`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1102`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1124`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1125`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1126`
    - typings.wechatMiniprogram.wechatMiniprogramNumbers.`1129`
  */
  trait SceneValues extends StObject
  object SceneValues {
    
    @scala.inline
    def `1001`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1001` = 1001.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1001`]
    
    @scala.inline
    def `1005`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1005` = 1005.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1005`]
    
    @scala.inline
    def `1006`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1006` = 1006.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1006`]
    
    @scala.inline
    def `1007`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1007` = 1007.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1007`]
    
    @scala.inline
    def `1008`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1008` = 1008.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1008`]
    
    @scala.inline
    def `1011`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1011` = 1011.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1011`]
    
    @scala.inline
    def `1012`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1012` = 1012.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1012`]
    
    @scala.inline
    def `1013`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1013` = 1013.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1013`]
    
    @scala.inline
    def `1014`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1014` = 1014.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1014`]
    
    @scala.inline
    def `1017`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1017` = 1017.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1017`]
    
    @scala.inline
    def `1019`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1019` = 1019.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1019`]
    
    @scala.inline
    def `1020`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1020` = 1020.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1020`]
    
    @scala.inline
    def `1023`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1023` = 1023.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1023`]
    
    @scala.inline
    def `1024`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1024` = 1024.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1024`]
    
    @scala.inline
    def `1025`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1025` = 1025.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1025`]
    
    @scala.inline
    def `1026`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1026` = 1026.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1026`]
    
    @scala.inline
    def `1027`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1027` = 1027.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1027`]
    
    @scala.inline
    def `1028`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1028` = 1028.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1028`]
    
    @scala.inline
    def `1029`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1029` = 1029.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1029`]
    
    @scala.inline
    def `1030`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1030` = 1030.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1030`]
    
    @scala.inline
    def `1031`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1031` = 1031.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1031`]
    
    @scala.inline
    def `1032`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1032` = 1032.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1032`]
    
    @scala.inline
    def `1034`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1034` = 1034.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1034`]
    
    @scala.inline
    def `1035`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1035` = 1035.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1035`]
    
    @scala.inline
    def `1036`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1036` = 1036.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1036`]
    
    @scala.inline
    def `1037`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1037` = 1037.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1037`]
    
    @scala.inline
    def `1038`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1038` = 1038.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1038`]
    
    @scala.inline
    def `1039`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1039` = 1039.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1039`]
    
    @scala.inline
    def `1042`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1042` = 1042.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1042`]
    
    @scala.inline
    def `1043`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1043` = 1043.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1043`]
    
    @scala.inline
    def `1044`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1044` = 1044.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1044`]
    
    @scala.inline
    def `1045`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1045` = 1045.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1045`]
    
    @scala.inline
    def `1046`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1046` = 1046.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1046`]
    
    @scala.inline
    def `1047`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1047` = 1047.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1047`]
    
    @scala.inline
    def `1048`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1048` = 1048.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1048`]
    
    @scala.inline
    def `1049`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1049` = 1049.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1049`]
    
    @scala.inline
    def `1052`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1052` = 1052.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1052`]
    
    @scala.inline
    def `1053`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1053` = 1053.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1053`]
    
    @scala.inline
    def `1056`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1056` = 1056.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1056`]
    
    @scala.inline
    def `1057`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1057` = 1057.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1057`]
    
    @scala.inline
    def `1058`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1058` = 1058.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1058`]
    
    @scala.inline
    def `1059`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1059` = 1059.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1059`]
    
    @scala.inline
    def `1064`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1064` = 1064.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1064`]
    
    @scala.inline
    def `1067`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1067` = 1067.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1067`]
    
    @scala.inline
    def `1069`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1069` = 1069.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1069`]
    
    @scala.inline
    def `1071`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1071` = 1071.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1071`]
    
    @scala.inline
    def `1072`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1072` = 1072.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1072`]
    
    @scala.inline
    def `1073`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1073` = 1073.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1073`]
    
    @scala.inline
    def `1074`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1074` = 1074.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1074`]
    
    @scala.inline
    def `1077`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1077` = 1077.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1077`]
    
    @scala.inline
    def `1078`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1078` = 1078.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1078`]
    
    @scala.inline
    def `1079`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1079` = 1079.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1079`]
    
    @scala.inline
    def `1081`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1081` = 1081.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1081`]
    
    @scala.inline
    def `1082`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1082` = 1082.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1082`]
    
    @scala.inline
    def `1084`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1084` = 1084.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1084`]
    
    @scala.inline
    def `1089`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1089` = 1089.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1089`]
    
    @scala.inline
    def `1090`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1090` = 1090.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1090`]
    
    @scala.inline
    def `1091`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1091` = 1091.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1091`]
    
    @scala.inline
    def `1092`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1092` = 1092.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1092`]
    
    @scala.inline
    def `1095`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1095` = 1095.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1095`]
    
    @scala.inline
    def `1096`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1096` = 1096.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1096`]
    
    @scala.inline
    def `1097`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1097` = 1097.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1097`]
    
    @scala.inline
    def `1099`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1099` = 1099.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1099`]
    
    @scala.inline
    def `1102`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1102` = 1102.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1102`]
    
    @scala.inline
    def `1124`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1124` = 1124.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1124`]
    
    @scala.inline
    def `1125`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1125` = 1125.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1125`]
    
    @scala.inline
    def `1126`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1126` = 1126.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1126`]
    
    @scala.inline
    def `1129`: typings.wechatMiniprogram.wechatMiniprogramNumbers.`1129` = 1129.asInstanceOf[typings.wechatMiniprogram.wechatMiniprogramNumbers.`1129`]
  }
  
  type TrivialInstance = Instance[IAnyObject]
}
