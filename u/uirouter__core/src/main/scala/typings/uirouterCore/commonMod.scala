package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.commonCommonMod.Mapper
import typings.uirouterCore.commonCommonMod.Obj
import typings.uirouterCore.commonCommonMod.Predicate
import typings.uirouterCore.commonCommonMod.TypedMap
import typings.uirouterCore.coreservicesMod.CoreServices
import typings.uirouterCore.stateObjectMod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("@uirouter/core/lib/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Trace categories Enum
    *
    * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
    *
    * `trace.enable(Category.TRANSITION)`
    *
    * These can also be provided using a matching string, or position ordinal
    *
    * `trace.enable("TRANSITION")`
    *
    * `trace.enable(1)`
    */
  @JSImport("@uirouter/core/lib/common", "Category")
  @js.native
  object Category extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.traceMod.Category & Double] = js.native
    
    /* 2 */ val HOOK: typings.uirouterCore.traceMod.Category.HOOK & Double = js.native
    
    /* 0 */ val RESOLVE: typings.uirouterCore.traceMod.Category.RESOLVE & Double = js.native
    
    /* 1 */ val TRANSITION: typings.uirouterCore.traceMod.Category.TRANSITION & Double = js.native
    
    /* 3 */ val UIVIEW: typings.uirouterCore.traceMod.Category.UIVIEW & Double = js.native
    
    /* 4 */ val VIEWCONFIG: typings.uirouterCore.traceMod.Category.VIEWCONFIG & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/common", "Glob")
  @js.native
  open class Glob protected ()
    extends typings.uirouterCore.globMod.Glob {
    def this(text: String) = this()
  }
  /* static members */
  object Glob {
    
    @JSImport("@uirouter/core/lib/common", "Glob")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    inline def fromString(text: String): typings.uirouterCore.globMod.Glob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.globMod.Glob]
    
    /** Returns true if the string has glob-like characters in it */
    inline def is(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@uirouter/core/lib/common", "Queue")
  @js.native
  open class Queue[T] ()
    extends typings.uirouterCore.queueMod.Queue[T] {
    def this(_items: js.Array[T]) = this()
    def this(_items: js.Array[T], _limit: Double) = this()
    def this(_items: Unit, _limit: Double) = this()
  }
  
  @JSImport("@uirouter/core/lib/common", "Trace")
  @js.native
  /** @internal */
  open class Trace_ ()
    extends typings.uirouterCore.traceMod.Trace_
  
  inline def _extend(toObj: Obj, fromObjs: Obj*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(List(toObj.asInstanceOf[js.Any]).`++`(fromObjs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def _inArray(array: js.Array[Any]): js.Function1[/* obj */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Boolean]]
  inline def _inArray(array: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
  inline def _pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
  inline def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def all(fn1: Predicate[Any]): js.Function1[/* arr */ js.Array[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Any], Boolean]]
  
  inline def allTrueR(memo: Boolean, elem: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("allTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestors")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Array[StateObject]]
  
  inline def and(fn1: Predicate[Any], fn2: Predicate[Any]): Predicate[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[Any]]
  
  inline def any(fn1: Predicate[Any]): js.Function1[/* arr */ js.Array[Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[Any], Boolean]]
  
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
  
  inline def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAfterSubstr")(char.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  inline def compose(): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function0[Any]]
  
  inline def copy(src: Obj): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def copy(src: Obj, dest: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[String], latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  inline def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: Unit, latebind: Boolean): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  inline def curry(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def defaults(opts: Any, defaultsList: Obj*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(List(opts.asInstanceOf[js.Any]).`++`(defaultsList.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def deregAll(functions: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregAll")(functions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def eq_(comp: Any): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(comp.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]
  
  @JSImport("@uirouter/core/lib/common", "equals")
  @js.native
  val equals_ : Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "extend")
  @js.native
  val extend: js.Function2[/* toObj */ Obj, /* repeated */ Obj, Any] = js.native
  
  inline def filter[T](collection: js.Array[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[Double], Boolean]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def filter[T](collection: TypedMap[T], callback: js.Function2[/* t */ T, /* key */ js.UndefOr[String], Boolean]): TypedMap[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypedMap[T]]
  
  inline def find[T](collection: js.Array[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def find[T](collection: TypedMap[T], callback: Predicate[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def flatten(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def flattenR(memo: js.Array[Any], elem: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def fnToString(fn: IInjectable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fnToString")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@uirouter/core/lib/common", "forEach")
  @js.native
  val forEach: Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "fromJson")
  @js.native
  val fromJson: Any = js.native
  
  inline def functionToString(fn: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionToString")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("@uirouter/core/lib/common", "hostRegex")
  @js.native
  val hostRegex: js.RegExp = js.native
  
  inline def identity(x: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def inArray(array: js.Array[Any]): js.Function1[/* obj */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Boolean]]
  inline def inArray(array: js.Array[Any], obj: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def inherit(parent: Obj): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def inherit(parent: Obj, extra: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def invoke(fnName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  inline def invoke(fnName: String, args: js.Array[Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def is[T](ctor: Instantiable1[/* args (repeated) */ Any, T]): js.Function1[/* obj */ Any, /* is T */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, /* is T */ Boolean]]
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isDate(x: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @JSImport("@uirouter/core/lib/common", "isDefined")
  @js.native
  val isDefined: Predicate[Any] = js.native
  
  inline def isFunction(x: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isInjectable(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNull(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@uirouter/core/lib/common", "isNullOrUndefined")
  @js.native
  val isNullOrUndefined: Predicate[Any] = js.native
  
  inline def isNumber(x: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPromise(x: Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  inline def isRegExp(x: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(x: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isUndefined(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def joinNeighborsR(acc: js.Array[Any], x: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinNeighborsR")(acc.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def kebobString(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebobString")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeStub[T](service: String, methods: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStub")(service.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  
  @JSImport("@uirouter/core/lib/common", "mapObj")
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
  
  inline def maxLength(max: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(max.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mergeR(memo: Obj, item: Obj): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeR")(memo.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def noop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Any]
  
  inline def not(fn: Predicate[Any]): Predicate[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(fn.asInstanceOf[js.Any]).asInstanceOf[Predicate[Any]]
  
  inline def omit(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  inline def or(fn1: Predicate[Any], fn2: Predicate[Any]): Predicate[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[Any]]
  
  inline def padString(length: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padString")(length.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pairs(obj: Obj): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def parse(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def pick(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  inline def pipe(funcs: js.Function*): js.Function1[/* obj */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* obj */ Any, Any]]
  
  inline def pluck(collection: StringDictionary[Any], propName: String): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def prop(name: String): js.Function1[/* obj */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ Any, Any]]
  
  @JSImport("@uirouter/core/lib/common", "propEq")
  @js.native
  val propEq: js.Function = js.native
  
  inline def pushR(arr: js.Array[Any], obj: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pushR")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
  inline def pushTo[T](arr: js.Array[T], `val`: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
  inline def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("@uirouter/core/lib/common", "root")
  @js.native
  val root: Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "services")
  @js.native
  val services: CoreServices = js.native
  
  inline def silenceUncaughtInPromise(promise: js.Promise[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silenceUncaughtInPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def silentRejection(error: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silentRejection")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def splitEqual(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitEqual")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splitHash(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHash")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitOnDelim")(delim.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  inline def splitQuery(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQuery")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringify(o: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stripLastPathElement(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLastPathElement")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def tail[T](arr: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(arr.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@uirouter/core/lib/common", "toJson")
  @js.native
  val toJson: Any = js.native
  
  /**
    * The [[Trace]] singleton
    *
    * #### Example:
    * ```js
    * import {trace} from "@uirouter/core";
    * trace.enable(1, 5);
    * ```
    */
  @JSImport("@uirouter/core/lib/common", "trace")
  @js.native
  val trace: typings.uirouterCore.traceMod.Trace_ = js.native
  
  inline def trimHashVal(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimHashVal")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqR")(acc.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def unnest(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unnest")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def unnestR(memo: js.Array[Any], elem: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unnestR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def `val`[T](v: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
  
  inline def values[T](obj: TypedMap[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
