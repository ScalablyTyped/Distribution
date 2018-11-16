package typings
package tsDashMockitoLib.libMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/Mock", "Mocker")
@js.native
class Mocker protected () extends js.Object {
  def this(clazz: js.Any) = this()
  def this(clazz: js.Any, instance: js.Any) = this()
  var clazz: js.Any = js.native
  var excludedPropertyNames: js.Any = js.native
  var instance: js.Any = js.native
  var methodActions: js.Any = js.native
  var methodStubCollections: js.Any = js.native
  var mock: js.Any = js.native
  var mockableFunctionsFinder: js.Any = js.native
  var objectInspector: tsDashMockitoLib.libUtilsObjectInspectorMod.ObjectInspector = js.native
  var objectPropertyCodeRetriever: js.Any = js.native
  /* protected */ def createActionListener(key: java.lang.String): js.Function0[_] = js.native
  def createCatchAllHandlerForRemainingPropertiesWithoutGetters(): js.Any = js.native
  /* protected */ def createInstanceActionListener(key: java.lang.String, prototype: js.Any): scala.Unit = js.native
  /* protected */ def createInstancePropertyDescriptorListener(key: java.lang.String, descriptor: stdLib.PropertyDescriptor, prototype: js.Any): scala.Unit = js.native
  /* private */ def createMethodStub(key: js.Any): js.Any = js.native
  /* private */ def createMethodToStub(key: js.Any): js.Any = js.native
  /* private */ def createPropertyStub(key: js.Any): js.Any = js.native
  def getActionsByName(name: java.lang.String): js.Array[tsDashMockitoLib.libMethodActionMod.MethodAction] = js.native
  def getAllMatchingActions(
    methodName: java.lang.String,
    matchers: js.Array[tsDashMockitoLib.libMatcherTypeMatcherMod.Matcher]
  ): js.Array[tsDashMockitoLib.libMethodActionMod.MethodAction] = js.native
  /* protected */ def getEmptyMethodStub(key: java.lang.String, args: js.Array[_]): tsDashMockitoLib.libStubMethodStubMod.MethodStub = js.native
  def getFirstMatchingAction(
    methodName: java.lang.String,
    matchers: js.Array[tsDashMockitoLib.libMatcherTypeMatcherMod.Matcher]
  ): tsDashMockitoLib.libMethodActionMod.MethodAction = js.native
  /* private */ def getMethodStub(key: js.Any, args: js.Any): js.Any = js.native
  def getMock(): js.Any = js.native
  /* private */ def processClassCode(clazz: js.Any): js.Any = js.native
  /* private */ def processFunctionsCode(`object`: js.Any): js.Any = js.native
  /* protected */ def processProperties(`object`: js.Any): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def resetCalls(): scala.Unit = js.native
}

