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
  
  @scala.inline
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(toObj.asInstanceOf[js.Any], fromObjs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def _inArray(array: js.Array[js.Any]): js.Function1[/* obj */ js.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, Boolean]]
  @scala.inline
  def _inArray(array: js.Array[js.Any], obj: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
  @scala.inline
  def _pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
  @scala.inline
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def allTrueR(memo: Boolean, elem: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("allTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestors")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Array[StateObject]]
  
  @scala.inline
  def anyTrueR(memo: Boolean, elem: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("anyTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def applyPairs(memo: TypedMap[js.Any], keyValTuple: js.Array[js.Any]): TypedMap[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPairs")(memo.asInstanceOf[js.Any], keyValTuple.asInstanceOf[js.Any])).asInstanceOf[TypedMap[js.Any]]
  
  @scala.inline
  def arrayTuples(args: js.Any*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayTuples")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def assertFn(predicateOrMap: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def assertFn(predicateOrMap: js.Function, errMsg: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: String): js.Function1[/* t */ T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]
  @scala.inline
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]
  
  @scala.inline
  def assertPredicate[T](predicate: Predicate[T], errMsg: String): Predicate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Predicate[T]]
  @scala.inline
  def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[Predicate[T]]
  
  @scala.inline
  def copy(src: Obj): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def copy(src: Obj, dest: Obj): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  @scala.inline
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  @scala.inline
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  @scala.inline
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: Unit, latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  @scala.inline
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opts.asInstanceOf[js.Any], defaultsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def deregAll(functions: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregAll")(functions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@uirouter/core/lib/common/common", "equals")
  @js.native
  val equals_ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "extend")
  @js.native
  val extend: js.Function2[/* toObj */ Obj, /* repeated */ Obj, js.Any] = js.native
  
  @scala.inline
  def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  @scala.inline
  def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedMap[T]]
  
  @scala.inline
  def find[T](collection: js.Array[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def find[T](collection: TypedMap[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def flatten(arr: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def flattenR(memo: js.Array[js.Any], elem: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @JSImport("@uirouter/core/lib/common/common", "forEach")
  @js.native
  val forEach: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common/common", "fromJson")
  @js.native
  val fromJson: js.Any = js.native
  
  @scala.inline
  def identity(x: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def inArray(array: js.Array[js.Any]): js.Function1[/* obj */ js.Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, Boolean]]
  @scala.inline
  def inArray(array: js.Array[js.Any], obj: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def inherit(parent: Obj): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def inherit(parent: Obj, extra: Obj): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  @scala.inline
  def map[T, U](
    collection: js.Array[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): js.Array[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
  @scala.inline
  def map[T, U](collection: StringDictionary[T], callback: Mapper[T, U]): StringDictionary[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[U]]
  @scala.inline
  def map[T, U](
    collection: StringDictionary[T],
    callback: Mapper[T, U],
    target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ): StringDictionary[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[U]]
  
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
  
  @scala.inline
  def mergeR(memo: Obj, item: Obj): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeR")(memo.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def noop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Any]
  
  @scala.inline
  def omit(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  @scala.inline
  def pairs(obj: Obj): js.Array[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  @scala.inline
  def pick(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  @scala.inline
  def pluck(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def pushR(arr: js.Array[js.Any], obj: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushR")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
  @scala.inline
  def pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
  @scala.inline
  def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("@uirouter/core/lib/common/common", "root")
  @js.native
  val root: js.Any = js.native
  
  @scala.inline
  def silenceUncaughtInPromise(promise: js.Promise[js.Any]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silenceUncaughtInPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def silentRejection(error: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silentRejection")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def tail[T](arr: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(arr.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@uirouter/core/lib/common/common", "toJson")
  @js.native
  val toJson: js.Any = js.native
  
  @scala.inline
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqR")(acc.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def unnest(arr: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unnest")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def unnestR(memo: js.Array[js.Any], elem: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unnestR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def values[T](obj: TypedMap[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  type IInjectable = js.Function | js.Array[js.Any]
  
  type Mapper[X, T] = js.Function2[/* x */ X, /* key */ js.UndefOr[String | Double], T]
  
  trait Obj
    extends StObject
       with Object
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
