package typings.uniApp

import typings.uniApp.App.AppInstance
import typings.uniApp.Page.BackPressOption
import typings.uniApp.Page.CustomShareContent
import typings.uniApp.Page.NavigationBarButtonTapOption
import typings.uniApp.Page.NavigationBarSearchInputEvent
import typings.uniApp.Page.PageInstanceBaseProps
import typings.uniApp.Page.PageScrollOption
import typings.uniApp.Page.ShareAppMessageOption
import typings.uniApp.Page.TabItemTapOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ComponentOptions[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */]
    extends StObject
       with Hooks {
    
    /**
      * 组件类型
      */
    var mpType: js.UndefOr[String] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    extension [Self <: ComponentOptions[?], V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](x: Self & ComponentOptions[V]) {
      
      inline def setMpType(value: String): Self = StObject.set(x, "mpType", value.asInstanceOf[js.Any])
      
      inline def setMpTypeUndefined: Self = StObject.set(x, "mpType", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.uniApp.Page.PageInstance because var conflicts: onHide, onShow. Inlined onLoad, onReady, onUnload, onPullDownRefresh, onReachBottom, onShareAppMessage, onPageScroll, onResize, onTabItemTap, onNavigationBarButtonTap, onBackPress, onNavigationBarSearchInputChanged, onNavigationBarSearchInputConfirmed, onNavigationBarSearchInputClicked */ trait Hooks
    extends StObject
       with AppInstance[js.Object]
       with PageInstanceBaseProps[Any] {
    
    /**
      * 监听页面返回
      * @param options tab 点击参数
      * @return 返回 `true` 时阻止页面返回
      */
    var onBackPress: js.UndefOr[js.Function1[/* options */ BackPressOption, Any]] = js.undefined
    
    /**
      * 生命周期回调 监听页面加载
      *
      * 页面加载时触发。一个页面只会调用一次，可以在 onLoad 的参数中获取打开当前页面路径中的参数。
      * @param query 打开当前页面路径中的参数
      */
    var onLoad: js.UndefOr[js.Function1[/* query */ js.UndefOr[AnyObject], Unit]] = js.undefined
    
    /**
      * 监听原生标题栏按钮点击事件
      * @param options tab 点击参数
      */
    var onNavigationBarButtonTap: js.UndefOr[js.Function1[/* options */ NavigationBarButtonTapOption, Unit]] = js.undefined
    
    /**
      * 监听原生标题栏搜索输入框输入内容变化事件
      */
    var onNavigationBarSearchInputChanged: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.undefined
    
    /**
      * 监听原生标题栏搜索输入框点击事件
      */
    var onNavigationBarSearchInputClicked: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 监听原生标题栏搜索输入框搜索事件，用户点击软键盘上的“搜索”按钮时触发。
      */
    var onNavigationBarSearchInputConfirmed: js.UndefOr[js.Function1[/* event */ NavigationBarSearchInputEvent, Unit]] = js.undefined
    
    /**
      * 页面滚动触发事件的处理函数
      *
      * 监听用户滑动页面事件。
      * @param options 页面滚动参数
      */
    var onPageScroll: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.undefined
    
    /**
      * 监听用户下拉动作
      * - 需要在 `pages.json` 的页面配置中开启 `enablePullDownRefresh` 。
      * - 可以通过 `uni.startPullDownRefresh` 触发下拉刷新，调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
      * - 当处理完数据刷新后，`uni.stopPullDownRefresh` 可以停止当前页面的下拉刷新。
      */
    var onPullDownRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 页面上拉触底事件的处理函数
      * - 可以在 `pages.json` 的页面配置中设置触发距离 `onReachBottomDistance` 。
      * - 在触发距离内滑动期间，本事件只会被触发一次。
      */
    var onReachBottom: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 生命周期回调 监听页面初次渲染完成
      *
      * 页面初次渲染完成时触发。一个页面只会调用一次，代表页面已经准备妥当，可以和视图层进行交互。
      */
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * 页面尺寸改变时触发
      * @param options 页面滚动参数
      */
    var onResize: js.UndefOr[js.Function1[/* options */ PageScrollOption, Unit]] = js.undefined
    
    /**
      * 用户点击右上角转发
      *
      * 监听用户点击页面内转发按钮（`<button>` 组件 `open-type="share"`）或右上角菜单“转发”按钮的行为，并自定义转发内容。
      * @param options 分享发起来源参数
      * @return 转发内容
      */
    var onShareAppMessage: js.UndefOr[js.Function1[/* options */ ShareAppMessageOption, CustomShareContent]] = js.undefined
    
    /**
      * 当前是 tab 页时，点击 tab 时触发
      * @param options tab 点击参数
      */
    var onTabItemTap: js.UndefOr[js.Function1[/* options */ TabItemTapOption, Unit]] = js.undefined
    
    /**
      * 生命周期回调 监听页面卸载
      *
      * 页面卸载时触发。如 `redirectTo` 或 `navigateBack` 到其他页面时。
      */
    var onUnload: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Hooks {
    
    inline def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    extension [Self <: Hooks](x: Self) {
      
      inline def setOnBackPress(value: /* options */ BackPressOption => Any): Self = StObject.set(x, "onBackPress", js.Any.fromFunction1(value))
      
      inline def setOnBackPressUndefined: Self = StObject.set(x, "onBackPress", js.undefined)
      
      inline def setOnLoad(value: /* query */ js.UndefOr[AnyObject] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnNavigationBarButtonTap(value: /* options */ NavigationBarButtonTapOption => Unit): Self = StObject.set(x, "onNavigationBarButtonTap", js.Any.fromFunction1(value))
      
      inline def setOnNavigationBarButtonTapUndefined: Self = StObject.set(x, "onNavigationBarButtonTap", js.undefined)
      
      inline def setOnNavigationBarSearchInputChanged(value: /* event */ NavigationBarSearchInputEvent => Unit): Self = StObject.set(x, "onNavigationBarSearchInputChanged", js.Any.fromFunction1(value))
      
      inline def setOnNavigationBarSearchInputChangedUndefined: Self = StObject.set(x, "onNavigationBarSearchInputChanged", js.undefined)
      
      inline def setOnNavigationBarSearchInputClicked(value: () => Unit): Self = StObject.set(x, "onNavigationBarSearchInputClicked", js.Any.fromFunction0(value))
      
      inline def setOnNavigationBarSearchInputClickedUndefined: Self = StObject.set(x, "onNavigationBarSearchInputClicked", js.undefined)
      
      inline def setOnNavigationBarSearchInputConfirmed(value: /* event */ NavigationBarSearchInputEvent => Unit): Self = StObject.set(x, "onNavigationBarSearchInputConfirmed", js.Any.fromFunction1(value))
      
      inline def setOnNavigationBarSearchInputConfirmedUndefined: Self = StObject.set(x, "onNavigationBarSearchInputConfirmed", js.undefined)
      
      inline def setOnPageScroll(value: /* options */ PageScrollOption => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      inline def setOnPullDownRefresh(value: () => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction0(value))
      
      inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      inline def setOnReachBottom(value: () => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction0(value))
      
      inline def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnResize(value: /* options */ PageScrollOption => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnShareAppMessage(value: /* options */ ShareAppMessageOption => CustomShareContent): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      inline def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      inline def setOnTabItemTap(value: /* options */ TabItemTapOption => Unit): Self = StObject.set(x, "onTabItemTap", js.Any.fromFunction1(value))
      
      inline def setOnTabItemTapUndefined: Self = StObject.set(x, "onTabItemTap", js.undefined)
      
      inline def setOnUnload(value: () => Unit): Self = StObject.set(x, "onUnload", js.Any.fromFunction0(value))
      
      inline def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
    }
  }
}
