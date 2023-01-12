package typings.tinajsTina

import org.scalablytyped.runtime.StringDictionary
import typings.tinajsTina.anon.PartialComponentDefinitio
import typings.tinajsTina.anon.PartialPageDefinitions
import typings.tinajsTina.anon.PartialPageDefinitionsAttached
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tinajs/tina", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tinajs/tina", "Component")
  @js.native
  open class Component () extends StObject {
    
    var data: StringDictionary[Any] = js.native
    
    def setData(data: StringDictionary[Any]): Unit = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("@tinajs/tina", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(definitions: PartialComponentDefinitio): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mixin(definitions: PartialComponentDefinitio): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@tinajs/tina", "Page")
  @js.native
  open class Page () extends Component
  /* static members */
  object Page {
    
    @JSImport("@tinajs/tina", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    inline def define(definitions: PartialPageDefinitionsAttached): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def mixin(definitions: PartialPageDefinitionsAttached): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(definitions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def use(plugin: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ComponentDefinitions
    extends StObject
       with ComponentLifecycles {
    
    def compute(data: StringDictionary[Any]): StringDictionary[Any]
    
    var data: StringDictionary[Any]
    
    var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]
    
    var mixins: js.Array[PartialComponentDefinitio]
    
    var properties: ComponentProperties
  }
  object ComponentDefinitions {
    
    inline def apply(
      attached: () => Unit,
      compute: StringDictionary[Any] => StringDictionary[Any],
      created: () => Unit,
      data: StringDictionary[Any],
      detached: () => Unit,
      methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]],
      mixins: js.Array[PartialComponentDefinitio],
      moved: () => Unit,
      properties: ComponentProperties,
      ready: () => Unit
    ): ComponentDefinitions = {
      val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached), compute = js.Any.fromFunction1(compute), created = js.Any.fromFunction0(created), data = data.asInstanceOf[js.Any], detached = js.Any.fromFunction0(detached), methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], moved = js.Any.fromFunction0(moved), properties = properties.asInstanceOf[js.Any], ready = js.Any.fromFunction0(ready))
      __obj.asInstanceOf[ComponentDefinitions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentDefinitions] (val x: Self) extends AnyVal {
      
      inline def setCompute(value: StringDictionary[Any] => StringDictionary[Any]): Self = StObject.set(x, "compute", js.Any.fromFunction1(value))
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ Any, Any]]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMixins(value: js.Array[PartialComponentDefinitio]): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsVarargs(value: PartialComponentDefinitio*): Self = StObject.set(x, "mixins", js.Array(value*))
      
      inline def setProperties(value: ComponentProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentLifecycles extends StObject {
    
    def attached(): Unit
    
    def created(): Unit
    
    def detached(): Unit
    
    def moved(): Unit
    
    def ready(): Unit
  }
  object ComponentLifecycles {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ComponentLifecycles] (val x: Self) extends AnyVal {
      
      inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    }
  }
  
  type ComponentProperties = StringDictionary[Any]
  
  @js.native
  trait PageDefinitions
    extends StObject
       with ComponentDefinitions
       with PageEvents
       with PageHooks {
    
    @JSName("mixins")
    var mixins_PageDefinitions: js.Array[PartialPageDefinitions] = js.native
  }
  
  trait PageEvents extends StObject {
    
    def onPageScroll(event: Page): Unit
    
    def onPullDownRefresh(event: Page): Unit
    
    def onReachBottom(event: Page): Unit
    
    def onShareAppMessage(event: Page): Unit
  }
  object PageEvents {
    
    inline def apply(
      onPageScroll: Page => Unit,
      onPullDownRefresh: Page => Unit,
      onReachBottom: Page => Unit,
      onShareAppMessage: Page => Unit
    ): PageEvents = {
      val __obj = js.Dynamic.literal(onPageScroll = js.Any.fromFunction1(onPageScroll), onPullDownRefresh = js.Any.fromFunction1(onPullDownRefresh), onReachBottom = js.Any.fromFunction1(onReachBottom), onShareAppMessage = js.Any.fromFunction1(onShareAppMessage))
      __obj.asInstanceOf[PageEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageEvents] (val x: Self) extends AnyVal {
      
      inline def setOnPageScroll(value: Page => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPullDownRefresh(value: Page => Unit): Self = StObject.set(x, "onPullDownRefresh", js.Any.fromFunction1(value))
      
      inline def setOnReachBottom(value: Page => Unit): Self = StObject.set(x, "onReachBottom", js.Any.fromFunction1(value))
      
      inline def setOnShareAppMessage(value: Page => Unit): Self = StObject.set(x, "onShareAppMessage", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PageHooks extends StObject {
    
    def beforeLoad(): Unit = js.native
    
    def onHide(): Unit = js.native
    
    def onLoad(): Unit = js.native
    def onLoad(options: Any): Unit = js.native
    
    def onReady(): Unit = js.native
    
    def onShow(): Unit = js.native
    
    def onUnload(): Unit = js.native
  }
}
