package typings
package atUirouterCoreLib.libCommonCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/common", JSImport.Namespace)
@js.native
object libCommonCommonModMembers extends js.Object {
  @JSName("equals")
  val equals_FlibCommonCommonModMembers: js.Any = js.native
  val extend: atUirouterCoreLib.Anon_Target = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val inArray: js.Function1[/* array */ js.Array[js.Any], js.Function1[/* obj */ js.Any, scala.Boolean]] = js.native
  var mapObj: js.Function3[
    /* collection */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[js.Any], 
    org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.native
  val pushTo: js.Function1[/* arr */ js.Array[js.Any], js.Function1[/* val */ js.Any, js.Any]] = js.native
  val removeFrom: js.Function1[/* array */ js.Array[js.Any], js.Function1[/* obj */ js.Any, js.Array[js.Any]]] = js.native
  val root: js.Any = js.native
  val toJson: js.Any = js.native
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  def _inArray(array: js.Array[_], obj: js.Any): scala.Boolean = js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  def allTrueR(memo: scala.Boolean, elem: js.Any): js.Any = js.native
  def ancestors(
    first: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    second: atUirouterCoreLib.libStateStateObjectMod.StateObject
  ): js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def anyTrueR(memo: scala.Boolean, elem: js.Any): js.Any = js.native
  def applyPairs(memo: TypedMap[_], keyValTuple: js.Array[_]): TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: java.lang.String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: java.lang.String): js.Function1[/* t */ T, U] = js.native
  def assertMap[T, U](mapFn: js.Function1[/* t */ T, U], errMsg: js.Function): js.Function1[/* t */ T, U] = js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: java.lang.String): Predicate[T] = js.native
  def assertPredicate[T](predicate: Predicate[T], errMsg: js.Function): Predicate[T] = js.native
  def copy(src: Obj): Obj = js.native
  def copy(src: Obj, dest: Obj): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function): Obj = js.native
  def createProxyFunctions(source: js.Function, target: Obj, bind: js.Function, fnNames: js.Array[java.lang.String]): Obj = js.native
  def createProxyFunctions(
    source: js.Function,
    target: Obj,
    bind: js.Function,
    fnNames: js.Array[java.lang.String],
    latebind: scala.Boolean
  ): Obj = js.native
  def defaults(opts: js.Any, defaultsList: Obj*): js.Any = js.native
  def deregAll(functions: js.Array[js.Function]): scala.Unit = js.native
  def filter[T](
    collection: TypedMap[T],
    callback: js.Function2[/* t */ T, /* key */ js.UndefOr[java.lang.String], scala.Boolean]
  ): TypedMap[T] = js.native
  def filter[T](
    collection: js.Array[T],
    callback: js.Function2[/* t */ T, /* key */ js.UndefOr[scala.Double], scala.Boolean]
  ): js.Array[T] = js.native
  def find[T](collection: TypedMap[T], callback: Predicate[T]): T = js.native
  def find[T](collection: js.Array[T], callback: Predicate[T]): T = js.native
  def flatten(arr: js.Array[_]): js.Any = js.native
  def flattenR(memo: js.Array[_], elem: js.Any): js.Any = js.native
  def identity(x: js.Any): js.Any = js.native
  def inherit(parent: Obj): js.Any = js.native
  def inherit(parent: Obj, extra: Obj): js.Any = js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U], target: js.Any): js.Array[U] = js.native
  def map[T, U](collection: org.scalablytyped.runtime.StringDictionary[T], callback: Mapper[T, U]): org.scalablytyped.runtime.StringDictionary[U] = js.native
  def map[T, U](collection: org.scalablytyped.runtime.StringDictionary[T], callback: Mapper[T, U], target: js.Any): org.scalablytyped.runtime.StringDictionary[U] = js.native
  def mergeR(memo: Obj, item: Obj): Obj = js.native
  def noop(): js.Any = js.native
  def omit(obj: Obj, propNames: js.Array[java.lang.String]): Obj = js.native
  def pairs(obj: Obj): js.Array[js.Array[_]] = js.native
  def pick(obj: Obj, propNames: js.Array[java.lang.String]): Obj = js.native
  def pluck(collection: org.scalablytyped.runtime.StringDictionary[js.Any], propName: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[Obj], propName: java.lang.String): js.Array[T] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def silenceUncaughtInPromise(promise: js.Promise[_]): js.Promise[_] = js.native
  def silentRejection(error: js.Any): js.Promise[_] = js.native
  def tail[T](arr: js.Array[T]): T = js.native
  def uniqR[T](acc: js.Array[T], token: T): js.Array[T] = js.native
  def unnest(arr: js.Array[_]): js.Any = js.native
  def unnestR(memo: js.Array[_], elem: js.Array[_]): js.Array[_] = js.native
  def values[T](obj: TypedMap[T]): js.Array[T] = js.native
}

