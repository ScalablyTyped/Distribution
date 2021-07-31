package typings.uirouterCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def NATIVE_INJECTOR_TOKEN: java.lang.String = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("NATIVE_INJECTOR_TOKEN").asInstanceOf[java.lang.String]

@scala.inline
def _extend(
  toObj: typings.uirouterCore.commonCommonMod.Obj,
  fromObjs: typings.uirouterCore.commonCommonMod.Obj*
): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_extend")(toObj.asInstanceOf[js.Any], fromObjs.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def _inArray(array: js.Array[js.Any]): js.Function1[/* obj */ js.Any, scala.Boolean] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, scala.Boolean]]
@scala.inline
def _inArray(array: js.Array[js.Any], obj: js.Any): scala.Boolean = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

@scala.inline
def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
@scala.inline
def _pushTo[T](arr: js.Array[T], `val`: T): T = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
@scala.inline
def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("_removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

@scala.inline
def all(fn1: typings.uirouterCore.commonCommonMod.Predicate[js.Any]): js.Function1[/* arr */ js.Array[js.Any], scala.Boolean] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("all")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[js.Any], scala.Boolean]]

@scala.inline
def allTrueR(memo: scala.Boolean, elem: js.Any): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("allTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def ancestors(
  first: typings.uirouterCore.stateObjectMod.StateObject,
  second: typings.uirouterCore.stateObjectMod.StateObject
): js.Array[typings.uirouterCore.stateObjectMod.StateObject] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ancestors")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.uirouterCore.stateObjectMod.StateObject]]

@scala.inline
def and(
  fn1: typings.uirouterCore.commonCommonMod.Predicate[js.Any],
  fn2: typings.uirouterCore.commonCommonMod.Predicate[js.Any]
): typings.uirouterCore.commonCommonMod.Predicate[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("and")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[js.Any]]

@scala.inline
def any(fn1: typings.uirouterCore.commonCommonMod.Predicate[js.Any]): js.Function1[/* arr */ js.Array[js.Any], scala.Boolean] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("any")(fn1.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arr */ js.Array[js.Any], scala.Boolean]]

@scala.inline
def anyTrueR(memo: scala.Boolean, elem: js.Any): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("anyTrueR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def applyPairs(memo: typings.uirouterCore.commonCommonMod.TypedMap[js.Any], keyValTuple: js.Array[js.Any]): typings.uirouterCore.commonCommonMod.TypedMap[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPairs")(memo.asInstanceOf[js.Any], keyValTuple.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.TypedMap[js.Any]]

@scala.inline
def arrayTuples(args: js.Any*): js.Array[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("arrayTuples")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]

@scala.inline
def assertFn(predicateOrMap: js.Function): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def assertFn(predicateOrMap: js.Function, errMsg: java.lang.String): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Any]
@scala.inline
def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertFn")(predicateOrMap.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: java.lang.String): js.Function1[/* t */ T, U] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]
@scala.inline
def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertMap")(mapFn.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ T, U]]

@scala.inline
def assertPredicate[T](predicate: typings.uirouterCore.commonCommonMod.Predicate[T], errMsg: java.lang.String): typings.uirouterCore.commonCommonMod.Predicate[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[T]]
@scala.inline
def assertPredicate[T](predicate: typings.uirouterCore.commonCommonMod.Predicate[T], errMsg: js.Function): typings.uirouterCore.commonCommonMod.Predicate[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("assertPredicate")(predicate.asInstanceOf[js.Any], errMsg.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[T]]

@scala.inline
def beforeAfterSubstr(char: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("beforeAfterSubstr")(char.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]]]

@scala.inline
def buildUrl(loc: typings.uirouterCore.coreservicesMod.LocationServices): java.lang.String = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildUrl")(loc.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def compose(): js.Function0[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compose")().asInstanceOf[js.Function0[js.Any]]

@scala.inline
def copy(src: typings.uirouterCore.commonCommonMod.Obj): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def copy(src: typings.uirouterCore.commonCommonMod.Obj, dest: typings.uirouterCore.commonCommonMod.Obj): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def createProxyFunctions(source: js.Function, target: typings.uirouterCore.commonCommonMod.Obj, bind: js.Function): typings.uirouterCore.commonCommonMod.Obj = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Obj]
@scala.inline
def createProxyFunctions(
  source: js.Function,
  target: typings.uirouterCore.commonCommonMod.Obj,
  bind: js.Function,
  fnNames: js.Array[java.lang.String]
): typings.uirouterCore.commonCommonMod.Obj = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Obj]
@scala.inline
def createProxyFunctions(
  source: js.Function,
  target: typings.uirouterCore.commonCommonMod.Obj,
  bind: js.Function,
  fnNames: js.Array[java.lang.String],
  latebind: scala.Boolean
): typings.uirouterCore.commonCommonMod.Obj = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Obj]
@scala.inline
def createProxyFunctions(
  source: js.Function,
  target: typings.uirouterCore.commonCommonMod.Obj,
  bind: js.Function,
  fnNames: scala.Unit,
  latebind: scala.Boolean
): typings.uirouterCore.commonCommonMod.Obj = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createProxyFunctions")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], bind.asInstanceOf[js.Any], fnNames.asInstanceOf[js.Any], latebind.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Obj]

@scala.inline
def curry(fn: js.Function): js.Function = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("curry")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]

@scala.inline
def defaultResolvePolicy: typings.uirouterCore.resolveInterfaceMod.ResolvePolicy = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultResolvePolicy").asInstanceOf[typings.uirouterCore.resolveInterfaceMod.ResolvePolicy]
@scala.inline
def defaultResolvePolicy_=(x: typings.uirouterCore.resolveInterfaceMod.ResolvePolicy): scala.Unit = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolvePolicy")(x.asInstanceOf[js.Any])

@scala.inline
def defaultTransOpts: typings.uirouterCore.transitionInterfaceMod.TransitionOptions = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTransOpts").asInstanceOf[typings.uirouterCore.transitionInterfaceMod.TransitionOptions]
@scala.inline
def defaultTransOpts_=(x: typings.uirouterCore.transitionInterfaceMod.TransitionOptions): scala.Unit = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransOpts")(x.asInstanceOf[js.Any])

@scala.inline
def defaults(opts: js.Any, defaultsList: typings.uirouterCore.commonCommonMod.Obj*): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(opts.asInstanceOf[js.Any], defaultsList.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def deregAll(functions: js.Array[js.Function]): scala.Unit = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deregAll")(functions.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

@scala.inline
def eq_(comp: js.Any): typings.uirouterCore.commonCommonMod.Predicate[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("eq")(comp.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[js.Any]]

@scala.inline
def equals_ : js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("equals").asInstanceOf[js.Any]

@scala.inline
def extend: js.Function2[
/* toObj */ typings.uirouterCore.commonCommonMod.Obj, 
/* repeated */ typings.uirouterCore.commonCommonMod.Obj, 
js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("extend").asInstanceOf[js.Function2[
/* toObj */ typings.uirouterCore.commonCommonMod.Obj, 
/* repeated */ typings.uirouterCore.commonCommonMod.Obj, 
js.Any]]

@scala.inline
def filter[T](
  collection: js.Array[T],
  callback: js.Function2[/* t */ T, /* key */ js.UndefOr[scala.Double], scala.Boolean]
): js.Array[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
@scala.inline
def filter[T](
  collection: typings.uirouterCore.commonCommonMod.TypedMap[T],
  callback: js.Function2[/* t */ T, /* key */ js.UndefOr[java.lang.String], scala.Boolean]
): typings.uirouterCore.commonCommonMod.TypedMap[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("filter")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.TypedMap[T]]

@scala.inline
def find[T](collection: js.Array[T], callback: typings.uirouterCore.commonCommonMod.Predicate[T]): T = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]
@scala.inline
def find[T](
  collection: typings.uirouterCore.commonCommonMod.TypedMap[T],
  callback: typings.uirouterCore.commonCommonMod.Predicate[T]
): T = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def flatten(arr: js.Array[js.Any]): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def flattenR(memo: js.Array[js.Any], elem: js.Any): js.Array[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("flattenR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]

@scala.inline
def fnToString(fn: typings.uirouterCore.commonCommonMod.IInjectable): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fnToString")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def forEach: js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("forEach").asInstanceOf[js.Any]

@scala.inline
def fromJson: js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("fromJson").asInstanceOf[js.Any]

@scala.inline
def functionToString(fn: js.Function): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("functionToString")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def getParams(queryString: java.lang.String): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getParams")(queryString.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def hashLocationPlugin(router: typings.uirouterCore.routerMod.UIRouter): typings.uirouterCore.vanillaInterfaceMod.LocationPlugin = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hashLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.vanillaInterfaceMod.LocationPlugin]

@scala.inline
def hostRegex: typings.std.RegExp = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("hostRegex").asInstanceOf[typings.std.RegExp]

@scala.inline
def identity(x: js.Any): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("identity")(x.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def inArray(array: js.Array[js.Any]): js.Function1[/* obj */ js.Any, scala.Boolean] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, scala.Boolean]]
@scala.inline
def inArray(array: js.Array[js.Any], obj: js.Any): scala.Boolean = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inArray")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

@scala.inline
def inherit(parent: typings.uirouterCore.commonCommonMod.Obj): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Any]
@scala.inline
def inherit(parent: typings.uirouterCore.commonCommonMod.Obj, extra: typings.uirouterCore.commonCommonMod.Obj): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("inherit")(parent.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def injector: typings.uirouterCore.coreservicesMod.InjectorLike = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("$injector").asInstanceOf[typings.uirouterCore.coreservicesMod.InjectorLike]

@scala.inline
def invoke(fnName: java.lang.String): js.Function = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
@scala.inline
def invoke(fnName: java.lang.String, args: js.Array[js.Any]): js.Function = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(fnName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Function]

@scala.inline
def is[T](ctor: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* obj */ js.Any, /* is T */ scala.Boolean] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("is")(ctor.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, /* is T */ scala.Boolean]]

@scala.inline
def isArray(arg: js.Any): /* is std.Array<any> */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ scala.Boolean]

@scala.inline
def isDate(x: js.Any): /* is std.Date */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ scala.Boolean]

@scala.inline
def isDefined: typings.uirouterCore.commonCommonMod.Predicate[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("isDefined").asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[js.Any]]

@scala.inline
def isFunction(x: js.Any): /* is std.Function */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ scala.Boolean]

@scala.inline
def isInjectable(`val`: js.Any): scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isInjectable")(`val`.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isNull(o: js.Any): scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(o.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isNullOrUndefined: typings.uirouterCore.commonCommonMod.Predicate[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("isNullOrUndefined").asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[js.Any]]

@scala.inline
def isNumber(x: js.Any): /* is number */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(x.asInstanceOf[js.Any]).asInstanceOf[/* is number */ scala.Boolean]

@scala.inline
def isObject(x: js.Any): scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def isPromise(x: js.Any): /* is std.Promise<any> */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<any> */ scala.Boolean]

@scala.inline
def isRegExp(x: js.Any): /* is std.RegExp */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ scala.Boolean]

@scala.inline
def isString(x: js.Any): /* is string */ scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isString")(x.asInstanceOf[js.Any]).asInstanceOf[/* is string */ scala.Boolean]

@scala.inline
def isUndefined(x: js.Any): scala.Boolean = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

@scala.inline
def joinNeighborsR(acc: js.Array[js.Any], x: js.Any): js.Array[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("joinNeighborsR")(acc.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]

@scala.inline
def kebobString(camelCase: java.lang.String): java.lang.String = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("kebobString")(camelCase.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def keyValsToObjectR(accum: js.Any, hasKeyVal: js.Tuple2[js.Any, js.Any]): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("keyValsToObjectR")(accum.asInstanceOf[js.Any], hasKeyVal.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def locationPluginFactory(
  name: java.lang.String,
  isHtml5: scala.Boolean,
  serviceClass: typings.uirouterCore.anon.Instantiable,
  configurationClass: typings.uirouterCore.anon.InstantiableLocationConfig
): js.Function1[
/* uiRouter */ typings.uirouterCore.routerMod.UIRouter, 
typings.uirouterCore.anon.Configuration] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("locationPluginFactory")(name.asInstanceOf[js.Any], isHtml5.asInstanceOf[js.Any], serviceClass.asInstanceOf[js.Any], configurationClass.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
/* uiRouter */ typings.uirouterCore.routerMod.UIRouter, 
typings.uirouterCore.anon.Configuration]]

@scala.inline
def makeEvent(
  registry: typings.uirouterCore.transitionInterfaceMod.IHookRegistry,
  transitionService: typings.uirouterCore.transitionServiceMod.TransitionService,
  eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType
): js.Function3[
/* matchObject */ js.Any, 
/* callback */ js.Any, 
/* options */ js.UndefOr[js.Object], 
js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeEvent")(registry.asInstanceOf[js.Any], transitionService.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
/* matchObject */ js.Any, 
/* callback */ js.Any, 
/* options */ js.UndefOr[js.Object], 
js.Any]]

@scala.inline
def makeStub[T](service: java.lang.String, methods: js.Array[/* keyof T */ java.lang.String]): T = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeStub")(service.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def map[T, U](collection: js.Array[T], callback: typings.uirouterCore.commonCommonMod.Mapper[T, U]): js.Array[U] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
@scala.inline
def map[T, U](
  collection: js.Array[T],
  callback: typings.uirouterCore.commonCommonMod.Mapper[T, U],
  target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
): js.Array[U] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[U]]
@scala.inline
def map[T, U](
  collection: org.scalablytyped.runtime.StringDictionary[T],
  callback: typings.uirouterCore.commonCommonMod.Mapper[T, U]
): org.scalablytyped.runtime.StringDictionary[U] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[U]]
@scala.inline
def map[T, U](
  collection: org.scalablytyped.runtime.StringDictionary[T],
  callback: typings.uirouterCore.commonCommonMod.Mapper[T, U],
  target: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
): org.scalablytyped.runtime.StringDictionary[U] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[U]]

@scala.inline
def mapObj: js.Function3[
/* collection */ org.scalablytyped.runtime.StringDictionary[js.Any], 
/* callback */ typings.uirouterCore.commonCommonMod.Mapper[js.Any, js.Any], 
/* target */ js.UndefOr[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
], 
org.scalablytyped.runtime.StringDictionary[js.Any]] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mapObj").asInstanceOf[js.Function3[
/* collection */ org.scalablytyped.runtime.StringDictionary[js.Any], 
/* callback */ typings.uirouterCore.commonCommonMod.Mapper[js.Any, js.Any], 
/* target */ js.UndefOr[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
], 
org.scalablytyped.runtime.StringDictionary[js.Any]]]
@scala.inline
def mapObj_=(
  x: js.Function3[
  /* collection */ org.scalablytyped.runtime.StringDictionary[js.Any], 
  /* callback */ typings.uirouterCore.commonCommonMod.Mapper[js.Any, js.Any], 
  /* target */ js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
  ], 
  org.scalablytyped.runtime.StringDictionary[js.Any]
]
): scala.Unit = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].updateDynamic("mapObj")(x.asInstanceOf[js.Any])

@scala.inline
def matchState(
  state: typings.uirouterCore.stateObjectMod.StateObject,
  criterion: typings.uirouterCore.transitionInterfaceMod.HookMatchCriterion,
  transition: typings.uirouterCore.transitionTransitionMod.Transition
): scala.Boolean = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], criterion.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]

@scala.inline
def maxLength(max: scala.Double, str: java.lang.String): java.lang.String = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(max.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def memoryLocationPlugin(router: typings.uirouterCore.routerMod.UIRouter): typings.uirouterCore.vanillaInterfaceMod.LocationPlugin = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memoryLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.vanillaInterfaceMod.LocationPlugin]

@scala.inline
def mergeR(memo: typings.uirouterCore.commonCommonMod.Obj, item: typings.uirouterCore.commonCommonMod.Obj): js.Any = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mergeR")(memo.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def noop(): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[js.Any]

@scala.inline
def not(fn: typings.uirouterCore.commonCommonMod.Predicate[js.Any]): typings.uirouterCore.commonCommonMod.Predicate[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("not")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[js.Any]]

@scala.inline
def omit(obj: typings.uirouterCore.commonCommonMod.Obj, propNames: js.Array[java.lang.String]): typings.uirouterCore.commonCommonMod.Obj = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Obj]

@scala.inline
def or(
  fn1: typings.uirouterCore.commonCommonMod.Predicate[js.Any],
  fn2: typings.uirouterCore.commonCommonMod.Predicate[js.Any]
): typings.uirouterCore.commonCommonMod.Predicate[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("or")(fn1.asInstanceOf[js.Any], fn2.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Predicate[js.Any]]

@scala.inline
def padString(length: scala.Double, str: java.lang.String): java.lang.String = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("padString")(length.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def pairs(obj: typings.uirouterCore.commonCommonMod.Obj): js.Array[js.Array[js.Any]] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pairs")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[js.Any]]]

@scala.inline
def parse(name: java.lang.String): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def parseUrl(url: java.lang.String): typings.uirouterCore.anon.Hash = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.anon.Hash]

@scala.inline
def pattern(struct: js.Array[js.Array[js.Function]]): js.Function = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any]).asInstanceOf[js.Function]

@scala.inline
def pick(obj: typings.uirouterCore.commonCommonMod.Obj, propNames: js.Array[java.lang.String]): typings.uirouterCore.commonCommonMod.Obj = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], propNames.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.commonCommonMod.Obj]

@scala.inline
def pipe(funcs: js.Function*): js.Function1[/* obj */ js.Any, js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]

@scala.inline
def pluck(collection: org.scalablytyped.runtime.StringDictionary[js.Any], propName: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.Any]]
@scala.inline
def pluck[T](collection: js.Array[typings.uirouterCore.commonCommonMod.Obj], propName: java.lang.String): js.Array[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pluck")(collection.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

@scala.inline
def prop(name: java.lang.String): js.Function1[/* obj */ js.Any, js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("prop")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ js.Any, js.Any]]

@scala.inline
def propEq: js.Function = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("propEq").asInstanceOf[js.Function]

@scala.inline
def pushR(arr: js.Array[js.Any], obj: js.Any): js.Array[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pushR")(arr.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]

@scala.inline
def pushStateLocationPlugin(router: typings.uirouterCore.routerMod.UIRouter): typings.uirouterCore.vanillaInterfaceMod.LocationPlugin = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pushStateLocationPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.vanillaInterfaceMod.LocationPlugin]

@scala.inline
def pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* val */ T, T]]
@scala.inline
def pushTo[T](arr: js.Array[T], `val`: T): T = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("pushTo")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[T]

@scala.inline
def q: typings.uirouterCore.coreservicesMod.QLike = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("$q").asInstanceOf[typings.uirouterCore.coreservicesMod.QLike]

@scala.inline
def removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* obj */ T, js.Array[T]]]
@scala.inline
def removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("removeFrom")(array.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

@scala.inline
def resolvablesBuilder(state: typings.uirouterCore.stateObjectMod.StateObject): js.Array[typings.uirouterCore.resolvableMod.Resolvable] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("resolvablesBuilder")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.uirouterCore.resolvableMod.Resolvable]]

@scala.inline
def root: js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("root").asInstanceOf[js.Any]

@scala.inline
def services: typings.uirouterCore.coreservicesMod.CoreServices = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("services").asInstanceOf[typings.uirouterCore.coreservicesMod.CoreServices]

@scala.inline
def servicesPlugin(router: typings.uirouterCore.routerMod.UIRouter): typings.uirouterCore.vanillaInterfaceMod.ServicesPlugin = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("servicesPlugin")(router.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.vanillaInterfaceMod.ServicesPlugin]

@scala.inline
def silenceUncaughtInPromise(promise: js.Promise[js.Any]): js.Promise[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("silenceUncaughtInPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]

@scala.inline
def silentRejection(error: js.Any): js.Promise[js.Any] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("silentRejection")(error.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]

@scala.inline
def splitEqual(str: java.lang.String): js.Array[java.lang.String] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitEqual")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def splitHash(str: java.lang.String): js.Array[java.lang.String] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitHash")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def splitOnDelim(delim: java.lang.String): js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitOnDelim")(delim.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]]]

@scala.inline
def splitQuery(str: java.lang.String): js.Array[java.lang.String] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitQuery")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

@scala.inline
def stringify(o: js.Any): java.lang.String = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(o.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def stripLastPathElement(str: java.lang.String): java.lang.String = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stripLastPathElement")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def tail[T](arr: js.Array[T]): T = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tail")(arr.asInstanceOf[js.Any]).asInstanceOf[T]

@scala.inline
def toJson: js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("toJson").asInstanceOf[js.Any]

/**
  * The [[Trace]] singleton
  *
  * #### Example:
  * ```js
  * import {trace} from "@uirouter/core";
  * trace.enable(1, 5);
  * ```
  */
@scala.inline
def trace: typings.uirouterCore.traceMod.Trace_ = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].selectDynamic("trace").asInstanceOf[typings.uirouterCore.traceMod.Trace_]

@scala.inline
def trimHashVal(str: java.lang.String): java.lang.String = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("trimHashVal")(str.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uniqR")(acc.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]

@scala.inline
def unnest(arr: js.Array[js.Any]): js.Any = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unnest")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]

@scala.inline
def unnestR(memo: js.Array[js.Any], elem: js.Array[js.Any]): js.Array[js.Any] = (typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unnestR")(memo.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]

@scala.inline
def `val`[T](v: T): js.Function0[T] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("val")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[T]]

@scala.inline
def values[T](obj: typings.uirouterCore.commonCommonMod.TypedMap[T]): js.Array[T] = typings.uirouterCore.mod.^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
