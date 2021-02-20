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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@tinajs/tina.@tinajs/tina.ComponentDefinitions> */
  @js.native
  trait PartialComponentDefinitio extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.native
    
    var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.native
    
    var created: js.UndefOr[js.Function0[Unit]] = js.native
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.native
    
    var methods: js.UndefOr[
        StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
      ] = js.native
    
    var mixins: js.UndefOr[js.Array[Partial[ComponentDefinitions]]] = js.native
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.native
    
    var properties: js.UndefOr[ComponentProperties] = js.native
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PartialComponentDefinitio {
    
    @scala.inline
    def apply(): PartialComponentDefinitio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialComponentDefinitio]
    }
    
    @scala.inline
    implicit class PartialComponentDefinitioMutableBuilder[Self <: PartialComponentDefinitio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setCompute(value: /* data */ StringDictionary[js.Any] => StringDictionary[_]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMixins(value: js.Array[Partial[ComponentDefinitions]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setMixinsVarargs(value: Partial[ComponentDefinitions]*): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      @scala.inline
      def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
  @js.native
  trait PartialPageDefinitions extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
    
    var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.native
    
    var created: js.UndefOr[js.Function0[Unit]] = js.native
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.native
    
    var methods: js.UndefOr[
        StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
      ] = js.native
    
    var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.native
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHide: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
    
    var onLoad: js.UndefOr[js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onPageScroll: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
    
    var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
    
    var onReachBottom: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
    
    var onReady: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
    
    var onShareAppMessage: js.UndefOr[js.Function1[/* event */ Page, Unit]] = js.native
    
    var onShow: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
    
    var onUnload: js.UndefOr[js.ThisFunction0[/* this */ Page, Unit]] = js.native
    
    var properties: js.UndefOr[ComponentProperties] = js.native
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PartialPageDefinitions {
    
    @scala.inline
    def apply(): PartialPageDefinitions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPageDefinitions]
    }
    
    @scala.inline
    implicit class PartialPageDefinitionsMutableBuilder[Self <: PartialPageDefinitions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBeforeLoad(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "beforeLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      @scala.inline
      def setCompute(value: /* data */ StringDictionary[js.Any] => StringDictionary[_]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMixins(value: js.Array[Partial[PageDefinitions]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setMixinsVarargs(value: Partial[PageDefinitions]*): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      @scala.inline
      def setOnHide(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnLoad(value: js.ThisFunction1[/* this */ Page, /* options */ js.UndefOr[js.Any], Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPageScroll(value: /* event */ Page => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      @scala.inline
      def setOnPullDownRefresh(value: /* event */ Page => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      @scala.inline
      def setOnReachBottom(value: /* event */ Page => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      @scala.inline
      def setOnReady(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnShareAppMessage(value: /* event */ Page => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      @scala.inline
      def setOnShow(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnUnload(value: js.ThisFunction0[/* this */ Page, Unit]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
      
      @scala.inline
      def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
  @js.native
  trait PartialPageDefinitionsAttached extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
    
    var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.native
    
    var created: js.UndefOr[js.Function0[Unit]] = js.native
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.native
    
    var methods: js.UndefOr[
        StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
      ] = js.native
    
    var mixins: js.UndefOr[js.Array[Partial[PageDefinitions]]] = js.native
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHide: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
    
    var onLoad: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* options */ js.UndefOr[js.Any], Unit]] = js.native
    
    var onPageScroll: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
    
    var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
    
    var onReachBottom: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
    
    var onReady: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
    
    var onShareAppMessage: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.native
    
    var onShow: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
    
    var onUnload: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
    
    var properties: js.UndefOr[ComponentProperties] = js.native
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object PartialPageDefinitionsAttached {
    
    @scala.inline
    def apply(): PartialPageDefinitionsAttached = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPageDefinitionsAttached]
    }
    
    @scala.inline
    implicit class PartialPageDefinitionsAttachedMutableBuilder[Self <: PartialPageDefinitionsAttached] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setBeforeLoad(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "beforeLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeLoadUndefined: Self = StObject.set(x, "beforeLoad", js.undefined)
      
      @scala.inline
      def setCompute(value: /* data */ StringDictionary[js.Any] => StringDictionary[_]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputeUndefined: Self = StObject.set(x, "compute", js.undefined)
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      @scala.inline
      def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMixins(value: js.Array[Partial[PageDefinitions]]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setMixinsVarargs(value: Partial[PageDefinitions]*): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      @scala.inline
      def setOnHide(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnLoad(value: js.ThisFunction1[PartialPageDefinitionsAttached, /* options */ js.UndefOr[js.Any], Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnPageScroll(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      @scala.inline
      def setOnPullDownRefresh(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPullDownRefreshUndefined: Self = StObject.set(x, "onPullDownRefresh", js.undefined)
      
      @scala.inline
      def setOnReachBottom(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReachBottomUndefined: Self = StObject.set(x, "onReachBottom", js.undefined)
      
      @scala.inline
      def setOnReady(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      @scala.inline
      def setOnShareAppMessage(value: PartialPageDefinitionsAttached => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShareAppMessageUndefined: Self = StObject.set(x, "onShareAppMessage", js.undefined)
      
      @scala.inline
      def setOnShow(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setOnUnload(value: js.ThisFunction0[PartialPageDefinitionsAttached, Unit]): Self = StObject.set(x, "onUnload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUnloadUndefined: Self = StObject.set(x, "onUnload", js.undefined)
      
      @scala.inline
      def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
    }
  }
}
