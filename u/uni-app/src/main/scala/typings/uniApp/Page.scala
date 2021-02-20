package typings.uniApp

import typings.uniApp.uniAppStrings.backbutton
import typings.uniApp.uniAppStrings.button
import typings.uniApp.uniAppStrings.menu
import typings.uniApp.uniAppStrings.navigateBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @js.native
  trait BackPressOption extends StObject {
    
    /**
      * - backbutton 顶部导航栏左边的返回按钮或 Android 实体返回键
      * - navigateBack 返回 API，即 uni.navigateBack()
      */
    var from: backbutton | navigateBack = js.native
  }
  object BackPressOption {
    
    @scala.inline
    def apply(from: backbutton | navigateBack): BackPressOption = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackPressOption]
    }
    
    @scala.inline
    implicit class BackPressOptionMutableBuilder[Self <: BackPressOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: backbutton | navigateBack): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomShareContent extends StObject {
    
    /**
      * 自定义图片路径，可以是本地文件路径、代码包文件路径或者网络图片路径。支持PNG及JPG。显示图片长宽比是 5:4，默认值：使用默认截图
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /**
      * 转发路径，必须是以 / 开头的完整路径。默认值：当前页面 path
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * 转发标题。默认值：当前应用名称
      */
    var title: js.UndefOr[String] = js.native
  }
  object CustomShareContent {
    
    @scala.inline
    def apply(): CustomShareContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomShareContent]
    }
    
    @scala.inline
    implicit class CustomShareContentMutableBuilder[Self <: CustomShareContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type GetCurrentPages = js.Function0[js.Array[(PageInstance[AnyObject, js.Object]) with js.Object]]
  
  @js.native
  trait NavigationBarButtonTapOption extends StObject {
    
    /**
      * 原生标题栏按钮数组的下标
      */
    var index: String = js.native
  }
  object NavigationBarButtonTapOption {
    
    @scala.inline
    def apply(index: String): NavigationBarButtonTapOption = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBarButtonTapOption]
    }
    
    @scala.inline
    implicit class NavigationBarButtonTapOptionMutableBuilder[Self <: NavigationBarButtonTapOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NavigationBarSearchInputEvent extends StObject {
    
    /**
      * 搜索输入框输入内容
      */
    var text: String = js.native
  }
  object NavigationBarSearchInputEvent {
    
    @scala.inline
    def apply(text: String): NavigationBarSearchInputEvent = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationBarSearchInputEvent]
    }
    
    @scala.inline
    implicit class NavigationBarSearchInputEventMutableBuilder[Self <: NavigationBarSearchInputEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type PageConstructor = js.Function1[
    /* options */ (PageInstance[AnyObject, AnyObject with (PageInstance[_, _])]) with AnyObject with (PageInstance[_, _]), 
    Unit
  ]
  
  @js.native
  trait PageInstance[D /* <: AnyObject */, T /* <: AnyObject */] extends PageInstanceBaseProps[D] {
    
    /**
      * 监听页面返回
      * @param options tab 点击参数
      * @return 返回 `true` 时阻止页面返回
      */
    var onBackPress: js.UndefOr[js.Function1[/* options */ BackPressOption, _]] = js.native
    
    /**
      * 生命周期回调 监听页面隐藏
      *
      * 页面隐藏/切入后台时触发。 如 `navigateTo` 或底部 `tab` 切换到其他页面，应用切入后台等。
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 生命周期回调 监听页面加载
      *
      * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
      * @param query 打开当前页面路径中的参数
      */
    var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[AnyObject], Unit]] = js.native
    
    /**
      * 监听原生标题栏按钮点击事件
      * @param options tab 点击参数
      */
    var onNavigationBarButtonTap: js.UndefOr[js.Function1[/* options */ NavigationBarButtonTapOption, Unit]] = js.native
    
    /**
      * 监听原生标题栏搜索输入框输入内容变化事件
      */
    var onNavigationBarSearchInputChanged: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.native
    
    /**
      * 监听原生标题栏搜索输入框点击事件
      */
    var onNavigationBarSearchInputClicked: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 监听原生标题栏搜索输入框搜索事件，用户点击软键盘上的“搜索”按钮时触发。
      */
    var onNavigationBarSearchInputConfirmed: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.native
    
    /**
      * 页面滚动触发事件的处理函数
      *
      * 监听用户滑动页面事件。
      * @param options 页面滚动参数
      */
    var onPageScroll: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.native
    
    /**
      * 监听用户下拉动作
      * - 需要在 `pages.json` 的页面配置中开启 `enablePullDownRefresh` 。
      * - 可以通过 `uni.startPullDownRefresh` 触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
      * - 当处理完数据刷新后，`uni.stopPullDownRefresh` 可以停止当前页面的下拉刷新。
      */
    var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 页面上拉触底事件的处理函数
      * - 可以在 `pages.json` 的页面配置中设置触发距离 `onReachBottomDistance` 。
      * - 在触发距离内滑动期间，本事件只会被触发一次。
      */
    var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 生命周期回调 监听页面初次渲染完成
      *
      * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
      */
    var onReady: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 页面尺寸改变时触发
      * @param options 页面滚动参数
      */
    var onResize: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.native
    
    /**
      * 用户点击右上角转发
      *
      * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
      * @param options 分享发起来源参数
      * @return 转发内容
      */
    var onShareAppMessage: js.UndefOr[js.Function1[/* options */ ShareAppMessageOption, CustomShareContent]] = js.native
    
    /**
      * 生命周期回调 监听页面显示
      *
      * 页面显示/切入前台时触发。
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * 当前是 tab 页时，点击 tab 时触发
      * @param options tab 点击参数
      */
    var onTabItemTap: js.UndefOr[js.Function1[/* options */ TabItemTapOption, Unit]] = js.native
    
    /**
      * 生命周期回调 监听页面卸载
      *
      * 页面卸载时触发。如 `redirectTo` 或 `navigateBack` 到其他页面时。
      */
    var onUnload: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PageInstance {
    
    @scala.inline
    def apply[D /* <: AnyObject */, T /* <: AnyObject */](): PageInstance[D, T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageInstance[D, T]]
    }
    
    @scala.inline
    implicit class PageInstanceMutableBuilder[Self <: PageInstance[_, _], D /* <: AnyObject */, T /* <: AnyObject */] (val x: Self with (PageInstance[D, T])) extends AnyVal {
      
      @scala.inline
      def setOnBackPress(value: /* options */ BackPressOption => _): Self = StObject.set(x, "onBackPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackPressUndefined: Self = StObject.set(x, "onBackPress", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnLoad(value: /* query */ js.UndefOr[AnyObject] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnNavigationBarButtonTap(value: /* options */ NavigationBarButtonTapOption => Unit): Self = StObject.set(x, "onNavigationBarButtonTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNavigationBarButtonTapUndefined: Self = StObject.set(x, "onNavigationBarButtonTap", js.undefined)
      
      @scala.inline
      def setOnNavigationBarSearchInputChanged(value: /* event */ NavigationBarSearchInputEvent => Unit): Self = StObject.set(x, "onNavigationBarSearchInputChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNavigationBarSearchInputChangedUndefined: Self = StObject.set(x, "onNavigationBarSearchInputChanged", js.undefined)
      
      @scala.inline
      def setOnNavigationBarSearchInputClicked(value: () => Unit): Self = StObject.set(x, "onNavigationBarSearchInputClicked", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnNavigationBarSearchInputClickedUndefined: Self = StObject.set(x, "onNavigationBarSearchInputClicked", js.undefined)
      
      @scala.inline
      def setOnNavigationBarSearchInputConfirmed(value: /* event */ NavigationBarSearchInputEvent => Unit): Self = StObject.set(x, "onNavigationBarSearchInputConfirmed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNavigationBarSearchInputConfirmedUndefined: Self = StObject.set(x, "onNavigationBarSearchInputConfirmed", js.undefined)
      
      @scala.inline
      def setOnPageScroll(value: /* options */ PageScrollOption => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      @scala.inline
      def setOnPullDownRefresh(value: () => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      @scala.inline
      def setOnReachBottom(value: () => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      @scala.inline
      def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* options */ PageScrollOption => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnShareAppMessage(value: /* options */ ShareAppMessageOption => CustomShareContent): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnTabItemTap(value: /* options */ TabItemTapOption => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
      
      @scala.inline
      def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
    }
  }
  
  @js.native
  trait PageInstanceBaseProps[D /* <: AnyObject */] extends StObject {
    
    /**
      * 到当前页面的路径，类型为 `String`
      */
    var route: js.UndefOr[String] = js.native
  }
  object PageInstanceBaseProps {
    
    @scala.inline
    def apply[D /* <: AnyObject */](): PageInstanceBaseProps[D] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageInstanceBaseProps[D]]
    }
    
    @scala.inline
    implicit class PageInstanceBasePropsMutableBuilder[Self <: PageInstanceBaseProps[_], D /* <: AnyObject */] (val x: Self with PageInstanceBaseProps[D]) extends AnyVal {
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    }
  }
  
  @js.native
  trait PageScrollOption extends StObject {
    
    /**
      * 页面在垂直方向已滚动的距离（单位 px）
      */
    var scrollTop: Double = js.native
  }
  object PageScrollOption {
    
    @scala.inline
    def apply(scrollTop: Double): PageScrollOption = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageScrollOption]
    }
    
    @scala.inline
    implicit class PageScrollOptionMutableBuilder[Self <: PageScrollOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShareAppMessageOption extends StObject {
    
    /**
      * 转发事件来源。
      * 可选值：
      * - `button`：页面内转发按钮；
      * - `menu`：右上角转发菜单。
      */
    var from: button | menu = js.native
    
    /**
      * 如果 `from` 值是 `button`，则 `target` 是触发这次转发事件的 `button`，否则为 `undefined`
      */
    var target: js.Any = js.native
    
    /**
      * 页面中包含 `<web-view>` 组件时，返回当前 `<web-view>` 的url
      */
    var webViewUrl: js.UndefOr[String] = js.native
  }
  object ShareAppMessageOption {
    
    @scala.inline
    def apply(from: button | menu, target: js.Any): ShareAppMessageOption = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareAppMessageOption]
    }
    
    @scala.inline
    implicit class ShareAppMessageOptionMutableBuilder[Self <: ShareAppMessageOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: button | menu): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebViewUrl(value: String): Self = StObject.set(x, "webViewUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebViewUrlUndefined: Self = StObject.set(x, "webViewUrl", js.undefined)
    }
  }
  
  @js.native
  trait TabItemTapOption extends StObject {
    
    /**
      * 被点击 tabItem 的序号，从0开始
      */
    var index: String = js.native
    
    /**
      * 被点击 tabItem 的页面路径
      */
    var pagePath: String = js.native
    
    /**
      * 被点击 tabItem 的按钮文字
      */
    var text: String = js.native
  }
  object TabItemTapOption {
    
    @scala.inline
    def apply(index: String, pagePath: String, text: String): TabItemTapOption = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], pagePath = pagePath.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabItemTapOption]
    }
    
    @scala.inline
    implicit class TabItemTapOptionMutableBuilder[Self <: TabItemTapOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagePath(value: String): Self = StObject.set(x, "pagePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
