package typings.undici

import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGlobalOriginMod {
  
  @JSImport("undici/types/global-origin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGlobalOrigin(): js.UndefOr[URL] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalOrigin")().asInstanceOf[js.UndefOr[URL]]
  
  inline def setGlobalOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")().asInstanceOf[Unit]
  inline def setGlobalOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setGlobalOrigin(origin: URL): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
