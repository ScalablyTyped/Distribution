package typings.treat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("treat/dist/declarations/src/webpack-plugin/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def pitch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pitch")().asInstanceOf[Unit]
}
