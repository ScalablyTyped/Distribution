package typings.tslib

import typings.std.PropertyKey
import typings.std.TemplateStringsArray
import typings.tslib.anon.Default
import typings.tslib.anon.Get
import typings.tslib.anon.Has
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tslib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(t: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__assign")(t.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def asyncDelegator(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__asyncDelegator")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def asyncGenerator(thisArg: js.Any, _arguments: js.Any, generator: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__asyncGenerator")(thisArg.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def asyncValues(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__asyncValues")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def await(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__await")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def awaiter(thisArg: js.Any, _arguments: js.Any, P: js.Function, generator: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__awaiter")(thisArg.asInstanceOf[js.Any], _arguments.asInstanceOf[js.Any], P.asInstanceOf[js.Any], generator.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def classPrivateFieldGet[T /* <: js.Object */, V](receiver: T, privateMap: Get[T, V]): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldGet")(receiver.asInstanceOf[js.Any], privateMap.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def classPrivateFieldSet[T /* <: js.Object */, V](receiver: T, privateMap: Has[T, V], value: V): V = (^.asInstanceOf[js.Dynamic].applyDynamic("__classPrivateFieldSet")(receiver.asInstanceOf[js.Any], privateMap.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[V]
  
  inline def createBinding(`object`: js.Object, target: js.Object, key: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__createBinding")(`object`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createBinding(`object`: js.Object, target: js.Object, key: PropertyKey, objectKey: PropertyKey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__createBinding")(`object`.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], objectKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decorate(decorators: js.Array[js.Function], target: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decorate(decorators: js.Array[js.Function], target: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decorate(decorators: js.Array[js.Function], target: js.Any, key: String, desc: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.Symbol): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.Symbol, desc: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def decorate(decorators: js.Array[js.Function], target: js.Any, key: Unit, desc: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__decorate")(decorators.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def exportStar(m: js.Any, o: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__exportStar")(m.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def `extends`(d: js.Function, b: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__extends")(d.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generator(thisArg: js.Any, body: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__generator")(thisArg.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def importDefault[T](mod: T): T | Default[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("__importDefault")(mod.asInstanceOf[js.Any]).asInstanceOf[T | Default[T]]
  
  inline def importStar[T](mod: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("__importStar")(mod.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def makeTemplateObject(cooked: js.Array[String], raw: js.Array[String]): TemplateStringsArray = (^.asInstanceOf[js.Dynamic].applyDynamic("__makeTemplateObject")(cooked.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[TemplateStringsArray]
  
  inline def metadata(metadataKey: js.Any, metadataValue: js.Any): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("__metadata")(metadataKey.asInstanceOf[js.Any], metadataValue.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def param(paramIndex: Double, decorator: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("__param")(paramIndex.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def read(o: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__read")(o.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def read(o: js.Any, n: Double): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("__read")(o.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def rest(t: js.Any, propertyNames: js.Array[String | js.Symbol]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("__rest")(t.asInstanceOf[js.Any], propertyNames.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def spread(args: js.Array[js.Any]*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__spread")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def spreadArrays(args: js.Array[js.Any]*): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__spreadArrays")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def values(o: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__values")(o.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
