package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.Object
import typings.std.PropertyKey
import typings.uirouterCore.stateObjectMod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonCommonMod {
  
  @JSImport("@uirouter/core/lib/common/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _extend(toObj: Obj, fromObjs: Obj*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(scala.List(toObj.asInstanceOf[js.Any]).`++`(fromObjs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def _inArray(array: js.Array[Any]): js.Function1[/* obj */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Boolean]]
  inline def _inArray(array: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
  inline def _pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
  inline def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def allTrueR(memo: Boolean, elem: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("allTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestors")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Array[StateObject]]
  
  inline def anyTrueR(memo: Boolean, elem: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("anyTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def applyPairs(memo: TypedMap[Any], keyValTuple: js.Array[Any]): TypedMap[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPairs")(memo.asInstanceOf[js.Any], keyValTuple.asInstanceOf[js.Any])).asInstanceOf[TypedMap[Any]]
  
  inline def arrayTuples(args: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayTuples")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def assertFn(predicateOrMap: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def assertFn(predicateOrMap: js.Function, errMsg: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def assertFn(predicateOrMap: js.Function, errMsg: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]
  inline def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]
  
  inline def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Predicate[T]]
  inline def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Predicate[T]]
  
  inline def copy(src: Obj): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def copy(src: Obj, dest: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: Unit, latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  inline def defaults(opts: Any, defaultsList: Obj*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(scala.List(opts.asInstanceOf[js.Any]).`++`(defaultsList.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def deregAll(functions: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregAll")(functions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@uirouter/core/lib/common/common", "equals")
  @js.native
  val equals_ : Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "extend")
  @js.native
  val extend: js.Function2[/* toObj */ Obj, /* repeated */ Obj, Any] = js.native
  
  inline def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedMap[T]]
  
  inline def find[T](collection: js.Array[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: TypedMap[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def flatten(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def flattenR(memo: js.Array[Any], elem: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("@uirouter/core/lib/common/common", "forEach")
  @js.native
  val forEach: Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "fromJson")
  @js.native
  val fromJson: Any = js.native
  
  inline def identity(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inArray(array: js.Array[Any]): js.Function1[/* obj */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Boolean]]
  inline def inArray(array: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inherit(parent: Obj): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def inherit(parent: Obj, extra: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def map[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  inline def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[U]]
  inline def map[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
  ): StringDictionary[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[U]]
  
  @JSImport("@uirouter/core/lib/common/common", "mapObj")
  @js.native
  def mapObj: js.Function3[
    /* collection */ StringDictionary[Any], 
    /* callback */ Mapper[Any, Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
    ], 
    StringDictionary[Any]
  ] = js.native
  inline def mapObj_=(
    x: js.Function3[
      /* collection */ StringDictionary[Any], 
      /* callback */ Mapper[Any, Any], 
      /* target */ js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ Any
      ], 
      StringDictionary[Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapObj")(x.asInstanceOf[js.Any])
  
  inline def mergeR(memo: Obj, item: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeR")(memo.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def noop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Any]
  
  inline def omit(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  inline def pairs(obj: Obj): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def pick(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  inline def pluck(collection: StringDictionary[Any], propName: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def pushR(arr: js.Array[Any], obj: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushR")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
  inline def pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
  inline def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("@uirouter/core/lib/common/common", "root")
  @js.native
  val root: Any = js.native
  
  inline def silenceUncaughtInPromise(promise: js.Promise[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silenceUncaughtInPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def silentRejection(error: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silentRejection")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def tail[T](arr: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(arr.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@uirouter/core/lib/common/common", "toJson")
  @js.native
  val toJson: Any = js.native
  
  inline def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqR")(acc.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def unnest(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unnest")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def unnestR(memo: js.Array[Any], elem: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unnestR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def values[T](obj: TypedMap[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type IInjectable = js.Function | js.Array[Any]
  
  type Mapper[X, T] = js.Function2[/* x */ X, /* key */ js.UndefOr[String | Double], T]
  
  trait Obj
    extends StObject
       with Object
       with /* key */ StringDictionary[Any]
  object Obj {
    
    inline def apply(
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
