package typings.tsMockito

import typings.std.PropertyDescriptor
import typings.tsMockito.matcherMod.Matcher
import typings.tsMockito.methodActionMod.MethodAction
import typings.tsMockito.methodStubMod.MethodStub
import typings.tsMockito.objectInspectorMod.ObjectInspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockMod {
  
  @JSImport("ts-mockito/lib/Mock", "Mocker")
  @js.native
  class Mocker protected () extends StObject {
    def this(clazz: js.Any) = this()
    def this(clazz: js.Any, instance: js.Any) = this()
    
    /* private */ var clazz: js.Any = js.native
    
    /* protected */ def createActionListener(key: String): js.Function0[js.Any] = js.native
    
    def createCatchAllHandlerForRemainingPropertiesWithoutGetters(): js.Any = js.native
    
    /* protected */ def createInstanceActionListener(key: String, prototype: js.Any): Unit = js.native
    
    /* protected */ def createInstancePropertyDescriptorListener(key: String, descriptor: PropertyDescriptor, prototype: js.Any): Unit = js.native
    
    /* private */ var createMethodStub: js.Any = js.native
    
    /* private */ var createMethodToStub: js.Any = js.native
    
    /* private */ var createPropertyStub: js.Any = js.native
    
    /* private */ var excludedPropertyNames: js.Any = js.native
    
    def getActionsByName(name: String): js.Array[MethodAction] = js.native
    
    def getAllMatchingActions(methodName: String, matchers: js.Array[Matcher]): js.Array[MethodAction] = js.native
    
    /* protected */ def getEmptyMethodStub(key: String, args: js.Array[js.Any]): MethodStub = js.native
    
    def getFirstMatchingAction(methodName: String, matchers: js.Array[Matcher]): MethodAction = js.native
    
    /* private */ var getMethodStub: js.Any = js.native
    
    def getMock(): js.Any = js.native
    
    var instance: js.Any = js.native
    
    /* private */ var methodActions: js.Any = js.native
    
    /* private */ var methodStubCollections: js.Any = js.native
    
    var mock: js.Any = js.native
    
    /* private */ var mockableFunctionsFinder: js.Any = js.native
    
    /* protected */ var objectInspector: ObjectInspector = js.native
    
    /* private */ var objectPropertyCodeRetriever: js.Any = js.native
    
    /* private */ var processClassCode: js.Any = js.native
    
    /* private */ var processFunctionsCode: js.Any = js.native
    
    /* protected */ def processProperties(`object`: js.Any): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resetCalls(): Unit = js.native
  }
}
