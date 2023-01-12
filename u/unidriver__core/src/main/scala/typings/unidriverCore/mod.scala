package typings.unidriverCore

import typings.std.Error
import typings.unidriverCore.anon.Key
import typings.unidriverCore.distKeyTypesMod.KeyDefinitionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unidriver/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ErrorTypes extends StObject
  @JSImport("@unidriver/core", "ErrorTypes")
  @js.native
  object ErrorTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorTypes & String] = js.native
    
    @js.native
    sealed trait MULTIPLE_ELEMENTS_WITH_SELECTOR
      extends StObject
         with ErrorTypes
    /* "multiple-elements-with-selector" */ val MULTIPLE_ELEMENTS_WITH_SELECTOR: typings.unidriverCore.mod.ErrorTypes.MULTIPLE_ELEMENTS_WITH_SELECTOR & String = js.native
    
    @js.native
    sealed trait NO_ELEMENTS_WITH_SELECTOR
      extends StObject
         with ErrorTypes
    /* "no-elements-with-selector" */ val NO_ELEMENTS_WITH_SELECTOR: typings.unidriverCore.mod.ErrorTypes.NO_ELEMENTS_WITH_SELECTOR & String = js.native
  }
  
  @JSImport("@unidriver/core", "MultipleElementsWithLocatorError")
  @js.native
  open class MultipleElementsWithLocatorError protected ()
    extends StObject
       with Error {
    def this(count: Double, locator: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: ErrorTypes = js.native
  }
  
  @JSImport("@unidriver/core", "NoElementWithLocatorError")
  @js.native
  open class NoElementWithLocatorError protected ()
    extends StObject
       with Error {
    def this(locator: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: ErrorTypes = js.native
  }
  
  inline def contextToSelectorString(context: DriverContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("contextToSelectorString")(context.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def contextToWaitError(context: DriverContext): String = ^.asInstanceOf[js.Dynamic].applyDynamic("contextToWaitError")(context.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def delay(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def eventually(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Double, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Unit, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Double, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Unit, lastError: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getAllNonTextKeyTypes(): js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 245, starting with typings.unidriverCore.unidriverCoreStrings.`0`, typings.unidriverCore.unidriverCoreStrings.Digit0, typings.unidriverCore.unidriverCoreStrings.`1` */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllNonTextKeyTypes")().asInstanceOf[js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 245, starting with typings.unidriverCore.unidriverCoreStrings.`0`, typings.unidriverCore.unidriverCoreStrings.Digit0, typings.unidriverCore.unidriverCoreStrings.`1` */ Any
  ]]
  
  inline def getDefinitionForKeyType(keyType: KeyDefinitionType): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionForKeyType")(keyType.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def isMultipleElementsWithLocatorError(e: js.Error): /* is @unidriver/core.@unidriver/core.MultipleElementsWithLocatorError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultipleElementsWithLocatorError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @unidriver/core.@unidriver/core.MultipleElementsWithLocatorError */ Boolean]
  
  inline def isNoElementWithLocatorError(e: js.Error): /* is @unidriver/core.@unidriver/core.NoElementWithLocatorError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoElementWithLocatorError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @unidriver/core.@unidriver/core.NoElementWithLocatorError */ Boolean]
  
  @JSImport("@unidriver/core", "rootDriver")
  @js.native
  val rootDriver: DriverContext = js.native
  
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Double, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Unit, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Double, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Unit, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait DriverContext extends StObject {
    
    var idx: js.UndefOr[Double] = js.undefined
    
    var parent: js.UndefOr[DriverContext] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
  }
  object DriverContext {
    
    inline def apply(): DriverContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DriverContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DriverContext] (val x: Self) extends AnyVal {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setIdxUndefined: Self = StObject.set(x, "idx", js.undefined)
      
      inline def setParent(value: DriverContext): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait EnterValueOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var shouldClear: js.UndefOr[Boolean] = js.undefined
  }
  object EnterValueOptions {
    
    inline def apply(): EnterValueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnterValueOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnterValueOptions] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setShouldClear(value: Boolean): Self = StObject.set(x, "shouldClear", value.asInstanceOf[js.Any])
      
      inline def setShouldClearUndefined: Self = StObject.set(x, "shouldClear", js.undefined)
    }
  }
  
  type Locator = String
  
  type MapFn[T] = js.Function3[
    /* e */ UniDriver[Any], 
    /* idx */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[UniDriver[Any]]], 
    js.Promise[T]
  ]
  
  trait MouseUniDriver[T] extends StObject {
    
    def leave(): js.Promise[Unit]
    
    def moveTo(to: UniDriver[T]): js.Promise[Unit]
    
    def press(): js.Promise[Unit]
    
    def release(): js.Promise[Unit]
  }
  object MouseUniDriver {
    
    inline def apply[T](
      leave: () => js.Promise[Unit],
      moveTo: UniDriver[T] => js.Promise[Unit],
      press: () => js.Promise[Unit],
      release: () => js.Promise[Unit]
    ): MouseUniDriver[T] = {
      val __obj = js.Dynamic.literal(leave = js.Any.fromFunction0(leave), moveTo = js.Any.fromFunction1(moveTo), press = js.Any.fromFunction0(press), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[MouseUniDriver[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseUniDriver[?], T] (val x: Self & MouseUniDriver[T]) extends AnyVal {
      
      inline def setLeave(value: () => js.Promise[Unit]): Self = StObject.set(x, "leave", js.Any.fromFunction0(value))
      
      inline def setMoveTo(value: UniDriver[T] => js.Promise[Unit]): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
      
      inline def setPress(value: () => js.Promise[Unit]): Self = StObject.set(x, "press", js.Any.fromFunction0(value))
      
      inline def setRelease(value: () => js.Promise[Unit]): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    }
  }
  
  type PredicateFn = js.Function3[
    /* e */ UniDriver[Any], 
    /* idx */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[UniDriver[Any]]], 
    js.Promise[Boolean]
  ]
  
  type ReducerFn[T] = js.Function4[
    /* acc */ T, 
    /* curr */ UniDriver[Any], 
    /* idx */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[UniDriver[Any]]], 
    T
  ]
  
  @js.native
  trait UniDriver[T] extends StObject {
    
    @JSName("$")
    def $(selector: Locator): UniDriver[T] = js.native
    
    @JSName("$$")
    def DollarDollar(selector: Locator): UniDriverList[T] = js.native
    
    /** Gets a html element's property value by property name. @returns null if property is not defined */
    def _prop(name: String): js.Promise[Any] = js.native
    
    def attr(name: String): js.Promise[String | Null] = js.native
    
    def click(): js.Promise[Unit] = js.native
    
    def enterValue(value: String): js.Promise[Unit] = js.native
    def enterValue(value: String, options: EnterValueOptions): js.Promise[Unit] = js.native
    
    def exists(): js.Promise[Boolean] = js.native
    
    def getNative(): js.Promise[T] = js.native
    
    def hasClass(name: String): js.Promise[Boolean] = js.native
    
    def hover(): js.Promise[Unit] = js.native
    
    def isDisplayed(): js.Promise[Boolean] = js.native
    
    var mouse: MouseUniDriver[T] = js.native
    
    def pressKey(key: KeyDefinitionType): js.Promise[Unit] = js.native
    
    def scrollIntoView(): js.Promise[js.Object] = js.native
    
    def text(): js.Promise[String] = js.native
    
    var `type`: String = js.native
    
    def value(): js.Promise[String] = js.native
    
    def wait(timeout: Double): js.Promise[Unit] = js.native
  }
  
  trait UniDriverList[T] extends StObject {
    
    def count(): js.Promise[Double]
    
    def filter(predicate: PredicateFn): UniDriverList[Any]
    
    def get(idx: Double): UniDriver[T]
    
    def map[T](mapFn: MapFn[T]): js.Promise[js.Array[T]]
    
    def text(): js.Promise[js.Array[String]]
  }
  object UniDriverList {
    
    inline def apply[T](
      count: () => js.Promise[Double],
      filter: PredicateFn => UniDriverList[Any],
      get: Double => UniDriver[T],
      map: MapFn[Any] => js.Promise[js.Array[Any]],
      text: () => js.Promise[js.Array[String]]
    ): UniDriverList[T] = {
      val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), filter = js.Any.fromFunction1(filter), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[UniDriverList[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UniDriverList[?], T] (val x: Self & UniDriverList[T]) extends AnyVal {
      
      inline def setCount(value: () => js.Promise[Double]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setFilter(value: PredicateFn => UniDriverList[Any]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setGet(value: Double => UniDriver[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setMap(value: MapFn[Any] => js.Promise[js.Array[Any]]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setText(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
