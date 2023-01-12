package typings.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.wepy.anon.Delta
import typings.wepy.wepyStrings.navigateTo
import typings.wepy.wepyStrings.redirectTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageMod {
  
  @JSImport("wepy/page", JSImport.Default)
  @js.native
  open class default () extends page
  
  trait PageConfig extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var backgroundTextStyle: js.UndefOr[String] = js.undefined
    
    var disableScroll: js.UndefOr[Boolean] = js.undefined
    
    var enablePullDownRefresh: js.UndefOr[Boolean] = js.undefined
    
    var navigationBarBackgroundColor: js.UndefOr[String] = js.undefined
    
    var navigationBarTextStyle: js.UndefOr[String] = js.undefined
    
    var navigationBarTitleText: js.UndefOr[String] = js.undefined
    
    var onReachBottomDistance: js.UndefOr[Double] = js.undefined
  }
  object PageConfig {
    
    inline def apply(): PageConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageConfig] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundTextStyle(value: String): Self = StObject.set(x, "backgroundTextStyle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundTextStyleUndefined: Self = StObject.set(x, "backgroundTextStyle", js.undefined)
      
      inline def setDisableScroll(value: Boolean): Self = StObject.set(x, "disableScroll", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollUndefined: Self = StObject.set(x, "disableScroll", js.undefined)
      
      inline def setEnablePullDownRefresh(value: Boolean): Self = StObject.set(x, "enablePullDownRefresh", value.asInstanceOf[js.Any])
      
      inline def setEnablePullDownRefreshUndefined: Self = StObject.set(x, "enablePullDownRefresh", js.undefined)
      
      inline def setNavigationBarBackgroundColor(value: String): Self = StObject.set(x, "navigationBarBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarBackgroundColorUndefined: Self = StObject.set(x, "navigationBarBackgroundColor", js.undefined)
      
      inline def setNavigationBarTextStyle(value: String): Self = StObject.set(x, "navigationBarTextStyle", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarTextStyleUndefined: Self = StObject.set(x, "navigationBarTextStyle", js.undefined)
      
      inline def setNavigationBarTitleText(value: String): Self = StObject.set(x, "navigationBarTitleText", value.asInstanceOf[js.Any])
      
      inline def setNavigationBarTitleTextUndefined: Self = StObject.set(x, "navigationBarTitleText", js.undefined)
      
      inline def setOnReachBottomDistance(value: Double): Self = StObject.set(x, "onReachBottomDistance", value.asInstanceOf[js.Any])
      
      inline def setOnReachBottomDistanceUndefined: Self = StObject.set(x, "onReachBottomDistance", js.undefined)
    }
  }
  
  @js.native
  trait PageConstructor
    extends StObject
       with Instantiable0[page]
  
  trait UrlParam extends StObject {
    
    var url: String
  }
  object UrlParam {
    
    inline def apply(url: String): UrlParam = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlParam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlParam] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait page
    extends typings.wepy.componentMod.default {
    
    @JSName("$back")
    def $back(delta: Double): Any = js.native
    @JSName("$back")
    def $back(delta: Delta): Any = js.native
    
    @JSName("$init")
    def $init(wxpage: Any, $parent: Any): Any = js.native
    
    @JSName("$preload")
    def $preload(key: String, data: Any): Any = js.native
    @JSName("$preload")
    def $preload(key: StringDictionary[Any], data: Any): Any = js.native
    
    @JSName("$preloadData")
    var $preloadData: js.UndefOr[StringDictionary[Any]] = js.native
    
    @JSName("$redirect")
    def $redirect(url: String): Any = js.native
    @JSName("$redirect")
    def $redirect(url: String, params: js.Object): Any = js.native
    
    @JSName("$route")
    def $route(`type`: redirectTo | navigateTo, url: String): Any = js.native
    @JSName("$route")
    def $route(`type`: redirectTo | navigateTo, url: String, params: StringDictionary[Any]): Any = js.native
    @JSName("$route")
    def $route(`type`: redirectTo | navigateTo, url: UrlParam): Any = js.native
    @JSName("$route")
    def $route(`type`: redirectTo | navigateTo, url: UrlParam, params: StringDictionary[Any]): Any = js.native
    
    @JSName("$switch")
    def $switch(url: String): Any = js.native
    @JSName("$switch")
    def $switch(url: UrlParam): Any = js.native
    
    var config: js.UndefOr[PageConfig] = js.native
  }
}
