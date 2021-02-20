package typings.tslib

import typings.std.PropertyKey
import typings.std.TemplateStringsArray
import typings.tslib.anon.Default
import typings.tslib.anon.Get
import typings.tslib.anon.Has
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tslib", "__assign")
  @js.native
  def assign(t: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("tslib", "__asyncDelegator")
  @js.native
  def asyncDelegator(o: js.Any): js.Any = js.native
  
  @JSImport("tslib", "__asyncGenerator")
  @js.native
  def asyncGenerator(thisArg: js.Any, _arguments: js.Any, generator: js.Function): js.Any = js.native
  
  @JSImport("tslib", "__asyncValues")
  @js.native
  def asyncValues(o: js.Any): js.Any = js.native
  
  @JSImport("tslib", "__await")
  @js.native
  def await(v: js.Any): js.Any = js.native
  
  @JSImport("tslib", "__awaiter")
  @js.native
  def awaiter(thisArg: js.Any, _arguments: js.Any, P: js.Function, generator: js.Function): js.Any = js.native
  
  @JSImport("tslib", "__classPrivateFieldGet")
  @js.native
  def classPrivateFieldGet[T /* <: js.Object */, V](receiver: T, privateMap: Get[T, V]): V = js.native
  
  @JSImport("tslib", "__classPrivateFieldSet")
  @js.native
  def classPrivateFieldSet[T /* <: js.Object */, V](receiver: T, privateMap: Has[T, V], value: V): V = js.native
  
  @JSImport("tslib", "__createBinding")
  @js.native
  def createBinding(`object`: js.Object, target: js.Object, key: PropertyKey): Unit = js.native
  @JSImport("tslib", "__createBinding")
  @js.native
  def createBinding(`object`: js.Object, target: js.Object, key: PropertyKey, objectKey: PropertyKey): Unit = js.native
  
  @JSImport("tslib", "__decorate")
  @js.native
  def decorate(decorators: js.Array[js.Function], target: js.Any): js.Any = js.native
  @JSImport("tslib", "__decorate")
  @js.native
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.UndefOr[scala.Nothing], desc: js.Any): js.Any = js.native
  @JSImport("tslib", "__decorate")
  @js.native
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: String): js.Any = js.native
  @JSImport("tslib", "__decorate")
  @js.native
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: String, desc: js.Any): js.Any = js.native
  @JSImport("tslib", "__decorate")
  @js.native
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.Symbol): js.Any = js.native
  @JSImport("tslib", "__decorate")
  @js.native
  def decorate(decorators: js.Array[js.Function], target: js.Any, key: js.Symbol, desc: js.Any): js.Any = js.native
  
  @JSImport("tslib", "__exportStar")
  @js.native
  def exportStar(m: js.Any, o: js.Any): Unit = js.native
  
  @JSImport("tslib", "__generator")
  @js.native
  def generator(thisArg: js.Any, body: js.Function): js.Any = js.native
  
  @JSImport("tslib", "__importDefault")
  @js.native
  def importDefault[T](mod: T): T | Default[T] = js.native
  
  @JSImport("tslib", "__importStar")
  @js.native
  def importStar[T](mod: T): T = js.native
  
  @JSImport("tslib", "__makeTemplateObject")
  @js.native
  def makeTemplateObject(cooked: js.Array[String], raw: js.Array[String]): TemplateStringsArray = js.native
  
  @JSImport("tslib", "__metadata")
  @js.native
  def metadata(metadataKey: js.Any, metadataValue: js.Any): js.Function = js.native
  
  @JSImport("tslib", "__param")
  @js.native
  def param(paramIndex: Double, decorator: js.Function): js.Function = js.native
  
  @JSImport("tslib", "__read")
  @js.native
  def read(o: js.Any): js.Array[_] = js.native
  @JSImport("tslib", "__read")
  @js.native
  def read(o: js.Any, n: Double): js.Array[_] = js.native
  
  @JSImport("tslib", "__rest")
  @js.native
  def rest(t: js.Any, propertyNames: js.Array[String | js.Symbol]): js.Any = js.native
  
  @JSImport("tslib", "__spread")
  @js.native
  def spread(args: js.Array[_]*): js.Array[_] = js.native
  
  @JSImport("tslib", "__spreadArrays")
  @js.native
  def spreadArrays(args: js.Array[_]*): js.Array[_] = js.native
  
  @JSImport("tslib", "__values")
  @js.native
  def values(o: js.Any): js.Any = js.native
  
  @JSImport("tslib", "__extends")
  @js.native
  def `extends`(d: js.Function, b: js.Function): Unit = js.native
}
