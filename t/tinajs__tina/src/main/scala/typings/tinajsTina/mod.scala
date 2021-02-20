package typings.tinajsTina

import org.scalablytyped.runtime.StringDictionary
import typings.tinajsTina.anon.PartialComponentDefinitio
import typings.tinajsTina.anon.PartialPageDefinitions
import typings.tinajsTina.anon.PartialPageDefinitionsAttached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tinajs/tina", "Component")
  @js.native
  class Component () extends StObject {
    
    var data: StringDictionary[js.Any] = js.native
    
    def setData(data: StringDictionary[js.Any]): Unit = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("@tinajs/tina", "Component.define")
    @js.native
    def define(definitions: PartialComponentDefinitio): Unit = js.native
    
    @JSImport("@tinajs/tina", "Component.mixin")
    @js.native
    def mixin(definitions: PartialComponentDefinitio): Unit = js.native
  }
  
  @JSImport("@tinajs/tina", "Page")
  @js.native
  class Page () extends Component
  /* static members */
  object Page {
    
    @JSImport("@tinajs/tina", "Page.define")
    @js.native
    def define(definitions: PartialPageDefinitionsAttached): Unit = js.native
    
    @JSImport("@tinajs/tina", "Page.mixin")
    @js.native
    def mixin(definitions: PartialPageDefinitionsAttached): Unit = js.native
  }
  
  @JSImport("@tinajs/tina", "use")
  @js.native
  def use(plugin: js.Any): Unit = js.native
  
  @js.native
  trait ComponentDefinitions extends ComponentLifecycles {
    
    def compute(data: StringDictionary[js.Any]): StringDictionary[js.Any] = js.native
    
    var data: StringDictionary[js.Any] = js.native
    
    var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = js.native
    
    var mixins: js.Array[PartialComponentDefinitio] = js.native
    
    var properties: ComponentProperties = js.native
  }
  object ComponentDefinitions {
    
    @scala.inline
    def apply(
      attached: () => Unit,
      compute: StringDictionary[js.Any] => StringDictionary[js.Any],
      created: () => Unit,
      data: StringDictionary[js.Any],
      detached: () => Unit,
      methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]],
      mixins: js.Array[PartialComponentDefinitio],
      moved: () => Unit,
      properties: ComponentProperties,
      ready: () => Unit
    ): ComponentDefinitions = {
      val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data.asInstanceOf[js.Any], detached = js.Any.fromFunction0(detached), methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], moved = js.Any.fromFunction0(moved), properties = properties.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
      __obj.asInstanceOf[ComponentDefinitions]
    }
    
    @scala.inline
    implicit class ComponentDefinitionsMutableBuilder[Self <: ComponentDefinitions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompute(value: StringDictionary[js.Any] => StringDictionary[js.Any]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixins(value: js.Array[PartialComponentDefinitio]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsVarargs(value: PartialComponentDefinitio*): Self = StObject.set(x, "mixins", js.Array(value :_*))
      
      @scala.inline
      def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentLifecycles extends StObject {
    
    def attached(): Unit = js.native
    
    def created(): Unit = js.native
    
    def detached(): Unit = js.native
    
    def moved(): Unit = js.native
    
    def ready(): Unit = js.native
  }
  object ComponentLifecycles {
    
    @scala.inline
    def apply(
      attached: () => Unit,
      created: () => Unit,
      detached: () => Unit,
      moved: () => Unit,
      ready: () => Unit
    ): ComponentLifecycles = {
      val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), created = js.Any.fromFunction0(created), detached = js.Any.fromFunction0(detached), moved = js.Any.fromFunction0(moved), ready = js.Any.fromFunction0(ready))
      __obj.asInstanceOf[ComponentLifecycles]
    }
    
    @scala.inline
    implicit class ComponentLifecyclesMutableBuilder[Self <: ComponentLifecycles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    }
  }
  
  type ComponentProperties = StringDictionary[js.Any]
  
  @js.native
  trait PageDefinitions
    extends ComponentDefinitions
       with PageEvents
       with PageHooks {
    
    @JSName("mixins")
    var mixins_PageDefinitions: js.Array[PartialPageDefinitions] = js.native
  }
  
  @js.native
  trait PageEvents extends StObject {
    
    def onPageScroll(event: Page): Unit = js.native
    
    def onPullDownRefresh(event: Page): Unit = js.native
    
    def onReachBottom(event: Page): Unit = js.native
    
    def onShareAppMessage(event: Page): Unit = js.native
  }
  object PageEvents {
    
    @scala.inline
    def apply(
      onPageScroll: Page => Unit,
      onPullDownRefresh: Page => Unit,
      onReachBottom: Page => Unit,
      onShareAppMessage: Page => Unit
    ): PageEvents = {
      val __obj = js.Dynamic.literal(onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction1(onPullDownRefresh), onReachBottom = js.Any.fromFunction1(onReachBottom), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage))
      __obj.asInstanceOf[PageEvents]
    }
    
    @scala.inline
    implicit class PageEventsMutableBuilder[Self <: PageEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnPageScroll(value: Page => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPullDownRefresh(value: Page => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReachBottom(value: Page => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShareAppMessage(value: Page => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PageHooks extends StObject {
    
    def beforeLoad(): Unit = js.native
    
    def onHide(): Unit = js.native
    
    def onLoad(): Unit = js.native
    def onLoad(options: js.Any): Unit = js.native
    
    def onReady(): Unit = js.native
    
    def onShow(): Unit = js.native
    
    def onUnload(): Unit = js.native
  }
}
