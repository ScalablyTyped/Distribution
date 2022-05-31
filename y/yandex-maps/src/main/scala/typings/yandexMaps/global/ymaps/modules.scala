package typings.yandexMaps.global.ymaps

import typings.yandexMaps.mod.vow.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modules {
  
  @JSGlobal("ymaps.modules")
  @js.native
  val ^ : js.Any = js.native
  
  inline def require(modules: String): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(modules.asInstanceOf[js.Any]).asInstanceOf[Promise]
  inline def require(modules: js.Array[String]): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(modules.asInstanceOf[js.Any]).asInstanceOf[Promise]
}
