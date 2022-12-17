package typings.tinajsTina

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.tinajsTina.mod.Component
import typings.tinajsTina.mod.ComponentDefinitions
import typings.tinajsTina.mod.ComponentProperties
import typings.tinajsTina.mod.Page
import typings.tinajsTina.mod.PageDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@tinajs/tina.@tinajs/tina.ComponentDefinitions> */
  trait PartialComponentDefinitio extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[Any], StringDictionary[Any]]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var methods: js.UndefOr[
        StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]
      ] = js.undefined
    
    var mixins: js.UndefOr[js.Array[Partial[ComponentDefinitions]]] = js.undefined
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var properties: js.UndefOr[ComponentProperties] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialComponentDefinitio {
    
    inline def apply(): PartialComponentDefinitio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialComponentDefinitio]
    }
    
    extension [Self <: PartialComponentDefinitio](x: Self) {
      
      inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setCompute(value: /* data */ StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMixins(value: js.Array[Partial[ComponentDefinitions]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: Partial[ComponentDefinitions]*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
  trait PartialPageDefinitions extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
    
    var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[Any], StringDictionary[Any]]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var methods: js.UndefOr[
        StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]
      ] = js.undefined
    
    var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.undefined
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onPageScroll: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
    
    var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
    
    var onReachBottom: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
    
    var onShareAppMessage: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
    
    var onUnload: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.undefined
    
    var properties: js.UndefOr[ComponentProperties] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialPageDefinitions {
    
    inline def apply(): PartialPageDefinitions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPageDefinitions]
    }
    
    extension [Self <: PartialPageDefinitions](x: Self) {
      
      inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBeforeLoad(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "beforeLoad", value.asInstanceOf[js.Any])
      
      inline def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      inline def setCompute(value: /* data */ StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMixins(value: js.Array[Partial[PageDefinitions]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: Partial[PageDefinitions]*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnLoad(value: js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPageScroll(value: /* event */ Page => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      inline def setOnPullDownRefresh(value: /* event */ Page => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
      
      inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      inline def setOnReachBottom(value: /* event */ Page => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
      
      inline def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      inline def setOnReady(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnShareAppMessage(value: /* event */ Page => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      inline def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      inline def setOnShow(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnUnload(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
      
      inline def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
      
      inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
  trait PartialPageDefinitionsAttached extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
    
    var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[Any], StringDictionary[Any]]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var methods: js.UndefOr[
        StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]
      ] = js.undefined
    
    var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.undefined
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
    
    var onLoad: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* options */ js.UndefOr[Any], Unit]] = js.undefined
    
    var onPageScroll: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
    
    var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
    
    var onReachBottom: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
    
    var onShareAppMessage: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
    
    var onUnload: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
    
    var properties: js.UndefOr[ComponentProperties] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object PartialPageDefinitionsAttached {
    
    inline def apply(): PartialPageDefinitionsAttached = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPageDefinitionsAttached]
    }
    
    extension [Self <: PartialPageDefinitionsAttached](x: Self) {
      
      inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBeforeLoad(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "beforeLoad", value.asInstanceOf[js.Any])
      
      inline def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      inline def setCompute(value: /* data */ StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      inline def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMixins(value: js.Array[Partial[PageDefinitions]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setMixinsVarargs(value: Partial[PageDefinitions]*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setOnHide(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnLoad(value: js.ThisFunction1[PartialPageDefinitionsAttached, /* options */ js.UndefOr[Any], Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOnPageScroll(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      inline def setOnPullDownRefresh(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
      
      inline def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      inline def setOnReachBottom(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
      
      inline def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      inline def setOnReady(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnShareAppMessage(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      inline def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      inline def setOnShow(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnUnload(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
      
      inline def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
      
      inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
}
