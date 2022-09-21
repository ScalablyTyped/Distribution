package typings.yandexMaps.anon

import typings.yandexMaps.mod.modules.ResolveCallbackFunction
import typings.yandexMaps.mod.vow.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmodules extends StObject {
  
  def define(module: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, depends: js.Array[String]): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, depends: js.Array[String], resolveCallback: Unit, context: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, depends: js.Array[String], resolveCallback: ResolveCallbackFunction): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(
    module: String,
    depends: js.Array[String],
    resolveCallback: ResolveCallbackFunction,
    context: js.Object
  ): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, depends: Unit, resolveCallback: Unit, context: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, depends: Unit, resolveCallback: ResolveCallbackFunction): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, depends: Unit, resolveCallback: ResolveCallbackFunction, context: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, resolveCallback: Unit, context: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, resolveCallback: ResolveCallbackFunction): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  def define(module: String, resolveCallback: ResolveCallbackFunction, context: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: typeof modules */ js.Any = js.native
  
  def isDefined(module: String): Boolean = js.native
  
  def require(modules: String): Promise = js.native
  def require(modules: js.Array[String]): Promise = js.native
}
