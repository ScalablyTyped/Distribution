package typings.tslib

import typings.std.TemplateStringsArray
import typings.tslib.anon.Default
import typings.tslib.anon.Get
import typings.tslib.anon.Has
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @JSName("__assign")
  def assign(t: js.Any, sources: js.Any*): js.Any = js.native
  @JSName("__asyncDelegator")
  def asyncDelegator(o: js.Any): js.Any = js.native
  @JSName("__asyncGenerator")
  def asyncGenerator(thisArg: js.Any, _arguments: js.Any, generator: js.Function): js.Any = js.native
  @JSName("__asyncValues")
  def asyncValues(o: js.Any): js.Any = js.native
  @JSName("__await")
  def await(v: js.Any): js.Any = js.native
  @JSName("__awaiter")
  def awaiter(thisArg: js.Any, _arguments: js.Any, P: js.Function, generator: js.Function): js.Any = js.native
  @JSName("__classPrivateFieldGet")
  def classPrivateFieldGet[T /* <: js.Object */, V](receiver: T, privateMap: Get[T, V]): V = js.native
  @JSName("__classPrivateFieldSet")
  def classPrivateFieldSet[T /* <: js.Object */, V](receiver: T, privateMap: Has[T, V], value: V): V = js.native
  @JSName("__decorate")
  def decorate(decorators: js.Array[js.Function], target: js.Any): js.Any = js.native
  @JSName("__decorate")
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: String): js.Any = js.native
  @JSName("__decorate")
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: String, desc: js.Any): js.Any = js.native
  @JSName("__decorate")
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.Symbol): js.Any = js.native
  @JSName("__decorate")
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.Symbol, desc: js.Any): js.Any = js.native
  @JSName("__exportStar")
  def exportStar(m: js.Any, exports: js.Any): Unit = js.native
  @JSName("__extends")
  def `extends`(d: js.Function, b: js.Function): Unit = js.native
  @JSName("__generator")
  def generator(thisArg: js.Any, body: js.Function): js.Any = js.native
  @JSName("__importDefault")
  def importDefault[T](mod: T): T | Default[T] = js.native
  @JSName("__importStar")
  def importStar[T](mod: T): T = js.native
  @JSName("__makeTemplateObject")
  def makeTemplateObject(cooked: js.Array[String], raw: js.Array[String]): TemplateStringsArray = js.native
  @JSName("__metadata")
  def metadata(metadataKey: js.Any, metadataValue: js.Any): js.Function = js.native
  @JSName("__param")
  def param(paramIndex: Double, decorator: js.Function): js.Function = js.native
  @JSName("__read")
  def read(o: js.Any): js.Array[_] = js.native
  @JSName("__read")
  def read(o: js.Any, n: Double): js.Array[_] = js.native
  @JSName("__rest")
  def rest(t: js.Any, propertyNames: js.Array[String | js.Symbol]): js.Any = js.native
  @JSName("__spread")
  def spread(args: js.Array[_]*): js.Array[_] = js.native
  @JSName("__spreadArrays")
  def spreadArrays(args: js.Array[_]*): js.Array[_] = js.native
  @JSName("__values")
  def values(o: js.Any): js.Any = js.native
}

