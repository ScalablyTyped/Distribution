package typings.tsMockito

import typings.tsMockito.libMatcherTypeMatcherMod.Matcher
import typings.tsMockito.libMethodActionMod.MethodAction
import typings.tsMockito.libStubMethodStubMod.MethodStub
import typings.tsMockito.libUtilsObjectInspectorMod.ObjectInspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockMod {
  
  @JSImport("ts-mockito/lib/Mock", "Mocker")
  @js.native
  open class Mocker protected () extends StObject {
    def this(clazz: Any) = this()
    def this(clazz: Any, instance: Any) = this()
    
    /* private */ var clazz: Any = js.native
    
    /* protected */ def createActionListener(key: String): js.Function0[Any] = js.native
    
    def createCatchAllHandlerForRemainingPropertiesWithoutGetters(): Any = js.native
    
    /* protected */ def createInstanceActionListener(key: String, prototype: Any): Unit = js.native
    
    /* protected */ def createInstancePropertyDescriptorListener(key: String, descriptor: js.PropertyDescriptor, prototype: Any): Unit = js.native
    
    /* private */ var createMethodStub: Any = js.native
    
    /* private */ var createMethodToStub: Any = js.native
    
    /* private */ var createPropertyStub: Any = js.native
    
    /* private */ var excludedPropertyNames: Any = js.native
    
    def getActionsByName(name: String): js.Array[MethodAction] = js.native
    
    def getAllMatchingActions(methodName: String, matchers: js.Array[Matcher]): js.Array[MethodAction] = js.native
    
    /* protected */ def getEmptyMethodStub(key: String, args: js.Array[Any]): MethodStub = js.native
    
    def getFirstMatchingAction(methodName: String, matchers: js.Array[Matcher]): MethodAction = js.native
    
    /* private */ var getMethodStub: Any = js.native
    
    def getMock(): Any = js.native
    
    var instance: Any = js.native
    
    /* private */ var methodActions: Any = js.native
    
    /* private */ var methodStubCollections: Any = js.native
    
    var mock: Any = js.native
    
    /* private */ var mockableFunctionsFinder: Any = js.native
    
    /* protected */ var objectInspector: ObjectInspector = js.native
    
    /* private */ var objectPropertyCodeRetriever: Any = js.native
    
    /* private */ var processClassCode: Any = js.native
    
    /* private */ var processFunctionsCode: Any = js.native
    
    /* protected */ def processProperties(`object`: Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetCalls(): Unit = js.native
  }
}
