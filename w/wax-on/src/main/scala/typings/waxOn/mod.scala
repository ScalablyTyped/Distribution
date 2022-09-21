package typings.waxOn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wax-on", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(handlebars: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(handlebars.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLayoutPath(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLayoutPath")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
