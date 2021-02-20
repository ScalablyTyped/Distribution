package typings.wepy

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.wepy.anon.FnCall
import typings.wepy.appMod.AppConfig
import typings.wepy.appMod.AppConstructor
import typings.wepy.appMod.default
import typings.wepy.pageMod.PageConstructor
import typings.wepy.wxEnhancedMod.WxEnhances
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("wepy", JSImport.Default)
    @js.native
    val ^ : DefaultExport = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wepy", "default.app")
    @js.native
    class app ()
      extends typings.wepy.appMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wepy", "default.component")
    @js.native
    class component ()
      extends typings.wepy.componentMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wepy", "default.event")
    @js.native
    class event protected ()
      extends typings.wepy.eventMod.default {
      def this(name: String, source: js.Any, `type`: js.Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wepy", "default.mixin")
    @js.native
    class mixin ()
      extends typings.wepy.mixinMod.default
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wepy", "default.page")
    @js.native
    class page ()
      extends typings.wepy.pageMod.default
    
    type _To = DefaultExport
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: DefaultExport = ^
  }
  
  type App = Instantiable0[default]
  
  type Component = Instantiable0[typings.wepy.componentMod.default]
  
  @js.native
  trait DefaultExport extends WxEnhances {
    
    @JSName("$copy")
    def $copy[T](obj: T): T = js.native
    @JSName("$copy")
    def $copy[T](obj: T, deep: Boolean): T = js.native
    @JSName("$copy")
    var $copy_Original: FnCall = js.native
    
    @JSName("$createApp")
    var $createApp: js.UndefOr[js.Function2[/* appClass */ AppConstructor, /* appConfig */ AppConfig, default]] = js.native
    
    @JSName("$createPage")
    var $createPage: js.UndefOr[
        js.Function2[
          /* pageClass */ PageConstructor, 
          /* pagePath */ String | Boolean, 
          typings.wepy.pageMod.default
        ]
      ] = js.native
    
    @JSName("$extend")
    def $extend(): js.Any = js.native
    @JSName("$extend")
    var $extend_Original: js.Function0[_] = js.native
    
    @JSName("$has")
    def $has(obj: js.Object, path: String): Boolean = js.native
    @JSName("$has")
    var $has_Original: js.Function2[/* obj */ js.Object, /* path */ String, Boolean] = js.native
    
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.UndefOr[scala.Nothing], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isDeepEqual")
    var $isDeepEqual_Original: js.Function4[
        /* a */ js.Any, 
        /* b */ js.Any, 
        /* aStack */ js.UndefOr[js.Array[_]], 
        /* bStack */ js.UndefOr[js.Array[_]], 
        Boolean
      ] = js.native
    
    @JSName("$isEmpty")
    def $isEmpty(obj: js.Object): Boolean = js.native
    @JSName("$isEmpty")
    var $isEmpty_Original: js.Function1[/* obj */ js.Object, Boolean] = js.native
    
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.UndefOr[scala.Nothing], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isEqual")
    var $isEqual_Original: js.Function4[
        /* a */ js.Any, 
        /* b */ js.Any, 
        /* aStack */ js.UndefOr[js.Array[_]], 
        /* bStack */ js.UndefOr[js.Array[_]], 
        Boolean
      ] = js.native
    
    @JSName("$isPlainObject")
    def $isPlainObject(obj: js.Any): Boolean = js.native
    @JSName("$isPlainObject")
    var $isPlainObject_Original: js.Function1[/* obj */ js.Any, Boolean] = js.native
    
    var app: App = js.native
    
    var component: Component = js.native
    
    var event: Event = js.native
    
    var mixin: Mixin = js.native
    
    var page: Page = js.native
  }
  
  type Event = Instantiable3[
    /* name */ String, 
    /* source */ js.Any, 
    /* type */ js.Any, 
    typings.wepy.eventMod.default
  ]
  
  type Mixin = Instantiable0[typings.wepy.mixinMod.default]
  
  type Page = Instantiable0[typings.wepy.pageMod.default]
}
