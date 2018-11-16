package typings
package atUirouterCoreLib.libCommonCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/common/common", JSImport.Namespace)
@js.native
object libCommonCommonModMembers extends js.Object {
  val allTrueR: js.Function2[/* memo */ scala.Boolean, /* elem */ js.Any, js.Any] = js.native
  val anyTrueR: js.Function2[/* memo */ scala.Boolean, /* elem */ js.Any, js.Any] = js.native
  val assertMap: js.Function2[
    /* mapFn */ js.Function1[/* t */ js.Any, js.Any], 
    /* errMsg */ java.lang.String | js.Function, 
    js.Function1[/* t */ js.Any, js.Any]
  ] = js.native
  val assertPredicate: js.Function2[
    /* predicate */ Predicate[js.Any], 
    /* errMsg */ java.lang.String | js.Function, 
    Predicate[js.Any]
  ] = js.native
  val deregAll: js.Function1[/* functions */ js.Array[js.Function], scala.Unit] = js.native
  @JSName("equals")
  val equals_FlibCommonCommonModMembers: js.Any = js.native
  val extend: atUirouterCoreLib.Anon_Target = js.native
  val flatten: js.Function1[/* arr */ js.Array[js.Any], js.Any] = js.native
  val flattenR: js.Function2[/* memo */ js.Array[js.Any], /* elem */ js.Any, js.Any] = js.native
  val forEach: js.Any = js.native
  val fromJson: js.Any = js.native
  val inArray: js.Function1[/* array */ js.Array[js.Any], js.Function1[/* obj */ js.Any, scala.Boolean]] = js.native
  val inherit: js.Function2[/* parent */ Obj, /* extra */ js.UndefOr[Obj], js.Any] = js.native
  var mapObj: js.Function3[
    /* collection */ ScalablyTyped.runtime.StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[js.Any], 
    ScalablyTyped.runtime.StringDictionary[js.Any]
  ] = js.native
  val mergeR: js.Function2[/* memo */ Obj, /* item */ Obj, Obj] = js.native
  val pairs: js.Function1[/* obj */ Obj, js.Array[js.Array[js.Any]]] = js.native
  val pushTo: js.Function1[/* arr */ js.Array[js.Any], js.Function1[/* val */ js.Any, js.Any]] = js.native
  val removeFrom: js.Function1[/* array */ js.Array[js.Any], js.Function1[/* obj */ js.Any, js.Array[js.Any]]] = js.native
  val root: js.Any = js.native
  val silenceUncaughtInPromise: js.Function1[/* promise */ stdLib.Promise[js.Any], stdLib.Promise[js.Any]] = js.native
  val silentRejection: js.Function1[/* error */ js.Any, stdLib.Promise[js.Any]] = js.native
  val toJson: js.Any = js.native
  val uniqR: js.Function2[/* acc */ js.Array[js.Any], /* token */ js.Any, js.Array[js.Any]] = js.native
  val unnest: js.Function1[/* arr */ js.Array[js.Any], js.Any] = js.native
  val unnestR: js.Function2[/* memo */ js.Array[js.Any], /* elem */ js.Array[js.Any], js.Array[js.Any]] = js.native
  val values: js.Function1[/* obj */ TypedMap[js.Any], js.Array[js.Any]] = js.native
  def _extend(toObj: Obj, fromObjs: Obj*): js.Any = js.native
  def _inArray(array: js.Array[_]): js.Function1[/* obj */ js.Any, scala.Boolean] = js.native
  def _inArray(array: js.Array[_], obj: js.Any): scala.Boolean = js.native
  def _pushTo[T](arr: js.Array[T]): js.Function1[/* val */ T, T] = js.native
  def _pushTo[T](arr: js.Array[T], `val`: T): T = js.native
  def _removeFrom[T](array: js.Array[T]): js.Function1[/* obj */ T, js.Array[T]] = js.native
  def _removeFrom[T](array: js.Array[T], obj: T): js.Array[T] = js.native
  def ancestors(
    first: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    second: atUirouterCoreLib.libStateStateObjectMod.StateObject
  ): js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  def applyPairs(memo: TypedMap[_], keyValTuple: js.Array[_]): TypedMap[_] = js.native
  def arrayTuples(args: js.Any*): js.Array[_] = js.native
  def assertFn(predicateOrMap: js.Function): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: java.lang.String): js.Any = js.native
  def assertFn(predicateOrMap: js.Function, errMsg: js.Function): js.Any = js.native
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
  def identity(x: js.Any): js.Any = js.native
  def map[T, U](collection: ScalablyTyped.runtime.StringDictionary[T], callback: Mapper[T, U]): ScalablyTyped.runtime.StringDictionary[U] = js.native
  def map[T, U](collection: ScalablyTyped.runtime.StringDictionary[T], callback: Mapper[T, U], target: js.Any): ScalablyTyped.runtime.StringDictionary[U] = js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U]): js.Array[U] = js.native
  def map[T, U](collection: js.Array[T], callback: Mapper[T, U], target: js.Any): js.Array[U] = js.native
  def noop(): js.Any = js.native
  def omit(obj: Obj, propNames: js.Array[java.lang.String]): Obj = js.native
  def pick(obj: Obj, propNames: js.Array[java.lang.String]): Obj = js.native
  def pluck(collection: ScalablyTyped.runtime.StringDictionary[js.Any], propName: java.lang.String): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  def pluck[T](collection: js.Array[Obj], propName: java.lang.String): js.Array[T] = js.native
  def pushR(arr: js.Array[_], obj: js.Any): js.Array[_] = js.native
  def tail[T](arr: js.Array[T]): T = js.native
}

