package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Object {
  
  type Chainable[RawValue] = ChainableBase[RawValue]
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def add[T](obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    def add[T](obj: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def addAll[T](sources: typings.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def addAll[T](sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def average[T, U](): SugarDefaultChainable[Double] = js.native
    def average[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def average[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def clone(deep: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def count[T](search: T): SugarDefaultChainable[Double] = js.native
    def count[T](search: searchFn[T]): SugarDefaultChainable[Double] = js.native
    
    def defaults[T](sources: typings.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def defaults[T](sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def every[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def every[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def exclude[T](search: T): SugarDefaultChainable[js.Object] = js.native
    def exclude[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
    
    def filter[T](search: T): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def filter[T](search: searchFn[T]): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def find[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def find[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def forEach[T](
      eachFn: js.Function3[
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[js.Object] = js.native
    
    def get[T](key: java.lang.String): SugarDefaultChainable[T] = js.native
    def get[T](key: java.lang.String, inherited: Boolean): SugarDefaultChainable[T] = js.native
    
    def has(key: java.lang.String): SugarDefaultChainable[Boolean] = js.native
    def has(key: java.lang.String, inherited: Boolean): SugarDefaultChainable[Boolean] = js.native
    
    def intersect(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    
    def invert(): SugarDefaultChainable[js.Object] = js.native
    def invert(multi: Boolean): SugarDefaultChainable[js.Object] = js.native
    
    def isArguments(): SugarDefaultChainable[Boolean] = js.native
    
    def isArray(): SugarDefaultChainable[Boolean] = js.native
    
    def isBoolean(): SugarDefaultChainable[Boolean] = js.native
    
    def isDate(): SugarDefaultChainable[Boolean] = js.native
    
    def isEmpty(): SugarDefaultChainable[Boolean] = js.native
    
    def isEqual(obj: js.Object): SugarDefaultChainable[Boolean] = js.native
    
    def isError(): SugarDefaultChainable[Boolean] = js.native
    
    def isFunction(): SugarDefaultChainable[Boolean] = js.native
    
    def isMap(): SugarDefaultChainable[Boolean] = js.native
    
    def isNumber(): SugarDefaultChainable[Boolean] = js.native
    
    def isObject(): SugarDefaultChainable[Boolean] = js.native
    
    def isRegExp(): SugarDefaultChainable[Boolean] = js.native
    
    def isSet(): SugarDefaultChainable[Boolean] = js.native
    
    def isString(): SugarDefaultChainable[Boolean] = js.native
    
    def keys[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def least[T, U](): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def least[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def least[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def map[T, U](map: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def map[T, U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def max[T, U](): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def max[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def max[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def median[T, U](): SugarDefaultChainable[Double] = js.native
    def median[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def median[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def merge[T](source: js.Object): SugarDefaultChainable[js.Object] = js.native
    def merge[T](source: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def mergeAll[T](sources: typings.sugar.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
    def mergeAll[T](sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
    
    def min[T, U](): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def min[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def min[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def most[T, U](): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Unit, map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](all: Unit, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    def most[T, U](map: java.lang.String): SugarDefaultChainable[T] = js.native
    def most[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
    
    def none[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def none[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    var raw: RawValue = js.native
    
    def reduce[T](
      reduceFn: js.Function4[
          /* acc */ T, 
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ]
    ): SugarDefaultChainable[T] = js.native
    def reduce[T](
      reduceFn: js.Function4[
          /* acc */ T, 
          /* val */ T, 
          /* key */ java.lang.String, 
          /* obj */ js.Object, 
          SugarDefaultChainable[Unit]
        ],
      init: Any
    ): SugarDefaultChainable[T] = js.native
    
    def reject(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def reject(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def reject(find: typings.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def remove[T](search: T): SugarDefaultChainable[js.Object] = js.native
    def remove[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
    
    def select(find: java.lang.String): SugarDefaultChainable[js.Object] = js.native
    def select(find: js.Object): SugarDefaultChainable[js.Object] = js.native
    def select(find: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[js.Object] = js.native
    def select(find: typings.sugar.RegExp): SugarDefaultChainable[js.Object] = js.native
    
    def set[T](key: java.lang.String, `val`: T): SugarDefaultChainable[js.Object] = js.native
    
    def size(): SugarDefaultChainable[Double] = js.native
    
    def some[T](search: T): SugarDefaultChainable[Boolean] = js.native
    def some[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
    
    def subtract(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
    
    def sum[T, U](): SugarDefaultChainable[Double] = js.native
    def sum[T, U](map: java.lang.String): SugarDefaultChainable[Double] = js.native
    def sum[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
    
    def tap(tapFn: js.Function1[/* obj */ js.Object, SugarDefaultChainable[Any]]): SugarDefaultChainable[js.Object] = js.native
    
    def toQueryString[T, U](): SugarDefaultChainable[js.Object] = js.native
    def toQueryString[T, U](options: QueryStringOptions[T, U]): SugarDefaultChainable[js.Object] = js.native
    
    def values[T](): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
  }
  
  @js.native
  trait Constructor
    extends StObject
       with SugarNamespace
       with Instantiable0[Chainable[js.Object]]
       with Instantiable1[/* raw */ js.Object, Chainable[js.Object]] {
    
    def apply(): Chainable[js.Object] = js.native
    def apply(raw: js.Object): Chainable[js.Object] = js.native
    
    def add[T](instance: js.Object, obj: js.Object): js.Object = js.native
    def add[T](instance: js.Object, obj: js.Object, options: ObjectMergeOptions[T]): js.Object = js.native
    
    def addAll[T](instance: js.Object, sources: typings.sugar.Array[js.Object]): js.Object = js.native
    def addAll[T](instance: js.Object, sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
    
    def average[T, U](instance: js.Object): Double = js.native
    def average[T, U](instance: js.Object, map: java.lang.String): Double = js.native
    def average[T, U](instance: js.Object, map: mapFn[T, U]): Double = js.native
    
    def clone(instance: js.Object): js.Object = js.native
    def clone(instance: js.Object, deep: Boolean): js.Object = js.native
    
    def count[T](instance: js.Object, search: T): Double = js.native
    def count[T](instance: js.Object, search: searchFn[T]): Double = js.native
    
    def defaults[T](instance: js.Object, sources: typings.sugar.Array[js.Object]): js.Object = js.native
    def defaults[T](instance: js.Object, sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
    
    def every[T](instance: js.Object, search: T): Boolean = js.native
    def every[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
    
    def exclude[T](instance: js.Object, search: T): js.Object = js.native
    def exclude[T](instance: js.Object, search: searchFn[T]): js.Object = js.native
    
    def filter[T](instance: js.Object, search: T): typings.sugar.Array[T] = js.native
    def filter[T](instance: js.Object, search: searchFn[T]): typings.sugar.Array[T] = js.native
    
    def find[T](instance: js.Object, search: T): Boolean = js.native
    def find[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
    
    def forEach[T](
      instance: js.Object,
      eachFn: js.Function3[/* val */ T, /* key */ java.lang.String, /* obj */ js.Object, Unit]
    ): js.Object = js.native
    
    def fromQueryString[T, U](str: java.lang.String): js.Object = js.native
    def fromQueryString[T, U](str: java.lang.String, options: QueryStringParseOptions[T, U]): js.Object = js.native
    
    def get[T](instance: js.Object, key: java.lang.String): T = js.native
    def get[T](instance: js.Object, key: java.lang.String, inherited: Boolean): T = js.native
    
    def has(instance: js.Object, key: java.lang.String): Boolean = js.native
    def has(instance: js.Object, key: java.lang.String, inherited: Boolean): Boolean = js.native
    
    def intersect(instance: js.Object, obj: js.Object): js.Object = js.native
    
    def invert(instance: js.Object): js.Object = js.native
    def invert(instance: js.Object, multi: Boolean): js.Object = js.native
    
    def isArguments(instance: js.Object): Boolean = js.native
    
    def isArray(instance: Any): /* is sugar.Array<any> */ Boolean = js.native
    
    def isBoolean(instance: Any): /* is boolean */ Boolean = js.native
    
    def isDate(instance: Any): /* is sugar.Date */ Boolean = js.native
    
    def isEmpty(instance: js.Object): Boolean = js.native
    
    def isEqual(instance: js.Object, obj: js.Object): Boolean = js.native
    
    def isError(instance: Any): /* is std.Error */ Boolean = js.native
    
    def isFunction(instance: Any): /* is sugar.Function */ Boolean = js.native
    
    def isMap(instance: Any): /* is std.Map<any, any> */ Boolean = js.native
    
    def isNumber(instance: Any): /* is number */ Boolean = js.native
    
    def isObject(instance: js.Object): Boolean = js.native
    
    def isRegExp(instance: Any): /* is sugar.RegExp */ Boolean = js.native
    
    def isSet(instance: Any): /* is std.Set<any> */ Boolean = js.native
    
    def isString(instance: Any): /* is string */ Boolean = js.native
    
    def keys[T](instance: js.Object): typings.sugar.Array[T] = js.native
    
    def least[T, U](instance: js.Object): T = js.native
    def least[T, U](instance: js.Object, all: Boolean): T = js.native
    def least[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
    def least[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
    def least[T, U](instance: js.Object, all: Unit, map: java.lang.String): T = js.native
    def least[T, U](instance: js.Object, all: Unit, map: mapFn[T, U]): T = js.native
    def least[T, U](instance: js.Object, map: java.lang.String): T = js.native
    def least[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
    
    def map[T, U](instance: js.Object, map: java.lang.String): js.Object = js.native
    def map[T, U](instance: js.Object, map: mapFn[T, U]): js.Object = js.native
    
    def max[T, U](instance: js.Object): T = js.native
    def max[T, U](instance: js.Object, all: Boolean): T = js.native
    def max[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
    def max[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
    def max[T, U](instance: js.Object, all: Unit, map: java.lang.String): T = js.native
    def max[T, U](instance: js.Object, all: Unit, map: mapFn[T, U]): T = js.native
    def max[T, U](instance: js.Object, map: java.lang.String): T = js.native
    def max[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
    
    def median[T, U](instance: js.Object): Double = js.native
    def median[T, U](instance: js.Object, map: java.lang.String): Double = js.native
    def median[T, U](instance: js.Object, map: mapFn[T, U]): Double = js.native
    
    def merge[T](instance: js.Object, source: js.Object): js.Object = js.native
    def merge[T](instance: js.Object, source: js.Object, options: ObjectMergeOptions[T]): js.Object = js.native
    
    def mergeAll[T](instance: js.Object, sources: typings.sugar.Array[js.Object]): js.Object = js.native
    def mergeAll[T](instance: js.Object, sources: typings.sugar.Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
    
    def min[T, U](instance: js.Object): T = js.native
    def min[T, U](instance: js.Object, all: Boolean): T = js.native
    def min[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
    def min[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
    def min[T, U](instance: js.Object, all: Unit, map: java.lang.String): T = js.native
    def min[T, U](instance: js.Object, all: Unit, map: mapFn[T, U]): T = js.native
    def min[T, U](instance: js.Object, map: java.lang.String): T = js.native
    def min[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
    
    def most[T, U](instance: js.Object): T = js.native
    def most[T, U](instance: js.Object, all: Boolean): T = js.native
    def most[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
    def most[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
    def most[T, U](instance: js.Object, all: Unit, map: java.lang.String): T = js.native
    def most[T, U](instance: js.Object, all: Unit, map: mapFn[T, U]): T = js.native
    def most[T, U](instance: js.Object, map: java.lang.String): T = js.native
    def most[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
    
    def none[T](instance: js.Object, search: T): Boolean = js.native
    def none[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
    
    def reduce[T](
      instance: js.Object,
      reduceFn: js.Function4[/* acc */ T, /* val */ T, /* key */ java.lang.String, /* obj */ js.Object, Unit]
    ): T = js.native
    def reduce[T](
      instance: js.Object,
      reduceFn: js.Function4[/* acc */ T, /* val */ T, /* key */ java.lang.String, /* obj */ js.Object, Unit],
      init: Any
    ): T = js.native
    
    def reject(instance: js.Object, find: java.lang.String): js.Object = js.native
    def reject(instance: js.Object, find: js.Object): js.Object = js.native
    def reject(instance: js.Object, find: typings.sugar.Array[java.lang.String]): js.Object = js.native
    def reject(instance: js.Object, find: typings.sugar.RegExp): js.Object = js.native
    
    def remove[T](instance: js.Object, search: T): js.Object = js.native
    def remove[T](instance: js.Object, search: searchFn[T]): js.Object = js.native
    
    def select(instance: js.Object, find: java.lang.String): js.Object = js.native
    def select(instance: js.Object, find: js.Object): js.Object = js.native
    def select(instance: js.Object, find: typings.sugar.Array[java.lang.String]): js.Object = js.native
    def select(instance: js.Object, find: typings.sugar.RegExp): js.Object = js.native
    
    def set[T](instance: js.Object, key: java.lang.String, `val`: T): js.Object = js.native
    
    def size(instance: js.Object): Double = js.native
    
    def some[T](instance: js.Object, search: T): Boolean = js.native
    def some[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
    
    def subtract(instance: js.Object, obj: js.Object): js.Object = js.native
    
    def sum[T, U](instance: js.Object): Double = js.native
    def sum[T, U](instance: js.Object, map: java.lang.String): Double = js.native
    def sum[T, U](instance: js.Object, map: mapFn[T, U]): Double = js.native
    
    def tap(instance: js.Object, tapFn: js.Function1[/* obj */ js.Object, Any]): js.Object = js.native
    
    def toQueryString[T, U](instance: js.Object): js.Object = js.native
    def toQueryString[T, U](instance: js.Object, options: QueryStringOptions[T, U]): js.Object = js.native
    
    def values[T](instance: js.Object): typings.sugar.Array[T] = js.native
  }
  
  trait ObjectMergeOptions[T] extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var descriptor: js.UndefOr[Boolean] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var resolve: js.UndefOr[Boolean | resolveFn[T]] = js.undefined
  }
  object ObjectMergeOptions {
    
    inline def apply[T](): ObjectMergeOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectMergeOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectMergeOptions[?], T] (val x: Self & ObjectMergeOptions[T]) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setDescriptor(value: Boolean): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
      
      inline def setDescriptorUndefined: Self = StObject.set(x, "descriptor", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setResolve(value: Boolean | resolveFn[T]): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveFunction5(
        value: (/* key */ java.lang.String, T, T, /* target */ js.Object, /* source */ js.Object) => Boolean
      ): Self = StObject.set(x, "resolve", js.Any.fromFunction5(value))
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  trait QueryStringOptions[T, U] extends StObject {
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[java.lang.String] = js.undefined
    
    var separator: js.UndefOr[java.lang.String] = js.undefined
    
    var transform: js.UndefOr[js.Function3[/* key */ java.lang.String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
  }
  object QueryStringOptions {
    
    inline def apply[T, U](): QueryStringOptions[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryStringOptions[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryStringOptions[?, ?], T, U] (val x: Self & (QueryStringOptions[T, U])) extends AnyVal {
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setPrefix(value: java.lang.String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSeparator(value: java.lang.String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTransform(value: (/* key */ java.lang.String, /* val */ T, /* obj */ js.Object) => U): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  trait QueryStringParseOptions[T, U] extends StObject {
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var deep: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[java.lang.String] = js.undefined
    
    var transform: js.UndefOr[js.Function3[/* key */ java.lang.String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
  }
  object QueryStringParseOptions {
    
    inline def apply[T, U](): QueryStringParseOptions[T, U] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryStringParseOptions[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryStringParseOptions[?, ?], T, U] (val x: Self & (QueryStringParseOptions[T, U])) extends AnyVal {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      inline def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
      
      inline def setSeparator(value: java.lang.String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTransform(value: (/* key */ java.lang.String, /* val */ T, /* obj */ js.Object) => U): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type mapFn[T, U] = js.Function3[/* val */ T, /* key */ java.lang.String, /* obj */ js.Object, U]
  
  type resolveFn[T] = js.Function5[
    /* key */ java.lang.String, 
    /* targetVal */ T, 
    /* sourceVal */ T, 
    /* target */ js.Object, 
    /* source */ js.Object, 
    Boolean
  ]
  
  type searchFn[T] = js.Function3[/* key */ java.lang.String, /* val */ T, /* obj */ js.Object, Boolean]
}
