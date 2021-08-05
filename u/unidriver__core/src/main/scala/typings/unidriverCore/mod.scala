package typings.unidriverCore

import typings.std.Error
import typings.unidriverCore.anon.Key
import typings.unidriverCore.keyTypesMod.KeyDefinitionType
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
  class MultipleElementsWithLocatorError protected ()
    extends StObject
       with Error {
    def this(count: Double, locator: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: ErrorTypes = js.native
  }
  
  @JSImport("@unidriver/core", "NoElementWithLocatorError")
  @js.native
  class NoElementWithLocatorError protected ()
    extends StObject
       with Error {
    def this(locator: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    var `type`: ErrorTypes = js.native
  }
  
  inline def delay(ms: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  inline def eventually(callback: js.Function0[Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Double, lastError: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Double, retryDelay: Unit, lastError: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Double, lastError: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def eventually(callback: js.Function0[Unit], timeout: Unit, retryDelay: Unit, lastError: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(callback.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], lastError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def getAllNonTextKeyTypes(): js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 248 */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllNonTextKeyTypes")().asInstanceOf[js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 248 */ js.Any
  ]]
  
  inline def getDefinitionForKeyType(keyType: KeyDefinitionType): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefinitionForKeyType")(keyType.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def isMultipleElementsWithLocatorError(e: Error): /* is @unidriver/core.@unidriver/core.MultipleElementsWithLocatorError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultipleElementsWithLocatorError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @unidriver/core.@unidriver/core.MultipleElementsWithLocatorError */ Boolean]
  
  inline def isNoElementWithLocatorError(e: Error): /* is @unidriver/core.@unidriver/core.NoElementWithLocatorError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoElementWithLocatorError")(e.asInstanceOf[js.Any]).asInstanceOf[/* is @unidriver/core.@unidriver/core.NoElementWithLocatorError */ Boolean]
  
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Double, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Double, retryDelay: Unit, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Double, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitFor(fn: js.Function0[js.Promise[Boolean]], timeout: Unit, retryDelay: Unit, customError: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitFor")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], retryDelay.asInstanceOf[js.Any], customError.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait EnterValueOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var shouldClear: js.UndefOr[Boolean] = js.undefined
  }
  object EnterValueOptions {
    
    inline def apply(): EnterValueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnterValueOptions]
    }
    
    extension [Self <: EnterValueOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setShouldClear(value: Boolean): Self = StObject.set(x, "shouldClear", value.asInstanceOf[js.Any])
      
      inline def setShouldClearUndefined: Self = StObject.set(x, "shouldClear", js.undefined)
    }
  }
  
  type Locator = String
  
  type MapFn[T] = js.Function3[
    /* e */ UniDriver[js.Any], 
    /* idx */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[UniDriver[js.Any]]], 
    js.Promise[T]
  ]
  
  trait MouseUniDriver[T] extends StObject {
    
    def moveTo(to: UniDriver[T]): js.Promise[Unit]
    
    def press(): js.Promise[Unit]
    
    def release(): js.Promise[Unit]
  }
  object MouseUniDriver {
    
    inline def apply[T](
      moveTo: UniDriver[T] => js.Promise[Unit],
      press: () => js.Promise[Unit],
      release: () => js.Promise[Unit]
    ): MouseUniDriver[T] = {
      val __obj = js.Dynamic.literal(moveTo = js.Any.fromFunction1(moveTo), press = js.Any.fromFunction0(press), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[MouseUniDriver[T]]
    }
    
    extension [Self <: MouseUniDriver[?], T](x: Self & MouseUniDriver[T]) {
      
      inline def setMoveTo(value: UniDriver[T] => js.Promise[Unit]): Self = StObject.set(x, "moveTo", js.Any.fromFunction1(value))
      
      inline def setPress(value: () => js.Promise[Unit]): Self = StObject.set(x, "press", js.Any.fromFunction0(value))
      
      inline def setRelease(value: () => js.Promise[Unit]): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
    }
  }
  
  type PredicateFn = js.Function3[
    /* e */ UniDriver[js.Any], 
    /* idx */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[UniDriver[js.Any]]], 
    js.Promise[Boolean]
  ]
  
  type ReducerFn[T] = js.Function4[
    /* acc */ T, 
    /* curr */ UniDriver[js.Any], 
    /* idx */ js.UndefOr[Double], 
    /* array */ js.UndefOr[js.Array[UniDriver[js.Any]]], 
    T
  ]
  
  @js.native
  trait UniDriver[T] extends StObject {
    
    @JSName("$")
    def $(selector: Locator): UniDriver[T] = js.native
    
    @JSName("$$")
    def DollarDollar(selector: Locator): UniDriverList[T] = js.native
    
    /** Gets a html element's property value by property name. @returns null if property is not defined */
    def _prop(name: String): js.Promise[js.Any] = js.native
    
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
    
    def filter(predicate: PredicateFn): UniDriverList[js.Any]
    
    def get(idx: Double): UniDriver[T]
    
    def map[T](mapFn: MapFn[T]): js.Promise[js.Array[T]]
    
    def text(): js.Promise[js.Array[String]]
  }
  object UniDriverList {
    
    inline def apply[T](
      count: () => js.Promise[Double],
      filter: PredicateFn => UniDriverList[js.Any],
      get: Double => UniDriver[T],
      map: MapFn[js.Any] => js.Promise[js.Array[js.Any]],
      text: () => js.Promise[js.Array[String]]
    ): UniDriverList[T] = {
      val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), filter = js.Any.fromFunction1(filter), get = js.Any.fromFunction1(get), map = js.Any.fromFunction1(map), text = js.Any.fromFunction0(text))
      __obj.asInstanceOf[UniDriverList[T]]
    }
    
    extension [Self <: UniDriverList[?], T](x: Self & UniDriverList[T]) {
      
      inline def setCount(value: () => js.Promise[Double]): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setFilter(value: PredicateFn => UniDriverList[js.Any]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setGet(value: Double => UniDriver[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setMap(value: MapFn[js.Any] => js.Promise[js.Array[js.Any]]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setText(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    }
  }
}
