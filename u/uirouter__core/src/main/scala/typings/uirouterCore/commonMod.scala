package typings.uirouterCore

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
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
  class Glob protected ()
    extends typings.uirouterCore.globMod.Glob {
    def this(text: String) = this()
  }
  /* static members */
  object Glob {
    
    @JSImport("@uirouter/core/lib/common", "Glob")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    @scala.inline
    def fromString(text: String): typings.uirouterCore.globMod.Glob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.globMod.Glob]
    
    /** Returns true if the string has glob-like characters in it */
    @scala.inline
    def is(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@uirouter/core/lib/common", "Queue")
  @js.native
  class Queue[T] ()
    extends typings.uirouterCore.queueMod.Queue[T] {
    def this(_items: js.Array[T]) = this()
    def this(_items: js.Array[T], _limit: Double) = this()
    def this(_items: Unit, _limit: Double) = this()
  }
  
  @JSImport("@uirouter/core/lib/common", "Trace")
  @js.native
  /** @internal */
  class Trace_ ()
    extends typings.uirouterCore.traceMod.Trace_
  
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
  def all(fn1: Predicate[js.Any]): js.Function1[/* arr */ js.Array[js.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[js.Any], Boolean]]
  
  @scala.inline
  def allTrueR(memo: Boolean, elem: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("allTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def ancestors(first: StateObject, second: StateObject): js.Array[StateObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("ancestors")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Array[StateObject]]
  
  @scala.inline
  def and(fn1: Predicate[js.Any], fn2: Predicate[js.Any]): Predicate[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def any(fn1: Predicate[js.Any]): js.Function1[/* arr */ js.Array[js.Any], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[js.Any], Boolean]]
  
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
  def beforeAfterSubstr(char: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeAfterSubstr")(char.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  @scala.inline
  def compose(): js.Function0[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function0[js.Any]]
  
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
  def curry(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opts.asInstanceOf[js.Any], defaultsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def deregAll(functions: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregAll")(functions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def eq_(comp: js.Any): Predicate[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(comp.asInstanceOf[js.Any]).asInstanceOf[Predicate[js.Any]]
  
  @JSImport("@uirouter/core/lib/common", "equals")
  @js.native
  val equals_ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "extend")
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
  
  @scala.inline
  def fnToString(fn: IInjectable): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fnToString")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@uirouter/core/lib/common", "forEach")
  @js.native
  val forEach: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "fromJson")
  @js.native
  val fromJson: js.Any = js.native
  
  @scala.inline
  def functionToString(fn: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionToString")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("@uirouter/core/lib/common", "hostRegex")
  @js.native
  val hostRegex: RegExp = js.native
  
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
  def invoke(fnName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def invoke(fnName: String, args: js.Array[js.Any]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def is[T](ctor: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, /* is T */ Boolean]]
  
  @scala.inline
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  @scala.inline
  def isDate(x: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  @JSImport("@uirouter/core/lib/common", "isDefined")
  @js.native
  val isDefined: Predicate[js.Any] = js.native
  
  @scala.inline
  def isFunction(x: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isInjectable(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjectable")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNull(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("@uirouter/core/lib/common", "isNullOrUndefined")
  @js.native
  val isNullOrUndefined: Predicate[js.Any] = js.native
  
  @scala.inline
  def isNumber(x: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @scala.inline
  def isObject(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isPromise(x: js.Any): /* is std.Promise<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ Boolean]
  
  @scala.inline
  def isRegExp(x: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  @scala.inline
  def isString(x: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  @scala.inline
  def isUndefined(x: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def joinNeighborsR(acc: js.Array[js.Any], x: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("joinNeighborsR")(acc.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def kebobString(camelCase: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("kebobString")(camelCase.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def makeStub[T](service: String, methods: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStub")(service.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  
  @JSImport("@uirouter/core/lib/common", "mapObj")
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
  def maxLength(max: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(max.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def mergeR(memo: Obj, item: Obj): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeR")(memo.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def noop(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Any]
  
  @scala.inline
  def not(fn: Predicate[js.Any]): Predicate[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(fn.asInstanceOf[js.Any]).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def omit(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  @scala.inline
  def or(fn1: Predicate[js.Any], fn2: Predicate[js.Any]): Predicate[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[Predicate[js.Any]]
  
  @scala.inline
  def padString(length: Double, str: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padString")(length.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pairs(obj: Obj): js.Array[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]
  
  @scala.inline
  def parse(name: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def pick(obj: Obj, propNames: js.Array[String]): Obj = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[Obj]
  
  @scala.inline
  def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]
  
  @scala.inline
  def pluck(collection: StringDictionary[js.Any], propName: String): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def pluck[T](collection: js.Array[Obj], propName: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def prop(name: String): js.Function1[/* obj */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]
  
  @JSImport("@uirouter/core/lib/common", "propEq")
  @js.native
  val propEq: js.Function = js.native
  
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
  
  @JSImport("@uirouter/core/lib/common", "root")
  @js.native
  val root: js.Any = js.native
  
  @JSImport("@uirouter/core/lib/common", "services")
  @js.native
  val services: CoreServices = js.native
  
  @scala.inline
  def silenceUncaughtInPromise(promise: js.Promise[js.Any]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silenceUncaughtInPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def silentRejection(error: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("silentRejection")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def splitEqual(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitEqual")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def splitHash(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitHash")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def splitOnDelim(delim: String): js.Function1[/* str */ String, js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitOnDelim")(delim.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ String, js.Array[String]]]
  
  @scala.inline
  def splitQuery(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitQuery")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def stringify(o: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stripLastPathElement(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripLastPathElement")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def tail[T](arr: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tail")(arr.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@uirouter/core/lib/common", "toJson")
  @js.native
  val toJson: js.Any = js.native
  
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
  
  @scala.inline
  def trimHashVal(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimHashVal")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqR")(acc.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def unnest(arr: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unnest")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def unnestR(memo: js.Array[js.Any], elem: js.Array[js.Any]): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unnestR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def `val`[T](v: T): js.Function0[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("val")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]
  
  @scala.inline
  def values[T](obj: TypedMap[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
