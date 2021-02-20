package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  type AppConstructor = js.Function1[
    /* options */ (AppInstance[AnyObject with AppInstance[js.Object]]) with AnyObject with AppInstance[js.Object], 
    Unit
  ]
  
  @js.native
  trait AppInstance[T /* <: AnyObject */] extends StObject {
    
    /**
      * 全局对象
      */
    var globalData: js.UndefOr[AnyObject] = js.native
    
    /**
      * 错误监听函数
      * 小程序发生脚本错误或 API 调用报错时触发
      * @param error 错误信息，包含堆栈
      */
    var onError: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
    
    /**
      * 生命周期回调 监听应用隐藏
      *
      * 应用从前台进入后台时触发
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 生命周期回调 监听应用初始化
      *
      * 应用初始化完成时触发，全局只触发一次。
      */
    var onLaunch: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.native
    
    /**
      * 页面不存在监听函数
      *
      * 应用要打开的页面不存在时触发，会带上页面信息回调该函数
      *
      * **注意：**
      * 1. 如果开发者没有添加 `onPageNotFound` 监听，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
      * 2. 如果 `onPageNotFound` 回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再回调 `onPageNotFound`。
      */
    var onPageNotFound: js.UndefOr[js.Function1[/* options */ PageNotFoundOption, Unit]] = js.native
    
    /**
      * 生命周期回调 监听应用显示
      *
      * 应用启动，或从后台进入前台显示时触发
      */
    var onShow: js.UndefOr[js.Function1[/* options */ js.UndefOr[LaunchShowOption], Unit]] = js.native
    
    /**
      * 监听 nvue 页面消息
      *
      * nvue 页面使用 `uni.postMessage` 发送消息时触发
      */
    var onUniNViewMessage: js.UndefOr[js.Function1[/* options */ AnyObject, Unit]] = js.native
  }
  object AppInstance {
    
    @scala.inline
    def apply[T /* <: AnyObject */](): AppInstance[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppInstance[T]]
    }
    
    @scala.inline
    implicit class AppInstanceMutableBuilder[Self <: AppInstance[_], T /* <: AnyObject */] (val x: Self with AppInstance[T]) extends AnyVal {
      
      @scala.inline
      def setGlobalData(value: AnyObject): Self = StObject.set(x, "globalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalDataUndefined: Self = StObject.set(x, "globalData", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnLaunch(value: /* options */ js.UndefOr[LaunchShowOption] => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
      
      @scala.inline
      def setOnPageNotFound(value: /* options */ PageNotFoundOption => Unit): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageNotFoundUndefined: Self = StObject.set(x, "onPageNotFound", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* options */ js.UndefOr[LaunchShowOption] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnUniNViewMessage(value: /* options */ AnyObject => Unit): Self = StObject.set(x, "onUniNViewMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUniNViewMessageUndefined: Self = StObject.set(x, "onUniNViewMessage", js.undefined)
    }
  }
  
  type GetApp = js.Function1[/* opts */ js.UndefOr[GetAppOption], AppInstance[AnyObject] with AnyObject]
  
  @js.native
  trait GetAppOption extends StObject {
    
    /**
      * 在 `App` 未定义时返回默认实现。当App被调用时，默认实现中定义的属性会被覆盖合并到App中。一般用于独立分包
      */
    var allowDefault: Boolean = js.native
  }
  object GetAppOption {
    
    @scala.inline
    def apply(allowDefault: Boolean): GetAppOption = {
      val __obj = js.Dynamic.literal(allowDefault = allowDefault.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAppOption]
    }
    
    @scala.inline
    implicit class GetAppOptionMutableBuilder[Self <: GetAppOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDefault(value: Boolean): Self = StObject.set(x, "allowDefault", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LaunchShowOption extends StObject {
    
    /**
      * 打开小程序的路径
      */
    var path: String = js.native
    
    /**
      * 打开小程序的query
      */
    var query: AnyObject = js.native
    
    /**
      * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
      */
    var referrerInfo: js.UndefOr[ReferrerInfo] = js.native
    
    /**
      * 打开小程序的场景值
      * - 1001: 发现栏小程序主入口，「最近使用」列表（基础库2.2.4版本起包含「我的小程序」列表）
      * - 1005: 顶部搜索框的搜索结果页
      * - 1006: 发现栏小程序主入口搜索框的搜索结果页
      * - 1007: 单人聊天会话中的小程序消息卡片
      * - 1008: 群聊会话中的小程序消息卡片
      * - 1011: 扫描二维码
      * - 1012: 长按图片识别二维码
      * - 1013: 手机相册选取二维码
      * - 1014: 小程序模板消息
      * - 1017: 前往体验版的入口页
      * - 1019: 微信钱包
      * - 1020: 公众号 profile 页相关小程序列表
      * - 1022: 聊天顶部置顶小程序入口
      * - 1023: 安卓系统桌面图标
      * - 1024: 小程序 profile 页
      * - 1025: 扫描一维码
      * - 1026: 附近小程序列表
      * - 1027: 顶部搜索框搜索结果页「使用过的小程序」列表
      * - 1028: 我的卡包
      * - 1029: 卡券详情页
      * - 1030: 自动化测试下打开小程序
      * - 1031: 长按图片识别一维码
      * - 1032: 手机相册选取一维码
      * - 1034: 微信支付完成页
      * - 1035: 公众号自定义菜单
      * - 1036: App 分享消息卡片
      * - 1037: 小程序打开小程序
      * - 1038: 从另一个小程序返回
      * - 1039: 摇电视
      * - 1042: 添加好友搜索框的搜索结果页
      * - 1043: 公众号模板消息
      * - 1044: 带 shareTicket 的小程序消息卡片
      * - 1045: 朋友圈广告
      * - 1046: 朋友圈广告详情页
      * - 1047: 扫描小程序码
      * - 1048: 长按图片识别小程序码
      * - 1049: 手机相册选取小程序码
      * - 1052: 卡券的适用门店列表
      * - 1053: 搜一搜的结果页
      * - 1054: 顶部搜索框小程序快捷入口
      * - 1056: 音乐播放器菜单
      * - 1057: 钱包中的银行卡详情页
      * - 1058: 公众号文章
      * - 1059: 体验版小程序绑定邀请页
      * - 1064: 微信连Wi-Fi状态栏
      * - 1067: 公众号文章广告
      * - 1068: 附近小程序列表广告
      * - 1069: 移动应用
      * - 1071: 钱包中的银行卡列表页
      * - 1072: 二维码收款页面
      * - 1073: 客服消息列表下发的小程序消息卡片
      * - 1074: 公众号会话下发的小程序消息卡片
      * - 1077: 摇周边
      * - 1078: 连Wi-Fi成功页
      * - 1079: 微信游戏中心
      * - 1081: 客服消息下发的文字链
      * - 1082: 公众号会话下发的文字链
      * - 1084: 朋友圈广告原生页
      * - 1089: 微信聊天主界面下拉，「最近使用」栏（基础库2.2.4版本起包含「我的小程序」栏）
      * - 1090: 长按小程序右上角菜单唤出最近使用历史
      * - 1091: 公众号文章商品卡片
      * - 1092: 城市服务入口
      * - 1095: 小程序广告组件
      * - 1096: 聊天记录
      * - 1097: 微信支付签约页
      * - 1099: 页面内嵌插件
      * - 1102: 公众号 profile 页服务预览
      * - 1103: 发现栏小程序主入口，「我的小程序」列表（基础库2.2.4版本起废弃）
      * - 1104: 微信聊天主界面下拉，「我的小程序」栏（基础库2.2.4版本起废弃）
      */
    var scene: Double = js.native
    
    /**
      * 打开小程序的场景值
      */
    var shareTicket: String = js.native
  }
  object LaunchShowOption {
    
    @scala.inline
    def apply(path: String, query: AnyObject, scene: Double, shareTicket: String): LaunchShowOption = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchShowOption]
    }
    
    @scala.inline
    implicit class LaunchShowOptionMutableBuilder[Self <: LaunchShowOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: AnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerInfo(value: ReferrerInfo): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerInfoUndefined: Self = StObject.set(x, "referrerInfo", js.undefined)
      
      @scala.inline
      def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PageNotFoundOption extends StObject {
    
    /**
      * 是否本次启动的首个页面（例如从分享等入口进来，首个页面是开发者配置的分享页面）
      */
    var isEntryPage: Boolean = js.native
    
    /**
      * 不存在页面的路径
      */
    var path: String = js.native
    
    /**
      * 打开不存在页面的 query
      */
    var query: AnyObject = js.native
  }
  object PageNotFoundOption {
    
    @scala.inline
    def apply(isEntryPage: Boolean, path: String, query: AnyObject): PageNotFoundOption = {
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
      def setQuery(value: AnyObject): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReferrerInfo extends StObject {
    
    /**
      * 来源小程序或公众号或App的 appId
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
    
    /**
      * 来源小程序传过来的数据，scene=1037或1038时支持
      */
    var extraData: js.UndefOr[js.Any] = js.native
  }
  object ReferrerInfo {
    
    @scala.inline
    def apply(appId: String): ReferrerInfo = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferrerInfo]
    }
    
    @scala.inline
    implicit class ReferrerInfoMutableBuilder[Self <: ReferrerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraData(value: js.Any): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraDataUndefined: Self = StObject.set(x, "extraData", js.undefined)
    }
  }
}
