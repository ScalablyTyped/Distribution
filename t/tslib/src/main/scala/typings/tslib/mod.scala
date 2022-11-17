package typings.tslib

import org.scalablytyped.runtime.Instantiable1
import typings.std.PropertyKey
import typings.std.TemplateStringsArray
import typings.tslib.anon.Default
import typings.tslib.anon.Get
import typings.tslib.anon.Has
import typings.tslib.anon.Set
import typings.tslib.anon.Value
import typings.tslib.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tslib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(t: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__assign")(scala.List(t.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def asyncDelegator(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__asyncDelegator")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def asyncGenerator(thisArg: Any, _arguments: Any, generator: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__asyncGenerator")(thisArg.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def asyncValues(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__asyncValues")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def await(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__await")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def awaiter(thisArg: Any, _arguments: Any, P: js.Function, generator: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__awaiter")(thisArg.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], P.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @scala.annotation.targetName("classPrivateFieldGet_m")
  inline def classPrivateFieldGet[T /* <: Instantiable1[/* args (repeated) */ Any, Any] */, V /* <: js.Function1[/* repeated */ Any, Any] */](receiver: T, state: T, kind: "m", f: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldGet_a")
  inline def classPrivateFieldGet[T /* <: Instantiable1[/* args (repeated) */ Any, Any] */, V](receiver: T, state: T, kind: "a", f: js.Function0[V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldGet_f")
  inline def classPrivateFieldGet[T /* <: Instantiable1[/* args (repeated) */ Any, Any] */, V](receiver: T, state: T, kind: "f", f: Value[V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def classPrivateFieldGet[T /* <: js.Object */, V](receiver: T, state: Get[T, V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldGet_f")
  inline def classPrivateFieldGet[T /* <: js.Object */, V](receiver: T, state: Get[T, V], kind: "f"): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldGet_m")
  inline def classPrivateFieldGet[T /* <: js.Object */, V /* <: js.Function1[/* repeated */ Any, Any] */](receiver: T, state: Has[T], kind: "m", f: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldGet_a")
  inline def classPrivateFieldGet[T /* <: js.Object */, V](receiver: T, state: Has[T], kind: "a", f: js.Function0[V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def classPrivateFieldIn(state: Instantiable1[/* args (repeated) */ Any, Any], receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldIn")(state.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def classPrivateFieldIn(state: `0`, receiver: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldIn")(state.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.annotation.targetName("classPrivateFieldSet_a")
  inline def classPrivateFieldSet[T /* <: Instantiable1[/* args (repeated) */ Any, Any] */, V](receiver: T, state: T, value: V, kind: "a", f: js.Function1[/* v */ V, Unit]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldSet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], value.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldSet_f")
  inline def classPrivateFieldSet[T /* <: Instantiable1[/* args (repeated) */ Any, Any] */, V](receiver: T, state: T, value: V, kind: "f", f: Value[V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldSet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], value.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldSet_a")
  inline def classPrivateFieldSet[T /* <: js.Object */, V](receiver: T, state: Has[T], value: V, kind: "a", f: js.Function1[/* v */ V, Unit]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldSet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], value.asInstanceOf[js.Any], kind.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[V]
  inline def classPrivateFieldSet[T /* <: js.Object */, V](receiver: T, state: Set[T, V], value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldSet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  @scala.annotation.targetName("classPrivateFieldSet_f")
  inline def classPrivateFieldSet[T /* <: js.Object */, V](receiver: T, state: Set[T, V], value: V, kind: "f"): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldSet")(receiver.asInstanceOf[js.Any], state.asInstanceOf[js.Any], value.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def createBinding(`object`: js.Object, target: js.Object, key: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__createBinding")(`object`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createBinding(`object`: js.Object, target: js.Object, key: PropertyKey, objectKey: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__createBinding")(`object`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], objectKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decorate(decorators: js.Array[js.Function], target: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decorate(decorators: js.Array[js.Function], target: Any, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decorate(decorators: js.Array[js.Function], target: Any, key: String, desc: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decorate(decorators: js.Array[js.Function], target: Any, key: js.Symbol): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decorate(decorators: js.Array[js.Function], target: Any, key: js.Symbol, desc: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decorate(decorators: js.Array[js.Function], target: Any, key: Unit, desc: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def exportStar(m: Any, o: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__exportStar")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `extends`(d: js.Function, b: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__extends")(d.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generator(thisArg: Any, body: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__generator")(thisArg.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def importDefault[T](mod: T): T | Default[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("__importDefault")(mod.asInstanceOf[js.Any]).asInstanceOf[T | Default[T]]
  
  inline def importStar[T](mod: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("__importStar")(mod.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def makeTemplateObject(cooked: js.Array[String], raw: js.Array[String]): TemplateStringsArray = (^.asInstanceOf[js.Dynamic].applyDynamic("__makeTemplateObject")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateStringsArray]
  
  inline def metadata(metadataKey: Any, metadataValue: Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("__metadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def param(paramIndex: Double, decorator: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("__param")(paramIndex.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def read(o: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__read")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def read(o: Any, n: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("__read")(o.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def rest(t: Any, propertyNames: js.Array[String | js.Symbol]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__rest")(t.asInstanceOf[js.Any], propertyNames.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def spread(args: js.Array[Any]*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__spread")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def spreadArray(to: js.Array[Any], from: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("__spreadArray")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def spreadArray(to: js.Array[Any], from: js.Array[Any], pack: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("__spreadArray")(to.asInstanceOf[js.Any], from.asInstanceOf[js.Any], pack.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def spreadArrays(args: js.Array[Any]*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__spreadArrays")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def values(o: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__values")(o.asInstanceOf[js.Any]).asInstanceOf[Any]
}
