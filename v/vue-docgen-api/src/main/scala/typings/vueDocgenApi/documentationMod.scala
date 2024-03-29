package typings.vueDocgenApi

import typings.vueInbrowserCompilerUtils.typesMod.ComponentDoc
import typings.vueInbrowserCompilerUtils.typesMod.Descriptor
import typings.vueInbrowserCompilerUtils.typesMod.EventDescriptor
import typings.vueInbrowserCompilerUtils.typesMod.MethodDescriptor
import typings.vueInbrowserCompilerUtils.typesMod.PropDescriptor
import typings.vueInbrowserCompilerUtils.typesMod.SlotDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentationMod {
  
  @JSImport("vue-docgen-api/dist/Documentation", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Documentation {
    def this(fullFilePath: String) = this()
    
    /* CompleteClass */
    override val componentFullfilePath: String = js.native
    
    /* private */ /* CompleteClass */
    var dataMap: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var docsBlocks: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var eventsMap: js.Any = js.native
    
    /* CompleteClass */
    override def get(key: String): js.Any = js.native
    
    /* private */ /* CompleteClass */
    var getDescriptor: js.Any = js.native
    
    /* CompleteClass */
    override def getEventDescriptor(eventName: String): EventDescriptor = js.native
    
    /* CompleteClass */
    override def getMethodDescriptor(methodName: String): MethodDescriptor = js.native
    
    /* private */ /* CompleteClass */
    var getObjectFromDescriptor: js.Any = js.native
    
    /* CompleteClass */
    override def getPropDescriptor(propName: String): PropDescriptor = js.native
    
    /* CompleteClass */
    override def getSlotDescriptor(slotName: String): SlotDescriptor = js.native
    
    /* private */ /* CompleteClass */
    var methodsMap: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var originExtendsMixin: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var propsMap: js.Any = js.native
    
    /* CompleteClass */
    override def set(key: String, value: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def setDocsBlocks(docsBlocks: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setOrigin(origin: Descriptor): Unit = js.native
    
    /* private */ /* CompleteClass */
    var slotsMap: js.Any = js.native
    
    /* CompleteClass */
    override def toObject(): ComponentDoc = js.native
  }
  
  trait Documentation extends StObject {
    
    val componentFullfilePath: String
    
    /* private */ var dataMap: js.Any
    
    /* private */ var docsBlocks: js.Any
    
    /* private */ var eventsMap: js.Any
    
    def get(key: String): js.Any
    
    /* private */ var getDescriptor: js.Any
    
    def getEventDescriptor(eventName: String): EventDescriptor
    
    def getMethodDescriptor(methodName: String): MethodDescriptor
    
    /* private */ var getObjectFromDescriptor: js.Any
    
    def getPropDescriptor(propName: String): PropDescriptor
    
    def getSlotDescriptor(slotName: String): SlotDescriptor
    
    /* private */ var methodsMap: js.Any
    
    /* private */ var originExtendsMixin: js.Any
    
    /* private */ var propsMap: js.Any
    
    def set(key: String, value: js.Any): Unit
    
    def setDocsBlocks(docsBlocks: js.Array[String]): Unit
    
    def setOrigin(origin: Descriptor): Unit
    
    /* private */ var slotsMap: js.Any
    
    def toObject(): ComponentDoc
  }
  object Documentation {
    
    inline def apply(
      componentFullfilePath: String,
      dataMap: js.Any,
      docsBlocks: js.Any,
      eventsMap: js.Any,
      get: String => js.Any,
      getDescriptor: js.Any,
      getEventDescriptor: String => EventDescriptor,
      getMethodDescriptor: String => MethodDescriptor,
      getObjectFromDescriptor: js.Any,
      getPropDescriptor: String => PropDescriptor,
      getSlotDescriptor: String => SlotDescriptor,
      methodsMap: js.Any,
      originExtendsMixin: js.Any,
      propsMap: js.Any,
      set: (String, js.Any) => Unit,
      setDocsBlocks: js.Array[String] => Unit,
      setOrigin: Descriptor => Unit,
      slotsMap: js.Any,
      toObject: () => ComponentDoc
    ): Documentation = {
      val __obj = js.Dynamic.literal(componentFullfilePath = componentFullfilePath.asInstanceOf[js.Any], dataMap = dataMap.asInstanceOf[js.Any], docsBlocks = docsBlocks.asInstanceOf[js.Any], eventsMap = eventsMap.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getDescriptor = getDescriptor.asInstanceOf[js.Any], getEventDescriptor = js.Any.fromFunction1(getEventDescriptor), getMethodDescriptor = js.Any.fromFunction1(getMethodDescriptor), getObjectFromDescriptor = getObjectFromDescriptor.asInstanceOf[js.Any], getPropDescriptor = js.Any.fromFunction1(getPropDescriptor), getSlotDescriptor = js.Any.fromFunction1(getSlotDescriptor), methodsMap = methodsMap.asInstanceOf[js.Any], originExtendsMixin = originExtendsMixin.asInstanceOf[js.Any], propsMap = propsMap.asInstanceOf[js.Any], set = js.Any.fromFunction2(set), setDocsBlocks = js.Any.fromFunction1(setDocsBlocks), setOrigin = js.Any.fromFunction1(setOrigin), slotsMap = slotsMap.asInstanceOf[js.Any], toObject = js.Any.fromFunction0(toObject))
      __obj.asInstanceOf[Documentation]
    }
    
    extension [Self <: Documentation](x: Self) {
      
      inline def setComponentFullfilePath(value: String): Self = StObject.set(x, "componentFullfilePath", value.asInstanceOf[js.Any])
      
      inline def setDataMap(value: js.Any): Self = StObject.set(x, "dataMap", value.asInstanceOf[js.Any])
      
      inline def setDocsBlocks(value: js.Any): Self = StObject.set(x, "docsBlocks", value.asInstanceOf[js.Any])
      
      inline def setEventsMap(value: js.Any): Self = StObject.set(x, "eventsMap", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetDescriptor(value: js.Any): Self = StObject.set(x, "getDescriptor", value.asInstanceOf[js.Any])
      
      inline def setGetEventDescriptor(value: String => EventDescriptor): Self = StObject.set(x, "getEventDescriptor", js.Any.fromFunction1(value))
      
      inline def setGetMethodDescriptor(value: String => MethodDescriptor): Self = StObject.set(x, "getMethodDescriptor", js.Any.fromFunction1(value))
      
      inline def setGetObjectFromDescriptor(value: js.Any): Self = StObject.set(x, "getObjectFromDescriptor", value.asInstanceOf[js.Any])
      
      inline def setGetPropDescriptor(value: String => PropDescriptor): Self = StObject.set(x, "getPropDescriptor", js.Any.fromFunction1(value))
      
      inline def setGetSlotDescriptor(value: String => SlotDescriptor): Self = StObject.set(x, "getSlotDescriptor", js.Any.fromFunction1(value))
      
      inline def setMethodsMap(value: js.Any): Self = StObject.set(x, "methodsMap", value.asInstanceOf[js.Any])
      
      inline def setOriginExtendsMixin(value: js.Any): Self = StObject.set(x, "originExtendsMixin", value.asInstanceOf[js.Any])
      
      inline def setPropsMap(value: js.Any): Self = StObject.set(x, "propsMap", value.asInstanceOf[js.Any])
      
      inline def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetDocsBlocks(value: js.Array[String] => Unit): Self = StObject.set(x, "setDocsBlocks", js.Any.fromFunction1(value))
      
      inline def setSetOrigin(value: Descriptor => Unit): Self = StObject.set(x, "setOrigin", js.Any.fromFunction1(value))
      
      inline def setSlotsMap(value: js.Any): Self = StObject.set(x, "slotsMap", value.asInstanceOf[js.Any])
      
      inline def setToObject(value: () => ComponentDoc): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
    }
  }
}
