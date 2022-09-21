package typings.yandexMaps.mod

import typings.yandexMaps.anon.Typeofmodules
import typings.yandexMaps.mod.vow.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modules {
  
  @JSImport("yandex-maps", "modules")
  @js.native
  val ^ : js.Any = js.native
  
  inline def define(module: String): Typeofmodules = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any]).asInstanceOf[Typeofmodules]
  inline def define(module: String, depends: js.Array[String]): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, depends: js.Array[String], resolveCallback: Unit, context: js.Object): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, depends: js.Array[String], resolveCallback: ResolveCallbackFunction): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(
    module: String,
    depends: js.Array[String],
    resolveCallback: ResolveCallbackFunction,
    context: js.Object
  ): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, depends: Unit, resolveCallback: Unit, context: js.Object): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, depends: Unit, resolveCallback: ResolveCallbackFunction): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, depends: Unit, resolveCallback: ResolveCallbackFunction, context: js.Object): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], depends.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, resolveCallback: Unit, context: js.Object): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, resolveCallback: ResolveCallbackFunction): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  inline def define(module: String, resolveCallback: ResolveCallbackFunction, context: js.Object): Typeofmodules = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(module.asInstanceOf[js.Any], resolveCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Typeofmodules]
  
  inline def isDefined(module: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(module.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def require(modules: String): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(modules.asInstanceOf[js.Any]).asInstanceOf[Promise]
  inline def require(modules: js.Array[String]): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(modules.asInstanceOf[js.Any]).asInstanceOf[Promise]
  
  @js.native
  trait ResolveCallbackFunction extends StObject {
    
    def apply(provide: js.Function2[/* module */ Any, /* error */ js.UndefOr[Any], Unit], depends: Any*): Unit = js.native
  }
}
