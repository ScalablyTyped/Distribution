package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import typings.uirouterCore.stateObjectMod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonCommonMod {
  
  @JSImport("@uirouter/core/lib/common/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "_extend")
  @js.native
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "_inArray")
  @js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  @JSImport("@uirouter/core/lib/common/common", "_inArray")
  @js.native
  def _inArray(array: js.Array[_], obj: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "_pushTo")
  @js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  @JSImport("@uirouter/core/lib/common/common", "_pushTo")
  @js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "_removeFrom")
  @js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  @JSImport("@uirouter/core/lib/common/common", "_removeFrom")
  @js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "allTrueR")
  @js.native
  def allTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "ancestors")
  @js.native
  def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "anyTrueR")
  @js.native
  def anyTrueR(memo: Boolean, elem: js.Any): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "applyPairs")
  @js.native
  def applyPairs(memo: TypedMap[_], keyValTuple: js.Array[_]): TypedMap[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "arrayTuples")
  @js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "assertFn")
  @js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  @JSImport("@uirouter/core/lib/common/common", "assertFn")
  @js.native
  def assertFn(predicateOrMap: js.Function, errMsg: String): js.Any = js.native
  @JSImport("@uirouter/core/lib/common/common", "assertFn")
  @js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "assertMap")
  @js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = js.native
  @JSImport("@uirouter/core/lib/common/common", "assertMap")
  @js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "assertPredicate")
  @js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = js.native
  @JSImport("@uirouter/core/lib/common/common", "assertPredicate")
  @js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "copy")
  @js.native
  def copy(src: Obj): js.Any = js.native
  @JSImport("@uirouter/core/lib/common/common", "copy")
  @js.native
  def copy(src: Obj, dest: Obj): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = js.native
  @JSImport("@uirouter/core/lib/common/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(
    source: js.Function,
    target: Obj,
    bind: js.Function,
    fnNames: js.UndefOr[scala.Nothing],
    latebind: Boolean
  ): Obj = js.native
  @JSImport("@uirouter/core/lib/common/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = js.native
  @JSImport("@uirouter/core/lib/common/common", "createProxyFunctions")
  @js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "defaults")
  @js.native
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "deregAll")
  @js.native
  def deregAll(functions: js.Array[js.Function]): Unit = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "equals")
  @js.native
  val equals_ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "extend")
  @js.native
  val extend: js.Function2[/* toObj */ Obj, /* repeated */ Obj, js.Any] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "filter")
  @js.native
  def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = js.native
  @JSImport("@uirouter/core/lib/common/common", "filter")
  @js.native
  def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "find")
  @js.native
  def find[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  @JSImport("@uirouter/core/lib/common/common", "find")
  @js.native
  def find[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "flatten")
  @js.native
  def flatten(arr: js.Array[_]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "flattenR")
  @js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "forEach")
  @js.native
  val forEach: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "fromJson")
  @js.native
  val fromJson: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "identity")
  @js.native
  def identity(x: js.Any): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "inArray")
  @js.native
  def inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, Boolean] = js.native
  @JSImport("@uirouter/core/lib/common/common", "inArray")
  @js.native
  def inArray(array: js.Array[_], obj: js.Any): Boolean = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "inherit")
  @js.native
  def inherit(parent: Obj): js.Any = js.native
  @JSImport("@uirouter/core/lib/common/common", "inherit")
  @js.native
  def inherit(parent: Obj, extra: Obj): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "map")
  @js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  @JSImport("@uirouter/core/lib/common/common", "map")
  @js.native
  def map[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = js.native
  @JSImport("@uirouter/core/lib/common/common", "map")
  @js.native
  def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = js.native
  @JSImport("@uirouter/core/lib/common/common", "map")
  @js.native
  def map[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): StringDictionary[U] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "mapObj")
  @js.native
  def mapObj: js.Function3[
    /* collection */ StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    StringDictionary[js.Any]
  ] = js.native
  @scala.inline
  def mapObj_=(
    x: js.Function3[
      /* collection */ StringDictionary[js.Any], 
      /* callback */ Mapper[js.Any, js.Any], 
      /* target */ js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
      ], 
      StringDictionary[js.Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapObj")(x.asInstanceOf[js.Any])
  
  @JSImport("@uirouter/core/lib/common/common", "mergeR")
  @js.native
  def mergeR(memo: Obj, item: Obj): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "noop")
  @js.native
  def noop(): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "omit")
  @js.native
  def omit(obj: Obj, propNames: js.Array[String]): Obj = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "pairs")
  @js.native
  def pairs(obj: Obj): js.Array[js.Array[_]] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "pick")
  @js.native
  def pick(obj: Obj, propNames: js.Array[String]): Obj = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "pluck")
  @js.native
  def pluck(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = js.native
  @JSImport("@uirouter/core/lib/common/common", "pluck")
  @js.native
  def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "pushR")
  @js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "pushTo")
  @js.native
  def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  @JSImport("@uirouter/core/lib/common/common", "pushTo")
  @js.native
  def pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "removeFrom")
  @js.native
  def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  @JSImport("@uirouter/core/lib/common/common", "removeFrom")
  @js.native
  def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "root")
  @js.native
  val root: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "silenceUncaughtInPromise")
  @js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "silentRejection")
  @js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "tail")
  @js.native
  def tail[T](arr: js.Array[T]): T = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "toJson")
  @js.native
  val toJson: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "uniqR")
  @js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "unnest")
  @js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "unnestR")
  @js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "values")
  @js.native
  def values[T](obj: TypedMap[T]): js.Array[T] = js.native
  
  type IInjectable = js.Function | js.Array[js.Any]
  
  type Mapper[X, T] = js.Function2[/* x */ X, /* key */ js.UndefOr[String | Double], T]
  
  @js.native
  trait Obj
    extends Object
       with /* key */ StringDictionary[js.Any]
  object Obj {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Obj = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Obj]
    }
  }
  
  type Predicate[X] = js.Function1[/* x */ js.UndefOr[X], Boolean]
  
  type PredicateBinary[X, Y] = js.Function2[/* x */ js.UndefOr[X], /* y */ js.UndefOr[Y], Boolean]
  
  type TypedMap[T] = StringDictionary[T]
}
